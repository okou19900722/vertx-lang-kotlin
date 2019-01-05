package io.vertx.lang.kotlin;

import com.squareup.kotlinpoet.*;
import io.vertx.codegen.*;
import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.lang.kotlin.helper.KotlinCodeGenHelper;
import kotlin.Deprecated;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static io.vertx.codegen.type.ClassKind.*;

public class KotlinDataObjectGenerator extends KotlinGeneratorBase<DataObjectModel> {

  KotlinDataObjectGenerator() {
    super("codegen.kotlin.dataobject");
    this.name = "Kotlin";
    this.kinds = Collections.singleton("dataObject");
  }

  @Override
  public Collection<Class<? extends Annotation>> annotations() {
    return Arrays.asList(DataObject.class, ModuleGen.class);
  }

  @Override
  public String filename(DataObjectModel model) {
    return enabled && model.isConcrete() ?
      generated + model.getModule().translateQualifiedName(model.getFqn(), "kotlin").replace(".", "/") + ".kt"
      : null;
  }

  @Override
  public String render(DataObjectModel model, int index, int size, Map<String, Object> session) {
    StringWriter buffer = new StringWriter();
    if (model.getType().getSimpleName().equals("Frame")) {
      System.err.println("===");
    }
    FileSpec.Builder file = FileSpec.builder(model.getType().translatePackageName("kotlin"), "");
    file.indent("  ");
    addFun(file, model, false);
    addFun(file, model, true);
    try {
      file.build().writeTo(buffer);
      return buffer.toString();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private void addFun(FileSpec.Builder file, DataObjectModel model, boolean old) {
    boolean isKotlin = model.getAnnotations().stream().anyMatch(ann -> ann.getName().equals("kotlin.Metadata"));
    String newName = model.getType().getSimpleName(Case.LOWER_CAMEL) + "Of";
    FunSpec.Builder fun = FunSpec.builder(old ? model.getType().getSimpleName() : newName);
    if (old) {
      String newFun = newName + "(" + model.getPropertyMap().values().stream().map(PropertyInfo::getName).collect(Collectors.joining(",")) + ")";
      fun.addAnnotation(AnnotationSpec.builder(Deprecated.class)
        .addMember("%S", "This function will be removed in a future version")
        .addMember("ReplaceWith(%S)", newFun)
        .build()
      );
    }
    ClassName className = new ClassName(model.getType().getPackageName(), model.getType().getSimpleName());
    fun.addKdoc("A function providing a DSL for building [%T] objects.\n", className);
    if (model.getDoc() != null) {
      String s = Token.toHtml(model.getDoc().getTokens(), "", KotlinCodeGenHelper::renderLinkToHtml, "\n");
      fun.addKdoc("\n").addKdoc(s.replace("%", "%%")).addKdoc("\n");
    }
    CodeBlock.Builder codeBuilder = CodeBlock.builder();
    codeBuilder.add("return %T(", className);
    if (!model.hasEmptyConstructor()) {
      codeBuilder.add("io.vertx.core.json.JsonObject()");
    }
    codeBuilder
      .add(")\n")
//      .indent()
      .beginControlFlow(".apply");
    model.getPropertyMap().values().stream().filter(filterProperties()).forEach(p -> {
      addParameter(fun, p);
      codeBuilder
        .beginControlFlow("if (%N != null)", p.getName());
      if (p.getSetterMethod() != null) {
        codeBuilder
          .add("this.")
          .add(isKotlin ? (p.getName() + " = ") : (p.getSetterMethod() + "("))
          .add(p.getName());

        if (p.isSet()) {
          codeBuilder.add(".toSet()");
        } else if (p.isList()) {
          codeBuilder.add(".toList()");
        }

        codeBuilder
          .add(isKotlin ? "" : ")").add("\n");
      } else {
        codeBuilder
          .beginControlFlow("for (item in %N)", p.getName())
          .add("this.%N(", p.getAdderMethod());
        if (p.isMap()) {
          codeBuilder.add("item.key, item.value)");
        } else {
          codeBuilder.add("item)");
        }
        codeBuilder.add("\n");
        codeBuilder.endControlFlow();
      }
      codeBuilder.endControlFlow();
    });
    codeBuilder.endControlFlow().unindent();
    fun.addCode(codeBuilder.build());
    fun.addKdoc("\n").addKdoc("<p/>\n").addKdoc("NOTE: This function has been automatically generated from the [%T original] using Vert.x codegen.\n", className);
    file.addFunction(fun.build());
  }

  private void addParameter(FunSpec.Builder fun, PropertyInfo propertyInfo) {
    TypeName propertyType = mapToKotlinType(propertyInfo.getType());
    TypeName type;
    if (propertyInfo.isMap()) {
      type = ParameterizedTypeName.get(new ClassName("", "Map"), new ClassName("", "String"), propertyType);
    } else if (propertyInfo.isList() || propertyInfo.isSet()) {
      type = ParameterizedTypeName.get(new ClassName("", "Iterable"), propertyType);
    } else {
      type = propertyType;
    }
    ParameterSpec.Builder parameterBuilder = ParameterSpec.builder(propertyInfo.getName(), type.copy(true, type.getAnnotations()));
    if (propertyInfo.getDoc() != null) {
      String docInfo = Token.toHtml(propertyInfo.getDoc().getTokens(), "", KotlinCodeGenHelper::renderLinkToHtml, "").replace("/*", "/<star>");
      parameterBuilder.addKdoc(docInfo.replace("%", "%%"));
    }
    parameterBuilder.defaultValue("null");
    fun.addParameter(parameterBuilder.build());
  }

  private TypeName mapToKotlinType(TypeInfo type) {
    String typeName = type.getName();
    String packageName = Helper.getPackageName(typeName);
    String simpleName = type.getSimpleName();
    ClassKind typeKind = type.getKind();
    if (typeName.equals("void") || typeName.equals("java.lang.Void")) {
      return TypeNames.UNIT;
    } else if (typeName.equals("Object") || typeName.equals("java.lang.Object")) {
      return TypeNames.ANY;
    } else if (typeName.equals("Throwable") || typeName.equals("java.lang.Throwable")) {
      return new ClassName("", "Throwable");
    } else if (typeKind == STRING) {
      return new ClassName("", "String");
    } else if (typeKind == PRIMITIVE || typeKind == BOXED_PRIMITIVE) {
      switch (typeName) {
        case "byte":
        case "java.lang.Byte":
          return TypeNames.BYTE;
        case "short":
        case "java.lang.Short":
          return TypeNames.SHORT;
        case "int":
        case "java.lang.Integer":
          return TypeNames.INT;
        case "long":
        case "java.lang.Long":
          return TypeNames.LONG;
        case "float":
        case "java.lang.Float":
          return TypeNames.FLOAT;
        case "double":
        case "java.lang.Double":
          return TypeNames.DOUBLE;
        case "boolean":
        case "java.lang.Boolean":
          return TypeNames.BOOLEAN;
        case "char":
        case "java.lang.Character":
          return TypeNames.CHAR;
        default:
          //Will not execute
          throw new RuntimeException("err primitive:" + typeName);
      }
    } else {
      return new ClassName(packageName, simpleName);
    }
  }

  private Predicate<PropertyInfo> filterProperties() {
    return p -> p.getSetterMethod() != null || p.getAdderMethod() != null;
  }
}

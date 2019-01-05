package io.vertx.kotlin.core.cli

import io.vertx.core.cli.Argument
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [Argument] objects.
 *
 *  Defines a command line argument. Unlike options, argument don't have names and are identified
    using an index. The
 *  first index is 0 (because we are in the computer world).
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Argument original] using Vert.x
    codegen.
 *
 * @param argName  Sets the argument name of this [io.vertx.core.cli.Argument].
 * @param defaultValue  Sets the default value of this [io.vertx.core.cli.Argument].
 * @param description  Sets the description of the [io.vertx.core.cli.Argument].
 * @param hidden  Sets whether or not the current [io.vertx.core.cli.Argument] is hidden.
 * @param index  Sets the argument index.
 * @param multiValued  Sets whether or not the argument can receive several values. Only the last
    argument can receive several values.
 * @param required  Sets whether or not the current [io.vertx.core.cli.Argument] is required.
 */
fun argumentOf(
  argName: String? = null,
  defaultValue: String? = null,
  description: String? = null,
  hidden: Boolean? = null,
  index: Int? = null,
  multiValued: Boolean? = null,
  required: Boolean? = null
) = Argument()
.apply {
  if (argName != null) {
    this.setArgName(argName)
  }
  if (defaultValue != null) {
    this.setDefaultValue(defaultValue)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (hidden != null) {
    this.setHidden(hidden)
  }
  if (index != null) {
    this.setIndex(index)
  }
  if (multiValued != null) {
    this.setMultiValued(multiValued)
  }
  if (required != null) {
    this.setRequired(required)
  }
}

/**
 * A function providing a DSL for building [Argument] objects.
 *
 *  Defines a command line argument. Unlike options, argument don't have names and are identified
    using an index. The
 *  first index is 0 (because we are in the computer world).
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Argument original] using Vert.x
    codegen.
 *
 * @param argName  Sets the argument name of this [io.vertx.core.cli.Argument].
 * @param defaultValue  Sets the default value of this [io.vertx.core.cli.Argument].
 * @param description  Sets the description of the [io.vertx.core.cli.Argument].
 * @param hidden  Sets whether or not the current [io.vertx.core.cli.Argument] is hidden.
 * @param index  Sets the argument index.
 * @param multiValued  Sets whether or not the argument can receive several values. Only the last
    argument can receive several values.
 * @param required  Sets whether or not the current [io.vertx.core.cli.Argument] is required.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("argumentOf(argName,defaultValue,description,hidden,index,multiValued,required)")
)
fun Argument(
  argName: String? = null,
  defaultValue: String? = null,
  description: String? = null,
  hidden: Boolean? = null,
  index: Int? = null,
  multiValued: Boolean? = null,
  required: Boolean? = null
) = Argument()
.apply {
  if (argName != null) {
    this.setArgName(argName)
  }
  if (defaultValue != null) {
    this.setDefaultValue(defaultValue)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (hidden != null) {
    this.setHidden(hidden)
  }
  if (index != null) {
    this.setIndex(index)
  }
  if (multiValued != null) {
    this.setMultiValued(multiValued)
  }
  if (required != null) {
    this.setRequired(required)
  }
}

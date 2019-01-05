package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.UpdateOptions
import io.vertx.ext.mongo.WriteOption
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [UpdateOptions] objects.
 *
 *  Options for configuring updates.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [UpdateOptions original] using
    Vert.x codegen.
 *
 * @param multi  Set whether multi is enabled
 * @param returningNewDocument  Set whether new document property is enabled. Valid only on
    findOneAnd* methods.
 * @param upsert  Set whether upsert is enabled
 * @param writeOption  Set the write option
 */
fun updateOptionsOf(
  multi: Boolean? = null,
  returningNewDocument: Boolean? = null,
  upsert: Boolean? = null,
  writeOption: WriteOption? = null
) = UpdateOptions()
.apply {
  if (multi != null) {
    this.setMulti(multi)
  }
  if (returningNewDocument != null) {
    this.setReturningNewDocument(returningNewDocument)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

/**
 * A function providing a DSL for building [UpdateOptions] objects.
 *
 *  Options for configuring updates.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [UpdateOptions original] using
    Vert.x codegen.
 *
 * @param multi  Set whether multi is enabled
 * @param returningNewDocument  Set whether new document property is enabled. Valid only on
    findOneAnd* methods.
 * @param upsert  Set whether upsert is enabled
 * @param writeOption  Set the write option
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("updateOptionsOf(multi,returningNewDocument,upsert,writeOption)")
)
fun UpdateOptions(
  multi: Boolean? = null,
  returningNewDocument: Boolean? = null,
  upsert: Boolean? = null,
  writeOption: WriteOption? = null
) = UpdateOptions()
.apply {
  if (multi != null) {
    this.setMulti(multi)
  }
  if (returningNewDocument != null) {
    this.setReturningNewDocument(returningNewDocument)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

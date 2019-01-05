package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.BulkWriteOptions
import io.vertx.ext.mongo.WriteOption
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [BulkWriteOptions] objects.
 *
 *  Options for configuring bulk write operations.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BulkWriteOptions original] using
    Vert.x codegen.
 *
 * @param ordered  Set the ordered option
 * @param writeOption  Set the write option
 */
fun bulkWriteOptionsOf(ordered: Boolean? = null, writeOption: WriteOption? = null) =
    BulkWriteOptions()
.apply {
  if (ordered != null) {
    this.setOrdered(ordered)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

/**
 * A function providing a DSL for building [BulkWriteOptions] objects.
 *
 *  Options for configuring bulk write operations.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BulkWriteOptions original] using
    Vert.x codegen.
 *
 * @param ordered  Set the ordered option
 * @param writeOption  Set the write option
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("bulkWriteOptionsOf(ordered,writeOption)")
)
fun BulkWriteOptions(ordered: Boolean? = null, writeOption: WriteOption? = null) =
    BulkWriteOptions()
.apply {
  if (ordered != null) {
    this.setOrdered(ordered)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

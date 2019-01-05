package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.AggregateOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [AggregateOptions] objects.
 *
 *  Options used to configure aggregate operations.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [AggregateOptions original] using
    Vert.x codegen.
 *
 * @param allowDiskUse  Set the flag if writing to temporary files is enabled.
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param maxAwaitTime  The maximum amount of time for the server to wait on new documents to
    satisfy a $changeStream aggregation.
 * @param maxTime  Set the time limit in milliseconds for processing operations on a cursor.
 */
fun aggregateOptionsOf(
  allowDiskUse: Boolean? = null,
  batchSize: Int? = null,
  maxAwaitTime: Long? = null,
  maxTime: Long? = null
) = AggregateOptions()
.apply {
  if (allowDiskUse != null) {
    this.setAllowDiskUse(allowDiskUse)
  }
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (maxAwaitTime != null) {
    this.setMaxAwaitTime(maxAwaitTime)
  }
  if (maxTime != null) {
    this.setMaxTime(maxTime)
  }
}

/**
 * A function providing a DSL for building [AggregateOptions] objects.
 *
 *  Options used to configure aggregate operations.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [AggregateOptions original] using
    Vert.x codegen.
 *
 * @param allowDiskUse  Set the flag if writing to temporary files is enabled.
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param maxAwaitTime  The maximum amount of time for the server to wait on new documents to
    satisfy a $changeStream aggregation.
 * @param maxTime  Set the time limit in milliseconds for processing operations on a cursor.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("aggregateOptionsOf(allowDiskUse,batchSize,maxAwaitTime,maxTime)")
)
fun AggregateOptions(
  allowDiskUse: Boolean? = null,
  batchSize: Int? = null,
  maxAwaitTime: Long? = null,
  maxTime: Long? = null
) = AggregateOptions()
.apply {
  if (allowDiskUse != null) {
    this.setAllowDiskUse(allowDiskUse)
  }
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (maxAwaitTime != null) {
    this.setMaxAwaitTime(maxAwaitTime)
  }
  if (maxTime != null) {
    this.setMaxTime(maxTime)
  }
}

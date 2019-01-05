package io.vertx.kotlin.ext.mongo

import io.vertx.core.json.JsonObject
import io.vertx.ext.mongo.FindOptions
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [FindOptions] objects.
 *
 *  Options used to configure find operations.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [FindOptions original] using Vert.x
    codegen.
 *
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param fields  Set the fields
 * @param limit  Set the limit
 * @param skip  Set the skip
 * @param sort  Set the sort document
 */
fun findOptionsOf(
  batchSize: Int? = null,
  fields: JsonObject? = null,
  limit: Int? = null,
  skip: Int? = null,
  sort: JsonObject? = null
) = FindOptions()
.apply {
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (fields != null) {
    this.setFields(fields)
  }
  if (limit != null) {
    this.setLimit(limit)
  }
  if (skip != null) {
    this.setSkip(skip)
  }
  if (sort != null) {
    this.setSort(sort)
  }
}

/**
 * A function providing a DSL for building [FindOptions] objects.
 *
 *  Options used to configure find operations.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [FindOptions original] using Vert.x
    codegen.
 *
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param fields  Set the fields
 * @param limit  Set the limit
 * @param skip  Set the skip
 * @param sort  Set the sort document
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("findOptionsOf(batchSize,fields,limit,skip,sort)")
)
fun FindOptions(
  batchSize: Int? = null,
  fields: JsonObject? = null,
  limit: Int? = null,
  skip: Int? = null,
  sort: JsonObject? = null
) = FindOptions()
.apply {
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (fields != null) {
    this.setFields(fields)
  }
  if (limit != null) {
    this.setLimit(limit)
  }
  if (skip != null) {
    this.setSkip(skip)
  }
  if (sort != null) {
    this.setSort(sort)
  }
}

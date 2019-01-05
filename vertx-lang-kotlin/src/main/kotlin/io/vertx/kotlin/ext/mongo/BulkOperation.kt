package io.vertx.kotlin.ext.mongo

import io.vertx.core.json.JsonObject
import io.vertx.ext.mongo.BulkOperation
import io.vertx.ext.mongo.BulkOperation.BulkOperationType
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [BulkOperation] objects.
 *
 *  Contains all data needed for one operation of a bulk write operation.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BulkOperation original] using
    Vert.x codegen.
 *
 * @param document  Sets the document, used by insert, replace, and update operations
 * @param filter  Sets the filter document, used by replace, update, and delete operations
 * @param multi  Sets the multi flag, used by update and delete operations
 * @param type  Sets the operation type
 * @param upsert  Sets the upsert flag, used by update and replace operations
 */
fun bulkOperationOf(
  document: JsonObject? = null,
  filter: JsonObject? = null,
  multi: Boolean? = null,
  type: BulkOperationType? = null,
  upsert: Boolean? = null
) = BulkOperation(io.vertx.core.json.JsonObject())
.apply {
  if (document != null) {
    this.setDocument(document)
  }
  if (filter != null) {
    this.setFilter(filter)
  }
  if (multi != null) {
    this.setMulti(multi)
  }
  if (type != null) {
    this.setType(type)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
}

/**
 * A function providing a DSL for building [BulkOperation] objects.
 *
 *  Contains all data needed for one operation of a bulk write operation.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BulkOperation original] using
    Vert.x codegen.
 *
 * @param document  Sets the document, used by insert, replace, and update operations
 * @param filter  Sets the filter document, used by replace, update, and delete operations
 * @param multi  Sets the multi flag, used by update and delete operations
 * @param type  Sets the operation type
 * @param upsert  Sets the upsert flag, used by update and replace operations
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("bulkOperationOf(document,filter,multi,type,upsert)")
)
fun BulkOperation(
  document: JsonObject? = null,
  filter: JsonObject? = null,
  multi: Boolean? = null,
  type: BulkOperationType? = null,
  upsert: Boolean? = null
) = BulkOperation(io.vertx.core.json.JsonObject())
.apply {
  if (document != null) {
    this.setDocument(document)
  }
  if (filter != null) {
    this.setFilter(filter)
  }
  if (multi != null) {
    this.setMulti(multi)
  }
  if (type != null) {
    this.setType(type)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
}

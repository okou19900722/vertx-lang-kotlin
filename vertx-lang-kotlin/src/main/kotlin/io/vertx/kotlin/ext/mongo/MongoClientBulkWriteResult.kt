package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.MongoClientBulkWriteResult
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MongoClientBulkWriteResult] objects.
 *
 *  Result propagated from mongodb driver bulk write result.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MongoClientBulkWriteResult
    original] using Vert.x codegen.
 */
fun mongoClientBulkWriteResultOf() = MongoClientBulkWriteResult()
.apply {
}

/**
 * A function providing a DSL for building [MongoClientBulkWriteResult] objects.
 *
 *  Result propagated from mongodb driver bulk write result.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MongoClientBulkWriteResult
    original] using Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mongoClientBulkWriteResultOf(deletedCount,insertedCount,matchedCount,modifiedCount,upserts)")
)
fun MongoClientBulkWriteResult() = MongoClientBulkWriteResult()
.apply {
}

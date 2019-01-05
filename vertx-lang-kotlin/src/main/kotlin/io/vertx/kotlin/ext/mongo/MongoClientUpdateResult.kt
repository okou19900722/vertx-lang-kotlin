package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.MongoClientUpdateResult
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MongoClientUpdateResult] objects.
 *
 *  Result propagated from mongodb driver update result.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MongoClientUpdateResult original]
    using Vert.x codegen.
 */
fun mongoClientUpdateResultOf() = MongoClientUpdateResult()
.apply {
}

/**
 * A function providing a DSL for building [MongoClientUpdateResult] objects.
 *
 *  Result propagated from mongodb driver update result.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MongoClientUpdateResult original]
    using Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mongoClientUpdateResultOf(docMatched,docModified,docUpsertedId)")
)
fun MongoClientUpdateResult() = MongoClientUpdateResult()
.apply {
}

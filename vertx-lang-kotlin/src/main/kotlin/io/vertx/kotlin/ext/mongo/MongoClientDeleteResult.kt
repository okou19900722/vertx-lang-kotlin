package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.MongoClientDeleteResult
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MongoClientDeleteResult] objects.
 *
 *  Result propagated from mongodb driver delete result.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MongoClientDeleteResult original]
    using Vert.x codegen.
 */
fun mongoClientDeleteResultOf() = MongoClientDeleteResult()
.apply {
}

/**
 * A function providing a DSL for building [MongoClientDeleteResult] objects.
 *
 *  Result propagated from mongodb driver delete result.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MongoClientDeleteResult original]
    using Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mongoClientDeleteResultOf(removedCount)")
)
fun MongoClientDeleteResult() = MongoClientDeleteResult()
.apply {
}

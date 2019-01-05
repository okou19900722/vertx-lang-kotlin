package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.IndexOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [IndexOptions] objects.
 *
 *  Options used to configure index.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [IndexOptions original] using
    Vert.x codegen.
 */
fun indexOptionsOf() = IndexOptions()
.apply {
}

/**
 * A function providing a DSL for building [IndexOptions] objects.
 *
 *  Options used to configure index.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [IndexOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("indexOptionsOf(background,bits,bucketSize,defaultLanguage,languageOverride,max,min,name,partialFilterExpression,sparse,sphereVersion,storageEngine,textVersion,unique,version,weights)")
)
fun IndexOptions() = IndexOptions()
.apply {
}

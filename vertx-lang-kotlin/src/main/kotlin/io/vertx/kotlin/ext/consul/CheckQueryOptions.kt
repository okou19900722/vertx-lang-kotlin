package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.BlockingQueryOptions
import io.vertx.ext.consul.CheckQueryOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [CheckQueryOptions] objects.
 *
 *  Options used to requesting list of checks
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CheckQueryOptions original] using
    Vert.x codegen.
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round
    trip time from that node.
 */
fun checkQueryOptionsOf(blockingOptions: BlockingQueryOptions? = null, near: String? = null) =
    CheckQueryOptions()
.apply {
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

/**
 * A function providing a DSL for building [CheckQueryOptions] objects.
 *
 *  Options used to requesting list of checks
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CheckQueryOptions original] using
    Vert.x codegen.
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round
    trip time from that node.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("checkQueryOptionsOf(blockingOptions,near)")
)
fun CheckQueryOptions(blockingOptions: BlockingQueryOptions? = null, near: String? = null) =
    CheckQueryOptions()
.apply {
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.BlockingQueryOptions
import io.vertx.ext.consul.NodeQueryOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [NodeQueryOptions] objects.
 *
 *  Options used to requesting list of nodes
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [NodeQueryOptions original] using
    Vert.x codegen.
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round
    trip time from that node.
 */
fun nodeQueryOptionsOf(blockingOptions: BlockingQueryOptions? = null, near: String? = null) =
    NodeQueryOptions()
.apply {
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

/**
 * A function providing a DSL for building [NodeQueryOptions] objects.
 *
 *  Options used to requesting list of nodes
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [NodeQueryOptions original] using
    Vert.x codegen.
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round
    trip time from that node.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("nodeQueryOptionsOf(blockingOptions,near)")
)
fun NodeQueryOptions(blockingOptions: BlockingQueryOptions? = null, near: String? = null) =
    NodeQueryOptions()
.apply {
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

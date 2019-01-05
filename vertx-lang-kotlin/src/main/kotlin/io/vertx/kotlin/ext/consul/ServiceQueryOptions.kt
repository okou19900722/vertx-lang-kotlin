package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.BlockingQueryOptions
import io.vertx.ext.consul.ServiceQueryOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [ServiceQueryOptions] objects.
 *
 *  Options used to requesting list of services
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceQueryOptions original]
    using Vert.x codegen.
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round
    trip time from that node.
 * @param tag  Set tag for filtering request results
 */
fun serviceQueryOptionsOf(
  blockingOptions: BlockingQueryOptions? = null,
  near: String? = null,
  tag: String? = null
) = ServiceQueryOptions()
.apply {
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
  if (tag != null) {
    this.setTag(tag)
  }
}

/**
 * A function providing a DSL for building [ServiceQueryOptions] objects.
 *
 *  Options used to requesting list of services
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceQueryOptions original]
    using Vert.x codegen.
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round
    trip time from that node.
 * @param tag  Set tag for filtering request results
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("serviceQueryOptionsOf(blockingOptions,near,tag)")
)
fun ServiceQueryOptions(
  blockingOptions: BlockingQueryOptions? = null,
  near: String? = null,
  tag: String? = null
) = ServiceQueryOptions()
.apply {
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
  if (tag != null) {
    this.setTag(tag)
  }
}

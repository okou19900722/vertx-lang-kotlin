package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.BlockingQueryOptions
import io.vertx.ext.consul.EventListOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [EventListOptions] objects.
 *
 *  Holds options for events list request
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [EventListOptions original] using
    Vert.x codegen.
 *
 * @param blockingOptions  Set options for blocking query
 * @param name  Set event name for filtering on events
 */
fun eventListOptionsOf(blockingOptions: BlockingQueryOptions? = null, name: String? = null) =
    EventListOptions()
.apply {
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (name != null) {
    this.setName(name)
  }
}

/**
 * A function providing a DSL for building [EventListOptions] objects.
 *
 *  Holds options for events list request
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [EventListOptions original] using
    Vert.x codegen.
 *
 * @param blockingOptions  Set options for blocking query
 * @param name  Set event name for filtering on events
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("eventListOptionsOf(blockingOptions,name)")
)
fun EventListOptions(blockingOptions: BlockingQueryOptions? = null, name: String? = null) =
    EventListOptions()
.apply {
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (name != null) {
    this.setName(name)
  }
}

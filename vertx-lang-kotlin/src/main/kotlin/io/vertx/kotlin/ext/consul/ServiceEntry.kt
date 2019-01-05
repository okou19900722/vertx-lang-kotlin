package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Check
import io.vertx.ext.consul.Node
import io.vertx.ext.consul.Service
import io.vertx.ext.consul.ServiceEntry
import kotlin.Deprecated

/**
 * A function providing a DSL for building [ServiceEntry] objects.
 *
 *  Holds properties of service, node and related checks
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceEntry original] using
    Vert.x codegen.
 *
 * @param checks  Set list of checks
 * @param node  Set node
 * @param service  Set service
 */
fun serviceEntryOf(
  checks: Iterable<Check>? = null,
  node: Node? = null,
  service: Service? = null
) = ServiceEntry()
.apply {
  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (node != null) {
    this.setNode(node)
  }
  if (service != null) {
    this.setService(service)
  }
}

/**
 * A function providing a DSL for building [ServiceEntry] objects.
 *
 *  Holds properties of service, node and related checks
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceEntry original] using
    Vert.x codegen.
 *
 * @param checks  Set list of checks
 * @param node  Set node
 * @param service  Set service
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("serviceEntryOf(checks,node,service)")
)
fun ServiceEntry(
  checks: Iterable<Check>? = null,
  node: Node? = null,
  service: Service? = null
) = ServiceEntry()
.apply {
  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (node != null) {
    this.setNode(node)
  }
  if (service != null) {
    this.setService(service)
  }
}

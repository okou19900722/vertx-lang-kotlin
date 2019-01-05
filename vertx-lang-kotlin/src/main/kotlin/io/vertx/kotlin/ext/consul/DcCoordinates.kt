package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Coordinate
import io.vertx.ext.consul.DcCoordinates
import kotlin.Deprecated

/**
 * A function providing a DSL for building [DcCoordinates] objects.
 *
 *  Holds coordinates of servers in datacenter
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [DcCoordinates original] using
    Vert.x codegen.
 *
 * @param datacenter  Set datacenter
 * @param servers  Set list of servers in datacenter
 */
fun dcCoordinatesOf(datacenter: String? = null, servers: Iterable<Coordinate>? = null) =
    DcCoordinates()
.apply {
  if (datacenter != null) {
    this.setDatacenter(datacenter)
  }
  if (servers != null) {
    this.setServers(servers.toList())
  }
}

/**
 * A function providing a DSL for building [DcCoordinates] objects.
 *
 *  Holds coordinates of servers in datacenter
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [DcCoordinates original] using
    Vert.x codegen.
 *
 * @param datacenter  Set datacenter
 * @param servers  Set list of servers in datacenter
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("dcCoordinatesOf(datacenter,servers)")
)
fun DcCoordinates(datacenter: String? = null, servers: Iterable<Coordinate>? = null) =
    DcCoordinates()
.apply {
  if (datacenter != null) {
    this.setDatacenter(datacenter)
  }
  if (servers != null) {
    this.setServers(servers.toList())
  }
}

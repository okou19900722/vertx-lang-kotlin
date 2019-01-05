package io.vertx.kotlin.cassandra

import io.vertx.cassandra.CassandraClientOptions
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [CassandraClientOptions] objects.
 *
 *  Eclipse Vert.x Cassandra client options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CassandraClientOptions original]
    using Vert.x codegen.
 *
 * @param contactPoints  Set a list of hosts, where some of cluster nodes is located.
 * @param port  Set which port should be used for all the hosts to connect to a cassandra service.
 */
fun cassandraClientOptionsOf(contactPoints: Iterable<String>? = null, port: Int? = null) =
    CassandraClientOptions()
.apply {
  if (contactPoints != null) {
    this.setContactPoints(contactPoints.toList())
  }
  if (port != null) {
    this.setPort(port)
  }
}

/**
 * A function providing a DSL for building [CassandraClientOptions] objects.
 *
 *  Eclipse Vert.x Cassandra client options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CassandraClientOptions original]
    using Vert.x codegen.
 *
 * @param contactPoints  Set a list of hosts, where some of cluster nodes is located.
 * @param port  Set which port should be used for all the hosts to connect to a cassandra service.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("cassandraClientOptionsOf(contactPoints,port)")
)
fun CassandraClientOptions(contactPoints: Iterable<String>? = null, port: Int? = null) =
    CassandraClientOptions()
.apply {
  if (contactPoints != null) {
    this.setContactPoints(contactPoints.toList())
  }
  if (port != null) {
    this.setPort(port)
  }
}

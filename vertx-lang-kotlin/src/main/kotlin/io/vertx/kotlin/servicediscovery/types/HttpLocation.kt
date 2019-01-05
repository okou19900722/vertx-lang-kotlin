package io.vertx.kotlin.servicediscovery.types

import io.vertx.servicediscovery.types.HttpLocation
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [HttpLocation] objects.
 *
 *  Represents the location of a HTTP endpoint. This object (its json representation) will be used
    as "location" in a
 *  service record.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [HttpLocation original] using
    Vert.x codegen.
 *
 * @param endpoint  Sets the endpoint, which is the URL of the service. The endpoint is
    automatically computed when you use the other `setX` method.
 * @param host  Sets the host.
 * @param port  Sets the port
 * @param root  Sets the path of the service (root)
 * @param ssl  Sets whether or not the HTTP service is using <code>https</code>.
 */
fun httpLocationOf(
  endpoint: String? = null,
  host: String? = null,
  port: Int? = null,
  root: String? = null,
  ssl: Boolean? = null
) = HttpLocation()
.apply {
  if (endpoint != null) {
    this.setEndpoint(endpoint)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (root != null) {
    this.setRoot(root)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
}

/**
 * A function providing a DSL for building [HttpLocation] objects.
 *
 *  Represents the location of a HTTP endpoint. This object (its json representation) will be used
    as "location" in a
 *  service record.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [HttpLocation original] using
    Vert.x codegen.
 *
 * @param endpoint  Sets the endpoint, which is the URL of the service. The endpoint is
    automatically computed when you use the other `setX` method.
 * @param host  Sets the host.
 * @param port  Sets the port
 * @param root  Sets the path of the service (root)
 * @param ssl  Sets whether or not the HTTP service is using <code>https</code>.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("httpLocationOf(endpoint,host,port,root,ssl)")
)
fun HttpLocation(
  endpoint: String? = null,
  host: String? = null,
  port: Int? = null,
  root: String? = null,
  ssl: Boolean? = null
) = HttpLocation()
.apply {
  if (endpoint != null) {
    this.setEndpoint(endpoint)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (root != null) {
    this.setRoot(root)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
}

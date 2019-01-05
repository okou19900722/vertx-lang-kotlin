package io.vertx.kotlin.core.dns

import io.vertx.core.dns.DnsClientOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [DnsClientOptions] objects.
 *
 *  Configuration options for Vert.x DNS client.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [DnsClientOptions original] using
    Vert.x codegen.
 *
 * @param host  Set the host name to be used by this client in requests.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is
    configured for logging on Netty's logger.
 * @param port  Set the port to be used by this client in requests.
 * @param queryTimeout  Set the query timeout in milliseconds, i.e the amount of time after a query
    is considered to be failed.
 * @param recursionDesired  Set whether or not recursion is desired
 */
fun dnsClientOptionsOf(
  host: String? = null,
  logActivity: Boolean? = null,
  port: Int? = null,
  queryTimeout: Long? = null,
  recursionDesired: Boolean? = null
) = DnsClientOptions()
.apply {
  if (host != null) {
    this.setHost(host)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (queryTimeout != null) {
    this.setQueryTimeout(queryTimeout)
  }
  if (recursionDesired != null) {
    this.setRecursionDesired(recursionDesired)
  }
}

/**
 * A function providing a DSL for building [DnsClientOptions] objects.
 *
 *  Configuration options for Vert.x DNS client.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [DnsClientOptions original] using
    Vert.x codegen.
 *
 * @param host  Set the host name to be used by this client in requests.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is
    configured for logging on Netty's logger.
 * @param port  Set the port to be used by this client in requests.
 * @param queryTimeout  Set the query timeout in milliseconds, i.e the amount of time after a query
    is considered to be failed.
 * @param recursionDesired  Set whether or not recursion is desired
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("dnsClientOptionsOf(host,logActivity,port,queryTimeout,recursionDesired)")
)
fun DnsClientOptions(
  host: String? = null,
  logActivity: Boolean? = null,
  port: Int? = null,
  queryTimeout: Long? = null,
  recursionDesired: Boolean? = null
) = DnsClientOptions()
.apply {
  if (host != null) {
    this.setHost(host)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (queryTimeout != null) {
    this.setQueryTimeout(queryTimeout)
  }
  if (recursionDesired != null) {
    this.setRecursionDesired(recursionDesired)
  }
}

package io.vertx.kotlin.core.net

import io.vertx.core.net.ProxyOptions
import io.vertx.core.net.ProxyType
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [ProxyOptions] objects.
 *
 *  Proxy options for a net client or a net client.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ProxyOptions original] using
    Vert.x codegen.
 *
 * @param host  Set proxy host.
 * @param password  Set proxy password.
 * @param port  Set proxy port.
 * @param type  Set proxy type. <p>ProxyType can be HTTP, SOCKS4 and SOCKS5
 * @param username  Set proxy username.
 */
fun proxyOptionsOf(
  host: String? = null,
  password: String? = null,
  port: Int? = null,
  type: ProxyType? = null,
  username: String? = null
) = ProxyOptions()
.apply {
  if (host != null) {
    this.setHost(host)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (type != null) {
    this.setType(type)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

/**
 * A function providing a DSL for building [ProxyOptions] objects.
 *
 *  Proxy options for a net client or a net client.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ProxyOptions original] using
    Vert.x codegen.
 *
 * @param host  Set proxy host.
 * @param password  Set proxy password.
 * @param port  Set proxy port.
 * @param type  Set proxy type. <p>ProxyType can be HTTP, SOCKS4 and SOCKS5
 * @param username  Set proxy username.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("proxyOptionsOf(host,password,port,type,username)")
)
fun ProxyOptions(
  host: String? = null,
  password: String? = null,
  port: Int? = null,
  type: ProxyType? = null,
  username: String? = null
) = ProxyOptions()
.apply {
  if (host != null) {
    this.setHost(host)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (type != null) {
    this.setType(type)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

package io.vertx.kotlin.core.net

import io.vertx.core.net.OpenSSLEngineOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [OpenSSLEngineOptions] objects.
 *
 *  Configures a [io.vertx.core.net.TCPSSLOptions] to use OpenSsl.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OpenSSLEngineOptions original]
    using Vert.x codegen.
 *
 * @param sessionCacheEnabled  Set whether session cache is enabled in open SSL session server
    context
 */
fun openSSLEngineOptionsOf(sessionCacheEnabled: Boolean? = null) = OpenSSLEngineOptions()
.apply {
  if (sessionCacheEnabled != null) {
    this.setSessionCacheEnabled(sessionCacheEnabled)
  }
}

/**
 * A function providing a DSL for building [OpenSSLEngineOptions] objects.
 *
 *  Configures a [io.vertx.core.net.TCPSSLOptions] to use OpenSsl.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OpenSSLEngineOptions original]
    using Vert.x codegen.
 *
 * @param sessionCacheEnabled  Set whether session cache is enabled in open SSL session server
    context
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("openSSLEngineOptionsOf(sessionCacheEnabled)")
)
fun OpenSSLEngineOptions(sessionCacheEnabled: Boolean? = null) = OpenSSLEngineOptions()
.apply {
  if (sessionCacheEnabled != null) {
    this.setSessionCacheEnabled(sessionCacheEnabled)
  }
}

package io.vertx.kotlin.core.net

import io.vertx.core.net.JdkSSLEngineOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [JdkSSLEngineOptions] objects.
 *
 *  Configures a [io.vertx.core.net.TCPSSLOptions] to use the JDK ssl engine implementation.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [JdkSSLEngineOptions original]
    using Vert.x codegen.
 */
fun jdkSSLEngineOptionsOf() = JdkSSLEngineOptions()
.apply {
}

/**
 * A function providing a DSL for building [JdkSSLEngineOptions] objects.
 *
 *  Configures a [io.vertx.core.net.TCPSSLOptions] to use the JDK ssl engine implementation.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [JdkSSLEngineOptions original]
    using Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("jdkSSLEngineOptionsOf()")
)
fun JdkSSLEngineOptions() = JdkSSLEngineOptions()
.apply {
}

package io.vertx.kotlin.core.metrics

import io.vertx.core.metrics.MetricsOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MetricsOptions] objects.
 *
 *  Vert.x metrics base configuration, this class can be extended by provider implementations to
    configure
 *  those specific implementations.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MetricsOptions original] using
    Vert.x codegen.
 *
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance.
 */
fun metricsOptionsOf(enabled: Boolean? = null) = MetricsOptions()
.apply {
  if (enabled != null) {
    this.setEnabled(enabled)
  }
}

/**
 * A function providing a DSL for building [MetricsOptions] objects.
 *
 *  Vert.x metrics base configuration, this class can be extended by provider implementations to
    configure
 *  those specific implementations.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MetricsOptions original] using
    Vert.x codegen.
 *
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("metricsOptionsOf(enabled)")
)
fun MetricsOptions(enabled: Boolean? = null) = MetricsOptions()
.apply {
  if (enabled != null) {
    this.setEnabled(enabled)
  }
}

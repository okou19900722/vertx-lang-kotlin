package io.vertx.kotlin.micrometer

import io.vertx.micrometer.VertxJmxMetricsOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [VertxJmxMetricsOptions] objects.
 *
 *  Options for Prometheus metrics backend.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [VertxJmxMetricsOptions original]
    using Vert.x codegen.
 *
 * @param domain  Set the JMX domain under which to publish metrics
 * @param enabled  Set true to enable Prometheus reporting
 * @param step  Push interval steps, in seconds. Default is 10 seconds.
 */
fun vertxJmxMetricsOptionsOf(
  domain: String? = null,
  enabled: Boolean? = null,
  step: Int? = null
) = VertxJmxMetricsOptions()
.apply {
  if (domain != null) {
    this.setDomain(domain)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (step != null) {
    this.setStep(step)
  }
}

/**
 * A function providing a DSL for building [VertxJmxMetricsOptions] objects.
 *
 *  Options for Prometheus metrics backend.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [VertxJmxMetricsOptions original]
    using Vert.x codegen.
 *
 * @param domain  Set the JMX domain under which to publish metrics
 * @param enabled  Set true to enable Prometheus reporting
 * @param step  Push interval steps, in seconds. Default is 10 seconds.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("vertxJmxMetricsOptionsOf(domain,enabled,step)")
)
fun VertxJmxMetricsOptions(
  domain: String? = null,
  enabled: Boolean? = null,
  step: Int? = null
) = VertxJmxMetricsOptions()
.apply {
  if (domain != null) {
    this.setDomain(domain)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (step != null) {
    this.setStep(step)
  }
}

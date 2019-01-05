package io.vertx.kotlin.micrometer

import io.vertx.core.http.HttpServerOptions
import io.vertx.micrometer.VertxPrometheusOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [VertxPrometheusOptions] objects.
 *
 *  Options for Prometheus metrics backend.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [VertxPrometheusOptions original]
    using Vert.x codegen.
 *
 * @param embeddedServerEndpoint  Set metrics endpoint. Use conjointly with the embedded server
    options. Defaults to <i>/metrics</i>.
 * @param embeddedServerOptions  HTTP server options for the embedded server
 * @param enabled  Set true to enable Prometheus reporting
 * @param publishQuantiles  Set true to publish histogram stats, necessary to compute quantiles.
    Note that it generates many new timeseries for stats, which is why it is deactivated by default.
 * @param startEmbeddedServer  When true, an embedded server will init to expose metrics with
    Prometheus format.
 */
fun vertxPrometheusOptionsOf(
  embeddedServerEndpoint: String? = null,
  embeddedServerOptions: HttpServerOptions? = null,
  enabled: Boolean? = null,
  publishQuantiles: Boolean? = null,
  startEmbeddedServer: Boolean? = null
) = VertxPrometheusOptions()
.apply {
  if (embeddedServerEndpoint != null) {
    this.setEmbeddedServerEndpoint(embeddedServerEndpoint)
  }
  if (embeddedServerOptions != null) {
    this.setEmbeddedServerOptions(embeddedServerOptions)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (publishQuantiles != null) {
    this.setPublishQuantiles(publishQuantiles)
  }
  if (startEmbeddedServer != null) {
    this.setStartEmbeddedServer(startEmbeddedServer)
  }
}

/**
 * A function providing a DSL for building [VertxPrometheusOptions] objects.
 *
 *  Options for Prometheus metrics backend.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [VertxPrometheusOptions original]
    using Vert.x codegen.
 *
 * @param embeddedServerEndpoint  Set metrics endpoint. Use conjointly with the embedded server
    options. Defaults to <i>/metrics</i>.
 * @param embeddedServerOptions  HTTP server options for the embedded server
 * @param enabled  Set true to enable Prometheus reporting
 * @param publishQuantiles  Set true to publish histogram stats, necessary to compute quantiles.
    Note that it generates many new timeseries for stats, which is why it is deactivated by default.
 * @param startEmbeddedServer  When true, an embedded server will init to expose metrics with
    Prometheus format.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("vertxPrometheusOptionsOf(embeddedServerEndpoint,embeddedServerOptions,enabled,publishQuantiles,startEmbeddedServer)")
)
fun VertxPrometheusOptions(
  embeddedServerEndpoint: String? = null,
  embeddedServerOptions: HttpServerOptions? = null,
  enabled: Boolean? = null,
  publishQuantiles: Boolean? = null,
  startEmbeddedServer: Boolean? = null
) = VertxPrometheusOptions()
.apply {
  if (embeddedServerEndpoint != null) {
    this.setEmbeddedServerEndpoint(embeddedServerEndpoint)
  }
  if (embeddedServerOptions != null) {
    this.setEmbeddedServerOptions(embeddedServerOptions)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (publishQuantiles != null) {
    this.setPublishQuantiles(publishQuantiles)
  }
  if (startEmbeddedServer != null) {
    this.setStartEmbeddedServer(startEmbeddedServer)
  }
}

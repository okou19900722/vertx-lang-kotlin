package io.vertx.kotlin.ext.dropwizard

import io.vertx.ext.dropwizard.DropwizardMetricsOptions
import io.vertx.ext.dropwizard.Match
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [DropwizardMetricsOptions] objects.
 *
 *  Vert.x Dropwizard metrics configuration.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [DropwizardMetricsOptions original]
    using Vert.x codegen.
 *
 * @param baseName  Set a custom baseName for metrics.
 * @param configPath  Set the path for a config file that contains options in JSON format, to be
    used to create a new options object. The file will be looked for on the file system first and
    then on the classpath if it's not found.
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance.
 * @param jmxDomain  Set the JMX domain to use when JMX metrics are enabled.
 * @param jmxEnabled  Set whether JMX will be enabled on the Vert.x instance.
 * @param monitoredEventBusHandlers  Add a monitored event bus handler.
 * @param monitoredHttpClientEndpoints  Add an monitored http client endpoint.
 * @param monitoredHttpClientUris  Add an monitored http client uri.
 * @param monitoredHttpServerUris  Add an monitored http server uri.
 * @param registryName  Set the name used for registering the metrics in the Dropwizard shared
    registry.
 */
fun dropwizardMetricsOptionsOf(
  baseName: String? = null,
  configPath: String? = null,
  enabled: Boolean? = null,
  jmxDomain: String? = null,
  jmxEnabled: Boolean? = null,
  monitoredEventBusHandlers: Iterable<Match>? = null,
  monitoredHttpClientEndpoints: Iterable<Match>? = null,
  monitoredHttpClientUris: Iterable<Match>? = null,
  monitoredHttpServerUris: Iterable<Match>? = null,
  registryName: String? = null
) = DropwizardMetricsOptions()
.apply {
  if (baseName != null) {
    this.setBaseName(baseName)
  }
  if (configPath != null) {
    this.setConfigPath(configPath)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (jmxDomain != null) {
    this.setJmxDomain(jmxDomain)
  }
  if (jmxEnabled != null) {
    this.setJmxEnabled(jmxEnabled)
  }
  if (monitoredEventBusHandlers != null) {
    for (item in monitoredEventBusHandlers) {
      this.addMonitoredEventBusHandler(item)
    }
  }
  if (monitoredHttpClientEndpoints != null) {
    for (item in monitoredHttpClientEndpoints) {
      this.addMonitoredHttpClientEndpoint(item)
    }
  }
  if (monitoredHttpClientUris != null) {
    for (item in monitoredHttpClientUris) {
      this.addMonitoredHttpClientUri(item)
    }
  }
  if (monitoredHttpServerUris != null) {
    for (item in monitoredHttpServerUris) {
      this.addMonitoredHttpServerUri(item)
    }
  }
  if (registryName != null) {
    this.setRegistryName(registryName)
  }
}

/**
 * A function providing a DSL for building [DropwizardMetricsOptions] objects.
 *
 *  Vert.x Dropwizard metrics configuration.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [DropwizardMetricsOptions original]
    using Vert.x codegen.
 *
 * @param baseName  Set a custom baseName for metrics.
 * @param configPath  Set the path for a config file that contains options in JSON format, to be
    used to create a new options object. The file will be looked for on the file system first and
    then on the classpath if it's not found.
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance.
 * @param jmxDomain  Set the JMX domain to use when JMX metrics are enabled.
 * @param jmxEnabled  Set whether JMX will be enabled on the Vert.x instance.
 * @param monitoredEventBusHandlers  Add a monitored event bus handler.
 * @param monitoredHttpClientEndpoints  Add an monitored http client endpoint.
 * @param monitoredHttpClientUris  Add an monitored http client uri.
 * @param monitoredHttpServerUris  Add an monitored http server uri.
 * @param registryName  Set the name used for registering the metrics in the Dropwizard shared
    registry.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("dropwizardMetricsOptionsOf(baseName,configPath,enabled,jmxDomain,jmxEnabled,monitoredEventBusHandlers,monitoredHttpClientEndpoint,monitoredHttpClientEndpoints,monitoredHttpClientUris,monitoredHttpServerUris,registryName)")
)
fun DropwizardMetricsOptions(
  baseName: String? = null,
  configPath: String? = null,
  enabled: Boolean? = null,
  jmxDomain: String? = null,
  jmxEnabled: Boolean? = null,
  monitoredEventBusHandlers: Iterable<Match>? = null,
  monitoredHttpClientEndpoints: Iterable<Match>? = null,
  monitoredHttpClientUris: Iterable<Match>? = null,
  monitoredHttpServerUris: Iterable<Match>? = null,
  registryName: String? = null
) = DropwizardMetricsOptions()
.apply {
  if (baseName != null) {
    this.setBaseName(baseName)
  }
  if (configPath != null) {
    this.setConfigPath(configPath)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (jmxDomain != null) {
    this.setJmxDomain(jmxDomain)
  }
  if (jmxEnabled != null) {
    this.setJmxEnabled(jmxEnabled)
  }
  if (monitoredEventBusHandlers != null) {
    for (item in monitoredEventBusHandlers) {
      this.addMonitoredEventBusHandler(item)
    }
  }
  if (monitoredHttpClientEndpoints != null) {
    for (item in monitoredHttpClientEndpoints) {
      this.addMonitoredHttpClientEndpoint(item)
    }
  }
  if (monitoredHttpClientUris != null) {
    for (item in monitoredHttpClientUris) {
      this.addMonitoredHttpClientUri(item)
    }
  }
  if (monitoredHttpServerUris != null) {
    for (item in monitoredHttpServerUris) {
      this.addMonitoredHttpServerUri(item)
    }
  }
  if (registryName != null) {
    this.setRegistryName(registryName)
  }
}

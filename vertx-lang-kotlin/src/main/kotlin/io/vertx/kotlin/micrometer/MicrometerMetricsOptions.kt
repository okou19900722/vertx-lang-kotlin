package io.vertx.kotlin.micrometer

import io.vertx.micrometer.Label
import io.vertx.micrometer.Match
import io.vertx.micrometer.MetricsDomain
import io.vertx.micrometer.MicrometerMetricsOptions
import io.vertx.micrometer.VertxInfluxDbOptions
import io.vertx.micrometer.VertxJmxMetricsOptions
import io.vertx.micrometer.VertxPrometheusOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MicrometerMetricsOptions] objects.
 *
 *  Vert.x micrometer configuration.
 *  <p>
 *  It is required to set either <code>influxDbOptions</code>, <code>prometheusOptions</code> or
    <code>jmxMetricsOptions</code>
 *  (or, programmatically, <code>micrometerRegistry</code>) in order to actually report metrics.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MicrometerMetricsOptions original]
    using Vert.x codegen.
 *
 * @param disabledMetricsCategories  Sets metrics types that are disabled.
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance. Metrics are not
    enabled by default.
 * @param influxDbOptions  Set InfluxDB options. Setting a registry backend option is mandatory in
    order to effectively report metrics.
 * @param jmxMetricsOptions  Set JMX metrics options. Setting a registry backend option is mandatory
    in order to effectively report metrics.
 * @param jvmMetricsEnabled  Whether JVM metrics should be collected. Defaults to
    <code>false</code>.
 * @param labelMatches  Set a list of rules for label matching.
 * @param labelMatchs  Add a rule for label matching.
 * @param labels  Sets enabled labels. These labels can be fine-tuned later on using Micrometer's
    Meter filters (see http://micrometer.io/docs/concepts#_meter_filters)
 * @param prometheusOptions  Set Prometheus options. Setting a registry backend option is mandatory
    in order to effectively report metrics.
 * @param registryName  Set a name for the metrics registry, so that a new registry will be created
    and associated with this name. If <code>registryName</code> is not provided (or null), a default
    registry will be used. If the same name is given to several Vert.x instances (within the same
    JVM), they will share the same registry.
 */
fun micrometerMetricsOptionsOf(
  disabledMetricsCategories: Iterable<MetricsDomain>? = null,
  enabled: Boolean? = null,
  influxDbOptions: VertxInfluxDbOptions? = null,
  jmxMetricsOptions: VertxJmxMetricsOptions? = null,
  jvmMetricsEnabled: Boolean? = null,
  labelMatches: Iterable<Match>? = null,
  labelMatchs: Iterable<Match>? = null,
  labels: Iterable<Label>? = null,
  prometheusOptions: VertxPrometheusOptions? = null,
  registryName: String? = null
) = MicrometerMetricsOptions()
.apply {
  if (disabledMetricsCategories != null) {
    this.setDisabledMetricsCategories(disabledMetricsCategories.toSet())
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (influxDbOptions != null) {
    this.setInfluxDbOptions(influxDbOptions)
  }
  if (jmxMetricsOptions != null) {
    this.setJmxMetricsOptions(jmxMetricsOptions)
  }
  if (jvmMetricsEnabled != null) {
    this.setJvmMetricsEnabled(jvmMetricsEnabled)
  }
  if (labelMatches != null) {
    this.setLabelMatches(labelMatches.toList())
  }
  if (labelMatchs != null) {
    for (item in labelMatchs) {
      this.addLabelMatch(item)
    }
  }
  if (labels != null) {
    this.setLabels(labels.toSet())
  }
  if (prometheusOptions != null) {
    this.setPrometheusOptions(prometheusOptions)
  }
  if (registryName != null) {
    this.setRegistryName(registryName)
  }
}

/**
 * A function providing a DSL for building [MicrometerMetricsOptions] objects.
 *
 *  Vert.x micrometer configuration.
 *  <p>
 *  It is required to set either <code>influxDbOptions</code>, <code>prometheusOptions</code> or
    <code>jmxMetricsOptions</code>
 *  (or, programmatically, <code>micrometerRegistry</code>) in order to actually report metrics.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MicrometerMetricsOptions original]
    using Vert.x codegen.
 *
 * @param disabledMetricsCategories  Sets metrics types that are disabled.
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance. Metrics are not
    enabled by default.
 * @param influxDbOptions  Set InfluxDB options. Setting a registry backend option is mandatory in
    order to effectively report metrics.
 * @param jmxMetricsOptions  Set JMX metrics options. Setting a registry backend option is mandatory
    in order to effectively report metrics.
 * @param jvmMetricsEnabled  Whether JVM metrics should be collected. Defaults to
    <code>false</code>.
 * @param labelMatches  Set a list of rules for label matching.
 * @param labelMatchs  Add a rule for label matching.
 * @param labels  Sets enabled labels. These labels can be fine-tuned later on using Micrometer's
    Meter filters (see http://micrometer.io/docs/concepts#_meter_filters)
 * @param prometheusOptions  Set Prometheus options. Setting a registry backend option is mandatory
    in order to effectively report metrics.
 * @param registryName  Set a name for the metrics registry, so that a new registry will be created
    and associated with this name. If <code>registryName</code> is not provided (or null), a default
    registry will be used. If the same name is given to several Vert.x instances (within the same
    JVM), they will share the same registry.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("micrometerMetricsOptionsOf(disabledMetricsCategories,enabled,influxDbOptions,jmxMetricsOptions,jvmMetricsEnabled,labelMatches,labelMatchs,labels,prometheusOptions,registryName)")
)
fun MicrometerMetricsOptions(
  disabledMetricsCategories: Iterable<MetricsDomain>? = null,
  enabled: Boolean? = null,
  influxDbOptions: VertxInfluxDbOptions? = null,
  jmxMetricsOptions: VertxJmxMetricsOptions? = null,
  jvmMetricsEnabled: Boolean? = null,
  labelMatches: Iterable<Match>? = null,
  labelMatchs: Iterable<Match>? = null,
  labels: Iterable<Label>? = null,
  prometheusOptions: VertxPrometheusOptions? = null,
  registryName: String? = null
) = MicrometerMetricsOptions()
.apply {
  if (disabledMetricsCategories != null) {
    this.setDisabledMetricsCategories(disabledMetricsCategories.toSet())
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (influxDbOptions != null) {
    this.setInfluxDbOptions(influxDbOptions)
  }
  if (jmxMetricsOptions != null) {
    this.setJmxMetricsOptions(jmxMetricsOptions)
  }
  if (jvmMetricsEnabled != null) {
    this.setJvmMetricsEnabled(jvmMetricsEnabled)
  }
  if (labelMatches != null) {
    this.setLabelMatches(labelMatches.toList())
  }
  if (labelMatchs != null) {
    for (item in labelMatchs) {
      this.addLabelMatch(item)
    }
  }
  if (labels != null) {
    this.setLabels(labels.toSet())
  }
  if (prometheusOptions != null) {
    this.setPrometheusOptions(prometheusOptions)
  }
  if (registryName != null) {
    this.setRegistryName(registryName)
  }
}

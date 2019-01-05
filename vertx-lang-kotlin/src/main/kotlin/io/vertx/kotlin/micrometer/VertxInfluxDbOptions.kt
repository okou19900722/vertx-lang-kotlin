package io.vertx.kotlin.micrometer

import io.vertx.micrometer.VertxInfluxDbOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [VertxInfluxDbOptions] objects.
 *
 *  Vert.x InfluxDb micrometer configuration.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [VertxInfluxDbOptions original]
    using Vert.x codegen.
 *
 * @param batchSize  Maximum number of measurements sent per request to the InfluxDB server. When
    the maximum is reached, several requests are made. Default is 10000.
 * @param compressed  Activate or deactivate GZIP compression. It is activated by default.
 * @param connectTimeout  Connection timeout for InfluxDB server connections, in seconds. Default is
    1 second.
 * @param db  Database name used to store metrics. Default is "default".
 * @param enabled  Set true to enable InfluxDB reporting
 * @param numThreads  Number of threads to use by the push scheduler. Default is 2.
 * @param password  Password used for authenticated connections
 * @param readTimeout  Read timeout for InfluxDB server connections, in seconds. Default is 10
    seconds.
 * @param retentionPolicy  InfluxDB retention policy
 * @param step  Push interval steps, in seconds. Default is 10 seconds.
 * @param uri  URI of the InfluxDB server. <i>Example: http://influx:8086</i>.
 * @param userName  Username used for authenticated connections
 */
fun vertxInfluxDbOptionsOf(
  batchSize: Int? = null,
  compressed: Boolean? = null,
  connectTimeout: Int? = null,
  db: String? = null,
  enabled: Boolean? = null,
  numThreads: Int? = null,
  password: String? = null,
  readTimeout: Int? = null,
  retentionPolicy: String? = null,
  step: Int? = null,
  uri: String? = null,
  userName: String? = null
) = VertxInfluxDbOptions()
.apply {
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (compressed != null) {
    this.setCompressed(compressed)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (db != null) {
    this.setDb(db)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (numThreads != null) {
    this.setNumThreads(numThreads)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (readTimeout != null) {
    this.setReadTimeout(readTimeout)
  }
  if (retentionPolicy != null) {
    this.setRetentionPolicy(retentionPolicy)
  }
  if (step != null) {
    this.setStep(step)
  }
  if (uri != null) {
    this.setUri(uri)
  }
  if (userName != null) {
    this.setUserName(userName)
  }
}

/**
 * A function providing a DSL for building [VertxInfluxDbOptions] objects.
 *
 *  Vert.x InfluxDb micrometer configuration.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [VertxInfluxDbOptions original]
    using Vert.x codegen.
 *
 * @param batchSize  Maximum number of measurements sent per request to the InfluxDB server. When
    the maximum is reached, several requests are made. Default is 10000.
 * @param compressed  Activate or deactivate GZIP compression. It is activated by default.
 * @param connectTimeout  Connection timeout for InfluxDB server connections, in seconds. Default is
    1 second.
 * @param db  Database name used to store metrics. Default is "default".
 * @param enabled  Set true to enable InfluxDB reporting
 * @param numThreads  Number of threads to use by the push scheduler. Default is 2.
 * @param password  Password used for authenticated connections
 * @param readTimeout  Read timeout for InfluxDB server connections, in seconds. Default is 10
    seconds.
 * @param retentionPolicy  InfluxDB retention policy
 * @param step  Push interval steps, in seconds. Default is 10 seconds.
 * @param uri  URI of the InfluxDB server. <i>Example: http://influx:8086</i>.
 * @param userName  Username used for authenticated connections
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("vertxInfluxDbOptionsOf(batchSize,compressed,connectTimeout,db,enabled,numThreads,password,readTimeout,retentionPolicy,step,uri,userName)")
)
fun VertxInfluxDbOptions(
  batchSize: Int? = null,
  compressed: Boolean? = null,
  connectTimeout: Int? = null,
  db: String? = null,
  enabled: Boolean? = null,
  numThreads: Int? = null,
  password: String? = null,
  readTimeout: Int? = null,
  retentionPolicy: String? = null,
  step: Int? = null,
  uri: String? = null,
  userName: String? = null
) = VertxInfluxDbOptions()
.apply {
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (compressed != null) {
    this.setCompressed(compressed)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (db != null) {
    this.setDb(db)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (numThreads != null) {
    this.setNumThreads(numThreads)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (readTimeout != null) {
    this.setReadTimeout(readTimeout)
  }
  if (retentionPolicy != null) {
    this.setRetentionPolicy(retentionPolicy)
  }
  if (step != null) {
    this.setStep(step)
  }
  if (uri != null) {
    this.setUri(uri)
  }
  if (userName != null) {
    this.setUserName(userName)
  }
}

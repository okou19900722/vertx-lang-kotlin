package io.vertx.kotlin.config

import io.vertx.config.ConfigRetrieverOptions
import io.vertx.config.ConfigStoreOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [ConfigRetrieverOptions] objects.
 *
 *  Options to configure the <code>ConfigRetriever</code>.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ConfigRetrieverOptions original]
    using Vert.x codegen.
 *
 * @param includeDefaultStores  Enables or disables the inclusion of the default stored in the
    configuration.
 * @param scanPeriod  Configures the scan period, in ms. This is the time amount between two checks
    of the configuration updates.
 * @param stores  Sets the configuration stores.
 */
fun configRetrieverOptionsOf(
  includeDefaultStores: Boolean? = null,
  scanPeriod: Long? = null,
  stores: Iterable<ConfigStoreOptions>? = null
) = ConfigRetrieverOptions()
.apply {
  if (includeDefaultStores != null) {
    this.setIncludeDefaultStores(includeDefaultStores)
  }
  if (scanPeriod != null) {
    this.setScanPeriod(scanPeriod)
  }
  if (stores != null) {
    this.setStores(stores.toList())
  }
}

/**
 * A function providing a DSL for building [ConfigRetrieverOptions] objects.
 *
 *  Options to configure the <code>ConfigRetriever</code>.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ConfigRetrieverOptions original]
    using Vert.x codegen.
 *
 * @param includeDefaultStores  Enables or disables the inclusion of the default stored in the
    configuration.
 * @param scanPeriod  Configures the scan period, in ms. This is the time amount between two checks
    of the configuration updates.
 * @param stores  Sets the configuration stores.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("configRetrieverOptionsOf(includeDefaultStores,scanPeriod,stores)")
)
fun ConfigRetrieverOptions(
  includeDefaultStores: Boolean? = null,
  scanPeriod: Long? = null,
  stores: Iterable<ConfigStoreOptions>? = null
) = ConfigRetrieverOptions()
.apply {
  if (includeDefaultStores != null) {
    this.setIncludeDefaultStores(includeDefaultStores)
  }
  if (scanPeriod != null) {
    this.setScanPeriod(scanPeriod)
  }
  if (stores != null) {
    this.setStores(stores.toList())
  }
}

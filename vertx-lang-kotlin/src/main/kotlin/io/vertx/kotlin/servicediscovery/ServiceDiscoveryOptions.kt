package io.vertx.kotlin.servicediscovery

import io.vertx.core.json.JsonObject
import io.vertx.servicediscovery.ServiceDiscoveryOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [ServiceDiscoveryOptions] objects.
 *
 *  Options to configure the service discovery.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceDiscoveryOptions original]
    using Vert.x codegen.
 *
 * @param announceAddress  Sets the event bus address on which the service arrivals, departures and
    modifications are announced. This address must be consistent in the whole application.
 * @param autoRegistrationOfImporters  Sets whether or not the registration of importers declared as
    SPI is enabled.
 * @param backendConfiguration  Sets the configuration passed to the . Refer to the backend
    documentation to get more details on the requirements. The default backend does not need any
    configuration.
 * @param name  Sets the service discovery name used in the service usage events. If not set, the
    node id is used.
 * @param usageAddress  Sets the usage address: the event bus address on which are sent the service
    usage events (bind / release).
 */
fun serviceDiscoveryOptionsOf(
  announceAddress: String? = null,
  autoRegistrationOfImporters: Boolean? = null,
  backendConfiguration: JsonObject? = null,
  name: String? = null,
  usageAddress: String? = null
) = ServiceDiscoveryOptions()
.apply {
  if (announceAddress != null) {
    this.setAnnounceAddress(announceAddress)
  }
  if (autoRegistrationOfImporters != null) {
    this.setAutoRegistrationOfImporters(autoRegistrationOfImporters)
  }
  if (backendConfiguration != null) {
    this.setBackendConfiguration(backendConfiguration)
  }
  if (name != null) {
    this.setName(name)
  }
  if (usageAddress != null) {
    this.setUsageAddress(usageAddress)
  }
}

/**
 * A function providing a DSL for building [ServiceDiscoveryOptions] objects.
 *
 *  Options to configure the service discovery.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceDiscoveryOptions original]
    using Vert.x codegen.
 *
 * @param announceAddress  Sets the event bus address on which the service arrivals, departures and
    modifications are announced. This address must be consistent in the whole application.
 * @param autoRegistrationOfImporters  Sets whether or not the registration of importers declared as
    SPI is enabled.
 * @param backendConfiguration  Sets the configuration passed to the . Refer to the backend
    documentation to get more details on the requirements. The default backend does not need any
    configuration.
 * @param name  Sets the service discovery name used in the service usage events. If not set, the
    node id is used.
 * @param usageAddress  Sets the usage address: the event bus address on which are sent the service
    usage events (bind / release).
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("serviceDiscoveryOptionsOf(announceAddress,autoRegistrationOfImporters,backendConfiguration,name,usageAddress)")
)
fun ServiceDiscoveryOptions(
  announceAddress: String? = null,
  autoRegistrationOfImporters: Boolean? = null,
  backendConfiguration: JsonObject? = null,
  name: String? = null,
  usageAddress: String? = null
) = ServiceDiscoveryOptions()
.apply {
  if (announceAddress != null) {
    this.setAnnounceAddress(announceAddress)
  }
  if (autoRegistrationOfImporters != null) {
    this.setAutoRegistrationOfImporters(autoRegistrationOfImporters)
  }
  if (backendConfiguration != null) {
    this.setBackendConfiguration(backendConfiguration)
  }
  if (name != null) {
    this.setName(name)
  }
  if (usageAddress != null) {
    this.setUsageAddress(usageAddress)
  }
}

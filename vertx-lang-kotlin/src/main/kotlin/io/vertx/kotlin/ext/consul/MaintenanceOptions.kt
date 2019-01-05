package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.MaintenanceOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MaintenanceOptions] objects.
 *
 *  Options used to placing a given service into "maintenance mode".
 *  During maintenance mode, the service will be marked as unavailable
 *  and will not be present in DNS or API queries. Maintenance mode is persistent
 *  and will be automatically restored on agent restart.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MaintenanceOptions original] using
    Vert.x codegen.
 *
 * @param enable  Set maintenance mode to enabled: <code>true</code> to enter maintenance mode or
    <code>false</code> to resume normal operation. This flag is required.
 * @param id  Set the ID of service. This field is required.
 * @param reason  Set the reason message. If provided, its value should be a text string explaining
    the reason for placing the service into maintenance mode. This is simply to aid human operators.
 */
fun maintenanceOptionsOf(
  enable: Boolean? = null,
  id: String? = null,
  reason: String? = null
) = MaintenanceOptions()
.apply {
  if (enable != null) {
    this.setEnable(enable)
  }
  if (id != null) {
    this.setId(id)
  }
  if (reason != null) {
    this.setReason(reason)
  }
}

/**
 * A function providing a DSL for building [MaintenanceOptions] objects.
 *
 *  Options used to placing a given service into "maintenance mode".
 *  During maintenance mode, the service will be marked as unavailable
 *  and will not be present in DNS or API queries. Maintenance mode is persistent
 *  and will be automatically restored on agent restart.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MaintenanceOptions original] using
    Vert.x codegen.
 *
 * @param enable  Set maintenance mode to enabled: <code>true</code> to enter maintenance mode or
    <code>false</code> to resume normal operation. This flag is required.
 * @param id  Set the ID of service. This field is required.
 * @param reason  Set the reason message. If provided, its value should be a text string explaining
    the reason for placing the service into maintenance mode. This is simply to aid human operators.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("maintenanceOptionsOf(enable,id,reason)")
)
fun MaintenanceOptions(
  enable: Boolean? = null,
  id: String? = null,
  reason: String? = null
) = MaintenanceOptions()
.apply {
  if (enable != null) {
    this.setEnable(enable)
  }
  if (id != null) {
    this.setId(id)
  }
  if (reason != null) {
    this.setReason(reason)
  }
}

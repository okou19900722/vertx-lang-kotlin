package io.vertx.kotlin.config

import io.vertx.config.ConfigChange
import io.vertx.core.json.JsonObject
import kotlin.Deprecated

/**
 * A function providing a DSL for building [ConfigChange] objects.
 *
 *  A structure representing a configuration change.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ConfigChange original] using
    Vert.x codegen.
 *
 * @param newConfiguration  Sets the new configuration.
 * @param previousConfiguration  Sets the previous configuration.
 */
fun configChangeOf(newConfiguration: JsonObject? = null, previousConfiguration: JsonObject? = null)
    = ConfigChange()
.apply {
  if (newConfiguration != null) {
    this.setNewConfiguration(newConfiguration)
  }
  if (previousConfiguration != null) {
    this.setPreviousConfiguration(previousConfiguration)
  }
}

/**
 * A function providing a DSL for building [ConfigChange] objects.
 *
 *  A structure representing a configuration change.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ConfigChange original] using
    Vert.x codegen.
 *
 * @param newConfiguration  Sets the new configuration.
 * @param previousConfiguration  Sets the previous configuration.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("configChangeOf(newConfiguration,previousConfiguration)")
)
fun ConfigChange(newConfiguration: JsonObject? = null, previousConfiguration: JsonObject? = null) =
    ConfigChange()
.apply {
  if (newConfiguration != null) {
    this.setNewConfiguration(newConfiguration)
  }
  if (previousConfiguration != null) {
    this.setPreviousConfiguration(previousConfiguration)
  }
}

package io.vertx.kotlin.mqtt

import io.vertx.mqtt.MqttAuth
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MqttAuth] objects.
 *
 *  MQTT authentication information
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MqttAuth original] using Vert.x
    codegen.
 */
fun mqttAuthOf() = MqttAuth(io.vertx.core.json.JsonObject())
.apply {
}

/**
 * A function providing a DSL for building [MqttAuth] objects.
 *
 *  MQTT authentication information
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MqttAuth original] using Vert.x
    codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mqttAuthOf(password,username)")
)
fun MqttAuth() = MqttAuth(io.vertx.core.json.JsonObject())
.apply {
}

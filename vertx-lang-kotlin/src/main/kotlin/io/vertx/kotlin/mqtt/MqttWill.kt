package io.vertx.kotlin.mqtt

import io.vertx.mqtt.MqttWill
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MqttWill] objects.
 *
 *  Will information from the remote MQTT client
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MqttWill original] using Vert.x
    codegen.
 */
fun mqttWillOf() = MqttWill(io.vertx.core.json.JsonObject())
.apply {
}

/**
 * A function providing a DSL for building [MqttWill] objects.
 *
 *  Will information from the remote MQTT client
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MqttWill original] using Vert.x
    codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mqttWillOf(willFlag,willMessage,willQos,willRetain,willTopic)")
)
fun MqttWill() = MqttWill(io.vertx.core.json.JsonObject())
.apply {
}

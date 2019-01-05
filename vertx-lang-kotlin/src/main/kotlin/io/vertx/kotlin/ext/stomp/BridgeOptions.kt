package io.vertx.kotlin.ext.stomp

import io.vertx.ext.bridge.PermittedOptions
import io.vertx.ext.stomp.BridgeOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [BridgeOptions] objects.
 *
 *  Specify the event bus bridge options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BridgeOptions original] using
    Vert.x codegen.
 *
 * @param inboundPermitteds  Sets the list of inbound permitted options.
 * @param outboundPermitteds  Sets the list of outbound permitted options.
 */
fun bridgeOptionsOf(
  inboundPermitteds: Iterable<PermittedOptions>? = null,
  outboundPermitteds: Iterable<PermittedOptions>? = null,
  pointToPoint: Boolean? = null
) = BridgeOptions()
.apply {
  if (inboundPermitteds != null) {
    this.setInboundPermitteds(inboundPermitteds.toList())
  }
  if (outboundPermitteds != null) {
    this.setOutboundPermitteds(outboundPermitteds.toList())
  }
  if (pointToPoint != null) {
    this.setPointToPoint(pointToPoint)
  }
}

/**
 * A function providing a DSL for building [BridgeOptions] objects.
 *
 *  Specify the event bus bridge options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BridgeOptions original] using
    Vert.x codegen.
 *
 * @param inboundPermitteds  Sets the list of inbound permitted options.
 * @param outboundPermitteds  Sets the list of outbound permitted options.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("bridgeOptionsOf(inboundPermitteds,outboundPermitteds,pointToPoint)")
)
fun BridgeOptions(
  inboundPermitteds: Iterable<PermittedOptions>? = null,
  outboundPermitteds: Iterable<PermittedOptions>? = null,
  pointToPoint: Boolean? = null
) = BridgeOptions()
.apply {
  if (inboundPermitteds != null) {
    this.setInboundPermitteds(inboundPermitteds.toList())
  }
  if (outboundPermitteds != null) {
    this.setOutboundPermitteds(outboundPermitteds.toList())
  }
  if (pointToPoint != null) {
    this.setPointToPoint(pointToPoint)
  }
}

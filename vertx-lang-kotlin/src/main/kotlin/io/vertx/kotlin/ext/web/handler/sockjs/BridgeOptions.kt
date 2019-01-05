package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.bridge.PermittedOptions
import io.vertx.ext.web.handler.sockjs.BridgeOptions
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [BridgeOptions] objects.
 *
 *  Options for configuring the event bus bridge.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BridgeOptions original] using
    Vert.x codegen.
 */
fun bridgeOptionsOf(
  inboundPermitted: Iterable<PermittedOptions>? = null,
  inboundPermitteds: Iterable<PermittedOptions>? = null,
  maxAddressLength: Int? = null,
  maxHandlersPerSocket: Int? = null,
  outboundPermitted: Iterable<PermittedOptions>? = null,
  outboundPermitteds: Iterable<PermittedOptions>? = null,
  pingTimeout: Long? = null,
  replyTimeout: Long? = null
) = BridgeOptions()
.apply {
  if (inboundPermitted != null) {
    this.setInboundPermitted(inboundPermitted.toList())
  }
  if (inboundPermitteds != null) {
    for (item in inboundPermitteds) {
      this.addInboundPermitted(item)
    }
  }
  if (maxAddressLength != null) {
    this.setMaxAddressLength(maxAddressLength)
  }
  if (maxHandlersPerSocket != null) {
    this.setMaxHandlersPerSocket(maxHandlersPerSocket)
  }
  if (outboundPermitted != null) {
    this.setOutboundPermitted(outboundPermitted.toList())
  }
  if (outboundPermitteds != null) {
    for (item in outboundPermitteds) {
      this.addOutboundPermitted(item)
    }
  }
  if (pingTimeout != null) {
    this.setPingTimeout(pingTimeout)
  }
  if (replyTimeout != null) {
    this.setReplyTimeout(replyTimeout)
  }
}

/**
 * A function providing a DSL for building [BridgeOptions] objects.
 *
 *  Options for configuring the event bus bridge.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BridgeOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("bridgeOptionsOf(inboundPermitted,inboundPermitteds,maxAddressLength,maxHandlersPerSocket,outboundPermitted,outboundPermitteds,pingTimeout,replyTimeout)")
)
fun BridgeOptions(
  inboundPermitted: Iterable<PermittedOptions>? = null,
  inboundPermitteds: Iterable<PermittedOptions>? = null,
  maxAddressLength: Int? = null,
  maxHandlersPerSocket: Int? = null,
  outboundPermitted: Iterable<PermittedOptions>? = null,
  outboundPermitteds: Iterable<PermittedOptions>? = null,
  pingTimeout: Long? = null,
  replyTimeout: Long? = null
) = BridgeOptions()
.apply {
  if (inboundPermitted != null) {
    this.setInboundPermitted(inboundPermitted.toList())
  }
  if (inboundPermitteds != null) {
    for (item in inboundPermitteds) {
      this.addInboundPermitted(item)
    }
  }
  if (maxAddressLength != null) {
    this.setMaxAddressLength(maxAddressLength)
  }
  if (maxHandlersPerSocket != null) {
    this.setMaxHandlersPerSocket(maxHandlersPerSocket)
  }
  if (outboundPermitted != null) {
    this.setOutboundPermitted(outboundPermitted.toList())
  }
  if (outboundPermitteds != null) {
    for (item in outboundPermitteds) {
      this.addOutboundPermitted(item)
    }
  }
  if (pingTimeout != null) {
    this.setPingTimeout(pingTimeout)
  }
  if (replyTimeout != null) {
    this.setReplyTimeout(replyTimeout)
  }
}

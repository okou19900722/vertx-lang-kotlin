package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [SockJSHandlerOptions] objects.
 *
 *  Options for configuring a SockJS handler
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SockJSHandlerOptions original]
    using Vert.x codegen.
 */
fun sockJSHandlerOptionsOf(
  disabledTransports: Iterable<String>? = null,
  heartbeatInterval: Long? = null,
  insertJSESSIONID: Boolean? = null,
  libraryURL: String? = null,
  maxBytesStreaming: Int? = null,
  sessionTimeout: Long? = null
) = SockJSHandlerOptions()
.apply {
  if (disabledTransports != null) {
    for (item in disabledTransports) {
      this.addDisabledTransport(item)
    }
  }
  if (heartbeatInterval != null) {
    this.setHeartbeatInterval(heartbeatInterval)
  }
  if (insertJSESSIONID != null) {
    this.setInsertJSESSIONID(insertJSESSIONID)
  }
  if (libraryURL != null) {
    this.setLibraryURL(libraryURL)
  }
  if (maxBytesStreaming != null) {
    this.setMaxBytesStreaming(maxBytesStreaming)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
}

/**
 * A function providing a DSL for building [SockJSHandlerOptions] objects.
 *
 *  Options for configuring a SockJS handler
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SockJSHandlerOptions original]
    using Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("sockJSHandlerOptionsOf(disabledTransports,heartbeatInterval,insertJSESSIONID,libraryURL,maxBytesStreaming,sessionTimeout)")
)
fun SockJSHandlerOptions(
  disabledTransports: Iterable<String>? = null,
  heartbeatInterval: Long? = null,
  insertJSESSIONID: Boolean? = null,
  libraryURL: String? = null,
  maxBytesStreaming: Int? = null,
  sessionTimeout: Long? = null
) = SockJSHandlerOptions()
.apply {
  if (disabledTransports != null) {
    for (item in disabledTransports) {
      this.addDisabledTransport(item)
    }
  }
  if (heartbeatInterval != null) {
    this.setHeartbeatInterval(heartbeatInterval)
  }
  if (insertJSESSIONID != null) {
    this.setInsertJSESSIONID(insertJSESSIONID)
  }
  if (libraryURL != null) {
    this.setLibraryURL(libraryURL)
  }
  if (maxBytesStreaming != null) {
    this.setMaxBytesStreaming(maxBytesStreaming)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
}

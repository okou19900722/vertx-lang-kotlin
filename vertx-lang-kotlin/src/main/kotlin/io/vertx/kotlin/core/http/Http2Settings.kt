package io.vertx.kotlin.core.http

import io.vertx.core.http.Http2Settings
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [Http2Settings] objects.
 *
 *  HTTP2 settings, the settings is initialized with the default HTTP/2 values.<p>
 *
 *  The settings expose the parameters defined by the HTTP/2 specification, as well as extra
    settings for
 *  protocol extensions.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Http2Settings original] using
    Vert.x codegen.
 *
 * @param headerTableSize  Set  HTTP/2 setting.
 * @param initialWindowSize  Set the  HTTP/2 setting
 * @param maxConcurrentStreams  Set the  HTTP/2 setting
 * @param maxFrameSize  Set the  HTTP/2 setting
 * @param maxHeaderListSize  Set the  HTTP/2 setting
 * @param pushEnabled  Set the  HTTP/2 setting
 */
fun http2SettingsOf(
  headerTableSize: Long? = null,
  initialWindowSize: Int? = null,
  maxConcurrentStreams: Long? = null,
  maxFrameSize: Int? = null,
  maxHeaderListSize: Long? = null,
  pushEnabled: Boolean? = null
) = Http2Settings()
.apply {
  if (headerTableSize != null) {
    this.setHeaderTableSize(headerTableSize)
  }
  if (initialWindowSize != null) {
    this.setInitialWindowSize(initialWindowSize)
  }
  if (maxConcurrentStreams != null) {
    this.setMaxConcurrentStreams(maxConcurrentStreams)
  }
  if (maxFrameSize != null) {
    this.setMaxFrameSize(maxFrameSize)
  }
  if (maxHeaderListSize != null) {
    this.setMaxHeaderListSize(maxHeaderListSize)
  }
  if (pushEnabled != null) {
    this.setPushEnabled(pushEnabled)
  }
}

/**
 * A function providing a DSL for building [Http2Settings] objects.
 *
 *  HTTP2 settings, the settings is initialized with the default HTTP/2 values.<p>
 *
 *  The settings expose the parameters defined by the HTTP/2 specification, as well as extra
    settings for
 *  protocol extensions.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Http2Settings original] using
    Vert.x codegen.
 *
 * @param headerTableSize  Set  HTTP/2 setting.
 * @param initialWindowSize  Set the  HTTP/2 setting
 * @param maxConcurrentStreams  Set the  HTTP/2 setting
 * @param maxFrameSize  Set the  HTTP/2 setting
 * @param maxHeaderListSize  Set the  HTTP/2 setting
 * @param pushEnabled  Set the  HTTP/2 setting
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("http2SettingsOf(headerTableSize,initialWindowSize,maxConcurrentStreams,maxFrameSize,maxHeaderListSize,pushEnabled)")
)
fun Http2Settings(
  headerTableSize: Long? = null,
  initialWindowSize: Int? = null,
  maxConcurrentStreams: Long? = null,
  maxFrameSize: Int? = null,
  maxHeaderListSize: Long? = null,
  pushEnabled: Boolean? = null
) = Http2Settings()
.apply {
  if (headerTableSize != null) {
    this.setHeaderTableSize(headerTableSize)
  }
  if (initialWindowSize != null) {
    this.setInitialWindowSize(initialWindowSize)
  }
  if (maxConcurrentStreams != null) {
    this.setMaxConcurrentStreams(maxConcurrentStreams)
  }
  if (maxFrameSize != null) {
    this.setMaxFrameSize(maxFrameSize)
  }
  if (maxHeaderListSize != null) {
    this.setMaxHeaderListSize(maxHeaderListSize)
  }
  if (pushEnabled != null) {
    this.setPushEnabled(pushEnabled)
  }
}

package io.vertx.kotlin.ext.web

import io.vertx.ext.web.Http2PushMapping
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [Http2PushMapping] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Http2PushMapping original] using
    Vert.x codegen.
 */
fun http2PushMappingOf(
  extensionTarget: String? = null,
  filePath: String? = null,
  noPush: Boolean? = null
) = Http2PushMapping()
.apply {
  if (extensionTarget != null) {
    this.setExtensionTarget(extensionTarget)
  }
  if (filePath != null) {
    this.setFilePath(filePath)
  }
  if (noPush != null) {
    this.setNoPush(noPush)
  }
}

/**
 * A function providing a DSL for building [Http2PushMapping] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Http2PushMapping original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("http2PushMappingOf(extensionTarget,filePath,noPush)")
)
fun Http2PushMapping(
  extensionTarget: String? = null,
  filePath: String? = null,
  noPush: Boolean? = null
) = Http2PushMapping()
.apply {
  if (extensionTarget != null) {
    this.setExtensionTarget(extensionTarget)
  }
  if (filePath != null) {
    this.setFilePath(filePath)
  }
  if (noPush != null) {
    this.setNoPush(noPush)
  }
}

package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.GoAway
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [GoAway] objects.
 *
 *  A  frame.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [GoAway original] using Vert.x
    codegen.
 *
 * @param debugData  Set the additional debug data
 * @param lastStreamId  Set the last stream id.
 */
fun goAwayOf(
  debugData: Buffer? = null,
  errorCode: Long? = null,
  lastStreamId: Int? = null
) = GoAway()
.apply {
  if (debugData != null) {
    this.setDebugData(debugData)
  }
  if (errorCode != null) {
    this.setErrorCode(errorCode)
  }
  if (lastStreamId != null) {
    this.setLastStreamId(lastStreamId)
  }
}

/**
 * A function providing a DSL for building [GoAway] objects.
 *
 *  A  frame.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [GoAway original] using Vert.x
    codegen.
 *
 * @param debugData  Set the additional debug data
 * @param lastStreamId  Set the last stream id.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("goAwayOf(debugData,errorCode,lastStreamId)")
)
fun GoAway(
  debugData: Buffer? = null,
  errorCode: Long? = null,
  lastStreamId: Int? = null
) = GoAway()
.apply {
  if (debugData != null) {
    this.setDebugData(debugData)
  }
  if (errorCode != null) {
    this.setErrorCode(errorCode)
  }
  if (lastStreamId != null) {
    this.setLastStreamId(lastStreamId)
  }
}

package io.vertx.kotlin.ext.web.api

import io.vertx.core.MultiMap
import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.api.OperationResponse
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [OperationResponse] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OperationResponse original] using
    Vert.x codegen.
 */
fun operationResponseOf(
  headers: MultiMap? = null,
  payload: Buffer? = null,
  statusCode: Int? = null,
  statusMessage: String? = null
) = OperationResponse()
.apply {
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
  if (statusCode != null) {
    this.setStatusCode(statusCode)
  }
  if (statusMessage != null) {
    this.setStatusMessage(statusMessage)
  }
}

/**
 * A function providing a DSL for building [OperationResponse] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OperationResponse original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("operationResponseOf(headers,payload,statusCode,statusMessage)")
)
fun OperationResponse(
  headers: MultiMap? = null,
  payload: Buffer? = null,
  statusCode: Int? = null,
  statusMessage: String? = null
) = OperationResponse()
.apply {
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
  if (statusCode != null) {
    this.setStatusCode(statusCode)
  }
  if (statusMessage != null) {
    this.setStatusMessage(statusMessage)
  }
}

package io.vertx.kotlin.ext.web.api

import io.vertx.core.MultiMap
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.OperationRequest
import kotlin.Deprecated

/**
 * A function providing a DSL for building [OperationRequest] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OperationRequest original] using
    Vert.x codegen.
 *
 * @param extra  Get extra payload
 * @param headers  Get request headers
 * @param params  Get request parsedParameters as JSON
 * @param user  Get request principal user as routingContext.user().principal(), null if no user is
    authenticated
 */
fun operationRequestOf(
  extra: JsonObject? = null,
  headers: MultiMap? = null,
  params: JsonObject? = null,
  user: JsonObject? = null
) = OperationRequest()
.apply {
  if (extra != null) {
    this.setExtra(extra)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (params != null) {
    this.setParams(params)
  }
  if (user != null) {
    this.setUser(user)
  }
}

/**
 * A function providing a DSL for building [OperationRequest] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OperationRequest original] using
    Vert.x codegen.
 *
 * @param extra  Get extra payload
 * @param headers  Get request headers
 * @param params  Get request parsedParameters as JSON
 * @param user  Get request principal user as routingContext.user().principal(), null if no user is
    authenticated
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("operationRequestOf(extra,headers,params,user)")
)
fun OperationRequest(
  extra: JsonObject? = null,
  headers: MultiMap? = null,
  params: JsonObject? = null,
  user: JsonObject? = null
) = OperationRequest()
.apply {
  if (extra != null) {
    this.setExtra(extra)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (params != null) {
    this.setParams(params)
  }
  if (user != null) {
    this.setUser(user)
  }
}

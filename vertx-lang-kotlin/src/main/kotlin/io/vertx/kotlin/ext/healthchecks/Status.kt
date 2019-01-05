package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.json.JsonObject
import io.vertx.ext.healthchecks.Status
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [Status] objects.
 *
 *  Represents the outcome of a health check procedure. Each procedure produces a
    [io.vertx.ext.healthchecks.Status] indicating either OK
 *  or KO. Optionally, it can also provide additional data.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Status original] using Vert.x
    codegen.
 *
 * @param data  Sets the metadata.
 * @param ok  Sets whether or not the current status is positive (UP) or negative (DOWN).
 * @param procedureInError  Sets whether or not the procedure attached to this status has failed
    (timeout, error...).
 */
fun statusOf(
  data: JsonObject? = null,
  ok: Boolean? = null,
  procedureInError: Boolean? = null
) = Status()
.apply {
  if (data != null) {
    this.setData(data)
  }
  if (ok != null) {
    this.setOk(ok)
  }
  if (procedureInError != null) {
    this.setProcedureInError(procedureInError)
  }
}

/**
 * A function providing a DSL for building [Status] objects.
 *
 *  Represents the outcome of a health check procedure. Each procedure produces a
    [io.vertx.ext.healthchecks.Status] indicating either OK
 *  or KO. Optionally, it can also provide additional data.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Status original] using Vert.x
    codegen.
 *
 * @param data  Sets the metadata.
 * @param ok  Sets whether or not the current status is positive (UP) or negative (DOWN).
 * @param procedureInError  Sets whether or not the procedure attached to this status has failed
    (timeout, error...).
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("statusOf(data,ok,procedureInError)")
)
fun Status(
  data: JsonObject? = null,
  ok: Boolean? = null,
  procedureInError: Boolean? = null
) = Status()
.apply {
  if (data != null) {
    this.setData(data)
  }
  if (ok != null) {
    this.setOk(ok)
  }
  if (procedureInError != null) {
    this.setProcedureInError(procedureInError)
  }
}

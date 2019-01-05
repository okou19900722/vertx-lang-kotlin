package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.UpdateResult
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [UpdateResult] objects.
 *
 *  Represents the result of an update/insert/delete operation on the database.
 *  <p>
 *  The number of rows updated is available with [io.vertx.ext.sql.UpdateResult] and any generated
 *  keys are available with [io.vertx.ext.sql.UpdateResult].
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [UpdateResult original] using
    Vert.x codegen.
 *
 * @param keys  Get any generated keys
 * @param updated  Get the number of rows updated
 */
fun updateResultOf(keys: JsonArray? = null, updated: Int? = null) = UpdateResult()
.apply {
  if (keys != null) {
    this.setKeys(keys)
  }
  if (updated != null) {
    this.setUpdated(updated)
  }
}

/**
 * A function providing a DSL for building [UpdateResult] objects.
 *
 *  Represents the result of an update/insert/delete operation on the database.
 *  <p>
 *  The number of rows updated is available with [io.vertx.ext.sql.UpdateResult] and any generated
 *  keys are available with [io.vertx.ext.sql.UpdateResult].
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [UpdateResult original] using
    Vert.x codegen.
 *
 * @param keys  Get any generated keys
 * @param updated  Get the number of rows updated
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("updateResultOf(keys,updated)")
)
fun UpdateResult(keys: JsonArray? = null, updated: Int? = null) = UpdateResult()
.apply {
  if (keys != null) {
    this.setKeys(keys)
  }
  if (updated != null) {
    this.setUpdated(updated)
  }
}

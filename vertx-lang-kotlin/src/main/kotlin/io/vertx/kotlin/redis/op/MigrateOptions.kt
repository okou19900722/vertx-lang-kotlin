package io.vertx.kotlin.redis.op

import io.vertx.redis.op.MigrateOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MigrateOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MigrateOptions original] using
    Vert.x codegen.
 */
fun migrateOptionsOf(copy: Boolean? = null, replace: Boolean? = null) = MigrateOptions()
.apply {
  if (copy != null) {
    this.setCopy(copy)
  }
  if (replace != null) {
    this.setReplace(replace)
  }
}

/**
 * A function providing a DSL for building [MigrateOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MigrateOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("migrateOptionsOf(copy,replace)")
)
fun MigrateOptions(copy: Boolean? = null, replace: Boolean? = null) = MigrateOptions()
.apply {
  if (copy != null) {
    this.setCopy(copy)
  }
  if (replace != null) {
    this.setReplace(replace)
  }
}

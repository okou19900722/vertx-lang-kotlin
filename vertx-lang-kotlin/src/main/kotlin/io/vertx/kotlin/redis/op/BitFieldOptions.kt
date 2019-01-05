package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldGetCommand
import io.vertx.redis.op.BitFieldIncrbyCommand
import io.vertx.redis.op.BitFieldOptions
import io.vertx.redis.op.BitFieldSetCommand
import kotlin.Deprecated

/**
 * A function providing a DSL for building [BitFieldOptions] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BitFieldOptions original] using
    Vert.x codegen.
 */
fun bitFieldOptionsOf(
  get: BitFieldGetCommand? = null,
  incrby: BitFieldIncrbyCommand? = null,
  set: BitFieldSetCommand? = null
) = BitFieldOptions()
.apply {
  if (get != null) {
    this.setGet(get)
  }
  if (incrby != null) {
    this.setIncrby(incrby)
  }
  if (set != null) {
    this.setSet(set)
  }
}

/**
 * A function providing a DSL for building [BitFieldOptions] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BitFieldOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("bitFieldOptionsOf(get,incrby,set)")
)
fun BitFieldOptions(
  get: BitFieldGetCommand? = null,
  incrby: BitFieldIncrbyCommand? = null,
  set: BitFieldSetCommand? = null
) = BitFieldOptions()
.apply {
  if (get != null) {
    this.setGet(get)
  }
  if (incrby != null) {
    this.setIncrby(incrby)
  }
  if (set != null) {
    this.setSet(set)
  }
}

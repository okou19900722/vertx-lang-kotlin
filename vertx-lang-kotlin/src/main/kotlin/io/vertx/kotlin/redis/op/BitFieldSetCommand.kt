package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldSetCommand
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [BitFieldSetCommand] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BitFieldSetCommand original] using
    Vert.x codegen.
 */
fun bitFieldSetCommandOf(
  offset: Long? = null,
  type: String? = null,
  value: Long? = null
) = BitFieldSetCommand()
.apply {
  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

/**
 * A function providing a DSL for building [BitFieldSetCommand] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BitFieldSetCommand original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("bitFieldSetCommandOf(offset,type,value)")
)
fun BitFieldSetCommand(
  offset: Long? = null,
  type: String? = null,
  value: Long? = null
) = BitFieldSetCommand()
.apply {
  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

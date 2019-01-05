package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldGetCommand
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [BitFieldGetCommand] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BitFieldGetCommand original] using
    Vert.x codegen.
 */
fun bitFieldGetCommandOf(offset: Long? = null, type: String? = null) = BitFieldGetCommand()
.apply {
  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [BitFieldGetCommand] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BitFieldGetCommand original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("bitFieldGetCommandOf(offset,type)")
)
fun BitFieldGetCommand(offset: Long? = null, type: String? = null) = BitFieldGetCommand()
.apply {
  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
}

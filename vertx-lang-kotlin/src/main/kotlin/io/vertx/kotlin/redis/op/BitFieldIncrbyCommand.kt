package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldIncrbyCommand
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [BitFieldIncrbyCommand] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BitFieldIncrbyCommand original]
    using Vert.x codegen.
 */
fun bitFieldIncrbyCommandOf(
  increment: Long? = null,
  offset: Long? = null,
  type: String? = null
) = BitFieldIncrbyCommand()
.apply {
  if (increment != null) {
    this.setIncrement(increment)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [BitFieldIncrbyCommand] objects.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BitFieldIncrbyCommand original]
    using Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("bitFieldIncrbyCommandOf(increment,offset,type)")
)
fun BitFieldIncrbyCommand(
  increment: Long? = null,
  offset: Long? = null,
  type: String? = null
) = BitFieldIncrbyCommand()
.apply {
  if (increment != null) {
    this.setIncrement(increment)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
}

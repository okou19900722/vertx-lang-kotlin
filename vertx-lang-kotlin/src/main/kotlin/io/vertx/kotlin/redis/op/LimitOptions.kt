package io.vertx.kotlin.redis.op

import io.vertx.redis.op.LimitOptions
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [LimitOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [LimitOptions original] using
    Vert.x codegen.
 */
fun limitOptionsOf(count: Long? = null, offset: Long? = null) = LimitOptions()
.apply {
  if (count != null) {
    this.setCount(count)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

/**
 * A function providing a DSL for building [LimitOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [LimitOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("limitOptionsOf(count,offset)")
)
fun LimitOptions(count: Long? = null, offset: Long? = null) = LimitOptions()
.apply {
  if (count != null) {
    this.setCount(count)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

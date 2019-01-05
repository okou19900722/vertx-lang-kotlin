package io.vertx.kotlin.redis.op

import io.vertx.redis.op.RangeLimitOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [RangeLimitOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [RangeLimitOptions original] using
    Vert.x codegen.
 */
fun rangeLimitOptionsOf(
  count: Long? = null,
  offset: Long? = null,
  withscores: Boolean? = null
) = RangeLimitOptions()
.apply {
  if (count != null) {
    this.setCount(count)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (withscores != null) {
    this.setWithscores(withscores)
  }
}

/**
 * A function providing a DSL for building [RangeLimitOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [RangeLimitOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("rangeLimitOptionsOf(count,offset,withscores)")
)
fun RangeLimitOptions(
  count: Long? = null,
  offset: Long? = null,
  withscores: Boolean? = null
) = RangeLimitOptions()
.apply {
  if (count != null) {
    this.setCount(count)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (withscores != null) {
    this.setWithscores(withscores)
  }
}

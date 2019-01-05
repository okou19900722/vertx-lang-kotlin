package io.vertx.kotlin.redis.op

import io.vertx.redis.op.SetOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [SetOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SetOptions original] using Vert.x
    codegen.
 */
fun setOptionsOf(
  ex: Long? = null,
  nx: Boolean? = null,
  px: Long? = null,
  xx: Boolean? = null
) = SetOptions()
.apply {
  if (ex != null) {
    this.setEX(ex)
  }
  if (nx != null) {
    this.setNX(nx)
  }
  if (px != null) {
    this.setPX(px)
  }
  if (xx != null) {
    this.setXX(xx)
  }
}

/**
 * A function providing a DSL for building [SetOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SetOptions original] using Vert.x
    codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("setOptionsOf(ex,nx,px,xx)")
)
fun SetOptions(
  ex: Long? = null,
  nx: Boolean? = null,
  px: Long? = null,
  xx: Boolean? = null
) = SetOptions()
.apply {
  if (ex != null) {
    this.setEX(ex)
  }
  if (nx != null) {
    this.setNX(nx)
  }
  if (px != null) {
    this.setPX(px)
  }
  if (xx != null) {
    this.setXX(xx)
  }
}

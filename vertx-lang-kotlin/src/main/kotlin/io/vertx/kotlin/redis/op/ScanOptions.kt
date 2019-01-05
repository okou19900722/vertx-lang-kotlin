package io.vertx.kotlin.redis.op

import io.vertx.redis.op.ScanOptions
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [ScanOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ScanOptions original] using Vert.x
    codegen.
 */
fun scanOptionsOf(count: Int? = null, match: String? = null) = ScanOptions()
.apply {
  if (count != null) {
    this.setCount(count)
  }
  if (match != null) {
    this.setMatch(match)
  }
}

/**
 * A function providing a DSL for building [ScanOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ScanOptions original] using Vert.x
    codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("scanOptionsOf(count,match)")
)
fun ScanOptions(count: Int? = null, match: String? = null) = ScanOptions()
.apply {
  if (count != null) {
    this.setCount(count)
  }
  if (match != null) {
    this.setMatch(match)
  }
}

package io.vertx.kotlin.redis.op

import io.vertx.redis.op.SortOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [SortOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SortOptions original] using Vert.x
    codegen.
 */
fun sortOptionsOf(
  alpha: Boolean? = null,
  by: String? = null,
  descending: Boolean? = null,
  gets: Iterable<String>? = null,
  store: String? = null
) = SortOptions()
.apply {
  if (alpha != null) {
    this.setAlpha(alpha)
  }
  if (by != null) {
    this.setBy(by)
  }
  if (descending != null) {
    this.setDescending(descending)
  }
  if (gets != null) {
    for (item in gets) {
      this.addGet(item)
    }
  }
  if (store != null) {
    this.setStore(store)
  }
}

/**
 * A function providing a DSL for building [SortOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SortOptions original] using Vert.x
    codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("sortOptionsOf(alpha,by,descending,gets,store)")
)
fun SortOptions(
  alpha: Boolean? = null,
  by: String? = null,
  descending: Boolean? = null,
  gets: Iterable<String>? = null,
  store: String? = null
) = SortOptions()
.apply {
  if (alpha != null) {
    this.setAlpha(alpha)
  }
  if (by != null) {
    this.setBy(by)
  }
  if (descending != null) {
    this.setDescending(descending)
  }
  if (gets != null) {
    for (item in gets) {
      this.addGet(item)
    }
  }
  if (store != null) {
    this.setStore(store)
  }
}

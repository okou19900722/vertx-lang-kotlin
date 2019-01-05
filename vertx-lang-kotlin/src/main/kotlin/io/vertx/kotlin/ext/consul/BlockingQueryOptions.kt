package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.BlockingQueryOptions
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [BlockingQueryOptions] objects.
 *
 *  Options used to perform blocking query that used to wait for a potential change using long
    polling.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BlockingQueryOptions original]
    using Vert.x codegen.
 *
 * @param index  Set index indicating that the client wishes to wait for any changes subsequent to
    that index.
 * @param wait  Specifying a maximum duration for the blocking request. This is limited to 10
    minutes. If not set, the wait time defaults to 5 minutes. This value can be specified in the
    form of "10s" or "5m" (i.e., 10 seconds or 5 minutes, respectively).
 */
fun blockingQueryOptionsOf(index: Long? = null, wait: String? = null) = BlockingQueryOptions()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (wait != null) {
    this.setWait(wait)
  }
}

/**
 * A function providing a DSL for building [BlockingQueryOptions] objects.
 *
 *  Options used to perform blocking query that used to wait for a potential change using long
    polling.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [BlockingQueryOptions original]
    using Vert.x codegen.
 *
 * @param index  Set index indicating that the client wishes to wait for any changes subsequent to
    that index.
 * @param wait  Specifying a maximum duration for the blocking request. This is limited to 10
    minutes. If not set, the wait time defaults to 5 minutes. This value can be specified in the
    form of "10s" or "5m" (i.e., 10 seconds or 5 minutes, respectively).
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("blockingQueryOptionsOf(index,wait)")
)
fun BlockingQueryOptions(index: Long? = null, wait: String? = null) = BlockingQueryOptions()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (wait != null) {
    this.setWait(wait)
  }
}

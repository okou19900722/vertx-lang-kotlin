package io.vertx.kotlin.redis.op

import io.vertx.redis.op.KillFilter
import io.vertx.redis.op.KillFilter.Type
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [KillFilter] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KillFilter original] using Vert.x
    codegen.
 *
 * @param addr  Set ADDR filter
 * @param id  Set ID filter
 * @param skipme  Set SKIPME filter
 * @param type  Set TYPE filter
 */
fun killFilterOf(
  addr: String? = null,
  id: String? = null,
  skipme: Boolean? = null,
  type: Type? = null
) = KillFilter()
.apply {
  if (addr != null) {
    this.setAddr(addr)
  }
  if (id != null) {
    this.setId(id)
  }
  if (skipme != null) {
    this.setSkipme(skipme)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [KillFilter] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KillFilter original] using Vert.x
    codegen.
 *
 * @param addr  Set ADDR filter
 * @param id  Set ID filter
 * @param skipme  Set SKIPME filter
 * @param type  Set TYPE filter
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("killFilterOf(addr,id,skipme,type)")
)
fun KillFilter(
  addr: String? = null,
  id: String? = null,
  skipme: Boolean? = null,
  type: Type? = null
) = KillFilter()
.apply {
  if (addr != null) {
    this.setAddr(addr)
  }
  if (id != null) {
    this.setId(id)
  }
  if (skipme != null) {
    this.setSkipme(skipme)
  }
  if (type != null) {
    this.setType(type)
  }
}

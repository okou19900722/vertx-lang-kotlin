package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Session
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [Session] objects.
 *
 *  Holds properties of Consul sessions
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Session original] using Vert.x
    codegen.
 *
 * @param checks  Set the list of associated health checks
 * @param createIndex  Set the create index of session
 * @param id  Set the ID of node
 * @param index  Set Consul index
 * @param lockDelay  Set the Lock delay of session
 * @param node  Set the ID of node
 */
fun sessionOf(
  checks: Iterable<String>? = null,
  createIndex: Long? = null,
  id: String? = null,
  index: Long? = null,
  lockDelay: Long? = null,
  node: String? = null
) = Session()
.apply {
  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (id != null) {
    this.setId(id)
  }
  if (index != null) {
    this.setIndex(index)
  }
  if (lockDelay != null) {
    this.setLockDelay(lockDelay)
  }
  if (node != null) {
    this.setNode(node)
  }
}

/**
 * A function providing a DSL for building [Session] objects.
 *
 *  Holds properties of Consul sessions
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Session original] using Vert.x
    codegen.
 *
 * @param checks  Set the list of associated health checks
 * @param createIndex  Set the create index of session
 * @param id  Set the ID of node
 * @param index  Set Consul index
 * @param lockDelay  Set the Lock delay of session
 * @param node  Set the ID of node
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("sessionOf(checks,createIndex,id,index,lockDelay,node)")
)
fun Session(
  checks: Iterable<String>? = null,
  createIndex: Long? = null,
  id: String? = null,
  index: Long? = null,
  lockDelay: Long? = null,
  node: String? = null
) = Session()
.apply {
  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (id != null) {
    this.setId(id)
  }
  if (index != null) {
    this.setIndex(index)
  }
  if (lockDelay != null) {
    this.setLockDelay(lockDelay)
  }
  if (node != null) {
    this.setNode(node)
  }
}

package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Session
import io.vertx.ext.consul.SessionList
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [SessionList] objects.
 *
 *  Holds result of sessions query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SessionList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of sessions
 * @param list  Set list of sessions
 */
fun sessionListOf(index: Long? = null, list: Iterable<Session>? = null) = SessionList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [SessionList] objects.
 *
 *  Holds result of sessions query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SessionList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of sessions
 * @param list  Set list of sessions
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("sessionListOf(index,list)")
)
fun SessionList(index: Long? = null, list: Iterable<Session>? = null) = SessionList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

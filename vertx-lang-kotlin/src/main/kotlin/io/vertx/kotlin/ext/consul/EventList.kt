package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Event
import io.vertx.ext.consul.EventList
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [EventList] objects.
 *
 *  Holds result of events query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [EventList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested events
 * @param list  Set list of events
 */
fun eventListOf(index: Long? = null, list: Iterable<Event>? = null) = EventList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [EventList] objects.
 *
 *  Holds result of events query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [EventList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested events
 * @param list  Set list of events
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("eventListOf(index,list)")
)
fun EventList(index: Long? = null, list: Iterable<Event>? = null) = EventList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

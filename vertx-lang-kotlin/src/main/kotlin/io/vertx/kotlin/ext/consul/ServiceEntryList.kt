package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceEntry
import io.vertx.ext.consul.ServiceEntryList
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [ServiceEntryList] objects.
 *
 *  Holds list of services, nodes and related checks
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceEntryList original] using
    Vert.x codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of services
 * @param list  Set list of services
 */
fun serviceEntryListOf(index: Long? = null, list: Iterable<ServiceEntry>? = null) =
    ServiceEntryList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [ServiceEntryList] objects.
 *
 *  Holds list of services, nodes and related checks
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceEntryList original] using
    Vert.x codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of services
 * @param list  Set list of services
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("serviceEntryListOf(index,list)")
)
fun ServiceEntryList(index: Long? = null, list: Iterable<ServiceEntry>? = null) = ServiceEntryList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

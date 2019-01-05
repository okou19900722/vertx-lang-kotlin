package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Service
import io.vertx.ext.consul.ServiceList
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [ServiceList] objects.
 *
 *  Holds result of services query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of services
 * @param list  Set list of services
 */
fun serviceListOf(index: Long? = null, list: Iterable<Service>? = null) = ServiceList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [ServiceList] objects.
 *
 *  Holds result of services query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of services
 * @param list  Set list of services
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("serviceListOf(index,list)")
)
fun ServiceList(index: Long? = null, list: Iterable<Service>? = null) = ServiceList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

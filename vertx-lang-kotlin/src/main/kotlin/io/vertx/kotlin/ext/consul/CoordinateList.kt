package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Coordinate
import io.vertx.ext.consul.CoordinateList
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [CoordinateList] objects.
 *
 *  Holds result of network coordinates query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CoordinateList original] using
    Vert.x codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested coordinates
 * @param list  Set list of coordinates
 */
fun coordinateListOf(index: Long? = null, list: Iterable<Coordinate>? = null) = CoordinateList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [CoordinateList] objects.
 *
 *  Holds result of network coordinates query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CoordinateList original] using
    Vert.x codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested coordinates
 * @param list  Set list of coordinates
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("coordinateListOf(index,list)")
)
fun CoordinateList(index: Long? = null, list: Iterable<Coordinate>? = null) = CoordinateList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

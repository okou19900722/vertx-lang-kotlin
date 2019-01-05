package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Check
import io.vertx.ext.consul.CheckList
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [CheckList] objects.
 *
 *  Holds result of checks query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CheckList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of checks
 * @param list  Set list of checks
 */
fun checkListOf(index: Long? = null, list: Iterable<Check>? = null) = CheckList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [CheckList] objects.
 *
 *  Holds result of checks query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CheckList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of checks
 * @param list  Set list of checks
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("checkListOf(index,list)")
)
fun CheckList(index: Long? = null, list: Iterable<Check>? = null) = CheckList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

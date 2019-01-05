package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Node
import io.vertx.ext.consul.NodeList
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [NodeList] objects.
 *
 *  Holds result of nodes query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [NodeList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of nodes
 * @param list  Set list of nodes
 */
fun nodeListOf(index: Long? = null, list: Iterable<Node>? = null) = NodeList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [NodeList] objects.
 *
 *  Holds result of nodes query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [NodeList original] using Vert.x
    codegen.
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the
    requested list of nodes
 * @param list  Set list of nodes
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("nodeListOf(index,list)")
)
fun NodeList(index: Long? = null, list: Iterable<Node>? = null) = NodeList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

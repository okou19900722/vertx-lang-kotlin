package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.KeyValue
import io.vertx.ext.consul.KeyValueList
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [KeyValueList] objects.
 *
 *  Holds result of key/value pairs query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KeyValueList original] using
    Vert.x codegen.
 *
 * @param index  Set Consul index
 * @param list  Set list of key/value pairs
 */
fun keyValueListOf(index: Long? = null, list: Iterable<KeyValue>? = null) = KeyValueList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [KeyValueList] objects.
 *
 *  Holds result of key/value pairs query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KeyValueList original] using
    Vert.x codegen.
 *
 * @param index  Set Consul index
 * @param list  Set list of key/value pairs
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("keyValueListOf(index,list)")
)
fun KeyValueList(index: Long? = null, list: Iterable<KeyValue>? = null) = KeyValueList()
.apply {
  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

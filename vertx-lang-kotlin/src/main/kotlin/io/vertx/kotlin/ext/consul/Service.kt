package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Service
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [Service] objects.
 *
 *  Holds properties of service and node that its containing
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Service original] using Vert.x
    codegen.
 *
 * @param address  Set service address
 * @param id  Set ID of service
 * @param meta  Specifies arbitrary KV metadata linked to the service instance.
 * @param name  Set service name
 * @param node  Set node name
 * @param nodeAddress  Set node address
 * @param port  Set service port
 * @param tags  Set list of service tags
 */
fun serviceOf(
  address: String? = null,
  id: String? = null,
  meta: Map<String, String>? = null,
  name: String? = null,
  node: String? = null,
  nodeAddress: String? = null,
  port: Int? = null,
  tags: Iterable<String>? = null
) = Service()
.apply {
  if (address != null) {
    this.setAddress(address)
  }
  if (id != null) {
    this.setId(id)
  }
  if (meta != null) {
    this.setMeta(meta)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (nodeAddress != null) {
    this.setNodeAddress(nodeAddress)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
}

/**
 * A function providing a DSL for building [Service] objects.
 *
 *  Holds properties of service and node that its containing
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Service original] using Vert.x
    codegen.
 *
 * @param address  Set service address
 * @param id  Set ID of service
 * @param meta  Specifies arbitrary KV metadata linked to the service instance.
 * @param name  Set service name
 * @param node  Set node name
 * @param nodeAddress  Set node address
 * @param port  Set service port
 * @param tags  Set list of service tags
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("serviceOf(address,id,meta,name,node,nodeAddress,port,tags)")
)
fun Service(
  address: String? = null,
  id: String? = null,
  meta: Map<String, String>? = null,
  name: String? = null,
  node: String? = null,
  nodeAddress: String? = null,
  port: Int? = null,
  tags: Iterable<String>? = null
) = Service()
.apply {
  if (address != null) {
    this.setAddress(address)
  }
  if (id != null) {
    this.setId(id)
  }
  if (meta != null) {
    this.setMeta(meta)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (nodeAddress != null) {
    this.setNodeAddress(nodeAddress)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
}

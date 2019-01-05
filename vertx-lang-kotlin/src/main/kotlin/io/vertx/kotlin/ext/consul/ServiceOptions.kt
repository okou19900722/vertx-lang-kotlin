package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CheckOptions
import io.vertx.ext.consul.ServiceOptions
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [ServiceOptions] objects.
 *
 *  Options used to register service.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceOptions original] using
    Vert.x codegen.
 *
 * @param address  Set service address
 * @param checkOptions  Set check options of service
 * @param id  Set the ID of session
 * @param meta  Specifies arbitrary KV metadata linked to the service instance.
 * @param name  Set service name
 * @param port  Set service port
 * @param tags  Set list of tags associated with service
 */
fun serviceOptionsOf(
  address: String? = null,
  checkOptions: CheckOptions? = null,
  id: String? = null,
  meta: Map<String, String>? = null,
  name: String? = null,
  port: Int? = null,
  tags: Iterable<String>? = null
) = ServiceOptions()
.apply {
  if (address != null) {
    this.setAddress(address)
  }
  if (checkOptions != null) {
    this.setCheckOptions(checkOptions)
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
  if (port != null) {
    this.setPort(port)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
}

/**
 * A function providing a DSL for building [ServiceOptions] objects.
 *
 *  Options used to register service.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ServiceOptions original] using
    Vert.x codegen.
 *
 * @param address  Set service address
 * @param checkOptions  Set check options of service
 * @param id  Set the ID of session
 * @param meta  Specifies arbitrary KV metadata linked to the service instance.
 * @param name  Set service name
 * @param port  Set service port
 * @param tags  Set list of tags associated with service
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("serviceOptionsOf(address,checkOptions,id,meta,name,port,tags)")
)
fun ServiceOptions(
  address: String? = null,
  checkOptions: CheckOptions? = null,
  id: String? = null,
  meta: Map<String, String>? = null,
  name: String? = null,
  port: Int? = null,
  tags: Iterable<String>? = null
) = ServiceOptions()
.apply {
  if (address != null) {
    this.setAddress(address)
  }
  if (checkOptions != null) {
    this.setCheckOptions(checkOptions)
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
  if (port != null) {
    this.setPort(port)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
}

package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Check
import io.vertx.ext.consul.CheckStatus
import kotlin.Deprecated

/**
 * A function providing a DSL for building [Check] objects.
 *
 *  Holds check properties
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Check original] using Vert.x
    codegen.
 *
 * @param id  Set the ID of check
 * @param name  Set the name of check
 * @param nodeName  Set the name of node
 * @param notes  Set the human-readable note of check
 * @param output  Set the output of check
 * @param serviceId  Set the ID of service with which this check associated
 * @param serviceName  Set the name of service with which this check associated
 * @param status  Set the status of check
 */
fun checkOf(
  id: String? = null,
  name: String? = null,
  nodeName: String? = null,
  notes: String? = null,
  output: String? = null,
  serviceId: String? = null,
  serviceName: String? = null,
  status: CheckStatus? = null
) = Check()
.apply {
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (nodeName != null) {
    this.setNodeName(nodeName)
  }
  if (notes != null) {
    this.setNotes(notes)
  }
  if (output != null) {
    this.setOutput(output)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (serviceName != null) {
    this.setServiceName(serviceName)
  }
  if (status != null) {
    this.setStatus(status)
  }
}

/**
 * A function providing a DSL for building [Check] objects.
 *
 *  Holds check properties
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Check original] using Vert.x
    codegen.
 *
 * @param id  Set the ID of check
 * @param name  Set the name of check
 * @param nodeName  Set the name of node
 * @param notes  Set the human-readable note of check
 * @param output  Set the output of check
 * @param serviceId  Set the ID of service with which this check associated
 * @param serviceName  Set the name of service with which this check associated
 * @param status  Set the status of check
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("checkOf(id,name,nodeName,notes,output,serviceId,serviceName,status)")
)
fun Check(
  id: String? = null,
  name: String? = null,
  nodeName: String? = null,
  notes: String? = null,
  output: String? = null,
  serviceId: String? = null,
  serviceName: String? = null,
  status: CheckStatus? = null
) = Check()
.apply {
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (nodeName != null) {
    this.setNodeName(nodeName)
  }
  if (notes != null) {
    this.setNotes(notes)
  }
  if (output != null) {
    this.setOutput(output)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (serviceName != null) {
    this.setServiceName(serviceName)
  }
  if (status != null) {
    this.setStatus(status)
  }
}

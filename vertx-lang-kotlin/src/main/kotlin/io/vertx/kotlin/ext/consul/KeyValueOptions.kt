package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.KeyValueOptions
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [KeyValueOptions] objects.
 *
 *  Options used to put key/value pair to Consul.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KeyValueOptions original] using
    Vert.x codegen.
 *
 * @param acquireSession  Set session ID for lock acquisition operation.
 * @param casIndex  Set the Check-And-Set index. If the index is <code>0</code>, Consul will only
    put the key if it does not already exist. If the index is non-zero, the key is only set if the
    index matches the ModifyIndex of that key.
 * @param flags  Set the flags. Flags is an value between <code>0</code> and 2<sup>64</sup>-1 that
    can be attached to each entry. Clients can choose to use this however makes sense for their
    application.
 * @param releaseSession  Set session ID for lock release operation.
 */
fun keyValueOptionsOf(
  acquireSession: String? = null,
  casIndex: Long? = null,
  flags: Long? = null,
  releaseSession: String? = null
) = KeyValueOptions()
.apply {
  if (acquireSession != null) {
    this.setAcquireSession(acquireSession)
  }
  if (casIndex != null) {
    this.setCasIndex(casIndex)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (releaseSession != null) {
    this.setReleaseSession(releaseSession)
  }
}

/**
 * A function providing a DSL for building [KeyValueOptions] objects.
 *
 *  Options used to put key/value pair to Consul.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KeyValueOptions original] using
    Vert.x codegen.
 *
 * @param acquireSession  Set session ID for lock acquisition operation.
 * @param casIndex  Set the Check-And-Set index. If the index is <code>0</code>, Consul will only
    put the key if it does not already exist. If the index is non-zero, the key is only set if the
    index matches the ModifyIndex of that key.
 * @param flags  Set the flags. Flags is an value between <code>0</code> and 2<sup>64</sup>-1 that
    can be attached to each entry. Clients can choose to use this however makes sense for their
    application.
 * @param releaseSession  Set session ID for lock release operation.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("keyValueOptionsOf(acquireSession,casIndex,flags,releaseSession)")
)
fun KeyValueOptions(
  acquireSession: String? = null,
  casIndex: Long? = null,
  flags: Long? = null,
  releaseSession: String? = null
) = KeyValueOptions()
.apply {
  if (acquireSession != null) {
    this.setAcquireSession(acquireSession)
  }
  if (casIndex != null) {
    this.setCasIndex(casIndex)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (releaseSession != null) {
    this.setReleaseSession(releaseSession)
  }
}

package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.KeyValue
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [KeyValue] objects.
 *
 *  Represents key/value pair stored in Consul
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KeyValue original] using Vert.x
    codegen.
 *
 * @param createIndex  Set the internal index value that represents when the entry was created.
 * @param flags  Set the flags attached to this entry. Clients can choose to use this however makes
    sense for their application.
 * @param key  Set the key
 * @param lockIndex  Set the number of times this key has successfully been acquired in a lock.
 * @param modifyIndex  Set the last index that modified this key.
 * @param session  Set the session that owns the lock
 * @param value  Set the value
 */
fun keyValueOf(
  createIndex: Long? = null,
  flags: Long? = null,
  key: String? = null,
  lockIndex: Long? = null,
  modifyIndex: Long? = null,
  session: String? = null,
  value: String? = null
) = KeyValue()
.apply {
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (key != null) {
    this.setKey(key)
  }
  if (lockIndex != null) {
    this.setLockIndex(lockIndex)
  }
  if (modifyIndex != null) {
    this.setModifyIndex(modifyIndex)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (value != null) {
    this.setValue(value)
  }
}

/**
 * A function providing a DSL for building [KeyValue] objects.
 *
 *  Represents key/value pair stored in Consul
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KeyValue original] using Vert.x
    codegen.
 *
 * @param createIndex  Set the internal index value that represents when the entry was created.
 * @param flags  Set the flags attached to this entry. Clients can choose to use this however makes
    sense for their application.
 * @param key  Set the key
 * @param lockIndex  Set the number of times this key has successfully been acquired in a lock.
 * @param modifyIndex  Set the last index that modified this key.
 * @param session  Set the session that owns the lock
 * @param value  Set the value
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("keyValueOf(createIndex,flags,key,lockIndex,modifyIndex,session,value)")
)
fun KeyValue(
  createIndex: Long? = null,
  flags: Long? = null,
  key: String? = null,
  lockIndex: Long? = null,
  modifyIndex: Long? = null,
  session: String? = null,
  value: String? = null
) = KeyValue()
.apply {
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (key != null) {
    this.setKey(key)
  }
  if (lockIndex != null) {
    this.setLockIndex(lockIndex)
  }
  if (modifyIndex != null) {
    this.setModifyIndex(modifyIndex)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (value != null) {
    this.setValue(value)
  }
}

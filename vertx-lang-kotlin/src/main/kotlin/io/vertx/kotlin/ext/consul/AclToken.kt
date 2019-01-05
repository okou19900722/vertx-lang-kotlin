package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.AclToken
import io.vertx.ext.consul.AclTokenType
import kotlin.Deprecated

/**
 * A function providing a DSL for building [AclToken] objects.
 *
 *  Holds properties of Acl token
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [AclToken original] using Vert.x
    codegen.
 *
 * @param id  Set ID of token
 * @param name  Set name of token
 * @param rules  Set rules for token
 * @param type  Set type of token
 */
fun aclTokenOf(
  id: String? = null,
  name: String? = null,
  rules: String? = null,
  type: AclTokenType? = null
) = AclToken()
.apply {
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (rules != null) {
    this.setRules(rules)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [AclToken] objects.
 *
 *  Holds properties of Acl token
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [AclToken original] using Vert.x
    codegen.
 *
 * @param id  Set ID of token
 * @param name  Set name of token
 * @param rules  Set rules for token
 * @param type  Set type of token
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("aclTokenOf(id,name,rules,type)")
)
fun AclToken(
  id: String? = null,
  name: String? = null,
  rules: String? = null,
  type: AclTokenType? = null
) = AclToken()
.apply {
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (rules != null) {
    this.setRules(rules)
  }
  if (type != null) {
    this.setType(type)
  }
}

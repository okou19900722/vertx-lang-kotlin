package io.vertx.kotlin.ext.auth.shiro

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.shiro.ShiroAuthOptions
import io.vertx.ext.auth.shiro.ShiroAuthRealmType
import kotlin.Deprecated

/**
 * A function providing a DSL for building [ShiroAuthOptions] objects.
 *
 *  Shiro auth configuration options, see Vert.x Auth Shiro component and/or Apache Shiro project.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ShiroAuthOptions original] using
    Vert.x codegen.
 *
 * @param config  Set the Shiro auth config.
 * @param type  Set the Shiro auth options type.
 */
fun shiroAuthOptionsOf(config: JsonObject? = null, type: ShiroAuthRealmType? = null) =
    ShiroAuthOptions()
.apply {
  if (config != null) {
    this.setConfig(config)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [ShiroAuthOptions] objects.
 *
 *  Shiro auth configuration options, see Vert.x Auth Shiro component and/or Apache Shiro project.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ShiroAuthOptions original] using
    Vert.x codegen.
 *
 * @param config  Set the Shiro auth config.
 * @param type  Set the Shiro auth options type.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("shiroAuthOptionsOf(config,type)")
)
fun ShiroAuthOptions(config: JsonObject? = null, type: ShiroAuthRealmType? = null) =
    ShiroAuthOptions()
.apply {
  if (config != null) {
    this.setConfig(config)
  }
  if (type != null) {
    this.setType(type)
  }
}

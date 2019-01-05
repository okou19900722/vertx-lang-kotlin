package io.vertx.kotlin.ext.auth.jwt

import io.vertx.ext.auth.jwt.JWTKeyStoreOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [JWTKeyStoreOptions] objects.
 *
 *  Options describing how an JWT KeyStore should behave.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [JWTKeyStoreOptions original] using
    Vert.x codegen.
 */
fun jwtKeyStoreOptionsOf(
  password: String? = null,
  path: String? = null,
  type: String? = null
) = JWTKeyStoreOptions()
.apply {
  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [JWTKeyStoreOptions] objects.
 *
 *  Options describing how an JWT KeyStore should behave.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [JWTKeyStoreOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("jwtKeyStoreOptionsOf(password,path,type)")
)
fun JWTKeyStoreOptions(
  password: String? = null,
  path: String? = null,
  type: String? = null
) = JWTKeyStoreOptions()
.apply {
  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (type != null) {
    this.setType(type)
  }
}

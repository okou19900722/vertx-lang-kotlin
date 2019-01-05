package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.KeyStoreOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [KeyStoreOptions] objects.
 *
 *  Options describing how an JWT KeyStore should behave.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KeyStoreOptions original] using
    Vert.x codegen.
 */
fun keyStoreOptionsOf(
  password: String? = null,
  path: String? = null,
  type: String? = null
) = KeyStoreOptions()
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
 * A function providing a DSL for building [KeyStoreOptions] objects.
 *
 *  Options describing how an JWT KeyStore should behave.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [KeyStoreOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("keyStoreOptionsOf(password,path,type)")
)
fun KeyStoreOptions(
  password: String? = null,
  path: String? = null,
  type: String? = null
) = KeyStoreOptions()
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

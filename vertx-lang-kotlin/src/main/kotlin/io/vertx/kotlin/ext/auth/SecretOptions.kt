package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.SecretOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [SecretOptions] objects.
 *
 *  Options describing a secret.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SecretOptions original] using
    Vert.x codegen.
 */
fun secretOptionsOf(secret: String? = null, type: String? = null) = SecretOptions()
.apply {
  if (secret != null) {
    this.setSecret(secret)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [SecretOptions] objects.
 *
 *  Options describing a secret.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SecretOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("secretOptionsOf(secret,type)")
)
fun SecretOptions(secret: String? = null, type: String? = null) = SecretOptions()
.apply {
  if (secret != null) {
    this.setSecret(secret)
  }
  if (type != null) {
    this.setType(type)
  }
}

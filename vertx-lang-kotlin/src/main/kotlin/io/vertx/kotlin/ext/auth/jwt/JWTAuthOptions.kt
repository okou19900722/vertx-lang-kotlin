package io.vertx.kotlin.ext.auth.jwt

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.KeyStoreOptions
import io.vertx.ext.auth.PubSecKeyOptions
import io.vertx.ext.auth.SecretOptions
import io.vertx.ext.auth.jwt.JWTAuthOptions
import io.vertx.ext.jwt.JWTOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [JWTAuthOptions] objects.
 *
 *  Options describing how an JWT Auth should behave.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [JWTAuthOptions original] using
    Vert.x codegen.
 */
fun jwtAuthOptionsOf(
  jwks: Iterable<JsonObject>? = null,
  jwtOptions: JWTOptions? = null,
  keyStore: KeyStoreOptions? = null,
  permissionsClaimKey: String? = null,
  pubSecKeys: Iterable<PubSecKeyOptions>? = null,
  secrets: Iterable<SecretOptions>? = null
) = JWTAuthOptions()
.apply {
  if (jwks != null) {
    this.setJwks(jwks.toList())
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (keyStore != null) {
    this.setKeyStore(keyStore)
  }
  if (permissionsClaimKey != null) {
    this.setPermissionsClaimKey(permissionsClaimKey)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
  if (secrets != null) {
    this.setSecrets(secrets.toList())
  }
}

/**
 * A function providing a DSL for building [JWTAuthOptions] objects.
 *
 *  Options describing how an JWT Auth should behave.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [JWTAuthOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("jwtAuthOptionsOf(jwks,jwtOptions,keyStore,permissionsClaimKey,pubSecKeys,secrets)")
)
fun JWTAuthOptions(
  jwks: Iterable<JsonObject>? = null,
  jwtOptions: JWTOptions? = null,
  keyStore: KeyStoreOptions? = null,
  permissionsClaimKey: String? = null,
  pubSecKeys: Iterable<PubSecKeyOptions>? = null,
  secrets: Iterable<SecretOptions>? = null
) = JWTAuthOptions()
.apply {
  if (jwks != null) {
    this.setJwks(jwks.toList())
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (keyStore != null) {
    this.setKeyStore(keyStore)
  }
  if (permissionsClaimKey != null) {
    this.setPermissionsClaimKey(permissionsClaimKey)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
  if (secrets != null) {
    this.setSecrets(secrets.toList())
  }
}

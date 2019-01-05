package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.PubSecKeyOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [PubSecKeyOptions] objects.
 *
 *  Options describing how a Cryptographic Key.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PubSecKeyOptions original] using
    Vert.x codegen.
 */
fun pubSecKeyOptionsOf(
  algorithm: String? = null,
  certificate: Boolean? = null,
  publicKey: String? = null,
  secretKey: String? = null,
  symmetric: Boolean? = null
) = PubSecKeyOptions()
.apply {
  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (certificate != null) {
    this.setCertificate(certificate)
  }
  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (secretKey != null) {
    this.setSecretKey(secretKey)
  }
  if (symmetric != null) {
    this.setSymmetric(symmetric)
  }
}

/**
 * A function providing a DSL for building [PubSecKeyOptions] objects.
 *
 *  Options describing how a Cryptographic Key.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PubSecKeyOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("pubSecKeyOptionsOf(algorithm,certificate,publicKey,secretKey,symmetric)")
)
fun PubSecKeyOptions(
  algorithm: String? = null,
  certificate: Boolean? = null,
  publicKey: String? = null,
  secretKey: String? = null,
  symmetric: Boolean? = null
) = PubSecKeyOptions()
.apply {
  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (certificate != null) {
    this.setCertificate(certificate)
  }
  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (secretKey != null) {
    this.setSecretKey(secretKey)
  }
  if (symmetric != null) {
    this.setSymmetric(symmetric)
  }
}

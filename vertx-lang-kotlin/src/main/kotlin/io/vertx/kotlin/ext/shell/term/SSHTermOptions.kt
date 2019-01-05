package io.vertx.kotlin.ext.shell.term

import io.vertx.core.net.JksOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PfxOptions
import io.vertx.ext.shell.term.SSHTermOptions
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [SSHTermOptions] objects.
 *
 *  The SSH term configuration options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SSHTermOptions original] using
    Vert.x codegen.
 *
 * @param defaultCharset  Set the default charset to use when the client does not specifies one.
 * @param host  Set the host
 * @param intputrc  The path of the <i>inputrc</i> config.
 * @param keyPairOptions  Set the key pair options in jks format, aka Java keystore.
 * @param pemKeyPairOptions  Set the key pair store options in pem format.
 * @param pfxKeyPairOptions  Set the key pair options in pfx format.
 * @param port  Set the port
 */
fun sshTermOptionsOf(
  defaultCharset: String? = null,
  host: String? = null,
  intputrc: String? = null,
  keyPairOptions: JksOptions? = null,
  pemKeyPairOptions: PemKeyCertOptions? = null,
  pfxKeyPairOptions: PfxOptions? = null,
  port: Int? = null
) = SSHTermOptions()
.apply {
  if (defaultCharset != null) {
    this.setDefaultCharset(defaultCharset)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (intputrc != null) {
    this.setIntputrc(intputrc)
  }
  if (keyPairOptions != null) {
    this.setKeyPairOptions(keyPairOptions)
  }
  if (pemKeyPairOptions != null) {
    this.setPemKeyPairOptions(pemKeyPairOptions)
  }
  if (pfxKeyPairOptions != null) {
    this.setPfxKeyPairOptions(pfxKeyPairOptions)
  }
  if (port != null) {
    this.setPort(port)
  }
}

/**
 * A function providing a DSL for building [SSHTermOptions] objects.
 *
 *  The SSH term configuration options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [SSHTermOptions original] using
    Vert.x codegen.
 *
 * @param defaultCharset  Set the default charset to use when the client does not specifies one.
 * @param host  Set the host
 * @param intputrc  The path of the <i>inputrc</i> config.
 * @param keyPairOptions  Set the key pair options in jks format, aka Java keystore.
 * @param pemKeyPairOptions  Set the key pair store options in pem format.
 * @param pfxKeyPairOptions  Set the key pair options in pfx format.
 * @param port  Set the port
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("sshTermOptionsOf(authOptions,defaultCharset,host,intputrc,keyPairOptions,pemKeyPairOptions,pfxKeyPairOptions,port)")
)
fun SSHTermOptions(
  defaultCharset: String? = null,
  host: String? = null,
  intputrc: String? = null,
  keyPairOptions: JksOptions? = null,
  pemKeyPairOptions: PemKeyCertOptions? = null,
  pfxKeyPairOptions: PfxOptions? = null,
  port: Int? = null
) = SSHTermOptions()
.apply {
  if (defaultCharset != null) {
    this.setDefaultCharset(defaultCharset)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (intputrc != null) {
    this.setIntputrc(intputrc)
  }
  if (keyPairOptions != null) {
    this.setKeyPairOptions(keyPairOptions)
  }
  if (pemKeyPairOptions != null) {
    this.setPemKeyPairOptions(pemKeyPairOptions)
  }
  if (pfxKeyPairOptions != null) {
    this.setPfxKeyPairOptions(pfxKeyPairOptions)
  }
  if (port != null) {
    this.setPort(port)
  }
}

package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.JksOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [JksOptions] objects.
 *
 *  Key or trust store options configuring private key and/or certificates based on Java Keystore
    files.
 *  <p>
 *  When used as a key store, it should point to a store containing a private key and its
    certificate.
 *  When used as a trust store, it should point to a store containing a list of trusted
    certificates.
 *  <p>
 *  The store can either be loaded by Vert.x from the filesystem:
 *  <p>
 *  <pre>
 *  HttpServerOptions options = HttpServerOptions.httpServerOptions();
 *  options.setKeyStore(new JKSOptions().setPath("/mykeystore.jks").setPassword("foo"));
 *  </pre>
 *
 *  Or directly provided as a buffer:
 *  <p>
 *
 *  <pre>
 *  Buffer store = vertx.fileSystem().readFileSync("/mykeystore.jks");
 *  options.setKeyStore(new JKSOptions().setValue(store).setPassword("foo"));
 *  </pre>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [JksOptions original] using Vert.x
    codegen.
 *
 * @param password  Set the password for the key store
 * @param path  Set the path to the key store
 * @param value  Set the key store as a buffer
 */
fun jksOptionsOf(
  password: String? = null,
  path: String? = null,
  value: Buffer? = null
) = JksOptions()
.apply {
  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (value != null) {
    this.setValue(value)
  }
}

/**
 * A function providing a DSL for building [JksOptions] objects.
 *
 *  Key or trust store options configuring private key and/or certificates based on Java Keystore
    files.
 *  <p>
 *  When used as a key store, it should point to a store containing a private key and its
    certificate.
 *  When used as a trust store, it should point to a store containing a list of trusted
    certificates.
 *  <p>
 *  The store can either be loaded by Vert.x from the filesystem:
 *  <p>
 *  <pre>
 *  HttpServerOptions options = HttpServerOptions.httpServerOptions();
 *  options.setKeyStore(new JKSOptions().setPath("/mykeystore.jks").setPassword("foo"));
 *  </pre>
 *
 *  Or directly provided as a buffer:
 *  <p>
 *
 *  <pre>
 *  Buffer store = vertx.fileSystem().readFileSync("/mykeystore.jks");
 *  options.setKeyStore(new JKSOptions().setValue(store).setPassword("foo"));
 *  </pre>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [JksOptions original] using Vert.x
    codegen.
 *
 * @param password  Set the password for the key store
 * @param path  Set the path to the key store
 * @param value  Set the key store as a buffer
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("jksOptionsOf(password,path,value)")
)
fun JksOptions(
  password: String? = null,
  path: String? = null,
  value: Buffer? = null
) = JksOptions()
.apply {
  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (value != null) {
    this.setValue(value)
  }
}

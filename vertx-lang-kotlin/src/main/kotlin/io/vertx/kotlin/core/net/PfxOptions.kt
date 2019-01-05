package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.PfxOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [PfxOptions] objects.
 *
 *  Key or trust store options configuring private key and/or certificates based on PKCS#12 files.
 *  <p>
 *  When used as a key store, it should point to a store containing a private key and its
    certificate.
 *  When used as a trust store, it should point to a store containing a list of accepted
    certificates.
 *  <p>
 *
 *  The store can either be loaded by Vert.x from the filesystem:
 *  <p>
 *  <pre>
 *  HttpServerOptions options = new HttpServerOptions();
 *  options.setPfxKeyCertOptions(new PfxOptions().setPath("/mykeystore.p12").setPassword("foo"));
 *  </pre>
 *
 *  Or directly provided as a buffer:<p>
 *
 *  <pre>
 *  Buffer store = vertx.fileSystem().readFileSync("/mykeystore.p12");
 *  options.setPfxKeyCertOptions(new PfxOptions().setValue(store).setPassword("foo"));
 *  </pre>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PfxOptions original] using Vert.x
    codegen.
 *
 * @param password  Set the password
 * @param path  Set the path
 * @param value  Set the store as a buffer
 */
fun pfxOptionsOf(
  password: String? = null,
  path: String? = null,
  value: Buffer? = null
) = PfxOptions()
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
 * A function providing a DSL for building [PfxOptions] objects.
 *
 *  Key or trust store options configuring private key and/or certificates based on PKCS#12 files.
 *  <p>
 *  When used as a key store, it should point to a store containing a private key and its
    certificate.
 *  When used as a trust store, it should point to a store containing a list of accepted
    certificates.
 *  <p>
 *
 *  The store can either be loaded by Vert.x from the filesystem:
 *  <p>
 *  <pre>
 *  HttpServerOptions options = new HttpServerOptions();
 *  options.setPfxKeyCertOptions(new PfxOptions().setPath("/mykeystore.p12").setPassword("foo"));
 *  </pre>
 *
 *  Or directly provided as a buffer:<p>
 *
 *  <pre>
 *  Buffer store = vertx.fileSystem().readFileSync("/mykeystore.p12");
 *  options.setPfxKeyCertOptions(new PfxOptions().setValue(store).setPassword("foo"));
 *  </pre>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PfxOptions original] using Vert.x
    codegen.
 *
 * @param password  Set the password
 * @param path  Set the path
 * @param value  Set the store as a buffer
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("pfxOptionsOf(password,path,value)")
)
fun PfxOptions(
  password: String? = null,
  path: String? = null,
  value: Buffer? = null
) = PfxOptions()
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

package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.PemTrustOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [PemTrustOptions] objects.
 *
 *  Certificate Authority options configuring certificates based on
 *  <i>Privacy-enhanced Electronic Email</i> (PEM) files. The options is configured with a list of
 *  validating certificates.
 *  <p>
 *  Validating certificates must contain X.509 certificates wrapped in a PEM block:<p>
 *
 *  <pre>
 *  -----BEGIN CERTIFICATE-----
 *  MIIDezCCAmOgAwIBAgIEVmLkwTANBgkqhkiG9w0BAQsFADBuMRAwDgYDVQQGEwdV
 *  ...
 *  z5+DuODBJUQst141Jmgq8bS543IU/5apcKQeGNxEyQ==
 *  -----END CERTIFICATE-----
 *  </pre>
 *
 *  The certificates can either be loaded by Vert.x from the filesystem:
 *  <p>
 *  <pre>
 *  HttpServerOptions options = new HttpServerOptions();
 *  options.setPemTrustOptions(new PemTrustOptions().addCertPath("/cert.pem"));
 *  </pre>
 *
 *  Or directly provided as a buffer:
 *  <p>
 *
 *  <pre>
 *  Buffer cert = vertx.fileSystem().readFileSync("/cert.pem");
 *  HttpServerOptions options = new HttpServerOptions();
 *  options.setPemTrustOptions(new PemTrustOptions().addCertValue(cert));
 *  </pre>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PemTrustOptions original] using
    Vert.x codegen.
 *
 * @param certPaths  Add a certificate path
 * @param certValues  Add a certificate value
 */
fun pemTrustOptionsOf(certPaths: Iterable<String>? = null, certValues: Iterable<Buffer>? = null) =
    PemTrustOptions()
.apply {
  if (certPaths != null) {
    for (item in certPaths) {
      this.addCertPath(item)
    }
  }
  if (certValues != null) {
    for (item in certValues) {
      this.addCertValue(item)
    }
  }
}

/**
 * A function providing a DSL for building [PemTrustOptions] objects.
 *
 *  Certificate Authority options configuring certificates based on
 *  <i>Privacy-enhanced Electronic Email</i> (PEM) files. The options is configured with a list of
 *  validating certificates.
 *  <p>
 *  Validating certificates must contain X.509 certificates wrapped in a PEM block:<p>
 *
 *  <pre>
 *  -----BEGIN CERTIFICATE-----
 *  MIIDezCCAmOgAwIBAgIEVmLkwTANBgkqhkiG9w0BAQsFADBuMRAwDgYDVQQGEwdV
 *  ...
 *  z5+DuODBJUQst141Jmgq8bS543IU/5apcKQeGNxEyQ==
 *  -----END CERTIFICATE-----
 *  </pre>
 *
 *  The certificates can either be loaded by Vert.x from the filesystem:
 *  <p>
 *  <pre>
 *  HttpServerOptions options = new HttpServerOptions();
 *  options.setPemTrustOptions(new PemTrustOptions().addCertPath("/cert.pem"));
 *  </pre>
 *
 *  Or directly provided as a buffer:
 *  <p>
 *
 *  <pre>
 *  Buffer cert = vertx.fileSystem().readFileSync("/cert.pem");
 *  HttpServerOptions options = new HttpServerOptions();
 *  options.setPemTrustOptions(new PemTrustOptions().addCertValue(cert));
 *  </pre>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PemTrustOptions original] using
    Vert.x codegen.
 *
 * @param certPaths  Add a certificate path
 * @param certValues  Add a certificate value
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("pemTrustOptionsOf(certPaths,certValues)")
)
fun PemTrustOptions(certPaths: Iterable<String>? = null, certValues: Iterable<Buffer>? = null) =
    PemTrustOptions()
.apply {
  if (certPaths != null) {
    for (item in certPaths) {
      this.addCertPath(item)
    }
  }
  if (certValues != null) {
    for (item in certValues) {
      this.addCertValue(item)
    }
  }
}

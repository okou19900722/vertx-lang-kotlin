package io.vertx.kotlin.ext.shell.term

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.ClientAuth
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.ext.shell.term.TelnetTermOptions
import java.util.concurrent.TimeUnit
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [TelnetTermOptions] objects.
 *
 *  Telnet terminal options configuration, extends [io.vertx.core.net.NetServerOptions].
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TelnetTermOptions original] using
    Vert.x codegen.
 *
 * @param acceptBacklog  Set the accept back log
 * @param charset  Set the charset to use when binary mode is active, see
    [io.vertx.ext.shell.term.TelnetTermOptions] and [io.vertx.ext.shell.term.TelnetTermOptions].
 * @param clientAuth  Set whether client auth is required
 * @param clientAuthRequired  Set whether client auth is required
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param host  Set the host
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout.
    This determines if a connection will timeout and be closed if no data is received within the
    timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param inBinary  Set the telnet connection to negociate binary data format when receiving from
    the client, the default value is true. This allows to send data in 8 bit format and thus charset
    like UTF-8.
 * @param intputrc  The path of the <i>inputrc</i> config.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is
    configured for logging on Netty's logger.
 * @param outBinary  Set the telnet connection to negociate binary data format when sending to the
    client, the default value is true. This allows to send data in 8 bit format and thus charset
    like UTF-8.
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param port  Set the port
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native
    transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native
    transport.
 * @param trafficClass  Set the value of traffic class
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param usePooledBuffers  Set whether Netty pooled buffers are enabled
 */
fun telnetTermOptionsOf(
  acceptBacklog: Int? = null,
  charset: String? = null,
  clientAuth: ClientAuth? = null,
  clientAuthRequired: Boolean? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  host: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  inBinary: Boolean? = null,
  intputrc: String? = null,
  jdkSslEngineOptions: JdkSSLEngineOptions? = null,
  keyStoreOptions: JksOptions? = null,
  logActivity: Boolean? = null,
  openSslEngineOptions: OpenSSLEngineOptions? = null,
  outBinary: Boolean? = null,
  pemKeyCertOptions: PemKeyCertOptions? = null,
  pemTrustOptions: PemTrustOptions? = null,
  pfxKeyCertOptions: PfxOptions? = null,
  pfxTrustOptions: PfxOptions? = null,
  port: Int? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  sni: Boolean? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  trafficClass: Int? = null,
  trustStoreOptions: JksOptions? = null,
  useAlpn: Boolean? = null,
  usePooledBuffers: Boolean? = null
) = TelnetTermOptions()
.apply {
  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (charset != null) {
    this.setCharset(charset)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (clientAuthRequired != null) {
    this.setClientAuthRequired(clientAuthRequired)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (host != null) {
    this.setHost(host)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (inBinary != null) {
    this.setInBinary(inBinary)
  }
  if (intputrc != null) {
    this.setIntputrc(intputrc)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (outBinary != null) {
    this.setOutBinary(outBinary)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (sni != null) {
    this.setSni(sni)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (usePooledBuffers != null) {
    this.setUsePooledBuffers(usePooledBuffers)
  }
}

/**
 * A function providing a DSL for building [TelnetTermOptions] objects.
 *
 *  Telnet terminal options configuration, extends [io.vertx.core.net.NetServerOptions].
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TelnetTermOptions original] using
    Vert.x codegen.
 *
 * @param acceptBacklog  Set the accept back log
 * @param charset  Set the charset to use when binary mode is active, see
    [io.vertx.ext.shell.term.TelnetTermOptions] and [io.vertx.ext.shell.term.TelnetTermOptions].
 * @param clientAuth  Set whether client auth is required
 * @param clientAuthRequired  Set whether client auth is required
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param host  Set the host
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout.
    This determines if a connection will timeout and be closed if no data is received within the
    timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param inBinary  Set the telnet connection to negociate binary data format when receiving from
    the client, the default value is true. This allows to send data in 8 bit format and thus charset
    like UTF-8.
 * @param intputrc  The path of the <i>inputrc</i> config.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is
    configured for logging on Netty's logger.
 * @param outBinary  Set the telnet connection to negociate binary data format when sending to the
    client, the default value is true. This allows to send data in 8 bit format and thus charset
    like UTF-8.
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param port  Set the port
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native
    transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native
    transport.
 * @param trafficClass  Set the value of traffic class
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param usePooledBuffers  Set whether Netty pooled buffers are enabled
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("telnetTermOptionsOf(acceptBacklog,charset,clientAuth,clientAuthRequired,crlPaths,crlValues,enabledCipherSuites,enabledSecureTransportProtocols,host,idleTimeout,idleTimeoutUnit,inBinary,intputrc,jdkSslEngineOptions,keyStoreOptions,logActivity,openSslEngineOptions,outBinary,pemKeyCertOptions,pemTrustOptions,pfxKeyCertOptions,pfxTrustOptions,port,receiveBufferSize,reuseAddress,reusePort,sendBufferSize,sni,soLinger,ssl,tcpCork,tcpFastOpen,tcpKeepAlive,tcpNoDelay,tcpQuickAck,trafficClass,trustStoreOptions,useAlpn,usePooledBuffers)")
)
fun TelnetTermOptions(
  acceptBacklog: Int? = null,
  charset: String? = null,
  clientAuth: ClientAuth? = null,
  clientAuthRequired: Boolean? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  host: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  inBinary: Boolean? = null,
  intputrc: String? = null,
  jdkSslEngineOptions: JdkSSLEngineOptions? = null,
  keyStoreOptions: JksOptions? = null,
  logActivity: Boolean? = null,
  openSslEngineOptions: OpenSSLEngineOptions? = null,
  outBinary: Boolean? = null,
  pemKeyCertOptions: PemKeyCertOptions? = null,
  pemTrustOptions: PemTrustOptions? = null,
  pfxKeyCertOptions: PfxOptions? = null,
  pfxTrustOptions: PfxOptions? = null,
  port: Int? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  sni: Boolean? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  trafficClass: Int? = null,
  trustStoreOptions: JksOptions? = null,
  useAlpn: Boolean? = null,
  usePooledBuffers: Boolean? = null
) = TelnetTermOptions()
.apply {
  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (charset != null) {
    this.setCharset(charset)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (clientAuthRequired != null) {
    this.setClientAuthRequired(clientAuthRequired)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (host != null) {
    this.setHost(host)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (inBinary != null) {
    this.setInBinary(inBinary)
  }
  if (intputrc != null) {
    this.setIntputrc(intputrc)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (outBinary != null) {
    this.setOutBinary(outBinary)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (sni != null) {
    this.setSni(sni)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (usePooledBuffers != null) {
    this.setUsePooledBuffers(usePooledBuffers)
  }
}

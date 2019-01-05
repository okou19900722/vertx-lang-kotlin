package io.vertx.kotlin.rabbitmq

import io.vertx.rabbitmq.RabbitMQOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [RabbitMQOptions] objects.
 *
 *  RabbitMQ client options, most
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [RabbitMQOptions original] using
    Vert.x codegen.
 *
 * @param automaticRecoveryEnabled  Enables or disables automatic connection recovery.
 * @param connectionRetries  Set the number of connection retries to attempt when connecting, the
    <code>null</code> value disables it.
 * @param connectionRetryDelay  Set the delay in milliseconds between connection retries.
 * @param connectionTimeout  Set the TCP connection timeout, in milliseconds, <code>zero</code> for
    infinite).
 * @param handshakeTimeout  Set the AMQP 0-9-1 protocol handshake timeout, in milliseconds
 * @param host  Set the default host to use for connections.
 * @param includeProperties  Set wether to include properties when a broker message is passed on the
    event bus
 * @param networkRecoveryInterval  Set how long in milliseconds will automatic recovery wait before
    attempting to reconnect, default is <code>5000</code>
 * @param password  Set the password to use when connecting to the broker.
 * @param port  Set the default port to use for connections.
 * @param requestedChannelMax  Set the initially requested maximum channel number, <code>zero</code>
    for unlimited.
 * @param requestedHeartbeat  Set the initially requested heartbeat interval, in seconds,
    <code>zero</code> for none.
 * @param user  Set the AMQP user name to use when connecting to the broker.
 * @param virtualHost  Set the virtual host to use when connecting to the broker.
 */
fun rabbitMQOptionsOf(
  automaticRecoveryEnabled: Boolean? = null,
  connectionRetries: Int? = null,
  connectionRetryDelay: Long? = null,
  connectionTimeout: Int? = null,
  handshakeTimeout: Int? = null,
  host: String? = null,
  includeProperties: Boolean? = null,
  networkRecoveryInterval: Long? = null,
  password: String? = null,
  port: Int? = null,
  requestedChannelMax: Int? = null,
  requestedHeartbeat: Int? = null,
  uri: String? = null,
  user: String? = null,
  virtualHost: String? = null
) = RabbitMQOptions()
.apply {
  if (automaticRecoveryEnabled != null) {
    this.setAutomaticRecoveryEnabled(automaticRecoveryEnabled)
  }
  if (connectionRetries != null) {
    this.setConnectionRetries(connectionRetries)
  }
  if (connectionRetryDelay != null) {
    this.setConnectionRetryDelay(connectionRetryDelay)
  }
  if (connectionTimeout != null) {
    this.setConnectionTimeout(connectionTimeout)
  }
  if (handshakeTimeout != null) {
    this.setHandshakeTimeout(handshakeTimeout)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (includeProperties != null) {
    this.setIncludeProperties(includeProperties)
  }
  if (networkRecoveryInterval != null) {
    this.setNetworkRecoveryInterval(networkRecoveryInterval)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (requestedChannelMax != null) {
    this.setRequestedChannelMax(requestedChannelMax)
  }
  if (requestedHeartbeat != null) {
    this.setRequestedHeartbeat(requestedHeartbeat)
  }
  if (uri != null) {
    this.setUri(uri)
  }
  if (user != null) {
    this.setUser(user)
  }
  if (virtualHost != null) {
    this.setVirtualHost(virtualHost)
  }
}

/**
 * A function providing a DSL for building [RabbitMQOptions] objects.
 *
 *  RabbitMQ client options, most
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [RabbitMQOptions original] using
    Vert.x codegen.
 *
 * @param automaticRecoveryEnabled  Enables or disables automatic connection recovery.
 * @param connectionRetries  Set the number of connection retries to attempt when connecting, the
    <code>null</code> value disables it.
 * @param connectionRetryDelay  Set the delay in milliseconds between connection retries.
 * @param connectionTimeout  Set the TCP connection timeout, in milliseconds, <code>zero</code> for
    infinite).
 * @param handshakeTimeout  Set the AMQP 0-9-1 protocol handshake timeout, in milliseconds
 * @param host  Set the default host to use for connections.
 * @param includeProperties  Set wether to include properties when a broker message is passed on the
    event bus
 * @param networkRecoveryInterval  Set how long in milliseconds will automatic recovery wait before
    attempting to reconnect, default is <code>5000</code>
 * @param password  Set the password to use when connecting to the broker.
 * @param port  Set the default port to use for connections.
 * @param requestedChannelMax  Set the initially requested maximum channel number, <code>zero</code>
    for unlimited.
 * @param requestedHeartbeat  Set the initially requested heartbeat interval, in seconds,
    <code>zero</code> for none.
 * @param user  Set the AMQP user name to use when connecting to the broker.
 * @param virtualHost  Set the virtual host to use when connecting to the broker.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("rabbitMQOptionsOf(automaticRecoveryEnabled,connectionRetries,connectionRetryDelay,connectionTimeout,handshakeTimeout,host,includeProperties,networkRecoveryInterval,password,port,requestedChannelMax,requestedHeartbeat,uri,user,virtualHost)")
)
fun RabbitMQOptions(
  automaticRecoveryEnabled: Boolean? = null,
  connectionRetries: Int? = null,
  connectionRetryDelay: Long? = null,
  connectionTimeout: Int? = null,
  handshakeTimeout: Int? = null,
  host: String? = null,
  includeProperties: Boolean? = null,
  networkRecoveryInterval: Long? = null,
  password: String? = null,
  port: Int? = null,
  requestedChannelMax: Int? = null,
  requestedHeartbeat: Int? = null,
  uri: String? = null,
  user: String? = null,
  virtualHost: String? = null
) = RabbitMQOptions()
.apply {
  if (automaticRecoveryEnabled != null) {
    this.setAutomaticRecoveryEnabled(automaticRecoveryEnabled)
  }
  if (connectionRetries != null) {
    this.setConnectionRetries(connectionRetries)
  }
  if (connectionRetryDelay != null) {
    this.setConnectionRetryDelay(connectionRetryDelay)
  }
  if (connectionTimeout != null) {
    this.setConnectionTimeout(connectionTimeout)
  }
  if (handshakeTimeout != null) {
    this.setHandshakeTimeout(handshakeTimeout)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (includeProperties != null) {
    this.setIncludeProperties(includeProperties)
  }
  if (networkRecoveryInterval != null) {
    this.setNetworkRecoveryInterval(networkRecoveryInterval)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (requestedChannelMax != null) {
    this.setRequestedChannelMax(requestedChannelMax)
  }
  if (requestedHeartbeat != null) {
    this.setRequestedHeartbeat(requestedHeartbeat)
  }
  if (uri != null) {
    this.setUri(uri)
  }
  if (user != null) {
    this.setUser(user)
  }
  if (virtualHost != null) {
    this.setVirtualHost(virtualHost)
  }
}

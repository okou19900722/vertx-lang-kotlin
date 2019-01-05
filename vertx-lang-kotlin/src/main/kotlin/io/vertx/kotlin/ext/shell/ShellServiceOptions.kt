package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServiceOptions
import io.vertx.ext.shell.term.HttpTermOptions
import io.vertx.ext.shell.term.SSHTermOptions
import io.vertx.ext.shell.term.TelnetTermOptions
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [ShellServiceOptions] objects.
 *
 *  The configurations options for the shell service, the shell connectors can be configured
 *  with ,  and .
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ShellServiceOptions original]
    using Vert.x codegen.
 * @param reaperInterval  Set the repear interval, i.e the period at which session eviction is
    performed.
 * @param sessionTimeout  Set the session timeout.
 * @param sshOptions  Set the SSH options, if the option is null, SSH will not be started.
 * @param telnetOptions  Set the Telnet options, if the option is null, Telnet will not be started.
 * @param welcomeMessage  Set the shell welcome message, i.e the message displayed in the user
    console when he connects to the shell.
 */
fun shellServiceOptionsOf(
  httpOptions: HttpTermOptions? = null,
  reaperInterval: Long? = null,
  sessionTimeout: Long? = null,
  sshOptions: SSHTermOptions? = null,
  telnetOptions: TelnetTermOptions? = null,
  welcomeMessage: String? = null
) = ShellServiceOptions()
.apply {
  if (httpOptions != null) {
    this.setHttpOptions(httpOptions)
  }
  if (reaperInterval != null) {
    this.setReaperInterval(reaperInterval)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
  if (sshOptions != null) {
    this.setSSHOptions(sshOptions)
  }
  if (telnetOptions != null) {
    this.setTelnetOptions(telnetOptions)
  }
  if (welcomeMessage != null) {
    this.setWelcomeMessage(welcomeMessage)
  }
}

/**
 * A function providing a DSL for building [ShellServiceOptions] objects.
 *
 *  The configurations options for the shell service, the shell connectors can be configured
 *  with ,  and .
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ShellServiceOptions original]
    using Vert.x codegen.
 * @param reaperInterval  Set the repear interval, i.e the period at which session eviction is
    performed.
 * @param sessionTimeout  Set the session timeout.
 * @param sshOptions  Set the SSH options, if the option is null, SSH will not be started.
 * @param telnetOptions  Set the Telnet options, if the option is null, Telnet will not be started.
 * @param welcomeMessage  Set the shell welcome message, i.e the message displayed in the user
    console when he connects to the shell.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("shellServiceOptionsOf(httpOptions,reaperInterval,sessionTimeout,sshOptions,telnetOptions,welcomeMessage)")
)
fun ShellServiceOptions(
  httpOptions: HttpTermOptions? = null,
  reaperInterval: Long? = null,
  sessionTimeout: Long? = null,
  sshOptions: SSHTermOptions? = null,
  telnetOptions: TelnetTermOptions? = null,
  welcomeMessage: String? = null
) = ShellServiceOptions()
.apply {
  if (httpOptions != null) {
    this.setHttpOptions(httpOptions)
  }
  if (reaperInterval != null) {
    this.setReaperInterval(reaperInterval)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
  if (sshOptions != null) {
    this.setSSHOptions(sshOptions)
  }
  if (telnetOptions != null) {
    this.setTelnetOptions(telnetOptions)
  }
  if (welcomeMessage != null) {
    this.setWelcomeMessage(welcomeMessage)
  }
}

package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServerOptions
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [ShellServerOptions] objects.
 *
 *  The configurations options for the shell server.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ShellServerOptions original] using
    Vert.x codegen.
 *
 * @param reaperInterval  Set the repear interval, i.e the period at which session eviction is
    performed.
 * @param sessionTimeout  Set the session timeout.
 * @param welcomeMessage  Set the shell welcome message, i.e the message displayed in the user
    console when he connects to the shell.
 */
fun shellServerOptionsOf(
  reaperInterval: Long? = null,
  sessionTimeout: Long? = null,
  welcomeMessage: String? = null
) = ShellServerOptions()
.apply {
  if (reaperInterval != null) {
    this.setReaperInterval(reaperInterval)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
  if (welcomeMessage != null) {
    this.setWelcomeMessage(welcomeMessage)
  }
}

/**
 * A function providing a DSL for building [ShellServerOptions] objects.
 *
 *  The configurations options for the shell server.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ShellServerOptions original] using
    Vert.x codegen.
 *
 * @param reaperInterval  Set the repear interval, i.e the period at which session eviction is
    performed.
 * @param sessionTimeout  Set the session timeout.
 * @param welcomeMessage  Set the shell welcome message, i.e the message displayed in the user
    console when he connects to the shell.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("shellServerOptionsOf(reaperInterval,sessionTimeout,welcomeMessage)")
)
fun ShellServerOptions(
  reaperInterval: Long? = null,
  sessionTimeout: Long? = null,
  welcomeMessage: String? = null
) = ShellServerOptions()
.apply {
  if (reaperInterval != null) {
    this.setReaperInterval(reaperInterval)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
  if (welcomeMessage != null) {
    this.setWelcomeMessage(welcomeMessage)
  }
}

package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailResult
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MailResult] objects.
 *
 *  Represent the result of the sendMail operation
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MailResult original] using Vert.x
    codegen.
 */
fun mailResultOf(messageID: String? = null, recipients: Iterable<String>? = null) = MailResult()
.apply {
  if (messageID != null) {
    this.setMessageID(messageID)
  }
  if (recipients != null) {
    this.setRecipients(recipients.toList())
  }
}

/**
 * A function providing a DSL for building [MailResult] objects.
 *
 *  Represent the result of the sendMail operation
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MailResult original] using Vert.x
    codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mailResultOf(messageID,recipients)")
)
fun MailResult(messageID: String? = null, recipients: Iterable<String>? = null) = MailResult()
.apply {
  if (messageID != null) {
    this.setMessageID(messageID)
  }
  if (recipients != null) {
    this.setRecipients(recipients.toList())
  }
}

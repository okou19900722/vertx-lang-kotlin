package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailAttachment
import io.vertx.ext.mail.MailMessage
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MailMessage] objects.
 *
 *  represent a mail message that can be sent via the MailClient
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MailMessage original] using Vert.x
    codegen.
 *
 * @param attachment  set the list of attachments of this mail
 * @param bcc  set list of bcc addresses
 * @param bounceAddress  set bounce address of this mail
 * @param cc  set list of cc addresses
 * @param fixedHeaders  set whether our own headers should be the only headers added to the message
 * @param from  set from address of this mail
 * @param headers  Add a message header.
 * @param html  set the html text of this mail
 * @param inlineAttachment  set the list of inline attachments of this mail
 * @param subject  set the subject of this mail
 * @param text  set the plain text of this mail
 * @param to  set list of to addresses
 */
fun mailMessageOf(
  attachment: Iterable<MailAttachment>? = null,
  bcc: Iterable<String>? = null,
  bounceAddress: String? = null,
  cc: Iterable<String>? = null,
  fixedHeaders: Boolean? = null,
  from: String? = null,
  headers: Map<String, String>? = null,
  html: String? = null,
  inlineAttachment: Iterable<MailAttachment>? = null,
  subject: String? = null,
  text: String? = null,
  to: Iterable<String>? = null
) = MailMessage()
.apply {
  if (attachment != null) {
    this.setAttachment(attachment.toList())
  }
  if (bcc != null) {
    this.setBcc(bcc.toList())
  }
  if (bounceAddress != null) {
    this.setBounceAddress(bounceAddress)
  }
  if (cc != null) {
    this.setCc(cc.toList())
  }
  if (fixedHeaders != null) {
    this.setFixedHeaders(fixedHeaders)
  }
  if (from != null) {
    this.setFrom(from)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (html != null) {
    this.setHtml(html)
  }
  if (inlineAttachment != null) {
    this.setInlineAttachment(inlineAttachment.toList())
  }
  if (subject != null) {
    this.setSubject(subject)
  }
  if (text != null) {
    this.setText(text)
  }
  if (to != null) {
    this.setTo(to.toList())
  }
}

/**
 * A function providing a DSL for building [MailMessage] objects.
 *
 *  represent a mail message that can be sent via the MailClient
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MailMessage original] using Vert.x
    codegen.
 *
 * @param attachment  set the list of attachments of this mail
 * @param bcc  set list of bcc addresses
 * @param bounceAddress  set bounce address of this mail
 * @param cc  set list of cc addresses
 * @param fixedHeaders  set whether our own headers should be the only headers added to the message
 * @param from  set from address of this mail
 * @param headers  Add a message header.
 * @param html  set the html text of this mail
 * @param inlineAttachment  set the list of inline attachments of this mail
 * @param subject  set the subject of this mail
 * @param text  set the plain text of this mail
 * @param to  set list of to addresses
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mailMessageOf(attachment,bcc,bounceAddress,cc,fixedHeaders,from,headers,html,inlineAttachment,subject,text,to)")
)
fun MailMessage(
  attachment: Iterable<MailAttachment>? = null,
  bcc: Iterable<String>? = null,
  bounceAddress: String? = null,
  cc: Iterable<String>? = null,
  fixedHeaders: Boolean? = null,
  from: String? = null,
  headers: Map<String, String>? = null,
  html: String? = null,
  inlineAttachment: Iterable<MailAttachment>? = null,
  subject: String? = null,
  text: String? = null,
  to: Iterable<String>? = null
) = MailMessage()
.apply {
  if (attachment != null) {
    this.setAttachment(attachment.toList())
  }
  if (bcc != null) {
    this.setBcc(bcc.toList())
  }
  if (bounceAddress != null) {
    this.setBounceAddress(bounceAddress)
  }
  if (cc != null) {
    this.setCc(cc.toList())
  }
  if (fixedHeaders != null) {
    this.setFixedHeaders(fixedHeaders)
  }
  if (from != null) {
    this.setFrom(from)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (html != null) {
    this.setHtml(html)
  }
  if (inlineAttachment != null) {
    this.setInlineAttachment(inlineAttachment.toList())
  }
  if (subject != null) {
    this.setSubject(subject)
  }
  if (text != null) {
    this.setText(text)
  }
  if (to != null) {
    this.setTo(to.toList())
  }
}

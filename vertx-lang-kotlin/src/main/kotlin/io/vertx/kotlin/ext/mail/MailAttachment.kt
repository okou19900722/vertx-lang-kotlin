package io.vertx.kotlin.ext.mail

import io.vertx.core.buffer.Buffer
import io.vertx.ext.mail.MailAttachment
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MailAttachment] objects.
 *
 *  Represent a mail attachment that can be used in a MailMessage.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MailAttachment original] using
    Vert.x codegen.
 *
 * @param contentId  set the Content-ID field to be used in the attachment
 * @param contentType  set the Content-Type
 * @param data  set the data
 * @param description  set the description field to be used in the attachment
 * @param disposition  set the disposition field to be used in the attachment
 * @param headers  Add an header to this attachment.
 * @param name  set the name
 */
fun mailAttachmentOf(
  contentId: String? = null,
  contentType: String? = null,
  data: Buffer? = null,
  description: String? = null,
  disposition: String? = null,
  headers: Map<String, String>? = null,
  name: String? = null
) = MailAttachment()
.apply {
  if (contentId != null) {
    this.setContentId(contentId)
  }
  if (contentType != null) {
    this.setContentType(contentType)
  }
  if (data != null) {
    this.setData(data)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (disposition != null) {
    this.setDisposition(disposition)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (name != null) {
    this.setName(name)
  }
}

/**
 * A function providing a DSL for building [MailAttachment] objects.
 *
 *  Represent a mail attachment that can be used in a MailMessage.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MailAttachment original] using
    Vert.x codegen.
 *
 * @param contentId  set the Content-ID field to be used in the attachment
 * @param contentType  set the Content-Type
 * @param data  set the data
 * @param description  set the description field to be used in the attachment
 * @param disposition  set the disposition field to be used in the attachment
 * @param headers  Add an header to this attachment.
 * @param name  set the name
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mailAttachmentOf(contentId,contentType,data,description,disposition,headers,name)")
)
fun MailAttachment(
  contentId: String? = null,
  contentType: String? = null,
  data: Buffer? = null,
  description: String? = null,
  disposition: String? = null,
  headers: Map<String, String>? = null,
  name: String? = null
) = MailAttachment()
.apply {
  if (contentId != null) {
    this.setContentId(contentId)
  }
  if (contentType != null) {
    this.setContentType(contentType)
  }
  if (data != null) {
    this.setData(data)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (disposition != null) {
    this.setDisposition(disposition)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (name != null) {
    this.setName(name)
  }
}

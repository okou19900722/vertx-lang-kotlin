package io.vertx.kotlin.ext.auth.htpasswd

import io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [HtpasswdAuthOptions] objects.
 *
 *  Options configuring htpasswd authentication.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [HtpasswdAuthOptions original]
    using Vert.x codegen.
 */
fun htpasswdAuthOptionsOf(htpasswdFile: String? = null, plainTextEnabled: Boolean? = null) =
    HtpasswdAuthOptions()
.apply {
  if (htpasswdFile != null) {
    this.setHtpasswdFile(htpasswdFile)
  }
  if (plainTextEnabled != null) {
    this.setPlainTextEnabled(plainTextEnabled)
  }
}

/**
 * A function providing a DSL for building [HtpasswdAuthOptions] objects.
 *
 *  Options configuring htpasswd authentication.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [HtpasswdAuthOptions original]
    using Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("htpasswdAuthOptionsOf(htpasswdFile,plainTextEnabled)")
)
fun HtpasswdAuthOptions(htpasswdFile: String? = null, plainTextEnabled: Boolean? = null) =
    HtpasswdAuthOptions()
.apply {
  if (htpasswdFile != null) {
    this.setHtpasswdFile(htpasswdFile)
  }
  if (plainTextEnabled != null) {
    this.setPlainTextEnabled(plainTextEnabled)
  }
}

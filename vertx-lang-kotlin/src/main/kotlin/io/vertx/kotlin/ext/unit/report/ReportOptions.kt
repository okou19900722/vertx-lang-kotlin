package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.ReportOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [ReportOptions] objects.
 *
 *  Configures a reporter consisting in a name <code>to</code>, an address <code>at</code> and an
    optional <code>format</code>.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ReportOptions original] using
    Vert.x codegen.
 *
 * @param format  Set the current reporter format.
 * @param to  Set the current reporter name.
 */
fun reportOptionsOf(format: String? = null, to: String? = null) = ReportOptions()
.apply {
  if (format != null) {
    this.setFormat(format)
  }
  if (to != null) {
    this.setTo(to)
  }
}

/**
 * A function providing a DSL for building [ReportOptions] objects.
 *
 *  Configures a reporter consisting in a name <code>to</code>, an address <code>at</code> and an
    optional <code>format</code>.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ReportOptions original] using
    Vert.x codegen.
 *
 * @param format  Set the current reporter format.
 * @param to  Set the current reporter name.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("reportOptionsOf(format,to)")
)
fun ReportOptions(format: String? = null, to: String? = null) = ReportOptions()
.apply {
  if (format != null) {
    this.setFormat(format)
  }
  if (to != null) {
    this.setTo(to)
  }
}

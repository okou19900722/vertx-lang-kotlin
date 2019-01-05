package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.ReportOptions
import io.vertx.ext.unit.report.ReportingOptions
import kotlin.Deprecated

/**
 * A function providing a DSL for building [ReportingOptions] objects.
 *
 *  Reporting options:
 *
 *  <ul>
 *    <li>the <code>reporters</code> is an array of reporter configurations</li>
 *  </ul>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ReportingOptions original] using
    Vert.x codegen.
 *
 * @param reporters  Replace the current list of reporters with a new one.
 */
fun reportingOptionsOf(reporters: Iterable<ReportOptions>? = null) = ReportingOptions()
.apply {
  if (reporters != null) {
    this.setReporters(reporters.toList())
  }
}

/**
 * A function providing a DSL for building [ReportingOptions] objects.
 *
 *  Reporting options:
 *
 *  <ul>
 *    <li>the <code>reporters</code> is an array of reporter configurations</li>
 *  </ul>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ReportingOptions original] using
    Vert.x codegen.
 *
 * @param reporters  Replace the current list of reporters with a new one.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("reportingOptionsOf(reporters)")
)
fun ReportingOptions(reporters: Iterable<ReportOptions>? = null) = ReportingOptions()
.apply {
  if (reporters != null) {
    this.setReporters(reporters.toList())
  }
}

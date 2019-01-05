package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnError
import io.vertx.ext.consul.TxnResponse
import kotlin.Deprecated

/**
 * A function providing a DSL for building [TxnResponse] objects.
 *
 *  Holds results of transaction
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TxnResponse original] using Vert.x
    codegen.
 *
 * @param errors  Adds error to this response
 */
fun txnResponseOf(errors: Iterable<TxnError>? = null) = TxnResponse()
.apply {
  if (errors != null) {
    for (item in errors) {
      this.addError(item)
    }
  }
}

/**
 * A function providing a DSL for building [TxnResponse] objects.
 *
 *  Holds results of transaction
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TxnResponse original] using Vert.x
    codegen.
 *
 * @param errors  Adds error to this response
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("txnResponseOf(errors,errorsSize,resultsSize)")
)
fun TxnResponse(errors: Iterable<TxnError>? = null) = TxnResponse()
.apply {
  if (errors != null) {
    for (item in errors) {
      this.addError(item)
    }
  }
}

package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnError
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [TxnError] objects.
 *
 *  Holds information describing which operations failed if the transaction was rolled back.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TxnError original] using Vert.x
    codegen.
 *
 * @param opIndex  Set the index of the failed operation in the transaction
 * @param what  Set error message about why that operation failed.
 */
fun txnErrorOf(opIndex: Int? = null, what: String? = null) = TxnError()
.apply {
  if (opIndex != null) {
    this.setOpIndex(opIndex)
  }
  if (what != null) {
    this.setWhat(what)
  }
}

/**
 * A function providing a DSL for building [TxnError] objects.
 *
 *  Holds information describing which operations failed if the transaction was rolled back.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TxnError original] using Vert.x
    codegen.
 *
 * @param opIndex  Set the index of the failed operation in the transaction
 * @param what  Set error message about why that operation failed.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("txnErrorOf(opIndex,what)")
)
fun TxnError(opIndex: Int? = null, what: String? = null) = TxnError()
.apply {
  if (opIndex != null) {
    this.setOpIndex(opIndex)
  }
  if (what != null) {
    this.setWhat(what)
  }
}

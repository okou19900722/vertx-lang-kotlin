package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnRequest
import kotlin.Deprecated

/**
 * A function providing a DSL for building [TxnRequest] objects.
 *
 *  Holds list of operations in transaction
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TxnRequest original] using Vert.x
    codegen.
 */
fun txnRequestOf() = TxnRequest()
.apply {
}

/**
 * A function providing a DSL for building [TxnRequest] objects.
 *
 *  Holds list of operations in transaction
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TxnRequest original] using Vert.x
    codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("txnRequestOf(operationsSize)")
)
fun TxnRequest() = TxnRequest()
.apply {
}

package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.PreparedQueryExecuteOptions
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [PreparedQueryExecuteOptions] objects.
 *
 *  Options used to execute prepared query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PreparedQueryExecuteOptions
    original] using Vert.x codegen.
 *
 * @param limit  Set the size of the list to the given number of nodes. This is applied after any
    sorting or shuffling.
 * @param near  Set node name for sorting the list in ascending order based on the estimated round
    trip time from that node. Passing <code>_agent</code> will use the agent's node for the sort. If
    this is not present, the default behavior will shuffle the nodes randomly each time the query is
    executed.
 */
fun preparedQueryExecuteOptionsOf(limit: Int? = null, near: String? = null) =
    PreparedQueryExecuteOptions()
.apply {
  if (limit != null) {
    this.setLimit(limit)
  }
  if (near != null) {
    this.setNear(near)
  }
}

/**
 * A function providing a DSL for building [PreparedQueryExecuteOptions] objects.
 *
 *  Options used to execute prepared query
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PreparedQueryExecuteOptions
    original] using Vert.x codegen.
 *
 * @param limit  Set the size of the list to the given number of nodes. This is applied after any
    sorting or shuffling.
 * @param near  Set node name for sorting the list in ascending order based on the estimated round
    trip time from that node. Passing <code>_agent</code> will use the agent's node for the sort. If
    this is not present, the default behavior will shuffle the nodes randomly each time the query is
    executed.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("preparedQueryExecuteOptionsOf(limit,near)")
)
fun PreparedQueryExecuteOptions(limit: Int? = null, near: String? = null) =
    PreparedQueryExecuteOptions()
.apply {
  if (limit != null) {
    this.setLimit(limit)
  }
  if (near != null) {
    this.setNear(near)
  }
}

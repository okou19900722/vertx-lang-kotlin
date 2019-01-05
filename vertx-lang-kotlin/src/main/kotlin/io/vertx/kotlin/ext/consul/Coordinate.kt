package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Coordinate
import kotlin.Deprecated
import kotlin.Float

/**
 * A function providing a DSL for building [Coordinate] objects.
 *
 *  Holds network coordinates of node
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Coordinate original] using Vert.x
    codegen.
 *
 * @param adj  Set adjustment
 * @param err  Set error
 * @param height  Set height
 * @param node  Set name of node
 * @param vec  Set vector
 */
fun coordinateOf(
  adj: Float? = null,
  err: Float? = null,
  height: Float? = null,
  node: String? = null,
  vec: Iterable<Float>? = null
) = Coordinate()
.apply {
  if (adj != null) {
    this.setAdj(adj)
  }
  if (err != null) {
    this.setErr(err)
  }
  if (height != null) {
    this.setHeight(height)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (vec != null) {
    this.setVec(vec.toList())
  }
}

/**
 * A function providing a DSL for building [Coordinate] objects.
 *
 *  Holds network coordinates of node
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Coordinate original] using Vert.x
    codegen.
 *
 * @param adj  Set adjustment
 * @param err  Set error
 * @param height  Set height
 * @param node  Set name of node
 * @param vec  Set vector
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("coordinateOf(adj,err,height,node,vec)")
)
fun Coordinate(
  adj: Float? = null,
  err: Float? = null,
  height: Float? = null,
  node: String? = null,
  vec: Iterable<Float>? = null
) = Coordinate()
.apply {
  if (adj != null) {
    this.setAdj(adj)
  }
  if (err != null) {
    this.setErr(err)
  }
  if (height != null) {
    this.setHeight(height)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (vec != null) {
    this.setVec(vec.toList())
  }
}

package io.vertx.kotlin.core.http

import io.vertx.core.http.StreamPriority
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Short

/**
 * A function providing a DSL for building [StreamPriority] objects.
 *
 *  This class represents HTTP/2 stream priority defined in RFC 7540 clause 5.3
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [StreamPriority original] using
    Vert.x codegen.
 *
 * @param dependency  Set the priority dependency value.
 * @param exclusive  Set the priority exclusive value.
 * @param weight  Set the priority weight.
 */
fun streamPriorityOf(
  dependency: Int? = null,
  exclusive: Boolean? = null,
  weight: Short? = null
) = StreamPriority()
.apply {
  if (dependency != null) {
    this.setDependency(dependency)
  }
  if (exclusive != null) {
    this.setExclusive(exclusive)
  }
  if (weight != null) {
    this.setWeight(weight)
  }
}

/**
 * A function providing a DSL for building [StreamPriority] objects.
 *
 *  This class represents HTTP/2 stream priority defined in RFC 7540 clause 5.3
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [StreamPriority original] using
    Vert.x codegen.
 *
 * @param dependency  Set the priority dependency value.
 * @param exclusive  Set the priority exclusive value.
 * @param weight  Set the priority weight.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("streamPriorityOf(dependency,exclusive,weight)")
)
fun StreamPriority(
  dependency: Int? = null,
  exclusive: Boolean? = null,
  weight: Short? = null
) = StreamPriority()
.apply {
  if (dependency != null) {
    this.setDependency(dependency)
  }
  if (exclusive != null) {
    this.setExclusive(exclusive)
  }
  if (weight != null) {
    this.setWeight(weight)
  }
}

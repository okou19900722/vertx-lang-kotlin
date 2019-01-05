package io.vertx.kotlin.redis.op

import io.vertx.redis.op.GeoRadiusOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [GeoRadiusOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [GeoRadiusOptions original] using
    Vert.x codegen.
 *
 * @param count  Set the radius options limit the result count.
 * @param withCoord  Set the radius options to be coordinate based.
 * @param withDist  Set the radius options to be distance based.
 * @param withHash  Set the radius options to be hash based.
 */
fun geoRadiusOptionsOf(
  count: Long? = null,
  withCoord: Boolean? = null,
  withDist: Boolean? = null,
  withHash: Boolean? = null
) = GeoRadiusOptions()
.apply {
  if (count != null) {
    this.setCount(count)
  }
  if (withCoord != null) {
    this.setWithCoord(withCoord)
  }
  if (withDist != null) {
    this.setWithDist(withDist)
  }
  if (withHash != null) {
    this.setWithHash(withHash)
  }
}

/**
 * A function providing a DSL for building [GeoRadiusOptions] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [GeoRadiusOptions original] using
    Vert.x codegen.
 *
 * @param count  Set the radius options limit the result count.
 * @param withCoord  Set the radius options to be coordinate based.
 * @param withDist  Set the radius options to be distance based.
 * @param withHash  Set the radius options to be hash based.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("geoRadiusOptionsOf(count,withCoord,withDist,withHash)")
)
fun GeoRadiusOptions(
  count: Long? = null,
  withCoord: Boolean? = null,
  withDist: Boolean? = null,
  withHash: Boolean? = null
) = GeoRadiusOptions()
.apply {
  if (count != null) {
    this.setCount(count)
  }
  if (withCoord != null) {
    this.setWithCoord(withCoord)
  }
  if (withDist != null) {
    this.setWithDist(withDist)
  }
  if (withHash != null) {
    this.setWithHash(withHash)
  }
}

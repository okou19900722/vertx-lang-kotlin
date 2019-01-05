package io.vertx.kotlin.redis.op

import io.vertx.redis.op.GeoMember
import kotlin.Deprecated
import kotlin.Double

/**
 * A function providing a DSL for building [GeoMember] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [GeoMember original] using Vert.x
    codegen.
 *
 * @param latitude  Set Latitude as per EPSG:900913 / EPSG:3785 / OSGEO:41001
 * @param longitude  Set Longitude as per EPSG:900913 / EPSG:3785 / OSGEO:41001
 * @param member  Set the member name.
 */
fun geoMemberOf(
  latitude: Double? = null,
  longitude: Double? = null,
  member: String? = null
) = GeoMember()
.apply {
  if (latitude != null) {
    this.setLatitude(latitude)
  }
  if (longitude != null) {
    this.setLongitude(longitude)
  }
  if (member != null) {
    this.setMember(member)
  }
}

/**
 * A function providing a DSL for building [GeoMember] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [GeoMember original] using Vert.x
    codegen.
 *
 * @param latitude  Set Latitude as per EPSG:900913 / EPSG:3785 / OSGEO:41001
 * @param longitude  Set Longitude as per EPSG:900913 / EPSG:3785 / OSGEO:41001
 * @param member  Set the member name.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("geoMemberOf(latitude,longitude,member)")
)
fun GeoMember(
  latitude: Double? = null,
  longitude: Double? = null,
  member: String? = null
) = GeoMember()
.apply {
  if (latitude != null) {
    this.setLatitude(latitude)
  }
  if (longitude != null) {
    this.setLongitude(longitude)
  }
  if (member != null) {
    this.setMember(member)
  }
}

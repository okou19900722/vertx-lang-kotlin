package io.vertx.kotlin.ext.dropwizard

import io.vertx.ext.dropwizard.Match
import io.vertx.ext.dropwizard.MatchType
import kotlin.Deprecated

/**
 * A function providing a DSL for building [Match] objects.
 *
 *  A match for a value.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Match original] using Vert.x
    codegen.
 *
 * @param alias  Set the alias the human readable name that will be used as a part of registry entry
    name when the value matches.
 * @param type  Set the type of matching to apply.
 * @param value  Set the matched value.
 */
fun matchOf(
  alias: String? = null,
  type: MatchType? = null,
  value: String? = null
) = Match()
.apply {
  if (alias != null) {
    this.setAlias(alias)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

/**
 * A function providing a DSL for building [Match] objects.
 *
 *  A match for a value.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [Match original] using Vert.x
    codegen.
 *
 * @param alias  Set the alias the human readable name that will be used as a part of registry entry
    name when the value matches.
 * @param type  Set the type of matching to apply.
 * @param value  Set the matched value.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("matchOf(alias,type,value)")
)
fun Match(
  alias: String? = null,
  type: MatchType? = null,
  value: String? = null
) = Match()
.apply {
  if (alias != null) {
    this.setAlias(alias)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

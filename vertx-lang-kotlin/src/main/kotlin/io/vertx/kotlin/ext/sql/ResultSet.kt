package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import kotlin.Deprecated

/**
 * A function providing a DSL for building [ResultSet] objects.
 *
 *  Represents the results of a SQL query.
 *  <p>
 *  It contains a list for the column names of the results, and a list of <code>JsonArray</code> -
    one for each row of the
 *  results.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ResultSet original] using Vert.x
    codegen.
 *
 * @param columnNames  Get the column names
 * @param next  Get the next result set
 * @param output  Get the registered outputs
 * @param results  Get the results
 */
fun resultSetOf(
  columnNames: Iterable<String>? = null,
  next: ResultSet? = null,
  output: JsonArray? = null,
  results: Iterable<JsonArray>? = null
) = ResultSet()
.apply {
  if (columnNames != null) {
    this.setColumnNames(columnNames.toList())
  }
  if (next != null) {
    this.setNext(next)
  }
  if (output != null) {
    this.setOutput(output)
  }
  if (results != null) {
    this.setResults(results.toList())
  }
}

/**
 * A function providing a DSL for building [ResultSet] objects.
 *
 *  Represents the results of a SQL query.
 *  <p>
 *  It contains a list for the column names of the results, and a list of <code>JsonArray</code> -
    one for each row of the
 *  results.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [ResultSet original] using Vert.x
    codegen.
 *
 * @param columnNames  Get the column names
 * @param next  Get the next result set
 * @param output  Get the registered outputs
 * @param results  Get the results
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("resultSetOf(columnNames,next,numColumns,numRows,output,results,rows)")
)
fun ResultSet(
  columnNames: Iterable<String>? = null,
  next: ResultSet? = null,
  output: JsonArray? = null,
  results: Iterable<JsonArray>? = null
) = ResultSet()
.apply {
  if (columnNames != null) {
    this.setColumnNames(columnNames.toList())
  }
  if (next != null) {
    this.setNext(next)
  }
  if (output != null) {
    this.setOutput(output)
  }
  if (results != null) {
    this.setResults(results.toList())
  }
}

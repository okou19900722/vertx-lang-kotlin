package io.vertx.kotlin.core.file

import io.vertx.core.file.CopyOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [CopyOptions] objects.
 *
 *  Describes the copy (and move) options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CopyOptions original] using Vert.x
    codegen.
 *
 * @param atomicMove  Whether move should be performed as an atomic filesystem operation. Defaults
    to <code>false</code>.
 * @param copyAttributes  Whether the file attributes should be copied. Defaults to
    <code>false</code>.
 * @param nofollowLinks  Whether symbolic links should not be followed during copy or move
    operations. Defaults to <code>false</code>.
 * @param replaceExisting  Whether an existing file, empty directory, or link should be replaced.
    Defaults to <code>false</code>.
 */
fun copyOptionsOf(
  atomicMove: Boolean? = null,
  copyAttributes: Boolean? = null,
  nofollowLinks: Boolean? = null,
  replaceExisting: Boolean? = null
) = CopyOptions()
.apply {
  if (atomicMove != null) {
    this.setAtomicMove(atomicMove)
  }
  if (copyAttributes != null) {
    this.setCopyAttributes(copyAttributes)
  }
  if (nofollowLinks != null) {
    this.setNofollowLinks(nofollowLinks)
  }
  if (replaceExisting != null) {
    this.setReplaceExisting(replaceExisting)
  }
}

/**
 * A function providing a DSL for building [CopyOptions] objects.
 *
 *  Describes the copy (and move) options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [CopyOptions original] using Vert.x
    codegen.
 *
 * @param atomicMove  Whether move should be performed as an atomic filesystem operation. Defaults
    to <code>false</code>.
 * @param copyAttributes  Whether the file attributes should be copied. Defaults to
    <code>false</code>.
 * @param nofollowLinks  Whether symbolic links should not be followed during copy or move
    operations. Defaults to <code>false</code>.
 * @param replaceExisting  Whether an existing file, empty directory, or link should be replaced.
    Defaults to <code>false</code>.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("copyOptionsOf(atomicMove,copyAttributes,nofollowLinks,replaceExisting)")
)
fun CopyOptions(
  atomicMove: Boolean? = null,
  copyAttributes: Boolean? = null,
  nofollowLinks: Boolean? = null,
  replaceExisting: Boolean? = null
) = CopyOptions()
.apply {
  if (atomicMove != null) {
    this.setAtomicMove(atomicMove)
  }
  if (copyAttributes != null) {
    this.setCopyAttributes(copyAttributes)
  }
  if (nofollowLinks != null) {
    this.setNofollowLinks(nofollowLinks)
  }
  if (replaceExisting != null) {
    this.setReplaceExisting(replaceExisting)
  }
}

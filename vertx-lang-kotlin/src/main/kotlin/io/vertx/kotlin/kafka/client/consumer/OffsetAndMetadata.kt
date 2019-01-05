package io.vertx.kotlin.kafka.client.consumer

import io.vertx.kafka.client.consumer.OffsetAndMetadata
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [OffsetAndMetadata] objects.
 *
 *  Provide additional metadata when an offset is committed
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OffsetAndMetadata original] using
    Vert.x codegen.
 *
 * @param metadata  Set additional metadata for the offset committed
 * @param offset  Set the offset to commit
 */
fun offsetAndMetadataOf(metadata: String? = null, offset: Long? = null) = OffsetAndMetadata()
.apply {
  if (metadata != null) {
    this.setMetadata(metadata)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

/**
 * A function providing a DSL for building [OffsetAndMetadata] objects.
 *
 *  Provide additional metadata when an offset is committed
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OffsetAndMetadata original] using
    Vert.x codegen.
 *
 * @param metadata  Set additional metadata for the offset committed
 * @param offset  Set the offset to commit
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("offsetAndMetadataOf(metadata,offset)")
)
fun OffsetAndMetadata(metadata: String? = null, offset: Long? = null) = OffsetAndMetadata()
.apply {
  if (metadata != null) {
    this.setMetadata(metadata)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

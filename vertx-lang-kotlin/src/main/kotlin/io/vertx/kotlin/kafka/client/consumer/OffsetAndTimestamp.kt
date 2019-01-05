package io.vertx.kotlin.kafka.client.consumer

import io.vertx.kafka.client.consumer.OffsetAndTimestamp
import kotlin.Deprecated
import kotlin.Long

/**
 * A function providing a DSL for building [OffsetAndTimestamp] objects.
 *
 *  Represent information related to a Offset with timestamp information
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OffsetAndTimestamp original] using
    Vert.x codegen.
 *
 * @param offset  Set the offset
 * @param timestamp  Set the timestamp
 */
fun offsetAndTimestampOf(offset: Long? = null, timestamp: Long? = null) = OffsetAndTimestamp()
.apply {
  if (offset != null) {
    this.setOffset(offset)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
}

/**
 * A function providing a DSL for building [OffsetAndTimestamp] objects.
 *
 *  Represent information related to a Offset with timestamp information
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [OffsetAndTimestamp original] using
    Vert.x codegen.
 *
 * @param offset  Set the offset
 * @param timestamp  Set the timestamp
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("offsetAndTimestampOf(offset,timestamp)")
)
fun OffsetAndTimestamp(offset: Long? = null, timestamp: Long? = null) = OffsetAndTimestamp()
.apply {
  if (offset != null) {
    this.setOffset(offset)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
}

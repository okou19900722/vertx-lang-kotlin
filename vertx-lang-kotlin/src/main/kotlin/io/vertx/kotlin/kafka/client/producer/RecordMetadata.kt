package io.vertx.kotlin.kafka.client.producer

import io.vertx.kafka.client.producer.RecordMetadata
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [RecordMetadata] objects.
 *
 *  Metadata related to a Kafka record
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [RecordMetadata original] using
    Vert.x codegen.
 *
 * @param checksum  Set the checksum (CRC32) of the record.
 * @param offset  Set the offset of the record in the topic/partition.
 * @param partition  Set the partition the record was sent to
 * @param timestamp  Set the timestamp of the record in the topic/partition
 * @param topic  Set the topic the record was appended to
 */
fun recordMetadataOf(
  checksum: Long? = null,
  offset: Long? = null,
  partition: Int? = null,
  timestamp: Long? = null,
  topic: String? = null
) = RecordMetadata()
.apply {
  if (checksum != null) {
    this.setChecksum(checksum)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

/**
 * A function providing a DSL for building [RecordMetadata] objects.
 *
 *  Metadata related to a Kafka record
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [RecordMetadata original] using
    Vert.x codegen.
 *
 * @param checksum  Set the checksum (CRC32) of the record.
 * @param offset  Set the offset of the record in the topic/partition.
 * @param partition  Set the partition the record was sent to
 * @param timestamp  Set the timestamp of the record in the topic/partition
 * @param topic  Set the topic the record was appended to
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("recordMetadataOf(checksum,offset,partition,timestamp,topic)")
)
fun RecordMetadata(
  checksum: Long? = null,
  offset: Long? = null,
  partition: Int? = null,
  timestamp: Long? = null,
  topic: String? = null
) = RecordMetadata()
.apply {
  if (checksum != null) {
    this.setChecksum(checksum)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

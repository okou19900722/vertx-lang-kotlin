package io.vertx.kotlin.kafka.client.common

import io.vertx.kafka.client.common.TopicPartition
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [TopicPartition] objects.
 *
 *  Represent information related to a partition for a topic
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TopicPartition original] using
    Vert.x codegen.
 *
 * @param partition  Set the partition number
 * @param topic  Set the topic name
 */
fun topicPartitionOf(partition: Int? = null, topic: String? = null) = TopicPartition()
.apply {
  if (partition != null) {
    this.setPartition(partition)
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

/**
 * A function providing a DSL for building [TopicPartition] objects.
 *
 *  Represent information related to a partition for a topic
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [TopicPartition original] using
    Vert.x codegen.
 *
 * @param partition  Set the partition number
 * @param topic  Set the topic name
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("topicPartitionOf(partition,topic)")
)
fun TopicPartition(partition: Int? = null, topic: String? = null) = TopicPartition()
.apply {
  if (partition != null) {
    this.setPartition(partition)
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

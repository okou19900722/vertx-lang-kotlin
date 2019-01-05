package io.vertx.kotlin.kafka.client.common

import io.vertx.kafka.client.common.Node
import io.vertx.kafka.client.common.PartitionInfo
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [PartitionInfo] objects.
 *
 *  Information about a specific Kafka topic partition
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PartitionInfo original] using
    Vert.x codegen.
 *
 * @param inSyncReplicas  Set the subset of the replicas that are in sync
 * @param leader  Set the node id of the node currently acting as a leader
 * @param partition  Set the partition id
 * @param replicas  Set the complete set of replicas for this partition
 * @param topic  Set the topic name
 */
fun partitionInfoOf(
  inSyncReplicas: Iterable<Node>? = null,
  leader: Node? = null,
  partition: Int? = null,
  replicas: Iterable<Node>? = null,
  topic: String? = null
) = PartitionInfo()
.apply {
  if (inSyncReplicas != null) {
    this.setInSyncReplicas(inSyncReplicas.toList())
  }
  if (leader != null) {
    this.setLeader(leader)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (replicas != null) {
    this.setReplicas(replicas.toList())
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

/**
 * A function providing a DSL for building [PartitionInfo] objects.
 *
 *  Information about a specific Kafka topic partition
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [PartitionInfo original] using
    Vert.x codegen.
 *
 * @param inSyncReplicas  Set the subset of the replicas that are in sync
 * @param leader  Set the node id of the node currently acting as a leader
 * @param partition  Set the partition id
 * @param replicas  Set the complete set of replicas for this partition
 * @param topic  Set the topic name
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("partitionInfoOf(inSyncReplicas,leader,partition,replicas,topic)")
)
fun PartitionInfo(
  inSyncReplicas: Iterable<Node>? = null,
  leader: Node? = null,
  partition: Int? = null,
  replicas: Iterable<Node>? = null,
  topic: String? = null
) = PartitionInfo()
.apply {
  if (inSyncReplicas != null) {
    this.setInSyncReplicas(inSyncReplicas.toList())
  }
  if (leader != null) {
    this.setLeader(leader)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (replicas != null) {
    this.setReplicas(replicas.toList())
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

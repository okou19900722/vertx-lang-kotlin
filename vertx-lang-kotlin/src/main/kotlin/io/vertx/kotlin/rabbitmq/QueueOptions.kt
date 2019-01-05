package io.vertx.kotlin.rabbitmq

import io.vertx.rabbitmq.QueueOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int

/**
 * A function providing a DSL for building [QueueOptions] objects.
 *
 *  Aimed to specify queue consumer settings when calling [io.vertx.rabbitmq.RabbitMQClient]
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [QueueOptions original] using
    Vert.x codegen.
 */
fun queueOptionsOf(
  autoAck: Boolean? = null,
  keepMostRecent: Boolean? = null,
  maxInternalQueueSize: Int? = null
) = QueueOptions()
.apply {
  if (autoAck != null) {
    this.setAutoAck(autoAck)
  }
  if (keepMostRecent != null) {
    this.setKeepMostRecent(keepMostRecent)
  }
  if (maxInternalQueueSize != null) {
    this.setMaxInternalQueueSize(maxInternalQueueSize)
  }
}

/**
 * A function providing a DSL for building [QueueOptions] objects.
 *
 *  Aimed to specify queue consumer settings when calling [io.vertx.rabbitmq.RabbitMQClient]
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [QueueOptions original] using
    Vert.x codegen.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("queueOptionsOf(autoAck,keepMostRecent,maxInternalQueueSize)")
)
fun QueueOptions(
  autoAck: Boolean? = null,
  keepMostRecent: Boolean? = null,
  maxInternalQueueSize: Int? = null
) = QueueOptions()
.apply {
  if (autoAck != null) {
    this.setAutoAck(autoAck)
  }
  if (keepMostRecent != null) {
    this.setKeepMostRecent(keepMostRecent)
  }
  if (maxInternalQueueSize != null) {
    this.setMaxInternalQueueSize(maxInternalQueueSize)
  }
}

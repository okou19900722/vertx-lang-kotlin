package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.eventbus.MessageConsumer
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.MessageSource
import java.util.function.Function

suspend fun <T> getConsumerAwait(discovery : ServiceDiscovery, filter : JsonObject) : MessageConsumer<T> {
    return awaitResult{
        MessageSource.getConsumer(discovery, filter, it)
    }
}

suspend fun <T> getConsumerAwait(discovery : ServiceDiscovery, filter : Function<Record, Boolean>) : MessageConsumer<T> {
    return awaitResult{
        MessageSource.getConsumer(discovery, filter, it)
    }
}

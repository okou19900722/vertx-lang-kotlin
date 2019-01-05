package io.vertx.kotlin.core

import io.vertx.core.DeploymentOptions
import io.vertx.core.json.JsonObject
import java.util.concurrent.TimeUnit
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long

/**
 * A function providing a DSL for building [DeploymentOptions] objects.
 *
 *  Options for configuring a verticle deployment.
 *  <p>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [DeploymentOptions original] using
    Vert.x codegen.
 *
 * @param config  Set the JSON configuration that will be passed to the verticle(s) when it's
    deployed
 * @param extraClasspath  Set any extra classpath to be used when deploying the verticle. <p>
    Ignored if no isolation group is set.
 * @param ha  Set whether the verticle(s) will be deployed as HA.
 * @param instances  Set the number of instances that should be deployed.
 * @param isolatedClasses  Set the isolated class names.
 * @param isolationGroup  Set the isolation group that will be used when deploying the verticle(s)
 * @param maxWorkerExecuteTime  Sets the value of max worker execute time, in
    [io.vertx.core.DeploymentOptions]. <p> The default value of [io.vertx.core.DeploymentOptions] is
    
 * @param maxWorkerExecuteTimeUnit  Set the time unit of <code>maxWorkerExecuteTime</code>
 * @param multiThreaded  Set whether the verticle(s) should be deployed as a multi-threaded worker
    verticle. <p> <strong>WARNING</strong>: Multi-threaded worker verticles are a deprecated
    feature. <p> Most applications will have no need for them. Because of the concurrency in these
    verticles you have to be very careful to keep the verticle in a consistent state using standard
    Java techniques for multi-threaded programming. <p> You can read the documentation that explains
    how you can replace this feature by the usage of custom worker pools or
    <code>executeBlocking</code> calls.
 * @param worker  Set whether the verticle(s) should be deployed as a worker verticle
 * @param workerPoolName  Set the worker pool name to use for this verticle. When no name is set,
    the Vert.x worker pool will be used, when a name is set, the verticle will use a named worker
    pool.
 * @param workerPoolSize  Set the maximum number of worker threads to be used by the Vert.x
    instance.
 */
fun deploymentOptionsOf(
  config: JsonObject? = null,
  extraClasspath: Iterable<String>? = null,
  ha: Boolean? = null,
  instances: Int? = null,
  isolatedClasses: Iterable<String>? = null,
  isolationGroup: String? = null,
  maxWorkerExecuteTime: Long? = null,
  maxWorkerExecuteTimeUnit: TimeUnit? = null,
  multiThreaded: Boolean? = null,
  worker: Boolean? = null,
  workerPoolName: String? = null,
  workerPoolSize: Int? = null
) = DeploymentOptions()
.apply {
  if (config != null) {
    this.setConfig(config)
  }
  if (extraClasspath != null) {
    this.setExtraClasspath(extraClasspath.toList())
  }
  if (ha != null) {
    this.setHa(ha)
  }
  if (instances != null) {
    this.setInstances(instances)
  }
  if (isolatedClasses != null) {
    this.setIsolatedClasses(isolatedClasses.toList())
  }
  if (isolationGroup != null) {
    this.setIsolationGroup(isolationGroup)
  }
  if (maxWorkerExecuteTime != null) {
    this.setMaxWorkerExecuteTime(maxWorkerExecuteTime)
  }
  if (maxWorkerExecuteTimeUnit != null) {
    this.setMaxWorkerExecuteTimeUnit(maxWorkerExecuteTimeUnit)
  }
  if (multiThreaded != null) {
    this.setMultiThreaded(multiThreaded)
  }
  if (worker != null) {
    this.setWorker(worker)
  }
  if (workerPoolName != null) {
    this.setWorkerPoolName(workerPoolName)
  }
  if (workerPoolSize != null) {
    this.setWorkerPoolSize(workerPoolSize)
  }
}

/**
 * A function providing a DSL for building [DeploymentOptions] objects.
 *
 *  Options for configuring a verticle deployment.
 *  <p>
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [DeploymentOptions original] using
    Vert.x codegen.
 *
 * @param config  Set the JSON configuration that will be passed to the verticle(s) when it's
    deployed
 * @param extraClasspath  Set any extra classpath to be used when deploying the verticle. <p>
    Ignored if no isolation group is set.
 * @param ha  Set whether the verticle(s) will be deployed as HA.
 * @param instances  Set the number of instances that should be deployed.
 * @param isolatedClasses  Set the isolated class names.
 * @param isolationGroup  Set the isolation group that will be used when deploying the verticle(s)
 * @param maxWorkerExecuteTime  Sets the value of max worker execute time, in
    [io.vertx.core.DeploymentOptions]. <p> The default value of [io.vertx.core.DeploymentOptions] is
    
 * @param maxWorkerExecuteTimeUnit  Set the time unit of <code>maxWorkerExecuteTime</code>
 * @param multiThreaded  Set whether the verticle(s) should be deployed as a multi-threaded worker
    verticle. <p> <strong>WARNING</strong>: Multi-threaded worker verticles are a deprecated
    feature. <p> Most applications will have no need for them. Because of the concurrency in these
    verticles you have to be very careful to keep the verticle in a consistent state using standard
    Java techniques for multi-threaded programming. <p> You can read the documentation that explains
    how you can replace this feature by the usage of custom worker pools or
    <code>executeBlocking</code> calls.
 * @param worker  Set whether the verticle(s) should be deployed as a worker verticle
 * @param workerPoolName  Set the worker pool name to use for this verticle. When no name is set,
    the Vert.x worker pool will be used, when a name is set, the verticle will use a named worker
    pool.
 * @param workerPoolSize  Set the maximum number of worker threads to be used by the Vert.x
    instance.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("deploymentOptionsOf(config,extraClasspath,ha,instances,isolatedClasses,isolationGroup,maxWorkerExecuteTime,maxWorkerExecuteTimeUnit,multiThreaded,worker,workerPoolName,workerPoolSize)")
)
fun DeploymentOptions(
  config: JsonObject? = null,
  extraClasspath: Iterable<String>? = null,
  ha: Boolean? = null,
  instances: Int? = null,
  isolatedClasses: Iterable<String>? = null,
  isolationGroup: String? = null,
  maxWorkerExecuteTime: Long? = null,
  maxWorkerExecuteTimeUnit: TimeUnit? = null,
  multiThreaded: Boolean? = null,
  worker: Boolean? = null,
  workerPoolName: String? = null,
  workerPoolSize: Int? = null
) = DeploymentOptions()
.apply {
  if (config != null) {
    this.setConfig(config)
  }
  if (extraClasspath != null) {
    this.setExtraClasspath(extraClasspath.toList())
  }
  if (ha != null) {
    this.setHa(ha)
  }
  if (instances != null) {
    this.setInstances(instances)
  }
  if (isolatedClasses != null) {
    this.setIsolatedClasses(isolatedClasses.toList())
  }
  if (isolationGroup != null) {
    this.setIsolationGroup(isolationGroup)
  }
  if (maxWorkerExecuteTime != null) {
    this.setMaxWorkerExecuteTime(maxWorkerExecuteTime)
  }
  if (maxWorkerExecuteTimeUnit != null) {
    this.setMaxWorkerExecuteTimeUnit(maxWorkerExecuteTimeUnit)
  }
  if (multiThreaded != null) {
    this.setMultiThreaded(multiThreaded)
  }
  if (worker != null) {
    this.setWorker(worker)
  }
  if (workerPoolName != null) {
    this.setWorkerPoolName(workerPoolName)
  }
  if (workerPoolSize != null) {
    this.setWorkerPoolSize(workerPoolSize)
  }
}

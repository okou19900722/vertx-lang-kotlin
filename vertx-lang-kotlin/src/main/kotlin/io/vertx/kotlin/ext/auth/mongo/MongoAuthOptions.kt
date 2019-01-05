package io.vertx.kotlin.ext.auth.mongo

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.mongo.HashSaltStyle
import io.vertx.ext.auth.mongo.MongoAuthOptions
import kotlin.Boolean
import kotlin.Deprecated

/**
 * A function providing a DSL for building [MongoAuthOptions] objects.
 *
 *  Options configuring Mongo authentication.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MongoAuthOptions original] using
    Vert.x codegen.
 *
 * @param collectionName  The property name to be used to set the name of the collection inside the
    config.
 * @param config  The mongo client configuration: see Mongo Client documentation.
 * @param datasourceName  The mongo data source name: see Mongo Client documentation.
 * @param passwordField  The property name to be used to set the name of the field, where the
    password is stored inside
 * @param permissionField  The property name to be used to set the name of the field, where the
    permissions are stored inside.
 * @param roleField  The property name to be used to set the name of the field, where the roles are
    stored inside.
 * @param saltField  The property name to be used to set the name of the field, where the SALT is
    stored inside.
 * @param saltStyle  The property name to be used to set the name of the field, where the salt style
    is stored inside
 * @param shared  Use a shared Mongo client or not.
 * @param usernameCredentialField  The property name to be used to set the name of the field, where
    the username for the credentials is stored inside.
 * @param usernameField  The property name to be used to set the name of the field, where the
    username is stored inside.
 */
fun mongoAuthOptionsOf(
  collectionName: String? = null,
  config: JsonObject? = null,
  datasourceName: String? = null,
  passwordField: String? = null,
  permissionField: String? = null,
  roleField: String? = null,
  saltField: String? = null,
  saltStyle: HashSaltStyle? = null,
  shared: Boolean? = null,
  usernameCredentialField: String? = null,
  usernameField: String? = null
) = MongoAuthOptions()
.apply {
  if (collectionName != null) {
    this.setCollectionName(collectionName)
  }
  if (config != null) {
    this.setConfig(config)
  }
  if (datasourceName != null) {
    this.setDatasourceName(datasourceName)
  }
  if (passwordField != null) {
    this.setPasswordField(passwordField)
  }
  if (permissionField != null) {
    this.setPermissionField(permissionField)
  }
  if (roleField != null) {
    this.setRoleField(roleField)
  }
  if (saltField != null) {
    this.setSaltField(saltField)
  }
  if (saltStyle != null) {
    this.setSaltStyle(saltStyle)
  }
  if (shared != null) {
    this.setShared(shared)
  }
  if (usernameCredentialField != null) {
    this.setUsernameCredentialField(usernameCredentialField)
  }
  if (usernameField != null) {
    this.setUsernameField(usernameField)
  }
}

/**
 * A function providing a DSL for building [MongoAuthOptions] objects.
 *
 *  Options configuring Mongo authentication.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [MongoAuthOptions original] using
    Vert.x codegen.
 *
 * @param collectionName  The property name to be used to set the name of the collection inside the
    config.
 * @param config  The mongo client configuration: see Mongo Client documentation.
 * @param datasourceName  The mongo data source name: see Mongo Client documentation.
 * @param passwordField  The property name to be used to set the name of the field, where the
    password is stored inside
 * @param permissionField  The property name to be used to set the name of the field, where the
    permissions are stored inside.
 * @param roleField  The property name to be used to set the name of the field, where the roles are
    stored inside.
 * @param saltField  The property name to be used to set the name of the field, where the SALT is
    stored inside.
 * @param saltStyle  The property name to be used to set the name of the field, where the salt style
    is stored inside
 * @param shared  Use a shared Mongo client or not.
 * @param usernameCredentialField  The property name to be used to set the name of the field, where
    the username for the credentials is stored inside.
 * @param usernameField  The property name to be used to set the name of the field, where the
    username is stored inside.
 */
@Deprecated(
    "This function will be removed in a future version",
    ReplaceWith("mongoAuthOptionsOf(collectionName,config,datasourceName,passwordField,permissionField,roleField,saltField,saltStyle,shared,usernameCredentialField,usernameField)")
)
fun MongoAuthOptions(
  collectionName: String? = null,
  config: JsonObject? = null,
  datasourceName: String? = null,
  passwordField: String? = null,
  permissionField: String? = null,
  roleField: String? = null,
  saltField: String? = null,
  saltStyle: HashSaltStyle? = null,
  shared: Boolean? = null,
  usernameCredentialField: String? = null,
  usernameField: String? = null
) = MongoAuthOptions()
.apply {
  if (collectionName != null) {
    this.setCollectionName(collectionName)
  }
  if (config != null) {
    this.setConfig(config)
  }
  if (datasourceName != null) {
    this.setDatasourceName(datasourceName)
  }
  if (passwordField != null) {
    this.setPasswordField(passwordField)
  }
  if (permissionField != null) {
    this.setPermissionField(permissionField)
  }
  if (roleField != null) {
    this.setRoleField(roleField)
  }
  if (saltField != null) {
    this.setSaltField(saltField)
  }
  if (saltStyle != null) {
    this.setSaltStyle(saltStyle)
  }
  if (shared != null) {
    this.setShared(shared)
  }
  if (usernameCredentialField != null) {
    this.setUsernameCredentialField(usernameCredentialField)
  }
  if (usernameField != null) {
    this.setUsernameField(usernameField)
  }
}

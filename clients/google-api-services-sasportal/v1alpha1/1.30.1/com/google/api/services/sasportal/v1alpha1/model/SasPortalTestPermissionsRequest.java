/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sasportal.v1alpha1.model;

/**
 * Request message for `TestPermissions` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalTestPermissionsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The set of permissions to check for the `resource`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> permissions;

  /**
   * Required. The resource for which the permissions are being requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * The set of permissions to check for the `resource`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPermissions() {
    return permissions;
  }

  /**
   * The set of permissions to check for the `resource`.
   * @param permissions permissions or {@code null} for none
   */
  public SasPortalTestPermissionsRequest setPermissions(java.util.List<java.lang.String> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Required. The resource for which the permissions are being requested.
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Required. The resource for which the permissions are being requested.
   * @param resource resource or {@code null} for none
   */
  public SasPortalTestPermissionsRequest setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  @Override
  public SasPortalTestPermissionsRequest set(String fieldName, Object value) {
    return (SasPortalTestPermissionsRequest) super.set(fieldName, value);
  }

  @Override
  public SasPortalTestPermissionsRequest clone() {
    return (SasPortalTestPermissionsRequest) super.clone();
  }

}

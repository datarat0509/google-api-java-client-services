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
 * Entity representing a SAS customer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalCustomer extends com.google.api.client.json.GenericJson {

  /**
   * Required. Name of the organization that the customer entity represents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Resource name of the customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * User IDs used by the devices belonging to this customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sasUserIds;

  /**
   * Required. Name of the organization that the customer entity represents.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Name of the organization that the customer entity represents.
   * @param displayName displayName or {@code null} for none
   */
  public SasPortalCustomer setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Resource name of the customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the customer.
   * @param name name or {@code null} for none
   */
  public SasPortalCustomer setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * User IDs used by the devices belonging to this customer.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSasUserIds() {
    return sasUserIds;
  }

  /**
   * User IDs used by the devices belonging to this customer.
   * @param sasUserIds sasUserIds or {@code null} for none
   */
  public SasPortalCustomer setSasUserIds(java.util.List<java.lang.String> sasUserIds) {
    this.sasUserIds = sasUserIds;
    return this;
  }

  @Override
  public SasPortalCustomer set(String fieldName, Object value) {
    return (SasPortalCustomer) super.set(fieldName, value);
  }

  @Override
  public SasPortalCustomer clone() {
    return (SasPortalCustomer) super.clone();
  }

}

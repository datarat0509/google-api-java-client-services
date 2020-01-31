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

package com.google.api.services.osconfig.v1beta.model;

/**
 * A guest policy recipe including its source.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EffectiveGuestPolicySourcedSoftwareRecipe extends com.google.api.client.json.GenericJson {

  /**
   * A software recipe to configure on the VM instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SoftwareRecipe softwareRecipe;

  /**
   * Name of the guest policy providing this config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * A software recipe to configure on the VM instance.
   * @return value or {@code null} for none
   */
  public SoftwareRecipe getSoftwareRecipe() {
    return softwareRecipe;
  }

  /**
   * A software recipe to configure on the VM instance.
   * @param softwareRecipe softwareRecipe or {@code null} for none
   */
  public EffectiveGuestPolicySourcedSoftwareRecipe setSoftwareRecipe(SoftwareRecipe softwareRecipe) {
    this.softwareRecipe = softwareRecipe;
    return this;
  }

  /**
   * Name of the guest policy providing this config.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Name of the guest policy providing this config.
   * @param source source or {@code null} for none
   */
  public EffectiveGuestPolicySourcedSoftwareRecipe setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  @Override
  public EffectiveGuestPolicySourcedSoftwareRecipe set(String fieldName, Object value) {
    return (EffectiveGuestPolicySourcedSoftwareRecipe) super.set(fieldName, value);
  }

  @Override
  public EffectiveGuestPolicySourcedSoftwareRecipe clone() {
    return (EffectiveGuestPolicySourcedSoftwareRecipe) super.clone();
  }

}

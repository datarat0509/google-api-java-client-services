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

package com.google.api.services.prod_tt_sasportal.v1alpha1.model;

/**
 * Model definition for SasPortalDevice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API (Testing). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalDevice extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Current configuration of the device as registered to the SAS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SasPortalDeviceConfig activeConfig;

  /**
   * Device display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The FCC identifier of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fccId;

  /**
   * Output only. Grants held by the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SasPortalDeviceGrant> grants;

  /**
   * Output only. The resource path name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Configuration of the device, as specified via SAS Portal API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SasPortalDeviceConfig preloadedConfig;

  /**
   * A serial number assigned to the device by the device manufacturer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serialNumber;

  /**
   * Output only. Device state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Current configuration of the device as registered to the SAS.
   * @return value or {@code null} for none
   */
  public SasPortalDeviceConfig getActiveConfig() {
    return activeConfig;
  }

  /**
   * Output only. Current configuration of the device as registered to the SAS.
   * @param activeConfig activeConfig or {@code null} for none
   */
  public SasPortalDevice setActiveConfig(SasPortalDeviceConfig activeConfig) {
    this.activeConfig = activeConfig;
    return this;
  }

  /**
   * Device display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Device display name.
   * @param displayName displayName or {@code null} for none
   */
  public SasPortalDevice setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The FCC identifier of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getFccId() {
    return fccId;
  }

  /**
   * The FCC identifier of the device.
   * @param fccId fccId or {@code null} for none
   */
  public SasPortalDevice setFccId(java.lang.String fccId) {
    this.fccId = fccId;
    return this;
  }

  /**
   * Output only. Grants held by the device.
   * @return value or {@code null} for none
   */
  public java.util.List<SasPortalDeviceGrant> getGrants() {
    return grants;
  }

  /**
   * Output only. Grants held by the device.
   * @param grants grants or {@code null} for none
   */
  public SasPortalDevice setGrants(java.util.List<SasPortalDeviceGrant> grants) {
    this.grants = grants;
    return this;
  }

  /**
   * Output only. The resource path name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource path name.
   * @param name name or {@code null} for none
   */
  public SasPortalDevice setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Configuration of the device, as specified via SAS Portal API.
   * @return value or {@code null} for none
   */
  public SasPortalDeviceConfig getPreloadedConfig() {
    return preloadedConfig;
  }

  /**
   * Configuration of the device, as specified via SAS Portal API.
   * @param preloadedConfig preloadedConfig or {@code null} for none
   */
  public SasPortalDevice setPreloadedConfig(SasPortalDeviceConfig preloadedConfig) {
    this.preloadedConfig = preloadedConfig;
    return this;
  }

  /**
   * A serial number assigned to the device by the device manufacturer.
   * @return value or {@code null} for none
   */
  public java.lang.String getSerialNumber() {
    return serialNumber;
  }

  /**
   * A serial number assigned to the device by the device manufacturer.
   * @param serialNumber serialNumber or {@code null} for none
   */
  public SasPortalDevice setSerialNumber(java.lang.String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Output only. Device state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Device state.
   * @param state state or {@code null} for none
   */
  public SasPortalDevice setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public SasPortalDevice set(String fieldName, Object value) {
    return (SasPortalDevice) super.set(fieldName, value);
  }

  @Override
  public SasPortalDevice clone() {
    return (SasPortalDevice) super.clone();
  }

}

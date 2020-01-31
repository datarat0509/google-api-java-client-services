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
 * Copies the artifact to the specified path on the instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SoftwareRecipeStepCopyFile extends com.google.api.client.json.GenericJson {

  /**
   * Required. The id of the relevant artifact in the recipe.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artifactId;

  /**
   * Required. The absolute path on the instance to put the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * Whether to allow this step to overwrite existing files. If this is false and the file already
   * exists the file is not overwritten and the step is considered a success. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean overwrite;

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755.
   *
   * Below are some examples of permissions and their associated values: read, write, and execute: 7
   * read and execute: 5 read and write: 6 read only: 4
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissions;

  /**
   * Required. The id of the relevant artifact in the recipe.
   * @return value or {@code null} for none
   */
  public java.lang.String getArtifactId() {
    return artifactId;
  }

  /**
   * Required. The id of the relevant artifact in the recipe.
   * @param artifactId artifactId or {@code null} for none
   */
  public SoftwareRecipeStepCopyFile setArtifactId(java.lang.String artifactId) {
    this.artifactId = artifactId;
    return this;
  }

  /**
   * Required. The absolute path on the instance to put the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * Required. The absolute path on the instance to put the file.
   * @param destination destination or {@code null} for none
   */
  public SoftwareRecipeStepCopyFile setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Whether to allow this step to overwrite existing files. If this is false and the file already
   * exists the file is not overwritten and the step is considered a success. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOverwrite() {
    return overwrite;
  }

  /**
   * Whether to allow this step to overwrite existing files. If this is false and the file already
   * exists the file is not overwritten and the step is considered a success. Defaults to false.
   * @param overwrite overwrite or {@code null} for none
   */
  public SoftwareRecipeStepCopyFile setOverwrite(java.lang.Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755.
   *
   * Below are some examples of permissions and their associated values: read, write, and execute: 7
   * read and execute: 5 read and write: 6 read only: 4
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissions() {
    return permissions;
  }

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755.
   *
   * Below are some examples of permissions and their associated values: read, write, and execute: 7
   * read and execute: 5 read and write: 6 read only: 4
   * @param permissions permissions or {@code null} for none
   */
  public SoftwareRecipeStepCopyFile setPermissions(java.lang.String permissions) {
    this.permissions = permissions;
    return this;
  }

  @Override
  public SoftwareRecipeStepCopyFile set(String fieldName, Object value) {
    return (SoftwareRecipeStepCopyFile) super.set(fieldName, value);
  }

  @Override
  public SoftwareRecipeStepCopyFile clone() {
    return (SoftwareRecipeStepCopyFile) super.clone();
  }

}

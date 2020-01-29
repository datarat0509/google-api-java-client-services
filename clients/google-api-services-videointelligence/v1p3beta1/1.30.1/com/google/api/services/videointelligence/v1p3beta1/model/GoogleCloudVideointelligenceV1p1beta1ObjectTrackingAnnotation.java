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

package com.google.api.services.videointelligence.v1p3beta1.model;

/**
 * Annotations corresponding to one tracked object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Object category's labeling confidence of this track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Entity to specify the object category that this track is labeled as.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p1beta1Entity entity;

  /**
   * Information corresponding to all frames where this object track appears. Non-streaming batch
   * mode: it may be one or multiple ObjectTrackingFrame messages in frames. Streaming mode: it can
   * only be one ObjectTrackingFrame message in frames.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrame> frames;

  /**
   * Non-streaming batch mode ONLY. Each object track corresponds to one video segment where it
   * appears.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p1beta1VideoSegment segment;

  /**
   * Streaming mode ONLY. In streaming mode, we do not know the end time of a tracked object before
   * it is completed. Hence, there is no VideoSegment info returned. Instead, we provide a unique
   * identifiable integer track_id so that the customers can correlate the results of the ongoing
   * ObjectTrackAnnotation of the same track_id over time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long trackId;

  /**
   * Object category's labeling confidence of this track.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Object category's labeling confidence of this track.
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Entity to specify the object category that this track is labeled as.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1Entity getEntity() {
    return entity;
  }

  /**
   * Entity to specify the object category that this track is labeled as.
   * @param entity entity or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation setEntity(GoogleCloudVideointelligenceV1p1beta1Entity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Information corresponding to all frames where this object track appears. Non-streaming batch
   * mode: it may be one or multiple ObjectTrackingFrame messages in frames. Streaming mode: it can
   * only be one ObjectTrackingFrame message in frames.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrame> getFrames() {
    return frames;
  }

  /**
   * Information corresponding to all frames where this object track appears. Non-streaming batch
   * mode: it may be one or multiple ObjectTrackingFrame messages in frames. Streaming mode: it can
   * only be one ObjectTrackingFrame message in frames.
   * @param frames frames or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation setFrames(java.util.List<GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrame> frames) {
    this.frames = frames;
    return this;
  }

  /**
   * Non-streaming batch mode ONLY. Each object track corresponds to one video segment where it
   * appears.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoSegment getSegment() {
    return segment;
  }

  /**
   * Non-streaming batch mode ONLY. Each object track corresponds to one video segment where it
   * appears.
   * @param segment segment or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation setSegment(GoogleCloudVideointelligenceV1p1beta1VideoSegment segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Streaming mode ONLY. In streaming mode, we do not know the end time of a tracked object before
   * it is completed. Hence, there is no VideoSegment info returned. Instead, we provide a unique
   * identifiable integer track_id so that the customers can correlate the results of the ongoing
   * ObjectTrackAnnotation of the same track_id over time.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrackId() {
    return trackId;
  }

  /**
   * Streaming mode ONLY. In streaming mode, we do not know the end time of a tracked object before
   * it is completed. Hence, there is no VideoSegment info returned. Instead, we provide a unique
   * identifiable integer track_id so that the customers can correlate the results of the ongoing
   * ObjectTrackAnnotation of the same track_id over time.
   * @param trackId trackId or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation setTrackId(java.lang.Long trackId) {
    this.trackId = trackId;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation clone() {
    return (GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation) super.clone();
  }

}

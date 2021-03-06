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

package com.google.api.services.analyticsreporting.v4.model;

/**
 * A segment sequence definition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SegmentSequenceStep extends com.google.api.client.json.GenericJson {

  /**
   * Specifies if the step immediately precedes or can be any time before the next step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String matchType;

  /**
   * A sequence is specified with a list of Or grouped filters which are combined with `AND`
   * operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrFiltersForSegment> orFiltersForSegment;

  static {
    // hack to force ProGuard to consider OrFiltersForSegment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrFiltersForSegment.class);
  }

  /**
   * Specifies if the step immediately precedes or can be any time before the next step.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatchType() {
    return matchType;
  }

  /**
   * Specifies if the step immediately precedes or can be any time before the next step.
   * @param matchType matchType or {@code null} for none
   */
  public SegmentSequenceStep setMatchType(java.lang.String matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * A sequence is specified with a list of Or grouped filters which are combined with `AND`
   * operator.
   * @return value or {@code null} for none
   */
  public java.util.List<OrFiltersForSegment> getOrFiltersForSegment() {
    return orFiltersForSegment;
  }

  /**
   * A sequence is specified with a list of Or grouped filters which are combined with `AND`
   * operator.
   * @param orFiltersForSegment orFiltersForSegment or {@code null} for none
   */
  public SegmentSequenceStep setOrFiltersForSegment(java.util.List<OrFiltersForSegment> orFiltersForSegment) {
    this.orFiltersForSegment = orFiltersForSegment;
    return this;
  }

  @Override
  public SegmentSequenceStep set(String fieldName, Object value) {
    return (SegmentSequenceStep) super.set(fieldName, value);
  }

  @Override
  public SegmentSequenceStep clone() {
    return (SegmentSequenceStep) super.clone();
  }

}

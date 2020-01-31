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

package com.google.api.services.admob.v1.model;

/**
 * Sorting direction to be applied on a dimension or a metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MediationReportSpecSortCondition extends com.google.api.client.json.GenericJson {

  /**
   * Sort by the specified dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dimension;

  /**
   * Sort by the specified metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metric;

  /**
   * Sorting order of the dimension or metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String order;

  /**
   * Sort by the specified dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getDimension() {
    return dimension;
  }

  /**
   * Sort by the specified dimension.
   * @param dimension dimension or {@code null} for none
   */
  public MediationReportSpecSortCondition setDimension(java.lang.String dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * Sort by the specified metric.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetric() {
    return metric;
  }

  /**
   * Sort by the specified metric.
   * @param metric metric or {@code null} for none
   */
  public MediationReportSpecSortCondition setMetric(java.lang.String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Sorting order of the dimension or metric.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrder() {
    return order;
  }

  /**
   * Sorting order of the dimension or metric.
   * @param order order or {@code null} for none
   */
  public MediationReportSpecSortCondition setOrder(java.lang.String order) {
    this.order = order;
    return this;
  }

  @Override
  public MediationReportSpecSortCondition set(String fieldName, Object value) {
    return (MediationReportSpecSortCondition) super.set(fieldName, value);
  }

  @Override
  public MediationReportSpecSortCondition clone() {
    return (MediationReportSpecSortCondition) super.clone();
  }

}

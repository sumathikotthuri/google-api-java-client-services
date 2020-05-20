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

package com.google.api.services.youtube.model;

/**
 * Information that identifies the recommended resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ActivityContentDetailsRecommendation extends com.google.api.client.json.GenericJson {

  /**
   * The reason that the resource is recommended to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The resourceId object contains information that identifies the recommended resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceId resourceId;

  /**
   * The seedResourceId object contains information about the resource that caused the
   * recommendation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceId seedResourceId;

  /**
   * The reason that the resource is recommended to the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason that the resource is recommended to the user.
   * @param reason reason or {@code null} for none
   */
  public ActivityContentDetailsRecommendation setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The resourceId object contains information that identifies the recommended resource.
   * @return value or {@code null} for none
   */
  public ResourceId getResourceId() {
    return resourceId;
  }

  /**
   * The resourceId object contains information that identifies the recommended resource.
   * @param resourceId resourceId or {@code null} for none
   */
  public ActivityContentDetailsRecommendation setResourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The seedResourceId object contains information about the resource that caused the
   * recommendation.
   * @return value or {@code null} for none
   */
  public ResourceId getSeedResourceId() {
    return seedResourceId;
  }

  /**
   * The seedResourceId object contains information about the resource that caused the
   * recommendation.
   * @param seedResourceId seedResourceId or {@code null} for none
   */
  public ActivityContentDetailsRecommendation setSeedResourceId(ResourceId seedResourceId) {
    this.seedResourceId = seedResourceId;
    return this;
  }

  @Override
  public ActivityContentDetailsRecommendation set(String fieldName, Object value) {
    return (ActivityContentDetailsRecommendation) super.set(fieldName, value);
  }

  @Override
  public ActivityContentDetailsRecommendation clone() {
    return (ActivityContentDetailsRecommendation) super.clone();
  }

}

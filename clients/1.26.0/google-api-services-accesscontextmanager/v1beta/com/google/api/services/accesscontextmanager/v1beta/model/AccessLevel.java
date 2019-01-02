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

package com.google.api.services.accesscontextmanager.v1beta.model;

/**
 * An `AccessLevel` is a label that can be applied to requests to GCP services, along with a list of
 * requirements necessary for the label to be applied.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessLevel extends com.google.api.client.json.GenericJson {

  /**
   * A `BasicLevel` composed of `Conditions`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicLevel basic;

  /**
   * Output only. Time the `AccessLevel` was created in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Description of the `AccessLevel` and its use. Does not affect behavior.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. Resource name for the Access Level. The `short_name` component must begin with a
   * letter and only include alphanumeric and '_'. Format:
   * `accessPolicies/{policy_id}/accessLevels/{short_name}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Human readable title. Must be unique within the Policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. Time the `AccessLevel` was updated in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * A `BasicLevel` composed of `Conditions`.
   * @return value or {@code null} for none
   */
  public BasicLevel getBasic() {
    return basic;
  }

  /**
   * A `BasicLevel` composed of `Conditions`.
   * @param basic basic or {@code null} for none
   */
  public AccessLevel setBasic(BasicLevel basic) {
    this.basic = basic;
    return this;
  }

  /**
   * Output only. Time the `AccessLevel` was created in UTC.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time the `AccessLevel` was created in UTC.
   * @param createTime createTime or {@code null} for none
   */
  public AccessLevel setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Description of the `AccessLevel` and its use. Does not affect behavior.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the `AccessLevel` and its use. Does not affect behavior.
   * @param description description or {@code null} for none
   */
  public AccessLevel setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. Resource name for the Access Level. The `short_name` component must begin with a
   * letter and only include alphanumeric and '_'. Format:
   * `accessPolicies/{policy_id}/accessLevels/{short_name}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Resource name for the Access Level. The `short_name` component must begin with a
   * letter and only include alphanumeric and '_'. Format:
   * `accessPolicies/{policy_id}/accessLevels/{short_name}`
   * @param name name or {@code null} for none
   */
  public AccessLevel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Human readable title. Must be unique within the Policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Human readable title. Must be unique within the Policy.
   * @param title title or {@code null} for none
   */
  public AccessLevel setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Output only. Time the `AccessLevel` was updated in UTC.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time the `AccessLevel` was updated in UTC.
   * @param updateTime updateTime or {@code null} for none
   */
  public AccessLevel setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public AccessLevel set(String fieldName, Object value) {
    return (AccessLevel) super.set(fieldName, value);
  }

  @Override
  public AccessLevel clone() {
    return (AccessLevel) super.clone();
  }

}

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

package com.google.api.services.docs.v1.model;

/**
 * The styling that applies to a section.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SectionStyle extends com.google.api.client.json.GenericJson {

  /**
   * The section's columns properties.
   *
   * If empty, the section contains one column with the default properties in the Docs editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SectionColumnProperties> columnProperties;

  static {
    // hack to force ProGuard to consider SectionColumnProperties used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SectionColumnProperties.class);
  }

  /**
   * The style of column separators.
   *
   * This style can be set even when there is one column in the section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String columnSeparatorStyle;

  /**
   * The content direction of this section. If unset, the value defaults to LEFT_TO_RIGHT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentDirection;

  /**
   * The section's columns properties.
   *
   * If empty, the section contains one column with the default properties in the Docs editor.
   * @return value or {@code null} for none
   */
  public java.util.List<SectionColumnProperties> getColumnProperties() {
    return columnProperties;
  }

  /**
   * The section's columns properties.
   *
   * If empty, the section contains one column with the default properties in the Docs editor.
   * @param columnProperties columnProperties or {@code null} for none
   */
  public SectionStyle setColumnProperties(java.util.List<SectionColumnProperties> columnProperties) {
    this.columnProperties = columnProperties;
    return this;
  }

  /**
   * The style of column separators.
   *
   * This style can be set even when there is one column in the section.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumnSeparatorStyle() {
    return columnSeparatorStyle;
  }

  /**
   * The style of column separators.
   *
   * This style can be set even when there is one column in the section.
   * @param columnSeparatorStyle columnSeparatorStyle or {@code null} for none
   */
  public SectionStyle setColumnSeparatorStyle(java.lang.String columnSeparatorStyle) {
    this.columnSeparatorStyle = columnSeparatorStyle;
    return this;
  }

  /**
   * The content direction of this section. If unset, the value defaults to LEFT_TO_RIGHT.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentDirection() {
    return contentDirection;
  }

  /**
   * The content direction of this section. If unset, the value defaults to LEFT_TO_RIGHT.
   * @param contentDirection contentDirection or {@code null} for none
   */
  public SectionStyle setContentDirection(java.lang.String contentDirection) {
    this.contentDirection = contentDirection;
    return this;
  }

  @Override
  public SectionStyle set(String fieldName, Object value) {
    return (SectionStyle) super.set(fieldName, value);
  }

  @Override
  public SectionStyle clone() {
    return (SectionStyle) super.clone();
  }

}

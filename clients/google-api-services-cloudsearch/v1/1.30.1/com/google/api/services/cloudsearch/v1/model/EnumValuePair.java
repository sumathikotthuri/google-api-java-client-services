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

package com.google.api.services.cloudsearch.v1.model;

/**
 * The enumeration value pair defines two things: a required string value and an optional integer
 * value. The string value defines the necessary query term required to retrieve that item, such as
 * *p0* for a priority item. The integer value determines the ranking of that string value relative
 * to other enumerated values for the same property. For example, you might associate *p0* with *0*
 * and define another enum pair such as *p1* and *1*. You must use the integer value in combination
 * with ordered ranking to set the ranking of a given value relative to other enumerated values for
 * the same property name. Here, a ranking order of DESCENDING for *priority* properties results in
 * a ranking boost for items indexed with a value of *p0* compared to items indexed with a value of
 * *p1*. Without a specified ranking order, the integer value has no effect on item ranking.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnumValuePair extends com.google.api.client.json.GenericJson {

  /**
   * The integer value of the EnumValuePair which must be non-negative. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer integerValue;

  /**
   * The string value of the EnumValuePair. The maximum length is 32 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * The integer value of the EnumValuePair which must be non-negative. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIntegerValue() {
    return integerValue;
  }

  /**
   * The integer value of the EnumValuePair which must be non-negative. Optional.
   * @param integerValue integerValue or {@code null} for none
   */
  public EnumValuePair setIntegerValue(java.lang.Integer integerValue) {
    this.integerValue = integerValue;
    return this;
  }

  /**
   * The string value of the EnumValuePair. The maximum length is 32 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * The string value of the EnumValuePair. The maximum length is 32 characters.
   * @param stringValue stringValue or {@code null} for none
   */
  public EnumValuePair setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  @Override
  public EnumValuePair set(String fieldName, Object value) {
    return (EnumValuePair) super.set(fieldName, value);
  }

  @Override
  public EnumValuePair clone() {
    return (EnumValuePair) super.clone();
  }

}

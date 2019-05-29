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

package com.google.api.services.sheets.v4.model;

/**
 * Splits a column of text into multiple columns, based on a delimiter in each cell.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TextToColumnsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The delimiter to use. Used only if delimiterType is CUSTOM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String delimiter;

  /**
   * The delimiter type to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String delimiterType;

  /**
   * The source data range.  This must span exactly one column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange source;

  /**
   * The delimiter to use. Used only if delimiterType is CUSTOM.
   * @return value or {@code null} for none
   */
  public java.lang.String getDelimiter() {
    return delimiter;
  }

  /**
   * The delimiter to use. Used only if delimiterType is CUSTOM.
   * @param delimiter delimiter or {@code null} for none
   */
  public TextToColumnsRequest setDelimiter(java.lang.String delimiter) {
    this.delimiter = delimiter;
    return this;
  }

  /**
   * The delimiter type to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getDelimiterType() {
    return delimiterType;
  }

  /**
   * The delimiter type to use.
   * @param delimiterType delimiterType or {@code null} for none
   */
  public TextToColumnsRequest setDelimiterType(java.lang.String delimiterType) {
    this.delimiterType = delimiterType;
    return this;
  }

  /**
   * The source data range.  This must span exactly one column.
   * @return value or {@code null} for none
   */
  public GridRange getSource() {
    return source;
  }

  /**
   * The source data range.  This must span exactly one column.
   * @param source source or {@code null} for none
   */
  public TextToColumnsRequest setSource(GridRange source) {
    this.source = source;
    return this;
  }

  @Override
  public TextToColumnsRequest set(String fieldName, Object value) {
    return (TextToColumnsRequest) super.set(fieldName, value);
  }

  @Override
  public TextToColumnsRequest clone() {
    return (TextToColumnsRequest) super.clone();
  }

}
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

package com.google.api.services.dialogflow.v2.model;

/**
 * The response message for SessionEntityTypes.ListSessionEntityTypes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2ListSessionEntityTypesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of session entity types. There will be a maximum number of items returned based on the
   * page_size field in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2SessionEntityType> sessionEntityTypes;

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDialogflowV2ListSessionEntityTypesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of session entity types. There will be a maximum number of items returned based on the
   * page_size field in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2SessionEntityType> getSessionEntityTypes() {
    return sessionEntityTypes;
  }

  /**
   * The list of session entity types. There will be a maximum number of items returned based on the
   * page_size field in the request.
   * @param sessionEntityTypes sessionEntityTypes or {@code null} for none
   */
  public GoogleCloudDialogflowV2ListSessionEntityTypesResponse setSessionEntityTypes(java.util.List<GoogleCloudDialogflowV2SessionEntityType> sessionEntityTypes) {
    this.sessionEntityTypes = sessionEntityTypes;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2ListSessionEntityTypesResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2ListSessionEntityTypesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2ListSessionEntityTypesResponse clone() {
    return (GoogleCloudDialogflowV2ListSessionEntityTypesResponse) super.clone();
  }

}

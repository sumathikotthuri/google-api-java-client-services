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

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * A response to `ListServicePerimetersRequest`.
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
public final class ListServicePerimetersResponse extends com.google.api.client.json.GenericJson {

  /**
   * The pagination token to retrieve the next page of results. If the value is empty, no further
   * results remain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of the Service Perimeter instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServicePerimeter> servicePerimeters;

  /**
   * The pagination token to retrieve the next page of results. If the value is empty, no further
   * results remain.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The pagination token to retrieve the next page of results. If the value is empty, no further
   * results remain.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListServicePerimetersResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of the Service Perimeter instances.
   * @return value or {@code null} for none
   */
  public java.util.List<ServicePerimeter> getServicePerimeters() {
    return servicePerimeters;
  }

  /**
   * List of the Service Perimeter instances.
   * @param servicePerimeters servicePerimeters or {@code null} for none
   */
  public ListServicePerimetersResponse setServicePerimeters(java.util.List<ServicePerimeter> servicePerimeters) {
    this.servicePerimeters = servicePerimeters;
    return this;
  }

  @Override
  public ListServicePerimetersResponse set(String fieldName, Object value) {
    return (ListServicePerimetersResponse) super.set(fieldName, value);
  }

  @Override
  public ListServicePerimetersResponse clone() {
    return (ListServicePerimetersResponse) super.clone();
  }

}

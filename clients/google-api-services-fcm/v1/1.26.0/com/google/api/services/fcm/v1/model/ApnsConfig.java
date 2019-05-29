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

package com.google.api.services.fcm.v1.model;

/**
 * [Apple Push Notification Service](https://goo.gl/MXRTPa) specific options.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Cloud Messaging API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApnsConfig extends com.google.api.client.json.GenericJson {

  /**
   * Options for features provided by the FCM SDK for iOS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApnsFcmOptions fcmOptions;

  /**
   * HTTP request headers defined in Apple Push Notification Service. Refer to [APNs request
   * headers](https://goo.gl/C6Yhia) for supported headers, e.g. "apns-priority": "10".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * APNs payload as a JSON object, including both `aps` dictionary and custom payload. See [Payload
   * Key Reference](https://goo.gl/32Pl5W). If present, it overrides
   * google.firebase.fcm.v1.Notification.title and google.firebase.fcm.v1.Notification.body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Options for features provided by the FCM SDK for iOS.
   * @return value or {@code null} for none
   */
  public ApnsFcmOptions getFcmOptions() {
    return fcmOptions;
  }

  /**
   * Options for features provided by the FCM SDK for iOS.
   * @param fcmOptions fcmOptions or {@code null} for none
   */
  public ApnsConfig setFcmOptions(ApnsFcmOptions fcmOptions) {
    this.fcmOptions = fcmOptions;
    return this;
  }

  /**
   * HTTP request headers defined in Apple Push Notification Service. Refer to [APNs request
   * headers](https://goo.gl/C6Yhia) for supported headers, e.g. "apns-priority": "10".
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * HTTP request headers defined in Apple Push Notification Service. Refer to [APNs request
   * headers](https://goo.gl/C6Yhia) for supported headers, e.g. "apns-priority": "10".
   * @param headers headers or {@code null} for none
   */
  public ApnsConfig setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * APNs payload as a JSON object, including both `aps` dictionary and custom payload. See [Payload
   * Key Reference](https://goo.gl/32Pl5W). If present, it overrides
   * google.firebase.fcm.v1.Notification.title and google.firebase.fcm.v1.Notification.body.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * APNs payload as a JSON object, including both `aps` dictionary and custom payload. See [Payload
   * Key Reference](https://goo.gl/32Pl5W). If present, it overrides
   * google.firebase.fcm.v1.Notification.title and google.firebase.fcm.v1.Notification.body.
   * @param payload payload or {@code null} for none
   */
  public ApnsConfig setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  @Override
  public ApnsConfig set(String fieldName, Object value) {
    return (ApnsConfig) super.set(fieldName, value);
  }

  @Override
  public ApnsConfig clone() {
    return (ApnsConfig) super.clone();
  }

}
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

package com.google.api.services.cloudprivatecatalogproducer.v1beta1.model;

/**
 * Model definition for GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Private Catalog Producer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest extends com.google.api.client.json.GenericJson {

  /**
   * The raw icon bytes user-supplied to be uploaded to the product. The format of the icon can only
   * be PNG or JPEG. The minimum allowed dimensions are 130x130 pixels and the maximum dimensions
   * are 10000x10000 pixels. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String icon;

  /**
   * The raw icon bytes user-supplied to be uploaded to the product. The format of the icon can only
   * be PNG or JPEG. The minimum allowed dimensions are 130x130 pixels and the maximum dimensions
   * are 10000x10000 pixels. Required.
   * @see #decodeIcon()
   * @return value or {@code null} for none
   */
  public java.lang.String getIcon() {
    return icon;
  }

  /**
   * The raw icon bytes user-supplied to be uploaded to the product. The format of the icon can only
   * be PNG or JPEG. The minimum allowed dimensions are 130x130 pixels and the maximum dimensions
   * are 10000x10000 pixels. Required.
   * @see #getIcon()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeIcon() {
    return com.google.api.client.util.Base64.decodeBase64(icon);
  }

  /**
   * The raw icon bytes user-supplied to be uploaded to the product. The format of the icon can only
   * be PNG or JPEG. The minimum allowed dimensions are 130x130 pixels and the maximum dimensions
   * are 10000x10000 pixels. Required.
   * @see #encodeIcon()
   * @param icon icon or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest setIcon(java.lang.String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * The raw icon bytes user-supplied to be uploaded to the product. The format of the icon can only
   * be PNG or JPEG. The minimum allowed dimensions are 130x130 pixels and the maximum dimensions
   * are 10000x10000 pixels. Required.
   * @see #setIcon()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest encodeIcon(byte[] icon) {
    this.icon = com.google.api.client.util.Base64.encodeBase64URLSafeString(icon);
    return this;
  }

  @Override
  public GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest set(String fieldName, Object value) {
    return (GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest clone() {
    return (GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest) super.clone();
  }

}
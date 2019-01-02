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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * Represents the size of an ad unit that can be targeted on an ad request. It only applies to
 * Private Auction, AdX Preferred Deals and Auction Packages. This targeting does not apply to
 * Programmatic Guaranteed and Preferred Deals in Ad Manager.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InventorySizeTargeting extends com.google.api.client.json.GenericJson {

  /**
   * A list of inventory sizes to be excluded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AdSize> excludedInventorySizes;

  static {
    // hack to force ProGuard to consider AdSize used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdSize.class);
  }

  /**
   * A list of inventory sizes to be included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AdSize> targetedInventorySizes;

  static {
    // hack to force ProGuard to consider AdSize used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdSize.class);
  }

  /**
   * A list of inventory sizes to be excluded.
   * @return value or {@code null} for none
   */
  public java.util.List<AdSize> getExcludedInventorySizes() {
    return excludedInventorySizes;
  }

  /**
   * A list of inventory sizes to be excluded.
   * @param excludedInventorySizes excludedInventorySizes or {@code null} for none
   */
  public InventorySizeTargeting setExcludedInventorySizes(java.util.List<AdSize> excludedInventorySizes) {
    this.excludedInventorySizes = excludedInventorySizes;
    return this;
  }

  /**
   * A list of inventory sizes to be included.
   * @return value or {@code null} for none
   */
  public java.util.List<AdSize> getTargetedInventorySizes() {
    return targetedInventorySizes;
  }

  /**
   * A list of inventory sizes to be included.
   * @param targetedInventorySizes targetedInventorySizes or {@code null} for none
   */
  public InventorySizeTargeting setTargetedInventorySizes(java.util.List<AdSize> targetedInventorySizes) {
    this.targetedInventorySizes = targetedInventorySizes;
    return this;
  }

  @Override
  public InventorySizeTargeting set(String fieldName, Object value) {
    return (InventorySizeTargeting) super.set(fieldName, value);
  }

  @Override
  public InventorySizeTargeting clone() {
    return (InventorySizeTargeting) super.clone();
  }

}

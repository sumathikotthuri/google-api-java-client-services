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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * A `Platform` is a set of requirements, such as hardware, operating system, or compiler toolchain,
 * for an Action's execution environment. A `Platform` is represented as a series of key-value pairs
 * representing the properties that are required of the platform.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2Platform extends com.google.api.client.json.GenericJson {

  /**
   * The properties that make up this platform. In order to ensure that equivalent `Platform`s
   * always hash to the same value, the properties MUST be lexicographically sorted by name, and
   * then by value. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuildBazelRemoteExecutionV2PlatformProperty> properties;

  /**
   * The properties that make up this platform. In order to ensure that equivalent `Platform`s
   * always hash to the same value, the properties MUST be lexicographically sorted by name, and
   * then by value. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes.
   * @return value or {@code null} for none
   */
  public java.util.List<BuildBazelRemoteExecutionV2PlatformProperty> getProperties() {
    return properties;
  }

  /**
   * The properties that make up this platform. In order to ensure that equivalent `Platform`s
   * always hash to the same value, the properties MUST be lexicographically sorted by name, and
   * then by value. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes.
   * @param properties properties or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Platform setProperties(java.util.List<BuildBazelRemoteExecutionV2PlatformProperty> properties) {
    this.properties = properties;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2Platform set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2Platform) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2Platform clone() {
    return (BuildBazelRemoteExecutionV2Platform) super.clone();
  }

}
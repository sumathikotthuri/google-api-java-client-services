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
 * An environment variable required by this task.
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
public final class GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable extends com.google.api.client.json.GenericJson {

  /**
   * The envvar name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The envvar value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The envvar name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The envvar name.
   * @param name name or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The envvar value.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The envvar value.
   * @param value value or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable clone() {
    return (GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable) super.clone();
  }

}
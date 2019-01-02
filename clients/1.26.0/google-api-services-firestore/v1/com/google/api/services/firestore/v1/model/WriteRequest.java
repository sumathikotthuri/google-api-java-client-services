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

package com.google.api.services.firestore.v1.model;

/**
 * The request for Firestore.Write.
 *
 * The first request creates a stream, or resumes an existing one from a token.
 *
 * When creating a new stream, the server replies with a response containing only an ID and a token,
 * to use in the next request.
 *
 * When resuming a stream, the server first streams any responses later than the given token, then a
 * response containing only an up-to-date token, to use in the next request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WriteRequest extends com.google.api.client.json.GenericJson {

  /**
   * Labels associated with this write request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The ID of the write stream to resume. This may only be set in the first message. When left
   * empty, a new write stream will be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streamId;

  /**
   * A stream token that was previously sent by the server.
   *
   * The client should set this field to the token from the most recent WriteResponse it has
   * received. This acknowledges that the client has received responses up to this token. After
   * sending this token, earlier tokens may not be used anymore.
   *
   * The server may close the stream if there are too many unacknowledged responses.
   *
   * Leave this field unset when creating a new stream. To resume a stream at a specific point, set
   * this field and the `stream_id` field.
   *
   * Leave this field unset when creating a new stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streamToken;

  /**
   * The writes to apply.
   *
   * Always executed atomically and in order. This must be empty on the first request. This may be
   * empty on the last request. This must not be empty on all other requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Write> writes;

  static {
    // hack to force ProGuard to consider Write used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Write.class);
  }

  /**
   * Labels associated with this write request.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels associated with this write request.
   * @param labels labels or {@code null} for none
   */
  public WriteRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The ID of the write stream to resume. This may only be set in the first message. When left
   * empty, a new write stream will be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getStreamId() {
    return streamId;
  }

  /**
   * The ID of the write stream to resume. This may only be set in the first message. When left
   * empty, a new write stream will be created.
   * @param streamId streamId or {@code null} for none
   */
  public WriteRequest setStreamId(java.lang.String streamId) {
    this.streamId = streamId;
    return this;
  }

  /**
   * A stream token that was previously sent by the server.
   *
   * The client should set this field to the token from the most recent WriteResponse it has
   * received. This acknowledges that the client has received responses up to this token. After
   * sending this token, earlier tokens may not be used anymore.
   *
   * The server may close the stream if there are too many unacknowledged responses.
   *
   * Leave this field unset when creating a new stream. To resume a stream at a specific point, set
   * this field and the `stream_id` field.
   *
   * Leave this field unset when creating a new stream.
   * @see #decodeStreamToken()
   * @return value or {@code null} for none
   */
  public java.lang.String getStreamToken() {
    return streamToken;
  }

  /**
   * A stream token that was previously sent by the server.
   *
   * The client should set this field to the token from the most recent WriteResponse it has
   * received. This acknowledges that the client has received responses up to this token. After
   * sending this token, earlier tokens may not be used anymore.
   *
   * The server may close the stream if there are too many unacknowledged responses.
   *
   * Leave this field unset when creating a new stream. To resume a stream at a specific point, set
   * this field and the `stream_id` field.
   *
   * Leave this field unset when creating a new stream.
   * @see #getStreamToken()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeStreamToken() {
    return com.google.api.client.util.Base64.decodeBase64(streamToken);
  }

  /**
   * A stream token that was previously sent by the server.
   *
   * The client should set this field to the token from the most recent WriteResponse it has
   * received. This acknowledges that the client has received responses up to this token. After
   * sending this token, earlier tokens may not be used anymore.
   *
   * The server may close the stream if there are too many unacknowledged responses.
   *
   * Leave this field unset when creating a new stream. To resume a stream at a specific point, set
   * this field and the `stream_id` field.
   *
   * Leave this field unset when creating a new stream.
   * @see #encodeStreamToken()
   * @param streamToken streamToken or {@code null} for none
   */
  public WriteRequest setStreamToken(java.lang.String streamToken) {
    this.streamToken = streamToken;
    return this;
  }

  /**
   * A stream token that was previously sent by the server.
   *
   * The client should set this field to the token from the most recent WriteResponse it has
   * received. This acknowledges that the client has received responses up to this token. After
   * sending this token, earlier tokens may not be used anymore.
   *
   * The server may close the stream if there are too many unacknowledged responses.
   *
   * Leave this field unset when creating a new stream. To resume a stream at a specific point, set
   * this field and the `stream_id` field.
   *
   * Leave this field unset when creating a new stream.
   * @see #setStreamToken()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public WriteRequest encodeStreamToken(byte[] streamToken) {
    this.streamToken = com.google.api.client.util.Base64.encodeBase64URLSafeString(streamToken);
    return this;
  }

  /**
   * The writes to apply.
   *
   * Always executed atomically and in order. This must be empty on the first request. This may be
   * empty on the last request. This must not be empty on all other requests.
   * @return value or {@code null} for none
   */
  public java.util.List<Write> getWrites() {
    return writes;
  }

  /**
   * The writes to apply.
   *
   * Always executed atomically and in order. This must be empty on the first request. This may be
   * empty on the last request. This must not be empty on all other requests.
   * @param writes writes or {@code null} for none
   */
  public WriteRequest setWrites(java.util.List<Write> writes) {
    this.writes = writes;
    return this;
  }

  @Override
  public WriteRequest set(String fieldName, Object value) {
    return (WriteRequest) super.set(fieldName, value);
  }

  @Override
  public WriteRequest clone() {
    return (WriteRequest) super.clone();
  }

}

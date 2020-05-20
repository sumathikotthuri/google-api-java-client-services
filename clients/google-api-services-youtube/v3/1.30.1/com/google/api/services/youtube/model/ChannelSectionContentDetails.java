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

package com.google.api.services.youtube.model;

/**
 * Details about a channelsection, including playlists and channels.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelSectionContentDetails extends com.google.api.client.json.GenericJson {

  /**
   * The channel ids for type multiple_channels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> channels;

  /**
   * The playlist ids for type single_playlist and multiple_playlists. For singlePlaylist, only one
   * playlistId is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> playlists;

  /**
   * The channel ids for type multiple_channels.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getChannels() {
    return channels;
  }

  /**
   * The channel ids for type multiple_channels.
   * @param channels channels or {@code null} for none
   */
  public ChannelSectionContentDetails setChannels(java.util.List<java.lang.String> channels) {
    this.channels = channels;
    return this;
  }

  /**
   * The playlist ids for type single_playlist and multiple_playlists. For singlePlaylist, only one
   * playlistId is allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPlaylists() {
    return playlists;
  }

  /**
   * The playlist ids for type single_playlist and multiple_playlists. For singlePlaylist, only one
   * playlistId is allowed.
   * @param playlists playlists or {@code null} for none
   */
  public ChannelSectionContentDetails setPlaylists(java.util.List<java.lang.String> playlists) {
    this.playlists = playlists;
    return this;
  }

  @Override
  public ChannelSectionContentDetails set(String fieldName, Object value) {
    return (ChannelSectionContentDetails) super.set(fieldName, value);
  }

  @Override
  public ChannelSectionContentDetails clone() {
    return (ChannelSectionContentDetails) super.clone();
  }

}

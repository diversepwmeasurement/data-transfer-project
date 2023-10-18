/*
 * Copyright 2022 The Data Transfer Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.datatransferproject.datatransfer.google.musicModels;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The response provided by the Google Music API when exporting playlist items */
public class PlaylistItemExportResponse {
  @JsonProperty("playlistItems")
  private GooglePlaylistItem[] playlistItems;

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  public GooglePlaylistItem[] getPlaylistItems() {
    return playlistItems;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }
}
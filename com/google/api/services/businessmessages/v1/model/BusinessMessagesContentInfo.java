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
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2020-11-11 13:17:14 EST)
 * on 2020-11-11 at 18:17:15 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businessmessages.v1.model;

/**
 * Message containing the content information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Business Messages API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BusinessMessagesContentInfo extends com.google.api.client.json.GenericJson {

  /**
   * Text describing the details about the media for accessibility purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String altText;

  /**
   * Publicly reachable URL of the file. The platform determines the MIME type of the file from the
   * content-type field in the HTTP headers when the platform fetches the file. The content-type
   * field must be present and accurate in the HTTP response from the URL. Maximum 5 MB. Supported
   * content types: image/jpeg, image/jpg, image/png
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileUrl;

  /**
   * If set, the platform fetches the file and thumbnail from the specified URLs, even if the
   * platform has cached copies of the file (and/or of the thumbnail).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean forceRefresh;

  /**
   * Optional. Publicly reachable URL of the thumbnail. If you don't provide a thumbnail URL, the
   * platform displays a blank placeholder thumbnail until the user's device downloads the file.
   * Maximum 25 KB. Supported content types: image/jpeg, image/jpg, image/png
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailUrl;

  /**
   * Text describing the details about the media for accessibility purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getAltText() {
    return altText;
  }

  /**
   * Text describing the details about the media for accessibility purposes.
   * @param altText altText or {@code null} for none
   */
  public BusinessMessagesContentInfo setAltText(java.lang.String altText) {
    this.altText = altText;
    return this;
  }

  /**
   * Publicly reachable URL of the file. The platform determines the MIME type of the file from the
   * content-type field in the HTTP headers when the platform fetches the file. The content-type
   * field must be present and accurate in the HTTP response from the URL. Maximum 5 MB. Supported
   * content types: image/jpeg, image/jpg, image/png
   * @return value or {@code null} for none
   */
  public java.lang.String getFileUrl() {
    return fileUrl;
  }

  /**
   * Publicly reachable URL of the file. The platform determines the MIME type of the file from the
   * content-type field in the HTTP headers when the platform fetches the file. The content-type
   * field must be present and accurate in the HTTP response from the URL. Maximum 5 MB. Supported
   * content types: image/jpeg, image/jpg, image/png
   * @param fileUrl fileUrl or {@code null} for none
   */
  public BusinessMessagesContentInfo setFileUrl(java.lang.String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

  /**
   * If set, the platform fetches the file and thumbnail from the specified URLs, even if the
   * platform has cached copies of the file (and/or of the thumbnail).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getForceRefresh() {
    return forceRefresh;
  }

  /**
   * If set, the platform fetches the file and thumbnail from the specified URLs, even if the
   * platform has cached copies of the file (and/or of the thumbnail).
   * @param forceRefresh forceRefresh or {@code null} for none
   */
  public BusinessMessagesContentInfo setForceRefresh(java.lang.Boolean forceRefresh) {
    this.forceRefresh = forceRefresh;
    return this;
  }

  /**
   * Optional. Publicly reachable URL of the thumbnail. If you don't provide a thumbnail URL, the
   * platform displays a blank placeholder thumbnail until the user's device downloads the file.
   * Maximum 25 KB. Supported content types: image/jpeg, image/jpg, image/png
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * Optional. Publicly reachable URL of the thumbnail. If you don't provide a thumbnail URL, the
   * platform displays a blank placeholder thumbnail until the user's device downloads the file.
   * Maximum 25 KB. Supported content types: image/jpeg, image/jpg, image/png
   * @param thumbnailUrl thumbnailUrl or {@code null} for none
   */
  public BusinessMessagesContentInfo setThumbnailUrl(java.lang.String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  @Override
  public BusinessMessagesContentInfo set(String fieldName, Object value) {
    return (BusinessMessagesContentInfo) super.set(fieldName, value);
  }

  @Override
  public BusinessMessagesContentInfo clone() {
    return (BusinessMessagesContentInfo) super.clone();
  }

}

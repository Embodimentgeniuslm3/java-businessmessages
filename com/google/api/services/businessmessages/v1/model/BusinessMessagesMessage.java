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
 * (build: 2021-01-14 21:39:54 UTC)
 * on 2021-01-14 at 21:40:20 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businessmessages.v1.model;

/**
 * A message in a conversation between an agent and a user.
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
public final class BusinessMessagesMessage extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If `true`, indicates that the message contains rich text. If the message contains
   * invalid formatting, Business Messages returns an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean containsRichText;

  /**
   * Optional. Fallback text that displays if the user's device doesn't support the message type or
   * content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fallback;

  /**
   * Image message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BusinessMessagesImage image;

  /**
   * Required. The unique identifier of the message, assigned by the agent. If a message attempts to
   * use the same `messageId` as a previous message, Business Messages returns an `ALREADY_EXISTS`
   * error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageId;

  /**
   * The name of the message, as set by Business Messages. Resolves to
   * "conversations/{conversationId}/messages/{messageId}", where {conversationId} is the unique ID
   * for the conversation and {messageId} is the unique ID for the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Details about the representative (human or chatbot) that sent the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BusinessMessagesRepresentative representative;

  /**
   * Rich Card message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BusinessMessagesRichCard richCard;

  /**
   * A list of suggested replies that appear as a list of suggestion chips following the associated
   * message. Maximum 13 suggestions. The chips only display when the associated message is the most
   * recent message within the conversation (including both agent and user messages). The user can
   * tap a suggested reply to send the text reply to the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BusinessMessagesSuggestion> suggestions;

  /**
   * Text message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Optional. If `true`, indicates that the message contains rich text. If the message contains
   * invalid formatting, Business Messages returns an error.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContainsRichText() {
    return containsRichText;
  }

  /**
   * Optional. If `true`, indicates that the message contains rich text. If the message contains
   * invalid formatting, Business Messages returns an error.
   * @param containsRichText containsRichText or {@code null} for none
   */
  public BusinessMessagesMessage setContainsRichText(java.lang.Boolean containsRichText) {
    this.containsRichText = containsRichText;
    return this;
  }

  /**
   * Optional. Fallback text that displays if the user's device doesn't support the message type or
   * content.
   * @return value or {@code null} for none
   */
  public java.lang.String getFallback() {
    return fallback;
  }

  /**
   * Optional. Fallback text that displays if the user's device doesn't support the message type or
   * content.
   * @param fallback fallback or {@code null} for none
   */
  public BusinessMessagesMessage setFallback(java.lang.String fallback) {
    this.fallback = fallback;
    return this;
  }

  /**
   * Image message.
   * @return value or {@code null} for none
   */
  public BusinessMessagesImage getImage() {
    return image;
  }

  /**
   * Image message.
   * @param image image or {@code null} for none
   */
  public BusinessMessagesMessage setImage(BusinessMessagesImage image) {
    this.image = image;
    return this;
  }

  /**
   * Required. The unique identifier of the message, assigned by the agent. If a message attempts to
   * use the same `messageId` as a previous message, Business Messages returns an `ALREADY_EXISTS`
   * error.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageId() {
    return messageId;
  }

  /**
   * Required. The unique identifier of the message, assigned by the agent. If a message attempts to
   * use the same `messageId` as a previous message, Business Messages returns an `ALREADY_EXISTS`
   * error.
   * @param messageId messageId or {@code null} for none
   */
  public BusinessMessagesMessage setMessageId(java.lang.String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * The name of the message, as set by Business Messages. Resolves to
   * "conversations/{conversationId}/messages/{messageId}", where {conversationId} is the unique ID
   * for the conversation and {messageId} is the unique ID for the message.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the message, as set by Business Messages. Resolves to
   * "conversations/{conversationId}/messages/{messageId}", where {conversationId} is the unique ID
   * for the conversation and {messageId} is the unique ID for the message.
   * @param name name or {@code null} for none
   */
  public BusinessMessagesMessage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Details about the representative (human or chatbot) that sent the message.
   * @return value or {@code null} for none
   */
  public BusinessMessagesRepresentative getRepresentative() {
    return representative;
  }

  /**
   * Details about the representative (human or chatbot) that sent the message.
   * @param representative representative or {@code null} for none
   */
  public BusinessMessagesMessage setRepresentative(BusinessMessagesRepresentative representative) {
    this.representative = representative;
    return this;
  }

  /**
   * Rich Card message.
   * @return value or {@code null} for none
   */
  public BusinessMessagesRichCard getRichCard() {
    return richCard;
  }

  /**
   * Rich Card message.
   * @param richCard richCard or {@code null} for none
   */
  public BusinessMessagesMessage setRichCard(BusinessMessagesRichCard richCard) {
    this.richCard = richCard;
    return this;
  }

  /**
   * A list of suggested replies that appear as a list of suggestion chips following the associated
   * message. Maximum 13 suggestions. The chips only display when the associated message is the most
   * recent message within the conversation (including both agent and user messages). The user can
   * tap a suggested reply to send the text reply to the agent.
   * @return value or {@code null} for none
   */
  public java.util.List<BusinessMessagesSuggestion> getSuggestions() {
    return suggestions;
  }

  /**
   * A list of suggested replies that appear as a list of suggestion chips following the associated
   * message. Maximum 13 suggestions. The chips only display when the associated message is the most
   * recent message within the conversation (including both agent and user messages). The user can
   * tap a suggested reply to send the text reply to the agent.
   * @param suggestions suggestions or {@code null} for none
   */
  public BusinessMessagesMessage setSuggestions(java.util.List<BusinessMessagesSuggestion> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  /**
   * Text message.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Text message.
   * @param text text or {@code null} for none
   */
  public BusinessMessagesMessage setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public BusinessMessagesMessage set(String fieldName, Object value) {
    return (BusinessMessagesMessage) super.set(fieldName, value);
  }

  @Override
  public BusinessMessagesMessage clone() {
    return (BusinessMessagesMessage) super.clone();
  }

}

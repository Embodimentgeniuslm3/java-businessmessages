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
 * An event in a conversation between an agent and a user.
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
public final class BusinessMessagesEvent extends com.google.api.client.json.GenericJson {

  /**
   * The type of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * The name of the event, as set by Business Messages. Resolves to
   * "conversations/{conversationId}/events/{eventId}", where {conversationId} is the unique ID for
   * the conversation and {eventId} is the unique ID for the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Details about the representative (human or chatbot) that sent the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BusinessMessagesRepresentative representative;

  /**
   * The type of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * The type of the event.
   * @param eventType eventType or {@code null} for none
   */
  public BusinessMessagesEvent setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The name of the event, as set by Business Messages. Resolves to
   * "conversations/{conversationId}/events/{eventId}", where {conversationId} is the unique ID for
   * the conversation and {eventId} is the unique ID for the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the event, as set by Business Messages. Resolves to
   * "conversations/{conversationId}/events/{eventId}", where {conversationId} is the unique ID for
   * the conversation and {eventId} is the unique ID for the event.
   * @param name name or {@code null} for none
   */
  public BusinessMessagesEvent setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Details about the representative (human or chatbot) that sent the event.
   * @return value or {@code null} for none
   */
  public BusinessMessagesRepresentative getRepresentative() {
    return representative;
  }

  /**
   * Details about the representative (human or chatbot) that sent the event.
   * @param representative representative or {@code null} for none
   */
  public BusinessMessagesEvent setRepresentative(BusinessMessagesRepresentative representative) {
    this.representative = representative;
    return this;
  }

  @Override
  public BusinessMessagesEvent set(String fieldName, Object value) {
    return (BusinessMessagesEvent) super.set(fieldName, value);
  }

  @Override
  public BusinessMessagesEvent clone() {
    return (BusinessMessagesEvent) super.clone();
  }

}

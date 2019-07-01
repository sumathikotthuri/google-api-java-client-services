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

package com.google.api.services.compute.model;

/**
 * Represents a reservation resource. A reservation ensures that capacity is held in a specific zone
 * even if the reserved VMs are not running. For more information, read  Reserving zonal resources.
 * (== resource_for beta.reservations ==) (== resource_for v1.reservations ==) (== NextID: 13 ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Reservation extends com.google.api.client.json.GenericJson {

  /**
   * [OutputOnly] Full or partial url for parent commitment for reservations which are tied to a
   * commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commitment;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Reservation for instances with specific machine shapes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AllocationSpecificSKUReservation specificReservation;

  /**
   * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation.
   * If the field is set, then only VMs that target the reservation by name can consume from this
   * reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean specificReservationRequired;

  /**
   * [Output Only] The status of the reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Zone in which the reservation resides, must be provided if reservation is created with
   * commitment creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * [OutputOnly] Full or partial url for parent commitment for reservations which are tied to a
   * commitment.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommitment() {
    return commitment;
  }

  /**
   * [OutputOnly] Full or partial url for parent commitment for reservations which are tied to a
   * commitment.
   * @param commitment commitment or {@code null} for none
   */
  public Reservation setCommitment(java.lang.String commitment) {
    this.commitment = commitment;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Reservation setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Reservation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Reservation setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
   * @param kind kind or {@code null} for none
   */
  public Reservation setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Reservation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Reservation setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Reservation for instances with specific machine shapes.
   * @return value or {@code null} for none
   */
  public AllocationSpecificSKUReservation getSpecificReservation() {
    return specificReservation;
  }

  /**
   * Reservation for instances with specific machine shapes.
   * @param specificReservation specificReservation or {@code null} for none
   */
  public Reservation setSpecificReservation(AllocationSpecificSKUReservation specificReservation) {
    this.specificReservation = specificReservation;
    return this;
  }

  /**
   * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation.
   * If the field is set, then only VMs that target the reservation by name can consume from this
   * reservation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSpecificReservationRequired() {
    return specificReservationRequired;
  }

  /**
   * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation.
   * If the field is set, then only VMs that target the reservation by name can consume from this
   * reservation.
   * @param specificReservationRequired specificReservationRequired or {@code null} for none
   */
  public Reservation setSpecificReservationRequired(java.lang.Boolean specificReservationRequired) {
    this.specificReservationRequired = specificReservationRequired;
    return this;
  }

  /**
   * [Output Only] The status of the reservation.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the reservation.
   * @param status status or {@code null} for none
   */
  public Reservation setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Zone in which the reservation resides, must be provided if reservation is created with
   * commitment creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Zone in which the reservation resides, must be provided if reservation is created with
   * commitment creation.
   * @param zone zone or {@code null} for none
   */
  public Reservation setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Reservation set(String fieldName, Object value) {
    return (Reservation) super.set(fieldName, value);
  }

  @Override
  public Reservation clone() {
    return (Reservation) super.clone();
  }

}

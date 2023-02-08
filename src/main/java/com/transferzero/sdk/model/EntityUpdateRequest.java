/*
 * BitPesa Private API
 * API specification used for internal BitPesa endpoints
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.transferzero.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * EntityUpdateRequest
 */

public class EntityUpdateRequest {
  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private UUID entityId;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_MANUAL_FIELDS = "manual_fields";
  @SerializedName(SERIALIZED_NAME_MANUAL_FIELDS)
  private Object manualFields = null;

  public EntityUpdateRequest entityId(UUID entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Id of linked entity
   * @return entityId
  **/
  @ApiModelProperty(example = "86912555-272a-48f7-bdbb-eab653150e01", value = "Id of linked entity")
  public UUID getEntityId() {
    return entityId;
  }

  public void setEntityId(UUID entityId) {
    this.entityId = entityId;
  }

  public EntityUpdateRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Type of entity to update eg. Sender, Company 
   * @return entityType
  **/
  @ApiModelProperty(value = "Type of entity to update eg. Sender, Company ")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public EntityUpdateRequest manualFields(Object manualFields) {
    this.manualFields = manualFields;
    return this;
  }

   /**
   * Attributes needed to calculate the risk scores for the manual fields
   * @return manualFields
  **/
  @ApiModelProperty(example = "{\"sanctions_lists_checked\":\"yes\",\"adverse_media\":\"no\",\"company_based_in_sanctioned_country\":\"yes\",\"formal_actions_less_than_6_months\":\"no\",\"formal_actions_6_to_12_months\":\"yes\",\"formal_actions_12_to_24_months\":\"no\",\"under_investigation\":\"yes\",\"remarks\":\"nothing to add\"}", value = "Attributes needed to calculate the risk scores for the manual fields")
  public Object getManualFields() {
    return manualFields;
  }

  public void setManualFields(Object manualFields) {
    this.manualFields = manualFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityUpdateRequest entityUpdateRequest = (EntityUpdateRequest) o;
    return Objects.equals(this.entityId, entityUpdateRequest.entityId) &&
        Objects.equals(this.entityType, entityUpdateRequest.entityType) &&
        Objects.equals(this.manualFields, entityUpdateRequest.manualFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, manualFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityUpdateRequest {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    manualFields: ").append(toIndentedString(manualFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The rating of the entity. Can be one of the following:  - &#x60;Extremey High&#x60;: When an entity has a total score of 80 or more - &#x60;High Risk&#x60;: When an entity has a total score between 60 and 79 - &#x60;Medium Risk&#x60;: When an entity has a total score between 30 and 59 - &#x60;Low Risk&#x60;: When an entity has a total score between 0 and 39
 */
@JsonAdapter(EntityRating.Adapter.class)
public enum EntityRating {
  
  EXTREMELY_HIGH("extremely_high"),
  
  HIGH_RISK("high_risk"),
  
  MEDIUM_RISK("medium_risk"),
  
  LOW_RISK("low_risk");

  private String value;

  EntityRating(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EntityRating fromValue(String value) {
    for (EntityRating b : EntityRating.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EntityRating> {
    @Override
    public void write(final JsonWriter jsonWriter, final EntityRating enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EntityRating read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EntityRating.fromValue(value);
    }
  }
}


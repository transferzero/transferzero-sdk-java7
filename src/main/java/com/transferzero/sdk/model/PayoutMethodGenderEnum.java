/*
 * TransferZero API
 * Reference documentation for the TransferZero API V1
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
 * The gender of the sender:  - &#x60;M&#x60;: Male - &#x60;F&#x60;: Female
 */
@JsonAdapter(PayoutMethodGenderEnum.Adapter.class)
public enum PayoutMethodGenderEnum {
  
  M("M"),
  
  F("F");

  private String value;

  PayoutMethodGenderEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayoutMethodGenderEnum fromValue(String value) {
    for (PayoutMethodGenderEnum b : PayoutMethodGenderEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PayoutMethodGenderEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayoutMethodGenderEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PayoutMethodGenderEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PayoutMethodGenderEnum.fromValue(value);
    }
  }
}


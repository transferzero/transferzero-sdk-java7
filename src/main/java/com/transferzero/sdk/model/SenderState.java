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
 * The state of the sender. Can be one of the following:  - &#x60;incomplete&#x60;: When a sender has not submitted required details or documents (cannot transact) - &#x60;initial&#x60;: When a sender is created and has not been through any KYC checking (cannot transact) - &#x60;verified&#x60;: A sender has passed sanction list checks (cannot transact) - &#x60;approved&#x60;: The sender has passed both KYC and sanction checks (can transact) - &#x60;banned&#x60;: An admin has banned the sender (cannot transact) - &#x60;rejected&#x60;: The sender has failed sanction list checks (cannot transact) - &#x60;disabled&#x60;: A sender is put into this state as a result of a delete request via the API (cannot transact)
 */
@JsonAdapter(SenderState.Adapter.class)
public enum SenderState {
  
  INCOMPLETE("incomplete"),
  
  INITIAL("initial"),
  
  VERIFIED("verified"),
  
  APPROVED("approved"),
  
  BANNED("banned"),
  
  REJECTED("rejected"),
  
  DISABLED("disabled");

  private String value;

  SenderState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SenderState fromValue(String value) {
    for (SenderState b : SenderState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SenderState> {
    @Override
    public void write(final JsonWriter jsonWriter, final SenderState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SenderState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SenderState.fromValue(value);
    }
  }
}


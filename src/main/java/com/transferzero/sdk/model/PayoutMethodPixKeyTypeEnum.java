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
 * The type of pix key used by the recipient - &#x60;cpf&#x60;: Natural person register number - &#x60;cnpj&#x60;: Company registration number - &#x60;phone&#x60;: Phone number - &#x60;email&#x60;: Email address - &#x60;evp&#x60;: Virtual payment address
 */
@JsonAdapter(PayoutMethodPixKeyTypeEnum.Adapter.class)
public enum PayoutMethodPixKeyTypeEnum {
  
  CPF("cpf"),
  
  CNPJ("cnpj"),
  
  PHONE("phone"),
  
  EMAIL("email"),
  
  EVP("evp");

  private String value;

  PayoutMethodPixKeyTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayoutMethodPixKeyTypeEnum fromValue(String value) {
    for (PayoutMethodPixKeyTypeEnum b : PayoutMethodPixKeyTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PayoutMethodPixKeyTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayoutMethodPixKeyTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PayoutMethodPixKeyTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PayoutMethodPixKeyTypeEnum.fromValue(value);
    }
  }
}


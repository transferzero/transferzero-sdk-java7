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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.transferzero.sdk.model.PayoutMethodCashProviderEnum;
import com.transferzero.sdk.model.PayoutMethodIdentityCardTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON \&quot;details\&quot;: {   \&quot;first_name\&quot;: \&quot;First\&quot;,   \&quot;last_name\&quot;: \&quot;Last\&quot;,   \&quot;phone_number\&quot;: \&quot;774044436\&quot;, // local or international Senegalese format   \&quot;identity_card_id\&quot;: \&quot;2231324232\&quot;, // Required if cash_provider value is \&quot;wizall\&quot;   \&quot;identity_card_type\&quot;: \&quot;PP\&quot;, // Required if cash_provider value is \&quot;wizall\&quot;   \&quot;cash_provider\&quot;: \&quot;wizall\&quot; // Optional; Values: \&quot;wari\&quot; or \&quot;wizall; Default value is \&quot;wari\&quot; } &#x60;&#x60;&#x60;  Please note when sending Wari cash pickup requests you should subscribe to the recipient.pending webhook, as that will broadcast the payment reference ID the customer need to use to obtain the funds. Example webhook response excerpt -  &#x60;&#x60;&#x60;JSON {   (...)   \&quot;state\&quot;:\&quot;pending\&quot;,   \&quot;metadata\&quot;: {     \&quot;payment_reference\&quot;:\&quot;9M5GJRJUBCY\&quot;   },   (...) } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "```JSON \"details\": {   \"first_name\": \"First\",   \"last_name\": \"Last\",   \"phone_number\": \"774044436\", // local or international Senegalese format   \"identity_card_id\": \"2231324232\", // Required if cash_provider value is \"wizall\"   \"identity_card_type\": \"PP\", // Required if cash_provider value is \"wizall\"   \"cash_provider\": \"wizall\" // Optional; Values: \"wari\" or \"wizall; Default value is \"wari\" } ```  Please note when sending Wari cash pickup requests you should subscribe to the recipient.pending webhook, as that will broadcast the payment reference ID the customer need to use to obtain the funds. Example webhook response excerpt -  ```JSON {   (...)   \"state\":\"pending\",   \"metadata\": {     \"payment_reference\":\"9M5GJRJUBCY\"   },   (...) } ```")

public class PayoutMethodDetailsXOFCash {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_ID = "identity_card_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_ID)
  private String identityCardId;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_TYPE = "identity_card_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_TYPE)
  private PayoutMethodIdentityCardTypeEnum identityCardType;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_CASH_PROVIDER = "cash_provider";
  @SerializedName(SERIALIZED_NAME_CASH_PROVIDER)
  private PayoutMethodCashProviderEnum cashProvider;

  public PayoutMethodDetailsXOFCash firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PayoutMethodDetailsXOFCash lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PayoutMethodDetailsXOFCash identityCardId(String identityCardId) {
    this.identityCardId = identityCardId;
    return this;
  }

   /**
   * Get identityCardId
   * @return identityCardId
  **/
  @ApiModelProperty(value = "")
  public String getIdentityCardId() {
    return identityCardId;
  }

  public void setIdentityCardId(String identityCardId) {
    this.identityCardId = identityCardId;
  }

  public PayoutMethodDetailsXOFCash identityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
    this.identityCardType = identityCardType;
    return this;
  }

   /**
   * Get identityCardType
   * @return identityCardType
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodIdentityCardTypeEnum getIdentityCardType() {
    return identityCardType;
  }

  public void setIdentityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
    this.identityCardType = identityCardType;
  }

  public PayoutMethodDetailsXOFCash phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PayoutMethodDetailsXOFCash cashProvider(PayoutMethodCashProviderEnum cashProvider) {
    this.cashProvider = cashProvider;
    return this;
  }

   /**
   * Get cashProvider
   * @return cashProvider
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodCashProviderEnum getCashProvider() {
    return cashProvider;
  }

  public void setCashProvider(PayoutMethodCashProviderEnum cashProvider) {
    this.cashProvider = cashProvider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsXOFCash payoutMethodDetailsXOFCash = (PayoutMethodDetailsXOFCash) o;
    return Objects.equals(this.firstName, payoutMethodDetailsXOFCash.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsXOFCash.lastName) &&
        Objects.equals(this.identityCardId, payoutMethodDetailsXOFCash.identityCardId) &&
        Objects.equals(this.identityCardType, payoutMethodDetailsXOFCash.identityCardType) &&
        Objects.equals(this.phoneNumber, payoutMethodDetailsXOFCash.phoneNumber) &&
        Objects.equals(this.cashProvider, payoutMethodDetailsXOFCash.cashProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, identityCardId, identityCardType, phoneNumber, cashProvider);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsXOFCash {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    identityCardId: ").append(toIndentedString(identityCardId)).append("\n");
    sb.append("    identityCardType: ").append(toIndentedString(identityCardType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    cashProvider: ").append(toIndentedString(cashProvider)).append("\n");
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

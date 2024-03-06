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
import com.transferzero.sdk.model.PayoutMethodTransferReasonEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.LocalDate;

/**
 * &#x60;&#x60;&#x60;JSON \&quot;details\&quot;: {   \&quot;first_name\&quot;: \&quot;First\&quot;,   \&quot;last_name\&quot;: \&quot;Last\&quot;,   \&quot;iban\&quot;: \&quot;BJ0610100100144390000769\&quot;, # BBAN format   \&quot;bank_name\&quot;: \&quot;Bank Of Africa Bénin\&quot;,   \&quot;bank_country\&quot;: \&quot;BJ\&quot;, # ISO country code for Benin   \&quot;bank_code\&quot;: \&quot;BJ061\&quot;,   \&quot;transfer_reason\&quot;: \&quot;personal_account\&quot; } &#x60;&#x60;&#x60;  See [XOF Bank](https://docs.transferzero.com/docs/payout-details/#xofbank) documentation for the bank_code and transfer_reason lists
 */
@ApiModel(description = "```JSON \"details\": {   \"first_name\": \"First\",   \"last_name\": \"Last\",   \"iban\": \"BJ0610100100144390000769\", # BBAN format   \"bank_name\": \"Bank Of Africa Bénin\",   \"bank_country\": \"BJ\", # ISO country code for Benin   \"bank_code\": \"BJ061\",   \"transfer_reason\": \"personal_account\" } ```  See [XOF Bank](https://docs.transferzero.com/docs/payout-details/#xofbank) documentation for the bank_code and transfer_reason lists")

public class PayoutMethodDetailsXOFBank {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_COUNTRY = "bank_country";
  @SerializedName(SERIALIZED_NAME_BANK_COUNTRY)
  private String bankCountry;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_TRANSFER_REASON = "transfer_reason";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON)
  private PayoutMethodTransferReasonEnum transferReason;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public PayoutMethodDetailsXOFBank firstName(String firstName) {
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

  public PayoutMethodDetailsXOFBank lastName(String lastName) {
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

  public PayoutMethodDetailsXOFBank iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public PayoutMethodDetailsXOFBank bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public PayoutMethodDetailsXOFBank bankCountry(String bankCountry) {
    this.bankCountry = bankCountry;
    return this;
  }

   /**
   * Get bankCountry
   * @return bankCountry
  **/
  @ApiModelProperty(value = "")
  public String getBankCountry() {
    return bankCountry;
  }

  public void setBankCountry(String bankCountry) {
    this.bankCountry = bankCountry;
  }

  public PayoutMethodDetailsXOFBank bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Get bankCode
   * @return bankCode
  **/
  @ApiModelProperty(value = "")
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public PayoutMethodDetailsXOFBank transferReason(PayoutMethodTransferReasonEnum transferReason) {
    this.transferReason = transferReason;
    return this;
  }

   /**
   * Get transferReason
   * @return transferReason
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodTransferReasonEnum getTransferReason() {
    return transferReason;
  }

  public void setTransferReason(PayoutMethodTransferReasonEnum transferReason) {
    this.transferReason = transferReason;
  }

  public PayoutMethodDetailsXOFBank birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Date of birth of recipient
   * @return birthDate
  **/
  @ApiModelProperty(value = "Date of birth of recipient")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsXOFBank payoutMethodDetailsXOFBank = (PayoutMethodDetailsXOFBank) o;
    return Objects.equals(this.firstName, payoutMethodDetailsXOFBank.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsXOFBank.lastName) &&
        Objects.equals(this.iban, payoutMethodDetailsXOFBank.iban) &&
        Objects.equals(this.bankName, payoutMethodDetailsXOFBank.bankName) &&
        Objects.equals(this.bankCountry, payoutMethodDetailsXOFBank.bankCountry) &&
        Objects.equals(this.bankCode, payoutMethodDetailsXOFBank.bankCode) &&
        Objects.equals(this.transferReason, payoutMethodDetailsXOFBank.transferReason) &&
        Objects.equals(this.birthDate, payoutMethodDetailsXOFBank.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, iban, bankName, bankCountry, bankCode, transferReason, birthDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsXOFBank {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankCountry: ").append(toIndentedString(bankCountry)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    transferReason: ").append(toIndentedString(transferReason)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
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


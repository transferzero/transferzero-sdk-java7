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
 * &#x60;&#x60;&#x60;JSON \&quot;details\&quot;: {   \&quot;first_name\&quot;: \&quot;First\&quot;,   \&quot;last_name\&quot;: \&quot;Last\&quot;,   \&quot;iban\&quot;: \&quot;CM2110033052090901100045910\&quot;, # IBAN format   \&quot;bank_account\&quot;: \&quot;09011000459\&quot;,   \&quot;bank_name\&quot;: \&quot;United Bank for Africa - Cameroon\&quot;,   \&quot;bank_country\&quot;: \&quot;CM\&quot;, # ISO country code for Cameroon   \&quot;bank_code\&quot;: \&quot;10033\&quot;,   \&quot;sort_code\&quot;: \&quot;10\&quot;,   \&quot;transfer_reason\&quot;: \&quot;personal_account\&quot; } &#x60;&#x60;&#x60;  See [XAF Bank](https://docs.transferzero.com/docs/payout-details/#xafbank) documentation for the bank_code and transfer_reason lists
 */
@ApiModel(description = "```JSON \"details\": {   \"first_name\": \"First\",   \"last_name\": \"Last\",   \"iban\": \"CM2110033052090901100045910\", # IBAN format   \"bank_account\": \"09011000459\",   \"bank_name\": \"United Bank for Africa - Cameroon\",   \"bank_country\": \"CM\", # ISO country code for Cameroon   \"bank_code\": \"10033\",   \"sort_code\": \"10\",   \"transfer_reason\": \"personal_account\" } ```  See [XAF Bank](https://docs.transferzero.com/docs/payout-details/#xafbank) documentation for the bank_code and transfer_reason lists")

public class PayoutMethodDetailsXAFBank {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_COUNTRY = "bank_country";
  @SerializedName(SERIALIZED_NAME_BANK_COUNTRY)
  private String bankCountry;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_SORT_CODE = "sort_code";
  @SerializedName(SERIALIZED_NAME_SORT_CODE)
  private String sortCode;

  public static final String SERIALIZED_NAME_TRANSFER_REASON = "transfer_reason";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON)
  private PayoutMethodTransferReasonEnum transferReason;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public PayoutMethodDetailsXAFBank firstName(String firstName) {
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

  public PayoutMethodDetailsXAFBank lastName(String lastName) {
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

  public PayoutMethodDetailsXAFBank iban(String iban) {
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

  public PayoutMethodDetailsXAFBank bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PayoutMethodDetailsXAFBank bankName(String bankName) {
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

  public PayoutMethodDetailsXAFBank bankCountry(String bankCountry) {
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

  public PayoutMethodDetailsXAFBank bankCode(String bankCode) {
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

  public PayoutMethodDetailsXAFBank sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

   /**
   * Get sortCode
   * @return sortCode
  **/
  @ApiModelProperty(value = "")
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  public PayoutMethodDetailsXAFBank transferReason(PayoutMethodTransferReasonEnum transferReason) {
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

  public PayoutMethodDetailsXAFBank birthDate(LocalDate birthDate) {
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
    PayoutMethodDetailsXAFBank payoutMethodDetailsXAFBank = (PayoutMethodDetailsXAFBank) o;
    return Objects.equals(this.firstName, payoutMethodDetailsXAFBank.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsXAFBank.lastName) &&
        Objects.equals(this.iban, payoutMethodDetailsXAFBank.iban) &&
        Objects.equals(this.bankAccount, payoutMethodDetailsXAFBank.bankAccount) &&
        Objects.equals(this.bankName, payoutMethodDetailsXAFBank.bankName) &&
        Objects.equals(this.bankCountry, payoutMethodDetailsXAFBank.bankCountry) &&
        Objects.equals(this.bankCode, payoutMethodDetailsXAFBank.bankCode) &&
        Objects.equals(this.sortCode, payoutMethodDetailsXAFBank.sortCode) &&
        Objects.equals(this.transferReason, payoutMethodDetailsXAFBank.transferReason) &&
        Objects.equals(this.birthDate, payoutMethodDetailsXAFBank.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, iban, bankAccount, bankName, bankCountry, bankCode, sortCode, transferReason, birthDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsXAFBank {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankCountry: ").append(toIndentedString(bankCountry)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
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


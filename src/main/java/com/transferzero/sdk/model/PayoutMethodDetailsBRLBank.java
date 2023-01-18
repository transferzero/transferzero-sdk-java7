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
import com.transferzero.sdk.model.PayoutMethodBankAccountTypeEnum;
import com.transferzero.sdk.model.PayoutMethodIdentityCardTypeEnum;
import com.transferzero.sdk.model.PayoutMethodPixKeyTypeEnum;
import com.transferzero.sdk.model.PayoutMethodTransferReasonEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PIX Payment: &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;First\&quot;,     \&quot;last_name\&quot;: \&quot;Last\&quot;,     \&quot;phone_number\&quot;: \&quot;+552112345678\&quot;, // E.164 international format     \&quot;pix_key_type\&quot;: \&quot;email\&quot;,     \&quot;pix_key_value\&quot;: \&quot;person@example.com\&quot;,     \&quot;identity_card_type\&quot;: \&quot;ID\&quot;,     \&quot;identity_card_id\&quot;: \&quot;01234567890\&quot;,     \&quot;transfer_reason\&quot;: \&quot;personal_account\&quot;   } &#x60;&#x60;&#x60;  TED Payment: &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;First\&quot;,     \&quot;last_name\&quot;: \&quot;Last\&quot;,     \&quot;phone_number\&quot;: \&quot;+552112345678\&quot;, // E.164 international format     \&quot;bank_code\&quot;: \&quot;104\&quot;,     \&quot;branch_code\&quot;: \&quot;00001\&quot;,     \&quot;bank_account\&quot;: \&quot;0009795493\&quot;,     \&quot;bank_account_type\&quot;: \&quot;10\&quot;,     \&quot;identity_card_type\&quot;: \&quot;ID\&quot;,     \&quot;identity_card_id\&quot;: \&quot;01234567890\&quot;,     \&quot;transfer_reason\&quot;: \&quot;personal_account\&quot;   } &#x60;&#x60;&#x60;  See [BRL Bank](https://docs.transferzero.com/docs/payout-details/#brlbank) documentation for the bank_code and transfer_reason lists
 */
@ApiModel(description = "PIX Payment: ```JSON   \"details\": {     \"first_name\": \"First\",     \"last_name\": \"Last\",     \"phone_number\": \"+552112345678\", // E.164 international format     \"pix_key_type\": \"email\",     \"pix_key_value\": \"person@example.com\",     \"identity_card_type\": \"ID\",     \"identity_card_id\": \"01234567890\",     \"transfer_reason\": \"personal_account\"   } ```  TED Payment: ```JSON   \"details\": {     \"first_name\": \"First\",     \"last_name\": \"Last\",     \"phone_number\": \"+552112345678\", // E.164 international format     \"bank_code\": \"104\",     \"branch_code\": \"00001\",     \"bank_account\": \"0009795493\",     \"bank_account_type\": \"10\",     \"identity_card_type\": \"ID\",     \"identity_card_id\": \"01234567890\",     \"transfer_reason\": \"personal_account\"   } ```  See [BRL Bank](https://docs.transferzero.com/docs/payout-details/#brlbank) documentation for the bank_code and transfer_reason lists")

public class PayoutMethodDetailsBRLBank {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_BRANCH_CODE = "branch_code";
  @SerializedName(SERIALIZED_NAME_BRANCH_CODE)
  private String branchCode;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_TYPE = "bank_account_type";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_TYPE)
  private PayoutMethodBankAccountTypeEnum bankAccountType;

  public static final String SERIALIZED_NAME_PIX_KEY_TYPE = "pix_key_type";
  @SerializedName(SERIALIZED_NAME_PIX_KEY_TYPE)
  private PayoutMethodPixKeyTypeEnum pixKeyType;

  public static final String SERIALIZED_NAME_PIX_KEY_VALUE = "pix_key_value";
  @SerializedName(SERIALIZED_NAME_PIX_KEY_VALUE)
  private String pixKeyValue;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_TYPE = "identity_card_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_TYPE)
  private PayoutMethodIdentityCardTypeEnum identityCardType;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_ID = "identity_card_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_ID)
  private String identityCardId;

  public static final String SERIALIZED_NAME_TRANSFER_REASON = "transfer_reason";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON)
  private PayoutMethodTransferReasonEnum transferReason;

  public PayoutMethodDetailsBRLBank firstName(String firstName) {
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

  public PayoutMethodDetailsBRLBank lastName(String lastName) {
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

  public PayoutMethodDetailsBRLBank phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PayoutMethodDetailsBRLBank bankCode(String bankCode) {
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

  public PayoutMethodDetailsBRLBank branchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

   /**
   * Get branchCode
   * @return branchCode
  **/
  @ApiModelProperty(value = "")
  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public PayoutMethodDetailsBRLBank bankAccount(String bankAccount) {
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

  public PayoutMethodDetailsBRLBank bankAccountType(PayoutMethodBankAccountTypeEnum bankAccountType) {
    this.bankAccountType = bankAccountType;
    return this;
  }

   /**
   * Get bankAccountType
   * @return bankAccountType
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodBankAccountTypeEnum getBankAccountType() {
    return bankAccountType;
  }

  public void setBankAccountType(PayoutMethodBankAccountTypeEnum bankAccountType) {
    this.bankAccountType = bankAccountType;
  }

  public PayoutMethodDetailsBRLBank pixKeyType(PayoutMethodPixKeyTypeEnum pixKeyType) {
    this.pixKeyType = pixKeyType;
    return this;
  }

   /**
   * Get pixKeyType
   * @return pixKeyType
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodPixKeyTypeEnum getPixKeyType() {
    return pixKeyType;
  }

  public void setPixKeyType(PayoutMethodPixKeyTypeEnum pixKeyType) {
    this.pixKeyType = pixKeyType;
  }

  public PayoutMethodDetailsBRLBank pixKeyValue(String pixKeyValue) {
    this.pixKeyValue = pixKeyValue;
    return this;
  }

   /**
   * Get pixKeyValue
   * @return pixKeyValue
  **/
  @ApiModelProperty(value = "")
  public String getPixKeyValue() {
    return pixKeyValue;
  }

  public void setPixKeyValue(String pixKeyValue) {
    this.pixKeyValue = pixKeyValue;
  }

  public PayoutMethodDetailsBRLBank identityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
    this.identityCardType = identityCardType;
    return this;
  }

   /**
   * Get identityCardType
   * @return identityCardType
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodIdentityCardTypeEnum getIdentityCardType() {
    return identityCardType;
  }

  public void setIdentityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
    this.identityCardType = identityCardType;
  }

  public PayoutMethodDetailsBRLBank identityCardId(String identityCardId) {
    this.identityCardId = identityCardId;
    return this;
  }

   /**
   * Get identityCardId
   * @return identityCardId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIdentityCardId() {
    return identityCardId;
  }

  public void setIdentityCardId(String identityCardId) {
    this.identityCardId = identityCardId;
  }

  public PayoutMethodDetailsBRLBank transferReason(PayoutMethodTransferReasonEnum transferReason) {
    this.transferReason = transferReason;
    return this;
  }

   /**
   * Get transferReason
   * @return transferReason
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodTransferReasonEnum getTransferReason() {
    return transferReason;
  }

  public void setTransferReason(PayoutMethodTransferReasonEnum transferReason) {
    this.transferReason = transferReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsBRLBank payoutMethodDetailsBRLBank = (PayoutMethodDetailsBRLBank) o;
    return Objects.equals(this.firstName, payoutMethodDetailsBRLBank.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsBRLBank.lastName) &&
        Objects.equals(this.phoneNumber, payoutMethodDetailsBRLBank.phoneNumber) &&
        Objects.equals(this.bankCode, payoutMethodDetailsBRLBank.bankCode) &&
        Objects.equals(this.branchCode, payoutMethodDetailsBRLBank.branchCode) &&
        Objects.equals(this.bankAccount, payoutMethodDetailsBRLBank.bankAccount) &&
        Objects.equals(this.bankAccountType, payoutMethodDetailsBRLBank.bankAccountType) &&
        Objects.equals(this.pixKeyType, payoutMethodDetailsBRLBank.pixKeyType) &&
        Objects.equals(this.pixKeyValue, payoutMethodDetailsBRLBank.pixKeyValue) &&
        Objects.equals(this.identityCardType, payoutMethodDetailsBRLBank.identityCardType) &&
        Objects.equals(this.identityCardId, payoutMethodDetailsBRLBank.identityCardId) &&
        Objects.equals(this.transferReason, payoutMethodDetailsBRLBank.transferReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumber, bankCode, branchCode, bankAccount, bankAccountType, pixKeyType, pixKeyValue, identityCardType, identityCardId, transferReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsBRLBank {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
    sb.append("    pixKeyType: ").append(toIndentedString(pixKeyType)).append("\n");
    sb.append("    pixKeyValue: ").append(toIndentedString(pixKeyValue)).append("\n");
    sb.append("    identityCardType: ").append(toIndentedString(identityCardType)).append("\n");
    sb.append("    identityCardId: ").append(toIndentedString(identityCardId)).append("\n");
    sb.append("    transferReason: ").append(toIndentedString(transferReason)).append("\n");
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


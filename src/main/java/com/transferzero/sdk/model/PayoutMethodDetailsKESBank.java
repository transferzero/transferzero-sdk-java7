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
import com.transferzero.sdk.model.PayoutMethodIdentityCardTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;First\&quot;,     \&quot;last_name\&quot;: \&quot;Last\&quot;,     \&quot;street\&quot;: \&quot;Main Street\&quot;,     \&quot;bank_code\&quot;: \&quot;68\&quot;,     \&quot;bank_account\&quot;: \&quot;12345678\&quot;,     \&quot;bank_name\&quot;: \&quot;Equity Bank Ltd\&quot;,     \&quot;branch_code\&quot;: \&quot;404\&quot;,     \&quot;swift_code\&quot; \&quot;ABCLKENA\&quot;,     \&quot;transfer_reason_code\&quot;: \&quot;185\&quot;,     \&quot;identity_card_type\&quot;: \&quot;ID\&quot;,     \&quot;identity_card_id\&quot;: \&quot;AB12345678\&quot;   } &#x60;&#x60;&#x60;  The valid bank_code values are:  - Habib Bank Limited: 08 - Trans-National Bank Limited: 26 - Housing Finance Co. Kenya: 61 - UBA Kenya Bank Ltd: 76 - Kenya Commercial Bank: 01000 - Standard Chartered Bank: 02000 - Barclays Bank of Kenya: 03000 - Bank of India: 05000 - Bank of Boroda: 06000 - NCBA Bank: 07000 - Prime Bank: 10000 - Co-operative Bank of Kenya: 11000 - National Bank of Kenya: 12000 - M-Oriental Commercial Bank Limited: 14000 - Citibank: 16000 - Habib Bank A.G. Zurich: 17000 - Middle East Bank: 18000 - Bank of Africa Kenya: 19000 - Consolidated Bank of Kenya: 23000 - Credit Bank Ltd: 25000 - Chase Bank: 30000 - Stanbic Bank Kenya: 31000 - African Banking Corporation: 35000 - Giro Bank Limited: 42000 - ECO Bank Kenya: 43000 - Spire Bank Limited: 49000 - Paramount Universal Bank Limited: 50000 - Jamii Bora Bank: 51000 - Guaranty Trust Bank Kenya: 53000 - Victoria Bank Limited: 54000 - Guardian Bank: 55000 - Investments and Mortgages Bank Limited: 57000 - Development Bank of Kenya: 59000 - Fidelity Commercial Bank: 46000 - Diamond Trust Bank: 63000 - Sidian Bank: 66000 - Equity Bank Limited: 68000 - Family Bank: 70000 - Gulf African Bank: 72000 - First Community Bank: 74000 - KWFT Bank: 78000  See [KES Bank](https://docs.transferzero.com/docs/payout-details/#kesbank) documentation for the transfer_reason_code list
 */
@ApiModel(description = "```JSON   \"details\": {     \"first_name\": \"First\",     \"last_name\": \"Last\",     \"street\": \"Main Street\",     \"bank_code\": \"68\",     \"bank_account\": \"12345678\",     \"bank_name\": \"Equity Bank Ltd\",     \"branch_code\": \"404\",     \"swift_code\" \"ABCLKENA\",     \"transfer_reason_code\": \"185\",     \"identity_card_type\": \"ID\",     \"identity_card_id\": \"AB12345678\"   } ```  The valid bank_code values are:  - Habib Bank Limited: 08 - Trans-National Bank Limited: 26 - Housing Finance Co. Kenya: 61 - UBA Kenya Bank Ltd: 76 - Kenya Commercial Bank: 01000 - Standard Chartered Bank: 02000 - Barclays Bank of Kenya: 03000 - Bank of India: 05000 - Bank of Boroda: 06000 - NCBA Bank: 07000 - Prime Bank: 10000 - Co-operative Bank of Kenya: 11000 - National Bank of Kenya: 12000 - M-Oriental Commercial Bank Limited: 14000 - Citibank: 16000 - Habib Bank A.G. Zurich: 17000 - Middle East Bank: 18000 - Bank of Africa Kenya: 19000 - Consolidated Bank of Kenya: 23000 - Credit Bank Ltd: 25000 - Chase Bank: 30000 - Stanbic Bank Kenya: 31000 - African Banking Corporation: 35000 - Giro Bank Limited: 42000 - ECO Bank Kenya: 43000 - Spire Bank Limited: 49000 - Paramount Universal Bank Limited: 50000 - Jamii Bora Bank: 51000 - Guaranty Trust Bank Kenya: 53000 - Victoria Bank Limited: 54000 - Guardian Bank: 55000 - Investments and Mortgages Bank Limited: 57000 - Development Bank of Kenya: 59000 - Fidelity Commercial Bank: 46000 - Diamond Trust Bank: 63000 - Sidian Bank: 66000 - Equity Bank Limited: 68000 - Family Bank: 70000 - Gulf African Bank: 72000 - First Community Bank: 74000 - KWFT Bank: 78000  See [KES Bank](https://docs.transferzero.com/docs/payout-details/#kesbank) documentation for the transfer_reason_code list")

public class PayoutMethodDetailsKESBank {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BRANCH_CODE = "branch_code";
  @SerializedName(SERIALIZED_NAME_BRANCH_CODE)
  private String branchCode;

  public static final String SERIALIZED_NAME_SWIFT_CODE = "swift_code";
  @SerializedName(SERIALIZED_NAME_SWIFT_CODE)
  private String swiftCode;

  public static final String SERIALIZED_NAME_TRANSFER_REASON_CODE = "transfer_reason_code";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON_CODE)
  private String transferReasonCode;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_TYPE = "identity_card_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_TYPE)
  private PayoutMethodIdentityCardTypeEnum identityCardType;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_ID = "identity_card_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_ID)
  private String identityCardId;

  public PayoutMethodDetailsKESBank firstName(String firstName) {
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

  public PayoutMethodDetailsKESBank lastName(String lastName) {
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

  public PayoutMethodDetailsKESBank bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Get bankCode
   * @return bankCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public PayoutMethodDetailsKESBank street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public PayoutMethodDetailsKESBank bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PayoutMethodDetailsKESBank bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public PayoutMethodDetailsKESBank branchCode(String branchCode) {
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

  public PayoutMethodDetailsKESBank swiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
    return this;
  }

   /**
   * Get swiftCode
   * @return swiftCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSwiftCode() {
    return swiftCode;
  }

  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }

  public PayoutMethodDetailsKESBank transferReasonCode(String transferReasonCode) {
    this.transferReasonCode = transferReasonCode;
    return this;
  }

   /**
   * Get transferReasonCode
   * @return transferReasonCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTransferReasonCode() {
    return transferReasonCode;
  }

  public void setTransferReasonCode(String transferReasonCode) {
    this.transferReasonCode = transferReasonCode;
  }

  public PayoutMethodDetailsKESBank identityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
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

  public PayoutMethodDetailsKESBank identityCardId(String identityCardId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsKESBank payoutMethodDetailsKESBank = (PayoutMethodDetailsKESBank) o;
    return Objects.equals(this.firstName, payoutMethodDetailsKESBank.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsKESBank.lastName) &&
        Objects.equals(this.bankCode, payoutMethodDetailsKESBank.bankCode) &&
        Objects.equals(this.street, payoutMethodDetailsKESBank.street) &&
        Objects.equals(this.bankAccount, payoutMethodDetailsKESBank.bankAccount) &&
        Objects.equals(this.bankName, payoutMethodDetailsKESBank.bankName) &&
        Objects.equals(this.branchCode, payoutMethodDetailsKESBank.branchCode) &&
        Objects.equals(this.swiftCode, payoutMethodDetailsKESBank.swiftCode) &&
        Objects.equals(this.transferReasonCode, payoutMethodDetailsKESBank.transferReasonCode) &&
        Objects.equals(this.identityCardType, payoutMethodDetailsKESBank.identityCardType) &&
        Objects.equals(this.identityCardId, payoutMethodDetailsKESBank.identityCardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, bankCode, street, bankAccount, bankName, branchCode, swiftCode, transferReasonCode, identityCardType, identityCardId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsKESBank {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    transferReasonCode: ").append(toIndentedString(transferReasonCode)).append("\n");
    sb.append("    identityCardType: ").append(toIndentedString(identityCardType)).append("\n");
    sb.append("    identityCardId: ").append(toIndentedString(identityCardId)).append("\n");
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


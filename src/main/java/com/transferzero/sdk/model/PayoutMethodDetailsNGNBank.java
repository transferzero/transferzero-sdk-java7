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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;First\&quot;,     \&quot;last_name\&quot;: \&quot;Last\&quot;,     \&quot;bank_code\&quot;: \&quot;058\&quot;,     \&quot;bank_account\&quot;: \&quot;123456789\&quot;,     \&quot;bank_account_type\&quot;: \&quot;10\&quot;       # 10 for saving       # 20 for current accounts   } &#x60;&#x60;&#x60;  The valid bank_code values are:  - Access Bank: 044 - Carbon / One Finance: 565 - Citi Bank Group: 023 - Diamond Bank: 063 - EcoBank: 050 - Fairmoney Microfinance Bank LTD: E30 - FCMB Bank: 214 - Fidelity Bank: 070 - First Bank of Nigeria: 011 - Go Money: 326 - Guaranty Trust Bank : 058 - Heritage Bank: 030 - Jaiz Bank: 301 - Keystone: 082 - Kuda Microfinance Bank: 611 - Mainstreet: 014 - Moniepoint Microfinance Bank: 993 - Opay: 305 - Palmpay: B54 - Polaris Bank: 076 - Stanbic IBTC Bank: 039 - Sterling bank: 232 - Union Bank: 032 - United Bank for Africa: 033 - Unity Bank: 215 - VFD Microfinance Bank: 566 - Wema Bank: 035 - Zenith International: 057
 */
@ApiModel(description = "```JSON   \"details\": {     \"first_name\": \"First\",     \"last_name\": \"Last\",     \"bank_code\": \"058\",     \"bank_account\": \"123456789\",     \"bank_account_type\": \"10\"       # 10 for saving       # 20 for current accounts   } ```  The valid bank_code values are:  - Access Bank: 044 - Carbon / One Finance: 565 - Citi Bank Group: 023 - Diamond Bank: 063 - EcoBank: 050 - Fairmoney Microfinance Bank LTD: E30 - FCMB Bank: 214 - Fidelity Bank: 070 - First Bank of Nigeria: 011 - Go Money: 326 - Guaranty Trust Bank : 058 - Heritage Bank: 030 - Jaiz Bank: 301 - Keystone: 082 - Kuda Microfinance Bank: 611 - Mainstreet: 014 - Moniepoint Microfinance Bank: 993 - Opay: 305 - Palmpay: B54 - Polaris Bank: 076 - Stanbic IBTC Bank: 039 - Sterling bank: 232 - Union Bank: 032 - United Bank for Africa: 033 - Unity Bank: 215 - VFD Microfinance Bank: 566 - Wema Bank: 035 - Zenith International: 057")

public class PayoutMethodDetailsNGNBank {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_TYPE = "bank_account_type";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_TYPE)
  private PayoutMethodBankAccountTypeEnum bankAccountType;

  public PayoutMethodDetailsNGNBank firstName(String firstName) {
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

  public PayoutMethodDetailsNGNBank lastName(String lastName) {
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

  public PayoutMethodDetailsNGNBank bankCode(String bankCode) {
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

  public PayoutMethodDetailsNGNBank bankAccount(String bankAccount) {
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

  public PayoutMethodDetailsNGNBank bankAccountType(PayoutMethodBankAccountTypeEnum bankAccountType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsNGNBank payoutMethodDetailsNGNBank = (PayoutMethodDetailsNGNBank) o;
    return Objects.equals(this.firstName, payoutMethodDetailsNGNBank.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsNGNBank.lastName) &&
        Objects.equals(this.bankCode, payoutMethodDetailsNGNBank.bankCode) &&
        Objects.equals(this.bankAccount, payoutMethodDetailsNGNBank.bankAccount) &&
        Objects.equals(this.bankAccountType, payoutMethodDetailsNGNBank.bankAccountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, bankCode, bankAccount, bankAccountType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsNGNBank {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
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


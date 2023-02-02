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
import com.transferzero.sdk.model.PayoutMethodCashProviderEnum;
import com.transferzero.sdk.model.PayoutMethodCountryEnum;
import com.transferzero.sdk.model.PayoutMethodDetailsBRLBank;
import com.transferzero.sdk.model.PayoutMethodDetailsBTC;
import com.transferzero.sdk.model.PayoutMethodDetailsBalance;
import com.transferzero.sdk.model.PayoutMethodDetailsGBPBank;
import com.transferzero.sdk.model.PayoutMethodDetailsGHSBank;
import com.transferzero.sdk.model.PayoutMethodDetailsGHSCash;
import com.transferzero.sdk.model.PayoutMethodDetailsGNFMobile;
import com.transferzero.sdk.model.PayoutMethodDetailsIBAN;
import com.transferzero.sdk.model.PayoutMethodDetailsKESBank;
import com.transferzero.sdk.model.PayoutMethodDetailsKESMobile;
import com.transferzero.sdk.model.PayoutMethodDetailsMADCash;
import com.transferzero.sdk.model.PayoutMethodDetailsMobile;
import com.transferzero.sdk.model.PayoutMethodDetailsNGNBank;
import com.transferzero.sdk.model.PayoutMethodDetailsNZDBank;
import com.transferzero.sdk.model.PayoutMethodDetailsUSDBank;
import com.transferzero.sdk.model.PayoutMethodDetailsUSDCash;
import com.transferzero.sdk.model.PayoutMethodDetailsXAFBank;
import com.transferzero.sdk.model.PayoutMethodDetailsXAFMobile;
import com.transferzero.sdk.model.PayoutMethodDetailsXOFBank;
import com.transferzero.sdk.model.PayoutMethodDetailsXOFCash;
import com.transferzero.sdk.model.PayoutMethodDetailsXOFMobile;
import com.transferzero.sdk.model.PayoutMethodDetailsZARBank;
import com.transferzero.sdk.model.PayoutMethodGenderEnum;
import com.transferzero.sdk.model.PayoutMethodIdentityCardTypeEnum;
import com.transferzero.sdk.model.PayoutMethodLegalEntityTypeEnum;
import com.transferzero.sdk.model.PayoutMethodMobileProviderEnum;
import com.transferzero.sdk.model.PayoutMethodNatureOfBusinessEnum;
import com.transferzero.sdk.model.PayoutMethodPixKeyTypeEnum;
import com.transferzero.sdk.model.PayoutMethodTransferReasonEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PayoutMethodDetails
 */

public class PayoutMethodDetails {
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

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_MOBILE_PROVIDER = "mobile_provider";
  @SerializedName(SERIALIZED_NAME_MOBILE_PROVIDER)
  private PayoutMethodMobileProviderEnum mobileProvider;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private PayoutMethodCountryEnum country;

  public static final String SERIALIZED_NAME_TRANSFER_REASON = "transfer_reason";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON)
  private PayoutMethodTransferReasonEnum transferReason;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_COUNTRY = "bank_country";
  @SerializedName(SERIALIZED_NAME_BANK_COUNTRY)
  private String bankCountry;

  public static final String SERIALIZED_NAME_CASH_PROVIDER = "cash_provider";
  @SerializedName(SERIALIZED_NAME_CASH_PROVIDER)
  private PayoutMethodCashProviderEnum cashProvider;

  public static final String SERIALIZED_NAME_SORT_CODE = "sort_code";
  @SerializedName(SERIALIZED_NAME_SORT_CODE)
  private String sortCode;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  public static final String SERIALIZED_NAME_SENDER_IDENTITY_CARD_TYPE = "sender_identity_card_type";
  @SerializedName(SERIALIZED_NAME_SENDER_IDENTITY_CARD_TYPE)
  private PayoutMethodIdentityCardTypeEnum senderIdentityCardType;

  public static final String SERIALIZED_NAME_SENDER_IDENTITY_CARD_ID = "sender_identity_card_id";
  @SerializedName(SERIALIZED_NAME_SENDER_IDENTITY_CARD_ID)
  private String senderIdentityCardId;

  public static final String SERIALIZED_NAME_SENDER_CITY_OF_BIRTH = "sender_city_of_birth";
  @SerializedName(SERIALIZED_NAME_SENDER_CITY_OF_BIRTH)
  private String senderCityOfBirth;

  public static final String SERIALIZED_NAME_SENDER_COUNTRY_OF_BIRTH = "sender_country_of_birth";
  @SerializedName(SERIALIZED_NAME_SENDER_COUNTRY_OF_BIRTH)
  private String senderCountryOfBirth;

  public static final String SERIALIZED_NAME_SENDER_GENDER = "sender_gender";
  @SerializedName(SERIALIZED_NAME_SENDER_GENDER)
  private PayoutMethodGenderEnum senderGender;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_TYPE = "identity_card_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_TYPE)
  private PayoutMethodIdentityCardTypeEnum identityCardType;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_ID = "identity_card_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_ID)
  private String identityCardId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TRANSFER_REASON_CODE = "transfer_reason_code";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON_CODE)
  private String transferReasonCode;

  public static final String SERIALIZED_NAME_CONTACT_FIRST_NAME = "contact_first_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_FIRST_NAME)
  private String contactFirstName;

  public static final String SERIALIZED_NAME_CONTACT_LAST_NAME = "contact_last_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_LAST_NAME)
  private String contactLastName;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private String registrationNumber;

  public static final String SERIALIZED_NAME_NATURE_OF_BUSINESS = "nature_of_business";
  @SerializedName(SERIALIZED_NAME_NATURE_OF_BUSINESS)
  private PayoutMethodNatureOfBusinessEnum natureOfBusiness;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_TYPE = "legal_entity_type";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_TYPE)
  private PayoutMethodLegalEntityTypeEnum legalEntityType;

  public static final String SERIALIZED_NAME_BRANCH_CODE = "branch_code";
  @SerializedName(SERIALIZED_NAME_BRANCH_CODE)
  private String branchCode;

  public static final String SERIALIZED_NAME_SWIFT_CODE = "swift_code";
  @SerializedName(SERIALIZED_NAME_SWIFT_CODE)
  private String swiftCode;

  public static final String SERIALIZED_NAME_PIX_KEY_TYPE = "pix_key_type";
  @SerializedName(SERIALIZED_NAME_PIX_KEY_TYPE)
  private PayoutMethodPixKeyTypeEnum pixKeyType;

  public static final String SERIALIZED_NAME_PIX_KEY_VALUE = "pix_key_value";
  @SerializedName(SERIALIZED_NAME_PIX_KEY_VALUE)
  private String pixKeyValue;

  public PayoutMethodDetails firstName(String firstName) {
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

  public PayoutMethodDetails lastName(String lastName) {
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

  public PayoutMethodDetails bankCode(String bankCode) {
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

  public PayoutMethodDetails bankAccount(String bankAccount) {
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

  public PayoutMethodDetails bankAccountType(PayoutMethodBankAccountTypeEnum bankAccountType) {
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

  public PayoutMethodDetails phoneNumber(String phoneNumber) {
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

  public PayoutMethodDetails mobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
    this.mobileProvider = mobileProvider;
    return this;
  }

   /**
   * Get mobileProvider
   * @return mobileProvider
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodMobileProviderEnum getMobileProvider() {
    return mobileProvider;
  }

  public void setMobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
    this.mobileProvider = mobileProvider;
  }

  public PayoutMethodDetails country(PayoutMethodCountryEnum country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodCountryEnum getCountry() {
    return country;
  }

  public void setCountry(PayoutMethodCountryEnum country) {
    this.country = country;
  }

  public PayoutMethodDetails transferReason(PayoutMethodTransferReasonEnum transferReason) {
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

  public PayoutMethodDetails iban(String iban) {
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

  public PayoutMethodDetails bankName(String bankName) {
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

  public PayoutMethodDetails bankCountry(String bankCountry) {
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

  public PayoutMethodDetails cashProvider(PayoutMethodCashProviderEnum cashProvider) {
    this.cashProvider = cashProvider;
    return this;
  }

   /**
   * Get cashProvider
   * @return cashProvider
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodCashProviderEnum getCashProvider() {
    return cashProvider;
  }

  public void setCashProvider(PayoutMethodCashProviderEnum cashProvider) {
    this.cashProvider = cashProvider;
  }

  public PayoutMethodDetails sortCode(String sortCode) {
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

  public PayoutMethodDetails bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @ApiModelProperty(value = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public PayoutMethodDetails senderIdentityCardType(PayoutMethodIdentityCardTypeEnum senderIdentityCardType) {
    this.senderIdentityCardType = senderIdentityCardType;
    return this;
  }

   /**
   * Get senderIdentityCardType
   * @return senderIdentityCardType
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodIdentityCardTypeEnum getSenderIdentityCardType() {
    return senderIdentityCardType;
  }

  public void setSenderIdentityCardType(PayoutMethodIdentityCardTypeEnum senderIdentityCardType) {
    this.senderIdentityCardType = senderIdentityCardType;
  }

  public PayoutMethodDetails senderIdentityCardId(String senderIdentityCardId) {
    this.senderIdentityCardId = senderIdentityCardId;
    return this;
  }

   /**
   * Get senderIdentityCardId
   * @return senderIdentityCardId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSenderIdentityCardId() {
    return senderIdentityCardId;
  }

  public void setSenderIdentityCardId(String senderIdentityCardId) {
    this.senderIdentityCardId = senderIdentityCardId;
  }

  public PayoutMethodDetails senderCityOfBirth(String senderCityOfBirth) {
    this.senderCityOfBirth = senderCityOfBirth;
    return this;
  }

   /**
   * Get senderCityOfBirth
   * @return senderCityOfBirth
  **/
  @ApiModelProperty(value = "")
  public String getSenderCityOfBirth() {
    return senderCityOfBirth;
  }

  public void setSenderCityOfBirth(String senderCityOfBirth) {
    this.senderCityOfBirth = senderCityOfBirth;
  }

  public PayoutMethodDetails senderCountryOfBirth(String senderCountryOfBirth) {
    this.senderCountryOfBirth = senderCountryOfBirth;
    return this;
  }

   /**
   * Get senderCountryOfBirth
   * @return senderCountryOfBirth
  **/
  @ApiModelProperty(value = "")
  public String getSenderCountryOfBirth() {
    return senderCountryOfBirth;
  }

  public void setSenderCountryOfBirth(String senderCountryOfBirth) {
    this.senderCountryOfBirth = senderCountryOfBirth;
  }

  public PayoutMethodDetails senderGender(PayoutMethodGenderEnum senderGender) {
    this.senderGender = senderGender;
    return this;
  }

   /**
   * Get senderGender
   * @return senderGender
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodGenderEnum getSenderGender() {
    return senderGender;
  }

  public void setSenderGender(PayoutMethodGenderEnum senderGender) {
    this.senderGender = senderGender;
  }

  public PayoutMethodDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PayoutMethodDetails identityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
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

  public PayoutMethodDetails identityCardId(String identityCardId) {
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

  public PayoutMethodDetails reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PayoutMethodDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PayoutMethodDetails address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PayoutMethodDetails street(String street) {
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

  public PayoutMethodDetails postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PayoutMethodDetails city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PayoutMethodDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PayoutMethodDetails transferReasonCode(String transferReasonCode) {
    this.transferReasonCode = transferReasonCode;
    return this;
  }

   /**
   * Get transferReasonCode
   * @return transferReasonCode
  **/
  @ApiModelProperty(value = "")
  public String getTransferReasonCode() {
    return transferReasonCode;
  }

  public void setTransferReasonCode(String transferReasonCode) {
    this.transferReasonCode = transferReasonCode;
  }

  public PayoutMethodDetails contactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
    return this;
  }

   /**
   * Get contactFirstName
   * @return contactFirstName
  **/
  @ApiModelProperty(value = "")
  public String getContactFirstName() {
    return contactFirstName;
  }

  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }

  public PayoutMethodDetails contactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
    return this;
  }

   /**
   * Get contactLastName
   * @return contactLastName
  **/
  @ApiModelProperty(value = "")
  public String getContactLastName() {
    return contactLastName;
  }

  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }

  public PayoutMethodDetails registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @ApiModelProperty(value = "")
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public PayoutMethodDetails natureOfBusiness(PayoutMethodNatureOfBusinessEnum natureOfBusiness) {
    this.natureOfBusiness = natureOfBusiness;
    return this;
  }

   /**
   * Get natureOfBusiness
   * @return natureOfBusiness
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodNatureOfBusinessEnum getNatureOfBusiness() {
    return natureOfBusiness;
  }

  public void setNatureOfBusiness(PayoutMethodNatureOfBusinessEnum natureOfBusiness) {
    this.natureOfBusiness = natureOfBusiness;
  }

  public PayoutMethodDetails legalEntityType(PayoutMethodLegalEntityTypeEnum legalEntityType) {
    this.legalEntityType = legalEntityType;
    return this;
  }

   /**
   * Get legalEntityType
   * @return legalEntityType
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodLegalEntityTypeEnum getLegalEntityType() {
    return legalEntityType;
  }

  public void setLegalEntityType(PayoutMethodLegalEntityTypeEnum legalEntityType) {
    this.legalEntityType = legalEntityType;
  }

  public PayoutMethodDetails branchCode(String branchCode) {
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

  public PayoutMethodDetails swiftCode(String swiftCode) {
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

  public PayoutMethodDetails pixKeyType(PayoutMethodPixKeyTypeEnum pixKeyType) {
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

  public PayoutMethodDetails pixKeyValue(String pixKeyValue) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetails payoutMethodDetails = (PayoutMethodDetails) o;
    return Objects.equals(this.firstName, payoutMethodDetails.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetails.lastName) &&
        Objects.equals(this.bankCode, payoutMethodDetails.bankCode) &&
        Objects.equals(this.bankAccount, payoutMethodDetails.bankAccount) &&
        Objects.equals(this.bankAccountType, payoutMethodDetails.bankAccountType) &&
        Objects.equals(this.phoneNumber, payoutMethodDetails.phoneNumber) &&
        Objects.equals(this.mobileProvider, payoutMethodDetails.mobileProvider) &&
        Objects.equals(this.country, payoutMethodDetails.country) &&
        Objects.equals(this.transferReason, payoutMethodDetails.transferReason) &&
        Objects.equals(this.iban, payoutMethodDetails.iban) &&
        Objects.equals(this.bankName, payoutMethodDetails.bankName) &&
        Objects.equals(this.bankCountry, payoutMethodDetails.bankCountry) &&
        Objects.equals(this.cashProvider, payoutMethodDetails.cashProvider) &&
        Objects.equals(this.sortCode, payoutMethodDetails.sortCode) &&
        Objects.equals(this.bic, payoutMethodDetails.bic) &&
        Objects.equals(this.senderIdentityCardType, payoutMethodDetails.senderIdentityCardType) &&
        Objects.equals(this.senderIdentityCardId, payoutMethodDetails.senderIdentityCardId) &&
        Objects.equals(this.senderCityOfBirth, payoutMethodDetails.senderCityOfBirth) &&
        Objects.equals(this.senderCountryOfBirth, payoutMethodDetails.senderCountryOfBirth) &&
        Objects.equals(this.senderGender, payoutMethodDetails.senderGender) &&
        Objects.equals(this.reason, payoutMethodDetails.reason) &&
        Objects.equals(this.identityCardType, payoutMethodDetails.identityCardType) &&
        Objects.equals(this.identityCardId, payoutMethodDetails.identityCardId) &&
        Objects.equals(this.reference, payoutMethodDetails.reference) &&
        Objects.equals(this.name, payoutMethodDetails.name) &&
        Objects.equals(this.address, payoutMethodDetails.address) &&
        Objects.equals(this.street, payoutMethodDetails.street) &&
        Objects.equals(this.postalCode, payoutMethodDetails.postalCode) &&
        Objects.equals(this.city, payoutMethodDetails.city) &&
        Objects.equals(this.email, payoutMethodDetails.email) &&
        Objects.equals(this.transferReasonCode, payoutMethodDetails.transferReasonCode) &&
        Objects.equals(this.contactFirstName, payoutMethodDetails.contactFirstName) &&
        Objects.equals(this.contactLastName, payoutMethodDetails.contactLastName) &&
        Objects.equals(this.registrationNumber, payoutMethodDetails.registrationNumber) &&
        Objects.equals(this.natureOfBusiness, payoutMethodDetails.natureOfBusiness) &&
        Objects.equals(this.legalEntityType, payoutMethodDetails.legalEntityType) &&
        Objects.equals(this.branchCode, payoutMethodDetails.branchCode) &&
        Objects.equals(this.swiftCode, payoutMethodDetails.swiftCode) &&
        Objects.equals(this.pixKeyType, payoutMethodDetails.pixKeyType) &&
        Objects.equals(this.pixKeyValue, payoutMethodDetails.pixKeyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, bankCode, bankAccount, bankAccountType, phoneNumber, mobileProvider, country, transferReason, iban, bankName, bankCountry, cashProvider, sortCode, bic, senderIdentityCardType, senderIdentityCardId, senderCityOfBirth, senderCountryOfBirth, senderGender, reason, identityCardType, identityCardId, reference, name, address, street, postalCode, city, email, transferReasonCode, contactFirstName, contactLastName, registrationNumber, natureOfBusiness, legalEntityType, branchCode, swiftCode, pixKeyType, pixKeyValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetails {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    mobileProvider: ").append(toIndentedString(mobileProvider)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    transferReason: ").append(toIndentedString(transferReason)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankCountry: ").append(toIndentedString(bankCountry)).append("\n");
    sb.append("    cashProvider: ").append(toIndentedString(cashProvider)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    senderIdentityCardType: ").append(toIndentedString(senderIdentityCardType)).append("\n");
    sb.append("    senderIdentityCardId: ").append(toIndentedString(senderIdentityCardId)).append("\n");
    sb.append("    senderCityOfBirth: ").append(toIndentedString(senderCityOfBirth)).append("\n");
    sb.append("    senderCountryOfBirth: ").append(toIndentedString(senderCountryOfBirth)).append("\n");
    sb.append("    senderGender: ").append(toIndentedString(senderGender)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    identityCardType: ").append(toIndentedString(identityCardType)).append("\n");
    sb.append("    identityCardId: ").append(toIndentedString(identityCardId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    transferReasonCode: ").append(toIndentedString(transferReasonCode)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    natureOfBusiness: ").append(toIndentedString(natureOfBusiness)).append("\n");
    sb.append("    legalEntityType: ").append(toIndentedString(legalEntityType)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    pixKeyType: ").append(toIndentedString(pixKeyType)).append("\n");
    sb.append("    pixKeyValue: ").append(toIndentedString(pixKeyValue)).append("\n");
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


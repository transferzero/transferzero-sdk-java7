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
import com.transferzero.sdk.model.PayoutMethodCountryEnum;
import com.transferzero.sdk.model.PayoutMethodMobileProviderEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON \&quot;details\&quot;: {   \&quot;phone_number\&quot;: \&quot;+256129999999\&quot;, } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "```JSON \"details\": {   \"phone_number\": \"+256129999999\", } ```")

public class PayinMethodDetailsMobile {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_MOBILE_PROVIDER = "mobile_provider";
  @SerializedName(SERIALIZED_NAME_MOBILE_PROVIDER)
  private PayoutMethodMobileProviderEnum mobileProvider;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private PayoutMethodCountryEnum country;

  public static final String SERIALIZED_NAME_OTP = "otp";
  @SerializedName(SERIALIZED_NAME_OTP)
  private String otp;

  public PayinMethodDetailsMobile phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number where the funds should be collected from
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+256129999999", value = "The phone number where the funds should be collected from")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PayinMethodDetailsMobile mobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
    this.mobileProvider = mobileProvider;
    return this;
  }

   /**
   * Get mobileProvider
   * @return mobileProvider
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodMobileProviderEnum getMobileProvider() {
    return mobileProvider;
  }

  public void setMobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
    this.mobileProvider = mobileProvider;
  }

  public PayinMethodDetailsMobile country(PayoutMethodCountryEnum country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodCountryEnum getCountry() {
    return country;
  }

  public void setCountry(PayoutMethodCountryEnum country) {
    this.country = country;
  }

  public PayinMethodDetailsMobile otp(String otp) {
    this.otp = otp;
    return this;
  }

   /**
   * The OTP that the sender received in otp verified ussd popup ux flow.
   * @return otp
  **/
  @ApiModelProperty(value = "The OTP that the sender received in otp verified ussd popup ux flow.")
  public String getOtp() {
    return otp;
  }

  public void setOtp(String otp) {
    this.otp = otp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayinMethodDetailsMobile payinMethodDetailsMobile = (PayinMethodDetailsMobile) o;
    return Objects.equals(this.phoneNumber, payinMethodDetailsMobile.phoneNumber) &&
        Objects.equals(this.mobileProvider, payinMethodDetailsMobile.mobileProvider) &&
        Objects.equals(this.country, payinMethodDetailsMobile.country) &&
        Objects.equals(this.otp, payinMethodDetailsMobile.otp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, mobileProvider, country, otp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayinMethodDetailsMobile {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    mobileProvider: ").append(toIndentedString(mobileProvider)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
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


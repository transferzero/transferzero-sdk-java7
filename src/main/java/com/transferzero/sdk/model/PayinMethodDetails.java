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
import com.transferzero.sdk.model.PayinMethodDetailsBTC;
import com.transferzero.sdk.model.PayinMethodDetailsMobile;
import com.transferzero.sdk.model.PayinMethodDetailsNGNBank;
import com.transferzero.sdk.model.PayoutMethodMobileProviderEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fields needed by the payment processor. Depends on the chose payin type.  See the appropriate model details for more info:  - &#x60;NGN::Bank&#x60;: see [&#x60;PayinMethodDetailsNGNBank&#x60;](#model-PayinMethodDetailsNGNBank) - &#x60;GHS::Mobile&#x60;: see [&#x60;PayinMethodDetailsMobile&#x60;](#model-PayinMethodDetailsMobile) - &#x60;UGX::Mobile&#x60;: see [&#x60;PayinMethodDetailsMobile&#x60;](#model-PayinMethodDetailsMobile) - &#x60;TZS::Mobile&#x60;: see [&#x60;PayinMethodDetailsMobile&#x60;](#model-PayinMethodDetailsMobile)  Note that some payin processors don&#39;t require additional input, these include &#x60;paga&#x60; through &#x60;NGN::Mobile&#x60;, &#x60;lhv&#x60; through &#x60;EUR::Bank&#x60; and &#x60;GBP::Bank&#x60;. Some providers like &#x60;providus&#x60; also have all of their fields set as optional, so you might not want to set any values. To use these providers please set this value to &#x60;{}&#x60; (an empty hash) 
 */
@ApiModel(description = "Fields needed by the payment processor. Depends on the chose payin type.  See the appropriate model details for more info:  - `NGN::Bank`: see [`PayinMethodDetailsNGNBank`](#model-PayinMethodDetailsNGNBank) - `GHS::Mobile`: see [`PayinMethodDetailsMobile`](#model-PayinMethodDetailsMobile) - `UGX::Mobile`: see [`PayinMethodDetailsMobile`](#model-PayinMethodDetailsMobile) - `TZS::Mobile`: see [`PayinMethodDetailsMobile`](#model-PayinMethodDetailsMobile)  Note that some payin processors don't require additional input, these include `paga` through `NGN::Mobile`, `lhv` through `EUR::Bank` and `GBP::Bank`. Some providers like `providus` also have all of their fields set as optional, so you might not want to set any values. To use these providers please set this value to `{}` (an empty hash) ")

public class PayinMethodDetails {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_MOBILE_PROVIDER = "mobile_provider";
  @SerializedName(SERIALIZED_NAME_MOBILE_PROVIDER)
  private PayoutMethodMobileProviderEnum mobileProvider;

  public static final String SERIALIZED_NAME_OTP = "otp";
  @SerializedName(SERIALIZED_NAME_OTP)
  private String otp;

  public static final String SERIALIZED_NAME_REFUND_ADDRESS = "refund_address";
  @SerializedName(SERIALIZED_NAME_REFUND_ADDRESS)
  private String refundAddress;

  public PayinMethodDetails paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method which the sender will use to make the payments. Options are &#x60;bank&#x60;, &#x60;card&#x60; or you can leave empty to support both.
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The payment method which the sender will use to make the payments. Options are `bank`, `card` or you can leave empty to support both.")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PayinMethodDetails redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * This is where the sender should be redirected back when the payment has been finished
   * @return redirectUrl
  **/
  @ApiModelProperty(value = "This is where the sender should be redirected back when the payment has been finished")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public PayinMethodDetails phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number where the funds should be collected from
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+2569999999", value = "The phone number where the funds should be collected from")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PayinMethodDetails mobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
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

  public PayinMethodDetails otp(String otp) {
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

  public PayinMethodDetails refundAddress(String refundAddress) {
    this.refundAddress = refundAddress;
    return this;
  }

   /**
   * Please make sure the refund_address is a valid BTC address belonging to the sender, as that is going to be used in case the transaction has to be refunded.
   * @return refundAddress
  **/
  @ApiModelProperty(value = "Please make sure the refund_address is a valid BTC address belonging to the sender, as that is going to be used in case the transaction has to be refunded.")
  public String getRefundAddress() {
    return refundAddress;
  }

  public void setRefundAddress(String refundAddress) {
    this.refundAddress = refundAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayinMethodDetails payinMethodDetails = (PayinMethodDetails) o;
    return Objects.equals(this.paymentMethod, payinMethodDetails.paymentMethod) &&
        Objects.equals(this.redirectUrl, payinMethodDetails.redirectUrl) &&
        Objects.equals(this.phoneNumber, payinMethodDetails.phoneNumber) &&
        Objects.equals(this.mobileProvider, payinMethodDetails.mobileProvider) &&
        Objects.equals(this.otp, payinMethodDetails.otp) &&
        Objects.equals(this.refundAddress, payinMethodDetails.refundAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, redirectUrl, phoneNumber, mobileProvider, otp, refundAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayinMethodDetails {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    mobileProvider: ").append(toIndentedString(mobileProvider)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
    sb.append("    refundAddress: ").append(toIndentedString(refundAddress)).append("\n");
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


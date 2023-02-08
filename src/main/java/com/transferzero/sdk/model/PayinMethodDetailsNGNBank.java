/*
 * BitPesa Private API
 * API specification used for internal BitPesa endpoints
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;redirect_url\&quot;: \&quot;http://redirect.back.to\&quot;   } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "```JSON   \"details\": {     \"redirect_url\": \"http://redirect.back.to\"   } ```")

public class PayinMethodDetailsNGNBank {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public PayinMethodDetailsNGNBank paymentMethod(String paymentMethod) {
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

  public PayinMethodDetailsNGNBank redirectUrl(String redirectUrl) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayinMethodDetailsNGNBank payinMethodDetailsNGNBank = (PayinMethodDetailsNGNBank) o;
    return Objects.equals(this.paymentMethod, payinMethodDetailsNGNBank.paymentMethod) &&
        Objects.equals(this.redirectUrl, payinMethodDetailsNGNBank.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, redirectUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayinMethodDetailsNGNBank {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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


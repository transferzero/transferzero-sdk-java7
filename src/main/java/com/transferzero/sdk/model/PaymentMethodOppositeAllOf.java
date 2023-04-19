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
import com.transferzero.sdk.model.PaymentMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentMethodOppositeAllOf
 */

public class PaymentMethodOppositeAllOf {
  public static final String SERIALIZED_NAME_OPPOSITES = "opposites";
  @SerializedName(SERIALIZED_NAME_OPPOSITES)
  private List<PaymentMethod> opposites = new ArrayList<PaymentMethod>();

   /**
   * List of all providers that can be used in conjunction with the main provider
   * @return opposites
  **/
  @ApiModelProperty(value = "List of all providers that can be used in conjunction with the main provider")
  public List<PaymentMethod> getOpposites() {
    return opposites;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodOppositeAllOf paymentMethodOppositeAllOf = (PaymentMethodOppositeAllOf) o;
    return Objects.equals(this.opposites, paymentMethodOppositeAllOf.opposites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opposites);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodOppositeAllOf {\n");
    sb.append("    opposites: ").append(toIndentedString(opposites)).append("\n");
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

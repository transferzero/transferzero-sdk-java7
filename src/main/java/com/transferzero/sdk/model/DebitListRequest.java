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
import com.transferzero.sdk.model.Debit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DebitListRequest
 */

public class DebitListRequest {
  public static final String SERIALIZED_NAME_DEBIT = "debit";
  @SerializedName(SERIALIZED_NAME_DEBIT)
  private List<Debit> debit = new ArrayList<Debit>();

  public DebitListRequest debit(List<Debit> debit) {
    this.debit = debit;
    return this;
  }

  public DebitListRequest addDebitItem(Debit debitItem) {
    if (this.debit == null) {
      this.debit = new ArrayList<Debit>();
    }
    this.debit.add(debitItem);
    return this;
  }

   /**
   * Get debit
   * @return debit
  **/
  @ApiModelProperty(value = "")
  public List<Debit> getDebit() {
    return debit;
  }

  public void setDebit(List<Debit> debit) {
    this.debit = debit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebitListRequest debitListRequest = (DebitListRequest) o;
    return Objects.equals(this.debit, debitListRequest.debit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebitListRequest {\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
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


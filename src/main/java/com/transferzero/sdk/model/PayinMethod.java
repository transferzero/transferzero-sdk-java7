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
import com.transferzero.sdk.model.PayinMethodDetails;
import com.transferzero.sdk.model.PayinMethodState;
import com.transferzero.sdk.model.PayinMethodUxFlow;
import com.transferzero.sdk.model.StateReasonDetails;
import com.transferzero.sdk.model.ValidationErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * This describes the specific details on how the funds should be collected from the sender.
 */
@ApiModel(description = "This describes the specific details on how the funds should be collected from the sender.")

public class PayinMethod {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UX_FLOW = "ux_flow";
  @SerializedName(SERIALIZED_NAME_UX_FLOW)
  private PayinMethodUxFlow uxFlow;

  public static final String SERIALIZED_NAME_IN_DETAILS = "in_details";
  @SerializedName(SERIALIZED_NAME_IN_DETAILS)
  private PayinMethodDetails inDetails = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private PayinMethodState state;

  public static final String SERIALIZED_NAME_STATE_REASON_DETAILS = "state_reason_details";
  @SerializedName(SERIALIZED_NAME_STATE_REASON_DETAILS)
  private StateReasonDetails stateReasonDetails = null;

  public static final String SERIALIZED_NAME_OUT_DETAILS = "out_details";
  @SerializedName(SERIALIZED_NAME_OUT_DETAILS)
  private Object outDetails = null;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private Object instructions = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Map<String, List<ValidationErrorDescription>> errors = new HashMap<String, List<ValidationErrorDescription>>();

  public PayinMethod type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Describes how the payment should be requested from the sender.  Possible values: - &#x60;GHS::Mobile&#x60;: GHS mobile collections - &#x60;UGX::Mobile&#x60;: UGX mobile collections - &#x60;XOF::Mobile&#x60;: XOF mobile collections - &#x60;EUR::Bank&#x60;: EUR IBAN collections - &#x60;GBP::Bank&#x60;: GBP IBAN collections 
   * @return type
  **/
  @ApiModelProperty(example = "GHS::Mobile", value = "Describes how the payment should be requested from the sender.  Possible values: - `GHS::Mobile`: GHS mobile collections - `UGX::Mobile`: UGX mobile collections - `XOF::Mobile`: XOF mobile collections - `EUR::Bank`: EUR IBAN collections - `GBP::Bank`: GBP IBAN collections ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PayinMethod uxFlow(PayinMethodUxFlow uxFlow) {
    this.uxFlow = uxFlow;
    return this;
  }

   /**
   * Get uxFlow
   * @return uxFlow
  **/
  @ApiModelProperty(value = "")
  public PayinMethodUxFlow getUxFlow() {
    return uxFlow;
  }

  public void setUxFlow(PayinMethodUxFlow uxFlow) {
    this.uxFlow = uxFlow;
  }

  public PayinMethod inDetails(PayinMethodDetails inDetails) {
    this.inDetails = inDetails;
    return this;
  }

   /**
   * Get inDetails
   * @return inDetails
  **/
  @ApiModelProperty(value = "")
  public PayinMethodDetails getInDetails() {
    return inDetails;
  }

  public void setInDetails(PayinMethodDetails inDetails) {
    this.inDetails = inDetails;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "97e79719-06e4-4794-aeeb-d2d9415d983a", value = "")
  public UUID getId() {
    return id;
  }

  public PayinMethod state(PayinMethodState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public PayinMethodState getState() {
    return state;
  }

  public void setState(PayinMethodState state) {
    this.state = state;
  }

  public PayinMethod stateReasonDetails(StateReasonDetails stateReasonDetails) {
    this.stateReasonDetails = stateReasonDetails;
    return this;
  }

   /**
   * Get stateReasonDetails
   * @return stateReasonDetails
  **/
  @ApiModelProperty(value = "")
  public StateReasonDetails getStateReasonDetails() {
    return stateReasonDetails;
  }

  public void setStateReasonDetails(StateReasonDetails stateReasonDetails) {
    this.stateReasonDetails = stateReasonDetails;
  }

   /**
   * This will contain the description on where to pay the funds. Please see the [Collections Details](https://docs.transferzero.com/docs/collection-details) in the API documentation on what to expect here.
   * @return outDetails
  **/
  @ApiModelProperty(value = "This will contain the description on where to pay the funds. Please see the [Collections Details](https://docs.transferzero.com/docs/collection-details) in the API documentation on what to expect here.")
  public Object getOutDetails() {
    return outDetails;
  }

   /**
   * This will contain the instructions on how to pay the funds. Please see the [Collections Details](https://docs.transferzero.com/docs/collection-details) in the API documentation on what to expect here.
   * @return instructions
  **/
  @ApiModelProperty(value = "This will contain the instructions on how to pay the funds. Please see the [Collections Details](https://docs.transferzero.com/docs/collection-details) in the API documentation on what to expect here.")
  public Object getInstructions() {
    return instructions;
  }

   /**
   * The fields that have some problems and don&#39;t pass validation
   * @return errors
  **/
  @ApiModelProperty(example = "{\"phone_number\":[{\"error\":\"invalid\"}],\"documents\":[{\"error\":\"blank\"}]}", value = "The fields that have some problems and don't pass validation")
  public Map<String, List<ValidationErrorDescription>> getErrors() {
    return errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayinMethod payinMethod = (PayinMethod) o;
    return Objects.equals(this.type, payinMethod.type) &&
        Objects.equals(this.uxFlow, payinMethod.uxFlow) &&
        Objects.equals(this.inDetails, payinMethod.inDetails) &&
        Objects.equals(this.id, payinMethod.id) &&
        Objects.equals(this.state, payinMethod.state) &&
        Objects.equals(this.stateReasonDetails, payinMethod.stateReasonDetails) &&
        Objects.equals(this.outDetails, payinMethod.outDetails) &&
        Objects.equals(this.instructions, payinMethod.instructions) &&
        Objects.equals(this.errors, payinMethod.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, uxFlow, inDetails, id, state, stateReasonDetails, outDetails, instructions, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayinMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uxFlow: ").append(toIndentedString(uxFlow)).append("\n");
    sb.append("    inDetails: ").append(toIndentedString(inDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateReasonDetails: ").append(toIndentedString(stateReasonDetails)).append("\n");
    sb.append("    outDetails: ").append(toIndentedString(outDetails)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


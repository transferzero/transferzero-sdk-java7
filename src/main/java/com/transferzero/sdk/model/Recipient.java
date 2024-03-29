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
import com.transferzero.sdk.model.PayoutMethod;
import com.transferzero.sdk.model.RecipientState;
import com.transferzero.sdk.model.RecipientStateReasonDetails;
import com.transferzero.sdk.model.TransactionState;
import com.transferzero.sdk.model.ValidationErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * The recipient describes the amount, the currency and the destination where the money should be sent.
 */
@ApiModel(description = "The recipient describes the amount, the currency and the destination where the money should be sent.")

public class Recipient {
  public static final String SERIALIZED_NAME_REQUESTED_AMOUNT = "requested_amount";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AMOUNT)
  private BigDecimal requestedAmount;

  public static final String SERIALIZED_NAME_REQUESTED_CURRENCY = "requested_currency";
  @SerializedName(SERIALIZED_NAME_REQUESTED_CURRENCY)
  private String requestedCurrency;

  public static final String SERIALIZED_NAME_PAYOUT_METHOD = "payout_method";
  @SerializedName(SERIALIZED_NAME_PAYOUT_METHOD)
  private PayoutMethod payoutMethod = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private DateTime createdAt;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable;

  public static final String SERIALIZED_NAME_RETRIABLE = "retriable";
  @SerializedName(SERIALIZED_NAME_RETRIABLE)
  private Boolean retriable;

  public static final String SERIALIZED_NAME_INPUT_USD_AMOUNT = "input_usd_amount";
  @SerializedName(SERIALIZED_NAME_INPUT_USD_AMOUNT)
  private BigDecimal inputUsdAmount;

  public static final String SERIALIZED_NAME_MAY_CANCEL = "may_cancel";
  @SerializedName(SERIALIZED_NAME_MAY_CANCEL)
  private Boolean mayCancel;

  public static final String SERIALIZED_NAME_STATE_REASON = "state_reason";
  @SerializedName(SERIALIZED_NAME_STATE_REASON)
  private String stateReason;

  public static final String SERIALIZED_NAME_STATE_REASON_DETAILS = "state_reason_details";
  @SerializedName(SERIALIZED_NAME_STATE_REASON_DETAILS)
  private RecipientStateReasonDetails stateReasonDetails = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RecipientState state;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_EXTERNAL_ID = "transaction_external_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_EXTERNAL_ID)
  private String transactionExternalId;

  public static final String SERIALIZED_NAME_TRANSACTION_STATE = "transaction_state";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATE)
  private TransactionState transactionState;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchange_rate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private BigDecimal exchangeRate;

  public static final String SERIALIZED_NAME_FEE_FRACTIONAL = "fee_fractional";
  @SerializedName(SERIALIZED_NAME_FEE_FRACTIONAL)
  private BigDecimal feeFractional;

  public static final String SERIALIZED_NAME_INPUT_AMOUNT = "input_amount";
  @SerializedName(SERIALIZED_NAME_INPUT_AMOUNT)
  private BigDecimal inputAmount;

  public static final String SERIALIZED_NAME_INPUT_CURRENCY = "input_currency";
  @SerializedName(SERIALIZED_NAME_INPUT_CURRENCY)
  private String inputCurrency;

  public static final String SERIALIZED_NAME_OUTPUT_AMOUNT = "output_amount";
  @SerializedName(SERIALIZED_NAME_OUTPUT_AMOUNT)
  private BigDecimal outputAmount;

  public static final String SERIALIZED_NAME_OUTPUT_CURRENCY = "output_currency";
  @SerializedName(SERIALIZED_NAME_OUTPUT_CURRENCY)
  private String outputCurrency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  /**
   * Type of recipient to create - either person or business (defaults to person) 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PERSON("person"),
    
    BUSINESS("business");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Map<String, List<ValidationErrorDescription>> errors = new HashMap<String, List<ValidationErrorDescription>>();

  public Recipient requestedAmount(BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

   /**
   * the amount that should be paid to the recipient. This can be in any currency, usually either the input or the output currency. If the value here is not the output currency we will calculate how much the recipient is going to get using the exchange rates active when the transaction was created.
   * @return requestedAmount
  **/
  @ApiModelProperty(example = "750.0", required = true, value = "the amount that should be paid to the recipient. This can be in any currency, usually either the input or the output currency. If the value here is not the output currency we will calculate how much the recipient is going to get using the exchange rates active when the transaction was created.")
  public BigDecimal getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public Recipient requestedCurrency(String requestedCurrency) {
    this.requestedCurrency = requestedCurrency;
    return this;
  }

   /**
   * the currency of the amount in 3-character alpha ISO 4217 currency format
   * @return requestedCurrency
  **/
  @ApiModelProperty(example = "NGN", required = true, value = "the currency of the amount in 3-character alpha ISO 4217 currency format")
  public String getRequestedCurrency() {
    return requestedCurrency;
  }

  public void setRequestedCurrency(String requestedCurrency) {
    this.requestedCurrency = requestedCurrency;
  }

  public Recipient payoutMethod(PayoutMethod payoutMethod) {
    this.payoutMethod = payoutMethod;
    return this;
  }

   /**
   * Get payoutMethod
   * @return payoutMethod
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethod getPayoutMethod() {
    return payoutMethod;
  }

  public void setPayoutMethod(PayoutMethod payoutMethod) {
    this.payoutMethod = payoutMethod;
  }

  public Recipient metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Additional metadata that can be added to a recipient. These values will be returned on request
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "Additional metadata that can be added to a recipient. These values will be returned on request")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

   /**
   * Date and time that the recipient was created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Date and time that the recipient was created.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * Shows whether the recipient can be edited using the PATCH /v1/recipients/{id} endpoint or not
   * @return editable
  **/
  @ApiModelProperty(example = "true", value = "Shows whether the recipient can be edited using the PATCH /v1/recipients/{id} endpoint or not")
  public Boolean getEditable() {
    return editable;
  }

   /**
   * Shows whether the transaction made to the recipient can be retried or not
   * @return retriable
  **/
  @ApiModelProperty(example = "true", value = "Shows whether the transaction made to the recipient can be retried or not")
  public Boolean getRetriable() {
    return retriable;
  }

   /**
   * Shows how much this payment is worth in USD
   * @return inputUsdAmount
  **/
  @ApiModelProperty(example = "10", value = "Shows how much this payment is worth in USD")
  public BigDecimal getInputUsdAmount() {
    return inputUsdAmount;
  }

   /**
   * If true it shows that the payment can be cancelled immediately using the DELETE /v1/recipients/{id} endpoint. If false you can still try to cancel it, however it will only gets cancelled once we have confirmation from our partner that the payment has failed.
   * @return mayCancel
  **/
  @ApiModelProperty(example = "true", value = "If true it shows that the payment can be cancelled immediately using the DELETE /v1/recipients/{id} endpoint. If false you can still try to cancel it, however it will only gets cancelled once we have confirmation from our partner that the payment has failed.")
  public Boolean getMayCancel() {
    return mayCancel;
  }

   /**
   * In case the payment is unsuccessful it holds the error message associated with the last unsuccessful payout.
   * @return stateReason
  **/
  @ApiModelProperty(value = "In case the payment is unsuccessful it holds the error message associated with the last unsuccessful payout.")
  public String getStateReason() {
    return stateReason;
  }

  public Recipient stateReasonDetails(RecipientStateReasonDetails stateReasonDetails) {
    this.stateReasonDetails = stateReasonDetails;
    return this;
  }

   /**
   * Get stateReasonDetails
   * @return stateReasonDetails
  **/
  @ApiModelProperty(value = "")
  public RecipientStateReasonDetails getStateReasonDetails() {
    return stateReasonDetails;
  }

  public void setStateReasonDetails(RecipientStateReasonDetails stateReasonDetails) {
    this.stateReasonDetails = stateReasonDetails;
  }

  public Recipient state(RecipientState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public RecipientState getState() {
    return state;
  }

  public void setState(RecipientState state) {
    this.state = state;
  }

   /**
   * The ID of the transaction that is related to this recipient
   * @return transactionId
  **/
  @ApiModelProperty(example = "97e79719-06e4-4794-aeeb-d2d9415d983a", value = "The ID of the transaction that is related to this recipient")
  public String getTransactionId() {
    return transactionId;
  }

  public Recipient transactionExternalId(String transactionExternalId) {
    this.transactionExternalId = transactionExternalId;
    return this;
  }

   /**
   * Optional ID that is supplied by partner linking it to the partner&#39;s own Transaction ID.
   * @return transactionExternalId
  **/
  @ApiModelProperty(example = "806ec63a-a5a7-43cc-9d75-1ee74fbcc026", value = "Optional ID that is supplied by partner linking it to the partner's own Transaction ID.")
  public String getTransactionExternalId() {
    return transactionExternalId;
  }

  public void setTransactionExternalId(String transactionExternalId) {
    this.transactionExternalId = transactionExternalId;
  }

  public Recipient transactionState(TransactionState transactionState) {
    this.transactionState = transactionState;
    return this;
  }

   /**
   * Get transactionState
   * @return transactionState
  **/
  @ApiModelProperty(value = "")
  public TransactionState getTransactionState() {
    return transactionState;
  }

  public void setTransactionState(TransactionState transactionState) {
    this.transactionState = transactionState;
  }

   /**
   * The exchange rate used in this payment
   * @return exchangeRate
  **/
  @ApiModelProperty(example = "1000", value = "The exchange rate used in this payment")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

   /**
   * The fee for this payment in fractional units (for example cents for USD transactions)
   * @return feeFractional
  **/
  @ApiModelProperty(example = "100", value = "The fee for this payment in fractional units (for example cents for USD transactions)")
  public BigDecimal getFeeFractional() {
    return feeFractional;
  }

   /**
   * The amount that had to be paid in for this payment to proceed
   * @return inputAmount
  **/
  @ApiModelProperty(example = "10", value = "The amount that had to be paid in for this payment to proceed")
  public BigDecimal getInputAmount() {
    return inputAmount;
  }

   /**
   * The currency this payment was paid in
   * @return inputCurrency
  **/
  @ApiModelProperty(example = "USD", value = "The currency this payment was paid in")
  public String getInputCurrency() {
    return inputCurrency;
  }

   /**
   * The amount that will be paid to the recipient
   * @return outputAmount
  **/
  @ApiModelProperty(example = "10000", value = "The amount that will be paid to the recipient")
  public BigDecimal getOutputAmount() {
    return outputAmount;
  }

   /**
   * The currency the payment will be delivered in
   * @return outputCurrency
  **/
  @ApiModelProperty(example = "NGN", value = "The currency the payment will be delivered in")
  public String getOutputCurrency() {
    return outputCurrency;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "97e79719-06e4-4794-aeeb-d2d9415d983a", value = "")
  public UUID getId() {
    return id;
  }

  public Recipient type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of recipient to create - either person or business (defaults to person) 
   * @return type
  **/
  @ApiModelProperty(example = "person", value = "Type of recipient to create - either person or business (defaults to person) ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
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
    Recipient recipient = (Recipient) o;
    return Objects.equals(this.requestedAmount, recipient.requestedAmount) &&
        Objects.equals(this.requestedCurrency, recipient.requestedCurrency) &&
        Objects.equals(this.payoutMethod, recipient.payoutMethod) &&
        Objects.equals(this.metadata, recipient.metadata) &&
        Objects.equals(this.createdAt, recipient.createdAt) &&
        Objects.equals(this.editable, recipient.editable) &&
        Objects.equals(this.retriable, recipient.retriable) &&
        Objects.equals(this.inputUsdAmount, recipient.inputUsdAmount) &&
        Objects.equals(this.mayCancel, recipient.mayCancel) &&
        Objects.equals(this.stateReason, recipient.stateReason) &&
        Objects.equals(this.stateReasonDetails, recipient.stateReasonDetails) &&
        Objects.equals(this.state, recipient.state) &&
        Objects.equals(this.transactionId, recipient.transactionId) &&
        Objects.equals(this.transactionExternalId, recipient.transactionExternalId) &&
        Objects.equals(this.transactionState, recipient.transactionState) &&
        Objects.equals(this.exchangeRate, recipient.exchangeRate) &&
        Objects.equals(this.feeFractional, recipient.feeFractional) &&
        Objects.equals(this.inputAmount, recipient.inputAmount) &&
        Objects.equals(this.inputCurrency, recipient.inputCurrency) &&
        Objects.equals(this.outputAmount, recipient.outputAmount) &&
        Objects.equals(this.outputCurrency, recipient.outputCurrency) &&
        Objects.equals(this.id, recipient.id) &&
        Objects.equals(this.type, recipient.type) &&
        Objects.equals(this.errors, recipient.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedAmount, requestedCurrency, payoutMethod, metadata, createdAt, editable, retriable, inputUsdAmount, mayCancel, stateReason, stateReasonDetails, state, transactionId, transactionExternalId, transactionState, exchangeRate, feeFractional, inputAmount, inputCurrency, outputAmount, outputCurrency, id, type, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    requestedCurrency: ").append(toIndentedString(requestedCurrency)).append("\n");
    sb.append("    payoutMethod: ").append(toIndentedString(payoutMethod)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    retriable: ").append(toIndentedString(retriable)).append("\n");
    sb.append("    inputUsdAmount: ").append(toIndentedString(inputUsdAmount)).append("\n");
    sb.append("    mayCancel: ").append(toIndentedString(mayCancel)).append("\n");
    sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
    sb.append("    stateReasonDetails: ").append(toIndentedString(stateReasonDetails)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionExternalId: ").append(toIndentedString(transactionExternalId)).append("\n");
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    feeFractional: ").append(toIndentedString(feeFractional)).append("\n");
    sb.append("    inputAmount: ").append(toIndentedString(inputAmount)).append("\n");
    sb.append("    inputCurrency: ").append(toIndentedString(inputCurrency)).append("\n");
    sb.append("    outputAmount: ").append(toIndentedString(outputAmount)).append("\n");
    sb.append("    outputCurrency: ").append(toIndentedString(outputCurrency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


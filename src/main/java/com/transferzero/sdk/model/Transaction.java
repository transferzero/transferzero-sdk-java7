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
import com.transferzero.sdk.model.PayinMethod;
import com.transferzero.sdk.model.Recipient;
import com.transferzero.sdk.model.Sender;
import com.transferzero.sdk.model.TransactionState;
import com.transferzero.sdk.model.TransactionTraits;
import com.transferzero.sdk.model.ValidationErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * The template of transactions are the following: &#x60;&#x60;&#x60;JSON {   \&quot;input_currency\&quot;: // currency to pay in,   \&quot;sender\&quot;:{     // details of the sender   },   \&quot;recipients\&quot;:[     {         \&quot;requested_amount\&quot;: // the amount to pay out,         \&quot;requested_currency\&quot;: // the currency of the amount,         \&quot;payout_method\&quot;:{           \&quot;type\&quot;: // method of the payout,           \&quot;details\&quot;:{               // details of the recipient           }         }     }   ],   \&quot;metadata\&quot;: // optional metadata } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "The template of transactions are the following: ```JSON {   \"input_currency\": // currency to pay in,   \"sender\":{     // details of the sender   },   \"recipients\":[     {         \"requested_amount\": // the amount to pay out,         \"requested_currency\": // the currency of the amount,         \"payout_method\":{           \"type\": // method of the payout,           \"details\":{               // details of the recipient           }         }     }   ],   \"metadata\": // optional metadata } ```")

public class Transaction {
  public static final String SERIALIZED_NAME_INPUT_CURRENCY = "input_currency";
  @SerializedName(SERIALIZED_NAME_INPUT_CURRENCY)
  private String inputCurrency;

  public static final String SERIALIZED_NAME_PAYIN_METHODS = "payin_methods";
  @SerializedName(SERIALIZED_NAME_PAYIN_METHODS)
  private List<PayinMethod> payinMethods = new ArrayList<PayinMethod>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private Sender sender = null;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<Recipient> recipients = new ArrayList<Recipient>();

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private TransactionTraits traits = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private TransactionState state;

  public static final String SERIALIZED_NAME_INPUT_AMOUNT = "input_amount";
  @SerializedName(SERIALIZED_NAME_INPUT_AMOUNT)
  private BigDecimal inputAmount;

  public static final String SERIALIZED_NAME_PAYIN_REFERENCE = "payin_reference";
  @SerializedName(SERIALIZED_NAME_PAYIN_REFERENCE)
  private String payinReference;

  public static final String SERIALIZED_NAME_PAID_AMOUNT = "paid_amount";
  @SerializedName(SERIALIZED_NAME_PAID_AMOUNT)
  private BigDecimal paidAmount;

  public static final String SERIALIZED_NAME_DUE_AMOUNT = "due_amount";
  @SerializedName(SERIALIZED_NAME_DUE_AMOUNT)
  private BigDecimal dueAmount;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private DateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private DateTime expiresAt;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Map<String, List<ValidationErrorDescription>> errors = new HashMap<String, List<ValidationErrorDescription>>();

  public Transaction inputCurrency(String inputCurrency) {
    this.inputCurrency = inputCurrency;
    return this;
  }

   /**
   * The input currency describes what currency the transaction will be paid in (3-character alpha ISO 4217 currency format). For example if you wish to create an EUR to NGN transaction then input currency should be set to EUR.
   * @return inputCurrency
  **/
  @ApiModelProperty(example = "NGN", required = true, value = "The input currency describes what currency the transaction will be paid in (3-character alpha ISO 4217 currency format). For example if you wish to create an EUR to NGN transaction then input currency should be set to EUR.")
  public String getInputCurrency() {
    return inputCurrency;
  }

  public void setInputCurrency(String inputCurrency) {
    this.inputCurrency = inputCurrency;
  }

  public Transaction payinMethods(List<PayinMethod> payinMethods) {
    this.payinMethods = payinMethods;
    return this;
  }

  public Transaction addPayinMethodsItem(PayinMethod payinMethodsItem) {
    if (this.payinMethods == null) {
      this.payinMethods = new ArrayList<PayinMethod>();
    }
    this.payinMethods.add(payinMethodsItem);
    return this;
  }

   /**
   * Allows setting alternative collections, where funding the transaction is done through alternative means and not via account balance.  For more information please see [Collections from senders](https://github.com/transferzero/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation
   * @return payinMethods
  **/
  @ApiModelProperty(value = "Allows setting alternative collections, where funding the transaction is done through alternative means and not via account balance.  For more information please see [Collections from senders](https://github.com/transferzero/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation")
  public List<PayinMethod> getPayinMethods() {
    return payinMethods;
  }

  public void setPayinMethods(List<PayinMethod> payinMethods) {
    this.payinMethods = payinMethods;
  }

  public Transaction metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Additional metadata to store on the transaction. If you widh to store your local transaction ID, you should add it here inside a &#x60;sendRef&#x60; field, and we will return this value back to you in the daily transaction reports.
   * @return metadata
  **/
  @ApiModelProperty(example = "{\"sendRef\":\"MONEY-TRANSFER-12543\"}", value = "Additional metadata to store on the transaction. If you widh to store your local transaction ID, you should add it here inside a `sendRef` field, and we will return this value back to you in the daily transaction reports.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public Transaction sender(Sender sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(required = true, value = "")
  public Sender getSender() {
    return sender;
  }

  public void setSender(Sender sender) {
    this.sender = sender;
  }

  public Transaction recipients(List<Recipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public Transaction addRecipientsItem(Recipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * The details of where the payment should go. although transactions can support paying out multiple recipients, usually one is provided. 
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "The details of where the payment should go. although transactions can support paying out multiple recipients, usually one is provided. ")
  public List<Recipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Recipient> recipients) {
    this.recipients = recipients;
  }

  public Transaction traits(TransactionTraits traits) {
    this.traits = traits;
    return this;
  }

   /**
   * Get traits
   * @return traits
  **/
  @ApiModelProperty(value = "")
  public TransactionTraits getTraits() {
    return traits;
  }

  public void setTraits(TransactionTraits traits) {
    this.traits = traits;
  }

  public Transaction state(TransactionState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public TransactionState getState() {
    return state;
  }

  public void setState(TransactionState state) {
    this.state = state;
  }

   /**
   * The amount that was requested in the input currency
   * @return inputAmount
  **/
  @ApiModelProperty(value = "The amount that was requested in the input currency")
  public BigDecimal getInputAmount() {
    return inputAmount;
  }

   /**
   * The reference number that has to be provided in case the transaction is not funded through account balance
   * @return payinReference
  **/
  @ApiModelProperty(value = "The reference number that has to be provided in case the transaction is not funded through account balance")
  public String getPayinReference() {
    return payinReference;
  }

   /**
   * The amount that was already paid in to the transaction
   * @return paidAmount
  **/
  @ApiModelProperty(value = "The amount that was already paid in to the transaction")
  public BigDecimal getPaidAmount() {
    return paidAmount;
  }

   /**
   * The amount needed to be paid in for the transaction to get funded
   * @return dueAmount
  **/
  @ApiModelProperty(value = "The amount needed to be paid in for the transaction to get funded")
  public BigDecimal getDueAmount() {
    return dueAmount;
  }

   /**
   * The time the transaction was created
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time the transaction was created")
  public DateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * The latest time when the transaction has to be funded, otherwise it will be cancelled
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The latest time when the transaction has to be funded, otherwise it will be cancelled")
  public DateTime getExpiresAt() {
    return expiresAt;
  }

  public Transaction externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Optional ID that is supplied by partner linking it to the partner&#39;s own Sender ID. Note: if present we will validate whether the sent ID is a duplicate in our system or not.
   * @return externalId
  **/
  @ApiModelProperty(example = "806ec63a-a5a7-43cc-9d75-1ee74fbcc026", value = "Optional ID that is supplied by partner linking it to the partner's own Sender ID. Note: if present we will validate whether the sent ID is a duplicate in our system or not.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
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
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.inputCurrency, transaction.inputCurrency) &&
        Objects.equals(this.payinMethods, transaction.payinMethods) &&
        Objects.equals(this.metadata, transaction.metadata) &&
        Objects.equals(this.sender, transaction.sender) &&
        Objects.equals(this.recipients, transaction.recipients) &&
        Objects.equals(this.traits, transaction.traits) &&
        Objects.equals(this.state, transaction.state) &&
        Objects.equals(this.inputAmount, transaction.inputAmount) &&
        Objects.equals(this.payinReference, transaction.payinReference) &&
        Objects.equals(this.paidAmount, transaction.paidAmount) &&
        Objects.equals(this.dueAmount, transaction.dueAmount) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.expiresAt, transaction.expiresAt) &&
        Objects.equals(this.externalId, transaction.externalId) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.errors, transaction.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputCurrency, payinMethods, metadata, sender, recipients, traits, state, inputAmount, payinReference, paidAmount, dueAmount, createdAt, expiresAt, externalId, id, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    inputCurrency: ").append(toIndentedString(inputCurrency)).append("\n");
    sb.append("    payinMethods: ").append(toIndentedString(payinMethods)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    inputAmount: ").append(toIndentedString(inputAmount)).append("\n");
    sb.append("    payinReference: ").append(toIndentedString(payinReference)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    dueAmount: ").append(toIndentedString(dueAmount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


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
import com.transferzero.sdk.model.Document;
import com.transferzero.sdk.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * TransactionReq
 */

public class TransactionReq {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Transaction content = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<Document> documents = new ArrayList<Document>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private DateTime createdAt;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TRADE_ID = "trade_id";
  @SerializedName(SERIALIZED_NAME_TRADE_ID)
  private Integer tradeId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Transaction result = null;

  public TransactionReq content(Transaction content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(required = true, value = "")
  public Transaction getContent() {
    return content;
  }

  public void setContent(Transaction content) {
    this.content = content;
  }

  public TransactionReq documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public TransactionReq addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * AML documents related to this transaction request. &#x60;&#x60;&#x60;JSON \&quot;documents\&quot;: [   {     \&quot;id\&quot;: \&quot;b6648ba3-1c7b-4f59-8580-684899c84a07\&quot;   } ] &#x60;&#x60;&#x60;
   * @return documents
  **/
  @ApiModelProperty(example = "[{\"id\":\"b6648ba3-1c7b-4f59-8580-684899c84a07\"}]", value = "AML documents related to this transaction request. ```JSON \"documents\": [   {     \"id\": \"b6648ba3-1c7b-4f59-8580-684899c84a07\"   } ] ```")
  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public TransactionReq metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata of transaction request
   * @return metadata
  **/
  @ApiModelProperty(value = "Metadata of transaction request")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

   /**
   * Date and time the transaction request was created
   * @return createdAt
  **/
  @ApiModelProperty(value = "Date and time the transaction request was created")
  public DateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * State of transaction request
   * @return state
  **/
  @ApiModelProperty(example = "paid", value = "State of transaction request")
  public String getState() {
    return state;
  }

  public TransactionReq tradeId(Integer tradeId) {
    this.tradeId = tradeId;
    return this;
  }

   /**
   * Get tradeId
   * @return tradeId
  **/
  @ApiModelProperty(value = "")
  public Integer getTradeId() {
    return tradeId;
  }

  public void setTradeId(Integer tradeId) {
    this.tradeId = tradeId;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public TransactionReq result(Transaction result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Transaction getResult() {
    return result;
  }

  public void setResult(Transaction result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionReq transactionReq = (TransactionReq) o;
    return Objects.equals(this.content, transactionReq.content) &&
        Objects.equals(this.documents, transactionReq.documents) &&
        Objects.equals(this.metadata, transactionReq.metadata) &&
        Objects.equals(this.createdAt, transactionReq.createdAt) &&
        Objects.equals(this.state, transactionReq.state) &&
        Objects.equals(this.tradeId, transactionReq.tradeId) &&
        Objects.equals(this.id, transactionReq.id) &&
        Objects.equals(this.result, transactionReq.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, documents, metadata, createdAt, state, tradeId, id, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionReq {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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


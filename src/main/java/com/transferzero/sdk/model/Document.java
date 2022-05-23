/*
 * TransferZero API
 * Reference documentation for the TransferZero API V1
 *
 * The version of the OpenAPI document: 1.0
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
import com.transferzero.sdk.model.ValidationErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.joda.time.LocalDate;

/**
 * Document
 */

public class Document {
  public static final String SERIALIZED_NAME_UPLOAD = "upload";
  @SerializedName(SERIALIZED_NAME_UPLOAD)
  private String upload;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_UPLOAD_FILE_NAME = "upload_file_name";
  @SerializedName(SERIALIZED_NAME_UPLOAD_FILE_NAME)
  private String uploadFileName;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_UPLOAD_CONTENT_TYPE = "upload_content_type";
  @SerializedName(SERIALIZED_NAME_UPLOAD_CONTENT_TYPE)
  private String uploadContentType;

  public static final String SERIALIZED_NAME_UPLOAD_FILE_SIZE = "upload_file_size";
  @SerializedName(SERIALIZED_NAME_UPLOAD_FILE_SIZE)
  private Integer uploadFileSize;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  /**
   * The side of the KYC ID. One of &#39;front&#39; or &#39;back&#39;
   */
  @JsonAdapter(SideEnum.Adapter.class)
  public enum SideEnum {
    FRONT("front"),
    
    BACK("back");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SideEnum fromValue(String value) {
      for (SideEnum b : SideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SideEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private SideEnum side;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuing_country";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private String issuingCountry;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "document_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiry_date";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private LocalDate expiryDate;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Map<String, List<ValidationErrorDescription>> errors = null;


  public Document upload(String upload) {
    
    this.upload = upload;
    return this;
  }

   /**
   * Base64 encoded data uri of an image/pdf file or a fully qualified url
   * @return upload
  **/
  @ApiModelProperty(example = "data:image/png;base64,iVBORw0KGg...lFTkSuQmCC", required = true, value = "Base64 encoded data uri of an image/pdf file or a fully qualified url")

  public String getUpload() {
    return upload;
  }



  public void setUpload(String upload) {
    this.upload = upload;
  }


  public Document url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the document location
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://bitpesa-documents.amazonaws.com/document.pdf", value = "URL of the document location")

  public String getUrl() {
    return url;
  }



  public void setUrl(String url) {
    this.url = url;
  }


  public Document uploadFileName(String uploadFileName) {
    
    this.uploadFileName = uploadFileName;
    return this;
  }

   /**
   * Name of the upload
   * @return uploadFileName
  **/
  @ApiModelProperty(example = "example.png", required = true, value = "Name of the upload")

  public String getUploadFileName() {
    return uploadFileName;
  }



  public void setUploadFileName(String uploadFileName) {
    this.uploadFileName = uploadFileName;
  }


  public Document metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata of document
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "Metadata of document")

  public Object getMetadata() {
    return metadata;
  }



  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public Document uploadContentType(String uploadContentType) {
    
    this.uploadContentType = uploadContentType;
    return this;
  }

   /**
   * Get uploadContentType
   * @return uploadContentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "image/png", value = "")

  public String getUploadContentType() {
    return uploadContentType;
  }



  public void setUploadContentType(String uploadContentType) {
    this.uploadContentType = uploadContentType;
  }


  public Document uploadFileSize(Integer uploadFileSize) {
    
    this.uploadFileSize = uploadFileSize;
    return this;
  }

   /**
   * Get uploadFileSize
   * @return uploadFileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30255", value = "")

  public Integer getUploadFileSize() {
    return uploadFileSize;
  }



  public void setUploadFileSize(Integer uploadFileSize) {
    this.uploadFileSize = uploadFileSize;
  }


   /**
   * uncategorised
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "uncategorised")

  public String getCategory() {
    return category;
  }




   /**
   * The side of the KYC ID. One of &#39;front&#39; or &#39;back&#39;
   * @return side
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The side of the KYC ID. One of 'front' or 'back'")

  public SideEnum getSide() {
    return side;
  }




  public Document documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * This is a brief description of the document type
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "certificate_of_business_name_registration", value = "This is a brief description of the document type")

  public String getDocumentType() {
    return documentType;
  }



  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


   /**
   * Issuing country of ID in 2-character alpha ISO 3166-2 country format
   * @return issuingCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NG", value = "Issuing country of ID in 2-character alpha ISO 3166-2 country format")

  public String getIssuingCountry() {
    return issuingCountry;
  }




   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ebe9bc0b-f2f6-4ce8-802a-8b79912d041e", value = "")

  public UUID getId() {
    return id;
  }




  public Document documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * Document ID issued by government
   * @return documentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XYZ12345", value = "Document ID issued by government")

  public String getDocumentId() {
    return documentId;
  }



  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public Document expiryDate(LocalDate expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Document expiry date issued by government
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document expiry date issued by government")

  public LocalDate getExpiryDate() {
    return expiryDate;
  }



  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }


  public Document source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Determines the document&#39;s source. Default value \&quot;Manual\&quot;
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Manual", value = "Determines the document's source. Default value \"Manual\"")

  public String getSource() {
    return source;
  }



  public void setSource(String source) {
    this.source = source;
  }


   /**
   * The fields that have some problems and don&#39;t pass validation
   * @return errors
  **/
  @javax.annotation.Nullable
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
    Document document = (Document) o;
    return Objects.equals(this.upload, document.upload) &&
        Objects.equals(this.url, document.url) &&
        Objects.equals(this.uploadFileName, document.uploadFileName) &&
        Objects.equals(this.metadata, document.metadata) &&
        Objects.equals(this.uploadContentType, document.uploadContentType) &&
        Objects.equals(this.uploadFileSize, document.uploadFileSize) &&
        Objects.equals(this.category, document.category) &&
        Objects.equals(this.side, document.side) &&
        Objects.equals(this.documentType, document.documentType) &&
        Objects.equals(this.issuingCountry, document.issuingCountry) &&
        Objects.equals(this.id, document.id) &&
        Objects.equals(this.documentId, document.documentId) &&
        Objects.equals(this.expiryDate, document.expiryDate) &&
        Objects.equals(this.source, document.source) &&
        Objects.equals(this.errors, document.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upload, url, uploadFileName, metadata, uploadContentType, uploadFileSize, category, side, documentType, issuingCountry, id, documentId, expiryDate, source, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    upload: ").append(toIndentedString(upload)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uploadFileName: ").append(toIndentedString(uploadFileName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    uploadContentType: ").append(toIndentedString(uploadContentType)).append("\n");
    sb.append("    uploadFileSize: ").append(toIndentedString(uploadFileSize)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


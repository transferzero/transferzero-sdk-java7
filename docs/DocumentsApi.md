# DocumentsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocument**](DocumentsApi.md#getDocument) | **GET** /documents/{Document ID} | Fetching a document
[**getDocuments**](DocumentsApi.md#getDocuments) | **GET** /documents | Getting a list of documents
[**postDocuments**](DocumentsApi.md#postDocuments) | **POST** /documents | Creating a document


<a name="getDocument"></a>
# **getDocument**
> DocumentResponse getDocument(documentID).execute();

Fetching a document

Returns a single document by the Documents ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.DocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationKey
ApiKeyAuth AuthorizationKey = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationKey");
AuthorizationKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationKey.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationNonce
ApiKeyAuth AuthorizationNonce = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationNonce");
AuthorizationNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationNonce.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationSecret
ApiKeyAuth AuthorizationSecret = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationSecret");
AuthorizationSecret.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationSecret.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationSignature
ApiKeyAuth AuthorizationSignature = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationSignature");
AuthorizationSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationSignature.setApiKeyPrefix("Token");

DocumentsApi apiInstance = new DocumentsApi();
UUID documentID = new UUID(); // UUID | ID of the document to get.  Example: `/v1/documents/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    DocumentResponse result = apiInstance.getDocument(documentID)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentID** | [**UUID**](.md)| ID of the document to get.  Example: &#x60;/v1/documents/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[AuthorizationKey](../README.md#AuthorizationKey), [AuthorizationNonce](../README.md#AuthorizationNonce), [AuthorizationSecret](../README.md#AuthorizationSecret), [AuthorizationSignature](../README.md#AuthorizationSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocuments"></a>
# **getDocuments**
> DocumentListResponse getDocuments().page(page).per(per).execute();

Getting a list of documents

Fetches a list of documents.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.DocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationKey
ApiKeyAuth AuthorizationKey = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationKey");
AuthorizationKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationKey.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationNonce
ApiKeyAuth AuthorizationNonce = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationNonce");
AuthorizationNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationNonce.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationSecret
ApiKeyAuth AuthorizationSecret = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationSecret");
AuthorizationSecret.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationSecret.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationSignature
ApiKeyAuth AuthorizationSignature = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationSignature");
AuthorizationSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationSignature.setApiKeyPrefix("Token");

DocumentsApi apiInstance = new DocumentsApi();
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
try {
    DocumentListResponse result = apiInstance.getDocuments()
            .page(page)
            .per(per)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page number to request (defaults to 1) | [optional]
 **per** | **Integer**| The number of results to load per page (defaults to 10) | [optional]

### Return type

[**DocumentListResponse**](DocumentListResponse.md)

### Authorization

[AuthorizationKey](../README.md#AuthorizationKey), [AuthorizationNonce](../README.md#AuthorizationNonce), [AuthorizationSecret](../README.md#AuthorizationSecret), [AuthorizationSignature](../README.md#AuthorizationSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postDocuments"></a>
# **postDocuments**
> DocumentResponse postDocuments(documentRequest)

Creating a document

Creates a new document

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.DocumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationKey
ApiKeyAuth AuthorizationKey = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationKey");
AuthorizationKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationKey.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationNonce
ApiKeyAuth AuthorizationNonce = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationNonce");
AuthorizationNonce.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationNonce.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationSecret
ApiKeyAuth AuthorizationSecret = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationSecret");
AuthorizationSecret.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationSecret.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationSignature
ApiKeyAuth AuthorizationSignature = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationSignature");
AuthorizationSignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationSignature.setApiKeyPrefix("Token");

DocumentsApi apiInstance = new DocumentsApi();
DocumentRequest documentRequest = new DocumentRequest(); // DocumentRequest | 
try {
    DocumentResponse result = apiInstance.postDocuments(documentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#postDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentRequest** | [**DocumentRequest**](DocumentRequest.md)|  |

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[AuthorizationKey](../README.md#AuthorizationKey), [AuthorizationNonce](../README.md#AuthorizationNonce), [AuthorizationSecret](../README.md#AuthorizationSecret), [AuthorizationSignature](../README.md#AuthorizationSignature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


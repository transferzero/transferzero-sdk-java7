# LogsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWebhookLog**](LogsApi.md#getWebhookLog) | **GET** /logs/{Webhook Log ID} | Fetch an individual webhook log
[**getWebhookLogs**](LogsApi.md#getWebhookLogs) | **GET** /logs/webhooks | Fetch a list of webhook logs


<a name="getWebhookLog"></a>
# **getWebhookLog**
> WebhookLogResponse getWebhookLog(webhookLogID).execute();

Fetch an individual webhook log

Returns a single webhook log based on the webhook log ID.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.LogsApi;

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

LogsApi apiInstance = new LogsApi();
UUID webhookLogID = new UUID(); // UUID | ID of the webhook log to retrieve  Example: `/v1/logs/9d1ad631-f34a-4cff-9a7e-2c83e3a556df`
try {
    WebhookLogResponse result = apiInstance.getWebhookLog(webhookLogID)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getWebhookLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookLogID** | [**UUID**](.md)| ID of the webhook log to retrieve  Example: &#x60;/v1/logs/9d1ad631-f34a-4cff-9a7e-2c83e3a556df&#x60; |

### Return type

[**WebhookLogResponse**](WebhookLogResponse.md)

### Authorization

[AuthorizationKey](../README.md#AuthorizationKey), [AuthorizationNonce](../README.md#AuthorizationNonce), [AuthorizationSecret](../README.md#AuthorizationSecret), [AuthorizationSignature](../README.md#AuthorizationSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhookLogs"></a>
# **getWebhookLogs**
> WebhookLogListResponse getWebhookLogs().page(page).per(per).createdAtFrom(createdAtFrom).createdAtTo(createdAtTo).execute();

Fetch a list of webhook logs

Returns a list of webhook logs. Response includes pagination.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.LogsApi;

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

LogsApi apiInstance = new LogsApi();
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
String createdAtFrom = "createdAtFrom_example"; // String | Start date to filter recipients by created_at range Allows filtering results by the specified `created_at` timeframe.  Example: `/v1/recipients?created_at_from=2018-06-06&created_at_to=2018-06-08`
String createdAtTo = "createdAtTo_example"; // String | End date to filter recipients by created_at range Allows filtering results by the specified `created_at` timeframe.  Example: `/v1/recipients?created_at_from=2018-06-06&created_at_to=2018-06-08`
try {
    WebhookLogListResponse result = apiInstance.getWebhookLogs()
            .page(page)
            .per(per)
            .createdAtFrom(createdAtFrom)
            .createdAtTo(createdAtTo)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getWebhookLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page number to request (defaults to 1) | [optional]
 **per** | **Integer**| The number of results to load per page (defaults to 10) | [optional]
 **createdAtFrom** | **String**| Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; | [optional]
 **createdAtTo** | **String**| End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; | [optional]

### Return type

[**WebhookLogListResponse**](WebhookLogListResponse.md)

### Authorization

[AuthorizationKey](../README.md#AuthorizationKey), [AuthorizationNonce](../README.md#AuthorizationNonce), [AuthorizationSecret](../README.md#AuthorizationSecret), [AuthorizationSignature](../README.md#AuthorizationSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# PaymentMethodsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentMethodsIn**](PaymentMethodsApi.md#paymentMethodsIn) | **GET** /info/payment_methods/in | This method returns possible payin methods.
[**paymentMethodsOut**](PaymentMethodsApi.md#paymentMethodsOut) | **GET** /info/payment_methods/out | This method returns possible payout methods.


<a name="paymentMethodsIn"></a>
# **paymentMethodsIn**
> PaymentMethodListResponse paymentMethodsIn().execute();

This method returns possible payin methods.

Fetching possible payin methods. 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PaymentMethodsApi;

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

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
try {
    PaymentMethodListResponse result = apiInstance.paymentMethodsIn()
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#paymentMethodsIn");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaymentMethodListResponse**](PaymentMethodListResponse.md)

### Authorization

[AuthorizationKey](../README.md#AuthorizationKey), [AuthorizationNonce](../README.md#AuthorizationNonce), [AuthorizationSecret](../README.md#AuthorizationSecret), [AuthorizationSignature](../README.md#AuthorizationSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentMethodsOut"></a>
# **paymentMethodsOut**
> PaymentMethodListResponse paymentMethodsOut().execute();

This method returns possible payout methods.

Fetching possible payout methods. 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PaymentMethodsApi;

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

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
try {
    PaymentMethodListResponse result = apiInstance.paymentMethodsOut()
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#paymentMethodsOut");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaymentMethodListResponse**](PaymentMethodListResponse.md)

### Authorization

[AuthorizationKey](../README.md#AuthorizationKey), [AuthorizationNonce](../README.md#AuthorizationNonce), [AuthorizationSecret](../README.md#AuthorizationSecret), [AuthorizationSignature](../README.md#AuthorizationSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


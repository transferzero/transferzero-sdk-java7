# AccountValidationApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAccountValidations**](AccountValidationApi.md#postAccountValidations) | **POST** /account_validations | Validates the existence of a bank account or a mobile phone number


<a name="postAccountValidations"></a>
# **postAccountValidations**
> AccountValidationResponse postAccountValidations(accountValidationRequest)

Validates the existence of a bank account or a mobile phone number

Validates the existence of a bank account or mobile phone number and returns the associated customer name

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.AccountValidationApi;

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

AccountValidationApi apiInstance = new AccountValidationApi();
AccountValidationRequest accountValidationRequest = {"bank_account":"12345678","bank_code":"050","country":"NG","currency":"NGN","method":"bank"}; // AccountValidationRequest | 
try {
    AccountValidationResponse result = apiInstance.postAccountValidations(accountValidationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountValidationApi#postAccountValidations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountValidationRequest** | [**AccountValidationRequest**](AccountValidationRequest.md)|  |

### Return type

[**AccountValidationResponse**](AccountValidationResponse.md)

### Authorization

[AuthorizationKey](../README.md#AuthorizationKey), [AuthorizationNonce](../README.md#AuthorizationNonce), [AuthorizationSecret](../README.md#AuthorizationSecret), [AuthorizationSignature](../README.md#AuthorizationSignature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


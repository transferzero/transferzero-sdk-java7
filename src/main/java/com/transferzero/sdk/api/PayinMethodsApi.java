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


package com.transferzero.sdk.api;

import com.transferzero.sdk.ApiCallback;
import com.transferzero.sdk.ApiClient;
import com.transferzero.sdk.ApiException;
import com.transferzero.sdk.ApiResponse;
import com.transferzero.sdk.Configuration;
import com.transferzero.sdk.Pair;
import com.transferzero.sdk.ProgressRequestBody;
import com.transferzero.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.transferzero.sdk.model.PayinMethod;
import com.transferzero.sdk.model.PayinMethodResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayinMethodsApi {
    private ApiClient localVarApiClient;

    public PayinMethodsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PayinMethodsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deletePayinMethod
     * @param payinMethodID ID of the payin method to delete.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deletePayinMethodCall(UUID payinMethodID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/payin_methods/{PayinMethod ID}"
            .replaceAll("\\{" + "PayinMethod ID" + "\\}", localVarApiClient.escapeString(payinMethodID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePayinMethodValidateBeforeCall(UUID payinMethodID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payinMethodID' is set
        if (payinMethodID == null) {
            throw new ApiException("Missing the required parameter 'payinMethodID' when calling deletePayinMethod(Async)");
        }
        

        okhttp3.Call localVarCall = deletePayinMethodCall(payinMethodID, _callback);
        return localVarCall;

    }

    /**
     * Deleting a payin method
     * Initiates a cancellation request for the specified payin method
     * @param payinMethodID ID of the payin method to delete.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @return PayinMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PayinMethodResponse deletePayinMethod(UUID payinMethodID) throws ApiException {
        ApiResponse<PayinMethodResponse> localVarResp = deletePayinMethodWithHttpInfo(payinMethodID);
        return localVarResp.getData();
    }

    /**
     * Deleting a payin method
     * Initiates a cancellation request for the specified payin method
     * @param payinMethodID ID of the payin method to delete.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @return ApiResponse&lt;PayinMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PayinMethodResponse> deletePayinMethodWithHttpInfo(UUID payinMethodID) throws ApiException {
        okhttp3.Call localVarCall = deletePayinMethodValidateBeforeCall(payinMethodID, null);
        Type localVarReturnType = new TypeToken<PayinMethodResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deleting a payin method (asynchronously)
     * Initiates a cancellation request for the specified payin method
     * @param payinMethodID ID of the payin method to delete.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deletePayinMethodAsync(UUID payinMethodID, final ApiCallback<PayinMethodResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePayinMethodValidateBeforeCall(payinMethodID, _callback);
        Type localVarReturnType = new TypeToken<PayinMethodResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    private okhttp3.Call getPayinMethodCall(UUID payinMethodID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/payin_methods/{PayinMethod ID}"
            .replaceAll("\\{" + "PayinMethod ID" + "\\}", localVarApiClient.escapeString(payinMethodID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPayinMethodValidateBeforeCall(UUID payinMethodID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payinMethodID' is set
        if (payinMethodID == null) {
            throw new ApiException("Missing the required parameter 'payinMethodID' when calling getPayinMethod(Async)");
        }
        

        okhttp3.Call localVarCall = getPayinMethodCall(payinMethodID, _callback);
        return localVarCall;

    }


    private ApiResponse<PayinMethodResponse> getPayinMethodWithHttpInfo(UUID payinMethodID) throws ApiException {
        okhttp3.Call localVarCall = getPayinMethodValidateBeforeCall(payinMethodID, null);
        Type localVarReturnType = new TypeToken<PayinMethodResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getPayinMethodAsync(UUID payinMethodID, final ApiCallback<PayinMethodResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPayinMethodValidateBeforeCall(payinMethodID, _callback);
        Type localVarReturnType = new TypeToken<PayinMethodResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetPayinMethodRequest {
        private final UUID payinMethodID;

        private APIgetPayinMethodRequest(UUID payinMethodID) {
            this.payinMethodID = payinMethodID;
        }

        /**
         * Build call for getPayinMethod
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getPayinMethodCall(payinMethodID, _callback);
        }

        /**
         * Execute getPayinMethod request
         * @return PayinMethodResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public PayinMethodResponse execute() throws ApiException {
            ApiResponse<PayinMethodResponse> localVarResp = getPayinMethodWithHttpInfo(payinMethodID);
            return localVarResp.getData();
        }

        /**
         * Execute getPayinMethod request with HTTP info returned
         * @return ApiResponse&lt;PayinMethodResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ApiResponse<PayinMethodResponse> executeWithHttpInfo() throws ApiException {
            return getPayinMethodWithHttpInfo(payinMethodID);
        }

        /**
         * Execute getPayinMethod request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<PayinMethodResponse> _callback) throws ApiException {
            return getPayinMethodAsync(payinMethodID, _callback);
        }
    }

    /**
     * Fetching a payin method
     * Show a payin method by id
     * @param payinMethodID ID of the payin method to get.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @return APIgetPayinMethodRequest
     */
    public APIgetPayinMethodRequest getPayinMethod(UUID payinMethodID) {
        return new APIgetPayinMethodRequest(payinMethodID);
    }
    /**
     * Build call for patchPayinMethod
     * @param payinMethodID ID of the payin method to get.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param payinMethod  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call patchPayinMethodCall(UUID payinMethodID, PayinMethod payinMethod, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = payinMethod;

        // create path and map variables
        String localVarPath = "/payin_methods/{PayinMethod ID}"
            .replaceAll("\\{" + "PayinMethod ID" + "\\}", localVarApiClient.escapeString(payinMethodID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchPayinMethodValidateBeforeCall(UUID payinMethodID, PayinMethod payinMethod, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payinMethodID' is set
        if (payinMethodID == null) {
            throw new ApiException("Missing the required parameter 'payinMethodID' when calling patchPayinMethod(Async)");
        }
        
        // verify the required parameter 'payinMethod' is set
        if (payinMethod == null) {
            throw new ApiException("Missing the required parameter 'payinMethod' when calling patchPayinMethod(Async)");
        }
        

        okhttp3.Call localVarCall = patchPayinMethodCall(payinMethodID, payinMethod, _callback);
        return localVarCall;

    }

    /**
     * Updating a payin method
     * Updates a single payin method by the Payin Method ID
     * @param payinMethodID ID of the payin method to get.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param payinMethod  (required)
     * @return PayinMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PayinMethodResponse patchPayinMethod(UUID payinMethodID, PayinMethod payinMethod) throws ApiException {
        ApiResponse<PayinMethodResponse> localVarResp = patchPayinMethodWithHttpInfo(payinMethodID, payinMethod);
        return localVarResp.getData();
    }

    /**
     * Updating a payin method
     * Updates a single payin method by the Payin Method ID
     * @param payinMethodID ID of the payin method to get.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param payinMethod  (required)
     * @return ApiResponse&lt;PayinMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PayinMethodResponse> patchPayinMethodWithHttpInfo(UUID payinMethodID, PayinMethod payinMethod) throws ApiException {
        okhttp3.Call localVarCall = patchPayinMethodValidateBeforeCall(payinMethodID, payinMethod, null);
        Type localVarReturnType = new TypeToken<PayinMethodResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updating a payin method (asynchronously)
     * Updates a single payin method by the Payin Method ID
     * @param payinMethodID ID of the payin method to get.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param payinMethod  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call patchPayinMethodAsync(UUID payinMethodID, PayinMethod payinMethod, final ApiCallback<PayinMethodResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchPayinMethodValidateBeforeCall(payinMethodID, payinMethod, _callback);
        Type localVarReturnType = new TypeToken<PayinMethodResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retryPayinMethod
     * @param payinMethodID ID of the payin method whose collection process should be retried  Example: &#x60;/v1/payin_methods/9d4d7b73-a94c-4979-ab57-09074fd55d33/retry&#x60; (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call retryPayinMethodCall(UUID payinMethodID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/payin_methods/{PayinMethod ID}/retry"
            .replaceAll("\\{" + "PayinMethod ID" + "\\}", localVarApiClient.escapeString(payinMethodID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retryPayinMethodValidateBeforeCall(UUID payinMethodID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payinMethodID' is set
        if (payinMethodID == null) {
            throw new ApiException("Missing the required parameter 'payinMethodID' when calling retryPayinMethod(Async)");
        }
        

        okhttp3.Call localVarCall = retryPayinMethodCall(payinMethodID, _callback);
        return localVarCall;

    }

    /**
     * Retries PayinMethod
     * Retries the collection process for the payin method.  Please note only payin methods in &#x60;error&#x60; state can be retried.
     * @param payinMethodID ID of the payin method whose collection process should be retried  Example: &#x60;/v1/payin_methods/9d4d7b73-a94c-4979-ab57-09074fd55d33/retry&#x60; (required)
     * @return PayinMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PayinMethodResponse retryPayinMethod(UUID payinMethodID) throws ApiException {
        ApiResponse<PayinMethodResponse> localVarResp = retryPayinMethodWithHttpInfo(payinMethodID);
        return localVarResp.getData();
    }

    /**
     * Retries PayinMethod
     * Retries the collection process for the payin method.  Please note only payin methods in &#x60;error&#x60; state can be retried.
     * @param payinMethodID ID of the payin method whose collection process should be retried  Example: &#x60;/v1/payin_methods/9d4d7b73-a94c-4979-ab57-09074fd55d33/retry&#x60; (required)
     * @return ApiResponse&lt;PayinMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PayinMethodResponse> retryPayinMethodWithHttpInfo(UUID payinMethodID) throws ApiException {
        okhttp3.Call localVarCall = retryPayinMethodValidateBeforeCall(payinMethodID, null);
        Type localVarReturnType = new TypeToken<PayinMethodResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retries PayinMethod (asynchronously)
     * Retries the collection process for the payin method.  Please note only payin methods in &#x60;error&#x60; state can be retried.
     * @param payinMethodID ID of the payin method whose collection process should be retried  Example: &#x60;/v1/payin_methods/9d4d7b73-a94c-4979-ab57-09074fd55d33/retry&#x60; (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call retryPayinMethodAsync(UUID payinMethodID, final ApiCallback<PayinMethodResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = retryPayinMethodValidateBeforeCall(payinMethodID, _callback);
        Type localVarReturnType = new TypeToken<PayinMethodResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

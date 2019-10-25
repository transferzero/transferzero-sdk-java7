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


import com.transferzero.sdk.model.DebitListResponse;
import com.transferzero.sdk.model.DebitRequestWrapper;
import com.transferzero.sdk.model.DebitResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountDebitsApi {
    private ApiClient localVarApiClient;

    public AccountDebitsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountDebitsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getAccountsDebitCall(UUID accountDebitID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/accounts/debits/{Account Debit ID}"
            .replaceAll("\\{" + "Account Debit ID" + "\\}", localVarApiClient.escapeString(accountDebitID.toString()));

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
    private okhttp3.Call getAccountsDebitValidateBeforeCall(UUID accountDebitID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountDebitID' is set
        if (accountDebitID == null) {
            throw new ApiException("Missing the required parameter 'accountDebitID' when calling getAccountsDebit(Async)");
        }
        

        okhttp3.Call localVarCall = getAccountsDebitCall(accountDebitID, _callback);
        return localVarCall;

    }


    private ApiResponse<DebitResponse> getAccountsDebitWithHttpInfo(UUID accountDebitID) throws ApiException {
        okhttp3.Call localVarCall = getAccountsDebitValidateBeforeCall(accountDebitID, null);
        Type localVarReturnType = new TypeToken<DebitResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAccountsDebitAsync(UUID accountDebitID, final ApiCallback<DebitResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccountsDebitValidateBeforeCall(accountDebitID, _callback);
        Type localVarReturnType = new TypeToken<DebitResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetAccountsDebitRequest {
        private final UUID accountDebitID;

        private APIgetAccountsDebitRequest(UUID accountDebitID) {
            this.accountDebitID = accountDebitID;
        }

        /**
         * Build call for getAccountsDebit
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAccountsDebitCall(accountDebitID, _callback);
        }

        /**
         * Execute getAccountsDebit request
         * @return DebitResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public DebitResponse execute() throws ApiException {
            ApiResponse<DebitResponse> localVarResp = getAccountsDebitWithHttpInfo(accountDebitID);
            return localVarResp.getData();
        }

        /**
         * Execute getAccountsDebit request with HTTP info returned
         * @return ApiResponse&lt;DebitResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ApiResponse<DebitResponse> executeWithHttpInfo() throws ApiException {
            return getAccountsDebitWithHttpInfo(accountDebitID);
        }

        /**
         * Execute getAccountsDebit request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<DebitResponse> _callback) throws ApiException {
            return getAccountsDebitAsync(accountDebitID, _callback);
        }
    }

    /**
     * Fetching an account debit
     * Returns a single account debit by the account debit ID
     * @param accountDebitID ID of the account debit to get.  Example: &#x60;/v1/accounts/debits/9170c890-1a45-46bd-9b79-3deeb8b4ff3d&#x60; (required)
     * @return APIgetAccountsDebitRequest
     */
    public APIgetAccountsDebitRequest getAccountsDebit(UUID accountDebitID) {
        return new APIgetAccountsDebitRequest(accountDebitID);
    }
    private okhttp3.Call getAccountsDebitsCall(Integer page, Integer per, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/accounts/debits";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (per != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per", per));
        }

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
    private okhttp3.Call getAccountsDebitsValidateBeforeCall(Integer page, Integer per, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAccountsDebitsCall(page, per, _callback);
        return localVarCall;

    }


    private ApiResponse<DebitListResponse> getAccountsDebitsWithHttpInfo(Integer page, Integer per) throws ApiException {
        okhttp3.Call localVarCall = getAccountsDebitsValidateBeforeCall(page, per, null);
        Type localVarReturnType = new TypeToken<DebitListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAccountsDebitsAsync(Integer page, Integer per, final ApiCallback<DebitListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccountsDebitsValidateBeforeCall(page, per, _callback);
        Type localVarReturnType = new TypeToken<DebitListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetAccountsDebitsRequest {
        private Integer page;
        private Integer per;

        private APIgetAccountsDebitsRequest() {
        }

        /**
         * Set page
         * @param page The page number to request (defaults to 1) (optional)
         * @return APIgetAccountsDebitsRequest
         */
        public APIgetAccountsDebitsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set per
         * @param per The number of results to load per page (defaults to 10) (optional)
         * @return APIgetAccountsDebitsRequest
         */
        public APIgetAccountsDebitsRequest per(Integer per) {
            this.per = per;
            return this;
        }

        /**
         * Build call for getAccountsDebits
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAccountsDebitsCall(page, per, _callback);
        }

        /**
         * Execute getAccountsDebits request
         * @return DebitListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public DebitListResponse execute() throws ApiException {
            ApiResponse<DebitListResponse> localVarResp = getAccountsDebitsWithHttpInfo(page, per);
            return localVarResp.getData();
        }

        /**
         * Execute getAccountsDebits request with HTTP info returned
         * @return ApiResponse&lt;DebitListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ApiResponse<DebitListResponse> executeWithHttpInfo() throws ApiException {
            return getAccountsDebitsWithHttpInfo(page, per);
        }

        /**
         * Execute getAccountsDebits request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<DebitListResponse> _callback) throws ApiException {
            return getAccountsDebitsAsync(page, per, _callback);
        }
    }

    /**
     * Listing Accounts debits
     * Get a list of accounts debits
     * @return APIgetAccountsDebitsRequest
     */
    public APIgetAccountsDebitsRequest getAccountsDebits() {
        return new APIgetAccountsDebitsRequest();
    }
    /**
     * Build call for postAccountsDebits
     * @param debitRequestWrapper  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * Funding Transaction guide including alternative ways to fund transactions.
     * @see <a href="https://github.com/transferzero/api-documentation/blob/master/transaction-flow.md#funding-transactions">Creating an account debit Documentation</a>
     */
    public okhttp3.Call postAccountsDebitsCall(DebitRequestWrapper debitRequestWrapper, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = debitRequestWrapper;

        // create path and map variables
        String localVarPath = "/accounts/debits";

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postAccountsDebitsValidateBeforeCall(DebitRequestWrapper debitRequestWrapper, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'debitRequestWrapper' is set
        if (debitRequestWrapper == null) {
            throw new ApiException("Missing the required parameter 'debitRequestWrapper' when calling postAccountsDebits(Async)");
        }
        

        okhttp3.Call localVarCall = postAccountsDebitsCall(debitRequestWrapper, _callback);
        return localVarCall;

    }

    /**
     * Creating an account debit
     * Creates a new account debit finding transaction through the internal balance  To successfully fund a transaction - - The currency needs to be the same as the input_currency on the transaction - The amount has to be the same as the input_amount on the transaction - The to_id is the id of the transaction - You need to have enough balance of the appropriate currency inside your wallet  Once the transaction is funded, we will immediately start trying to pay out the recipient(s).  It is also possible to create multiple account debits by supplying an array of debit objects 
     * @param debitRequestWrapper  (required)
     * @return DebitListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Funding Transaction guide including alternative ways to fund transactions.
     * @see <a href="https://github.com/transferzero/api-documentation/blob/master/transaction-flow.md#funding-transactions">Creating an account debit Documentation</a>
     */
    public DebitListResponse postAccountsDebits(DebitRequestWrapper debitRequestWrapper) throws ApiException {
        ApiResponse<DebitListResponse> localVarResp = postAccountsDebitsWithHttpInfo(debitRequestWrapper);
        return localVarResp.getData();
    }

    /**
     * Creating an account debit
     * Creates a new account debit finding transaction through the internal balance  To successfully fund a transaction - - The currency needs to be the same as the input_currency on the transaction - The amount has to be the same as the input_amount on the transaction - The to_id is the id of the transaction - You need to have enough balance of the appropriate currency inside your wallet  Once the transaction is funded, we will immediately start trying to pay out the recipient(s).  It is also possible to create multiple account debits by supplying an array of debit objects 
     * @param debitRequestWrapper  (required)
     * @return ApiResponse&lt;DebitListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Funding Transaction guide including alternative ways to fund transactions.
     * @see <a href="https://github.com/transferzero/api-documentation/blob/master/transaction-flow.md#funding-transactions">Creating an account debit Documentation</a>
     */
    public ApiResponse<DebitListResponse> postAccountsDebitsWithHttpInfo(DebitRequestWrapper debitRequestWrapper) throws ApiException {
        okhttp3.Call localVarCall = postAccountsDebitsValidateBeforeCall(debitRequestWrapper, null);
        Type localVarReturnType = new TypeToken<DebitListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creating an account debit (asynchronously)
     * Creates a new account debit finding transaction through the internal balance  To successfully fund a transaction - - The currency needs to be the same as the input_currency on the transaction - The amount has to be the same as the input_amount on the transaction - The to_id is the id of the transaction - You need to have enough balance of the appropriate currency inside your wallet  Once the transaction is funded, we will immediately start trying to pay out the recipient(s).  It is also possible to create multiple account debits by supplying an array of debit objects 
     * @param debitRequestWrapper  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * Funding Transaction guide including alternative ways to fund transactions.
     * @see <a href="https://github.com/transferzero/api-documentation/blob/master/transaction-flow.md#funding-transactions">Creating an account debit Documentation</a>
     */
    public okhttp3.Call postAccountsDebitsAsync(DebitRequestWrapper debitRequestWrapper, final ApiCallback<DebitListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postAccountsDebitsValidateBeforeCall(debitRequestWrapper, _callback);
        Type localVarReturnType = new TypeToken<DebitListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

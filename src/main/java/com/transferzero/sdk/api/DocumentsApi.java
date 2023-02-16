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


import com.transferzero.sdk.model.DocumentListResponse;
import com.transferzero.sdk.model.DocumentRequest;
import com.transferzero.sdk.model.DocumentResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentsApi {
    private ApiClient localVarApiClient;

    public DocumentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getDocumentCall(UUID documentID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/documents/{Document ID}"
            .replaceAll("\\{" + "Document ID" + "\\}", localVarApiClient.escapeString(documentID.toString()));

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
    private okhttp3.Call getDocumentValidateBeforeCall(UUID documentID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'documentID' is set
        if (documentID == null) {
            throw new ApiException("Missing the required parameter 'documentID' when calling getDocument(Async)");
        }
        

        okhttp3.Call localVarCall = getDocumentCall(documentID, _callback);
        return localVarCall;

    }


    private ApiResponse<DocumentResponse> getDocumentWithHttpInfo(UUID documentID) throws ApiException {
        okhttp3.Call localVarCall = getDocumentValidateBeforeCall(documentID, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDocumentAsync(UUID documentID, final ApiCallback<DocumentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentValidateBeforeCall(documentID, _callback);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetDocumentRequest {
        private final UUID documentID;

        private APIgetDocumentRequest(UUID documentID) {
            this.documentID = documentID;
        }

        /**
         * Build call for getDocument
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDocumentCall(documentID, _callback);
        }

        /**
         * Execute getDocument request
         * @return DocumentResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public DocumentResponse execute() throws ApiException {
            ApiResponse<DocumentResponse> localVarResp = getDocumentWithHttpInfo(documentID);
            return localVarResp.getData();
        }

        /**
         * Execute getDocument request with HTTP info returned
         * @return ApiResponse&lt;DocumentResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ApiResponse<DocumentResponse> executeWithHttpInfo() throws ApiException {
            return getDocumentWithHttpInfo(documentID);
        }

        /**
         * Execute getDocument request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<DocumentResponse> _callback) throws ApiException {
            return getDocumentAsync(documentID, _callback);
        }
    }

    /**
     * Fetching a document
     * Returns a single document by the Documents ID
     * @param documentID ID of the document to get.  Example: &#x60;/v1/documents/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @return APIgetDocumentRequest
     */
    public APIgetDocumentRequest getDocument(UUID documentID) {
        return new APIgetDocumentRequest(documentID);
    }
    private okhttp3.Call getDocumentsCall(Integer page, Integer per, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/documents";

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
    private okhttp3.Call getDocumentsValidateBeforeCall(Integer page, Integer per, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getDocumentsCall(page, per, _callback);
        return localVarCall;

    }


    private ApiResponse<DocumentListResponse> getDocumentsWithHttpInfo(Integer page, Integer per) throws ApiException {
        okhttp3.Call localVarCall = getDocumentsValidateBeforeCall(page, per, null);
        Type localVarReturnType = new TypeToken<DocumentListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDocumentsAsync(Integer page, Integer per, final ApiCallback<DocumentListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentsValidateBeforeCall(page, per, _callback);
        Type localVarReturnType = new TypeToken<DocumentListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetDocumentsRequest {
        private Integer page;
        private Integer per;

        private APIgetDocumentsRequest() {
        }

        /**
         * Set page
         * @param page The page number to request (defaults to 1) (optional)
         * @return APIgetDocumentsRequest
         */
        public APIgetDocumentsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set per
         * @param per The number of results to load per page (defaults to 10) (optional)
         * @return APIgetDocumentsRequest
         */
        public APIgetDocumentsRequest per(Integer per) {
            this.per = per;
            return this;
        }

        /**
         * Build call for getDocuments
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDocumentsCall(page, per, _callback);
        }

        /**
         * Execute getDocuments request
         * @return DocumentListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public DocumentListResponse execute() throws ApiException {
            ApiResponse<DocumentListResponse> localVarResp = getDocumentsWithHttpInfo(page, per);
            return localVarResp.getData();
        }

        /**
         * Execute getDocuments request with HTTP info returned
         * @return ApiResponse&lt;DocumentListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ApiResponse<DocumentListResponse> executeWithHttpInfo() throws ApiException {
            return getDocumentsWithHttpInfo(page, per);
        }

        /**
         * Execute getDocuments request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<DocumentListResponse> _callback) throws ApiException {
            return getDocumentsAsync(page, per, _callback);
        }
    }

    /**
     * Getting a list of documents
     * Fetches a list of documents.
     * @return APIgetDocumentsRequest
     */
    public APIgetDocumentsRequest getDocuments() {
        return new APIgetDocumentsRequest();
    }
    /**
     * Build call for postDocuments
     * @param documentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call postDocumentsCall(DocumentRequest documentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = documentRequest;

        // create path and map variables
        String localVarPath = "/documents";

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
    private okhttp3.Call postDocumentsValidateBeforeCall(DocumentRequest documentRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'documentRequest' is set
        if (documentRequest == null) {
            throw new ApiException("Missing the required parameter 'documentRequest' when calling postDocuments(Async)");
        }
        

        okhttp3.Call localVarCall = postDocumentsCall(documentRequest, _callback);
        return localVarCall;

    }

    /**
     * Creating a document
     * Creates a new document
     * @param documentRequest  (required)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postDocuments(DocumentRequest documentRequest) throws ApiException {
        ApiResponse<DocumentResponse> localVarResp = postDocumentsWithHttpInfo(documentRequest);
        return localVarResp.getData();
    }

    /**
     * Creating a document
     * Creates a new document
     * @param documentRequest  (required)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> postDocumentsWithHttpInfo(DocumentRequest documentRequest) throws ApiException {
        okhttp3.Call localVarCall = postDocumentsValidateBeforeCall(documentRequest, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creating a document (asynchronously)
     * Creates a new document
     * @param documentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call postDocumentsAsync(DocumentRequest documentRequest, final ApiCallback<DocumentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postDocumentsValidateBeforeCall(documentRequest, _callback);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

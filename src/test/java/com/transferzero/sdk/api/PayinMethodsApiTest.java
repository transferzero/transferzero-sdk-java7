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

import com.transferzero.sdk.ApiException;
import com.transferzero.sdk.model.PayinMethod;
import com.transferzero.sdk.model.PayinMethodResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayinMethodsApi
 */
@Ignore
public class PayinMethodsApiTest {

    private final PayinMethodsApi api = new PayinMethodsApi();

    
    /**
     * Deleting a payin method
     *
     * Initiates a cancellation request for the specified payin method
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePayinMethodTest() throws ApiException {
        UUID payinMethodID = null;
        PayinMethodResponse response = api.deletePayinMethod(payinMethodID);

        // TODO: test validations
    }
    
    /**
     * Fetching a payin method
     *
     * Show a payin method by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPayinMethodTest() throws ApiException {
        UUID payinMethodID = null;
        PayinMethodResponse response = api.getPayinMethod(payinMethodID)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Updating a payin method
     *
     * Updates the payin method specified in the URL path.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPayinMethodTest() throws ApiException {
        UUID payinMethodID = null;
        PayinMethod payinMethod = null;
        PayinMethodResponse response = api.patchPayinMethod(payinMethodID, payinMethod);

        // TODO: test validations
    }
    
    /**
     * Retries PayinMethod
     *
     * Retries the collection process for the payin method.  Please note only payin methods in &#x60;error&#x60; state can be retried.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retryPayinMethodTest() throws ApiException {
        UUID payinMethodID = null;
        api.retryPayinMethod(payinMethodID);

        // TODO: test validations
    }
    
}

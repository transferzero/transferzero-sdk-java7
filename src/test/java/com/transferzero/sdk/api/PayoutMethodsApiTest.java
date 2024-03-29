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
import com.transferzero.sdk.model.PayoutMethod;
import com.transferzero.sdk.model.PayoutMethodListResponse;
import com.transferzero.sdk.model.PayoutMethodRequest;
import com.transferzero.sdk.model.PayoutMethodResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayoutMethodsApi
 */
@Ignore
public class PayoutMethodsApiTest {

    private final PayoutMethodsApi api = new PayoutMethodsApi();

    
    /**
     * Deleting a payout method
     *
     * Deletes a single payout method by the Payout Method ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePayoutMethodTest() throws ApiException {
        UUID payoutMethodID = null;
        PayoutMethodResponse response = api.deletePayoutMethod(payoutMethodID);

        // TODO: test validations
    }
    
    /**
     * Fetching a payout method
     *
     * Show a payout method by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPayoutMethodTest() throws ApiException {
        UUID payoutMethodID = null;
        PayoutMethodResponse response = api.getPayoutMethod(payoutMethodID)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Listing payout methods
     *
     * List available payout methods
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPayoutMethodsTest() throws ApiException {
        List<String> state = null;
        List<String> type = null;
        String senderId = null;
        Integer page = null;
        Integer per = null;
        String createdAtFrom = null;
        String createdAtTo = null;
        PayoutMethodListResponse response = api.getPayoutMethods()
                .state(state)
                .type(type)
                .senderId(senderId)
                .page(page)
                .per(per)
                .createdAtFrom(createdAtFrom)
                .createdAtTo(createdAtTo)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Updating a payout method
     *
     * Updates a single payout method by the Payout Method ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPayoutMethodTest() throws ApiException {
        UUID payoutMethodID = null;
        PayoutMethod payoutMethod = null;
        PayoutMethodResponse response = api.patchPayoutMethod(payoutMethodID, payoutMethod);

        // TODO: test validations
    }
    
    /**
     * Creating a payout method
     *
     * Creates a new payout method in our system. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPayoutMethodsTest() throws ApiException {
        PayoutMethodRequest payoutMethodRequest = null;
        PayoutMethodResponse response = api.postPayoutMethods(payoutMethodRequest);

        // TODO: test validations
    }
    
}

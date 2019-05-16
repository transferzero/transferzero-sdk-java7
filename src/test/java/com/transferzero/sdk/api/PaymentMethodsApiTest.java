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
import com.transferzero.sdk.model.PaymentMethodListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentMethodsApi
 */
@Ignore
public class PaymentMethodsApiTest {

    private final PaymentMethodsApi api = new PaymentMethodsApi();

    
    /**
     * This method returns possible payin methods.
     *
     * Fetching possible payin methods. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentMethodsInTest() throws ApiException {
        PaymentMethodListResponse response = api.paymentMethodsIn();

        // TODO: test validations
    }
    
    /**
     * This method returns possible payout methods.
     *
     * Fetching possible payout methods. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentMethodsOutTest() throws ApiException {
        PaymentMethodListResponse response = api.paymentMethodsOut();

        // TODO: test validations
    }
    
}

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
import com.transferzero.sdk.model.AccountValidationRequest;
import com.transferzero.sdk.model.AccountValidationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountValidationApi
 */
@Ignore
public class AccountValidationApiTest {

    private final AccountValidationApi api = new AccountValidationApi();

    
    /**
     * Validates the existence of a bank account or a mobile phone number
     *
     * Validates the existence of a bank account or mobile phone number and returns the associated customer name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAccountValidationsTest() throws ApiException {
        AccountValidationRequest accountValidationRequest = null;
        AccountValidationResponse response = api.postAccountValidations(accountValidationRequest);

        // TODO: test validations
    }
    
}

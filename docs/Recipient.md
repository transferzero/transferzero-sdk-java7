

# Recipient

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestedAmount** | [**BigDecimal**](BigDecimal.md) | the amount that should be paid to the recipient. This can be in any currency, usually either the input or the output currency. If the value here is not the output currency we will calculate how much the recipient is going to get using the exchange rates active when the transaction was created. | 
**requestedCurrency** | **String** | the currency of the amount in 3-character alpha ISO 4217 currency format | 
**payoutMethod** | [**PayoutMethod**](PayoutMethod.md) |  | 
**metadata** | [**Object**](.md) | Additional metadata that can be added to a recipient. These values will be returned on request |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Date and time that the recipient was created. |  [optional]
**editable** | **Boolean** | Shows whether the recipient can be edited using the PATCH /v1/recipients/{id} endpoint or not |  [optional]
**retriable** | **Boolean** | Shows whether the transaction made to the recipient can be retried or not |  [optional]
**inputUsdAmount** | [**BigDecimal**](BigDecimal.md) | Shows how much this payment is worth in USD |  [optional]
**mayCancel** | **Boolean** | If true it shows that the payment can be cancelled immediately using the DELETE /v1/recipients/{id} endpoint. If false you can still try to cancel it, however it will only gets cancelled once we have confirmation from our partner that the payment has failed. |  [optional]
**stateReason** | **String** | In case the payment is unsuccessful it holds the error message associated with the last unsuccessful payout. |  [optional]
**stateReasonDetails** | [**RecipientStateReasonDetails**](RecipientStateReasonDetails.md) |  |  [optional]
**state** | [**RecipientState**](RecipientState.md) |  |  [optional]
**transactionId** | **String** | The ID of the transaction that is related to this recipient |  [optional]
**transactionExternalId** | **String** | Optional ID that is supplied by partner linking it to the partner&#39;s own Transaction ID. |  [optional]
**transactionState** | [**TransactionState**](TransactionState.md) |  |  [optional]
**exchangeRate** | [**BigDecimal**](BigDecimal.md) | The exchange rate used in this payment |  [optional]
**feeFractional** | [**BigDecimal**](BigDecimal.md) | The fee for this payment in fractional units (for example cents for USD transactions) |  [optional]
**inputAmount** | [**BigDecimal**](BigDecimal.md) | The amount that had to be paid in for this payment to proceed |  [optional]
**inputCurrency** | **String** | The currency this payment was paid in |  [optional]
**outputAmount** | [**BigDecimal**](BigDecimal.md) | The amount that will be paid to the recipient |  [optional]
**outputCurrency** | **String** | The currency the payment will be delivered in |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of recipient to create - either person or business (defaults to person)  |  [optional]
**errors** | [**Map&lt;String, List&lt;ValidationErrorDescription&gt;&gt;**](List.md) | The fields that have some problems and don&#39;t pass validation |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
PERSON | &quot;person&quot;
BUSINESS | &quot;business&quot;




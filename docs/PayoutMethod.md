

# PayoutMethod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Contains the currency to send the money to, and the type of the money movement  Commonly used payout types are:  - &#x60;NGN::Bank&#x60; - for Nigerian bank account payments. - &#x60;GHS::Bank&#x60; - for Ghanaian bank account payments. - &#x60;GHS::Mobile&#x60; - for Ghanaian mobile money payments. - &#x60;GHS::Cash&#x60; - for Ghanaian cash remittance payments. - &#x60;UGX::Mobile&#x60; - for Ugandan mobile money payments. - &#x60;XOF::Mobile&#x60; - for mobile money payments to West-Africa. - &#x60;XOF::Bank&#x60; - for Senegalese bank account payments. - &#x60;XOF::Cash&#x60; - for Senegalese cash remittance payments. - &#x60;MAD::Cash&#x60; - for Moroccan cash remittance payments. - &#x60;EUR::Bank&#x60; - for IBAN bank transfers in EUR. - &#x60;GBP::Bank&#x60; - for IBAN bank and FP accounts transfers in GBP. - &#x60;ZAR::Bank&#x60; - for South Africa bank account payments. - &#x60;USD::Bank&#x60; - for USD account payments. *** Currently for Egypt, Nigeria and United States only and in Beta phase *** - &#x60;USD::Cash&#x60; - for USD cash remittance payments. *** Currently for Nigeria only and in Beta phase *** - &#x60;KES::Bank&#x60; - for Kenyan bank account payments. - &#x60;KES::Mobile&#x60; - for Kenyan mobile money payments. - &#x60;XAF::Mobile&#x60; - for mobile money payments to Central African (CEMAC) countries. *** Currently in Beta phase *** - &#x60;XAF::Bank&#x60; - for Cameroon bank account payments. - &#x60;GNF::Mobile&#x60; - for mobile money payments to Guinea. - &#x60;BRL::Bank&#x60; - for Brazilian bank account payments. - &#x60;NZD::Bank&#x60; - for New Zealand bank account payments. - &#x60;INR::Bank&#x60; - for Indian bank account payments. - &#x60;BWP::Bank&#x60; - for Botswana bank account payments. - &#x60;ZMW::Bank&#x60; - for Zambian bank account payments. - &#x60;CAD::Bank&#x60; - for Canadian bank account payments. - &#x60;UGX::Bank&#x60; - for Ugandan bank account payments. - &#x60;EGP::Bank&#x60; - for Egyptian bank account payments. - &#x60;EGP::Cash&#x60; - for Egyptian cash payments.  You can also send funds to the internal balance using &#x60;CCY::Balance&#x60;, where &#x60;CCY&#x60; is the appropriate currency. See [Collection from senders](https://docs.transferzero.com/docs/additional-features/#collections-from-senders) for more info on how to collect money into internal balance  |  [optional]
**details** | [**PayoutMethodDetails**](PayoutMethodDetails.md) |  |  [optional]
**metadata** | [**Object**](.md) | Metadata of payout method. You can store any kind of information in this field. |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**errors** | [**Map&lt;String, List&lt;ValidationErrorDescription&gt;&gt;**](List.md) | The fields that have some problems and don&#39;t pass validation |  [optional]
**fields** | [**Map&lt;String, FieldDescription&gt;**](FieldDescription.md) | The fields needed for payments with this payment method with details on validation requirements |  [optional]




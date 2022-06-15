# transferzero-sdk-java7

TransferZero API
- API version: 1.0

Reference documentation for the TransferZero API V1

For more information, please visit:

* [API Documentation](https://docs.transferzero.com)
  * [Onboarding guide](https://docs.transferzero.com/docs/quick-integration/)
  * [Transaction flow](https://docs.transferzero.com/docs/transaction-flow/)
  * [Additional features](https://docs.transferzero.com/docs/additional-features/)
* [API Specification](https://api.transferzero.com/documentation)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.transferzero.sdk</groupId>
  <artifactId>transferzero-sdk-java7</artifactId>
  <version>1.20.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.transferzero.sdk:transferzero-sdk-java7:1.20.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/transferzero-sdk-java7-1.20.0-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction.

You can find examples in the `examples` directory on the features required by the [Onboarding documentation](https://docs.transferzero.com/docs/quick-integration/)

## Webhooks

To parse webhooks you can use the following snippet:

```java
String webhookContent = "{ (...) }"; // The string received through the webhook callback url
String webhookUrl = "<url>"; // The url of the webhook
Map<String, String> webhookHeaders = new HashMap<String, String>();

webhookHeaders.put("Authorization-Nonce", "<nonce from headers>");
webhookHeaders.put("Authorization-Key", "<key from headers>");
webhookHeaders.put("Authorization-Signature", "<signature from headers>");

if (apiClient.validateWebhookRequest(webhookUrl, webhookContent, webhookHeaders)) {
    Webhook webhook = apiClient.parseResponseString(webhookContent, Webhook.class);
    if (webhook.getEvent().startsWith("transaction")) {
        TransactionWebhook transactionWebhook = apiClient.parseResponseString(webhookContent, TransactionWebhook.class);
        System.out.println(transactionWebhook);
    } else if (webhook.getEvent().startsWith("recipient")) {
        RecipientWebhook recipientWebhook = apiClient.parseResponseString(webhookContent, RecipientWebhook.class);
        System.out.println(recipientWebhook);
    } else if (webhook.getEvent().startsWith("payout_method")) {
        PayoutMethodWebhook payoutMethodWebhook = apiClient.parseResponseString(webhookContent, PayoutMethodWebhook.class);
        System.out.println(payoutMethodWebhook);
    } else if (webhook.getEvent().startsWith("sender")) {
        SenderWebhook senderWebhook = apiClient.parseResponseString(webhookContent, SenderWebhook.class);
        System.out.println(senderWebhook);
    } else if (webhook.getEvent().startsWith("document")) {
        DocumentWebhook documentWebhook = apiClient.parseResponseString(webhookContent, DocumentWebhook.class);
        System.out.println(documentWebhook);
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountDebitsApi* | [**getAccountsDebit**](docs/AccountDebitsApi.md#getAccountsDebit) | **GET** /accounts/debits/{Account Debit ID} | Fetching an account debit
*AccountDebitsApi* | [**getAccountsDebits**](docs/AccountDebitsApi.md#getAccountsDebits) | **GET** /accounts/debits | Listing Accounts debits
*AccountDebitsApi* | [**postAccountsDebits**](docs/AccountDebitsApi.md#postAccountsDebits) | **POST** /accounts/debits | Creating an account debit
*AccountValidationApi* | [**postAccountValidations**](docs/AccountValidationApi.md#postAccountValidations) | **POST** /account_validations | Validates the existence of a bank account or a mobile phone number
*AccountsApi* | [**getAccount**](docs/AccountsApi.md#getAccount) | **GET** /accounts/{Currency} | Fetches account balance for specified currrency
*AccountsApi* | [**getAccounts**](docs/AccountsApi.md#getAccounts) | **GET** /accounts | Fetches account balances for all currencies
*ApiLogsApi* | [**getApiLog**](docs/ApiLogsApi.md#getApiLog) | **GET** /api_logs/{API Log ID} | Fetch an individual API log
*ApiLogsApi* | [**getApiLogs**](docs/ApiLogsApi.md#getApiLogs) | **GET** /api_logs | Fetch a list of API logs
*CurrencyInfoApi* | [**infoCurrencies**](docs/CurrencyInfoApi.md#infoCurrencies) | **GET** /info/currencies | Getting a list of possible requested currencies
*CurrencyInfoApi* | [**infoCurrenciesIn**](docs/CurrencyInfoApi.md#infoCurrenciesIn) | **GET** /info/currencies/in | Getting a list of possible input currencies
*CurrencyInfoApi* | [**infoCurrenciesOut**](docs/CurrencyInfoApi.md#infoCurrenciesOut) | **GET** /info/currencies/out | Getting a list of possible output currencies
*DocumentsApi* | [**getDocument**](docs/DocumentsApi.md#getDocument) | **GET** /documents/{Document ID} | Fetching a document
*DocumentsApi* | [**getDocuments**](docs/DocumentsApi.md#getDocuments) | **GET** /documents | Getting a list of documents
*DocumentsApi* | [**postDocuments**](docs/DocumentsApi.md#postDocuments) | **POST** /documents | Creating a document
*LogsApi* | [**getWebhookLog**](docs/LogsApi.md#getWebhookLog) | **GET** /logs/{Webhook Log ID} | Fetch an individual webhook log
*LogsApi* | [**getWebhookLogs**](docs/LogsApi.md#getWebhookLogs) | **GET** /logs/webhooks | Fetch a list of webhook logs
*PayinMethodsApi* | [**deletePayinMethod**](docs/PayinMethodsApi.md#deletePayinMethod) | **DELETE** /payin_methods/{PayinMethod ID} | Deleting a payin method
*PayinMethodsApi* | [**getPayinMethod**](docs/PayinMethodsApi.md#getPayinMethod) | **GET** /payin_methods/{PayinMethod ID} | Fetching a payin method
*PayinMethodsApi* | [**patchPayinMethod**](docs/PayinMethodsApi.md#patchPayinMethod) | **PATCH** /payin_methods/{PayinMethod ID} | Updating a payin method
*PayinMethodsApi* | [**retryPayinMethod**](docs/PayinMethodsApi.md#retryPayinMethod) | **POST** /payin_methods/{PayinMethod ID}/retry | Retries PayinMethod
*PaymentMethodsApi* | [**paymentMethodsIn**](docs/PaymentMethodsApi.md#paymentMethodsIn) | **GET** /info/payment_methods/in | This method returns possible payin methods.
*PaymentMethodsApi* | [**paymentMethodsOut**](docs/PaymentMethodsApi.md#paymentMethodsOut) | **GET** /info/payment_methods/out | This method returns possible payout methods.
*PayoutMethodsApi* | [**deletePayoutMethod**](docs/PayoutMethodsApi.md#deletePayoutMethod) | **DELETE** /payout_methods/{Payout Method ID} | Deleting a payout method
*PayoutMethodsApi* | [**getPayoutMethod**](docs/PayoutMethodsApi.md#getPayoutMethod) | **GET** /payout_methods/{Payout Method ID} | Fetching a payout method
*PayoutMethodsApi* | [**getPayoutMethods**](docs/PayoutMethodsApi.md#getPayoutMethods) | **GET** /payout_methods | Listing payout methods
*PayoutMethodsApi* | [**patchPayoutMethod**](docs/PayoutMethodsApi.md#patchPayoutMethod) | **PATCH** /payout_methods/{Payout Method ID} | Updating a payout method
*PayoutMethodsApi* | [**postPayoutMethods**](docs/PayoutMethodsApi.md#postPayoutMethods) | **POST** /payout_methods | Creating a payout method
*RecipientsApi* | [**deleteRecipient**](docs/RecipientsApi.md#deleteRecipient) | **DELETE** /recipients/{Recipient ID} | Cancelling a recipient
*RecipientsApi* | [**getRecipients**](docs/RecipientsApi.md#getRecipients) | **GET** /recipients | Getting a list of recipients with filtering
*RecipientsApi* | [**patchRecipient**](docs/RecipientsApi.md#patchRecipient) | **PATCH** /recipients/{Recipient ID} | Updating a recipient
*RecipientsApi* | [**proofOfPayments**](docs/RecipientsApi.md#proofOfPayments) | **GET** /recipients/{Recipient ID}/proof_of_payments | Returns list of proof of payments
*SendersApi* | [**deleteSender**](docs/SendersApi.md#deleteSender) | **DELETE** /senders/{Sender ID} | Deleting a sender
*SendersApi* | [**getSender**](docs/SendersApi.md#getSender) | **GET** /senders/{Sender ID} | Fetching a sender
*SendersApi* | [**getSenders**](docs/SendersApi.md#getSenders) | **GET** /senders | Listing senders
*SendersApi* | [**patchSender**](docs/SendersApi.md#patchSender) | **PATCH** /senders/{Sender ID} | Updating a sender
*SendersApi* | [**postSenders**](docs/SendersApi.md#postSenders) | **POST** /senders | Creating a sender
*TransactionsApi* | [**calculateTransactions**](docs/TransactionsApi.md#calculateTransactions) | **POST** /transactions/calculate | Calculates transaction amounts for a transaction payload
*TransactionsApi* | [**createAndFundTransaction**](docs/TransactionsApi.md#createAndFundTransaction) | **POST** /transactions/create_and_fund | Creates a new transaction and funds it from account balance
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /transactions/{Transaction ID} | Fetch a single transaction
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#getTransactions) | **GET** /transactions | Get a list of transactions
*TransactionsApi* | [**payinTransaction**](docs/TransactionsApi.md#payinTransaction) | **POST** /transactions/{Transaction ID}/payin | Creates a fake payin for transaction
*TransactionsApi* | [**payoutTransaction**](docs/TransactionsApi.md#payoutTransaction) | **POST** /transactions/{Transaction ID}/payout | Creates a fake payout for transaction
*TransactionsApi* | [**postTransactions**](docs/TransactionsApi.md#postTransactions) | **POST** /transactions | Creates a new transaction
*TransactionsApi* | [**validateTransactions**](docs/TransactionsApi.md#validateTransactions) | **POST** /transactions/validate | Validates a transaction payload
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{Webhook ID} | Unsubscribing from a webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /webhooks/{Webhook ID} | Find a webhook&#39;s details
*WebhooksApi* | [**getWebhookEvents**](docs/WebhooksApi.md#getWebhookEvents) | **GET** /webhooks/events | Find possible webhook events
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /webhooks | Listing webhooks
*WebhooksApi* | [**postWebhooks**](docs/WebhooksApi.md#postWebhooks) | **POST** /webhooks | Creating a webhook


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountListResponse](docs/AccountListResponse.md)
 - [AccountMeta](docs/AccountMeta.md)
 - [AccountResponse](docs/AccountResponse.md)
 - [AccountValidationError](docs/AccountValidationError.md)
 - [AccountValidationRequest](docs/AccountValidationRequest.md)
 - [AccountValidationResponse](docs/AccountValidationResponse.md)
 - [AccountValidationResult](docs/AccountValidationResult.md)
 - [ApiLog](docs/ApiLog.md)
 - [ApiLogListResponse](docs/ApiLogListResponse.md)
 - [ApiLogResponse](docs/ApiLogResponse.md)
 - [Currency](docs/Currency.md)
 - [CurrencyExchange](docs/CurrencyExchange.md)
 - [CurrencyExchangeListResponse](docs/CurrencyExchangeListResponse.md)
 - [CurrencyListResponse](docs/CurrencyListResponse.md)
 - [CurrencyOpposite](docs/CurrencyOpposite.md)
 - [Debit](docs/Debit.md)
 - [DebitListRequest](docs/DebitListRequest.md)
 - [DebitListResponse](docs/DebitListResponse.md)
 - [DebitRequest](docs/DebitRequest.md)
 - [DebitRequestWrapper](docs/DebitRequestWrapper.md)
 - [DebitResponse](docs/DebitResponse.md)
 - [Document](docs/Document.md)
 - [DocumentListResponse](docs/DocumentListResponse.md)
 - [DocumentRequest](docs/DocumentRequest.md)
 - [DocumentResponse](docs/DocumentResponse.md)
 - [DocumentWebhook](docs/DocumentWebhook.md)
 - [ErrorStatus](docs/ErrorStatus.md)
 - [FieldDescription](docs/FieldDescription.md)
 - [FieldSelectValidation](docs/FieldSelectValidation.md)
 - [FieldValidation](docs/FieldValidation.md)
 - [Pagination](docs/Pagination.md)
 - [PaginationMeta](docs/PaginationMeta.md)
 - [PayinMethod](docs/PayinMethod.md)
 - [PayinMethodDetails](docs/PayinMethodDetails.md)
 - [PayinMethodDetailsBTC](docs/PayinMethodDetailsBTC.md)
 - [PayinMethodDetailsMobile](docs/PayinMethodDetailsMobile.md)
 - [PayinMethodDetailsNGNBank](docs/PayinMethodDetailsNGNBank.md)
 - [PayinMethodRequest](docs/PayinMethodRequest.md)
 - [PayinMethodResponse](docs/PayinMethodResponse.md)
 - [PayinMethodState](docs/PayinMethodState.md)
 - [PayinMethodUxFlow](docs/PayinMethodUxFlow.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodListResponse](docs/PaymentMethodListResponse.md)
 - [PaymentMethodOpposite](docs/PaymentMethodOpposite.md)
 - [PayoutMethod](docs/PayoutMethod.md)
 - [PayoutMethodBankAccountTypeEnum](docs/PayoutMethodBankAccountTypeEnum.md)
 - [PayoutMethodCashProviderEnum](docs/PayoutMethodCashProviderEnum.md)
 - [PayoutMethodCountryEnum](docs/PayoutMethodCountryEnum.md)
 - [PayoutMethodDetails](docs/PayoutMethodDetails.md)
 - [PayoutMethodDetailsBTC](docs/PayoutMethodDetailsBTC.md)
 - [PayoutMethodDetailsBalance](docs/PayoutMethodDetailsBalance.md)
 - [PayoutMethodDetailsGBPBank](docs/PayoutMethodDetailsGBPBank.md)
 - [PayoutMethodDetailsGHSBank](docs/PayoutMethodDetailsGHSBank.md)
 - [PayoutMethodDetailsGHSCash](docs/PayoutMethodDetailsGHSCash.md)
 - [PayoutMethodDetailsGNFMobile](docs/PayoutMethodDetailsGNFMobile.md)
 - [PayoutMethodDetailsIBAN](docs/PayoutMethodDetailsIBAN.md)
 - [PayoutMethodDetailsKESBank](docs/PayoutMethodDetailsKESBank.md)
 - [PayoutMethodDetailsKESMobile](docs/PayoutMethodDetailsKESMobile.md)
 - [PayoutMethodDetailsMADCash](docs/PayoutMethodDetailsMADCash.md)
 - [PayoutMethodDetailsMobile](docs/PayoutMethodDetailsMobile.md)
 - [PayoutMethodDetailsNGNBank](docs/PayoutMethodDetailsNGNBank.md)
 - [PayoutMethodDetailsUSDBank](docs/PayoutMethodDetailsUSDBank.md)
 - [PayoutMethodDetailsUSDCash](docs/PayoutMethodDetailsUSDCash.md)
 - [PayoutMethodDetailsXAFMobile](docs/PayoutMethodDetailsXAFMobile.md)
 - [PayoutMethodDetailsXOFBank](docs/PayoutMethodDetailsXOFBank.md)
 - [PayoutMethodDetailsXOFCash](docs/PayoutMethodDetailsXOFCash.md)
 - [PayoutMethodDetailsXOFMobile](docs/PayoutMethodDetailsXOFMobile.md)
 - [PayoutMethodDetailsZARBank](docs/PayoutMethodDetailsZARBank.md)
 - [PayoutMethodGenderEnum](docs/PayoutMethodGenderEnum.md)
 - [PayoutMethodIdentityCardTypeEnum](docs/PayoutMethodIdentityCardTypeEnum.md)
 - [PayoutMethodLegalEntityTypeEnum](docs/PayoutMethodLegalEntityTypeEnum.md)
 - [PayoutMethodListResponse](docs/PayoutMethodListResponse.md)
 - [PayoutMethodMobileProviderEnum](docs/PayoutMethodMobileProviderEnum.md)
 - [PayoutMethodNatureOfBusinessEnum](docs/PayoutMethodNatureOfBusinessEnum.md)
 - [PayoutMethodRequest](docs/PayoutMethodRequest.md)
 - [PayoutMethodResponse](docs/PayoutMethodResponse.md)
 - [PayoutMethodTransferReasonEnum](docs/PayoutMethodTransferReasonEnum.md)
 - [PayoutMethodWebhook](docs/PayoutMethodWebhook.md)
 - [PoliticallyExposedPerson](docs/PoliticallyExposedPerson.md)
 - [ProofOfPayment](docs/ProofOfPayment.md)
 - [ProofOfPaymentListResponse](docs/ProofOfPaymentListResponse.md)
 - [Recipient](docs/Recipient.md)
 - [RecipientListResponse](docs/RecipientListResponse.md)
 - [RecipientRequest](docs/RecipientRequest.md)
 - [RecipientResponse](docs/RecipientResponse.md)
 - [RecipientState](docs/RecipientState.md)
 - [RecipientStateReasonDetails](docs/RecipientStateReasonDetails.md)
 - [RecipientWebhook](docs/RecipientWebhook.md)
 - [Sender](docs/Sender.md)
 - [SenderListResponse](docs/SenderListResponse.md)
 - [SenderRequest](docs/SenderRequest.md)
 - [SenderResponse](docs/SenderResponse.md)
 - [SenderResponseExisting](docs/SenderResponseExisting.md)
 - [SenderResponseMeta](docs/SenderResponseMeta.md)
 - [SenderState](docs/SenderState.md)
 - [SenderWebhook](docs/SenderWebhook.md)
 - [StateReasonDetails](docs/StateReasonDetails.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionListResponse](docs/TransactionListResponse.md)
 - [TransactionRequest](docs/TransactionRequest.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [TransactionResponseExisting](docs/TransactionResponseExisting.md)
 - [TransactionResponseMeta](docs/TransactionResponseMeta.md)
 - [TransactionState](docs/TransactionState.md)
 - [TransactionTraits](docs/TransactionTraits.md)
 - [TransactionWebhook](docs/TransactionWebhook.md)
 - [ValidationErrorDescription](docs/ValidationErrorDescription.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookDefinition](docs/WebhookDefinition.md)
 - [WebhookDefinitionEventListResponse](docs/WebhookDefinitionEventListResponse.md)
 - [WebhookDefinitionListResponse](docs/WebhookDefinitionListResponse.md)
 - [WebhookDefinitionRequest](docs/WebhookDefinitionRequest.md)
 - [WebhookDefinitionResponse](docs/WebhookDefinitionResponse.md)
 - [WebhookLog](docs/WebhookLog.md)
 - [WebhookLogListResponse](docs/WebhookLogListResponse.md)
 - [WebhookLogMetadata](docs/WebhookLogMetadata.md)
 - [WebhookLogMetadataRequest](docs/WebhookLogMetadataRequest.md)
 - [WebhookLogMetadataResponse](docs/WebhookLogMetadataResponse.md)
 - [WebhookLogResponse](docs/WebhookLogResponse.md)


## Documentation for Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




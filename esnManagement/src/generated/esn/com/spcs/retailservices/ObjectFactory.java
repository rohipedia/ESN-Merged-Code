
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import esn.com.spcs.retailservices.domain.CommitPunchDataRequest;
import esn.com.spcs.retailservices.domain.CommitPunchDataResponse;
import esn.com.spcs.retailservices.domain.QueryLastPunchDetailsRequest;
import esn.com.spcs.retailservices.domain.QueryLastPunchDetailsResponse;
import esn.com.spcs.retailservices.domain.QueryStoreByClientNameRequest;
import esn.com.spcs.retailservices.domain.QueryStoreByClientNameResponse;
import esn.com.spcs.retailservices.domain.ValidateUserRequest;
import esn.com.spcs.retailservices.domain.ValidateUserResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the java.com_spcs_retailservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthenticateInfoRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "authenticateInfoRequest");
    private final static QName _AuthenticateInfoResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "authenticateInfoResponse");
    private final static QName _CommitPunchDataRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "commitPunchDataRequest");
    private final static QName _CommitPunchDataResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "commitPunchDataResponse");
    private final static QName _CreateStoreOrderNotificationRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "createStoreOrderNotificationRequest");
    private final static QName _EncryptStringRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "encryptStringRequest");
    private final static QName _EncryptStringResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "encryptStringResponse");
    private final static QName _InsDelUpdInventoryRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "insDelUpdInventoryRequest");
    private final static QName _InsDelUpdInventoryResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "insDelUpdInventoryResponse");
    private final static QName _KitComponentPricingRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "kitComponentPricingRequest");
    private final static QName _KitComponentPricingResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "kitComponentPricingResponse");
    private final static QName _KitDtlsforSKURequest_QNAME = new QName("java:com.spcs.retailservices.domain", "kitDtlsforSKURequest");
    private final static QName _KitDtlsforSKUResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "kitDtlsforSKUResponse");
    private final static QName _ProductDetailInformationRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "productDetailInformationRequest");
    private final static QName _ProductDetailInformationResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "productDetailInformationResponse");
    private final static QName _ProductInvDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "productInvDetailsRequest");
    private final static QName _ProductInvDetailsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "productInvDetailsResponse");
    private final static QName _ProductManufacturerValidationRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "productManufacturerValidationRequest");
    private final static QName _ProductManufacturerValidationResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "productManufacturerValidationResponse");
    private final static QName _ProductStockedDirectFfWHRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "productStockedDirectFfWHRequest");
    private final static QName _ProductStockedDirectFfWHResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "productStockedDirectFfWHResponse");
    private final static QName _QueryConsignedEmployeeIdentityRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryConsignedEmployeeIdentityRequest");
    private final static QName _QueryConsignedEmployeeIdentityResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryConsignedEmployeeIdentityResponse");
    private final static QName _QueryKitPriceRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryKitPriceRequest");
    private final static QName _QueryKitPriceResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryKitPriceResponse");
    private final static QName _QueryLastPunchDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryLastPunchDetailsRequest");
    private final static QName _QueryLastPunchDetailsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryLastPunchDetailsResponse");
    private final static QName _QueryNameByIdentifierRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryNameByIdentifierRequest");
    private final static QName _QueryNameByIdentifierResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryNameByIdentifierResponse");
    private final static QName _QueryOnHandSaleableQuantityRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryOnHandSaleableQuantityRequest");
    private final static QName _QueryOnHandSaleableQuantityResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryOnHandSaleableQuantityResponse");
    private final static QName _QueryPendingWebOrdersRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryPendingWebOrdersRequest");
    private final static QName _QueryPendingWebOrdersResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryPendingWebOrdersResponse");
    private final static QName _QueryProductIdentifierRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryProductIdentifierRequest");
    private final static QName _QueryProductIdentifierResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryProductIdentifierResponse");
    private final static QName _QueryProductPromotionDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryProductPromotionDetailsRequest");
    private final static QName _QueryProductPromotionDetailsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryProductPromotionDetailsResponse");
    private final static QName _QueryProductRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryProductRequest");
    private final static QName _QueryProductResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryProductResponse");
    private final static QName _QueryStoreByClientNameRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryStoreByClientNameRequest");
    private final static QName _QueryStoreByClientNameResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryStoreByClientNameResponse");
    private final static QName _QueryTaxesRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryTaxesRequest");
    private final static QName _QueryTaxesResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryTaxesResponse");
    private final static QName _SerialNumberProductValidationRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "serialNumberProductValidationRequest");
    private final static QName _SerialNumberProductValidationResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "serialNumberProductValidationResponse");
    private final static QName _SkuQtyValidationRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "skuQtyValidationRequest");
    private final static QName _SkuQtyValidationResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "skuQtyValidationResponse");
    private final static QName _ValidateDirectFulfillmentRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "validateDirectFulfillmentRequest");
    private final static QName _ValidateDirectFulfillmentResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "validateDirectFulfillmentResponse");
    private final static QName _ValidateProductSerialInformationRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "validateProductSerialInformationRequest");
    private final static QName _ValidateProductSerialInformationResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "validateProductSerialInformationResponse");
    private final static QName _ValidateSerialNumberMsnSimIdRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "validateSerialNumberMsnSimIdRequest");
    private final static QName _ValidateSerialNumberMsnSimIdResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "validateSerialNumberMsnSimIdResponse");
    private final static QName _ValidateSerialNumberRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "validateSerialNumberRequest");
    private final static QName _ValidateSerialNumberResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "validateSerialNumberResponse");
    private final static QName _ValidateUserRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "validateUserRequest");
    private final static QName _ValidateUserResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "validateUserResponse");
    private final static QName _CreateOrderInRmsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "createOrderInRmsRequest");
    private final static QName _QueryOrderFromRmsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryOrderFromRmsRequest");
    private final static QName _QueryConsentListRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryConsentListRequest");
    private final static QName _QueryConsentDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryConsentDetailsRequest");
    private final static QName _ManageUserProfileAccessResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "manageUserProfileAccessResponse");
    private final static QName _ManageUserProfileAccessRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "manageUserProfileAccessRequest");
    private final static QName _GetUserProfileAccessInfoRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "getUserProfileAccessInfoRequest");
    private final static QName _GetUserProfileAccessInfoResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "getUserProfileAccessInfoResponse");
    private final static QName _AssignRegisterAndFloatRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "assignRegisterAndFloatRequest");
    private final static QName _GetRMSStoreDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "getRMSStoreDetailsRequest");
    private final static QName _GetRMSStoreDetailsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "getRMSStoreDetailsResponse");
    private final static QName _GetRMSDiscountsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "getRMSDiscountsRequest");
    private final static QName _GetRMSDiscountsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "getRMSDiscountsResponse");
    private final static QName _QueryConsentVerbiageRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryConsentVerbiageRequest");
    private final static QName _QueryConsentVerbiageResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryConsentVerbiageResponse");
    private final static QName _SaveBravoConsentRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "saveBravoConsentRequest");
    private final static QName _SaveBravoConsentResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "saveBravoConsentResponse");
    private final static QName _QueryTenderConfigurationValuesRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryTenderConfigurationValuesRequest");
    private final static QName _QueryTenderConfigurationValuesResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryTenderConfigurationValuesResponse");
    private final static QName _CreatePOSTransactionRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "createPOSTransactionRequest");
    private final static QName _UpdateTransactionDataResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "updateTransactionDataResponse");
    private final static QName _UpdateTransactionDataRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "updateTransactionDataRequest");
    private final static QName _CreatePOSTransactionResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "createPOSTransactionResponse");
    private final static QName _UpdatePOSTransactionRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "updatePOSTransactionRequest");
    private final static QName _UpdatePOSTransactionResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "updatePOSTransactionResponse");
    private final static QName _ClientPropertiesRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "clientPropertiesRequest");
    private final static QName _ClientPropertiesResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "clientPropertiesResponse");
    private final static QName _ResetPasswordRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "resetPasswordRequest");
    private final static QName _ManageInstallmentConsentDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "manageInstallmentConsentDetailsRequest");
    private final static QName _QueryInstallmentConsentDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryInstallmentConsentDetailsRequest");
    private final static QName _QueryPreferredOrderInfoRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryPreferredOrderInfoRequest");
    private final static QName _QueryPreferredOrderInfoResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryPreferredOrderInfoResponse");
    private final static QName _ManageConsentDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "manageConsentDetailsRequest");
    private final static QName _QueryPendingPaymentListRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryPendingPaymentListRequest");
    private final static QName _QueryPendingPaymentListResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryPendingPaymentListResponse");
    private final static QName _ManagePendingPaymentDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "managePendingPaymentDetailsRequest");
    private final static QName _ManagePendingPaymentDetailsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "managePendingPaymentDetailsResponse");
    private final static QName _ManageSCDInfoRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "manageSCDInfoRequest");
    private final static QName _ManageSCDInfoResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "manageSCDInfoResponse");
    private final static QName _QueryAccountFunctionalityMatrixRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryAccountFunctionalityMatrixRequest");
    private final static QName _QueryAccountFunctionalityMatrixResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryAccountFunctionalityMatrixResponse");
    private final static QName _CreateRetrieveCustomerIdentifierRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "createRetrieveCustomerIdentifierRequest");
    private final static QName _CreateRetrieveCustomerIdentifierResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "createRetrieveCustomerIdentifierResponse");
    private final static QName _QueryStoreChannelRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryStoreChannelRequest");
    private final static QName _QueryStoreChannelResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryStoreChannelResponse");
    private final static QName _ManageTransactionSummaryDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "manageTransactionSummaryDetailsRequest");
    private final static QName _ManageTransactionSummaryDetailsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "manageTransactionSummaryDetailsResponse");
    private final static QName _QueryTransactionSummaryDetailsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryTransactionSummaryDetailsRequest");
    private final static QName _QueryTransactionSummaryDetailsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryTransactionSummaryDetailsResponse");
    private final static QName _QueryProfileAuthorizationRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryProfileAuthorizationRequest");
    private final static QName _QueryProfileAuthorizationResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryProfileAuthorizationResponse");
    private final static QName _SendIdVerificationDataToRmsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "sendIdVerificationDataToRmsRequest");
    private final static QName _SendIdVerificationDataToRmsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "sendIdVerificationDataToRmsResponse");
    private final static QName _SendApiXmlToRmsRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "sendApiXmlToRmsRequest");
    private final static QName _SendApiXmlToRmsResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "sendApiXmlToRmsResponse");
    private final static QName _CreateIDCaptureLogRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "createIDCaptureLogRequest");
    private final static QName _CreateIDCaptureLogResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "createIDCaptureLogResponse");
    private final static QName _QueryIDCaptureLogRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryIDCaptureLogRequest");
    private final static QName _QueryIDCaptureLogResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryIDCaptureLogResponse");
    private final static QName _ManageDeviceRebrandingRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "manageDeviceRebrandingRequest");
    private final static QName _ManageDeviceRebrandingResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "manageDeviceRebrandingResponse");
    private final static QName _QueryUserListForStoresRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryUserListForStoresRequest");
    private final static QName _QueryUserListForStoresResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryUserListForStoresResponse");
    private final static QName _QueryOriginalSaleTransactionRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryOriginalSaleTransactionRequest");
    private final static QName _QueryOriginalSaleTransactionResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryOriginalSaleTransactionResponse");
    private final static QName _QueryWebOrderListRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryWebOrderListRequest");
    private final static QName _QueryWebOrderListResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryWebOrderListResponse");
    private final static QName _QueryTransactionHistoryRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryTransactionHistoryRequest");
    private final static QName _QueryTransactionHistoryResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryTransactionHistoryResponse");
    private final static QName _QueryDeviceSaleableStatusRequest_QNAME = new QName("java:com.spcs.retailservices.domain", "queryDeviceSaleableStatusRequest");
    private final static QName _QueryDeviceSaleableStatusResponse_QNAME = new QName("java:com.spcs.retailservices.domain", "queryDeviceSaleableStatusResponse");
    private final static QName _QueryInstallmentConsentDetailsResponseErrorInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "ErrorInfo");
    private final static QName _QueryInstallmentConsentDetailsResponseStoreErrorInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "StoreErrorInfo");
    private final static QName _QueryInstallmentConsentDetailsResponseConsentInfoList_QNAME = new QName("java:com.spcs.retailservices.domain", "ConsentInfoList");
    private final static QName _ResetPasswordResponseErrorCode_QNAME = new QName("java:com.spcs.retailservices.domain", "ErrorCode");
    private final static QName _ResetPasswordResponseErrorDesc_QNAME = new QName("java:com.spcs.retailservices.domain", "ErrorDesc");
    private final static QName _QueryOrderFromRmsResponseBuybackFundsList_QNAME = new QName("java:com.spcs.retailservices.domain", "BuybackFundsList");
    private final static QName _QueryConsentListResponseConsentList_QNAME = new QName("java:com.spcs.retailservices.domain", "ConsentList");
    private final static QName _CreateOrderInRmsResponseUserErrorInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "UserErrorInfo");
    private final static QName _CreateOrderInRmsResponseShoppingCartStoreErrorInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "ShoppingCartStoreErrorInfo");
    private final static QName _CreateOrderInRmsResponseShoppingCartSkuErrorInfoList_QNAME = new QName("java:com.spcs.retailservices.domain", "ShoppingCartSkuErrorInfoList");
    private final static QName _TaxInformationUpgradeNowFeeTax_QNAME = new QName("java:com.spcs.retailservices.domain", "UpgradeNowFeeTax");
    private final static QName _QueryCalculateTaxesResponseTaxInfoList_QNAME = new QName("java:com.spcs.retailservices.domain", "TaxInfoList");
    private final static QName _QueryCalculateTaxesResponseSkuErrorInfoList_QNAME = new QName("java:com.spcs.retailservices.domain", "SkuErrorInfoList");
    private final static QName _QueryCalculateTaxesResponseStoreInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "StoreInfo");
    private final static QName _CalcTaxSkuInfoUpgradeNowFeeAmount_QNAME = new QName("java:com.spcs.retailservices.domain", "UpgradeNowFeeAmount");
    private final static QName _OrderLinesInfoLineActivity_QNAME = new QName("java:com.spcs.retailservices.domain", "LineActivity");
    private final static QName _OrderLinesInfoWebOrderPTN_QNAME = new QName("java:com.spcs.retailservices.domain", "WebOrderPTN");
    private final static QName _AppointmentInfoApptConfirmationNumber_QNAME = new QName("java:com.spcs.retailservices.domain", "ApptConfirmationNumber");
    private final static QName _AppointmentInfoAppointmentStartDateTime_QNAME = new QName("java:com.spcs.retailservices.domain", "AppointmentStartDateTime");
    private final static QName _AppointmentInfoStoreTimezone_QNAME = new QName("java:com.spcs.retailservices.domain", "StoreTimezone");
    private final static QName _OrderInfoBan_QNAME = new QName("java:com.spcs.retailservices.domain", "Ban");
    private final static QName _CreditCardDetailsInfoCardTrack1_QNAME = new QName("java:com.spcs.retailservices.domain", "CardTrack1");
    private final static QName _CreditCardDetailsInfoCardTrack2_QNAME = new QName("java:com.spcs.retailservices.domain", "CardTrack2");
    private final static QName _CreditCardDetailsInfoCardTrack3_QNAME = new QName("java:com.spcs.retailservices.domain", "CardTrack3");
    private final static QName _CreditCardDetailsInfoPayload_QNAME = new QName("java:com.spcs.retailservices.domain", "Payload");
    private final static QName _CreditCardDetailsInfoBase64Signature_QNAME = new QName("java:com.spcs.retailservices.domain", "Base64Signature");
    private final static QName _ManagePendingPaymentInfoCreditCardDetailsList_QNAME = new QName("java:com.spcs.retailservices.domain", "CreditCardDetailsList");
    private final static QName _ManagePendingPaymentInfoGiftCardDetailsList_QNAME = new QName("java:com.spcs.retailservices.domain", "GiftCardDetailsList");
    private final static QName _ManagePendingPaymentDetailsRequestManagePendingPaymentInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "ManagePendingPaymentInfo");
    private final static QName _ManageConsentDetailsRequestUpdateConsentInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "UpdateConsentInfo");
    private final static QName _ManageConsentDetailsRequestInsertConsentInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "InsertConsentInfo");
    private final static QName _QueryPreferredOrderInfoResponsePreffOrderInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "PreffOrderInfo");
    private final static QName _QueryPreferredOrderInfoRequestEsn_QNAME = new QName("java:com.spcs.retailservices.domain", "esn");
    private final static QName _QueryPreferredOrderInfoRequestMdn_QNAME = new QName("java:com.spcs.retailservices.domain", "mdn");
    private final static QName _ManageInstallmentConsentDetailsRequestInsertInstallmentConsentInfo_QNAME = new QName("java:com.spcs.retailservices.domain", "InsertInstallmentConsentInfo");
    private final static QName _ResetPasswordRequestManagerUserId_QNAME = new QName("java:com.spcs.retailservices.domain", "ManagerUserId");
    private final static QName _ResetPasswordRequestDefinitivePasswordInd_QNAME = new QName("java:com.spcs.retailservices.domain", "DefinitivePasswordInd");
    private final static QName _QueryOnhandSaleableQuantityRequestQtyStatus_QNAME = new QName("java:com.spcs.retailservices.domain", "QtyStatus");
    private final static QName _AuthenticateInfoRequestUserLoginIdentifier_QNAME = new QName("java:com.spcs.retailservices.domain", "UserLoginIdentifier");
    private final static QName _AuthenticateInfoRequestUserCorporateIdentifier_QNAME = new QName("java:com.spcs.retailservices.domain", "UserCorporateIdentifier");
    private final static QName _AuthenticateInfoRequestUserPassword_QNAME = new QName("java:com.spcs.retailservices.domain", "UserPassword");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: java.com_spcs_retailservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthenticateInfoRequest }
     * 
     */
    public AuthenticateInfoRequest createAuthenticateInfoRequest() {
        return new AuthenticateInfoRequest();
    }

    /**
     * Create an instance of {@link AuthenticateInfoResponse }
     * 
     */
    public AuthenticateInfoResponse createAuthenticateInfoResponse() {
        return new AuthenticateInfoResponse();
    }

    /**
     * Create an instance of {@link CreateStoreOrderNotificationRequest }
     * 
     */
    public CreateStoreOrderNotificationRequest createCreateStoreOrderNotificationRequest() {
        return new CreateStoreOrderNotificationRequest();
    }

    /**
     * Create an instance of {@link EncryptStringRequest }
     * 
     */
    public EncryptStringRequest createEncryptStringRequest() {
        return new EncryptStringRequest();
    }

    /**
     * Create an instance of {@link EncryptStringResponse }
     * 
     */
    public EncryptStringResponse createEncryptStringResponse() {
        return new EncryptStringResponse();
    }

    /**
     * Create an instance of {@link InsDelUpdInventoryRequest }
     * 
     */
    public InsDelUpdInventoryRequest createInsDelUpdInventoryRequest() {
        return new InsDelUpdInventoryRequest();
    }

    /**
     * Create an instance of {@link InsDelUpdInventoryResponse }
     * 
     */
    public InsDelUpdInventoryResponse createInsDelUpdInventoryResponse() {
        return new InsDelUpdInventoryResponse();
    }

    /**
     * Create an instance of {@link KitComponentPricingRequest }
     * 
     */
    public KitComponentPricingRequest createKitComponentPricingRequest() {
        return new KitComponentPricingRequest();
    }

    /**
     * Create an instance of {@link KitComponentPricingResponse }
     * 
     */
    public KitComponentPricingResponse createKitComponentPricingResponse() {
        return new KitComponentPricingResponse();
    }

    /**
     * Create an instance of {@link KitDtlsforSKURequest }
     * 
     */
    public KitDtlsforSKURequest createKitDtlsforSKURequest() {
        return new KitDtlsforSKURequest();
    }

    /**
     * Create an instance of {@link KitDtlsforSKUResponse }
     * 
     */
    public KitDtlsforSKUResponse createKitDtlsforSKUResponse() {
        return new KitDtlsforSKUResponse();
    }

    /**
     * Create an instance of {@link ProductDetailInformationRequest }
     * 
     */
    public ProductDetailInformationRequest createProductDetailInformationRequest() {
        return new ProductDetailInformationRequest();
    }

    /**
     * Create an instance of {@link ProductDetailInformationResponse }
     * 
     */
    public ProductDetailInformationResponse createProductDetailInformationResponse() {
        return new ProductDetailInformationResponse();
    }

    /**
     * Create an instance of {@link ProductInvDetailsRequest }
     * 
     */
    public ProductInvDetailsRequest createProductInvDetailsRequest() {
        return new ProductInvDetailsRequest();
    }

    /**
     * Create an instance of {@link ProductInvDetailsResponse }
     * 
     */
    public ProductInvDetailsResponse createProductInvDetailsResponse() {
        return new ProductInvDetailsResponse();
    }

    /**
     * Create an instance of {@link ProductManufacturerValidationRequest }
     * 
     */
    public ProductManufacturerValidationRequest createProductManufacturerValidationRequest() {
        return new ProductManufacturerValidationRequest();
    }

    /**
     * Create an instance of {@link ProductManufacturerValidationResponse }
     * 
     */
    public ProductManufacturerValidationResponse createProductManufacturerValidationResponse() {
        return new ProductManufacturerValidationResponse();
    }

    /**
     * Create an instance of {@link ProductStockedDirectFfWHRequest }
     * 
     */
    public ProductStockedDirectFfWHRequest createProductStockedDirectFfWHRequest() {
        return new ProductStockedDirectFfWHRequest();
    }

    /**
     * Create an instance of {@link ProductStockedDirectFfWHResponse }
     * 
     */
    public ProductStockedDirectFfWHResponse createProductStockedDirectFfWHResponse() {
        return new ProductStockedDirectFfWHResponse();
    }

    /**
     * Create an instance of {@link QueryConsignedEmployeeIdentityRequest }
     * 
     */
    public QueryConsignedEmployeeIdentityRequest createQueryConsignedEmployeeIdentityRequest() {
        return new QueryConsignedEmployeeIdentityRequest();
    }

    /**
     * Create an instance of {@link QueryConsignedEmployeeIdentityResponse }
     * 
     */
    public QueryConsignedEmployeeIdentityResponse createQueryConsignedEmployeeIdentityResponse() {
        return new QueryConsignedEmployeeIdentityResponse();
    }

    /**
     * Create an instance of {@link QueryKitPriceRequest }
     * 
     */
    public QueryKitPriceRequest createQueryKitPriceRequest() {
        return new QueryKitPriceRequest();
    }

    /**
     * Create an instance of {@link QueryKitPriceResponse }
     * 
     */
    public QueryKitPriceResponse createQueryKitPriceResponse() {
        return new QueryKitPriceResponse();
    }

    /**
     * Create an instance of {@link QueryNameByIdentifierRequest }
     * 
     */
    public QueryNameByIdentifierRequest createQueryNameByIdentifierRequest() {
        return new QueryNameByIdentifierRequest();
    }

    /**
     * Create an instance of {@link QueryNameByIdentifierResponse }
     * 
     */
    public QueryNameByIdentifierResponse createQueryNameByIdentifierResponse() {
        return new QueryNameByIdentifierResponse();
    }

    /**
     * Create an instance of {@link QueryOnhandSaleableQuantityRequest }
     * 
     */
    public QueryOnhandSaleableQuantityRequest createQueryOnhandSaleableQuantityRequest() {
        return new QueryOnhandSaleableQuantityRequest();
    }

    /**
     * Create an instance of {@link QueryOnhandSaleableQuantityResponse }
     * 
     */
    public QueryOnhandSaleableQuantityResponse createQueryOnhandSaleableQuantityResponse() {
        return new QueryOnhandSaleableQuantityResponse();
    }

    /**
     * Create an instance of {@link QueryPendingWebOrdersRequest }
     * 
     */
    public QueryPendingWebOrdersRequest createQueryPendingWebOrdersRequest() {
        return new QueryPendingWebOrdersRequest();
    }

    /**
     * Create an instance of {@link QueryPendingWebOrdersResponse }
     * 
     */
    public QueryPendingWebOrdersResponse createQueryPendingWebOrdersResponse() {
        return new QueryPendingWebOrdersResponse();
    }

    /**
     * Create an instance of {@link QueryProductIdentifierRequest }
     * 
     */
    public QueryProductIdentifierRequest createQueryProductIdentifierRequest() {
        return new QueryProductIdentifierRequest();
    }

    /**
     * Create an instance of {@link QueryProductIdentifierResponse }
     * 
     */
    public QueryProductIdentifierResponse createQueryProductIdentifierResponse() {
        return new QueryProductIdentifierResponse();
    }

    /**
     * Create an instance of {@link QueryProductPromotionDetailsRequest }
     * 
     */
    public QueryProductPromotionDetailsRequest createQueryProductPromotionDetailsRequest() {
        return new QueryProductPromotionDetailsRequest();
    }

    /**
     * Create an instance of {@link QueryProductPromotionDetailsResponse }
     * 
     */
    public QueryProductPromotionDetailsResponse createQueryProductPromotionDetailsResponse() {
        return new QueryProductPromotionDetailsResponse();
    }

    /**
     * Create an instance of {@link QueryProductRequest }
     * 
     */
    public QueryProductRequest createQueryProductRequest() {
        return new QueryProductRequest();
    }

    /**
     * Create an instance of {@link QueryProductResponse }
     * 
     */
    public QueryProductResponse createQueryProductResponse() {
        return new QueryProductResponse();
    }

    /**
     * Create an instance of {@link QueryTaxesRequest }
     * 
     */
    public QueryTaxesRequest createQueryTaxesRequest() {
        return new QueryTaxesRequest();
    }

    /**
     * Create an instance of {@link QueryTaxesResponse }
     * 
     */
    public QueryTaxesResponse createQueryTaxesResponse() {
        return new QueryTaxesResponse();
    }

    /**
     * Create an instance of {@link SerialNumberProductValidationRequest }
     * 
     */
    public SerialNumberProductValidationRequest createSerialNumberProductValidationRequest() {
        return new SerialNumberProductValidationRequest();
    }

    /**
     * Create an instance of {@link SerialNumberProductValidationResponse }
     * 
     */
    public SerialNumberProductValidationResponse createSerialNumberProductValidationResponse() {
        return new SerialNumberProductValidationResponse();
    }

    /**
     * Create an instance of {@link SKUQtyValidationRequest }
     * 
     */
    public SKUQtyValidationRequest createSKUQtyValidationRequest() {
        return new SKUQtyValidationRequest();
    }

    /**
     * Create an instance of {@link SKUQtyValidationResponse }
     * 
     */
    public SKUQtyValidationResponse createSKUQtyValidationResponse() {
        return new SKUQtyValidationResponse();
    }

    /**
     * Create an instance of {@link ValidateDirectFulfillmentRequest }
     * 
     */
    public ValidateDirectFulfillmentRequest createValidateDirectFulfillmentRequest() {
        return new ValidateDirectFulfillmentRequest();
    }

    /**
     * Create an instance of {@link ValidateDirectFulfillmentResponse }
     * 
     */
    public ValidateDirectFulfillmentResponse createValidateDirectFulfillmentResponse() {
        return new ValidateDirectFulfillmentResponse();
    }

    /**
     * Create an instance of {@link ValidateProductSerialInformationRequest }
     * 
     */
    public ValidateProductSerialInformationRequest createValidateProductSerialInformationRequest() {
        return new ValidateProductSerialInformationRequest();
    }

    /**
     * Create an instance of {@link ValidateProductSerialInformationResponse }
     * 
     */
    public ValidateProductSerialInformationResponse createValidateProductSerialInformationResponse() {
        return new ValidateProductSerialInformationResponse();
    }

    /**
     * Create an instance of {@link ValidateSerialNumberMsnSimIdRequest }
     * 
     */
    public ValidateSerialNumberMsnSimIdRequest createValidateSerialNumberMsnSimIdRequest() {
        return new ValidateSerialNumberMsnSimIdRequest();
    }

    /**
     * Create an instance of {@link ValidateSerialNumberMsnSimIdResponse }
     * 
     */
    public ValidateSerialNumberMsnSimIdResponse createValidateSerialNumberMsnSimIdResponse() {
        return new ValidateSerialNumberMsnSimIdResponse();
    }

    /**
     * Create an instance of {@link ValidateSerialNumberRequest }
     * 
     */
    public ValidateSerialNumberRequest createValidateSerialNumberRequest() {
        return new ValidateSerialNumberRequest();
    }

    /**
     * Create an instance of {@link ValidateSerialNumberResponse }
     * 
     */
    public ValidateSerialNumberResponse createValidateSerialNumberResponse() {
        return new ValidateSerialNumberResponse();
    }

    /**
     * Create an instance of {@link CreateOrderInRmsRequest }
     * 
     */
    public CreateOrderInRmsRequest createCreateOrderInRmsRequest() {
        return new CreateOrderInRmsRequest();
    }

    /**
     * Create an instance of {@link QueryOrderFromRmsRequest }
     * 
     */
    public QueryOrderFromRmsRequest createQueryOrderFromRmsRequest() {
        return new QueryOrderFromRmsRequest();
    }

    /**
     * Create an instance of {@link QueryConsentListRequest }
     * 
     */
    public QueryConsentListRequest createQueryConsentListRequest() {
        return new QueryConsentListRequest();
    }

    /**
     * Create an instance of {@link QueryConsentDetailsRequest }
     * 
     */
    public QueryConsentDetailsRequest createQueryConsentDetailsRequest() {
        return new QueryConsentDetailsRequest();
    }

    /**
     * Create an instance of {@link ManageUserProfileAccessResponse }
     * 
     */
    public ManageUserProfileAccessResponse createManageUserProfileAccessResponse() {
        return new ManageUserProfileAccessResponse();
    }

    /**
     * Create an instance of {@link ManageUserProfileAccessRequest }
     * 
     */
    public ManageUserProfileAccessRequest createManageUserProfileAccessRequest() {
        return new ManageUserProfileAccessRequest();
    }

    /**
     * Create an instance of {@link GetUserProfileAccessInfoRequest }
     * 
     */
    public GetUserProfileAccessInfoRequest createGetUserProfileAccessInfoRequest() {
        return new GetUserProfileAccessInfoRequest();
    }

    /**
     * Create an instance of {@link GetUserProfileAccessInfoResponse }
     * 
     */
    public GetUserProfileAccessInfoResponse createGetUserProfileAccessInfoResponse() {
        return new GetUserProfileAccessInfoResponse();
    }

    /**
     * Create an instance of {@link AssignRegisterAndFloatRequest }
     * 
     */
    public AssignRegisterAndFloatRequest createAssignRegisterAndFloatRequest() {
        return new AssignRegisterAndFloatRequest();
    }

    /**
     * Create an instance of {@link GetRMSStoreDetailsRequest }
     * 
     */
    public GetRMSStoreDetailsRequest createGetRMSStoreDetailsRequest() {
        return new GetRMSStoreDetailsRequest();
    }

    /**
     * Create an instance of {@link GetRMSStoreDetailsResponse }
     * 
     */
    public GetRMSStoreDetailsResponse createGetRMSStoreDetailsResponse() {
        return new GetRMSStoreDetailsResponse();
    }

    /**
     * Create an instance of {@link GetRMSDiscountsRequest }
     * 
     */
    public GetRMSDiscountsRequest createGetRMSDiscountsRequest() {
        return new GetRMSDiscountsRequest();
    }

    /**
     * Create an instance of {@link GetRMSDiscountsResponse }
     * 
     */
    public GetRMSDiscountsResponse createGetRMSDiscountsResponse() {
        return new GetRMSDiscountsResponse();
    }

    /**
     * Create an instance of {@link QueryConsentVerbiageRequest }
     * 
     */
    public QueryConsentVerbiageRequest createQueryConsentVerbiageRequest() {
        return new QueryConsentVerbiageRequest();
    }

    /**
     * Create an instance of {@link QueryConsentVerbiageResponse }
     * 
     */
    public QueryConsentVerbiageResponse createQueryConsentVerbiageResponse() {
        return new QueryConsentVerbiageResponse();
    }

    /**
     * Create an instance of {@link SaveBravoConsentRequest }
     * 
     */
    public SaveBravoConsentRequest createSaveBravoConsentRequest() {
        return new SaveBravoConsentRequest();
    }

    /**
     * Create an instance of {@link SaveBravoConsentResponse }
     * 
     */
    public SaveBravoConsentResponse createSaveBravoConsentResponse() {
        return new SaveBravoConsentResponse();
    }

    /**
     * Create an instance of {@link QueryTenderConfigurationValuesRequest }
     * 
     */
    public QueryTenderConfigurationValuesRequest createQueryTenderConfigurationValuesRequest() {
        return new QueryTenderConfigurationValuesRequest();
    }

    /**
     * Create an instance of {@link QueryTenderConfigurationValuesResponse }
     * 
     */
    public QueryTenderConfigurationValuesResponse createQueryTenderConfigurationValuesResponse() {
        return new QueryTenderConfigurationValuesResponse();
    }

    /**
     * Create an instance of {@link CreatePOSTransactionRequest }
     * 
     */
    public CreatePOSTransactionRequest createCreatePOSTransactionRequest() {
        return new CreatePOSTransactionRequest();
    }

    /**
     * Create an instance of {@link UpdateTransactionDataResponse }
     * 
     */
    public UpdateTransactionDataResponse createUpdateTransactionDataResponse() {
        return new UpdateTransactionDataResponse();
    }

    /**
     * Create an instance of {@link UpdateTransactionDataRequest }
     * 
     */
    public UpdateTransactionDataRequest createUpdateTransactionDataRequest() {
        return new UpdateTransactionDataRequest();
    }

    /**
     * Create an instance of {@link CreatePOSTransactionResponse }
     * 
     */
    public CreatePOSTransactionResponse createCreatePOSTransactionResponse() {
        return new CreatePOSTransactionResponse();
    }

    /**
     * Create an instance of {@link UpdatePOSTransactionRequest }
     * 
     */
    public UpdatePOSTransactionRequest createUpdatePOSTransactionRequest() {
        return new UpdatePOSTransactionRequest();
    }

    /**
     * Create an instance of {@link UpdatePOSTransactionResponse }
     * 
     */
    public UpdatePOSTransactionResponse createUpdatePOSTransactionResponse() {
        return new UpdatePOSTransactionResponse();
    }

    /**
     * Create an instance of {@link ClientPropertiesRequest }
     * 
     */
    public ClientPropertiesRequest createClientPropertiesRequest() {
        return new ClientPropertiesRequest();
    }

    /**
     * Create an instance of {@link ClientPropertiesResponse }
     * 
     */
    public ClientPropertiesResponse createClientPropertiesResponse() {
        return new ClientPropertiesResponse();
    }

    /**
     * Create an instance of {@link ResetPasswordRequest }
     * 
     */
    public ResetPasswordRequest createResetPasswordRequest() {
        return new ResetPasswordRequest();
    }

    /**
     * Create an instance of {@link ManageInstallmentConsentDetailsRequest }
     * 
     */
    public ManageInstallmentConsentDetailsRequest createManageInstallmentConsentDetailsRequest() {
        return new ManageInstallmentConsentDetailsRequest();
    }

    /**
     * Create an instance of {@link QueryInstallmentConsentDetailsRequest }
     * 
     */
    public QueryInstallmentConsentDetailsRequest createQueryInstallmentConsentDetailsRequest() {
        return new QueryInstallmentConsentDetailsRequest();
    }

    /**
     * Create an instance of {@link QueryPreferredOrderInfoRequest }
     * 
     */
    public QueryPreferredOrderInfoRequest createQueryPreferredOrderInfoRequest() {
        return new QueryPreferredOrderInfoRequest();
    }

    /**
     * Create an instance of {@link QueryPreferredOrderInfoResponse }
     * 
     */
    public QueryPreferredOrderInfoResponse createQueryPreferredOrderInfoResponse() {
        return new QueryPreferredOrderInfoResponse();
    }

    /**
     * Create an instance of {@link ManageConsentDetailsRequest }
     * 
     */
    public ManageConsentDetailsRequest createManageConsentDetailsRequest() {
        return new ManageConsentDetailsRequest();
    }

    /**
     * Create an instance of {@link QueryPendingPaymentListRequest }
     * 
     */
    public QueryPendingPaymentListRequest createQueryPendingPaymentListRequest() {
        return new QueryPendingPaymentListRequest();
    }

    /**
     * Create an instance of {@link QueryPendingPaymentListResponse }
     * 
     */
    public QueryPendingPaymentListResponse createQueryPendingPaymentListResponse() {
        return new QueryPendingPaymentListResponse();
    }

    /**
     * Create an instance of {@link ManagePendingPaymentDetailsRequest }
     * 
     */
    public ManagePendingPaymentDetailsRequest createManagePendingPaymentDetailsRequest() {
        return new ManagePendingPaymentDetailsRequest();
    }

    /**
     * Create an instance of {@link ManagePendingPaymentDetailsResponse }
     * 
     */
    public ManagePendingPaymentDetailsResponse createManagePendingPaymentDetailsResponse() {
        return new ManagePendingPaymentDetailsResponse();
    }

    /**
     * Create an instance of {@link ManageSCDInfoRequest }
     * 
     */
    public ManageSCDInfoRequest createManageSCDInfoRequest() {
        return new ManageSCDInfoRequest();
    }

    /**
     * Create an instance of {@link ManageSCDInfoResponse }
     * 
     */
    public ManageSCDInfoResponse createManageSCDInfoResponse() {
        return new ManageSCDInfoResponse();
    }

    /**
     * Create an instance of {@link QueryAccountFunctionalityMatrixRequest }
     * 
     */
    public QueryAccountFunctionalityMatrixRequest createQueryAccountFunctionalityMatrixRequest() {
        return new QueryAccountFunctionalityMatrixRequest();
    }

    /**
     * Create an instance of {@link QueryAccountFunctionalityMatrixResponse }
     * 
     */
    public QueryAccountFunctionalityMatrixResponse createQueryAccountFunctionalityMatrixResponse() {
        return new QueryAccountFunctionalityMatrixResponse();
    }

    /**
     * Create an instance of {@link CreateRetrieveCustomerIdentifierRequest }
     * 
     */
    public CreateRetrieveCustomerIdentifierRequest createCreateRetrieveCustomerIdentifierRequest() {
        return new CreateRetrieveCustomerIdentifierRequest();
    }

    /**
     * Create an instance of {@link CreateRetrieveCustomerIdentifierResponse }
     * 
     */
    public CreateRetrieveCustomerIdentifierResponse createCreateRetrieveCustomerIdentifierResponse() {
        return new CreateRetrieveCustomerIdentifierResponse();
    }

    /**
     * Create an instance of {@link QueryStoreChannelRequest }
     * 
     */
    public QueryStoreChannelRequest createQueryStoreChannelRequest() {
        return new QueryStoreChannelRequest();
    }

    /**
     * Create an instance of {@link QueryStoreChannelResponse }
     * 
     */
    public QueryStoreChannelResponse createQueryStoreChannelResponse() {
        return new QueryStoreChannelResponse();
    }

    /**
     * Create an instance of {@link ManageTransactionSummaryDetailsRequest }
     * 
     */
    public ManageTransactionSummaryDetailsRequest createManageTransactionSummaryDetailsRequest() {
        return new ManageTransactionSummaryDetailsRequest();
    }

    /**
     * Create an instance of {@link ManageTransactionSummaryDetailsResponse }
     * 
     */
    public ManageTransactionSummaryDetailsResponse createManageTransactionSummaryDetailsResponse() {
        return new ManageTransactionSummaryDetailsResponse();
    }

    /**
     * Create an instance of {@link QueryTransactionSummaryDetailsRequest }
     * 
     */
    public QueryTransactionSummaryDetailsRequest createQueryTransactionSummaryDetailsRequest() {
        return new QueryTransactionSummaryDetailsRequest();
    }

    /**
     * Create an instance of {@link QueryTransactionSummaryDetailsResponse }
     * 
     */
    public QueryTransactionSummaryDetailsResponse createQueryTransactionSummaryDetailsResponse() {
        return new QueryTransactionSummaryDetailsResponse();
    }

    /**
     * Create an instance of {@link QueryProfileAuthorizationRequest }
     * 
     */
    public QueryProfileAuthorizationRequest createQueryProfileAuthorizationRequest() {
        return new QueryProfileAuthorizationRequest();
    }

    /**
     * Create an instance of {@link QueryProfileAuthorizationResponse }
     * 
     */
    public QueryProfileAuthorizationResponse createQueryProfileAuthorizationResponse() {
        return new QueryProfileAuthorizationResponse();
    }

    /**
     * Create an instance of {@link SendIdVerificationDataToRmsRequest }
     * 
     */
    public SendIdVerificationDataToRmsRequest createSendIdVerificationDataToRmsRequest() {
        return new SendIdVerificationDataToRmsRequest();
    }

    /**
     * Create an instance of {@link SendIdVerificationDataToRmsResponse }
     * 
     */
    public SendIdVerificationDataToRmsResponse createSendIdVerificationDataToRmsResponse() {
        return new SendIdVerificationDataToRmsResponse();
    }

    /**
     * Create an instance of {@link SendApiXmlToRmsRequest }
     * 
     */
    public SendApiXmlToRmsRequest createSendApiXmlToRmsRequest() {
        return new SendApiXmlToRmsRequest();
    }

    /**
     * Create an instance of {@link SendApiXmlToRmsResponse }
     * 
     */
    public SendApiXmlToRmsResponse createSendApiXmlToRmsResponse() {
        return new SendApiXmlToRmsResponse();
    }

    /**
     * Create an instance of {@link CreateIDCaptureLogRequest }
     * 
     */
    public CreateIDCaptureLogRequest createCreateIDCaptureLogRequest() {
        return new CreateIDCaptureLogRequest();
    }

    /**
     * Create an instance of {@link CreateIDCaptureLogResponse }
     * 
     */
    public CreateIDCaptureLogResponse createCreateIDCaptureLogResponse() {
        return new CreateIDCaptureLogResponse();
    }

    /**
     * Create an instance of {@link QueryIDCaptureLogRequest }
     * 
     */
    public QueryIDCaptureLogRequest createQueryIDCaptureLogRequest() {
        return new QueryIDCaptureLogRequest();
    }

    /**
     * Create an instance of {@link QueryIDCaptureLogResponse }
     * 
     */
    public QueryIDCaptureLogResponse createQueryIDCaptureLogResponse() {
        return new QueryIDCaptureLogResponse();
    }

    /**
     * Create an instance of {@link ManageDeviceRebrandingRequest }
     * 
     */
    public ManageDeviceRebrandingRequest createManageDeviceRebrandingRequest() {
        return new ManageDeviceRebrandingRequest();
    }

    /**
     * Create an instance of {@link ManageDeviceRebrandingResponse }
     * 
     */
    public ManageDeviceRebrandingResponse createManageDeviceRebrandingResponse() {
        return new ManageDeviceRebrandingResponse();
    }

    /**
     * Create an instance of {@link QueryUserListForStoresRequest }
     * 
     */
    public QueryUserListForStoresRequest createQueryUserListForStoresRequest() {
        return new QueryUserListForStoresRequest();
    }

    /**
     * Create an instance of {@link QueryUserListForStoresResponse }
     * 
     */
    public QueryUserListForStoresResponse createQueryUserListForStoresResponse() {
        return new QueryUserListForStoresResponse();
    }

    /**
     * Create an instance of {@link QueryOriginalSaleTransactionRequest }
     * 
     */
    public QueryOriginalSaleTransactionRequest createQueryOriginalSaleTransactionRequest() {
        return new QueryOriginalSaleTransactionRequest();
    }

    /**
     * Create an instance of {@link QueryOriginalSaleTransactionResponse }
     * 
     */
    public QueryOriginalSaleTransactionResponse createQueryOriginalSaleTransactionResponse() {
        return new QueryOriginalSaleTransactionResponse();
    }

    /**
     * Create an instance of {@link QueryWebOrderListRequest }
     * 
     */
    public QueryWebOrderListRequest createQueryWebOrderListRequest() {
        return new QueryWebOrderListRequest();
    }

    /**
     * Create an instance of {@link QueryWebOrderListResponse }
     * 
     */
    public QueryWebOrderListResponse createQueryWebOrderListResponse() {
        return new QueryWebOrderListResponse();
    }

    /**
     * Create an instance of {@link QueryTransactionHistoryRequest }
     * 
     */
    public QueryTransactionHistoryRequest createQueryTransactionHistoryRequest() {
        return new QueryTransactionHistoryRequest();
    }

    /**
     * Create an instance of {@link QueryTransactionHistoryResponse }
     * 
     */
    public QueryTransactionHistoryResponse createQueryTransactionHistoryResponse() {
        return new QueryTransactionHistoryResponse();
    }

    /**
     * Create an instance of {@link QueryDeviceSaleableStatusRequest }
     * 
     */
    public QueryDeviceSaleableStatusRequest createQueryDeviceSaleableStatusRequest() {
        return new QueryDeviceSaleableStatusRequest();
    }

    /**
     * Create an instance of {@link QueryDeviceSaleableStatusResponse }
     * 
     */
    public QueryDeviceSaleableStatusResponse createQueryDeviceSaleableStatusResponse() {
        return new QueryDeviceSaleableStatusResponse();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link ByPassAuthenticationInfo }
     * 
     */
    public ByPassAuthenticationInfo createByPassAuthenticationInfo() {
        return new ByPassAuthenticationInfo();
    }

    /**
     * Create an instance of {@link KitComponent }
     * 
     */
    public KitComponent createKitComponent() {
        return new KitComponent();
    }

    /**
     * Create an instance of {@link DeviceInfo }
     * 
     */
    public DeviceInfo createDeviceInfo() {
        return new DeviceInfo();
    }

    /**
     * Create an instance of {@link ProductBasicInfo }
     * 
     */
    public ProductBasicInfo createProductBasicInfo() {
        return new ProductBasicInfo();
    }

    /**
     * Create an instance of {@link TargetBrandInfo }
     * 
     */
    public TargetBrandInfo createTargetBrandInfo() {
        return new TargetBrandInfo();
    }

    /**
     * Create an instance of {@link PaymentList }
     * 
     */
    public PaymentList createPaymentList() {
        return new PaymentList();
    }

    /**
     * Create an instance of {@link QueryPendingPaymentInfo }
     * 
     */
    public QueryPendingPaymentInfo createQueryPendingPaymentInfo() {
        return new QueryPendingPaymentInfo();
    }

    /**
     * Create an instance of {@link QueryPendingCustomerInfo }
     * 
     */
    public QueryPendingCustomerInfo createQueryPendingCustomerInfo() {
        return new QueryPendingCustomerInfo();
    }

    /**
     * Create an instance of {@link ManagePendingPaymentInfo }
     * 
     */
    public ManagePendingPaymentInfo createManagePendingPaymentInfo() {
        return new ManagePendingPaymentInfo();
    }

    /**
     * Create an instance of {@link CreditCardDetailsList }
     * 
     */
    public CreditCardDetailsList createCreditCardDetailsList() {
        return new CreditCardDetailsList();
    }

    /**
     * Create an instance of {@link GiftCardDetailsList }
     * 
     */
    public GiftCardDetailsList createGiftCardDetailsList() {
        return new GiftCardDetailsList();
    }

    /**
     * Create an instance of {@link CreditCardDetailsInfo }
     * 
     */
    public CreditCardDetailsInfo createCreditCardDetailsInfo() {
        return new CreditCardDetailsInfo();
    }

    /**
     * Create an instance of {@link GiftCardDetailsInfo }
     * 
     */
    public GiftCardDetailsInfo createGiftCardDetailsInfo() {
        return new GiftCardDetailsInfo();
    }

    /**
     * Create an instance of {@link ProductOtherInfo }
     * 
     */
    public ProductOtherInfo createProductOtherInfo() {
        return new ProductOtherInfo();
    }

    /**
     * Create an instance of {@link StoreBasicInfo }
     * 
     */
    public StoreBasicInfo createStoreBasicInfo() {
        return new StoreBasicInfo();
    }

    /**
     * Create an instance of {@link StoreOtherInfo }
     * 
     */
    public StoreOtherInfo createStoreOtherInfo() {
        return new StoreOtherInfo();
    }

    /**
     * Create an instance of {@link TaxDetails }
     * 
     */
    public TaxDetails createTaxDetails() {
        return new TaxDetails();
    }

    /**
     * Create an instance of {@link TaxInfo }
     * 
     */
    public TaxInfo createTaxInfo() {
        return new TaxInfo();
    }

    /**
     * Create an instance of {@link ItemDetails }
     * 
     */
    public ItemDetails createItemDetails() {
        return new ItemDetails();
    }

    /**
     * Create an instance of {@link KitInfo }
     * 
     */
    public KitInfo createKitInfo() {
        return new KitInfo();
    }

    /**
     * Create an instance of {@link SourceSkuInfo }
     * 
     */
    public SourceSkuInfo createSourceSkuInfo() {
        return new SourceSkuInfo();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link QuerySalesRepIdValidationRequest }
     * 
     */
    public QuerySalesRepIdValidationRequest createQuerySalesRepIdValidationRequest() {
        return new QuerySalesRepIdValidationRequest();
    }

    /**
     * Create an instance of {@link OrderInfo }
     * 
     */
    public OrderInfo createOrderInfo() {
        return new OrderInfo();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link AppointmentInfo }
     * 
     */
    public AppointmentInfo createAppointmentInfo() {
        return new AppointmentInfo();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link OrderLinesList }
     * 
     */
    public OrderLinesList createOrderLinesList() {
        return new OrderLinesList();
    }

    /**
     * Create an instance of {@link OrderLinesInfo }
     * 
     */
    public OrderLinesInfo createOrderLinesInfo() {
        return new OrderLinesInfo();
    }

    /**
     * Create an instance of {@link WebOrderList }
     * 
     */
    public WebOrderList createWebOrderList() {
        return new WebOrderList();
    }

    /**
     * Create an instance of {@link Storesku }
     * 
     */
    public Storesku createStoresku() {
        return new Storesku();
    }

    /**
     * Create an instance of {@link Stores }
     * 
     */
    public Stores createStores() {
        return new Stores();
    }

    /**
     * Create an instance of {@link Skus }
     * 
     */
    public Skus createSkus() {
        return new Skus();
    }

    /**
     * Create an instance of {@link QueryCalculateTaxesRequest }
     * 
     */
    public QueryCalculateTaxesRequest createQueryCalculateTaxesRequest() {
        return new QueryCalculateTaxesRequest();
    }

    /**
     * Create an instance of {@link CalcTaxSkuInfoList }
     * 
     */
    public CalcTaxSkuInfoList createCalcTaxSkuInfoList() {
        return new CalcTaxSkuInfoList();
    }

    /**
     * Create an instance of {@link CalcTaxSkuInfo }
     * 
     */
    public CalcTaxSkuInfo createCalcTaxSkuInfo() {
        return new CalcTaxSkuInfo();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link DatabaseErrorDetails }
     * 
     */
    public DatabaseErrorDetails createDatabaseErrorDetails() {
        return new DatabaseErrorDetails();
    }

    /**
     * Create an instance of {@link MessageInfo }
     * 
     */
    public MessageInfo createMessageInfo() {
        return new MessageInfo();
    }

    /**
     * Create an instance of {@link ProductIdResultSet }
     * 
     */
    public ProductIdResultSet createProductIdResultSet() {
        return new ProductIdResultSet();
    }

    /**
     * Create an instance of {@link KitItemPricingDetails }
     * 
     */
    public KitItemPricingDetails createKitItemPricingDetails() {
        return new KitItemPricingDetails();
    }

    /**
     * Create an instance of {@link EmployeeInfo }
     * 
     */
    public EmployeeInfo createEmployeeInfo() {
        return new EmployeeInfo();
    }

    /**
     * Create an instance of {@link StoreAddress }
     * 
     */
    public StoreAddress createStoreAddress() {
        return new StoreAddress();
    }

    /**
     * Create an instance of {@link ProductInvDetails }
     * 
     */
    public ProductInvDetails createProductInvDetails() {
        return new ProductInvDetails();
    }

    /**
     * Create an instance of {@link ProductDetailsbyStore }
     * 
     */
    public ProductDetailsbyStore createProductDetailsbyStore() {
        return new ProductDetailsbyStore();
    }

    /**
     * Create an instance of {@link ProductPromotionInfo }
     * 
     */
    public ProductPromotionInfo createProductPromotionInfo() {
        return new ProductPromotionInfo();
    }

    /**
     * Create an instance of {@link ProductStockedResultSet }
     * 
     */
    public ProductStockedResultSet createProductStockedResultSet() {
        return new ProductStockedResultSet();
    }

    /**
     * Create an instance of {@link PrepaidSkuList }
     * 
     */
    public PrepaidSkuList createPrepaidSkuList() {
        return new PrepaidSkuList();
    }

    /**
     * Create an instance of {@link PrepaidSkuInfo }
     * 
     */
    public PrepaidSkuInfo createPrepaidSkuInfo() {
        return new PrepaidSkuInfo();
    }

    /**
     * Create an instance of {@link ValidateProductSerialInformationResultSet }
     * 
     */
    public ValidateProductSerialInformationResultSet createValidateProductSerialInformationResultSet() {
        return new ValidateProductSerialInformationResultSet();
    }

    /**
     * Create an instance of {@link QuerySalesRepIdValidationResponse }
     * 
     */
    public QuerySalesRepIdValidationResponse createQuerySalesRepIdValidationResponse() {
        return new QuerySalesRepIdValidationResponse();
    }

    /**
     * Create an instance of {@link CreateStoreOrderNotificationResponse }
     * 
     */
    public CreateStoreOrderNotificationResponse createCreateStoreOrderNotificationResponse() {
        return new CreateStoreOrderNotificationResponse();
    }

    /**
     * Create an instance of {@link QueryCalculateTaxesResponse }
     * 
     */
    public QueryCalculateTaxesResponse createQueryCalculateTaxesResponse() {
        return new QueryCalculateTaxesResponse();
    }

    /**
     * Create an instance of {@link TaxInfoList }
     * 
     */
    public TaxInfoList createTaxInfoList() {
        return new TaxInfoList();
    }

    /**
     * Create an instance of {@link TaxInformation }
     * 
     */
    public TaxInformation createTaxInformation() {
        return new TaxInformation();
    }

    /**
     * Create an instance of {@link SkuErrorInfoList }
     * 
     */
    public SkuErrorInfoList createSkuErrorInfoList() {
        return new SkuErrorInfoList();
    }

    /**
     * Create an instance of {@link SkuErrorInfo }
     * 
     */
    public SkuErrorInfo createSkuErrorInfo() {
        return new SkuErrorInfo();
    }

    /**
     * Create an instance of {@link StoreInfo }
     * 
     */
    public StoreInfo createStoreInfo() {
        return new StoreInfo();
    }

    /**
     * Create an instance of {@link StoreskuqtyList }
     * 
     */
    public StoreskuqtyList createStoreskuqtyList() {
        return new StoreskuqtyList();
    }

    /**
     * Create an instance of {@link StoreskuInfo }
     * 
     */
    public StoreskuInfo createStoreskuInfo() {
        return new StoreskuInfo();
    }

    /**
     * Create an instance of {@link Skuqtyinfo }
     * 
     */
    public Skuqtyinfo createSkuqtyinfo() {
        return new Skuqtyinfo();
    }

    /**
     * Create an instance of {@link StoreErrorInfo }
     * 
     */
    public StoreErrorInfo createStoreErrorInfo() {
        return new StoreErrorInfo();
    }

    /**
     * Create an instance of {@link ExemptTaxId }
     * 
     */
    public ExemptTaxId createExemptTaxId() {
        return new ExemptTaxId();
    }

    /**
     * Create an instance of {@link CustomerBasicInfo }
     * 
     */
    public CustomerBasicInfo createCustomerBasicInfo() {
        return new CustomerBasicInfo();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link IdVerificationDetails }
     * 
     */
    public IdVerificationDetails createIdVerificationDetails() {
        return new IdVerificationDetails();
    }

    /**
     * Create an instance of {@link UpdateConsentInfo }
     * 
     */
    public UpdateConsentInfo createUpdateConsentInfo() {
        return new UpdateConsentInfo();
    }

    /**
     * Create an instance of {@link ConsentDetailsList }
     * 
     */
    public ConsentDetailsList createConsentDetailsList() {
        return new ConsentDetailsList();
    }

    /**
     * Create an instance of {@link ConsentDetailsInfo }
     * 
     */
    public ConsentDetailsInfo createConsentDetailsInfo() {
        return new ConsentDetailsInfo();
    }

    /**
     * Create an instance of {@link InsertInstallmentConsentInfo }
     * 
     */
    public InsertInstallmentConsentInfo createInsertInstallmentConsentInfo() {
        return new InsertInstallmentConsentInfo();
    }

    /**
     * Create an instance of {@link InsertInstallmentConsentDetailsInfo }
     * 
     */
    public InsertInstallmentConsentDetailsInfo createInsertInstallmentConsentDetailsInfo() {
        return new InsertInstallmentConsentDetailsInfo();
    }

    /**
     * Create an instance of {@link LoanDetailsList }
     * 
     */
    public LoanDetailsList createLoanDetailsList() {
        return new LoanDetailsList();
    }

    /**
     * Create an instance of {@link LoanDetailsInfo }
     * 
     */
    public LoanDetailsInfo createLoanDetailsInfo() {
        return new LoanDetailsInfo();
    }

    /**
     * Create an instance of {@link Taxes }
     * 
     */
    public Taxes createTaxes() {
        return new Taxes();
    }

    /**
     * Create an instance of {@link FinancingModelInfo }
     * 
     */
    public FinancingModelInfo createFinancingModelInfo() {
        return new FinancingModelInfo();
    }

    /**
     * Create an instance of {@link MacInfo }
     * 
     */
    public MacInfo createMacInfo() {
        return new MacInfo();
    }

    /**
     * Create an instance of {@link FinancingHCDetails }
     * 
     */
    public FinancingHCDetails createFinancingHCDetails() {
        return new FinancingHCDetails();
    }

    /**
     * Create an instance of {@link InsertConsentInfo }
     * 
     */
    public InsertConsentInfo createInsertConsentInfo() {
        return new InsertConsentInfo();
    }

    /**
     * Create an instance of {@link InsertConsentDetailsInfo }
     * 
     */
    public InsertConsentDetailsInfo createInsertConsentDetailsInfo() {
        return new InsertConsentDetailsInfo();
    }

    /**
     * Create an instance of {@link InsertConsentInfoList }
     * 
     */
    public InsertConsentInfoList createInsertConsentInfoList() {
        return new InsertConsentInfoList();
    }

    /**
     * Create an instance of {@link InsertConsentLineItemList }
     * 
     */
    public InsertConsentLineItemList createInsertConsentLineItemList() {
        return new InsertConsentLineItemList();
    }

    /**
     * Create an instance of {@link InsertConsentLineItemInfo }
     * 
     */
    public InsertConsentLineItemInfo createInsertConsentLineItemInfo() {
        return new InsertConsentLineItemInfo();
    }

    /**
     * Create an instance of {@link ContractInfo }
     * 
     */
    public ContractInfo createContractInfo() {
        return new ContractInfo();
    }

    /**
     * Create an instance of {@link CreditAccountConsentInfo }
     * 
     */
    public CreditAccountConsentInfo createCreditAccountConsentInfo() {
        return new CreditAccountConsentInfo();
    }

    /**
     * Create an instance of {@link HcAgreementInfo }
     * 
     */
    public HcAgreementInfo createHcAgreementInfo() {
        return new HcAgreementInfo();
    }

    /**
     * Create an instance of {@link ShoppingCartOrderLinesList }
     * 
     */
    public ShoppingCartOrderLinesList createShoppingCartOrderLinesList() {
        return new ShoppingCartOrderLinesList();
    }

    /**
     * Create an instance of {@link CustomerAddressInfo }
     * 
     */
    public CustomerAddressInfo createCustomerAddressInfo() {
        return new CustomerAddressInfo();
    }

    /**
     * Create an instance of {@link ShoppingCartOrderLinesInfo }
     * 
     */
    public ShoppingCartOrderLinesInfo createShoppingCartOrderLinesInfo() {
        return new ShoppingCartOrderLinesInfo();
    }

    /**
     * Create an instance of {@link AppSOCList }
     * 
     */
    public AppSOCList createAppSOCList() {
        return new AppSOCList();
    }

    /**
     * Create an instance of {@link AppSOCInfo }
     * 
     */
    public AppSOCInfo createAppSOCInfo() {
        return new AppSOCInfo();
    }

    /**
     * Create an instance of {@link FinancingOfferInfo }
     * 
     */
    public FinancingOfferInfo createFinancingOfferInfo() {
        return new FinancingOfferInfo();
    }

    /**
     * Create an instance of {@link FinancingOfferItemInfoList }
     * 
     */
    public FinancingOfferItemInfoList createFinancingOfferItemInfoList() {
        return new FinancingOfferItemInfoList();
    }

    /**
     * Create an instance of {@link FinancingOfferItemInfo }
     * 
     */
    public FinancingOfferItemInfo createFinancingOfferItemInfo() {
        return new FinancingOfferItemInfo();
    }

    /**
     * Create an instance of {@link CreateOrderInRmsResponse }
     * 
     */
    public CreateOrderInRmsResponse createCreateOrderInRmsResponse() {
        return new CreateOrderInRmsResponse();
    }

    /**
     * Create an instance of {@link UserErrorInfo }
     * 
     */
    public UserErrorInfo createUserErrorInfo() {
        return new UserErrorInfo();
    }

    /**
     * Create an instance of {@link ShoppingCartStoreErrorInfo }
     * 
     */
    public ShoppingCartStoreErrorInfo createShoppingCartStoreErrorInfo() {
        return new ShoppingCartStoreErrorInfo();
    }

    /**
     * Create an instance of {@link ShoppingCartSkuErrorInfoList }
     * 
     */
    public ShoppingCartSkuErrorInfoList createShoppingCartSkuErrorInfoList() {
        return new ShoppingCartSkuErrorInfoList();
    }

    /**
     * Create an instance of {@link ShoppingCartSkuErrorInfo }
     * 
     */
    public ShoppingCartSkuErrorInfo createShoppingCartSkuErrorInfo() {
        return new ShoppingCartSkuErrorInfo();
    }

    /**
     * Create an instance of {@link QueryConsentListResponse }
     * 
     */
    public QueryConsentListResponse createQueryConsentListResponse() {
        return new QueryConsentListResponse();
    }

    /**
     * Create an instance of {@link ConsentList }
     * 
     */
    public ConsentList createConsentList() {
        return new ConsentList();
    }

    /**
     * Create an instance of {@link ConsentInfo }
     * 
     */
    public ConsentInfo createConsentInfo() {
        return new ConsentInfo();
    }

    /**
     * Create an instance of {@link ManageInstallmentConsentDetailsResponse }
     * 
     */
    public ManageInstallmentConsentDetailsResponse createManageInstallmentConsentDetailsResponse() {
        return new ManageInstallmentConsentDetailsResponse();
    }

    /**
     * Create an instance of {@link ManageConsentDetailsResponse }
     * 
     */
    public ManageConsentDetailsResponse createManageConsentDetailsResponse() {
        return new ManageConsentDetailsResponse();
    }

    /**
     * Create an instance of {@link ContractList }
     * 
     */
    public ContractList createContractList() {
        return new ContractList();
    }

    /**
     * Create an instance of {@link ContractPtnSerialNoInfo }
     * 
     */
    public ContractPtnSerialNoInfo createContractPtnSerialNoInfo() {
        return new ContractPtnSerialNoInfo();
    }

    /**
     * Create an instance of {@link E911ConsentList }
     * 
     */
    public E911ConsentList createE911ConsentList() {
        return new E911ConsentList();
    }

    /**
     * Create an instance of {@link E911ConsentInfo }
     * 
     */
    public E911ConsentInfo createE911ConsentInfo() {
        return new E911ConsentInfo();
    }

    /**
     * Create an instance of {@link QueryOrderFromRmsResponse }
     * 
     */
    public QueryOrderFromRmsResponse createQueryOrderFromRmsResponse() {
        return new QueryOrderFromRmsResponse();
    }

    /**
     * Create an instance of {@link ErrorInfo }
     * 
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link PreffOrderInfo }
     * 
     */
    public PreffOrderInfo createPreffOrderInfo() {
        return new PreffOrderInfo();
    }

    /**
     * Create an instance of {@link ItemsList }
     * 
     */
    public ItemsList createItemsList() {
        return new ItemsList();
    }

    /**
     * Create an instance of {@link ItemsInfo }
     * 
     */
    public ItemsInfo createItemsInfo() {
        return new ItemsInfo();
    }

    /**
     * Create an instance of {@link TendersList }
     * 
     */
    public TendersList createTendersList() {
        return new TendersList();
    }

    /**
     * Create an instance of {@link TendersInfo }
     * 
     */
    public TendersInfo createTendersInfo() {
        return new TendersInfo();
    }

    /**
     * Create an instance of {@link ShoppingCartOrderInfo }
     * 
     */
    public ShoppingCartOrderInfo createShoppingCartOrderInfo() {
        return new ShoppingCartOrderInfo();
    }

    /**
     * Create an instance of {@link PortinQuestionAnswerList }
     * 
     */
    public PortinQuestionAnswerList createPortinQuestionAnswerList() {
        return new PortinQuestionAnswerList();
    }

    /**
     * Create an instance of {@link PortinQuestionAnswerInfo }
     * 
     */
    public PortinQuestionAnswerInfo createPortinQuestionAnswerInfo() {
        return new PortinQuestionAnswerInfo();
    }

    /**
     * Create an instance of {@link BuybackItemsList }
     * 
     */
    public BuybackItemsList createBuybackItemsList() {
        return new BuybackItemsList();
    }

    /**
     * Create an instance of {@link BuybackItemInfo }
     * 
     */
    public BuybackItemInfo createBuybackItemInfo() {
        return new BuybackItemInfo();
    }

    /**
     * Create an instance of {@link ConditionAnswerList }
     * 
     */
    public ConditionAnswerList createConditionAnswerList() {
        return new ConditionAnswerList();
    }

    /**
     * Create an instance of {@link ConditionAnswerInfo }
     * 
     */
    public ConditionAnswerInfo createConditionAnswerInfo() {
        return new ConditionAnswerInfo();
    }

    /**
     * Create an instance of {@link PriceDetailInfo }
     * 
     */
    public PriceDetailInfo createPriceDetailInfo() {
        return new PriceDetailInfo();
    }

    /**
     * Create an instance of {@link BuybackFundsList }
     * 
     */
    public BuybackFundsList createBuybackFundsList() {
        return new BuybackFundsList();
    }

    /**
     * Create an instance of {@link BuybackFundsInfo }
     * 
     */
    public BuybackFundsInfo createBuybackFundsInfo() {
        return new BuybackFundsInfo();
    }

    /**
     * Create an instance of {@link TradeInItemsList }
     * 
     */
    public TradeInItemsList createTradeInItemsList() {
        return new TradeInItemsList();
    }

    /**
     * Create an instance of {@link TradeInItemInfo }
     * 
     */
    public TradeInItemInfo createTradeInItemInfo() {
        return new TradeInItemInfo();
    }

    /**
     * Create an instance of {@link TradeInConditionAnswerList }
     * 
     */
    public TradeInConditionAnswerList createTradeInConditionAnswerList() {
        return new TradeInConditionAnswerList();
    }

    /**
     * Create an instance of {@link TradeInConditionAnswerInfo }
     * 
     */
    public TradeInConditionAnswerInfo createTradeInConditionAnswerInfo() {
        return new TradeInConditionAnswerInfo();
    }

    /**
     * Create an instance of {@link ResetPasswordResponse }
     * 
     */
    public ResetPasswordResponse createResetPasswordResponse() {
        return new ResetPasswordResponse();
    }

    /**
     * Create an instance of {@link QueryInstallmentConsentDetailsResponse }
     * 
     */
    public QueryInstallmentConsentDetailsResponse createQueryInstallmentConsentDetailsResponse() {
        return new QueryInstallmentConsentDetailsResponse();
    }

    /**
     * Create an instance of {@link AssignRegisterAndFloatResponse }
     * 
     */
    public AssignRegisterAndFloatResponse createAssignRegisterAndFloatResponse() {
        return new AssignRegisterAndFloatResponse();
    }

    /**
     * Create an instance of {@link StoresList }
     * 
     */
    public StoresList createStoresList() {
        return new StoresList();
    }

    /**
     * Create an instance of {@link StoresInfo }
     * 
     */
    public StoresInfo createStoresInfo() {
        return new StoresInfo();
    }

    /**
     * Create an instance of {@link SharedCashDrawerList }
     * 
     */
    public SharedCashDrawerList createSharedCashDrawerList() {
        return new SharedCashDrawerList();
    }

    /**
     * Create an instance of {@link SharedCashDrawerInfo }
     * 
     */
    public SharedCashDrawerInfo createSharedCashDrawerInfo() {
        return new SharedCashDrawerInfo();
    }

    /**
     * Create an instance of {@link MerchantCardDetails }
     * 
     */
    public MerchantCardDetails createMerchantCardDetails() {
        return new MerchantCardDetails();
    }

    /**
     * Create an instance of {@link MerchantCardInfo }
     * 
     */
    public MerchantCardInfo createMerchantCardInfo() {
        return new MerchantCardInfo();
    }

    /**
     * Create an instance of {@link ConsentInfoList }
     * 
     */
    public ConsentInfoList createConsentInfoList() {
        return new ConsentInfoList();
    }

    /**
     * Create an instance of {@link ContractInfoEIB }
     * 
     */
    public ContractInfoEIB createContractInfoEIB() {
        return new ContractInfoEIB();
    }

    /**
     * Create an instance of {@link TransactionReferenceInfo }
     * 
     */
    public TransactionReferenceInfo createTransactionReferenceInfo() {
        return new TransactionReferenceInfo();
    }

    /**
     * Create an instance of {@link LoanDetailInfo }
     * 
     */
    public LoanDetailInfo createLoanDetailInfo() {
        return new LoanDetailInfo();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link NameInfo }
     * 
     */
    public NameInfo createNameInfo() {
        return new NameInfo();
    }

    /**
     * Create an instance of {@link EibCustomerAddressInfo }
     * 
     */
    public EibCustomerAddressInfo createEibCustomerAddressInfo() {
        return new EibCustomerAddressInfo();
    }

    /**
     * Create an instance of {@link SalesDetailInfo }
     * 
     */
    public SalesDetailInfo createSalesDetailInfo() {
        return new SalesDetailInfo();
    }

    /**
     * Create an instance of {@link SalesTaxInfo }
     * 
     */
    public SalesTaxInfo createSalesTaxInfo() {
        return new SalesTaxInfo();
    }

    /**
     * Create an instance of {@link ContractTemplateMappingInfo }
     * 
     */
    public ContractTemplateMappingInfo createContractTemplateMappingInfo() {
        return new ContractTemplateMappingInfo();
    }

    /**
     * Create an instance of {@link ContractMappingAddress }
     * 
     */
    public ContractMappingAddress createContractMappingAddress() {
        return new ContractMappingAddress();
    }

    /**
     * Create an instance of {@link StoreInformation }
     * 
     */
    public StoreInformation createStoreInformation() {
        return new StoreInformation();
    }

    /**
     * Create an instance of {@link StoreAddressInfo }
     * 
     */
    public StoreAddressInfo createStoreAddressInfo() {
        return new StoreAddressInfo();
    }

    /**
     * Create an instance of {@link DiscountList }
     * 
     */
    public DiscountList createDiscountList() {
        return new DiscountList();
    }

    /**
     * Create an instance of {@link DiscountInfo }
     * 
     */
    public DiscountInfo createDiscountInfo() {
        return new DiscountInfo();
    }

    /**
     * Create an instance of {@link QueryConsentVerbiageList }
     * 
     */
    public QueryConsentVerbiageList createQueryConsentVerbiageList() {
        return new QueryConsentVerbiageList();
    }

    /**
     * Create an instance of {@link QueryConsentVerbiageInfo }
     * 
     */
    public QueryConsentVerbiageInfo createQueryConsentVerbiageInfo() {
        return new QueryConsentVerbiageInfo();
    }

    /**
     * Create an instance of {@link TenderTypeList }
     * 
     */
    public TenderTypeList createTenderTypeList() {
        return new TenderTypeList();
    }

    /**
     * Create an instance of {@link TenderTypeInfo }
     * 
     */
    public TenderTypeInfo createTenderTypeInfo() {
        return new TenderTypeInfo();
    }

    /**
     * Create an instance of {@link CardTypeList }
     * 
     */
    public CardTypeList createCardTypeList() {
        return new CardTypeList();
    }

    /**
     * Create an instance of {@link CardTypeInfo }
     * 
     */
    public CardTypeInfo createCardTypeInfo() {
        return new CardTypeInfo();
    }

    /**
     * Create an instance of {@link ActionTypeList }
     * 
     */
    public ActionTypeList createActionTypeList() {
        return new ActionTypeList();
    }

    /**
     * Create an instance of {@link ActionTypeInfo }
     * 
     */
    public ActionTypeInfo createActionTypeInfo() {
        return new ActionTypeInfo();
    }

    /**
     * Create an instance of {@link OverideReasonList }
     * 
     */
    public OverideReasonList createOverideReasonList() {
        return new OverideReasonList();
    }

    /**
     * Create an instance of {@link OverideReasonInfo }
     * 
     */
    public OverideReasonInfo createOverideReasonInfo() {
        return new OverideReasonInfo();
    }

    /**
     * Create an instance of {@link TransactionTypeList }
     * 
     */
    public TransactionTypeList createTransactionTypeList() {
        return new TransactionTypeList();
    }

    /**
     * Create an instance of {@link TransactionTypeInfo }
     * 
     */
    public TransactionTypeInfo createTransactionTypeInfo() {
        return new TransactionTypeInfo();
    }

    /**
     * Create an instance of {@link OmimReturnReasonCodeList }
     * 
     */
    public OmimReturnReasonCodeList createOmimReturnReasonCodeList() {
        return new OmimReturnReasonCodeList();
    }

    /**
     * Create an instance of {@link OmimReturnReasonCodeInfo }
     * 
     */
    public OmimReturnReasonCodeInfo createOmimReturnReasonCodeInfo() {
        return new OmimReturnReasonCodeInfo();
    }

    /**
     * Create an instance of {@link BopuisTenderStatusInfoList }
     * 
     */
    public BopuisTenderStatusInfoList createBopuisTenderStatusInfoList() {
        return new BopuisTenderStatusInfoList();
    }

    /**
     * Create an instance of {@link BopuisTenderStatusInfo }
     * 
     */
    public BopuisTenderStatusInfo createBopuisTenderStatusInfo() {
        return new BopuisTenderStatusInfo();
    }

    /**
     * Create an instance of {@link UpdateTransactionData }
     * 
     */
    public UpdateTransactionData createUpdateTransactionData() {
        return new UpdateTransactionData();
    }

    /**
     * Create an instance of {@link UpdateTransactionDateTimeInfo }
     * 
     */
    public UpdateTransactionDateTimeInfo createUpdateTransactionDateTimeInfo() {
        return new UpdateTransactionDateTimeInfo();
    }

    /**
     * Create an instance of {@link UpdateTransactionRegisterInfo }
     * 
     */
    public UpdateTransactionRegisterInfo createUpdateTransactionRegisterInfo() {
        return new UpdateTransactionRegisterInfo();
    }

    /**
     * Create an instance of {@link UpdateTransactionServicesStatusList }
     * 
     */
    public UpdateTransactionServicesStatusList createUpdateTransactionServicesStatusList() {
        return new UpdateTransactionServicesStatusList();
    }

    /**
     * Create an instance of {@link UpdateTransactionServicesStatusInfo }
     * 
     */
    public UpdateTransactionServicesStatusInfo createUpdateTransactionServicesStatusInfo() {
        return new UpdateTransactionServicesStatusInfo();
    }

    /**
     * Create an instance of {@link UpdateAccessoryLoanDetailsList }
     * 
     */
    public UpdateAccessoryLoanDetailsList createUpdateAccessoryLoanDetailsList() {
        return new UpdateAccessoryLoanDetailsList();
    }

    /**
     * Create an instance of {@link UpdateAccessoryLoanDetailsInfo }
     * 
     */
    public UpdateAccessoryLoanDetailsInfo createUpdateAccessoryLoanDetailsInfo() {
        return new UpdateAccessoryLoanDetailsInfo();
    }

    /**
     * Create an instance of {@link CreateTransInfo }
     * 
     */
    public CreateTransInfo createCreateTransInfo() {
        return new CreateTransInfo();
    }

    /**
     * Create an instance of {@link RadioShackInfo }
     * 
     */
    public RadioShackInfo createRadioShackInfo() {
        return new RadioShackInfo();
    }

    /**
     * Create an instance of {@link DirectShipInfo }
     * 
     */
    public DirectShipInfo createDirectShipInfo() {
        return new DirectShipInfo();
    }

    /**
     * Create an instance of {@link AddressInfo }
     * 
     */
    public AddressInfo createAddressInfo() {
        return new AddressInfo();
    }

    /**
     * Create an instance of {@link CreateActionTypeList }
     * 
     */
    public CreateActionTypeList createCreateActionTypeList() {
        return new CreateActionTypeList();
    }

    /**
     * Create an instance of {@link CreateActionTypeInfo }
     * 
     */
    public CreateActionTypeInfo createCreateActionTypeInfo() {
        return new CreateActionTypeInfo();
    }

    /**
     * Create an instance of {@link TransactionItemList }
     * 
     */
    public TransactionItemList createTransactionItemList() {
        return new TransactionItemList();
    }

    /**
     * Create an instance of {@link TransactionItemInfo }
     * 
     */
    public TransactionItemInfo createTransactionItemInfo() {
        return new TransactionItemInfo();
    }

    /**
     * Create an instance of {@link RadioShackLineInfo }
     * 
     */
    public RadioShackLineInfo createRadioShackLineInfo() {
        return new RadioShackLineInfo();
    }

    /**
     * Create an instance of {@link BuybackAnswerList }
     * 
     */
    public BuybackAnswerList createBuybackAnswerList() {
        return new BuybackAnswerList();
    }

    /**
     * Create an instance of {@link BuybackAnswerInfo }
     * 
     */
    public BuybackAnswerInfo createBuybackAnswerInfo() {
        return new BuybackAnswerInfo();
    }

    /**
     * Create an instance of {@link BxgxInfo }
     * 
     */
    public BxgxInfo createBxgxInfo() {
        return new BxgxInfo();
    }

    /**
     * Create an instance of {@link TransactionItemTaxesList }
     * 
     */
    public TransactionItemTaxesList createTransactionItemTaxesList() {
        return new TransactionItemTaxesList();
    }

    /**
     * Create an instance of {@link TransactionItemTaxes }
     * 
     */
    public TransactionItemTaxes createTransactionItemTaxes() {
        return new TransactionItemTaxes();
    }

    /**
     * Create an instance of {@link TransactionDiscountItemsList }
     * 
     */
    public TransactionDiscountItemsList createTransactionDiscountItemsList() {
        return new TransactionDiscountItemsList();
    }

    /**
     * Create an instance of {@link TransactionDiscountItems }
     * 
     */
    public TransactionDiscountItems createTransactionDiscountItems() {
        return new TransactionDiscountItems();
    }

    /**
     * Create an instance of {@link EquipmentInstallBillLeaseInfo }
     * 
     */
    public EquipmentInstallBillLeaseInfo createEquipmentInstallBillLeaseInfo() {
        return new EquipmentInstallBillLeaseInfo();
    }

    /**
     * Create an instance of {@link InstallBillInfo }
     * 
     */
    public InstallBillInfo createInstallBillInfo() {
        return new InstallBillInfo();
    }

    /**
     * Create an instance of {@link LeaseInfo }
     * 
     */
    public LeaseInfo createLeaseInfo() {
        return new LeaseInfo();
    }

    /**
     * Create an instance of {@link TradeInInfo }
     * 
     */
    public TradeInInfo createTradeInInfo() {
        return new TradeInInfo();
    }

    /**
     * Create an instance of {@link EarlyUpgradeTradeInInfo }
     * 
     */
    public EarlyUpgradeTradeInInfo createEarlyUpgradeTradeInInfo() {
        return new EarlyUpgradeTradeInInfo();
    }

    /**
     * Create an instance of {@link TransactionServicesList }
     * 
     */
    public TransactionServicesList createTransactionServicesList() {
        return new TransactionServicesList();
    }

    /**
     * Create an instance of {@link TransactionServicesInfo }
     * 
     */
    public TransactionServicesInfo createTransactionServicesInfo() {
        return new TransactionServicesInfo();
    }

    /**
     * Create an instance of {@link TransactionServicesDetails }
     * 
     */
    public TransactionServicesDetails createTransactionServicesDetails() {
        return new TransactionServicesDetails();
    }

    /**
     * Create an instance of {@link TransactionTendersList }
     * 
     */
    public TransactionTendersList createTransactionTendersList() {
        return new TransactionTendersList();
    }

    /**
     * Create an instance of {@link TransactionTendersInfo }
     * 
     */
    public TransactionTendersInfo createTransactionTendersInfo() {
        return new TransactionTendersInfo();
    }

    /**
     * Create an instance of {@link BtaInfo }
     * 
     */
    public BtaInfo createBtaInfo() {
        return new BtaInfo();
    }

    /**
     * Create an instance of {@link CheckInfo }
     * 
     */
    public CheckInfo createCheckInfo() {
        return new CheckInfo();
    }

    /**
     * Create an instance of {@link GiftCardInfo }
     * 
     */
    public GiftCardInfo createGiftCardInfo() {
        return new GiftCardInfo();
    }

    /**
     * Create an instance of {@link PrecashInfo }
     * 
     */
    public PrecashInfo createPrecashInfo() {
        return new PrecashInfo();
    }

    /**
     * Create an instance of {@link CreditCardInfo }
     * 
     */
    public CreditCardInfo createCreditCardInfo() {
        return new CreditCardInfo();
    }

    /**
     * Create an instance of {@link PreAuthorizeInfo }
     * 
     */
    public PreAuthorizeInfo createPreAuthorizeInfo() {
        return new PreAuthorizeInfo();
    }

    /**
     * Create an instance of {@link SignatureInfo }
     * 
     */
    public SignatureInfo createSignatureInfo() {
        return new SignatureInfo();
    }

    /**
     * Create an instance of {@link TransactionItemsGiftCardList }
     * 
     */
    public TransactionItemsGiftCardList createTransactionItemsGiftCardList() {
        return new TransactionItemsGiftCardList();
    }

    /**
     * Create an instance of {@link TransactionItemsGiftCardInfo }
     * 
     */
    public TransactionItemsGiftCardInfo createTransactionItemsGiftCardInfo() {
        return new TransactionItemsGiftCardInfo();
    }

    /**
     * Create an instance of {@link DsReservationList }
     * 
     */
    public DsReservationList createDsReservationList() {
        return new DsReservationList();
    }

    /**
     * Create an instance of {@link DsReservationInfo }
     * 
     */
    public DsReservationInfo createDsReservationInfo() {
        return new DsReservationInfo();
    }

    /**
     * Create an instance of {@link OneClickAdditionalAttributeList }
     * 
     */
    public OneClickAdditionalAttributeList createOneClickAdditionalAttributeList() {
        return new OneClickAdditionalAttributeList();
    }

    /**
     * Create an instance of {@link OneClickAdditionalAttributeInfo }
     * 
     */
    public OneClickAdditionalAttributeInfo createOneClickAdditionalAttributeInfo() {
        return new OneClickAdditionalAttributeInfo();
    }

    /**
     * Create an instance of {@link UpdateTransaction }
     * 
     */
    public UpdateTransaction createUpdateTransaction() {
        return new UpdateTransaction();
    }

    /**
     * Create an instance of {@link UpdateTransactionTimeInfo }
     * 
     */
    public UpdateTransactionTimeInfo createUpdateTransactionTimeInfo() {
        return new UpdateTransactionTimeInfo();
    }

    /**
     * Create an instance of {@link UpdateTransactionServicesList }
     * 
     */
    public UpdateTransactionServicesList createUpdateTransactionServicesList() {
        return new UpdateTransactionServicesList();
    }

    /**
     * Create an instance of {@link UpdateTransactionServicesInfo }
     * 
     */
    public UpdateTransactionServicesInfo createUpdateTransactionServicesInfo() {
        return new UpdateTransactionServicesInfo();
    }

    /**
     * Create an instance of {@link UpdateFastOrderIdInfo }
     * 
     */
    public UpdateFastOrderIdInfo createUpdateFastOrderIdInfo() {
        return new UpdateFastOrderIdInfo();
    }

    /**
     * Create an instance of {@link UpdateRecycleItemList }
     * 
     */
    public UpdateRecycleItemList createUpdateRecycleItemList() {
        return new UpdateRecycleItemList();
    }

    /**
     * Create an instance of {@link UpdateRecycleItemInfo }
     * 
     */
    public UpdateRecycleItemInfo createUpdateRecycleItemInfo() {
        return new UpdateRecycleItemInfo();
    }

    /**
     * Create an instance of {@link UpdateTradeInItemList }
     * 
     */
    public UpdateTradeInItemList createUpdateTradeInItemList() {
        return new UpdateTradeInItemList();
    }

    /**
     * Create an instance of {@link UpdateTradeInItemInfo }
     * 
     */
    public UpdateTradeInItemInfo createUpdateTradeInItemInfo() {
        return new UpdateTradeInItemInfo();
    }

    /**
     * Create an instance of {@link UpdateBogoList }
     * 
     */
    public UpdateBogoList createUpdateBogoList() {
        return new UpdateBogoList();
    }

    /**
     * Create an instance of {@link UpdateBogoInfo }
     * 
     */
    public UpdateBogoInfo createUpdateBogoInfo() {
        return new UpdateBogoInfo();
    }

    /**
     * Create an instance of {@link ReleaseDsReservationList }
     * 
     */
    public ReleaseDsReservationList createReleaseDsReservationList() {
        return new ReleaseDsReservationList();
    }

    /**
     * Create an instance of {@link ReleaseDsReservationInfo }
     * 
     */
    public ReleaseDsReservationInfo createReleaseDsReservationInfo() {
        return new ReleaseDsReservationInfo();
    }

    /**
     * Create an instance of {@link UpdatePRLottoInfo }
     * 
     */
    public UpdatePRLottoInfo createUpdatePRLottoInfo() {
        return new UpdatePRLottoInfo();
    }

    /**
     * Create an instance of {@link UpdateWebOrderList }
     * 
     */
    public UpdateWebOrderList createUpdateWebOrderList() {
        return new UpdateWebOrderList();
    }

    /**
     * Create an instance of {@link UpdateWebOrderInfo }
     * 
     */
    public UpdateWebOrderInfo createUpdateWebOrderInfo() {
        return new UpdateWebOrderInfo();
    }

    /**
     * Create an instance of {@link UpdateMsaItemList }
     * 
     */
    public UpdateMsaItemList createUpdateMsaItemList() {
        return new UpdateMsaItemList();
    }

    /**
     * Create an instance of {@link UpdateMsaItemInfo }
     * 
     */
    public UpdateMsaItemInfo createUpdateMsaItemInfo() {
        return new UpdateMsaItemInfo();
    }

    /**
     * Create an instance of {@link UpdateOmimOrderList }
     * 
     */
    public UpdateOmimOrderList createUpdateOmimOrderList() {
        return new UpdateOmimOrderList();
    }

    /**
     * Create an instance of {@link UpdateOmimOrderInfo }
     * 
     */
    public UpdateOmimOrderInfo createUpdateOmimOrderInfo() {
        return new UpdateOmimOrderInfo();
    }

    /**
     * Create an instance of {@link UpdateCustomerAccountInfo }
     * 
     */
    public UpdateCustomerAccountInfo createUpdateCustomerAccountInfo() {
        return new UpdateCustomerAccountInfo();
    }

    /**
     * Create an instance of {@link UpdateMaintenanceDetailsInfoList }
     * 
     */
    public UpdateMaintenanceDetailsInfoList createUpdateMaintenanceDetailsInfoList() {
        return new UpdateMaintenanceDetailsInfoList();
    }

    /**
     * Create an instance of {@link TransactionAddOnDetailsList }
     * 
     */
    public TransactionAddOnDetailsList createTransactionAddOnDetailsList() {
        return new TransactionAddOnDetailsList();
    }

    /**
     * Create an instance of {@link TransactionAddOnDetailsInfo }
     * 
     */
    public TransactionAddOnDetailsInfo createTransactionAddOnDetailsInfo() {
        return new TransactionAddOnDetailsInfo();
    }

    /**
     * Create an instance of {@link UpdateMaintenanceDetailsInfo }
     * 
     */
    public UpdateMaintenanceDetailsInfo createUpdateMaintenanceDetailsInfo() {
        return new UpdateMaintenanceDetailsInfo();
    }

    /**
     * Create an instance of {@link ClientPropertiesList }
     * 
     */
    public ClientPropertiesList createClientPropertiesList() {
        return new ClientPropertiesList();
    }

    /**
     * Create an instance of {@link ClientPropertiesInfo }
     * 
     */
    public ClientPropertiesInfo createClientPropertiesInfo() {
        return new ClientPropertiesInfo();
    }

    /**
     * Create an instance of {@link QueryConsentDetailsResponse }
     * 
     */
    public QueryConsentDetailsResponse createQueryConsentDetailsResponse() {
        return new QueryConsentDetailsResponse();
    }

    /**
     * Create an instance of {@link ConsentDetailList }
     * 
     */
    public ConsentDetailList createConsentDetailList() {
        return new ConsentDetailList();
    }

    /**
     * Create an instance of {@link AslConsentInfo }
     * 
     */
    public AslConsentInfo createAslConsentInfo() {
        return new AslConsentInfo();
    }

    /**
     * Create an instance of {@link EquipmentConsentInfoList }
     * 
     */
    public EquipmentConsentInfoList createEquipmentConsentInfoList() {
        return new EquipmentConsentInfoList();
    }

    /**
     * Create an instance of {@link EquipmentConsentInfo }
     * 
     */
    public EquipmentConsentInfo createEquipmentConsentInfo() {
        return new EquipmentConsentInfo();
    }

    /**
     * Create an instance of {@link OneTimeChargeConsentInfoList }
     * 
     */
    public OneTimeChargeConsentInfoList createOneTimeChargeConsentInfoList() {
        return new OneTimeChargeConsentInfoList();
    }

    /**
     * Create an instance of {@link OneTimeChargeConsentInfo }
     * 
     */
    public OneTimeChargeConsentInfo createOneTimeChargeConsentInfo() {
        return new OneTimeChargeConsentInfo();
    }

    /**
     * Create an instance of {@link LeaseConsentInfo }
     * 
     */
    public LeaseConsentInfo createLeaseConsentInfo() {
        return new LeaseConsentInfo();
    }

    /**
     * Create an instance of {@link DiscountConsentInfo }
     * 
     */
    public DiscountConsentInfo createDiscountConsentInfo() {
        return new DiscountConsentInfo();
    }

    /**
     * Create an instance of {@link FramilyConsentInfo }
     * 
     */
    public FramilyConsentInfo createFramilyConsentInfo() {
        return new FramilyConsentInfo();
    }

    /**
     * Create an instance of {@link AutoPayConsentInfo }
     * 
     */
    public AutoPayConsentInfo createAutoPayConsentInfo() {
        return new AutoPayConsentInfo();
    }

    /**
     * Create an instance of {@link WalletConsentInfo }
     * 
     */
    public WalletConsentInfo createWalletConsentInfo() {
        return new WalletConsentInfo();
    }

    /**
     * Create an instance of {@link FutureDatedPaymentConsentInfo }
     * 
     */
    public FutureDatedPaymentConsentInfo createFutureDatedPaymentConsentInfo() {
        return new FutureDatedPaymentConsentInfo();
    }

    /**
     * Create an instance of {@link AgreementConsentInfoList }
     * 
     */
    public AgreementConsentInfoList createAgreementConsentInfoList() {
        return new AgreementConsentInfoList();
    }

    /**
     * Create an instance of {@link AgreementConsentInfo }
     * 
     */
    public AgreementConsentInfo createAgreementConsentInfo() {
        return new AgreementConsentInfo();
    }

    /**
     * Create an instance of {@link AccountFunctionalityMatrixList }
     * 
     */
    public AccountFunctionalityMatrixList createAccountFunctionalityMatrixList() {
        return new AccountFunctionalityMatrixList();
    }

    /**
     * Create an instance of {@link AccountFunctionalityMatrixInfo }
     * 
     */
    public AccountFunctionalityMatrixInfo createAccountFunctionalityMatrixInfo() {
        return new AccountFunctionalityMatrixInfo();
    }

    /**
     * Create an instance of {@link CustIdentifierCustomerInfo }
     * 
     */
    public CustIdentifierCustomerInfo createCustIdentifierCustomerInfo() {
        return new CustIdentifierCustomerInfo();
    }

    /**
     * Create an instance of {@link Addresstag }
     * 
     */
    public Addresstag createAddresstag() {
        return new Addresstag();
    }

    /**
     * Create an instance of {@link StoreNameList }
     * 
     */
    public StoreNameList createStoreNameList() {
        return new StoreNameList();
    }

    /**
     * Create an instance of {@link StoreNameResponseList }
     * 
     */
    public StoreNameResponseList createStoreNameResponseList() {
        return new StoreNameResponseList();
    }

    /**
     * Create an instance of {@link StoreNameInfo }
     * 
     */
    public StoreNameInfo createStoreNameInfo() {
        return new StoreNameInfo();
    }

    /**
     * Create an instance of {@link InsertTransSummaryInfo }
     * 
     */
    public InsertTransSummaryInfo createInsertTransSummaryInfo() {
        return new InsertTransSummaryInfo();
    }

    /**
     * Create an instance of {@link InsertTransSummaryDetailsInfo }
     * 
     */
    public InsertTransSummaryDetailsInfo createInsertTransSummaryDetailsInfo() {
        return new InsertTransSummaryDetailsInfo();
    }

    /**
     * Create an instance of {@link InsertTransSummaryLineItemList }
     * 
     */
    public InsertTransSummaryLineItemList createInsertTransSummaryLineItemList() {
        return new InsertTransSummaryLineItemList();
    }

    /**
     * Create an instance of {@link InsertTransSummaryLineItemInfo }
     * 
     */
    public InsertTransSummaryLineItemInfo createInsertTransSummaryLineItemInfo() {
        return new InsertTransSummaryLineItemInfo();
    }

    /**
     * Create an instance of {@link TransSummaryInfo }
     * 
     */
    public TransSummaryInfo createTransSummaryInfo() {
        return new TransSummaryInfo();
    }

    /**
     * Create an instance of {@link TransReferenceInfo }
     * 
     */
    public TransReferenceInfo createTransReferenceInfo() {
        return new TransReferenceInfo();
    }

    /**
     * Create an instance of {@link BasAckInfo }
     * 
     */
    public BasAckInfo createBasAckInfo() {
        return new BasAckInfo();
    }

    /**
     * Create an instance of {@link BasAckMdnList }
     * 
     */
    public BasAckMdnList createBasAckMdnList() {
        return new BasAckMdnList();
    }

    /**
     * Create an instance of {@link BasAckMdnInfo }
     * 
     */
    public BasAckMdnInfo createBasAckMdnInfo() {
        return new BasAckMdnInfo();
    }

    /**
     * Create an instance of {@link OneTimeChargesList }
     * 
     */
    public OneTimeChargesList createOneTimeChargesList() {
        return new OneTimeChargesList();
    }

    /**
     * Create an instance of {@link OneTimeChargesInfo }
     * 
     */
    public OneTimeChargesInfo createOneTimeChargesInfo() {
        return new OneTimeChargesInfo();
    }

    /**
     * Create an instance of {@link ChannelInfo }
     * 
     */
    public ChannelInfo createChannelInfo() {
        return new ChannelInfo();
    }

    /**
     * Create an instance of {@link StoreDetailsInfo }
     * 
     */
    public StoreDetailsInfo createStoreDetailsInfo() {
        return new StoreDetailsInfo();
    }

    /**
     * Create an instance of {@link ChangeInfo }
     * 
     */
    public ChangeInfo createChangeInfo() {
        return new ChangeInfo();
    }

    /**
     * Create an instance of {@link ImpactedMdnInfoList }
     * 
     */
    public ImpactedMdnInfoList createImpactedMdnInfoList() {
        return new ImpactedMdnInfoList();
    }

    /**
     * Create an instance of {@link ImpactedMdnInfo }
     * 
     */
    public ImpactedMdnInfo createImpactedMdnInfo() {
        return new ImpactedMdnInfo();
    }

    /**
     * Create an instance of {@link AccountLevelInfo }
     * 
     */
    public AccountLevelInfo createAccountLevelInfo() {
        return new AccountLevelInfo();
    }

    /**
     * Create an instance of {@link AccountChargesInfo }
     * 
     */
    public AccountChargesInfo createAccountChargesInfo() {
        return new AccountChargesInfo();
    }

    /**
     * Create an instance of {@link ExtraChargesInfo }
     * 
     */
    public ExtraChargesInfo createExtraChargesInfo() {
        return new ExtraChargesInfo();
    }

    /**
     * Create an instance of {@link SecurityGroupInfoList }
     * 
     */
    public SecurityGroupInfoList createSecurityGroupInfoList() {
        return new SecurityGroupInfoList();
    }

    /**
     * Create an instance of {@link SecurityGroupInfo }
     * 
     */
    public SecurityGroupInfo createSecurityGroupInfo() {
        return new SecurityGroupInfo();
    }

    /**
     * Create an instance of {@link SecurityFunctionRulesList }
     * 
     */
    public SecurityFunctionRulesList createSecurityFunctionRulesList() {
        return new SecurityFunctionRulesList();
    }

    /**
     * Create an instance of {@link SecurityFunctionRulesInfo }
     * 
     */
    public SecurityFunctionRulesInfo createSecurityFunctionRulesInfo() {
        return new SecurityFunctionRulesInfo();
    }

    /**
     * Create an instance of {@link RuleList }
     * 
     */
    public RuleList createRuleList() {
        return new RuleList();
    }

    /**
     * Create an instance of {@link RuleInfo }
     * 
     */
    public RuleInfo createRuleInfo() {
        return new RuleInfo();
    }

    /**
     * Create an instance of {@link SecurityFunctionObjectsList }
     * 
     */
    public SecurityFunctionObjectsList createSecurityFunctionObjectsList() {
        return new SecurityFunctionObjectsList();
    }

    /**
     * Create an instance of {@link SecurityFunctionObjectsInfo }
     * 
     */
    public SecurityFunctionObjectsInfo createSecurityFunctionObjectsInfo() {
        return new SecurityFunctionObjectsInfo();
    }

    /**
     * Create an instance of {@link ObjectList }
     * 
     */
    public ObjectList createObjectList() {
        return new ObjectList();
    }

    /**
     * Create an instance of {@link ObjectInfo }
     * 
     */
    public ObjectInfo createObjectInfo() {
        return new ObjectInfo();
    }

    /**
     * Create an instance of {@link ApiXmlList }
     * 
     */
    public ApiXmlList createApiXmlList() {
        return new ApiXmlList();
    }

    /**
     * Create an instance of {@link ApiXmlInfo }
     * 
     */
    public ApiXmlInfo createApiXmlInfo() {
        return new ApiXmlInfo();
    }

    /**
     * Create an instance of {@link SendIdVerificationDataToRmsCustomerInfo }
     * 
     */
    public SendIdVerificationDataToRmsCustomerInfo createSendIdVerificationDataToRmsCustomerInfo() {
        return new SendIdVerificationDataToRmsCustomerInfo();
    }

    /**
     * Create an instance of {@link OverrideInfo }
     * 
     */
    public OverrideInfo createOverrideInfo() {
        return new OverrideInfo();
    }

    /**
     * Create an instance of {@link CustomerNameInfo }
     * 
     */
    public CustomerNameInfo createCustomerNameInfo() {
        return new CustomerNameInfo();
    }

    /**
     * Create an instance of {@link SendIdVerificationDataToRmsAddressInfo }
     * 
     */
    public SendIdVerificationDataToRmsAddressInfo createSendIdVerificationDataToRmsAddressInfo() {
        return new SendIdVerificationDataToRmsAddressInfo();
    }

    /**
     * Create an instance of {@link StoreList }
     * 
     */
    public StoreList createStoreList() {
        return new StoreList();
    }

    /**
     * Create an instance of {@link QueryUserListForStoresStoreInfo }
     * 
     */
    public QueryUserListForStoresStoreInfo createQueryUserListForStoresStoreInfo() {
        return new QueryUserListForStoresStoreInfo();
    }

    /**
     * Create an instance of {@link UserList }
     * 
     */
    public UserList createUserList() {
        return new UserList();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link TransFindInfo }
     * 
     */
    public TransFindInfo createTransFindInfo() {
        return new TransFindInfo();
    }

    /**
     * Create an instance of {@link TransHeaderList }
     * 
     */
    public TransHeaderList createTransHeaderList() {
        return new TransHeaderList();
    }

    /**
     * Create an instance of {@link TransHeaderInfo }
     * 
     */
    public TransHeaderInfo createTransHeaderInfo() {
        return new TransHeaderInfo();
    }

    /**
     * Create an instance of {@link PrevReturnDetailList }
     * 
     */
    public PrevReturnDetailList createPrevReturnDetailList() {
        return new PrevReturnDetailList();
    }

    /**
     * Create an instance of {@link PrevReturnDetailInfo }
     * 
     */
    public PrevReturnDetailInfo createPrevReturnDetailInfo() {
        return new PrevReturnDetailInfo();
    }

    /**
     * Create an instance of {@link PreviousReturnsInfo }
     * 
     */
    public PreviousReturnsInfo createPreviousReturnsInfo() {
        return new PreviousReturnsInfo();
    }

    /**
     * Create an instance of {@link TransactionTaxList }
     * 
     */
    public TransactionTaxList createTransactionTaxList() {
        return new TransactionTaxList();
    }

    /**
     * Create an instance of {@link TransactionTaxInfo }
     * 
     */
    public TransactionTaxInfo createTransactionTaxInfo() {
        return new TransactionTaxInfo();
    }

    /**
     * Create an instance of {@link TransTenderList }
     * 
     */
    public TransTenderList createTransTenderList() {
        return new TransTenderList();
    }

    /**
     * Create an instance of {@link TransTenderInfo }
     * 
     */
    public TransTenderInfo createTransTenderInfo() {
        return new TransTenderInfo();
    }

    /**
     * Create an instance of {@link TransactionDiscountRetList }
     * 
     */
    public TransactionDiscountRetList createTransactionDiscountRetList() {
        return new TransactionDiscountRetList();
    }

    /**
     * Create an instance of {@link TransactionDiscountRetInfo }
     * 
     */
    public TransactionDiscountRetInfo createTransactionDiscountRetInfo() {
        return new TransactionDiscountRetInfo();
    }

    /**
     * Create an instance of {@link TransactionDetailList }
     * 
     */
    public TransactionDetailList createTransactionDetailList() {
        return new TransactionDetailList();
    }

    /**
     * Create an instance of {@link TransactionDetailInfo }
     * 
     */
    public TransactionDetailInfo createTransactionDetailInfo() {
        return new TransactionDetailInfo();
    }

    /**
     * Create an instance of {@link WebOrderDetailsInfoList }
     * 
     */
    public WebOrderDetailsInfoList createWebOrderDetailsInfoList() {
        return new WebOrderDetailsInfoList();
    }

    /**
     * Create an instance of {@link WebOrderDetailsInfo }
     * 
     */
    public WebOrderDetailsInfo createWebOrderDetailsInfo() {
        return new WebOrderDetailsInfo();
    }

    /**
     * Create an instance of {@link WebOrderInfo }
     * 
     */
    public WebOrderInfo createWebOrderInfo() {
        return new WebOrderInfo();
    }

    /**
     * Create an instance of {@link WebOrderItemsList }
     * 
     */
    public WebOrderItemsList createWebOrderItemsList() {
        return new WebOrderItemsList();
    }

    /**
     * Create an instance of {@link WebOrderItemsInfo }
     * 
     */
    public WebOrderItemsInfo createWebOrderItemsInfo() {
        return new WebOrderItemsInfo();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link TransactionList }
     * 
     */
    public TransactionList createTransactionList() {
        return new TransactionList();
    }

    /**
     * Create an instance of {@link TransactionInfo }
     * 
     */
    public TransactionInfo createTransactionInfo() {
        return new TransactionInfo();
    }

    /**
     * Create an instance of {@link TransactionHistoryItemsList }
     * 
     */
    public TransactionHistoryItemsList createTransactionHistoryItemsList() {
        return new TransactionHistoryItemsList();
    }

    /**
     * Create an instance of {@link TransactionHistoryItemInfo }
     * 
     */
    public TransactionHistoryItemInfo createTransactionHistoryItemInfo() {
        return new TransactionHistoryItemInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "authenticateInfoRequest")
    public JAXBElement<AuthenticateInfoRequest> createAuthenticateInfoRequest(AuthenticateInfoRequest value) {
        return new JAXBElement<AuthenticateInfoRequest>(_AuthenticateInfoRequest_QNAME, AuthenticateInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "authenticateInfoResponse")
    public JAXBElement<AuthenticateInfoResponse> createAuthenticateInfoResponse(AuthenticateInfoResponse value) {
        return new JAXBElement<AuthenticateInfoResponse>(_AuthenticateInfoResponse_QNAME, AuthenticateInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitPunchDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "commitPunchDataRequest")
    public JAXBElement<CommitPunchDataRequest> createCommitPunchDataRequest(CommitPunchDataRequest value) {
        return new JAXBElement<CommitPunchDataRequest>(_CommitPunchDataRequest_QNAME, CommitPunchDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitPunchDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "commitPunchDataResponse")
    public JAXBElement<CommitPunchDataResponse> createCommitPunchDataResponse(CommitPunchDataResponse value) {
        return new JAXBElement<CommitPunchDataResponse>(_CommitPunchDataResponse_QNAME, CommitPunchDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStoreOrderNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "createStoreOrderNotificationRequest")
    public JAXBElement<CreateStoreOrderNotificationRequest> createCreateStoreOrderNotificationRequest(CreateStoreOrderNotificationRequest value) {
        return new JAXBElement<CreateStoreOrderNotificationRequest>(_CreateStoreOrderNotificationRequest_QNAME, CreateStoreOrderNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptStringRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "encryptStringRequest")
    public JAXBElement<EncryptStringRequest> createEncryptStringRequest(EncryptStringRequest value) {
        return new JAXBElement<EncryptStringRequest>(_EncryptStringRequest_QNAME, EncryptStringRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "encryptStringResponse")
    public JAXBElement<EncryptStringResponse> createEncryptStringResponse(EncryptStringResponse value) {
        return new JAXBElement<EncryptStringResponse>(_EncryptStringResponse_QNAME, EncryptStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsDelUpdInventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "insDelUpdInventoryRequest")
    public JAXBElement<InsDelUpdInventoryRequest> createInsDelUpdInventoryRequest(InsDelUpdInventoryRequest value) {
        return new JAXBElement<InsDelUpdInventoryRequest>(_InsDelUpdInventoryRequest_QNAME, InsDelUpdInventoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsDelUpdInventoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "insDelUpdInventoryResponse")
    public JAXBElement<InsDelUpdInventoryResponse> createInsDelUpdInventoryResponse(InsDelUpdInventoryResponse value) {
        return new JAXBElement<InsDelUpdInventoryResponse>(_InsDelUpdInventoryResponse_QNAME, InsDelUpdInventoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KitComponentPricingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "kitComponentPricingRequest")
    public JAXBElement<KitComponentPricingRequest> createKitComponentPricingRequest(KitComponentPricingRequest value) {
        return new JAXBElement<KitComponentPricingRequest>(_KitComponentPricingRequest_QNAME, KitComponentPricingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KitComponentPricingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "kitComponentPricingResponse")
    public JAXBElement<KitComponentPricingResponse> createKitComponentPricingResponse(KitComponentPricingResponse value) {
        return new JAXBElement<KitComponentPricingResponse>(_KitComponentPricingResponse_QNAME, KitComponentPricingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KitDtlsforSKURequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "kitDtlsforSKURequest")
    public JAXBElement<KitDtlsforSKURequest> createKitDtlsforSKURequest(KitDtlsforSKURequest value) {
        return new JAXBElement<KitDtlsforSKURequest>(_KitDtlsforSKURequest_QNAME, KitDtlsforSKURequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KitDtlsforSKUResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "kitDtlsforSKUResponse")
    public JAXBElement<KitDtlsforSKUResponse> createKitDtlsforSKUResponse(KitDtlsforSKUResponse value) {
        return new JAXBElement<KitDtlsforSKUResponse>(_KitDtlsforSKUResponse_QNAME, KitDtlsforSKUResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDetailInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "productDetailInformationRequest")
    public JAXBElement<ProductDetailInformationRequest> createProductDetailInformationRequest(ProductDetailInformationRequest value) {
        return new JAXBElement<ProductDetailInformationRequest>(_ProductDetailInformationRequest_QNAME, ProductDetailInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDetailInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "productDetailInformationResponse")
    public JAXBElement<ProductDetailInformationResponse> createProductDetailInformationResponse(ProductDetailInformationResponse value) {
        return new JAXBElement<ProductDetailInformationResponse>(_ProductDetailInformationResponse_QNAME, ProductDetailInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductInvDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "productInvDetailsRequest")
    public JAXBElement<ProductInvDetailsRequest> createProductInvDetailsRequest(ProductInvDetailsRequest value) {
        return new JAXBElement<ProductInvDetailsRequest>(_ProductInvDetailsRequest_QNAME, ProductInvDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductInvDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "productInvDetailsResponse")
    public JAXBElement<ProductInvDetailsResponse> createProductInvDetailsResponse(ProductInvDetailsResponse value) {
        return new JAXBElement<ProductInvDetailsResponse>(_ProductInvDetailsResponse_QNAME, ProductInvDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductManufacturerValidationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "productManufacturerValidationRequest")
    public JAXBElement<ProductManufacturerValidationRequest> createProductManufacturerValidationRequest(ProductManufacturerValidationRequest value) {
        return new JAXBElement<ProductManufacturerValidationRequest>(_ProductManufacturerValidationRequest_QNAME, ProductManufacturerValidationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductManufacturerValidationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "productManufacturerValidationResponse")
    public JAXBElement<ProductManufacturerValidationResponse> createProductManufacturerValidationResponse(ProductManufacturerValidationResponse value) {
        return new JAXBElement<ProductManufacturerValidationResponse>(_ProductManufacturerValidationResponse_QNAME, ProductManufacturerValidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductStockedDirectFfWHRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "productStockedDirectFfWHRequest")
    public JAXBElement<ProductStockedDirectFfWHRequest> createProductStockedDirectFfWHRequest(ProductStockedDirectFfWHRequest value) {
        return new JAXBElement<ProductStockedDirectFfWHRequest>(_ProductStockedDirectFfWHRequest_QNAME, ProductStockedDirectFfWHRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductStockedDirectFfWHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "productStockedDirectFfWHResponse")
    public JAXBElement<ProductStockedDirectFfWHResponse> createProductStockedDirectFfWHResponse(ProductStockedDirectFfWHResponse value) {
        return new JAXBElement<ProductStockedDirectFfWHResponse>(_ProductStockedDirectFfWHResponse_QNAME, ProductStockedDirectFfWHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryConsignedEmployeeIdentityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryConsignedEmployeeIdentityRequest")
    public JAXBElement<QueryConsignedEmployeeIdentityRequest> createQueryConsignedEmployeeIdentityRequest(QueryConsignedEmployeeIdentityRequest value) {
        return new JAXBElement<QueryConsignedEmployeeIdentityRequest>(_QueryConsignedEmployeeIdentityRequest_QNAME, QueryConsignedEmployeeIdentityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryConsignedEmployeeIdentityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryConsignedEmployeeIdentityResponse")
    public JAXBElement<QueryConsignedEmployeeIdentityResponse> createQueryConsignedEmployeeIdentityResponse(QueryConsignedEmployeeIdentityResponse value) {
        return new JAXBElement<QueryConsignedEmployeeIdentityResponse>(_QueryConsignedEmployeeIdentityResponse_QNAME, QueryConsignedEmployeeIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryKitPriceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryKitPriceRequest")
    public JAXBElement<QueryKitPriceRequest> createQueryKitPriceRequest(QueryKitPriceRequest value) {
        return new JAXBElement<QueryKitPriceRequest>(_QueryKitPriceRequest_QNAME, QueryKitPriceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryKitPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryKitPriceResponse")
    public JAXBElement<QueryKitPriceResponse> createQueryKitPriceResponse(QueryKitPriceResponse value) {
        return new JAXBElement<QueryKitPriceResponse>(_QueryKitPriceResponse_QNAME, QueryKitPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLastPunchDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryLastPunchDetailsRequest")
    public JAXBElement<QueryLastPunchDetailsRequest> createQueryLastPunchDetailsRequest(QueryLastPunchDetailsRequest value) {
        return new JAXBElement<QueryLastPunchDetailsRequest>(_QueryLastPunchDetailsRequest_QNAME, QueryLastPunchDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLastPunchDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryLastPunchDetailsResponse")
    public JAXBElement<QueryLastPunchDetailsResponse> createQueryLastPunchDetailsResponse(QueryLastPunchDetailsResponse value) {
        return new JAXBElement<QueryLastPunchDetailsResponse>(_QueryLastPunchDetailsResponse_QNAME, QueryLastPunchDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNameByIdentifierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryNameByIdentifierRequest")
    public JAXBElement<QueryNameByIdentifierRequest> createQueryNameByIdentifierRequest(QueryNameByIdentifierRequest value) {
        return new JAXBElement<QueryNameByIdentifierRequest>(_QueryNameByIdentifierRequest_QNAME, QueryNameByIdentifierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNameByIdentifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryNameByIdentifierResponse")
    public JAXBElement<QueryNameByIdentifierResponse> createQueryNameByIdentifierResponse(QueryNameByIdentifierResponse value) {
        return new JAXBElement<QueryNameByIdentifierResponse>(_QueryNameByIdentifierResponse_QNAME, QueryNameByIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOnhandSaleableQuantityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryOnHandSaleableQuantityRequest")
    public JAXBElement<QueryOnhandSaleableQuantityRequest> createQueryOnHandSaleableQuantityRequest(QueryOnhandSaleableQuantityRequest value) {
        return new JAXBElement<QueryOnhandSaleableQuantityRequest>(_QueryOnHandSaleableQuantityRequest_QNAME, QueryOnhandSaleableQuantityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOnhandSaleableQuantityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryOnHandSaleableQuantityResponse")
    public JAXBElement<QueryOnhandSaleableQuantityResponse> createQueryOnHandSaleableQuantityResponse(QueryOnhandSaleableQuantityResponse value) {
        return new JAXBElement<QueryOnhandSaleableQuantityResponse>(_QueryOnHandSaleableQuantityResponse_QNAME, QueryOnhandSaleableQuantityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPendingWebOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryPendingWebOrdersRequest")
    public JAXBElement<QueryPendingWebOrdersRequest> createQueryPendingWebOrdersRequest(QueryPendingWebOrdersRequest value) {
        return new JAXBElement<QueryPendingWebOrdersRequest>(_QueryPendingWebOrdersRequest_QNAME, QueryPendingWebOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPendingWebOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryPendingWebOrdersResponse")
    public JAXBElement<QueryPendingWebOrdersResponse> createQueryPendingWebOrdersResponse(QueryPendingWebOrdersResponse value) {
        return new JAXBElement<QueryPendingWebOrdersResponse>(_QueryPendingWebOrdersResponse_QNAME, QueryPendingWebOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProductIdentifierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryProductIdentifierRequest")
    public JAXBElement<QueryProductIdentifierRequest> createQueryProductIdentifierRequest(QueryProductIdentifierRequest value) {
        return new JAXBElement<QueryProductIdentifierRequest>(_QueryProductIdentifierRequest_QNAME, QueryProductIdentifierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProductIdentifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryProductIdentifierResponse")
    public JAXBElement<QueryProductIdentifierResponse> createQueryProductIdentifierResponse(QueryProductIdentifierResponse value) {
        return new JAXBElement<QueryProductIdentifierResponse>(_QueryProductIdentifierResponse_QNAME, QueryProductIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProductPromotionDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryProductPromotionDetailsRequest")
    public JAXBElement<QueryProductPromotionDetailsRequest> createQueryProductPromotionDetailsRequest(QueryProductPromotionDetailsRequest value) {
        return new JAXBElement<QueryProductPromotionDetailsRequest>(_QueryProductPromotionDetailsRequest_QNAME, QueryProductPromotionDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProductPromotionDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryProductPromotionDetailsResponse")
    public JAXBElement<QueryProductPromotionDetailsResponse> createQueryProductPromotionDetailsResponse(QueryProductPromotionDetailsResponse value) {
        return new JAXBElement<QueryProductPromotionDetailsResponse>(_QueryProductPromotionDetailsResponse_QNAME, QueryProductPromotionDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryProductRequest")
    public JAXBElement<QueryProductRequest> createQueryProductRequest(QueryProductRequest value) {
        return new JAXBElement<QueryProductRequest>(_QueryProductRequest_QNAME, QueryProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryProductResponse")
    public JAXBElement<QueryProductResponse> createQueryProductResponse(QueryProductResponse value) {
        return new JAXBElement<QueryProductResponse>(_QueryProductResponse_QNAME, QueryProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStoreByClientNameRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryStoreByClientNameRequest")
    public JAXBElement<QueryStoreByClientNameRequest> createQueryStoreByClientNameRequest(QueryStoreByClientNameRequest value) {
        return new JAXBElement<QueryStoreByClientNameRequest>(_QueryStoreByClientNameRequest_QNAME, QueryStoreByClientNameRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStoreByClientNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryStoreByClientNameResponse")
    public JAXBElement<QueryStoreByClientNameResponse> createQueryStoreByClientNameResponse(QueryStoreByClientNameResponse value) {
        return new JAXBElement<QueryStoreByClientNameResponse>(_QueryStoreByClientNameResponse_QNAME, QueryStoreByClientNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTaxesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryTaxesRequest")
    public JAXBElement<QueryTaxesRequest> createQueryTaxesRequest(QueryTaxesRequest value) {
        return new JAXBElement<QueryTaxesRequest>(_QueryTaxesRequest_QNAME, QueryTaxesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTaxesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryTaxesResponse")
    public JAXBElement<QueryTaxesResponse> createQueryTaxesResponse(QueryTaxesResponse value) {
        return new JAXBElement<QueryTaxesResponse>(_QueryTaxesResponse_QNAME, QueryTaxesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialNumberProductValidationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "serialNumberProductValidationRequest")
    public JAXBElement<SerialNumberProductValidationRequest> createSerialNumberProductValidationRequest(SerialNumberProductValidationRequest value) {
        return new JAXBElement<SerialNumberProductValidationRequest>(_SerialNumberProductValidationRequest_QNAME, SerialNumberProductValidationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialNumberProductValidationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "serialNumberProductValidationResponse")
    public JAXBElement<SerialNumberProductValidationResponse> createSerialNumberProductValidationResponse(SerialNumberProductValidationResponse value) {
        return new JAXBElement<SerialNumberProductValidationResponse>(_SerialNumberProductValidationResponse_QNAME, SerialNumberProductValidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SKUQtyValidationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "skuQtyValidationRequest")
    public JAXBElement<SKUQtyValidationRequest> createSkuQtyValidationRequest(SKUQtyValidationRequest value) {
        return new JAXBElement<SKUQtyValidationRequest>(_SkuQtyValidationRequest_QNAME, SKUQtyValidationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SKUQtyValidationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "skuQtyValidationResponse")
    public JAXBElement<SKUQtyValidationResponse> createSkuQtyValidationResponse(SKUQtyValidationResponse value) {
        return new JAXBElement<SKUQtyValidationResponse>(_SkuQtyValidationResponse_QNAME, SKUQtyValidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDirectFulfillmentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateDirectFulfillmentRequest")
    public JAXBElement<ValidateDirectFulfillmentRequest> createValidateDirectFulfillmentRequest(ValidateDirectFulfillmentRequest value) {
        return new JAXBElement<ValidateDirectFulfillmentRequest>(_ValidateDirectFulfillmentRequest_QNAME, ValidateDirectFulfillmentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDirectFulfillmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateDirectFulfillmentResponse")
    public JAXBElement<ValidateDirectFulfillmentResponse> createValidateDirectFulfillmentResponse(ValidateDirectFulfillmentResponse value) {
        return new JAXBElement<ValidateDirectFulfillmentResponse>(_ValidateDirectFulfillmentResponse_QNAME, ValidateDirectFulfillmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateProductSerialInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateProductSerialInformationRequest")
    public JAXBElement<ValidateProductSerialInformationRequest> createValidateProductSerialInformationRequest(ValidateProductSerialInformationRequest value) {
        return new JAXBElement<ValidateProductSerialInformationRequest>(_ValidateProductSerialInformationRequest_QNAME, ValidateProductSerialInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateProductSerialInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateProductSerialInformationResponse")
    public JAXBElement<ValidateProductSerialInformationResponse> createValidateProductSerialInformationResponse(ValidateProductSerialInformationResponse value) {
        return new JAXBElement<ValidateProductSerialInformationResponse>(_ValidateProductSerialInformationResponse_QNAME, ValidateProductSerialInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSerialNumberMsnSimIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateSerialNumberMsnSimIdRequest")
    public JAXBElement<ValidateSerialNumberMsnSimIdRequest> createValidateSerialNumberMsnSimIdRequest(ValidateSerialNumberMsnSimIdRequest value) {
        return new JAXBElement<ValidateSerialNumberMsnSimIdRequest>(_ValidateSerialNumberMsnSimIdRequest_QNAME, ValidateSerialNumberMsnSimIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSerialNumberMsnSimIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateSerialNumberMsnSimIdResponse")
    public JAXBElement<ValidateSerialNumberMsnSimIdResponse> createValidateSerialNumberMsnSimIdResponse(ValidateSerialNumberMsnSimIdResponse value) {
        return new JAXBElement<ValidateSerialNumberMsnSimIdResponse>(_ValidateSerialNumberMsnSimIdResponse_QNAME, ValidateSerialNumberMsnSimIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSerialNumberRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateSerialNumberRequest")
    public JAXBElement<ValidateSerialNumberRequest> createValidateSerialNumberRequest(ValidateSerialNumberRequest value) {
        return new JAXBElement<ValidateSerialNumberRequest>(_ValidateSerialNumberRequest_QNAME, ValidateSerialNumberRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSerialNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateSerialNumberResponse")
    public JAXBElement<ValidateSerialNumberResponse> createValidateSerialNumberResponse(ValidateSerialNumberResponse value) {
        return new JAXBElement<ValidateSerialNumberResponse>(_ValidateSerialNumberResponse_QNAME, ValidateSerialNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUserRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateUserRequest")
    public JAXBElement<ValidateUserRequest> createValidateUserRequest(ValidateUserRequest value) {
        return new JAXBElement<ValidateUserRequest>(_ValidateUserRequest_QNAME, ValidateUserRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "validateUserResponse")
    public JAXBElement<ValidateUserResponse> createValidateUserResponse(ValidateUserResponse value) {
        return new JAXBElement<ValidateUserResponse>(_ValidateUserResponse_QNAME, ValidateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderInRmsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "createOrderInRmsRequest")
    public JAXBElement<CreateOrderInRmsRequest> createCreateOrderInRmsRequest(CreateOrderInRmsRequest value) {
        return new JAXBElement<CreateOrderInRmsRequest>(_CreateOrderInRmsRequest_QNAME, CreateOrderInRmsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOrderFromRmsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryOrderFromRmsRequest")
    public JAXBElement<QueryOrderFromRmsRequest> createQueryOrderFromRmsRequest(QueryOrderFromRmsRequest value) {
        return new JAXBElement<QueryOrderFromRmsRequest>(_QueryOrderFromRmsRequest_QNAME, QueryOrderFromRmsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryConsentListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryConsentListRequest")
    public JAXBElement<QueryConsentListRequest> createQueryConsentListRequest(QueryConsentListRequest value) {
        return new JAXBElement<QueryConsentListRequest>(_QueryConsentListRequest_QNAME, QueryConsentListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryConsentDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryConsentDetailsRequest")
    public JAXBElement<QueryConsentDetailsRequest> createQueryConsentDetailsRequest(QueryConsentDetailsRequest value) {
        return new JAXBElement<QueryConsentDetailsRequest>(_QueryConsentDetailsRequest_QNAME, QueryConsentDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageUserProfileAccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageUserProfileAccessResponse")
    public JAXBElement<ManageUserProfileAccessResponse> createManageUserProfileAccessResponse(ManageUserProfileAccessResponse value) {
        return new JAXBElement<ManageUserProfileAccessResponse>(_ManageUserProfileAccessResponse_QNAME, ManageUserProfileAccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageUserProfileAccessRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageUserProfileAccessRequest")
    public JAXBElement<ManageUserProfileAccessRequest> createManageUserProfileAccessRequest(ManageUserProfileAccessRequest value) {
        return new JAXBElement<ManageUserProfileAccessRequest>(_ManageUserProfileAccessRequest_QNAME, ManageUserProfileAccessRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserProfileAccessInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "getUserProfileAccessInfoRequest")
    public JAXBElement<GetUserProfileAccessInfoRequest> createGetUserProfileAccessInfoRequest(GetUserProfileAccessInfoRequest value) {
        return new JAXBElement<GetUserProfileAccessInfoRequest>(_GetUserProfileAccessInfoRequest_QNAME, GetUserProfileAccessInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserProfileAccessInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "getUserProfileAccessInfoResponse")
    public JAXBElement<GetUserProfileAccessInfoResponse> createGetUserProfileAccessInfoResponse(GetUserProfileAccessInfoResponse value) {
        return new JAXBElement<GetUserProfileAccessInfoResponse>(_GetUserProfileAccessInfoResponse_QNAME, GetUserProfileAccessInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignRegisterAndFloatRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "assignRegisterAndFloatRequest")
    public JAXBElement<AssignRegisterAndFloatRequest> createAssignRegisterAndFloatRequest(AssignRegisterAndFloatRequest value) {
        return new JAXBElement<AssignRegisterAndFloatRequest>(_AssignRegisterAndFloatRequest_QNAME, AssignRegisterAndFloatRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRMSStoreDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "getRMSStoreDetailsRequest")
    public JAXBElement<GetRMSStoreDetailsRequest> createGetRMSStoreDetailsRequest(GetRMSStoreDetailsRequest value) {
        return new JAXBElement<GetRMSStoreDetailsRequest>(_GetRMSStoreDetailsRequest_QNAME, GetRMSStoreDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRMSStoreDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "getRMSStoreDetailsResponse")
    public JAXBElement<GetRMSStoreDetailsResponse> createGetRMSStoreDetailsResponse(GetRMSStoreDetailsResponse value) {
        return new JAXBElement<GetRMSStoreDetailsResponse>(_GetRMSStoreDetailsResponse_QNAME, GetRMSStoreDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRMSDiscountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "getRMSDiscountsRequest")
    public JAXBElement<GetRMSDiscountsRequest> createGetRMSDiscountsRequest(GetRMSDiscountsRequest value) {
        return new JAXBElement<GetRMSDiscountsRequest>(_GetRMSDiscountsRequest_QNAME, GetRMSDiscountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRMSDiscountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "getRMSDiscountsResponse")
    public JAXBElement<GetRMSDiscountsResponse> createGetRMSDiscountsResponse(GetRMSDiscountsResponse value) {
        return new JAXBElement<GetRMSDiscountsResponse>(_GetRMSDiscountsResponse_QNAME, GetRMSDiscountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryConsentVerbiageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryConsentVerbiageRequest")
    public JAXBElement<QueryConsentVerbiageRequest> createQueryConsentVerbiageRequest(QueryConsentVerbiageRequest value) {
        return new JAXBElement<QueryConsentVerbiageRequest>(_QueryConsentVerbiageRequest_QNAME, QueryConsentVerbiageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryConsentVerbiageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryConsentVerbiageResponse")
    public JAXBElement<QueryConsentVerbiageResponse> createQueryConsentVerbiageResponse(QueryConsentVerbiageResponse value) {
        return new JAXBElement<QueryConsentVerbiageResponse>(_QueryConsentVerbiageResponse_QNAME, QueryConsentVerbiageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveBravoConsentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "saveBravoConsentRequest")
    public JAXBElement<SaveBravoConsentRequest> createSaveBravoConsentRequest(SaveBravoConsentRequest value) {
        return new JAXBElement<SaveBravoConsentRequest>(_SaveBravoConsentRequest_QNAME, SaveBravoConsentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveBravoConsentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "saveBravoConsentResponse")
    public JAXBElement<SaveBravoConsentResponse> createSaveBravoConsentResponse(SaveBravoConsentResponse value) {
        return new JAXBElement<SaveBravoConsentResponse>(_SaveBravoConsentResponse_QNAME, SaveBravoConsentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTenderConfigurationValuesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryTenderConfigurationValuesRequest")
    public JAXBElement<QueryTenderConfigurationValuesRequest> createQueryTenderConfigurationValuesRequest(QueryTenderConfigurationValuesRequest value) {
        return new JAXBElement<QueryTenderConfigurationValuesRequest>(_QueryTenderConfigurationValuesRequest_QNAME, QueryTenderConfigurationValuesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTenderConfigurationValuesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryTenderConfigurationValuesResponse")
    public JAXBElement<QueryTenderConfigurationValuesResponse> createQueryTenderConfigurationValuesResponse(QueryTenderConfigurationValuesResponse value) {
        return new JAXBElement<QueryTenderConfigurationValuesResponse>(_QueryTenderConfigurationValuesResponse_QNAME, QueryTenderConfigurationValuesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePOSTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "createPOSTransactionRequest")
    public JAXBElement<CreatePOSTransactionRequest> createCreatePOSTransactionRequest(CreatePOSTransactionRequest value) {
        return new JAXBElement<CreatePOSTransactionRequest>(_CreatePOSTransactionRequest_QNAME, CreatePOSTransactionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransactionDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "updateTransactionDataResponse")
    public JAXBElement<UpdateTransactionDataResponse> createUpdateTransactionDataResponse(UpdateTransactionDataResponse value) {
        return new JAXBElement<UpdateTransactionDataResponse>(_UpdateTransactionDataResponse_QNAME, UpdateTransactionDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransactionDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "updateTransactionDataRequest")
    public JAXBElement<UpdateTransactionDataRequest> createUpdateTransactionDataRequest(UpdateTransactionDataRequest value) {
        return new JAXBElement<UpdateTransactionDataRequest>(_UpdateTransactionDataRequest_QNAME, UpdateTransactionDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePOSTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "createPOSTransactionResponse")
    public JAXBElement<CreatePOSTransactionResponse> createCreatePOSTransactionResponse(CreatePOSTransactionResponse value) {
        return new JAXBElement<CreatePOSTransactionResponse>(_CreatePOSTransactionResponse_QNAME, CreatePOSTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePOSTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "updatePOSTransactionRequest")
    public JAXBElement<UpdatePOSTransactionRequest> createUpdatePOSTransactionRequest(UpdatePOSTransactionRequest value) {
        return new JAXBElement<UpdatePOSTransactionRequest>(_UpdatePOSTransactionRequest_QNAME, UpdatePOSTransactionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePOSTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "updatePOSTransactionResponse")
    public JAXBElement<UpdatePOSTransactionResponse> createUpdatePOSTransactionResponse(UpdatePOSTransactionResponse value) {
        return new JAXBElement<UpdatePOSTransactionResponse>(_UpdatePOSTransactionResponse_QNAME, UpdatePOSTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientPropertiesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "clientPropertiesRequest")
    public JAXBElement<ClientPropertiesRequest> createClientPropertiesRequest(ClientPropertiesRequest value) {
        return new JAXBElement<ClientPropertiesRequest>(_ClientPropertiesRequest_QNAME, ClientPropertiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "clientPropertiesResponse")
    public JAXBElement<ClientPropertiesResponse> createClientPropertiesResponse(ClientPropertiesResponse value) {
        return new JAXBElement<ClientPropertiesResponse>(_ClientPropertiesResponse_QNAME, ClientPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetPasswordRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "resetPasswordRequest")
    public JAXBElement<ResetPasswordRequest> createResetPasswordRequest(ResetPasswordRequest value) {
        return new JAXBElement<ResetPasswordRequest>(_ResetPasswordRequest_QNAME, ResetPasswordRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageInstallmentConsentDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageInstallmentConsentDetailsRequest")
    public JAXBElement<ManageInstallmentConsentDetailsRequest> createManageInstallmentConsentDetailsRequest(ManageInstallmentConsentDetailsRequest value) {
        return new JAXBElement<ManageInstallmentConsentDetailsRequest>(_ManageInstallmentConsentDetailsRequest_QNAME, ManageInstallmentConsentDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryInstallmentConsentDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryInstallmentConsentDetailsRequest")
    public JAXBElement<QueryInstallmentConsentDetailsRequest> createQueryInstallmentConsentDetailsRequest(QueryInstallmentConsentDetailsRequest value) {
        return new JAXBElement<QueryInstallmentConsentDetailsRequest>(_QueryInstallmentConsentDetailsRequest_QNAME, QueryInstallmentConsentDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPreferredOrderInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryPreferredOrderInfoRequest")
    public JAXBElement<QueryPreferredOrderInfoRequest> createQueryPreferredOrderInfoRequest(QueryPreferredOrderInfoRequest value) {
        return new JAXBElement<QueryPreferredOrderInfoRequest>(_QueryPreferredOrderInfoRequest_QNAME, QueryPreferredOrderInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPreferredOrderInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryPreferredOrderInfoResponse")
    public JAXBElement<QueryPreferredOrderInfoResponse> createQueryPreferredOrderInfoResponse(QueryPreferredOrderInfoResponse value) {
        return new JAXBElement<QueryPreferredOrderInfoResponse>(_QueryPreferredOrderInfoResponse_QNAME, QueryPreferredOrderInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageConsentDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageConsentDetailsRequest")
    public JAXBElement<ManageConsentDetailsRequest> createManageConsentDetailsRequest(ManageConsentDetailsRequest value) {
        return new JAXBElement<ManageConsentDetailsRequest>(_ManageConsentDetailsRequest_QNAME, ManageConsentDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPendingPaymentListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryPendingPaymentListRequest")
    public JAXBElement<QueryPendingPaymentListRequest> createQueryPendingPaymentListRequest(QueryPendingPaymentListRequest value) {
        return new JAXBElement<QueryPendingPaymentListRequest>(_QueryPendingPaymentListRequest_QNAME, QueryPendingPaymentListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPendingPaymentListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryPendingPaymentListResponse")
    public JAXBElement<QueryPendingPaymentListResponse> createQueryPendingPaymentListResponse(QueryPendingPaymentListResponse value) {
        return new JAXBElement<QueryPendingPaymentListResponse>(_QueryPendingPaymentListResponse_QNAME, QueryPendingPaymentListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePendingPaymentDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "managePendingPaymentDetailsRequest")
    public JAXBElement<ManagePendingPaymentDetailsRequest> createManagePendingPaymentDetailsRequest(ManagePendingPaymentDetailsRequest value) {
        return new JAXBElement<ManagePendingPaymentDetailsRequest>(_ManagePendingPaymentDetailsRequest_QNAME, ManagePendingPaymentDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePendingPaymentDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "managePendingPaymentDetailsResponse")
    public JAXBElement<ManagePendingPaymentDetailsResponse> createManagePendingPaymentDetailsResponse(ManagePendingPaymentDetailsResponse value) {
        return new JAXBElement<ManagePendingPaymentDetailsResponse>(_ManagePendingPaymentDetailsResponse_QNAME, ManagePendingPaymentDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageSCDInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageSCDInfoRequest")
    public JAXBElement<ManageSCDInfoRequest> createManageSCDInfoRequest(ManageSCDInfoRequest value) {
        return new JAXBElement<ManageSCDInfoRequest>(_ManageSCDInfoRequest_QNAME, ManageSCDInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageSCDInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageSCDInfoResponse")
    public JAXBElement<ManageSCDInfoResponse> createManageSCDInfoResponse(ManageSCDInfoResponse value) {
        return new JAXBElement<ManageSCDInfoResponse>(_ManageSCDInfoResponse_QNAME, ManageSCDInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAccountFunctionalityMatrixRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryAccountFunctionalityMatrixRequest")
    public JAXBElement<QueryAccountFunctionalityMatrixRequest> createQueryAccountFunctionalityMatrixRequest(QueryAccountFunctionalityMatrixRequest value) {
        return new JAXBElement<QueryAccountFunctionalityMatrixRequest>(_QueryAccountFunctionalityMatrixRequest_QNAME, QueryAccountFunctionalityMatrixRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAccountFunctionalityMatrixResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryAccountFunctionalityMatrixResponse")
    public JAXBElement<QueryAccountFunctionalityMatrixResponse> createQueryAccountFunctionalityMatrixResponse(QueryAccountFunctionalityMatrixResponse value) {
        return new JAXBElement<QueryAccountFunctionalityMatrixResponse>(_QueryAccountFunctionalityMatrixResponse_QNAME, QueryAccountFunctionalityMatrixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRetrieveCustomerIdentifierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "createRetrieveCustomerIdentifierRequest")
    public JAXBElement<CreateRetrieveCustomerIdentifierRequest> createCreateRetrieveCustomerIdentifierRequest(CreateRetrieveCustomerIdentifierRequest value) {
        return new JAXBElement<CreateRetrieveCustomerIdentifierRequest>(_CreateRetrieveCustomerIdentifierRequest_QNAME, CreateRetrieveCustomerIdentifierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRetrieveCustomerIdentifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "createRetrieveCustomerIdentifierResponse")
    public JAXBElement<CreateRetrieveCustomerIdentifierResponse> createCreateRetrieveCustomerIdentifierResponse(CreateRetrieveCustomerIdentifierResponse value) {
        return new JAXBElement<CreateRetrieveCustomerIdentifierResponse>(_CreateRetrieveCustomerIdentifierResponse_QNAME, CreateRetrieveCustomerIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStoreChannelRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryStoreChannelRequest")
    public JAXBElement<QueryStoreChannelRequest> createQueryStoreChannelRequest(QueryStoreChannelRequest value) {
        return new JAXBElement<QueryStoreChannelRequest>(_QueryStoreChannelRequest_QNAME, QueryStoreChannelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStoreChannelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryStoreChannelResponse")
    public JAXBElement<QueryStoreChannelResponse> createQueryStoreChannelResponse(QueryStoreChannelResponse value) {
        return new JAXBElement<QueryStoreChannelResponse>(_QueryStoreChannelResponse_QNAME, QueryStoreChannelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageTransactionSummaryDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageTransactionSummaryDetailsRequest")
    public JAXBElement<ManageTransactionSummaryDetailsRequest> createManageTransactionSummaryDetailsRequest(ManageTransactionSummaryDetailsRequest value) {
        return new JAXBElement<ManageTransactionSummaryDetailsRequest>(_ManageTransactionSummaryDetailsRequest_QNAME, ManageTransactionSummaryDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageTransactionSummaryDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageTransactionSummaryDetailsResponse")
    public JAXBElement<ManageTransactionSummaryDetailsResponse> createManageTransactionSummaryDetailsResponse(ManageTransactionSummaryDetailsResponse value) {
        return new JAXBElement<ManageTransactionSummaryDetailsResponse>(_ManageTransactionSummaryDetailsResponse_QNAME, ManageTransactionSummaryDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTransactionSummaryDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryTransactionSummaryDetailsRequest")
    public JAXBElement<QueryTransactionSummaryDetailsRequest> createQueryTransactionSummaryDetailsRequest(QueryTransactionSummaryDetailsRequest value) {
        return new JAXBElement<QueryTransactionSummaryDetailsRequest>(_QueryTransactionSummaryDetailsRequest_QNAME, QueryTransactionSummaryDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTransactionSummaryDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryTransactionSummaryDetailsResponse")
    public JAXBElement<QueryTransactionSummaryDetailsResponse> createQueryTransactionSummaryDetailsResponse(QueryTransactionSummaryDetailsResponse value) {
        return new JAXBElement<QueryTransactionSummaryDetailsResponse>(_QueryTransactionSummaryDetailsResponse_QNAME, QueryTransactionSummaryDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProfileAuthorizationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryProfileAuthorizationRequest")
    public JAXBElement<QueryProfileAuthorizationRequest> createQueryProfileAuthorizationRequest(QueryProfileAuthorizationRequest value) {
        return new JAXBElement<QueryProfileAuthorizationRequest>(_QueryProfileAuthorizationRequest_QNAME, QueryProfileAuthorizationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProfileAuthorizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryProfileAuthorizationResponse")
    public JAXBElement<QueryProfileAuthorizationResponse> createQueryProfileAuthorizationResponse(QueryProfileAuthorizationResponse value) {
        return new JAXBElement<QueryProfileAuthorizationResponse>(_QueryProfileAuthorizationResponse_QNAME, QueryProfileAuthorizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendIdVerificationDataToRmsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "sendIdVerificationDataToRmsRequest")
    public JAXBElement<SendIdVerificationDataToRmsRequest> createSendIdVerificationDataToRmsRequest(SendIdVerificationDataToRmsRequest value) {
        return new JAXBElement<SendIdVerificationDataToRmsRequest>(_SendIdVerificationDataToRmsRequest_QNAME, SendIdVerificationDataToRmsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendIdVerificationDataToRmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "sendIdVerificationDataToRmsResponse")
    public JAXBElement<SendIdVerificationDataToRmsResponse> createSendIdVerificationDataToRmsResponse(SendIdVerificationDataToRmsResponse value) {
        return new JAXBElement<SendIdVerificationDataToRmsResponse>(_SendIdVerificationDataToRmsResponse_QNAME, SendIdVerificationDataToRmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendApiXmlToRmsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "sendApiXmlToRmsRequest")
    public JAXBElement<SendApiXmlToRmsRequest> createSendApiXmlToRmsRequest(SendApiXmlToRmsRequest value) {
        return new JAXBElement<SendApiXmlToRmsRequest>(_SendApiXmlToRmsRequest_QNAME, SendApiXmlToRmsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendApiXmlToRmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "sendApiXmlToRmsResponse")
    public JAXBElement<SendApiXmlToRmsResponse> createSendApiXmlToRmsResponse(SendApiXmlToRmsResponse value) {
        return new JAXBElement<SendApiXmlToRmsResponse>(_SendApiXmlToRmsResponse_QNAME, SendApiXmlToRmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIDCaptureLogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "createIDCaptureLogRequest")
    public JAXBElement<CreateIDCaptureLogRequest> createCreateIDCaptureLogRequest(CreateIDCaptureLogRequest value) {
        return new JAXBElement<CreateIDCaptureLogRequest>(_CreateIDCaptureLogRequest_QNAME, CreateIDCaptureLogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIDCaptureLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "createIDCaptureLogResponse")
    public JAXBElement<CreateIDCaptureLogResponse> createCreateIDCaptureLogResponse(CreateIDCaptureLogResponse value) {
        return new JAXBElement<CreateIDCaptureLogResponse>(_CreateIDCaptureLogResponse_QNAME, CreateIDCaptureLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryIDCaptureLogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryIDCaptureLogRequest")
    public JAXBElement<QueryIDCaptureLogRequest> createQueryIDCaptureLogRequest(QueryIDCaptureLogRequest value) {
        return new JAXBElement<QueryIDCaptureLogRequest>(_QueryIDCaptureLogRequest_QNAME, QueryIDCaptureLogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryIDCaptureLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryIDCaptureLogResponse")
    public JAXBElement<QueryIDCaptureLogResponse> createQueryIDCaptureLogResponse(QueryIDCaptureLogResponse value) {
        return new JAXBElement<QueryIDCaptureLogResponse>(_QueryIDCaptureLogResponse_QNAME, QueryIDCaptureLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageDeviceRebrandingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageDeviceRebrandingRequest")
    public JAXBElement<ManageDeviceRebrandingRequest> createManageDeviceRebrandingRequest(ManageDeviceRebrandingRequest value) {
        return new JAXBElement<ManageDeviceRebrandingRequest>(_ManageDeviceRebrandingRequest_QNAME, ManageDeviceRebrandingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageDeviceRebrandingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "manageDeviceRebrandingResponse")
    public JAXBElement<ManageDeviceRebrandingResponse> createManageDeviceRebrandingResponse(ManageDeviceRebrandingResponse value) {
        return new JAXBElement<ManageDeviceRebrandingResponse>(_ManageDeviceRebrandingResponse_QNAME, ManageDeviceRebrandingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserListForStoresRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryUserListForStoresRequest")
    public JAXBElement<QueryUserListForStoresRequest> createQueryUserListForStoresRequest(QueryUserListForStoresRequest value) {
        return new JAXBElement<QueryUserListForStoresRequest>(_QueryUserListForStoresRequest_QNAME, QueryUserListForStoresRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserListForStoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryUserListForStoresResponse")
    public JAXBElement<QueryUserListForStoresResponse> createQueryUserListForStoresResponse(QueryUserListForStoresResponse value) {
        return new JAXBElement<QueryUserListForStoresResponse>(_QueryUserListForStoresResponse_QNAME, QueryUserListForStoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOriginalSaleTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryOriginalSaleTransactionRequest")
    public JAXBElement<QueryOriginalSaleTransactionRequest> createQueryOriginalSaleTransactionRequest(QueryOriginalSaleTransactionRequest value) {
        return new JAXBElement<QueryOriginalSaleTransactionRequest>(_QueryOriginalSaleTransactionRequest_QNAME, QueryOriginalSaleTransactionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOriginalSaleTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryOriginalSaleTransactionResponse")
    public JAXBElement<QueryOriginalSaleTransactionResponse> createQueryOriginalSaleTransactionResponse(QueryOriginalSaleTransactionResponse value) {
        return new JAXBElement<QueryOriginalSaleTransactionResponse>(_QueryOriginalSaleTransactionResponse_QNAME, QueryOriginalSaleTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryWebOrderListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryWebOrderListRequest")
    public JAXBElement<QueryWebOrderListRequest> createQueryWebOrderListRequest(QueryWebOrderListRequest value) {
        return new JAXBElement<QueryWebOrderListRequest>(_QueryWebOrderListRequest_QNAME, QueryWebOrderListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryWebOrderListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryWebOrderListResponse")
    public JAXBElement<QueryWebOrderListResponse> createQueryWebOrderListResponse(QueryWebOrderListResponse value) {
        return new JAXBElement<QueryWebOrderListResponse>(_QueryWebOrderListResponse_QNAME, QueryWebOrderListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTransactionHistoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryTransactionHistoryRequest")
    public JAXBElement<QueryTransactionHistoryRequest> createQueryTransactionHistoryRequest(QueryTransactionHistoryRequest value) {
        return new JAXBElement<QueryTransactionHistoryRequest>(_QueryTransactionHistoryRequest_QNAME, QueryTransactionHistoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTransactionHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryTransactionHistoryResponse")
    public JAXBElement<QueryTransactionHistoryResponse> createQueryTransactionHistoryResponse(QueryTransactionHistoryResponse value) {
        return new JAXBElement<QueryTransactionHistoryResponse>(_QueryTransactionHistoryResponse_QNAME, QueryTransactionHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceSaleableStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryDeviceSaleableStatusRequest")
    public JAXBElement<QueryDeviceSaleableStatusRequest> createQueryDeviceSaleableStatusRequest(QueryDeviceSaleableStatusRequest value) {
        return new JAXBElement<QueryDeviceSaleableStatusRequest>(_QueryDeviceSaleableStatusRequest_QNAME, QueryDeviceSaleableStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceSaleableStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "queryDeviceSaleableStatusResponse")
    public JAXBElement<QueryDeviceSaleableStatusResponse> createQueryDeviceSaleableStatusResponse(QueryDeviceSaleableStatusResponse value) {
        return new JAXBElement<QueryDeviceSaleableStatusResponse>(_QueryDeviceSaleableStatusResponse_QNAME, QueryDeviceSaleableStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ErrorInfo", scope = QueryInstallmentConsentDetailsResponse.class)
    public JAXBElement<ErrorInfo> createQueryInstallmentConsentDetailsResponseErrorInfo(ErrorInfo value) {
        return new JAXBElement<ErrorInfo>(_QueryInstallmentConsentDetailsResponseErrorInfo_QNAME, ErrorInfo.class, QueryInstallmentConsentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "StoreErrorInfo", scope = QueryInstallmentConsentDetailsResponse.class)
    public JAXBElement<StoreErrorInfo> createQueryInstallmentConsentDetailsResponseStoreErrorInfo(StoreErrorInfo value) {
        return new JAXBElement<StoreErrorInfo>(_QueryInstallmentConsentDetailsResponseStoreErrorInfo_QNAME, StoreErrorInfo.class, QueryInstallmentConsentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsentInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ConsentInfoList", scope = QueryInstallmentConsentDetailsResponse.class)
    public JAXBElement<ConsentInfoList> createQueryInstallmentConsentDetailsResponseConsentInfoList(ConsentInfoList value) {
        return new JAXBElement<ConsentInfoList>(_QueryInstallmentConsentDetailsResponseConsentInfoList_QNAME, ConsentInfoList.class, QueryInstallmentConsentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ErrorCode", scope = ResetPasswordResponse.class)
    public JAXBElement<Integer> createResetPasswordResponseErrorCode(Integer value) {
        return new JAXBElement<Integer>(_ResetPasswordResponseErrorCode_QNAME, Integer.class, ResetPasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ErrorDesc", scope = ResetPasswordResponse.class)
    public JAXBElement<String> createResetPasswordResponseErrorDesc(String value) {
        return new JAXBElement<String>(_ResetPasswordResponseErrorDesc_QNAME, String.class, ResetPasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuybackFundsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "BuybackFundsList", scope = QueryOrderFromRmsResponse.class)
    public JAXBElement<BuybackFundsList> createQueryOrderFromRmsResponseBuybackFundsList(BuybackFundsList value) {
        return new JAXBElement<BuybackFundsList>(_QueryOrderFromRmsResponseBuybackFundsList_QNAME, BuybackFundsList.class, QueryOrderFromRmsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ErrorInfo", scope = ManageInstallmentConsentDetailsResponse.class)
    public JAXBElement<ErrorInfo> createManageInstallmentConsentDetailsResponseErrorInfo(ErrorInfo value) {
        return new JAXBElement<ErrorInfo>(_QueryInstallmentConsentDetailsResponseErrorInfo_QNAME, ErrorInfo.class, ManageInstallmentConsentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "StoreErrorInfo", scope = QueryConsentListResponse.class)
    public JAXBElement<StoreErrorInfo> createQueryConsentListResponseStoreErrorInfo(StoreErrorInfo value) {
        return new JAXBElement<StoreErrorInfo>(_QueryInstallmentConsentDetailsResponseStoreErrorInfo_QNAME, StoreErrorInfo.class, QueryConsentListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ConsentList", scope = QueryConsentListResponse.class)
    public JAXBElement<ConsentList> createQueryConsentListResponseConsentList(ConsentList value) {
        return new JAXBElement<ConsentList>(_QueryConsentListResponseConsentList_QNAME, ConsentList.class, QueryConsentListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "UserErrorInfo", scope = CreateOrderInRmsResponse.class)
    public JAXBElement<UserErrorInfo> createCreateOrderInRmsResponseUserErrorInfo(UserErrorInfo value) {
        return new JAXBElement<UserErrorInfo>(_CreateOrderInRmsResponseUserErrorInfo_QNAME, UserErrorInfo.class, CreateOrderInRmsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartStoreErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ShoppingCartStoreErrorInfo", scope = CreateOrderInRmsResponse.class)
    public JAXBElement<ShoppingCartStoreErrorInfo> createCreateOrderInRmsResponseShoppingCartStoreErrorInfo(ShoppingCartStoreErrorInfo value) {
        return new JAXBElement<ShoppingCartStoreErrorInfo>(_CreateOrderInRmsResponseShoppingCartStoreErrorInfo_QNAME, ShoppingCartStoreErrorInfo.class, CreateOrderInRmsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartSkuErrorInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ShoppingCartSkuErrorInfoList", scope = CreateOrderInRmsResponse.class)
    public JAXBElement<ShoppingCartSkuErrorInfoList> createCreateOrderInRmsResponseShoppingCartSkuErrorInfoList(ShoppingCartSkuErrorInfoList value) {
        return new JAXBElement<ShoppingCartSkuErrorInfoList>(_CreateOrderInRmsResponseShoppingCartSkuErrorInfoList_QNAME, ShoppingCartSkuErrorInfoList.class, CreateOrderInRmsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ErrorInfo", scope = CreateOrderInRmsResponse.class)
    public JAXBElement<ErrorInfo> createCreateOrderInRmsResponseErrorInfo(ErrorInfo value) {
        return new JAXBElement<ErrorInfo>(_QueryInstallmentConsentDetailsResponseErrorInfo_QNAME, ErrorInfo.class, CreateOrderInRmsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "UpgradeNowFeeTax", scope = TaxInformation.class)
    public JAXBElement<Double> createTaxInformationUpgradeNowFeeTax(Double value) {
        return new JAXBElement<Double>(_TaxInformationUpgradeNowFeeTax_QNAME, Double.class, TaxInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "TaxInfoList", scope = QueryCalculateTaxesResponse.class)
    public JAXBElement<TaxInfoList> createQueryCalculateTaxesResponseTaxInfoList(TaxInfoList value) {
        return new JAXBElement<TaxInfoList>(_QueryCalculateTaxesResponseTaxInfoList_QNAME, TaxInfoList.class, QueryCalculateTaxesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SkuErrorInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "SkuErrorInfoList", scope = QueryCalculateTaxesResponse.class)
    public JAXBElement<SkuErrorInfoList> createQueryCalculateTaxesResponseSkuErrorInfoList(SkuErrorInfoList value) {
        return new JAXBElement<SkuErrorInfoList>(_QueryCalculateTaxesResponseSkuErrorInfoList_QNAME, SkuErrorInfoList.class, QueryCalculateTaxesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "StoreInfo", scope = QueryCalculateTaxesResponse.class)
    public JAXBElement<StoreInfo> createQueryCalculateTaxesResponseStoreInfo(StoreInfo value) {
        return new JAXBElement<StoreInfo>(_QueryCalculateTaxesResponseStoreInfo_QNAME, StoreInfo.class, QueryCalculateTaxesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "UpgradeNowFeeAmount", scope = CalcTaxSkuInfo.class, defaultValue = "0.0")
    public JAXBElement<Double> createCalcTaxSkuInfoUpgradeNowFeeAmount(Double value) {
        return new JAXBElement<Double>(_CalcTaxSkuInfoUpgradeNowFeeAmount_QNAME, Double.class, CalcTaxSkuInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "LineActivity", scope = OrderLinesInfo.class)
    public JAXBElement<String> createOrderLinesInfoLineActivity(String value) {
        return new JAXBElement<String>(_OrderLinesInfoLineActivity_QNAME, String.class, OrderLinesInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "WebOrderPTN", scope = OrderLinesInfo.class)
    public JAXBElement<String> createOrderLinesInfoWebOrderPTN(String value) {
        return new JAXBElement<String>(_OrderLinesInfoWebOrderPTN_QNAME, String.class, OrderLinesInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ApptConfirmationNumber", scope = AppointmentInfo.class)
    public JAXBElement<String> createAppointmentInfoApptConfirmationNumber(String value) {
        return new JAXBElement<String>(_AppointmentInfoApptConfirmationNumber_QNAME, String.class, AppointmentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "AppointmentStartDateTime", scope = AppointmentInfo.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentInfoAppointmentStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AppointmentInfoAppointmentStartDateTime_QNAME, XMLGregorianCalendar.class, AppointmentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "StoreTimezone", scope = AppointmentInfo.class)
    public JAXBElement<String> createAppointmentInfoStoreTimezone(String value) {
        return new JAXBElement<String>(_AppointmentInfoStoreTimezone_QNAME, String.class, AppointmentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "Ban", scope = OrderInfo.class)
    public JAXBElement<Integer> createOrderInfoBan(Integer value) {
        return new JAXBElement<Integer>(_OrderInfoBan_QNAME, Integer.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "CardTrack1", scope = CreditCardDetailsInfo.class)
    public JAXBElement<String> createCreditCardDetailsInfoCardTrack1(String value) {
        return new JAXBElement<String>(_CreditCardDetailsInfoCardTrack1_QNAME, String.class, CreditCardDetailsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "CardTrack2", scope = CreditCardDetailsInfo.class)
    public JAXBElement<String> createCreditCardDetailsInfoCardTrack2(String value) {
        return new JAXBElement<String>(_CreditCardDetailsInfoCardTrack2_QNAME, String.class, CreditCardDetailsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "CardTrack3", scope = CreditCardDetailsInfo.class)
    public JAXBElement<String> createCreditCardDetailsInfoCardTrack3(String value) {
        return new JAXBElement<String>(_CreditCardDetailsInfoCardTrack3_QNAME, String.class, CreditCardDetailsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "Payload", scope = CreditCardDetailsInfo.class)
    public JAXBElement<String> createCreditCardDetailsInfoPayload(String value) {
        return new JAXBElement<String>(_CreditCardDetailsInfoPayload_QNAME, String.class, CreditCardDetailsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "Base64Signature", scope = CreditCardDetailsInfo.class)
    public JAXBElement<String> createCreditCardDetailsInfoBase64Signature(String value) {
        return new JAXBElement<String>(_CreditCardDetailsInfoBase64Signature_QNAME, String.class, CreditCardDetailsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardDetailsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "CreditCardDetailsList", scope = ManagePendingPaymentInfo.class)
    public JAXBElement<CreditCardDetailsList> createManagePendingPaymentInfoCreditCardDetailsList(CreditCardDetailsList value) {
        return new JAXBElement<CreditCardDetailsList>(_ManagePendingPaymentInfoCreditCardDetailsList_QNAME, CreditCardDetailsList.class, ManagePendingPaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardDetailsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "GiftCardDetailsList", scope = ManagePendingPaymentInfo.class)
    public JAXBElement<GiftCardDetailsList> createManagePendingPaymentInfoGiftCardDetailsList(GiftCardDetailsList value) {
        return new JAXBElement<GiftCardDetailsList>(_ManagePendingPaymentInfoGiftCardDetailsList_QNAME, GiftCardDetailsList.class, ManagePendingPaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ErrorInfo", scope = ManageSCDInfoResponse.class)
    public JAXBElement<ErrorInfo> createManageSCDInfoResponseErrorInfo(ErrorInfo value) {
        return new JAXBElement<ErrorInfo>(_QueryInstallmentConsentDetailsResponseErrorInfo_QNAME, ErrorInfo.class, ManageSCDInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ErrorInfo", scope = ManagePendingPaymentDetailsResponse.class)
    public JAXBElement<ErrorInfo> createManagePendingPaymentDetailsResponseErrorInfo(ErrorInfo value) {
        return new JAXBElement<ErrorInfo>(_QueryInstallmentConsentDetailsResponseErrorInfo_QNAME, ErrorInfo.class, ManagePendingPaymentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePendingPaymentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ManagePendingPaymentInfo", scope = ManagePendingPaymentDetailsRequest.class)
    public JAXBElement<ManagePendingPaymentInfo> createManagePendingPaymentDetailsRequestManagePendingPaymentInfo(ManagePendingPaymentInfo value) {
        return new JAXBElement<ManagePendingPaymentInfo>(_ManagePendingPaymentDetailsRequestManagePendingPaymentInfo_QNAME, ManagePendingPaymentInfo.class, ManagePendingPaymentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateConsentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "UpdateConsentInfo", scope = ManageConsentDetailsRequest.class)
    public JAXBElement<UpdateConsentInfo> createManageConsentDetailsRequestUpdateConsentInfo(UpdateConsentInfo value) {
        return new JAXBElement<UpdateConsentInfo>(_ManageConsentDetailsRequestUpdateConsentInfo_QNAME, UpdateConsentInfo.class, ManageConsentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertConsentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "InsertConsentInfo", scope = ManageConsentDetailsRequest.class)
    public JAXBElement<InsertConsentInfo> createManageConsentDetailsRequestInsertConsentInfo(InsertConsentInfo value) {
        return new JAXBElement<InsertConsentInfo>(_ManageConsentDetailsRequestInsertConsentInfo_QNAME, InsertConsentInfo.class, ManageConsentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ErrorInfo", scope = QueryPreferredOrderInfoResponse.class)
    public JAXBElement<ErrorInfo> createQueryPreferredOrderInfoResponseErrorInfo(ErrorInfo value) {
        return new JAXBElement<ErrorInfo>(_QueryInstallmentConsentDetailsResponseErrorInfo_QNAME, ErrorInfo.class, QueryPreferredOrderInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreffOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "PreffOrderInfo", scope = QueryPreferredOrderInfoResponse.class)
    public JAXBElement<PreffOrderInfo> createQueryPreferredOrderInfoResponsePreffOrderInfo(PreffOrderInfo value) {
        return new JAXBElement<PreffOrderInfo>(_QueryPreferredOrderInfoResponsePreffOrderInfo_QNAME, PreffOrderInfo.class, QueryPreferredOrderInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "esn", scope = QueryPreferredOrderInfoRequest.class)
    public JAXBElement<String> createQueryPreferredOrderInfoRequestEsn(String value) {
        return new JAXBElement<String>(_QueryPreferredOrderInfoRequestEsn_QNAME, String.class, QueryPreferredOrderInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "mdn", scope = QueryPreferredOrderInfoRequest.class)
    public JAXBElement<String> createQueryPreferredOrderInfoRequestMdn(String value) {
        return new JAXBElement<String>(_QueryPreferredOrderInfoRequestMdn_QNAME, String.class, QueryPreferredOrderInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateConsentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "UpdateConsentInfo", scope = ManageInstallmentConsentDetailsRequest.class)
    public JAXBElement<UpdateConsentInfo> createManageInstallmentConsentDetailsRequestUpdateConsentInfo(UpdateConsentInfo value) {
        return new JAXBElement<UpdateConsentInfo>(_ManageConsentDetailsRequestUpdateConsentInfo_QNAME, UpdateConsentInfo.class, ManageInstallmentConsentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertInstallmentConsentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "InsertInstallmentConsentInfo", scope = ManageInstallmentConsentDetailsRequest.class)
    public JAXBElement<InsertInstallmentConsentInfo> createManageInstallmentConsentDetailsRequestInsertInstallmentConsentInfo(InsertInstallmentConsentInfo value) {
        return new JAXBElement<InsertInstallmentConsentInfo>(_ManageInstallmentConsentDetailsRequestInsertInstallmentConsentInfo_QNAME, InsertInstallmentConsentInfo.class, ManageInstallmentConsentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "ManagerUserId", scope = ResetPasswordRequest.class)
    public JAXBElement<String> createResetPasswordRequestManagerUserId(String value) {
        return new JAXBElement<String>(_ResetPasswordRequestManagerUserId_QNAME, String.class, ResetPasswordRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "DefinitivePasswordInd", scope = ResetPasswordRequest.class)
    public JAXBElement<Boolean> createResetPasswordRequestDefinitivePasswordInd(Boolean value) {
        return new JAXBElement<Boolean>(_ResetPasswordRequestDefinitivePasswordInd_QNAME, Boolean.class, ResetPasswordRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "QtyStatus", scope = QueryOnhandSaleableQuantityRequest.class)
    public JAXBElement<String> createQueryOnhandSaleableQuantityRequestQtyStatus(String value) {
        return new JAXBElement<String>(_QueryOnhandSaleableQuantityRequestQtyStatus_QNAME, String.class, QueryOnhandSaleableQuantityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "UserLoginIdentifier", scope = AuthenticateInfoRequest.class)
    public JAXBElement<String> createAuthenticateInfoRequestUserLoginIdentifier(String value) {
        return new JAXBElement<String>(_AuthenticateInfoRequestUserLoginIdentifier_QNAME, String.class, AuthenticateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "UserCorporateIdentifier", scope = AuthenticateInfoRequest.class)
    public JAXBElement<String> createAuthenticateInfoRequestUserCorporateIdentifier(String value) {
        return new JAXBElement<String>(_AuthenticateInfoRequestUserCorporateIdentifier_QNAME, String.class, AuthenticateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.spcs.retailservices.domain", name = "UserPassword", scope = AuthenticateInfoRequest.class)
    public JAXBElement<String> createAuthenticateInfoRequestUserPassword(String value) {
        return new JAXBElement<String>(_AuthenticateInfoRequestUserPassword_QNAME, String.class, AuthenticateInfoRequest.class, value);
    }

}

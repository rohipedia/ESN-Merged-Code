
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import esn.com.spcs.retailservices.domain.CommitPunchDataRequest;
import esn.com.spcs.retailservices.domain.QueryLastPunchDetailsRequest;
import esn.com.spcs.retailservices.domain.QueryStoreByClientNameRequest;
import esn.com.spcs.retailservices.domain.ValidateUserRequest;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{java:com.spcs.retailservices.domain}Header"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "header"
})
@XmlSeeAlso({
    QueryStoreByClientNameRequest.class,
    QueryLastPunchDetailsRequest.class,
    CommitPunchDataRequest.class,
    ValidateUserRequest.class,
    AuthenticateInfoRequest.class,
    CreateStoreOrderNotificationRequest.class,
    EncryptStringRequest.class,
    InsDelUpdInventoryRequest.class,
    KitComponentPricingRequest.class,
    KitDtlsforSKURequest.class,
    ProductDetailInformationRequest.class,
    ProductInvDetailsRequest.class,
    ProductManufacturerValidationRequest.class,
    ProductStockedDirectFfWHRequest.class,
    QueryConsignedEmployeeIdentityRequest.class,
    QueryKitPriceRequest.class,
    QueryNameByIdentifierRequest.class,
    QueryOnhandSaleableQuantityRequest.class,
    QueryPendingWebOrdersRequest.class,
    QueryProductIdentifierRequest.class,
    QueryProductPromotionDetailsRequest.class,
    QueryProductRequest.class,
    QueryTaxesRequest.class,
    SerialNumberProductValidationRequest.class,
    SKUQtyValidationRequest.class,
    ValidateDirectFulfillmentRequest.class,
    ValidateProductSerialInformationRequest.class,
    ValidateSerialNumberMsnSimIdRequest.class,
    ValidateSerialNumberRequest.class,
    CreateOrderInRmsRequest.class,
    QueryOrderFromRmsRequest.class,
    QueryConsentListRequest.class,
    QueryConsentDetailsRequest.class,
    ManageUserProfileAccessRequest.class,
    GetUserProfileAccessInfoRequest.class,
    AssignRegisterAndFloatRequest.class,
    GetRMSStoreDetailsRequest.class,
    GetRMSDiscountsRequest.class,
    QueryConsentVerbiageRequest.class,
    SaveBravoConsentRequest.class,
    QueryTenderConfigurationValuesRequest.class,
    CreatePOSTransactionRequest.class,
    UpdateTransactionDataRequest.class,
    UpdatePOSTransactionRequest.class,
    ClientPropertiesRequest.class,
    ResetPasswordRequest.class,
    ManageInstallmentConsentDetailsRequest.class,
    QueryInstallmentConsentDetailsRequest.class,
    QueryPreferredOrderInfoRequest.class,
    ManageConsentDetailsRequest.class,
    QueryPendingPaymentListRequest.class,
    ManagePendingPaymentDetailsRequest.class,
    ManageSCDInfoRequest.class,
    QueryAccountFunctionalityMatrixRequest.class,
    CreateRetrieveCustomerIdentifierRequest.class,
    QueryStoreChannelRequest.class,
    ManageTransactionSummaryDetailsRequest.class,
    QueryTransactionSummaryDetailsRequest.class,
    QueryProfileAuthorizationRequest.class,
    SendIdVerificationDataToRmsRequest.class,
    SendApiXmlToRmsRequest.class,
    CreateIDCaptureLogRequest.class,
    QueryIDCaptureLogRequest.class,
    ManageDeviceRebrandingRequest.class,
    QueryUserListForStoresRequest.class,
    QueryOriginalSaleTransactionRequest.class,
    QueryWebOrderListRequest.class,
    QueryTransactionHistoryRequest.class,
    QueryDeviceSaleableStatusRequest.class,
    QuerySalesRepIdValidationRequest.class,
    QueryCalculateTaxesRequest.class
})
public class Request {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected Header header;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

}

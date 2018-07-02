
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import esn.com.spcs.retailservices.domain.CommitPunchDataResponse;
import esn.com.spcs.retailservices.domain.QueryLastPunchDetailsResponse;
import esn.com.spcs.retailservices.domain.QueryStoreByClientNameResponse;
import esn.com.spcs.retailservices.domain.ValidateUserResponse;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{java:com.spcs.retailservices.domain}Header"/&gt;
 *         &lt;element name="DatabaseErrorDetails" type="{java:com.spcs.retailservices.domain}DatabaseErrorDetails"/&gt;
 *         &lt;element name="Messages" type="{java:com.spcs.retailservices.domain}MessageInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "header",
    "databaseErrorDetails",
    "messages"
})
@XmlSeeAlso({
    QueryStoreByClientNameResponse.class,
    QueryLastPunchDetailsResponse.class,
    CommitPunchDataResponse.class,
    ValidateUserResponse.class,
    AuthenticateInfoResponse.class,
    EncryptStringResponse.class,
    InsDelUpdInventoryResponse.class,
    KitComponentPricingResponse.class,
    KitDtlsforSKUResponse.class,
    ProductDetailInformationResponse.class,
    ProductInvDetailsResponse.class,
    ProductManufacturerValidationResponse.class,
    ProductStockedDirectFfWHResponse.class,
    QueryKitPriceResponse.class,
    QueryNameByIdentifierResponse.class,
    QueryOnhandSaleableQuantityResponse.class,
    QueryPendingWebOrdersResponse.class,
    QueryProductIdentifierResponse.class,
    QueryProductPromotionDetailsResponse.class,
    QueryProductResponse.class,
    SerialNumberProductValidationResponse.class,
    SKUQtyValidationResponse.class,
    ValidateDirectFulfillmentResponse.class,
    ValidateProductSerialInformationResponse.class,
    ValidateSerialNumberMsnSimIdResponse.class,
    ValidateSerialNumberResponse.class,
    ManageUserProfileAccessResponse.class,
    GetUserProfileAccessInfoResponse.class,
    GetRMSStoreDetailsResponse.class,
    GetRMSDiscountsResponse.class,
    QueryConsentVerbiageResponse.class,
    SaveBravoConsentResponse.class,
    QueryTenderConfigurationValuesResponse.class,
    UpdateTransactionDataResponse.class,
    CreatePOSTransactionResponse.class,
    UpdatePOSTransactionResponse.class,
    ClientPropertiesResponse.class,
    QueryPreferredOrderInfoResponse.class,
    QueryPendingPaymentListResponse.class,
    ManagePendingPaymentDetailsResponse.class,
    ManageSCDInfoResponse.class,
    QueryAccountFunctionalityMatrixResponse.class,
    CreateRetrieveCustomerIdentifierResponse.class,
    QueryStoreChannelResponse.class,
    ManageTransactionSummaryDetailsResponse.class,
    QueryTransactionSummaryDetailsResponse.class,
    QueryProfileAuthorizationResponse.class,
    SendIdVerificationDataToRmsResponse.class,
    SendApiXmlToRmsResponse.class,
    CreateIDCaptureLogResponse.class,
    QueryIDCaptureLogResponse.class,
    ManageDeviceRebrandingResponse.class,
    QueryUserListForStoresResponse.class,
    QueryOriginalSaleTransactionResponse.class,
    QueryWebOrderListResponse.class,
    QueryTransactionHistoryResponse.class,
    QueryDeviceSaleableStatusResponse.class,
    QuerySalesRepIdValidationResponse.class,
    CreateStoreOrderNotificationResponse.class,
    QueryCalculateTaxesResponse.class,
    CreateOrderInRmsResponse.class,
    QueryConsentListResponse.class,
    ManageInstallmentConsentDetailsResponse.class,
    ManageConsentDetailsResponse.class,
    QueryOrderFromRmsResponse.class,
    ResetPasswordResponse.class,
    QueryInstallmentConsentDetailsResponse.class,
    AssignRegisterAndFloatResponse.class,
    QueryConsentDetailsResponse.class
})
public class Response {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected Header header;
    @XmlElement(name = "DatabaseErrorDetails", required = true, nillable = true)
    protected DatabaseErrorDetails databaseErrorDetails;
    @XmlElement(name = "Messages", nillable = true)
    protected List<MessageInfo> messages;

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

    /**
     * Gets the value of the databaseErrorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseErrorDetails }
     *     
     */
    public DatabaseErrorDetails getDatabaseErrorDetails() {
        return databaseErrorDetails;
    }

    /**
     * Sets the value of the databaseErrorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseErrorDetails }
     *     
     */
    public void setDatabaseErrorDetails(DatabaseErrorDetails value) {
        this.databaseErrorDetails = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageInfo }
     * 
     * 
     */
    public List<MessageInfo> getMessages() {
        if (messages == null) {
            messages = new ArrayList<MessageInfo>();
        }
        return this.messages;
    }

}

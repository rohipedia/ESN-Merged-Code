
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateTransInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateTransInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="employeeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="floatNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="directShipIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="machineIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nbaSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="radioShackInfo" type="{java:com.spcs.retailservices.domain}RadioShackInfo" minOccurs="0"/&gt;
 *         &lt;element name="originalTransNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="retExchReasonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="retExchComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appointmentConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expressTransactionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiptEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webOrderLineItemDeleteIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sharedCashDrawerFloatNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sharedCashDrawerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shoppingCartOrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="accountInfoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corporationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buybackTotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="xtnlSystemTransIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webOrderHdrID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="directShipInfo" type="{java:com.spcs.retailservices.domain}DirectShipInfo" minOccurs="0"/&gt;
 *         &lt;element name="createActionTypeList" type="{java:com.spcs.retailservices.domain}CreateActionTypeList" minOccurs="0"/&gt;
 *         &lt;element name="transactionItemList" type="{java:com.spcs.retailservices.domain}TransactionItemList" minOccurs="0"/&gt;
 *         &lt;element name="transactionTendersList" type="{java:com.spcs.retailservices.domain}TransactionTendersList" minOccurs="0"/&gt;
 *         &lt;element name="dsReservationList" type="{java:com.spcs.retailservices.domain}DsReservationList" minOccurs="0"/&gt;
 *         &lt;element name="isOneClickOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oneClickReadinessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oneClickAdditionalAttributeList" type="{java:com.spcs.retailservices.domain}OneClickAdditionalAttributeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTransInfo", propOrder = {
    "storeIdentifier",
    "employeeIdentifier",
    "customerIdentifier",
    "accountNumber",
    "registerNumber",
    "dealerCode",
    "transactionTypeIdentifier",
    "transactionDate",
    "subTotal",
    "totalAmount",
    "floatNumber",
    "directShipIndicator",
    "action",
    "machineIdentifier",
    "nbaSessionId",
    "radioShackInfo",
    "originalTransNumber",
    "retExchReasonId",
    "retExchComments",
    "appointmentConfirmationNumber",
    "expressTransactionIndicator",
    "receiptEmailAddress",
    "webOrderLineItemDeleteIndicator",
    "sharedCashDrawerFloatNumber",
    "sharedCashDrawerId",
    "shoppingCartOrderIdentifier",
    "accountInfoStatus",
    "corporationIdentifier",
    "buybackTotalTaxAmount",
    "xtnlSystemTransIdentifier",
    "webOrderHdrID",
    "directShipInfo",
    "createActionTypeList",
    "transactionItemList",
    "transactionTendersList",
    "dsReservationList",
    "isOneClickOrder",
    "oneClickReadinessIndicator",
    "oneClickAdditionalAttributeList"
})
public class CreateTransInfo {

    protected int storeIdentifier;
    protected int employeeIdentifier;
    protected Integer customerIdentifier;
    protected String accountNumber;
    protected long registerNumber;
    protected String dealerCode;
    protected long transactionTypeIdentifier;
    @XmlElement(required = true)
    protected String transactionDate;
    protected double subTotal;
    protected double totalAmount;
    protected long floatNumber;
    protected String directShipIndicator;
    protected int action;
    @XmlElement(required = true)
    protected String machineIdentifier;
    protected String nbaSessionId;
    protected RadioShackInfo radioShackInfo;
    protected Long originalTransNumber;
    protected Long retExchReasonId;
    protected String retExchComments;
    protected String appointmentConfirmationNumber;
    protected String expressTransactionIndicator;
    protected String receiptEmailAddress;
    protected String webOrderLineItemDeleteIndicator;
    protected Integer sharedCashDrawerFloatNumber;
    protected Integer sharedCashDrawerId;
    protected Integer shoppingCartOrderIdentifier;
    protected String accountInfoStatus;
    protected String corporationIdentifier;
    protected Double buybackTotalTaxAmount;
    protected String xtnlSystemTransIdentifier;
    protected Integer webOrderHdrID;
    protected DirectShipInfo directShipInfo;
    protected CreateActionTypeList createActionTypeList;
    protected TransactionItemList transactionItemList;
    protected TransactionTendersList transactionTendersList;
    protected DsReservationList dsReservationList;
    protected Boolean isOneClickOrder;
    protected String oneClickReadinessIndicator;
    protected OneClickAdditionalAttributeList oneClickAdditionalAttributeList;

    /**
     * Gets the value of the storeIdentifier property.
     * 
     */
    public int getStoreIdentifier() {
        return storeIdentifier;
    }

    /**
     * Sets the value of the storeIdentifier property.
     * 
     */
    public void setStoreIdentifier(int value) {
        this.storeIdentifier = value;
    }

    /**
     * Gets the value of the employeeIdentifier property.
     * 
     */
    public int getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    /**
     * Sets the value of the employeeIdentifier property.
     * 
     */
    public void setEmployeeIdentifier(int value) {
        this.employeeIdentifier = value;
    }

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerIdentifier(Integer value) {
        this.customerIdentifier = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the registerNumber property.
     * 
     */
    public long getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     * 
     */
    public void setRegisterNumber(long value) {
        this.registerNumber = value;
    }

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the transactionTypeIdentifier property.
     * 
     */
    public long getTransactionTypeIdentifier() {
        return transactionTypeIdentifier;
    }

    /**
     * Sets the value of the transactionTypeIdentifier property.
     * 
     */
    public void setTransactionTypeIdentifier(long value) {
        this.transactionTypeIdentifier = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     */
    public void setSubTotal(double value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the floatNumber property.
     * 
     */
    public long getFloatNumber() {
        return floatNumber;
    }

    /**
     * Sets the value of the floatNumber property.
     * 
     */
    public void setFloatNumber(long value) {
        this.floatNumber = value;
    }

    /**
     * Gets the value of the directShipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectShipIndicator() {
        return directShipIndicator;
    }

    /**
     * Sets the value of the directShipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectShipIndicator(String value) {
        this.directShipIndicator = value;
    }

    /**
     * Gets the value of the action property.
     * 
     */
    public int getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     */
    public void setAction(int value) {
        this.action = value;
    }

    /**
     * Gets the value of the machineIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineIdentifier() {
        return machineIdentifier;
    }

    /**
     * Sets the value of the machineIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineIdentifier(String value) {
        this.machineIdentifier = value;
    }

    /**
     * Gets the value of the nbaSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbaSessionId() {
        return nbaSessionId;
    }

    /**
     * Sets the value of the nbaSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbaSessionId(String value) {
        this.nbaSessionId = value;
    }

    /**
     * Gets the value of the radioShackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RadioShackInfo }
     *     
     */
    public RadioShackInfo getRadioShackInfo() {
        return radioShackInfo;
    }

    /**
     * Sets the value of the radioShackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioShackInfo }
     *     
     */
    public void setRadioShackInfo(RadioShackInfo value) {
        this.radioShackInfo = value;
    }

    /**
     * Gets the value of the originalTransNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalTransNumber() {
        return originalTransNumber;
    }

    /**
     * Sets the value of the originalTransNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalTransNumber(Long value) {
        this.originalTransNumber = value;
    }

    /**
     * Gets the value of the retExchReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetExchReasonId() {
        return retExchReasonId;
    }

    /**
     * Sets the value of the retExchReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetExchReasonId(Long value) {
        this.retExchReasonId = value;
    }

    /**
     * Gets the value of the retExchComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetExchComments() {
        return retExchComments;
    }

    /**
     * Sets the value of the retExchComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetExchComments(String value) {
        this.retExchComments = value;
    }

    /**
     * Gets the value of the appointmentConfirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentConfirmationNumber() {
        return appointmentConfirmationNumber;
    }

    /**
     * Sets the value of the appointmentConfirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentConfirmationNumber(String value) {
        this.appointmentConfirmationNumber = value;
    }

    /**
     * Gets the value of the expressTransactionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressTransactionIndicator() {
        return expressTransactionIndicator;
    }

    /**
     * Sets the value of the expressTransactionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressTransactionIndicator(String value) {
        this.expressTransactionIndicator = value;
    }

    /**
     * Gets the value of the receiptEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptEmailAddress() {
        return receiptEmailAddress;
    }

    /**
     * Sets the value of the receiptEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptEmailAddress(String value) {
        this.receiptEmailAddress = value;
    }

    /**
     * Gets the value of the webOrderLineItemDeleteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebOrderLineItemDeleteIndicator() {
        return webOrderLineItemDeleteIndicator;
    }

    /**
     * Sets the value of the webOrderLineItemDeleteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebOrderLineItemDeleteIndicator(String value) {
        this.webOrderLineItemDeleteIndicator = value;
    }

    /**
     * Gets the value of the sharedCashDrawerFloatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSharedCashDrawerFloatNumber() {
        return sharedCashDrawerFloatNumber;
    }

    /**
     * Sets the value of the sharedCashDrawerFloatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSharedCashDrawerFloatNumber(Integer value) {
        this.sharedCashDrawerFloatNumber = value;
    }

    /**
     * Gets the value of the sharedCashDrawerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSharedCashDrawerId() {
        return sharedCashDrawerId;
    }

    /**
     * Sets the value of the sharedCashDrawerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSharedCashDrawerId(Integer value) {
        this.sharedCashDrawerId = value;
    }

    /**
     * Gets the value of the shoppingCartOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShoppingCartOrderIdentifier() {
        return shoppingCartOrderIdentifier;
    }

    /**
     * Sets the value of the shoppingCartOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShoppingCartOrderIdentifier(Integer value) {
        this.shoppingCartOrderIdentifier = value;
    }

    /**
     * Gets the value of the accountInfoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInfoStatus() {
        return accountInfoStatus;
    }

    /**
     * Sets the value of the accountInfoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInfoStatus(String value) {
        this.accountInfoStatus = value;
    }

    /**
     * Gets the value of the corporationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporationIdentifier() {
        return corporationIdentifier;
    }

    /**
     * Sets the value of the corporationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporationIdentifier(String value) {
        this.corporationIdentifier = value;
    }

    /**
     * Gets the value of the buybackTotalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackTotalTaxAmount() {
        return buybackTotalTaxAmount;
    }

    /**
     * Sets the value of the buybackTotalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackTotalTaxAmount(Double value) {
        this.buybackTotalTaxAmount = value;
    }

    /**
     * Gets the value of the xtnlSystemTransIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtnlSystemTransIdentifier() {
        return xtnlSystemTransIdentifier;
    }

    /**
     * Sets the value of the xtnlSystemTransIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtnlSystemTransIdentifier(String value) {
        this.xtnlSystemTransIdentifier = value;
    }

    /**
     * Gets the value of the webOrderHdrID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWebOrderHdrID() {
        return webOrderHdrID;
    }

    /**
     * Sets the value of the webOrderHdrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebOrderHdrID(Integer value) {
        this.webOrderHdrID = value;
    }

    /**
     * Gets the value of the directShipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DirectShipInfo }
     *     
     */
    public DirectShipInfo getDirectShipInfo() {
        return directShipInfo;
    }

    /**
     * Sets the value of the directShipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectShipInfo }
     *     
     */
    public void setDirectShipInfo(DirectShipInfo value) {
        this.directShipInfo = value;
    }

    /**
     * Gets the value of the createActionTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link CreateActionTypeList }
     *     
     */
    public CreateActionTypeList getCreateActionTypeList() {
        return createActionTypeList;
    }

    /**
     * Sets the value of the createActionTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateActionTypeList }
     *     
     */
    public void setCreateActionTypeList(CreateActionTypeList value) {
        this.createActionTypeList = value;
    }

    /**
     * Gets the value of the transactionItemList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionItemList }
     *     
     */
    public TransactionItemList getTransactionItemList() {
        return transactionItemList;
    }

    /**
     * Sets the value of the transactionItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionItemList }
     *     
     */
    public void setTransactionItemList(TransactionItemList value) {
        this.transactionItemList = value;
    }

    /**
     * Gets the value of the transactionTendersList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTendersList }
     *     
     */
    public TransactionTendersList getTransactionTendersList() {
        return transactionTendersList;
    }

    /**
     * Sets the value of the transactionTendersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTendersList }
     *     
     */
    public void setTransactionTendersList(TransactionTendersList value) {
        this.transactionTendersList = value;
    }

    /**
     * Gets the value of the dsReservationList property.
     * 
     * @return
     *     possible object is
     *     {@link DsReservationList }
     *     
     */
    public DsReservationList getDsReservationList() {
        return dsReservationList;
    }

    /**
     * Sets the value of the dsReservationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsReservationList }
     *     
     */
    public void setDsReservationList(DsReservationList value) {
        this.dsReservationList = value;
    }

    /**
     * Gets the value of the isOneClickOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOneClickOrder() {
        return isOneClickOrder;
    }

    /**
     * Sets the value of the isOneClickOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOneClickOrder(Boolean value) {
        this.isOneClickOrder = value;
    }

    /**
     * Gets the value of the oneClickReadinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneClickReadinessIndicator() {
        return oneClickReadinessIndicator;
    }

    /**
     * Sets the value of the oneClickReadinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneClickReadinessIndicator(String value) {
        this.oneClickReadinessIndicator = value;
    }

    /**
     * Gets the value of the oneClickAdditionalAttributeList property.
     * 
     * @return
     *     possible object is
     *     {@link OneClickAdditionalAttributeList }
     *     
     */
    public OneClickAdditionalAttributeList getOneClickAdditionalAttributeList() {
        return oneClickAdditionalAttributeList;
    }

    /**
     * Sets the value of the oneClickAdditionalAttributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneClickAdditionalAttributeList }
     *     
     */
    public void setOneClickAdditionalAttributeList(OneClickAdditionalAttributeList value) {
        this.oneClickAdditionalAttributeList = value;
    }

}

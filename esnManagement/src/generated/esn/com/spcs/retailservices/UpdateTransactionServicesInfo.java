
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransactionServicesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransactionServicesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="esn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swapToEsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="courtesyAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mrc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="contractIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="csa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="walkIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swapToWalkIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="service3GFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flipFlopIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="armRebateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rebatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activationDepositSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="deviceDepositSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="employeeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="portIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flStampTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="additionalDownpaymentDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="equipmentInstallBillLeaseInfo" type="{java:com.spcs.retailservices.domain}EquipmentInstallBillLeaseInfo" minOccurs="0"/&gt;
 *         &lt;element name="decimalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionServicesDetails" type="{java:com.spcs.retailservices.domain}TransactionServicesDetails"/&gt;
 *         &lt;element name="rowNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bxgxTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earlyUpgradeTradeInInfo" type="{java:com.spcs.retailservices.domain}EarlyUpgradeTradeInInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransactionServicesInfo", propOrder = {
    "serviceType",
    "esn",
    "swapToEsn",
    "mdn",
    "effectiveDate",
    "courtesyAdjustmentAmount",
    "quantity",
    "mrc",
    "contractIdentifier",
    "csa",
    "walkIn",
    "swapToWalkIn",
    "productIdentifier",
    "status",
    "service3GFlag",
    "subscriberIdentifier",
    "deviceCategory",
    "deviceType",
    "flipFlopIndicator",
    "armRebateIdentifier",
    "rebatePlanCode",
    "activationDepositSequenceNumber",
    "deviceDepositSequenceNumber",
    "accountNumber",
    "storeIdentifier",
    "customerIdentifier",
    "employeeIdentifier",
    "sku",
    "portIn",
    "flStampTaxAmount",
    "additionalDownpaymentDiscountAmount",
    "equipmentInstallBillLeaseInfo",
    "decimalSerialNumber",
    "transactionServicesDetails",
    "rowNumber",
    "bxgxTransactionId",
    "earlyUpgradeTradeInInfo"
})
public class UpdateTransactionServicesInfo {

    @XmlElement(required = true)
    protected String serviceType;
    protected String esn;
    protected String swapToEsn;
    @XmlElement(required = true)
    protected String mdn;
    @XmlElement(required = true)
    protected String effectiveDate;
    protected double courtesyAdjustmentAmount;
    protected int quantity;
    protected Double mrc;
    protected Integer contractIdentifier;
    @XmlElement(required = true)
    protected String csa;
    protected String walkIn;
    protected String swapToWalkIn;
    protected Integer productIdentifier;
    protected Integer status;
    protected String service3GFlag;
    protected String subscriberIdentifier;
    protected String deviceCategory;
    @XmlElement(required = true)
    protected String deviceType;
    protected String flipFlopIndicator;
    protected String armRebateIdentifier;
    protected String rebatePlanCode;
    protected Integer activationDepositSequenceNumber;
    protected Integer deviceDepositSequenceNumber;
    protected String accountNumber;
    protected int storeIdentifier;
    protected Integer customerIdentifier;
    protected int employeeIdentifier;
    @XmlElement(required = true)
    protected String sku;
    protected String portIn;
    protected Double flStampTaxAmount;
    protected Double additionalDownpaymentDiscountAmount;
    protected EquipmentInstallBillLeaseInfo equipmentInstallBillLeaseInfo;
    protected String decimalSerialNumber;
    @XmlElement(required = true)
    protected TransactionServicesDetails transactionServicesDetails;
    protected Integer rowNumber;
    protected String bxgxTransactionId;
    protected EarlyUpgradeTradeInInfo earlyUpgradeTradeInInfo;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Gets the value of the swapToEsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapToEsn() {
        return swapToEsn;
    }

    /**
     * Sets the value of the swapToEsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapToEsn(String value) {
        this.swapToEsn = value;
    }

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdn(String value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the courtesyAdjustmentAmount property.
     * 
     */
    public double getCourtesyAdjustmentAmount() {
        return courtesyAdjustmentAmount;
    }

    /**
     * Sets the value of the courtesyAdjustmentAmount property.
     * 
     */
    public void setCourtesyAdjustmentAmount(double value) {
        this.courtesyAdjustmentAmount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the mrc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMrc() {
        return mrc;
    }

    /**
     * Sets the value of the mrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMrc(Double value) {
        this.mrc = value;
    }

    /**
     * Gets the value of the contractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractIdentifier() {
        return contractIdentifier;
    }

    /**
     * Sets the value of the contractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractIdentifier(Integer value) {
        this.contractIdentifier = value;
    }

    /**
     * Gets the value of the csa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsa() {
        return csa;
    }

    /**
     * Sets the value of the csa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsa(String value) {
        this.csa = value;
    }

    /**
     * Gets the value of the walkIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalkIn() {
        return walkIn;
    }

    /**
     * Sets the value of the walkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalkIn(String value) {
        this.walkIn = value;
    }

    /**
     * Gets the value of the swapToWalkIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapToWalkIn() {
        return swapToWalkIn;
    }

    /**
     * Sets the value of the swapToWalkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapToWalkIn(String value) {
        this.swapToWalkIn = value;
    }

    /**
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductIdentifier(Integer value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the service3GFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService3GFlag() {
        return service3GFlag;
    }

    /**
     * Sets the value of the service3GFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService3GFlag(String value) {
        this.service3GFlag = value;
    }

    /**
     * Gets the value of the subscriberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberIdentifier() {
        return subscriberIdentifier;
    }

    /**
     * Sets the value of the subscriberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberIdentifier(String value) {
        this.subscriberIdentifier = value;
    }

    /**
     * Gets the value of the deviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCategory() {
        return deviceCategory;
    }

    /**
     * Sets the value of the deviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCategory(String value) {
        this.deviceCategory = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the flipFlopIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlipFlopIndicator() {
        return flipFlopIndicator;
    }

    /**
     * Sets the value of the flipFlopIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlipFlopIndicator(String value) {
        this.flipFlopIndicator = value;
    }

    /**
     * Gets the value of the armRebateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmRebateIdentifier() {
        return armRebateIdentifier;
    }

    /**
     * Sets the value of the armRebateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmRebateIdentifier(String value) {
        this.armRebateIdentifier = value;
    }

    /**
     * Gets the value of the rebatePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebatePlanCode() {
        return rebatePlanCode;
    }

    /**
     * Sets the value of the rebatePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebatePlanCode(String value) {
        this.rebatePlanCode = value;
    }

    /**
     * Gets the value of the activationDepositSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivationDepositSequenceNumber() {
        return activationDepositSequenceNumber;
    }

    /**
     * Sets the value of the activationDepositSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivationDepositSequenceNumber(Integer value) {
        this.activationDepositSequenceNumber = value;
    }

    /**
     * Gets the value of the deviceDepositSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeviceDepositSequenceNumber() {
        return deviceDepositSequenceNumber;
    }

    /**
     * Sets the value of the deviceDepositSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeviceDepositSequenceNumber(Integer value) {
        this.deviceDepositSequenceNumber = value;
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
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the portIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortIn() {
        return portIn;
    }

    /**
     * Sets the value of the portIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortIn(String value) {
        this.portIn = value;
    }

    /**
     * Gets the value of the flStampTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlStampTaxAmount() {
        return flStampTaxAmount;
    }

    /**
     * Sets the value of the flStampTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlStampTaxAmount(Double value) {
        this.flStampTaxAmount = value;
    }

    /**
     * Gets the value of the additionalDownpaymentDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalDownpaymentDiscountAmount() {
        return additionalDownpaymentDiscountAmount;
    }

    /**
     * Sets the value of the additionalDownpaymentDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalDownpaymentDiscountAmount(Double value) {
        this.additionalDownpaymentDiscountAmount = value;
    }

    /**
     * Gets the value of the equipmentInstallBillLeaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentInstallBillLeaseInfo }
     *     
     */
    public EquipmentInstallBillLeaseInfo getEquipmentInstallBillLeaseInfo() {
        return equipmentInstallBillLeaseInfo;
    }

    /**
     * Sets the value of the equipmentInstallBillLeaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentInstallBillLeaseInfo }
     *     
     */
    public void setEquipmentInstallBillLeaseInfo(EquipmentInstallBillLeaseInfo value) {
        this.equipmentInstallBillLeaseInfo = value;
    }

    /**
     * Gets the value of the decimalSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalSerialNumber() {
        return decimalSerialNumber;
    }

    /**
     * Sets the value of the decimalSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalSerialNumber(String value) {
        this.decimalSerialNumber = value;
    }

    /**
     * Gets the value of the transactionServicesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionServicesDetails }
     *     
     */
    public TransactionServicesDetails getTransactionServicesDetails() {
        return transactionServicesDetails;
    }

    /**
     * Sets the value of the transactionServicesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionServicesDetails }
     *     
     */
    public void setTransactionServicesDetails(TransactionServicesDetails value) {
        this.transactionServicesDetails = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowNumber(Integer value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the bxgxTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBxgxTransactionId() {
        return bxgxTransactionId;
    }

    /**
     * Sets the value of the bxgxTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBxgxTransactionId(String value) {
        this.bxgxTransactionId = value;
    }

    /**
     * Gets the value of the earlyUpgradeTradeInInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EarlyUpgradeTradeInInfo }
     *     
     */
    public EarlyUpgradeTradeInInfo getEarlyUpgradeTradeInInfo() {
        return earlyUpgradeTradeInInfo;
    }

    /**
     * Sets the value of the earlyUpgradeTradeInInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarlyUpgradeTradeInInfo }
     *     
     */
    public void setEarlyUpgradeTradeInInfo(EarlyUpgradeTradeInInfo value) {
        this.earlyUpgradeTradeInInfo = value;
    }

}

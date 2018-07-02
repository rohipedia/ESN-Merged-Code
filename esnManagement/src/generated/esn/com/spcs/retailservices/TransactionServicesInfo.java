
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionServicesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionServicesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="esn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="swapToEsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="portIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="courtesyAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="mrc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="contractIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="csa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="walkIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swapToWalkIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="service3gFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flipFlopIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="armRebateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rebatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activationDepositSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="deviceDepositSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="transactionServicesDetails" type="{java:com.spcs.retailservices.domain}TransactionServicesDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionServicesInfo", propOrder = {
    "serviceType",
    "esn",
    "swapToEsn",
    "mdn",
    "portIn",
    "courtesyAdjustmentAmount",
    "mrc",
    "contractIdentifier",
    "csa",
    "walkIn",
    "swapToWalkIn",
    "status",
    "service3GFlag",
    "subscriberIdentifier",
    "deviceCategory",
    "flipFlopIndicator",
    "armRebateIdentifier",
    "rebatePlanCode",
    "activationDepositSequenceNumber",
    "deviceDepositSequenceNumber",
    "transactionServicesDetails"
})
public class TransactionServicesInfo {

    @XmlElement(required = true)
    protected String serviceType;
    @XmlElement(required = true)
    protected String esn;
    protected String swapToEsn;
    @XmlElement(required = true)
    protected String mdn;
    protected String portIn;
    protected double courtesyAdjustmentAmount;
    protected Double mrc;
    protected Integer contractIdentifier;
    @XmlElement(required = true)
    protected String csa;
    protected String walkIn;
    protected String swapToWalkIn;
    protected int status;
    @XmlElement(name = "service3gFlag")
    protected String service3GFlag;
    protected String subscriberIdentifier;
    protected String deviceCategory;
    protected String flipFlopIndicator;
    protected String armRebateIdentifier;
    protected String rebatePlanCode;
    protected Long activationDepositSequenceNumber;
    protected Long deviceDepositSequenceNumber;
    @XmlElement(required = true)
    protected TransactionServicesDetails transactionServicesDetails;

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
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
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
     *     {@link Long }
     *     
     */
    public Long getActivationDepositSequenceNumber() {
        return activationDepositSequenceNumber;
    }

    /**
     * Sets the value of the activationDepositSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivationDepositSequenceNumber(Long value) {
        this.activationDepositSequenceNumber = value;
    }

    /**
     * Gets the value of the deviceDepositSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceDepositSequenceNumber() {
        return deviceDepositSequenceNumber;
    }

    /**
     * Sets the value of the deviceDepositSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceDepositSequenceNumber(Long value) {
        this.deviceDepositSequenceNumber = value;
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

}

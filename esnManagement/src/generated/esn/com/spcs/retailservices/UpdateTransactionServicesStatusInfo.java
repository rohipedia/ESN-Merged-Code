
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransactionServicesStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransactionServicesStatusInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderSubLineId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="subscriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="armRebateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rebatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activationDepositSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="deviceDepositSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="employeeIdentifier" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="equipmentInstallBillLoanSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="bxgxTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransactionServicesStatusInfo", propOrder = {
    "esn",
    "orderSubLineId",
    "mdn",
    "status",
    "subscriberIdentifier",
    "armRebateIdentifier",
    "rebatePlanCode",
    "activationDepositSequenceNumber",
    "deviceDepositSequenceNumber",
    "employeeIdentifier",
    "equipmentInstallBillLoanSequenceNumber",
    "bxgxTransactionId"
})
public class UpdateTransactionServicesStatusInfo {

    protected String esn;
    protected Integer orderSubLineId;
    protected String mdn;
    protected Integer status;
    protected String subscriberIdentifier;
    protected String armRebateIdentifier;
    protected String rebatePlanCode;
    protected Long activationDepositSequenceNumber;
    protected Long deviceDepositSequenceNumber;
    protected long employeeIdentifier;
    protected Long equipmentInstallBillLoanSequenceNumber;
    protected String bxgxTransactionId;

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
     * Gets the value of the orderSubLineId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderSubLineId() {
        return orderSubLineId;
    }

    /**
     * Sets the value of the orderSubLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderSubLineId(Integer value) {
        this.orderSubLineId = value;
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
     * Gets the value of the employeeIdentifier property.
     * 
     */
    public long getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    /**
     * Sets the value of the employeeIdentifier property.
     * 
     */
    public void setEmployeeIdentifier(long value) {
        this.employeeIdentifier = value;
    }

    /**
     * Gets the value of the equipmentInstallBillLoanSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentInstallBillLoanSequenceNumber() {
        return equipmentInstallBillLoanSequenceNumber;
    }

    /**
     * Sets the value of the equipmentInstallBillLoanSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentInstallBillLoanSequenceNumber(Long value) {
        this.equipmentInstallBillLoanSequenceNumber = value;
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

}

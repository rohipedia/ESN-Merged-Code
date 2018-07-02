
package com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateGiveBackDeviceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateGiveBackDeviceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validGiveBackDeviceInd" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}GiveBackEligibleFlagType"/&gt;
 *         &lt;element name="itemId" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}EquipmentItemIdentifierType"/&gt;
 *         &lt;element name="validateGiveBackCheckStatusList" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}ValidateGiveBackCheckStatusListType"/&gt;
 *         &lt;element name="deviceCreditAmount" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}CreditAmountType" minOccurs="0"/&gt;
 *         &lt;element name="deviceCreditAmountTax" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}CreditAmountType" minOccurs="0"/&gt;
 *         &lt;element name="leaseGiveBackInfo" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}LeaseGiveBackInfoType" minOccurs="0"/&gt;
 *         &lt;element name="resultReasonText" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}EligibilityStatementTextType" minOccurs="0"/&gt;
 *         &lt;element name="deviceDamageFee" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}ChargeAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateGiveBackDeviceResponseType", propOrder = {
    "validGiveBackDeviceInd",
    "itemId",
    "validateGiveBackCheckStatusList",
    "deviceCreditAmount",
    "deviceCreditAmountTax",
    "leaseGiveBackInfo",
    "resultReasonText",
    "deviceDamageFee"
})
public class ValidateGiveBackDeviceResponseType {

    protected boolean validGiveBackDeviceInd;
    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected ValidateGiveBackCheckStatusListType validateGiveBackCheckStatusList;
    protected BigDecimal deviceCreditAmount;
    protected BigDecimal deviceCreditAmountTax;
    protected LeaseGiveBackInfoType leaseGiveBackInfo;
    protected String resultReasonText;
    protected BigDecimal deviceDamageFee;

    /**
     * Gets the value of the validGiveBackDeviceInd property.
     * 
     */
    public boolean isValidGiveBackDeviceInd() {
        return validGiveBackDeviceInd;
    }

    /**
     * Sets the value of the validGiveBackDeviceInd property.
     * 
     */
    public void setValidGiveBackDeviceInd(boolean value) {
        this.validGiveBackDeviceInd = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the validateGiveBackCheckStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateGiveBackCheckStatusListType }
     *     
     */
    public ValidateGiveBackCheckStatusListType getValidateGiveBackCheckStatusList() {
        return validateGiveBackCheckStatusList;
    }

    /**
     * Sets the value of the validateGiveBackCheckStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateGiveBackCheckStatusListType }
     *     
     */
    public void setValidateGiveBackCheckStatusList(ValidateGiveBackCheckStatusListType value) {
        this.validateGiveBackCheckStatusList = value;
    }

    /**
     * Gets the value of the deviceCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeviceCreditAmount() {
        return deviceCreditAmount;
    }

    /**
     * Sets the value of the deviceCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeviceCreditAmount(BigDecimal value) {
        this.deviceCreditAmount = value;
    }

    /**
     * Gets the value of the deviceCreditAmountTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeviceCreditAmountTax() {
        return deviceCreditAmountTax;
    }

    /**
     * Sets the value of the deviceCreditAmountTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeviceCreditAmountTax(BigDecimal value) {
        this.deviceCreditAmountTax = value;
    }

    /**
     * Gets the value of the leaseGiveBackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseGiveBackInfoType }
     *     
     */
    public LeaseGiveBackInfoType getLeaseGiveBackInfo() {
        return leaseGiveBackInfo;
    }

    /**
     * Sets the value of the leaseGiveBackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseGiveBackInfoType }
     *     
     */
    public void setLeaseGiveBackInfo(LeaseGiveBackInfoType value) {
        this.leaseGiveBackInfo = value;
    }

    /**
     * Gets the value of the resultReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultReasonText() {
        return resultReasonText;
    }

    /**
     * Sets the value of the resultReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultReasonText(String value) {
        this.resultReasonText = value;
    }

    /**
     * Gets the value of the deviceDamageFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeviceDamageFee() {
        return deviceDamageFee;
    }

    /**
     * Sets the value of the deviceDamageFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeviceDamageFee(BigDecimal value) {
        this.deviceDamageFee = value;
    }

}

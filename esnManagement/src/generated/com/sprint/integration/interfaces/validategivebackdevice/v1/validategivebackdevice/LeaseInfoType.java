
package com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeaseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeaseInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ban" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}BillingAccountNumberType" minOccurs="0"/&gt;
 *         &lt;element name="ibLeaseNumber" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}LeaseIdentifierType"/&gt;
 *         &lt;element name="ibLeaseSeqNumber" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}LeaseIdentifierType"/&gt;
 *         &lt;element name="ibLeaseStatusReasonCode" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}LeaseStatusReasonCodeType" minOccurs="0"/&gt;
 *         &lt;element name="tierNumber" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}TierNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeaseInfoType", propOrder = {
    "ban",
    "ibLeaseNumber",
    "ibLeaseSeqNumber",
    "ibLeaseStatusReasonCode",
    "tierNumber"
})
public class LeaseInfoType {

    protected BigInteger ban;
    @XmlElement(required = true)
    protected String ibLeaseNumber;
    @XmlElement(required = true)
    protected String ibLeaseSeqNumber;
    protected String ibLeaseStatusReasonCode;
    protected BigDecimal tierNumber;

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBan(BigInteger value) {
        this.ban = value;
    }

    /**
     * Gets the value of the ibLeaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbLeaseNumber() {
        return ibLeaseNumber;
    }

    /**
     * Sets the value of the ibLeaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbLeaseNumber(String value) {
        this.ibLeaseNumber = value;
    }

    /**
     * Gets the value of the ibLeaseSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbLeaseSeqNumber() {
        return ibLeaseSeqNumber;
    }

    /**
     * Sets the value of the ibLeaseSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbLeaseSeqNumber(String value) {
        this.ibLeaseSeqNumber = value;
    }

    /**
     * Gets the value of the ibLeaseStatusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbLeaseStatusReasonCode() {
        return ibLeaseStatusReasonCode;
    }

    /**
     * Sets the value of the ibLeaseStatusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbLeaseStatusReasonCode(String value) {
        this.ibLeaseStatusReasonCode = value;
    }

    /**
     * Gets the value of the tierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTierNumber() {
        return tierNumber;
    }

    /**
     * Sets the value of the tierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTierNumber(BigDecimal value) {
        this.tierNumber = value;
    }

}

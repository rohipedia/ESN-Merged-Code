
package com.sprint.integration.interfaces.validateloststolendevice.v1.validateloststolendevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ValidateLostStolenDeviceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateLostStolenDeviceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lostStolenInd" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}ValidationResultTypeCodeType"/&gt;
 *         &lt;element name="giveBackStatus" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}GiveBackStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="giveBackDate" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}ActivityDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="lockedInd" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}LockedFlagType" minOccurs="0"/&gt;
 *         &lt;element name="appleCheckFailedInd" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}StatusFlagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateLostStolenDeviceResponseType", propOrder = {
    "lostStolenInd",
    "giveBackStatus",
    "giveBackDate",
    "lockedInd",
    "appleCheckFailedInd"
})
public class ValidateLostStolenDeviceResponseType {

    protected boolean lostStolenInd;
    protected String giveBackStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar giveBackDate;
    protected Boolean lockedInd;
    protected Boolean appleCheckFailedInd;

    /**
     * Gets the value of the lostStolenInd property.
     * 
     */
    public boolean isLostStolenInd() {
        return lostStolenInd;
    }

    /**
     * Sets the value of the lostStolenInd property.
     * 
     */
    public void setLostStolenInd(boolean value) {
        this.lostStolenInd = value;
    }

    /**
     * Gets the value of the giveBackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveBackStatus() {
        return giveBackStatus;
    }

    /**
     * Sets the value of the giveBackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveBackStatus(String value) {
        this.giveBackStatus = value;
    }

    /**
     * Gets the value of the giveBackDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGiveBackDate() {
        return giveBackDate;
    }

    /**
     * Sets the value of the giveBackDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGiveBackDate(XMLGregorianCalendar value) {
        this.giveBackDate = value;
    }

    /**
     * Gets the value of the lockedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockedInd() {
        return lockedInd;
    }

    /**
     * Sets the value of the lockedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockedInd(Boolean value) {
        this.lockedInd = value;
    }

    /**
     * Gets the value of the appleCheckFailedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppleCheckFailedInd() {
        return appleCheckFailedInd;
    }

    /**
     * Sets the value of the appleCheckFailedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppleCheckFailedInd(Boolean value) {
        this.appleCheckFailedInd = value;
    }

}

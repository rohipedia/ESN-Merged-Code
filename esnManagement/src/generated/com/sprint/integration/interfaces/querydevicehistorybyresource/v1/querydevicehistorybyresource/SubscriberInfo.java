
package com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriberInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ban" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}BillingAccountNumberEns"/&gt;
 *         &lt;element name="subscriberId" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}SubscriptionIdentifier"/&gt;
 *         &lt;element name="imsi" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}InternationalMobileSubscriberIdentityString" minOccurs="0"/&gt;
 *         &lt;element name="additionalImsi" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}InternationalMobileSubscriberIdentityString" minOccurs="0"/&gt;
 *         &lt;element name="resourceEffectiveDate" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}EffectiveFromDate"/&gt;
 *         &lt;element name="resourceExpirationDate" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}EffectiveThruDate" minOccurs="0"/&gt;
 *         &lt;element name="deviceList" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}DeviceList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberInfo", propOrder = {
    "ban",
    "subscriberId",
    "imsi",
    "additionalImsi",
    "resourceEffectiveDate",
    "resourceExpirationDate",
    "deviceList"
})
public class SubscriberInfo {

    protected int ban;
    @XmlElement(required = true)
    protected String subscriberId;
    protected String imsi;
    protected String additionalImsi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar resourceEffectiveDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar resourceExpirationDate;
    protected DeviceList deviceList;

    /**
     * Gets the value of the ban property.
     * 
     */
    public int getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     */
    public void setBan(int value) {
        this.ban = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the additionalImsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalImsi() {
        return additionalImsi;
    }

    /**
     * Sets the value of the additionalImsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalImsi(String value) {
        this.additionalImsi = value;
    }

    /**
     * Gets the value of the resourceEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResourceEffectiveDate() {
        return resourceEffectiveDate;
    }

    /**
     * Sets the value of the resourceEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResourceEffectiveDate(XMLGregorianCalendar value) {
        this.resourceEffectiveDate = value;
    }

    /**
     * Gets the value of the resourceExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResourceExpirationDate() {
        return resourceExpirationDate;
    }

    /**
     * Sets the value of the resourceExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResourceExpirationDate(XMLGregorianCalendar value) {
        this.resourceExpirationDate = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceList }
     *     
     */
    public DeviceList getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceList }
     *     
     */
    public void setDeviceList(DeviceList value) {
        this.deviceList = value;
    }

}

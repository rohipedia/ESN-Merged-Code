
package com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceType" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}ResourceDeviceTypeCode"/&gt;
 *         &lt;element name="serialNumber" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}SubscriberDeviceSerialNumber"/&gt;
 *         &lt;element name="esnHex" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}ElectronicSerialNumberHex" minOccurs="0"/&gt;
 *         &lt;element name="deviceEffectiveDate" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}EffectiveFromDate"/&gt;
 *         &lt;element name="deviceExpirationDate" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}EffectiveThruDate" minOccurs="0"/&gt;
 *         &lt;element name="associationEffectiveDate" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}EffectiveFromDate"/&gt;
 *         &lt;element name="associationExpirationDate" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}EffectiveThruDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfo", propOrder = {
    "deviceType",
    "serialNumber",
    "esnHex",
    "deviceEffectiveDate",
    "deviceExpirationDate",
    "associationEffectiveDate",
    "associationExpirationDate"
})
public class DeviceInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResourceDeviceTypeCode deviceType;
    @XmlElement(required = true)
    protected String serialNumber;
    protected String esnHex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deviceEffectiveDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deviceExpirationDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar associationEffectiveDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar associationExpirationDate;

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDeviceTypeCode }
     *     
     */
    public ResourceDeviceTypeCode getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDeviceTypeCode }
     *     
     */
    public void setDeviceType(ResourceDeviceTypeCode value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the esnHex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsnHex() {
        return esnHex;
    }

    /**
     * Sets the value of the esnHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsnHex(String value) {
        this.esnHex = value;
    }

    /**
     * Gets the value of the deviceEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceEffectiveDate() {
        return deviceEffectiveDate;
    }

    /**
     * Sets the value of the deviceEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceEffectiveDate(XMLGregorianCalendar value) {
        this.deviceEffectiveDate = value;
    }

    /**
     * Gets the value of the deviceExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceExpirationDate() {
        return deviceExpirationDate;
    }

    /**
     * Sets the value of the deviceExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceExpirationDate(XMLGregorianCalendar value) {
        this.deviceExpirationDate = value;
    }

    /**
     * Gets the value of the associationEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssociationEffectiveDate() {
        return associationEffectiveDate;
    }

    /**
     * Sets the value of the associationEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssociationEffectiveDate(XMLGregorianCalendar value) {
        this.associationEffectiveDate = value;
    }

    /**
     * Gets the value of the associationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssociationExpirationDate() {
        return associationExpirationDate;
    }

    /**
     * Sets the value of the associationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssociationExpirationDate(XMLGregorianCalendar value) {
        this.associationExpirationDate = value;
    }

}

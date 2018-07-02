
package com.sprint.integration.interfaces.querydevicecapabilities.v2.querydevicecapabilitiesv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryDeviceCapabilitiesV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceCapabilitiesV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}UserIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="cutOffDate" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}EffectiveThruDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="pageNumber" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}PageNumberType"/&gt;
 *         &lt;element name="capabilityId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ProductCharacteristicIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ProductIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="capabilityTypeId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}CapabilityTypeIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="deviceInfo" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}DeviceInfoType"/&gt;
 *         &lt;element name="devicetype" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}DeviceSerialNumberCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceCapabilitiesV2Type", propOrder = {
    "userId",
    "cutOffDate",
    "pageNumber",
    "capabilityId",
    "productId",
    "capabilityTypeId",
    "deviceInfo",
    "devicetype"
})
public class QueryDeviceCapabilitiesV2Type {

    protected String userId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cutOffDate;
    @XmlElement(required = true)
    protected String pageNumber;
    protected String capabilityId;
    protected String productId;
    protected String capabilityTypeId;
    @XmlElement(required = true)
    protected DeviceInfoType deviceInfo;
    @XmlSchemaType(name = "string")
    protected DeviceSerialNumberCodeType devicetype;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the cutOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutOffDate() {
        return cutOffDate;
    }

    /**
     * Sets the value of the cutOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutOffDate(XMLGregorianCalendar value) {
        this.cutOffDate = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the capabilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityId() {
        return capabilityId;
    }

    /**
     * Sets the value of the capabilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityId(String value) {
        this.capabilityId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the capabilityTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityTypeId() {
        return capabilityTypeId;
    }

    /**
     * Sets the value of the capabilityTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityTypeId(String value) {
        this.capabilityTypeId = value;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInfoType }
     *     
     */
    public DeviceInfoType getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInfoType }
     *     
     */
    public void setDeviceInfo(DeviceInfoType value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the devicetype property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSerialNumberCodeType }
     *     
     */
    public DeviceSerialNumberCodeType getDevicetype() {
        return devicetype;
    }

    /**
     * Sets the value of the devicetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSerialNumberCodeType }
     *     
     */
    public void setDevicetype(DeviceSerialNumberCodeType value) {
        this.devicetype = value;
    }

}

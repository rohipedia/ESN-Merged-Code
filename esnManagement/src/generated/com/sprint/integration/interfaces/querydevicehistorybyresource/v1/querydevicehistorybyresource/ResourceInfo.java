
package com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resourceNumber" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}ResourceDeviceSerialNumber"/&gt;
 *         &lt;element name="deviceType" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}ResourceDeviceTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceInfo", propOrder = {
    "resourceNumber",
    "deviceType"
})
public class ResourceInfo {

    @XmlElement(required = true)
    protected String resourceNumber;
    @XmlSchemaType(name = "string")
    protected ResourceDeviceTypeCode deviceType;

    /**
     * Gets the value of the resourceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceNumber() {
        return resourceNumber;
    }

    /**
     * Sets the value of the resourceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceNumber(String value) {
        this.resourceNumber = value;
    }

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

}

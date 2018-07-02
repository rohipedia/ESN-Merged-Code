
package com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceCapabilityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceCapabilityInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capabilityName" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}CapabilityTypeNameType"/&gt;
 *         &lt;element name="capabilityCode" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}CapabilityTypeIdentifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCapabilityInfoType", propOrder = {
    "capabilityName",
    "capabilityCode"
})
public class DeviceCapabilityInfoType {

    @XmlElement(required = true)
    protected String capabilityName;
    @XmlElement(required = true)
    protected String capabilityCode;

    /**
     * Gets the value of the capabilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityName() {
        return capabilityName;
    }

    /**
     * Sets the value of the capabilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityName(String value) {
        this.capabilityName = value;
    }

    /**
     * Gets the value of the capabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityCode() {
        return capabilityCode;
    }

    /**
     * Sets the value of the capabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityCode(String value) {
        this.capabilityCode = value;
    }

}

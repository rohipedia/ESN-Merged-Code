
package com.sprint.integration.interfaces.querydevicecapabilities.v2.querydevicecapabilitiesv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceCharacteristicsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="manufacturerShortName" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ModelNameType"/&gt;
 *         &lt;element name="modelNumber" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ModelNumberType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCharacteristicsType", propOrder = {
    "manufacturerShortName",
    "modelNumber"
})
public class DeviceCharacteristicsType {

    @XmlElement(required = true)
    protected String manufacturerShortName;
    @XmlElement(required = true)
    protected String modelNumber;

    /**
     * Gets the value of the manufacturerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerShortName() {
        return manufacturerShortName;
    }

    /**
     * Sets the value of the manufacturerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerShortName(String value) {
        this.manufacturerShortName = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

}


package com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceFrequencyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceFrequencyInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frequencyValue" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}UnitOfMeasureValueType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceFrequencyInfoType", propOrder = {
    "frequencyValue"
})
public class DeviceFrequencyInfoType {

    @XmlElement(required = true)
    protected String frequencyValue;

    /**
     * Gets the value of the frequencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyValue() {
        return frequencyValue;
    }

    /**
     * Sets the value of the frequencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyValue(String value) {
        this.frequencyValue = value;
    }

}

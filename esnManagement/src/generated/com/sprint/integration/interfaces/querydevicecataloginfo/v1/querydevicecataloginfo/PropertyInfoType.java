
package com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="propertyName" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}ParameterTypeCodeType"/&gt;
 *         &lt;element name="propertyValue" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}ParameterValueType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyInfoType", propOrder = {
    "propertyName",
    "propertyValue"
})
public class PropertyInfoType {

    @XmlElement(required = true)
    protected String propertyName;
    @XmlElement(required = true)
    protected String propertyValue;

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the propertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * Sets the value of the propertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyValue(String value) {
        this.propertyValue = value;
    }

}

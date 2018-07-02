
package com.sprint.integration.interfaces.querydeviceresourceinfo.v2.querydeviceresourceinfov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UiccInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UiccInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pin1" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}PersonalIdentificationNumberType" minOccurs="0"/&gt;
 *         &lt;element name="puc1" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}PhoneLockCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UiccInfoType", propOrder = {
    "pin1",
    "puc1"
})
public class UiccInfoType {

    protected String pin1;
    protected String puc1;

    /**
     * Gets the value of the pin1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin1() {
        return pin1;
    }

    /**
     * Sets the value of the pin1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin1(String value) {
        this.pin1 = value;
    }

    /**
     * Gets the value of the puc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuc1() {
        return puc1;
    }

    /**
     * Sets the value of the puc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuc1(String value) {
        this.puc1 = value;
    }

}

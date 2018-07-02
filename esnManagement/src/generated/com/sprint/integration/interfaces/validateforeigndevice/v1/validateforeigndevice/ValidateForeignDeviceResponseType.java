
package com.sprint.integration.interfaces.validateforeigndevice.v1.validateforeigndevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateForeignDeviceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateForeignDeviceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esnMeidHex" type="{http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd}DeviceSerialNumberHexType" minOccurs="0"/&gt;
 *         &lt;element name="esnMeidDec" type="{http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd}DeviceSerialNumberDecType" minOccurs="0"/&gt;
 *         &lt;element name="availableReasonCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="availableReasonDescription" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateForeignDeviceResponseType", propOrder = {
    "esnMeidHex",
    "esnMeidDec",
    "availableReasonCode",
    "availableReasonDescription"
})
public class ValidateForeignDeviceResponseType {

    protected String esnMeidHex;
    protected String esnMeidDec;
    @XmlElement(required = true)
    protected Object availableReasonCode;
    @XmlElement(required = true)
    protected Object availableReasonDescription;

    /**
     * Gets the value of the esnMeidHex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsnMeidHex() {
        return esnMeidHex;
    }

    /**
     * Sets the value of the esnMeidHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsnMeidHex(String value) {
        this.esnMeidHex = value;
    }

    /**
     * Gets the value of the esnMeidDec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsnMeidDec() {
        return esnMeidDec;
    }

    /**
     * Sets the value of the esnMeidDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsnMeidDec(String value) {
        this.esnMeidDec = value;
    }

    /**
     * Gets the value of the availableReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAvailableReasonCode() {
        return availableReasonCode;
    }

    /**
     * Sets the value of the availableReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAvailableReasonCode(Object value) {
        this.availableReasonCode = value;
    }

    /**
     * Gets the value of the availableReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAvailableReasonDescription() {
        return availableReasonDescription;
    }

    /**
     * Sets the value of the availableReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAvailableReasonDescription(Object value) {
        this.availableReasonDescription = value;
    }

}


package com.sprint.integration.interfaces.validatedevice.v7.validatedevicev7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceDetailInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDetailInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="esnMeidHex" type="{http://integration.sprint.com/interfaces/validateDevice/v7/validateDeviceV7.xsd}DeviceSerialNumberHexType"/&gt;
 *         &lt;element name="esnMeidDec" type="{http://integration.sprint.com/interfaces/validateDevice/v7/validateDeviceV7.xsd}DeviceSerialNumberDecType"/&gt;
 *         &lt;element name="macId" type="{http://integration.sprint.com/interfaces/validateDevice/v7/validateDeviceV7.xsd}MediumAccessControlAddressType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDetailInfoType", propOrder = {
    "esnMeidHex",
    "esnMeidDec",
    "macId"
})
public class DeviceDetailInfoType {

    protected String esnMeidHex;
    protected String esnMeidDec;
    protected String macId;

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
     * Gets the value of the macId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacId() {
        return macId;
    }

    /**
     * Sets the value of the macId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacId(String value) {
        this.macId = value;
    }

}

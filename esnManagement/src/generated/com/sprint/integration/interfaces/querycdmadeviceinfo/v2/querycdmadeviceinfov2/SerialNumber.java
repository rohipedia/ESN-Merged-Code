
package com.sprint.integration.interfaces.querycdmadeviceinfo.v2.querycdmadeviceinfov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SerialNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerialNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="deviceSerialNumberDecimal" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceSerialNumberDec"/&gt;
 *         &lt;element name="deviceSerialNumberHex" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceSerialNumberHex"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialNumber", propOrder = {
    "deviceSerialNumberDecimal",
    "deviceSerialNumberHex"
})
public class SerialNumber {

    protected String deviceSerialNumberDecimal;
    protected String deviceSerialNumberHex;

    /**
     * Gets the value of the deviceSerialNumberDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNumberDecimal() {
        return deviceSerialNumberDecimal;
    }

    /**
     * Sets the value of the deviceSerialNumberDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNumberDecimal(String value) {
        this.deviceSerialNumberDecimal = value;
    }

    /**
     * Gets the value of the deviceSerialNumberHex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNumberHex() {
        return deviceSerialNumberHex;
    }

    /**
     * Sets the value of the deviceSerialNumberHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNumberHex(String value) {
        this.deviceSerialNumberHex = value;
    }

}

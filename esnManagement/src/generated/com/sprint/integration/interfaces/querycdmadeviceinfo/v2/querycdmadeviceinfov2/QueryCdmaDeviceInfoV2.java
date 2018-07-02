
package com.sprint.integration.interfaces.querycdmadeviceinfo.v2.querycdmadeviceinfov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCdmaDeviceInfoV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCdmaDeviceInfoV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userId" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceUserIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}SerialNumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCdmaDeviceInfoV2", propOrder = {
    "userId",
    "serialNumber"
})
public class QueryCdmaDeviceInfoV2 {

    protected String userId;
    @XmlElement(required = true)
    protected SerialNumber serialNumber;

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
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SerialNumber }
     *     
     */
    public SerialNumber getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialNumber }
     *     
     */
    public void setSerialNumber(SerialNumber value) {
        this.serialNumber = value;
    }

}

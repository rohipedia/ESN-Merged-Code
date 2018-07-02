
package com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceOrderHistoryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceOrderHistoryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceIdInfo" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}DeviceIdInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceOrderHistoryRequestType", propOrder = {
    "deviceIdInfo"
})
public class QueryDeviceOrderHistoryRequestType {

    @XmlElement(required = true)
    protected DeviceIdInfoType deviceIdInfo;

    /**
     * Gets the value of the deviceIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIdInfoType }
     *     
     */
    public DeviceIdInfoType getDeviceIdInfo() {
        return deviceIdInfo;
    }

    /**
     * Sets the value of the deviceIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIdInfoType }
     *     
     */
    public void setDeviceIdInfo(DeviceIdInfoType value) {
        this.deviceIdInfo = value;
    }

}

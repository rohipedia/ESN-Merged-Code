
package com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceOrderHistoryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceOrderHistoryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceOrderHistoryInfo" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}DeviceOrderHistoryInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceOrderHistoryResponseType", propOrder = {
    "deviceOrderHistoryInfo"
})
public class QueryDeviceOrderHistoryResponseType {

    @XmlElement(required = true)
    protected DeviceOrderHistoryInfoType deviceOrderHistoryInfo;

    /**
     * Gets the value of the deviceOrderHistoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceOrderHistoryInfoType }
     *     
     */
    public DeviceOrderHistoryInfoType getDeviceOrderHistoryInfo() {
        return deviceOrderHistoryInfo;
    }

    /**
     * Sets the value of the deviceOrderHistoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceOrderHistoryInfoType }
     *     
     */
    public void setDeviceOrderHistoryInfo(DeviceOrderHistoryInfoType value) {
        this.deviceOrderHistoryInfo = value;
    }

}

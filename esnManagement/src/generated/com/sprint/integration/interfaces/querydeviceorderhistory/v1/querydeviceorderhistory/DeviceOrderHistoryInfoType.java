
package com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceOrderHistoryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceOrderHistoryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceId" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}DeviceSerialNumberType"/&gt;
 *         &lt;element name="deviceIdTypeCode" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}DeviceSerialNumberTypeCodeType"/&gt;
 *         &lt;element name="activityInfoList" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}ActivityInfoListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceOrderHistoryInfoType", propOrder = {
    "deviceId",
    "deviceIdTypeCode",
    "activityInfoList"
})
public class DeviceOrderHistoryInfoType {

    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected String deviceIdTypeCode;
    protected ActivityInfoListType activityInfoList;

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the deviceIdTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceIdTypeCode() {
        return deviceIdTypeCode;
    }

    /**
     * Sets the value of the deviceIdTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceIdTypeCode(String value) {
        this.deviceIdTypeCode = value;
    }

    /**
     * Gets the value of the activityInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInfoListType }
     *     
     */
    public ActivityInfoListType getActivityInfoList() {
        return activityInfoList;
    }

    /**
     * Sets the value of the activityInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInfoListType }
     *     
     */
    public void setActivityInfoList(ActivityInfoListType value) {
        this.activityInfoList = value;
    }

}

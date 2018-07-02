
package com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateGiveBackDeviceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateGiveBackDeviceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceInfo" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}DeviceInfoType"/&gt;
 *         &lt;element name="subscriberInfo" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}SubscriberInfoType"/&gt;
 *         &lt;element name="ibLeaseInfo" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}LeaseInfoType" minOccurs="0"/&gt;
 *         &lt;element name="orderType" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}OrderTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateGiveBackDeviceRequestType", propOrder = {
    "deviceInfo",
    "subscriberInfo",
    "ibLeaseInfo",
    "orderType"
})
public class ValidateGiveBackDeviceRequestType {

    @XmlElement(required = true)
    protected DeviceInfoType deviceInfo;
    @XmlElement(required = true)
    protected SubscriberInfoType subscriberInfo;
    protected LeaseInfoType ibLeaseInfo;
    protected String orderType;

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInfoType }
     *     
     */
    public DeviceInfoType getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInfoType }
     *     
     */
    public void setDeviceInfo(DeviceInfoType value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the subscriberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberInfoType }
     *     
     */
    public SubscriberInfoType getSubscriberInfo() {
        return subscriberInfo;
    }

    /**
     * Sets the value of the subscriberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberInfoType }
     *     
     */
    public void setSubscriberInfo(SubscriberInfoType value) {
        this.subscriberInfo = value;
    }

    /**
     * Gets the value of the ibLeaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseInfoType }
     *     
     */
    public LeaseInfoType getIbLeaseInfo() {
        return ibLeaseInfo;
    }

    /**
     * Sets the value of the ibLeaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseInfoType }
     *     
     */
    public void setIbLeaseInfo(LeaseInfoType value) {
        this.ibLeaseInfo = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

}

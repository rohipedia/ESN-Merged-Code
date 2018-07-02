
package com.sprint.integration.interfaces.validatedevice.v8.validatedevicev8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateDeviceV8RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateDeviceV8RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userId" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceUserIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="deviceInfo" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceInfoType"/&gt;
 *         &lt;element name="accountId" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}AccountIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="brandCode" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}BrandCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateDeviceV8RequestType", propOrder = {
    "userId",
    "deviceInfo",
    "accountId",
    "brandCode"
})
public class ValidateDeviceV8RequestType {

    protected String userId;
    @XmlElement(required = true)
    protected DeviceInfoType deviceInfo;
    protected String accountId;
    protected String brandCode;

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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

}

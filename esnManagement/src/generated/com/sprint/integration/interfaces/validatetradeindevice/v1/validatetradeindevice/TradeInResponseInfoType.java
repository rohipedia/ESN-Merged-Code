
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeInResponseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeInResponseInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serialNumber" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}EquipmentSerialNumberStringType"/&gt;
 *         &lt;element name="deviceInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}DeviceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="tradeInEligibilityInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}TradeInEligibilityInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeInResponseInfoType", propOrder = {
    "serialNumber",
    "deviceInfo",
    "tradeInEligibilityInfo"
})
public class TradeInResponseInfoType {

    @XmlElement(required = true)
    protected String serialNumber;
    protected DeviceInfoType deviceInfo;
    @XmlElement(required = true)
    protected TradeInEligibilityInfoType tradeInEligibilityInfo;

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
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
     * Gets the value of the tradeInEligibilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeInEligibilityInfoType }
     *     
     */
    public TradeInEligibilityInfoType getTradeInEligibilityInfo() {
        return tradeInEligibilityInfo;
    }

    /**
     * Sets the value of the tradeInEligibilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInEligibilityInfoType }
     *     
     */
    public void setTradeInEligibilityInfo(TradeInEligibilityInfoType value) {
        this.tradeInEligibilityInfo = value;
    }

}

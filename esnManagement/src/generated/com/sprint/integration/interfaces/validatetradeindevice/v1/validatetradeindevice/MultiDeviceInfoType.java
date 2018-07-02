
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiDeviceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiDeviceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serialNumber" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}EquipmentSerialNumberStringType"/&gt;
 *         &lt;element name="tradeInInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}TradeInInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDeviceInfoType", propOrder = {
    "serialNumber",
    "tradeInInfo"
})
public class MultiDeviceInfoType {

    @XmlElement(required = true)
    protected String serialNumber;
    protected TradeInInfoType tradeInInfo;

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
     * Gets the value of the tradeInInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeInInfoType }
     *     
     */
    public TradeInInfoType getTradeInInfo() {
        return tradeInInfo;
    }

    /**
     * Sets the value of the tradeInInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInInfoType }
     *     
     */
    public void setTradeInInfo(TradeInInfoType value) {
        this.tradeInInfo = value;
    }

}

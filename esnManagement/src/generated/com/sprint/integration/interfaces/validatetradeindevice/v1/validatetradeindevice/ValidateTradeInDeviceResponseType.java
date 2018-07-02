
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateTradeInDeviceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateTradeInDeviceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInResponseList" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}TradeInResponseListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateTradeInDeviceResponseType", propOrder = {
    "tradeInResponseList"
})
public class ValidateTradeInDeviceResponseType {

    @XmlElement(required = true)
    protected TradeInResponseListType tradeInResponseList;

    /**
     * Gets the value of the tradeInResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link TradeInResponseListType }
     *     
     */
    public TradeInResponseListType getTradeInResponseList() {
        return tradeInResponseList;
    }

    /**
     * Sets the value of the tradeInResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInResponseListType }
     *     
     */
    public void setTradeInResponseList(TradeInResponseListType value) {
        this.tradeInResponseList = value;
    }

}

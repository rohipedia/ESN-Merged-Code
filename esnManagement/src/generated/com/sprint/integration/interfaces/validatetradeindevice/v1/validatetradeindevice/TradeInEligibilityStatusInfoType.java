
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeInEligibilityStatusInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeInEligibilityStatusInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInValidationCheck" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ValidationRuleSetIdentifierType"/&gt;
 *         &lt;element name="tradeInValidationCheckInd" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ValidationSuccessFlagType"/&gt;
 *         &lt;element name="tradeInValidationMessage" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}MessageTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeInEligibilityStatusInfoType", propOrder = {
    "tradeInValidationCheck",
    "tradeInValidationCheckInd",
    "tradeInValidationMessage"
})
public class TradeInEligibilityStatusInfoType {

    @XmlElement(required = true)
    protected String tradeInValidationCheck;
    protected boolean tradeInValidationCheckInd;
    protected String tradeInValidationMessage;

    /**
     * Gets the value of the tradeInValidationCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInValidationCheck() {
        return tradeInValidationCheck;
    }

    /**
     * Sets the value of the tradeInValidationCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInValidationCheck(String value) {
        this.tradeInValidationCheck = value;
    }

    /**
     * Gets the value of the tradeInValidationCheckInd property.
     * 
     */
    public boolean isTradeInValidationCheckInd() {
        return tradeInValidationCheckInd;
    }

    /**
     * Sets the value of the tradeInValidationCheckInd property.
     * 
     */
    public void setTradeInValidationCheckInd(boolean value) {
        this.tradeInValidationCheckInd = value;
    }

    /**
     * Gets the value of the tradeInValidationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInValidationMessage() {
        return tradeInValidationMessage;
    }

    /**
     * Sets the value of the tradeInValidationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInValidationMessage(String value) {
        this.tradeInValidationMessage = value;
    }

}

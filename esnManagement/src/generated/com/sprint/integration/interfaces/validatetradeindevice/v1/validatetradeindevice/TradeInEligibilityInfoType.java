
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeInEligibilityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeInEligibilityInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInEligibilityInd" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}EligibilityFlagType"/&gt;
 *         &lt;element name="tradeInEligibilityStatusList" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}TradeInEligibilityStatusListType"/&gt;
 *         &lt;element name="bestOfferGroupCode" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}OfferGroupCodeType" minOccurs="0"/&gt;
 *         &lt;element name="bestOfferItemId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}EquipmentItemIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="equipmentLineId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}LineItemIdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeInEligibilityInfoType", propOrder = {
    "tradeInEligibilityInd",
    "tradeInEligibilityStatusList",
    "bestOfferGroupCode",
    "bestOfferItemId",
    "equipmentLineId"
})
public class TradeInEligibilityInfoType {

    protected boolean tradeInEligibilityInd;
    @XmlElement(required = true)
    protected TradeInEligibilityStatusListType tradeInEligibilityStatusList;
    protected String bestOfferGroupCode;
    protected String bestOfferItemId;
    @XmlSchemaType(name = "integer")
    protected Integer equipmentLineId;

    /**
     * Gets the value of the tradeInEligibilityInd property.
     * 
     */
    public boolean isTradeInEligibilityInd() {
        return tradeInEligibilityInd;
    }

    /**
     * Sets the value of the tradeInEligibilityInd property.
     * 
     */
    public void setTradeInEligibilityInd(boolean value) {
        this.tradeInEligibilityInd = value;
    }

    /**
     * Gets the value of the tradeInEligibilityStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link TradeInEligibilityStatusListType }
     *     
     */
    public TradeInEligibilityStatusListType getTradeInEligibilityStatusList() {
        return tradeInEligibilityStatusList;
    }

    /**
     * Sets the value of the tradeInEligibilityStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInEligibilityStatusListType }
     *     
     */
    public void setTradeInEligibilityStatusList(TradeInEligibilityStatusListType value) {
        this.tradeInEligibilityStatusList = value;
    }

    /**
     * Gets the value of the bestOfferGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestOfferGroupCode() {
        return bestOfferGroupCode;
    }

    /**
     * Sets the value of the bestOfferGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestOfferGroupCode(String value) {
        this.bestOfferGroupCode = value;
    }

    /**
     * Gets the value of the bestOfferItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestOfferItemId() {
        return bestOfferItemId;
    }

    /**
     * Sets the value of the bestOfferItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestOfferItemId(String value) {
        this.bestOfferItemId = value;
    }

    /**
     * Gets the value of the equipmentLineId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEquipmentLineId() {
        return equipmentLineId;
    }

    /**
     * Sets the value of the equipmentLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEquipmentLineId(Integer value) {
        this.equipmentLineId = value;
    }

}


package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeInInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeInInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buybackProductId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ProductIdentifierType"/&gt;
 *         &lt;element name="conditionAnswerList" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ConditionAnswerListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeInInfoType", propOrder = {
    "buybackProductId",
    "conditionAnswerList"
})
public class TradeInInfoType {

    @XmlElement(required = true)
    protected String buybackProductId;
    @XmlElement(required = true)
    protected ConditionAnswerListType conditionAnswerList;

    /**
     * Gets the value of the buybackProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackProductId() {
        return buybackProductId;
    }

    /**
     * Sets the value of the buybackProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackProductId(String value) {
        this.buybackProductId = value;
    }

    /**
     * Gets the value of the conditionAnswerList property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionAnswerListType }
     *     
     */
    public ConditionAnswerListType getConditionAnswerList() {
        return conditionAnswerList;
    }

    /**
     * Sets the value of the conditionAnswerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionAnswerListType }
     *     
     */
    public void setConditionAnswerList(ConditionAnswerListType value) {
        this.conditionAnswerList = value;
    }

}

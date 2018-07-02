
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeInItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeInItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInLineItemNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tradeInSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tradeInItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeInProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tradeInPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tradeInPromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeInConditionAnswerList" type="{java:com.spcs.retailservices.domain}TradeInConditionAnswerList"/&gt;
 *         &lt;element name="tradeInCorrespondingItemNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeInItemInfo", propOrder = {
    "tradeInLineItemNo",
    "tradeInSerialNumber",
    "tradeInItemId",
    "tradeInProductId",
    "tradeInPrice",
    "tradeInPromoCode",
    "tradeInConditionAnswerList",
    "tradeInCorrespondingItemNo"
})
public class TradeInItemInfo {

    protected int tradeInLineItemNo;
    @XmlElement(required = true)
    protected String tradeInSerialNumber;
    protected String tradeInItemId;
    @XmlElement(required = true)
    protected String tradeInProductId;
    protected double tradeInPrice;
    protected String tradeInPromoCode;
    @XmlElement(required = true)
    protected TradeInConditionAnswerList tradeInConditionAnswerList;
    protected int tradeInCorrespondingItemNo;

    /**
     * Gets the value of the tradeInLineItemNo property.
     * 
     */
    public int getTradeInLineItemNo() {
        return tradeInLineItemNo;
    }

    /**
     * Sets the value of the tradeInLineItemNo property.
     * 
     */
    public void setTradeInLineItemNo(int value) {
        this.tradeInLineItemNo = value;
    }

    /**
     * Gets the value of the tradeInSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInSerialNumber() {
        return tradeInSerialNumber;
    }

    /**
     * Sets the value of the tradeInSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInSerialNumber(String value) {
        this.tradeInSerialNumber = value;
    }

    /**
     * Gets the value of the tradeInItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInItemId() {
        return tradeInItemId;
    }

    /**
     * Sets the value of the tradeInItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInItemId(String value) {
        this.tradeInItemId = value;
    }

    /**
     * Gets the value of the tradeInProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInProductId() {
        return tradeInProductId;
    }

    /**
     * Sets the value of the tradeInProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInProductId(String value) {
        this.tradeInProductId = value;
    }

    /**
     * Gets the value of the tradeInPrice property.
     * 
     */
    public double getTradeInPrice() {
        return tradeInPrice;
    }

    /**
     * Sets the value of the tradeInPrice property.
     * 
     */
    public void setTradeInPrice(double value) {
        this.tradeInPrice = value;
    }

    /**
     * Gets the value of the tradeInPromoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInPromoCode() {
        return tradeInPromoCode;
    }

    /**
     * Sets the value of the tradeInPromoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInPromoCode(String value) {
        this.tradeInPromoCode = value;
    }

    /**
     * Gets the value of the tradeInConditionAnswerList property.
     * 
     * @return
     *     possible object is
     *     {@link TradeInConditionAnswerList }
     *     
     */
    public TradeInConditionAnswerList getTradeInConditionAnswerList() {
        return tradeInConditionAnswerList;
    }

    /**
     * Sets the value of the tradeInConditionAnswerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInConditionAnswerList }
     *     
     */
    public void setTradeInConditionAnswerList(TradeInConditionAnswerList value) {
        this.tradeInConditionAnswerList = value;
    }

    /**
     * Gets the value of the tradeInCorrespondingItemNo property.
     * 
     */
    public int getTradeInCorrespondingItemNo() {
        return tradeInCorrespondingItemNo;
    }

    /**
     * Sets the value of the tradeInCorrespondingItemNo property.
     * 
     */
    public void setTradeInCorrespondingItemNo(int value) {
        this.tradeInCorrespondingItemNo = value;
    }

}

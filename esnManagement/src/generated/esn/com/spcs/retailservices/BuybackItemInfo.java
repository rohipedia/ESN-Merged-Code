
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuybackItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuybackItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BackendSystemProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConditionAnswerList" type="{java:com.spcs.retailservices.domain}ConditionAnswerList"/&gt;
 *         &lt;element name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceDetailInfo" type="{java:com.spcs.retailservices.domain}PriceDetailInfo"/&gt;
 *         &lt;element name="TrackingSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BuybackESN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="omimReturnReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuybackItemInfo", propOrder = {
    "lineItemNumber",
    "backendSystemProductId",
    "conditionAnswerList",
    "promotionCode",
    "priceDetailInfo",
    "trackingSKU",
    "buybackESN",
    "omimReturnReasonCode"
})
public class BuybackItemInfo {

    @XmlElement(name = "LineItemNumber")
    protected int lineItemNumber;
    @XmlElement(name = "BackendSystemProductId", required = true)
    protected String backendSystemProductId;
    @XmlElement(name = "ConditionAnswerList", required = true)
    protected ConditionAnswerList conditionAnswerList;
    @XmlElement(name = "PromotionCode")
    protected String promotionCode;
    @XmlElement(name = "PriceDetailInfo", required = true)
    protected PriceDetailInfo priceDetailInfo;
    @XmlElement(name = "TrackingSKU", required = true)
    protected String trackingSKU;
    @XmlElement(name = "BuybackESN", required = true)
    protected String buybackESN;
    protected String omimReturnReasonCode;

    /**
     * Gets the value of the lineItemNumber property.
     * 
     */
    public int getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     */
    public void setLineItemNumber(int value) {
        this.lineItemNumber = value;
    }

    /**
     * Gets the value of the backendSystemProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackendSystemProductId() {
        return backendSystemProductId;
    }

    /**
     * Sets the value of the backendSystemProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackendSystemProductId(String value) {
        this.backendSystemProductId = value;
    }

    /**
     * Gets the value of the conditionAnswerList property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionAnswerList }
     *     
     */
    public ConditionAnswerList getConditionAnswerList() {
        return conditionAnswerList;
    }

    /**
     * Sets the value of the conditionAnswerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionAnswerList }
     *     
     */
    public void setConditionAnswerList(ConditionAnswerList value) {
        this.conditionAnswerList = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the priceDetailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetailInfo }
     *     
     */
    public PriceDetailInfo getPriceDetailInfo() {
        return priceDetailInfo;
    }

    /**
     * Sets the value of the priceDetailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetailInfo }
     *     
     */
    public void setPriceDetailInfo(PriceDetailInfo value) {
        this.priceDetailInfo = value;
    }

    /**
     * Gets the value of the trackingSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingSKU() {
        return trackingSKU;
    }

    /**
     * Sets the value of the trackingSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingSKU(String value) {
        this.trackingSKU = value;
    }

    /**
     * Gets the value of the buybackESN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackESN() {
        return buybackESN;
    }

    /**
     * Sets the value of the buybackESN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackESN(String value) {
        this.buybackESN = value;
    }

    /**
     * Gets the value of the omimReturnReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmimReturnReasonCode() {
        return omimReturnReasonCode;
    }

    /**
     * Sets the value of the omimReturnReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmimReturnReasonCode(String value) {
        this.omimReturnReasonCode = value;
    }

}

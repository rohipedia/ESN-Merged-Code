
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTradeInItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTradeInItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeInSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeInItemIdentifer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tradeInPromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTradeInItemInfo", propOrder = {
    "tradeInReferenceNumber",
    "tradeInSerialNumber",
    "tradeInItemIdentifer",
    "tradeInPromotionCode"
})
public class UpdateTradeInItemInfo {

    protected String tradeInReferenceNumber;
    protected String tradeInSerialNumber;
    @XmlElement(required = true)
    protected String tradeInItemIdentifer;
    protected String tradeInPromotionCode;

    /**
     * Gets the value of the tradeInReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInReferenceNumber() {
        return tradeInReferenceNumber;
    }

    /**
     * Sets the value of the tradeInReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInReferenceNumber(String value) {
        this.tradeInReferenceNumber = value;
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
     * Gets the value of the tradeInItemIdentifer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInItemIdentifer() {
        return tradeInItemIdentifer;
    }

    /**
     * Sets the value of the tradeInItemIdentifer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInItemIdentifer(String value) {
        this.tradeInItemIdentifer = value;
    }

    /**
     * Gets the value of the tradeInPromotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInPromotionCode() {
        return tradeInPromotionCode;
    }

    /**
     * Sets the value of the tradeInPromotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInPromotionCode(String value) {
        this.tradeInPromotionCode = value;
    }

}

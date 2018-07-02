
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeInInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeInInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeInSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeInInfo", propOrder = {
    "tradeInSerialNum",
    "tradeInSku"
})
public class TradeInInfo {

    protected String tradeInSerialNum;
    protected String tradeInSku;

    /**
     * Gets the value of the tradeInSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInSerialNum() {
        return tradeInSerialNum;
    }

    /**
     * Sets the value of the tradeInSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInSerialNum(String value) {
        this.tradeInSerialNum = value;
    }

    /**
     * Gets the value of the tradeInSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInSku() {
        return tradeInSku;
    }

    /**
     * Sets the value of the tradeInSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInSku(String value) {
        this.tradeInSku = value;
    }

}

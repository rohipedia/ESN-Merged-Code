
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FutureDatedPaymentConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FutureDatedPaymentConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardEnding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FutureDatedPaymentConsentInfo", propOrder = {
    "cardEnding",
    "ban"
})
public class FutureDatedPaymentConsentInfo {

    @XmlElement(required = true)
    protected String cardEnding;
    protected int ban;

    /**
     * Gets the value of the cardEnding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEnding() {
        return cardEnding;
    }

    /**
     * Sets the value of the cardEnding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEnding(String value) {
        this.cardEnding = value;
    }

    /**
     * Gets the value of the ban property.
     * 
     */
    public int getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     */
    public void setBan(int value) {
        this.ban = value;
    }

}

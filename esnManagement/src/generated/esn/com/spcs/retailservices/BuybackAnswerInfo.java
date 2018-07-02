
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuybackAnswerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuybackAnswerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buybackAnswerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuybackAnswerInfo", propOrder = {
    "buybackAnswerId"
})
public class BuybackAnswerInfo {

    @XmlElement(required = true)
    protected String buybackAnswerId;

    /**
     * Gets the value of the buybackAnswerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackAnswerId() {
        return buybackAnswerId;
    }

    /**
     * Sets the value of the buybackAnswerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackAnswerId(String value) {
        this.buybackAnswerId = value;
    }

}

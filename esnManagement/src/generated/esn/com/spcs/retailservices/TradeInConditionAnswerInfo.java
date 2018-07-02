
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeInConditionAnswerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeInConditionAnswerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeInConditionAnswerInfo", propOrder = {
    "tradeInAnswer"
})
public class TradeInConditionAnswerInfo {

    @XmlElement(required = true)
    protected String tradeInAnswer;

    /**
     * Gets the value of the tradeInAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInAnswer() {
        return tradeInAnswer;
    }

    /**
     * Sets the value of the tradeInAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInAnswer(String value) {
        this.tradeInAnswer = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBogoInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBogoInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="discountIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bogoTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bogoOfferIdentfier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBogoInfo", propOrder = {
    "lineItemNumber",
    "discountIdentifier",
    "bogoTransactionIdentifier",
    "bogoOfferIdentfier"
})
public class UpdateBogoInfo {

    protected int lineItemNumber;
    protected Integer discountIdentifier;
    protected String bogoTransactionIdentifier;
    protected String bogoOfferIdentfier;

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
     * Gets the value of the discountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountIdentifier() {
        return discountIdentifier;
    }

    /**
     * Sets the value of the discountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountIdentifier(Integer value) {
        this.discountIdentifier = value;
    }

    /**
     * Gets the value of the bogoTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBogoTransactionIdentifier() {
        return bogoTransactionIdentifier;
    }

    /**
     * Sets the value of the bogoTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBogoTransactionIdentifier(String value) {
        this.bogoTransactionIdentifier = value;
    }

    /**
     * Gets the value of the bogoOfferIdentfier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBogoOfferIdentfier() {
        return bogoOfferIdentfier;
    }

    /**
     * Sets the value of the bogoOfferIdentfier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBogoOfferIdentfier(String value) {
        this.bogoOfferIdentfier = value;
    }

}

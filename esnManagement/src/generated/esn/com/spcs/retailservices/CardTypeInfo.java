
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardTypeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lengthOfCardNum1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lengthOfCardNum2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lengthOfCardNum3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lengthOfCvvNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="partialAuthIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTypeInfo", propOrder = {
    "cardTypeCode",
    "cardPrefix",
    "lengthOfCardNum1",
    "lengthOfCardNum2",
    "lengthOfCardNum3",
    "lengthOfCvvNumber",
    "partialAuthIndicator"
})
public class CardTypeInfo {

    @XmlElement(required = true)
    protected String cardTypeCode;
    @XmlElement(required = true)
    protected String cardPrefix;
    protected int lengthOfCardNum1;
    protected int lengthOfCardNum2;
    protected int lengthOfCardNum3;
    protected int lengthOfCvvNumber;
    @XmlElement(required = true)
    protected String partialAuthIndicator;

    /**
     * Gets the value of the cardTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * Sets the value of the cardTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeCode(String value) {
        this.cardTypeCode = value;
    }

    /**
     * Gets the value of the cardPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrefix() {
        return cardPrefix;
    }

    /**
     * Sets the value of the cardPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPrefix(String value) {
        this.cardPrefix = value;
    }

    /**
     * Gets the value of the lengthOfCardNum1 property.
     * 
     */
    public int getLengthOfCardNum1() {
        return lengthOfCardNum1;
    }

    /**
     * Sets the value of the lengthOfCardNum1 property.
     * 
     */
    public void setLengthOfCardNum1(int value) {
        this.lengthOfCardNum1 = value;
    }

    /**
     * Gets the value of the lengthOfCardNum2 property.
     * 
     */
    public int getLengthOfCardNum2() {
        return lengthOfCardNum2;
    }

    /**
     * Sets the value of the lengthOfCardNum2 property.
     * 
     */
    public void setLengthOfCardNum2(int value) {
        this.lengthOfCardNum2 = value;
    }

    /**
     * Gets the value of the lengthOfCardNum3 property.
     * 
     */
    public int getLengthOfCardNum3() {
        return lengthOfCardNum3;
    }

    /**
     * Sets the value of the lengthOfCardNum3 property.
     * 
     */
    public void setLengthOfCardNum3(int value) {
        this.lengthOfCardNum3 = value;
    }

    /**
     * Gets the value of the lengthOfCvvNumber property.
     * 
     */
    public int getLengthOfCvvNumber() {
        return lengthOfCvvNumber;
    }

    /**
     * Sets the value of the lengthOfCvvNumber property.
     * 
     */
    public void setLengthOfCvvNumber(int value) {
        this.lengthOfCvvNumber = value;
    }

    /**
     * Gets the value of the partialAuthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialAuthIndicator() {
        return partialAuthIndicator;
    }

    /**
     * Sets the value of the partialAuthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialAuthIndicator(String value) {
        this.partialAuthIndicator = value;
    }

}

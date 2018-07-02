
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardLast4Digits" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardNumberEncrypted" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardTrack1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardTrack2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardTrack3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Payload" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Base64Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardDetailsInfo", propOrder = {
    "amount",
    "cardType",
    "cardLast4Digits",
    "cardExpiryDate",
    "cardNumberEncrypted",
    "cardTrack1",
    "cardTrack2",
    "cardTrack3",
    "payload",
    "base64Signature"
})
public class CreditCardDetailsInfo {

    @XmlElement(name = "Amount")
    protected long amount;
    @XmlElement(name = "CardType", required = true)
    protected String cardType;
    @XmlElement(name = "CardLast4Digits", required = true)
    protected String cardLast4Digits;
    @XmlElement(name = "CardExpiryDate", required = true)
    protected String cardExpiryDate;
    @XmlElement(name = "CardNumberEncrypted", required = true)
    protected String cardNumberEncrypted;
    @XmlElementRef(name = "CardTrack1", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardTrack1;
    @XmlElementRef(name = "CardTrack2", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardTrack2;
    @XmlElementRef(name = "CardTrack3", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardTrack3;
    @XmlElementRef(name = "Payload", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payload;
    @XmlElementRef(name = "Base64Signature", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> base64Signature;

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardLast4Digits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLast4Digits() {
        return cardLast4Digits;
    }

    /**
     * Sets the value of the cardLast4Digits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLast4Digits(String value) {
        this.cardLast4Digits = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryDate(String value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the cardNumberEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumberEncrypted() {
        return cardNumberEncrypted;
    }

    /**
     * Sets the value of the cardNumberEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumberEncrypted(String value) {
        this.cardNumberEncrypted = value;
    }

    /**
     * Gets the value of the cardTrack1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardTrack1() {
        return cardTrack1;
    }

    /**
     * Sets the value of the cardTrack1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardTrack1(JAXBElement<String> value) {
        this.cardTrack1 = value;
    }

    /**
     * Gets the value of the cardTrack2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardTrack2() {
        return cardTrack2;
    }

    /**
     * Sets the value of the cardTrack2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardTrack2(JAXBElement<String> value) {
        this.cardTrack2 = value;
    }

    /**
     * Gets the value of the cardTrack3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardTrack3() {
        return cardTrack3;
    }

    /**
     * Sets the value of the cardTrack3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardTrack3(JAXBElement<String> value) {
        this.cardTrack3 = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayload(JAXBElement<String> value) {
        this.payload = value;
    }

    /**
     * Gets the value of the base64Signature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBase64Signature() {
        return base64Signature;
    }

    /**
     * Sets the value of the base64Signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBase64Signature(JAXBElement<String> value) {
        this.base64Signature = value;
    }

}

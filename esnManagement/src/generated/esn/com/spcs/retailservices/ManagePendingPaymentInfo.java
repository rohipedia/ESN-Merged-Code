
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagePendingPaymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagePendingPaymentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CreditCardDetailsList" type="{java:com.spcs.retailservices.domain}CreditCardDetailsList" minOccurs="0"/&gt;
 *           &lt;element name="GiftCardDetailsList" type="{java:com.spcs.retailservices.domain}GiftCardDetailsList" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagePendingPaymentInfo", propOrder = {
    "creditCardDetailsList",
    "giftCardDetailsList"
})
public class ManagePendingPaymentInfo {

    @XmlElementRef(name = "CreditCardDetailsList", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditCardDetailsList> creditCardDetailsList;
    @XmlElementRef(name = "GiftCardDetailsList", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<GiftCardDetailsList> giftCardDetailsList;

    /**
     * Gets the value of the creditCardDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditCardDetailsList }{@code >}
     *     
     */
    public JAXBElement<CreditCardDetailsList> getCreditCardDetailsList() {
        return creditCardDetailsList;
    }

    /**
     * Sets the value of the creditCardDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditCardDetailsList }{@code >}
     *     
     */
    public void setCreditCardDetailsList(JAXBElement<CreditCardDetailsList> value) {
        this.creditCardDetailsList = value;
    }

    /**
     * Gets the value of the giftCardDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GiftCardDetailsList }{@code >}
     *     
     */
    public JAXBElement<GiftCardDetailsList> getGiftCardDetailsList() {
        return giftCardDetailsList;
    }

    /**
     * Sets the value of the giftCardDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GiftCardDetailsList }{@code >}
     *     
     */
    public void setGiftCardDetailsList(JAXBElement<GiftCardDetailsList> value) {
        this.giftCardDetailsList = value;
    }

}

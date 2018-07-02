
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDiscountItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDiscountItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountLineItem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="discountIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="additionalDownpaymentDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="armOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDiscountItems", propOrder = {
    "discountLineItem",
    "discountIdentifier",
    "discountAmount",
    "discountRate",
    "additionalDownpaymentDiscountAmount",
    "armOverrideIndicator"
})
public class TransactionDiscountItems {

    protected int discountLineItem;
    protected int discountIdentifier;
    protected double discountAmount;
    protected Double discountRate;
    protected Double additionalDownpaymentDiscountAmount;
    protected String armOverrideIndicator;

    /**
     * Gets the value of the discountLineItem property.
     * 
     */
    public int getDiscountLineItem() {
        return discountLineItem;
    }

    /**
     * Sets the value of the discountLineItem property.
     * 
     */
    public void setDiscountLineItem(int value) {
        this.discountLineItem = value;
    }

    /**
     * Gets the value of the discountIdentifier property.
     * 
     */
    public int getDiscountIdentifier() {
        return discountIdentifier;
    }

    /**
     * Sets the value of the discountIdentifier property.
     * 
     */
    public void setDiscountIdentifier(int value) {
        this.discountIdentifier = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     */
    public double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     */
    public void setDiscountAmount(double value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountRate(Double value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the additionalDownpaymentDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalDownpaymentDiscountAmount() {
        return additionalDownpaymentDiscountAmount;
    }

    /**
     * Sets the value of the additionalDownpaymentDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalDownpaymentDiscountAmount(Double value) {
        this.additionalDownpaymentDiscountAmount = value;
    }

    /**
     * Gets the value of the armOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmOverrideIndicator() {
        return armOverrideIndicator;
    }

    /**
     * Sets the value of the armOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmOverrideIndicator(String value) {
        this.armOverrideIndicator = value;
    }

}

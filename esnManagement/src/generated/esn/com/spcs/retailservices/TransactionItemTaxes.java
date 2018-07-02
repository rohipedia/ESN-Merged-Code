
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionItemTaxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionItemTaxes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="taxAuth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="taxstateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxsurchargeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exemptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxBillReceiptDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flStampTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionItemTaxes", propOrder = {
    "taxIdentifier",
    "taxAmount",
    "taxType",
    "taxAuth",
    "taxstateCode",
    "taxsurchargeInd",
    "exemptionNumber",
    "taxRate",
    "taxMethod",
    "taxBillReceiptDescription",
    "flStampTaxAmount"
})
public class TransactionItemTaxes {

    protected int taxIdentifier;
    protected double taxAmount;
    protected Integer taxType;
    protected Integer taxAuth;
    protected String taxstateCode;
    protected String taxsurchargeInd;
    protected String exemptionNumber;
    protected double taxRate;
    @XmlElement(required = true)
    protected String taxMethod;
    protected String taxBillReceiptDescription;
    protected Double flStampTaxAmount;

    /**
     * Gets the value of the taxIdentifier property.
     * 
     */
    public int getTaxIdentifier() {
        return taxIdentifier;
    }

    /**
     * Sets the value of the taxIdentifier property.
     * 
     */
    public void setTaxIdentifier(int value) {
        this.taxIdentifier = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     */
    public double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     */
    public void setTaxAmount(double value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxType(Integer value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the taxAuth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxAuth() {
        return taxAuth;
    }

    /**
     * Sets the value of the taxAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxAuth(Integer value) {
        this.taxAuth = value;
    }

    /**
     * Gets the value of the taxstateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxstateCode() {
        return taxstateCode;
    }

    /**
     * Sets the value of the taxstateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxstateCode(String value) {
        this.taxstateCode = value;
    }

    /**
     * Gets the value of the taxsurchargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxsurchargeInd() {
        return taxsurchargeInd;
    }

    /**
     * Sets the value of the taxsurchargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxsurchargeInd(String value) {
        this.taxsurchargeInd = value;
    }

    /**
     * Gets the value of the exemptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionNumber() {
        return exemptionNumber;
    }

    /**
     * Sets the value of the exemptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionNumber(String value) {
        this.exemptionNumber = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     */
    public void setTaxRate(double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod() {
        return taxMethod;
    }

    /**
     * Sets the value of the taxMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod(String value) {
        this.taxMethod = value;
    }

    /**
     * Gets the value of the taxBillReceiptDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxBillReceiptDescription() {
        return taxBillReceiptDescription;
    }

    /**
     * Sets the value of the taxBillReceiptDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxBillReceiptDescription(String value) {
        this.taxBillReceiptDescription = value;
    }

    /**
     * Gets the value of the flStampTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlStampTaxAmount() {
        return flStampTaxAmount;
    }

    /**
     * Sets the value of the flStampTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlStampTaxAmount(Double value) {
        this.flStampTaxAmount = value;
    }

}

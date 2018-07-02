
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTaxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionTaxInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxIdentifier" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxRule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recieptPrintIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxRateIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxAuthority" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxType" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTaxInfo", propOrder = {
    "taxIdentifier",
    "taxAmount",
    "taxName",
    "taxGroupIdentifier",
    "taxRate",
    "taxRule",
    "recieptPrintIndicator",
    "taxRateIndicator",
    "taxAuthority",
    "taxType",
    "taxStateCode",
    "taxIndicator",
    "lineItemNumber"
})
public class TransactionTaxInfo {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxIdentifier;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double taxAmount;
    @XmlElement(required = true, nillable = true)
    protected String taxName;
    @XmlElement(required = true, nillable = true)
    protected String taxGroupIdentifier;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double taxRate;
    @XmlElement(required = true, nillable = true)
    protected String taxRule;
    @XmlElement(required = true, nillable = true)
    protected String recieptPrintIndicator;
    @XmlElement(required = true, nillable = true)
    protected String taxRateIndicator;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxAuthority;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxType;
    @XmlElement(required = true, nillable = true)
    protected String taxStateCode;
    @XmlElement(required = true, nillable = true)
    protected String taxIndicator;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long lineItemNumber;

    /**
     * Gets the value of the taxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxIdentifier() {
        return taxIdentifier;
    }

    /**
     * Sets the value of the taxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxIdentifier(Long value) {
        this.taxIdentifier = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxAmount(Double value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * Gets the value of the taxGroupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroupIdentifier() {
        return taxGroupIdentifier;
    }

    /**
     * Sets the value of the taxGroupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroupIdentifier(String value) {
        this.taxGroupIdentifier = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(Double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRule() {
        return taxRule;
    }

    /**
     * Sets the value of the taxRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRule(String value) {
        this.taxRule = value;
    }

    /**
     * Gets the value of the recieptPrintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieptPrintIndicator() {
        return recieptPrintIndicator;
    }

    /**
     * Sets the value of the recieptPrintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieptPrintIndicator(String value) {
        this.recieptPrintIndicator = value;
    }

    /**
     * Gets the value of the taxRateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRateIndicator() {
        return taxRateIndicator;
    }

    /**
     * Sets the value of the taxRateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRateIndicator(String value) {
        this.taxRateIndicator = value;
    }

    /**
     * Gets the value of the taxAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAuthority() {
        return taxAuthority;
    }

    /**
     * Sets the value of the taxAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAuthority(Long value) {
        this.taxAuthority = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxType(Long value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the taxStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStateCode() {
        return taxStateCode;
    }

    /**
     * Sets the value of the taxStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStateCode(String value) {
        this.taxStateCode = value;
    }

    /**
     * Gets the value of the taxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIndicator() {
        return taxIndicator;
    }

    /**
     * Sets the value of the taxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIndicator(String value) {
        this.taxIndicator = value;
    }

    /**
     * Gets the value of the lineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemNumber(Long value) {
        this.lineItemNumber = value;
    }

}

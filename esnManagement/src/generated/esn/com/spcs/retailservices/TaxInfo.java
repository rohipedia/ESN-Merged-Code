
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SalesTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="GrossReceiptTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CityGrossReceiptTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInfo", propOrder = {
    "taxId",
    "name",
    "rate",
    "rule",
    "type",
    "salesTaxAmount",
    "grossReceiptTax",
    "cityGrossReceiptTax"
})
public class TaxInfo {

    @XmlElement(name = "TaxId")
    protected int taxId;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Rate")
    protected double rate;
    @XmlElement(name = "Rule", required = true, nillable = true)
    protected String rule;
    @XmlElement(name = "Type", required = true, nillable = true)
    protected String type;
    @XmlElement(name = "SalesTaxAmount")
    protected double salesTaxAmount;
    @XmlElement(name = "GrossReceiptTax")
    protected double grossReceiptTax;
    @XmlElement(name = "CityGrossReceiptTax")
    protected double cityGrossReceiptTax;

    /**
     * Gets the value of the taxId property.
     * 
     */
    public int getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     */
    public void setTaxId(int value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     */
    public double getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     */
    public void setRate(double value) {
        this.rate = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule(String value) {
        this.rule = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the salesTaxAmount property.
     * 
     */
    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    /**
     * Sets the value of the salesTaxAmount property.
     * 
     */
    public void setSalesTaxAmount(double value) {
        this.salesTaxAmount = value;
    }

    /**
     * Gets the value of the grossReceiptTax property.
     * 
     */
    public double getGrossReceiptTax() {
        return grossReceiptTax;
    }

    /**
     * Sets the value of the grossReceiptTax property.
     * 
     */
    public void setGrossReceiptTax(double value) {
        this.grossReceiptTax = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax property.
     * 
     */
    public double getCityGrossReceiptTax() {
        return cityGrossReceiptTax;
    }

    /**
     * Sets the value of the cityGrossReceiptTax property.
     * 
     */
    public void setCityGrossReceiptTax(double value) {
        this.cityGrossReceiptTax = value;
    }

}

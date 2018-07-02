
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesDetailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesDetailInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cashPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="salesTaxInfo" type="{java:com.spcs.retailservices.domain}SalesTaxInfo" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="cashPricePlusSalesTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cashDownPayment" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="documentStampTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="loanItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="adpsDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesDetailInfo", propOrder = {
    "cashPrice",
    "salesTaxInfo",
    "cashPricePlusSalesTax",
    "cashDownPayment",
    "documentStampTax",
    "loanItemDescription",
    "discountType",
    "discountAmount",
    "adpsDiscountAmount"
})
public class SalesDetailInfo {

    protected double cashPrice;
    protected SalesTaxInfo salesTaxInfo;
    protected Double cashPricePlusSalesTax;
    protected double cashDownPayment;
    protected Double documentStampTax;
    @XmlElement(required = true)
    protected String loanItemDescription;
    protected String discountType;
    protected Double discountAmount;
    protected Double adpsDiscountAmount;

    /**
     * Gets the value of the cashPrice property.
     * 
     */
    public double getCashPrice() {
        return cashPrice;
    }

    /**
     * Sets the value of the cashPrice property.
     * 
     */
    public void setCashPrice(double value) {
        this.cashPrice = value;
    }

    /**
     * Gets the value of the salesTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxInfo }
     *     
     */
    public SalesTaxInfo getSalesTaxInfo() {
        return salesTaxInfo;
    }

    /**
     * Sets the value of the salesTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxInfo }
     *     
     */
    public void setSalesTaxInfo(SalesTaxInfo value) {
        this.salesTaxInfo = value;
    }

    /**
     * Gets the value of the cashPricePlusSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCashPricePlusSalesTax() {
        return cashPricePlusSalesTax;
    }

    /**
     * Sets the value of the cashPricePlusSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCashPricePlusSalesTax(Double value) {
        this.cashPricePlusSalesTax = value;
    }

    /**
     * Gets the value of the cashDownPayment property.
     * 
     */
    public double getCashDownPayment() {
        return cashDownPayment;
    }

    /**
     * Sets the value of the cashDownPayment property.
     * 
     */
    public void setCashDownPayment(double value) {
        this.cashDownPayment = value;
    }

    /**
     * Gets the value of the documentStampTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDocumentStampTax() {
        return documentStampTax;
    }

    /**
     * Sets the value of the documentStampTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDocumentStampTax(Double value) {
        this.documentStampTax = value;
    }

    /**
     * Gets the value of the loanItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanItemDescription() {
        return loanItemDescription;
    }

    /**
     * Sets the value of the loanItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanItemDescription(String value) {
        this.loanItemDescription = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountType(String value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountAmount(Double value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the adpsDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdpsDiscountAmount() {
        return adpsDiscountAmount;
    }

    /**
     * Sets the value of the adpsDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdpsDiscountAmount(Double value) {
        this.adpsDiscountAmount = value;
    }

}

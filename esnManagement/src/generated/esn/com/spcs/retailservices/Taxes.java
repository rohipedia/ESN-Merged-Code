
package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Taxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Taxes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estimatedSalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="actualSalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="flStampTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Taxes", propOrder = {
    "estimatedSalesTax",
    "actualSalesTax",
    "flStampTax"
})
public class Taxes {

    @XmlElement(required = true)
    protected BigDecimal estimatedSalesTax;
    @XmlElement(required = true)
    protected BigDecimal actualSalesTax;
    @XmlElement(required = true)
    protected BigDecimal flStampTax;

    /**
     * Gets the value of the estimatedSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimatedSalesTax() {
        return estimatedSalesTax;
    }

    /**
     * Sets the value of the estimatedSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimatedSalesTax(BigDecimal value) {
        this.estimatedSalesTax = value;
    }

    /**
     * Gets the value of the actualSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualSalesTax() {
        return actualSalesTax;
    }

    /**
     * Sets the value of the actualSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualSalesTax(BigDecimal value) {
        this.actualSalesTax = value;
    }

    /**
     * Gets the value of the flStampTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlStampTax() {
        return flStampTax;
    }

    /**
     * Sets the value of the flStampTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlStampTax(BigDecimal value) {
        this.flStampTax = value;
    }

}

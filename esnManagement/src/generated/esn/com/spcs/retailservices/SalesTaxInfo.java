
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesTaxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesTaxInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estimatedSalesTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="actualSalesTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTaxInfo", propOrder = {
    "estimatedSalesTax",
    "actualSalesTax"
})
public class SalesTaxInfo {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double estimatedSalesTax;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double actualSalesTax;

    /**
     * Gets the value of the estimatedSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedSalesTax() {
        return estimatedSalesTax;
    }

    /**
     * Sets the value of the estimatedSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedSalesTax(Double value) {
        this.estimatedSalesTax = value;
    }

    /**
     * Gets the value of the actualSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualSalesTax() {
        return actualSalesTax;
    }

    /**
     * Sets the value of the actualSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualSalesTax(Double value) {
        this.actualSalesTax = value;
    }

}

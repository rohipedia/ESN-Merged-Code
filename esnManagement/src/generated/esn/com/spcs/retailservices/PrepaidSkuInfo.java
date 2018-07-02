
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidSkuInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidSkuInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prepaidSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="skuShortName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sellingBrandCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sellingBrandName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="retailBrandPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidSkuInfo", propOrder = {
    "prepaidSku",
    "skuShortName",
    "sellingBrandCode",
    "sellingBrandName",
    "retailBrandPrice"
})
public class PrepaidSkuInfo {

    @XmlElement(required = true)
    protected String prepaidSku;
    @XmlElement(required = true)
    protected String skuShortName;
    @XmlElement(required = true)
    protected String sellingBrandCode;
    @XmlElement(required = true)
    protected String sellingBrandName;
    protected double retailBrandPrice;

    /**
     * Gets the value of the prepaidSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidSku() {
        return prepaidSku;
    }

    /**
     * Sets the value of the prepaidSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidSku(String value) {
        this.prepaidSku = value;
    }

    /**
     * Gets the value of the skuShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuShortName() {
        return skuShortName;
    }

    /**
     * Sets the value of the skuShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuShortName(String value) {
        this.skuShortName = value;
    }

    /**
     * Gets the value of the sellingBrandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingBrandCode() {
        return sellingBrandCode;
    }

    /**
     * Sets the value of the sellingBrandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingBrandCode(String value) {
        this.sellingBrandCode = value;
    }

    /**
     * Gets the value of the sellingBrandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingBrandName() {
        return sellingBrandName;
    }

    /**
     * Sets the value of the sellingBrandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingBrandName(String value) {
        this.sellingBrandName = value;
    }

    /**
     * Gets the value of the retailBrandPrice property.
     * 
     */
    public double getRetailBrandPrice() {
        return retailBrandPrice;
    }

    /**
     * Sets the value of the retailBrandPrice property.
     * 
     */
    public void setRetailBrandPrice(double value) {
        this.retailBrandPrice = value;
    }

}

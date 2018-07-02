
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingCartSkuErrorInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartSkuErrorInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SkuErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SkuErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartSkuErrorInfo", propOrder = {
    "productSKU",
    "skuErrorCode",
    "skuErrorDescription"
})
public class ShoppingCartSkuErrorInfo {

    @XmlElement(name = "ProductSKU", required = true)
    protected String productSKU;
    @XmlElement(name = "SkuErrorCode", required = true)
    protected String skuErrorCode;
    @XmlElement(name = "SkuErrorDescription", required = true)
    protected String skuErrorDescription;

    /**
     * Gets the value of the productSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSKU() {
        return productSKU;
    }

    /**
     * Sets the value of the productSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSKU(String value) {
        this.productSKU = value;
    }

    /**
     * Gets the value of the skuErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuErrorCode() {
        return skuErrorCode;
    }

    /**
     * Sets the value of the skuErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuErrorCode(String value) {
        this.skuErrorCode = value;
    }

    /**
     * Gets the value of the skuErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuErrorDescription() {
        return skuErrorDescription;
    }

    /**
     * Sets the value of the skuErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuErrorDescription(String value) {
        this.skuErrorDescription = value;
    }

}


package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPromotionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPromotionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductPromotionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ProductPromotionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductPromotionRule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPromotionInfo", propOrder = {
    "productPromotionPrice",
    "productPromotionIdentifier",
    "productPromotionRule"
})
public class ProductPromotionInfo {

    @XmlElement(name = "ProductPromotionPrice", required = true, nillable = true)
    protected BigDecimal productPromotionPrice;
    @XmlElement(name = "ProductPromotionIdentifier")
    protected int productPromotionIdentifier;
    @XmlElement(name = "ProductPromotionRule", required = true)
    protected String productPromotionRule;

    /**
     * Gets the value of the productPromotionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductPromotionPrice() {
        return productPromotionPrice;
    }

    /**
     * Sets the value of the productPromotionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductPromotionPrice(BigDecimal value) {
        this.productPromotionPrice = value;
    }

    /**
     * Gets the value of the productPromotionIdentifier property.
     * 
     */
    public int getProductPromotionIdentifier() {
        return productPromotionIdentifier;
    }

    /**
     * Sets the value of the productPromotionIdentifier property.
     * 
     */
    public void setProductPromotionIdentifier(int value) {
        this.productPromotionIdentifier = value;
    }

    /**
     * Gets the value of the productPromotionRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPromotionRule() {
        return productPromotionRule;
    }

    /**
     * Sets the value of the productPromotionRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPromotionRule(String value) {
        this.productPromotionRule = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductTypeGroupCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductDirectFulfillmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDetails", propOrder = {
    "productTypeGroupCode",
    "productQuantity",
    "productIdentifier",
    "productDirectFulfillmentIndicator"
})
public class ItemDetails {

    @XmlElement(name = "ProductTypeGroupCode")
    protected int productTypeGroupCode;
    @XmlElement(name = "ProductQuantity")
    protected int productQuantity;
    @XmlElement(name = "ProductIdentifier")
    protected int productIdentifier;
    @XmlElement(name = "ProductDirectFulfillmentIndicator", required = true, nillable = true)
    protected String productDirectFulfillmentIndicator;

    /**
     * Gets the value of the productTypeGroupCode property.
     * 
     */
    public int getProductTypeGroupCode() {
        return productTypeGroupCode;
    }

    /**
     * Sets the value of the productTypeGroupCode property.
     * 
     */
    public void setProductTypeGroupCode(int value) {
        this.productTypeGroupCode = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     */
    public int getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     */
    public void setProductQuantity(int value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the productIdentifier property.
     * 
     */
    public int getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     */
    public void setProductIdentifier(int value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the productDirectFulfillmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDirectFulfillmentIndicator() {
        return productDirectFulfillmentIndicator;
    }

    /**
     * Sets the value of the productDirectFulfillmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDirectFulfillmentIndicator(String value) {
        this.productDirectFulfillmentIndicator = value;
    }

}

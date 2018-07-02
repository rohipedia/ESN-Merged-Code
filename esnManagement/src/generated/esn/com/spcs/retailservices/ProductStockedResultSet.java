
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStockedResultSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductStockedResultSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductStockedIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductDirectFulfillmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WarehouseIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductStockedResultSet", propOrder = {
    "productStockedIndicator",
    "productDirectFulfillmentIndicator",
    "warehouseIdentifier"
})
public class ProductStockedResultSet {

    @XmlElement(name = "ProductStockedIndicator", required = true, nillable = true)
    protected String productStockedIndicator;
    @XmlElement(name = "ProductDirectFulfillmentIndicator", required = true, nillable = true)
    protected String productDirectFulfillmentIndicator;
    @XmlElement(name = "WarehouseIdentifier")
    protected int warehouseIdentifier;

    /**
     * Gets the value of the productStockedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStockedIndicator() {
        return productStockedIndicator;
    }

    /**
     * Sets the value of the productStockedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStockedIndicator(String value) {
        this.productStockedIndicator = value;
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

    /**
     * Gets the value of the warehouseIdentifier property.
     * 
     */
    public int getWarehouseIdentifier() {
        return warehouseIdentifier;
    }

    /**
     * Sets the value of the warehouseIdentifier property.
     * 
     */
    public void setWarehouseIdentifier(int value) {
        this.warehouseIdentifier = value;
    }

}

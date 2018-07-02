
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KitComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KitComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemOriginalSaleQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PromptForPriceIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductTaxingMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductRetailPrice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductUnitCost" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductAdjustedRetailPrice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductDiscountRate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KitComponent", propOrder = {
    "itemQuantity",
    "itemOriginalSaleQuantity",
    "promptForPriceIndicator",
    "productTaxingMethod",
    "productRetailPrice",
    "productUnitCost",
    "productAdjustedRetailPrice",
    "productDiscountRate",
    "lineItemNumber"
})
public class KitComponent {

    @XmlElement(name = "ItemQuantity")
    protected int itemQuantity;
    @XmlElement(name = "ItemOriginalSaleQuantity")
    protected int itemOriginalSaleQuantity;
    @XmlElement(name = "PromptForPriceIndicator", required = true, nillable = true)
    protected String promptForPriceIndicator;
    @XmlElement(name = "ProductTaxingMethod", required = true, nillable = true)
    protected String productTaxingMethod;
    @XmlElement(name = "ProductRetailPrice")
    protected int productRetailPrice;
    @XmlElement(name = "ProductUnitCost")
    protected int productUnitCost;
    @XmlElement(name = "ProductAdjustedRetailPrice")
    protected int productAdjustedRetailPrice;
    @XmlElement(name = "ProductDiscountRate")
    protected int productDiscountRate;
    @XmlElement(name = "LineItemNumber")
    protected int lineItemNumber;

    /**
     * Gets the value of the itemQuantity property.
     * 
     */
    public int getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     */
    public void setItemQuantity(int value) {
        this.itemQuantity = value;
    }

    /**
     * Gets the value of the itemOriginalSaleQuantity property.
     * 
     */
    public int getItemOriginalSaleQuantity() {
        return itemOriginalSaleQuantity;
    }

    /**
     * Sets the value of the itemOriginalSaleQuantity property.
     * 
     */
    public void setItemOriginalSaleQuantity(int value) {
        this.itemOriginalSaleQuantity = value;
    }

    /**
     * Gets the value of the promptForPriceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptForPriceIndicator() {
        return promptForPriceIndicator;
    }

    /**
     * Sets the value of the promptForPriceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptForPriceIndicator(String value) {
        this.promptForPriceIndicator = value;
    }

    /**
     * Gets the value of the productTaxingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTaxingMethod() {
        return productTaxingMethod;
    }

    /**
     * Sets the value of the productTaxingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTaxingMethod(String value) {
        this.productTaxingMethod = value;
    }

    /**
     * Gets the value of the productRetailPrice property.
     * 
     */
    public int getProductRetailPrice() {
        return productRetailPrice;
    }

    /**
     * Sets the value of the productRetailPrice property.
     * 
     */
    public void setProductRetailPrice(int value) {
        this.productRetailPrice = value;
    }

    /**
     * Gets the value of the productUnitCost property.
     * 
     */
    public int getProductUnitCost() {
        return productUnitCost;
    }

    /**
     * Sets the value of the productUnitCost property.
     * 
     */
    public void setProductUnitCost(int value) {
        this.productUnitCost = value;
    }

    /**
     * Gets the value of the productAdjustedRetailPrice property.
     * 
     */
    public int getProductAdjustedRetailPrice() {
        return productAdjustedRetailPrice;
    }

    /**
     * Sets the value of the productAdjustedRetailPrice property.
     * 
     */
    public void setProductAdjustedRetailPrice(int value) {
        this.productAdjustedRetailPrice = value;
    }

    /**
     * Gets the value of the productDiscountRate property.
     * 
     */
    public int getProductDiscountRate() {
        return productDiscountRate;
    }

    /**
     * Sets the value of the productDiscountRate property.
     * 
     */
    public void setProductDiscountRate(int value) {
        this.productDiscountRate = value;
    }

    /**
     * Gets the value of the lineItemNumber property.
     * 
     */
    public int getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     */
    public void setLineItemNumber(int value) {
        this.lineItemNumber = value;
    }

}

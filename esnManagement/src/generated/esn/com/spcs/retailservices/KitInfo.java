
package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KitInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KitItemIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceRoundingRule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemMinRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ItemMaxRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ItemRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="KitIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PricingRule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KitInfo", propOrder = {
    "kitItemIndicator",
    "priceRoundingRule",
    "itemType",
    "itemIdentifier",
    "itemMinRetailPrice",
    "itemMaxRetailPrice",
    "itemRetailPrice",
    "kitIdentifier",
    "lineItemNumber",
    "pricingRule"
})
public class KitInfo {

    @XmlElement(name = "KitItemIndicator", required = true, nillable = true)
    protected String kitItemIndicator;
    @XmlElement(name = "PriceRoundingRule", required = true, nillable = true)
    protected String priceRoundingRule;
    @XmlElement(name = "ItemType")
    protected int itemType;
    @XmlElement(name = "ItemIdentifier")
    protected int itemIdentifier;
    @XmlElement(name = "ItemMinRetailPrice", required = true, nillable = true)
    protected BigDecimal itemMinRetailPrice;
    @XmlElement(name = "ItemMaxRetailPrice", required = true, nillable = true)
    protected BigDecimal itemMaxRetailPrice;
    @XmlElement(name = "ItemRetailPrice", required = true, nillable = true)
    protected BigDecimal itemRetailPrice;
    @XmlElement(name = "KitIdentifier", required = true, nillable = true)
    protected String kitIdentifier;
    @XmlElement(name = "LineItemNumber")
    protected int lineItemNumber;
    @XmlElement(name = "PricingRule", required = true, nillable = true)
    protected String pricingRule;

    /**
     * Gets the value of the kitItemIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitItemIndicator() {
        return kitItemIndicator;
    }

    /**
     * Sets the value of the kitItemIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitItemIndicator(String value) {
        this.kitItemIndicator = value;
    }

    /**
     * Gets the value of the priceRoundingRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRoundingRule() {
        return priceRoundingRule;
    }

    /**
     * Sets the value of the priceRoundingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRoundingRule(String value) {
        this.priceRoundingRule = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     */
    public int getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     */
    public void setItemType(int value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the itemIdentifier property.
     * 
     */
    public int getItemIdentifier() {
        return itemIdentifier;
    }

    /**
     * Sets the value of the itemIdentifier property.
     * 
     */
    public void setItemIdentifier(int value) {
        this.itemIdentifier = value;
    }

    /**
     * Gets the value of the itemMinRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemMinRetailPrice() {
        return itemMinRetailPrice;
    }

    /**
     * Sets the value of the itemMinRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemMinRetailPrice(BigDecimal value) {
        this.itemMinRetailPrice = value;
    }

    /**
     * Gets the value of the itemMaxRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemMaxRetailPrice() {
        return itemMaxRetailPrice;
    }

    /**
     * Sets the value of the itemMaxRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemMaxRetailPrice(BigDecimal value) {
        this.itemMaxRetailPrice = value;
    }

    /**
     * Gets the value of the itemRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemRetailPrice() {
        return itemRetailPrice;
    }

    /**
     * Sets the value of the itemRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemRetailPrice(BigDecimal value) {
        this.itemRetailPrice = value;
    }

    /**
     * Gets the value of the kitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitIdentifier() {
        return kitIdentifier;
    }

    /**
     * Sets the value of the kitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitIdentifier(String value) {
        this.kitIdentifier = value;
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

    /**
     * Gets the value of the pricingRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingRule() {
        return pricingRule;
    }

    /**
     * Sets the value of the pricingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingRule(String value) {
        this.pricingRule = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcTaxSkuInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcTaxSkuInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SerializationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsDeviceActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SkuPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UpgradeNowFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcTaxSkuInfo", propOrder = {
    "lineItem",
    "productSKU",
    "serializationIndicator",
    "isDeviceActive",
    "skuPrice",
    "unitPrice",
    "quantity",
    "upgradeNowFeeAmount"
})
public class CalcTaxSkuInfo {

    @XmlElement(name = "LineItem")
    protected int lineItem;
    @XmlElement(name = "ProductSKU", required = true)
    protected String productSKU;
    @XmlElement(name = "SerializationIndicator", required = true, type = Boolean.class, nillable = true)
    protected Boolean serializationIndicator;
    @XmlElement(name = "IsDeviceActive", required = true, type = Boolean.class, nillable = true)
    protected Boolean isDeviceActive;
    @XmlElement(name = "SkuPrice")
    protected double skuPrice;
    @XmlElement(name = "UnitPrice")
    protected double unitPrice;
    @XmlElement(name = "Quantity", defaultValue = "1")
    protected int quantity;
    @XmlElementRef(name = "UpgradeNowFeeAmount", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> upgradeNowFeeAmount;

    /**
     * Gets the value of the lineItem property.
     * 
     */
    public int getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     */
    public void setLineItem(int value) {
        this.lineItem = value;
    }

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
     * Gets the value of the serializationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSerializationIndicator() {
        return serializationIndicator;
    }

    /**
     * Sets the value of the serializationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSerializationIndicator(Boolean value) {
        this.serializationIndicator = value;
    }

    /**
     * Gets the value of the isDeviceActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceActive() {
        return isDeviceActive;
    }

    /**
     * Sets the value of the isDeviceActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceActive(Boolean value) {
        this.isDeviceActive = value;
    }

    /**
     * Gets the value of the skuPrice property.
     * 
     */
    public double getSkuPrice() {
        return skuPrice;
    }

    /**
     * Sets the value of the skuPrice property.
     * 
     */
    public void setSkuPrice(double value) {
        this.skuPrice = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     */
    public void setUnitPrice(double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the upgradeNowFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUpgradeNowFeeAmount() {
        return upgradeNowFeeAmount;
    }

    /**
     * Sets the value of the upgradeNowFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUpgradeNowFeeAmount(JAXBElement<Double> value) {
        this.upgradeNowFeeAmount = value;
    }

}

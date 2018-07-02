
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductInvDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInvDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductDetailsbyStore" type="{java:com.spcs.retailservices.domain}ProductDetailsbyStore"/&gt;
 *         &lt;element name="ProductBasicInfo" type="{java:com.spcs.retailservices.domain}ProductBasicInfo"/&gt;
 *         &lt;element name="ProductOtherInfo" type="{java:com.spcs.retailservices.domain}ProductOtherInfo"/&gt;
 *         &lt;element name="StoreBasicInfo" type="{java:com.spcs.retailservices.domain}StoreBasicInfo"/&gt;
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
@XmlType(name = "ProductInvDetails", propOrder = {
    "productDetailsbyStore",
    "productBasicInfo",
    "productOtherInfo",
    "storeBasicInfo",
    "warehouseIdentifier"
})
public class ProductInvDetails {

    @XmlElement(name = "ProductDetailsbyStore", required = true, nillable = true)
    protected ProductDetailsbyStore productDetailsbyStore;
    @XmlElement(name = "ProductBasicInfo", required = true, nillable = true)
    protected ProductBasicInfo productBasicInfo;
    @XmlElement(name = "ProductOtherInfo", required = true, nillable = true)
    protected ProductOtherInfo productOtherInfo;
    @XmlElement(name = "StoreBasicInfo", required = true, nillable = true)
    protected StoreBasicInfo storeBasicInfo;
    @XmlElement(name = "WarehouseIdentifier", required = true, type = Integer.class, nillable = true)
    protected Integer warehouseIdentifier;

    /**
     * Gets the value of the productDetailsbyStore property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsbyStore }
     *     
     */
    public ProductDetailsbyStore getProductDetailsbyStore() {
        return productDetailsbyStore;
    }

    /**
     * Sets the value of the productDetailsbyStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsbyStore }
     *     
     */
    public void setProductDetailsbyStore(ProductDetailsbyStore value) {
        this.productDetailsbyStore = value;
    }

    /**
     * Gets the value of the productBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductBasicInfo }
     *     
     */
    public ProductBasicInfo getProductBasicInfo() {
        return productBasicInfo;
    }

    /**
     * Sets the value of the productBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBasicInfo }
     *     
     */
    public void setProductBasicInfo(ProductBasicInfo value) {
        this.productBasicInfo = value;
    }

    /**
     * Gets the value of the productOtherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOtherInfo }
     *     
     */
    public ProductOtherInfo getProductOtherInfo() {
        return productOtherInfo;
    }

    /**
     * Sets the value of the productOtherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOtherInfo }
     *     
     */
    public void setProductOtherInfo(ProductOtherInfo value) {
        this.productOtherInfo = value;
    }

    /**
     * Gets the value of the storeBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreBasicInfo }
     *     
     */
    public StoreBasicInfo getStoreBasicInfo() {
        return storeBasicInfo;
    }

    /**
     * Sets the value of the storeBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreBasicInfo }
     *     
     */
    public void setStoreBasicInfo(StoreBasicInfo value) {
        this.storeBasicInfo = value;
    }

    /**
     * Gets the value of the warehouseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWarehouseIdentifier() {
        return warehouseIdentifier;
    }

    /**
     * Sets the value of the warehouseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWarehouseIdentifier(Integer value) {
        this.warehouseIdentifier = value;
    }

}

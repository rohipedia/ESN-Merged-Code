
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDetailInformationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailInformationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductBasicInfo" type="{java:com.spcs.retailservices.domain}ProductBasicInfo"/&gt;
 *         &lt;element name="StoreBasicInfo" type="{java:com.spcs.retailservices.domain}StoreBasicInfo"/&gt;
 *         &lt;element name="StoreOtherInfo" type="{java:com.spcs.retailservices.domain}StoreOtherInfo"/&gt;
 *         &lt;element name="retrievePrepaidSkus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailInformationRequest", propOrder = {
    "actionType",
    "productBasicInfo",
    "storeBasicInfo",
    "storeOtherInfo",
    "retrievePrepaidSkus"
})
public class ProductDetailInformationRequest
    extends Request
{

    @XmlElement(name = "ActionType", required = true, nillable = true)
    protected String actionType;
    @XmlElement(name = "ProductBasicInfo", required = true, nillable = true)
    protected ProductBasicInfo productBasicInfo;
    @XmlElement(name = "StoreBasicInfo", required = true, nillable = true)
    protected StoreBasicInfo storeBasicInfo;
    @XmlElement(name = "StoreOtherInfo", required = true, nillable = true)
    protected StoreOtherInfo storeOtherInfo;
    protected boolean retrievePrepaidSkus;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
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
     * Gets the value of the storeOtherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreOtherInfo }
     *     
     */
    public StoreOtherInfo getStoreOtherInfo() {
        return storeOtherInfo;
    }

    /**
     * Sets the value of the storeOtherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreOtherInfo }
     *     
     */
    public void setStoreOtherInfo(StoreOtherInfo value) {
        this.storeOtherInfo = value;
    }

    /**
     * Gets the value of the retrievePrepaidSkus property.
     * 
     */
    public boolean isRetrievePrepaidSkus() {
        return retrievePrepaidSkus;
    }

    /**
     * Sets the value of the retrievePrepaidSkus property.
     * 
     */
    public void setRetrievePrepaidSkus(boolean value) {
        this.retrievePrepaidSkus = value;
    }

}

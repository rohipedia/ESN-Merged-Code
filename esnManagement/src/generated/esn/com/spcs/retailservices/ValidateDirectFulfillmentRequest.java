
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateDirectFulfillmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateDirectFulfillmentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductOtherInfo" type="{java:com.spcs.retailservices.domain}ProductOtherInfo"/&gt;
 *         &lt;element name="StoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransactionTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DeviceInfo" type="{java:com.spcs.retailservices.domain}DeviceInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateDirectFulfillmentRequest", propOrder = {
    "productOtherInfo",
    "storeIdentifier",
    "transactionTypeCode",
    "deviceInfo"
})
public class ValidateDirectFulfillmentRequest
    extends Request
{

    @XmlElement(name = "ProductOtherInfo", required = true, nillable = true)
    protected ProductOtherInfo productOtherInfo;
    @XmlElement(name = "StoreIdentifier")
    protected int storeIdentifier;
    @XmlElement(name = "TransactionTypeCode")
    protected int transactionTypeCode;
    @XmlElement(name = "DeviceInfo", required = true, nillable = true)
    protected DeviceInfo deviceInfo;

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
     * Gets the value of the storeIdentifier property.
     * 
     */
    public int getStoreIdentifier() {
        return storeIdentifier;
    }

    /**
     * Sets the value of the storeIdentifier property.
     * 
     */
    public void setStoreIdentifier(int value) {
        this.storeIdentifier = value;
    }

    /**
     * Gets the value of the transactionTypeCode property.
     * 
     */
    public int getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Sets the value of the transactionTypeCode property.
     * 
     */
    public void setTransactionTypeCode(int value) {
        this.transactionTypeCode = value;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInfo }
     *     
     */
    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInfo }
     *     
     */
    public void setDeviceInfo(DeviceInfo value) {
        this.deviceInfo = value;
    }

}

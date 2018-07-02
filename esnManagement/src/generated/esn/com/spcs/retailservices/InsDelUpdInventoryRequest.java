
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsDelUpdInventoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsDelUpdInventoryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeviceInfo" type="{java:com.spcs.retailservices.domain}DeviceInfo"/&gt;
 *         &lt;element name="ProductOtherInfo" type="{java:com.spcs.retailservices.domain}ProductOtherInfo"/&gt;
 *         &lt;element name="ProductBasicInfo" type="{java:com.spcs.retailservices.domain}ProductBasicInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsDelUpdInventoryRequest", propOrder = {
    "activityIndicator",
    "deviceInfo",
    "productOtherInfo",
    "productBasicInfo"
})
public class InsDelUpdInventoryRequest
    extends Request
{

    @XmlElement(name = "ActivityIndicator", required = true, nillable = true)
    protected String activityIndicator;
    @XmlElement(name = "DeviceInfo", required = true, nillable = true)
    protected DeviceInfo deviceInfo;
    @XmlElement(name = "ProductOtherInfo", required = true, nillable = true)
    protected ProductOtherInfo productOtherInfo;
    @XmlElement(name = "ProductBasicInfo", required = true, nillable = true)
    protected ProductBasicInfo productBasicInfo;

    /**
     * Gets the value of the activityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityIndicator() {
        return activityIndicator;
    }

    /**
     * Sets the value of the activityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityIndicator(String value) {
        this.activityIndicator = value;
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

}

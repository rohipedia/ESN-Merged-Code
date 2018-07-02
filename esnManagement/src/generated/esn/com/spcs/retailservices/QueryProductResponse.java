
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryProductResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProductResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductBasicInfo" type="{java:com.spcs.retailservices.domain}ProductBasicInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeviceInfo" type="{java:com.spcs.retailservices.domain}DeviceInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductOtherInfo" type="{java:com.spcs.retailservices.domain}ProductOtherInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StoreBasicInfo" type="{java:com.spcs.retailservices.domain}StoreBasicInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KitInfo" type="{java:com.spcs.retailservices.domain}KitInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SourceSkuInfo" type="{java:com.spcs.retailservices.domain}SourceSkuInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProductResponse", propOrder = {
    "productBasicInfo",
    "deviceInfo",
    "productOtherInfo",
    "storeBasicInfo",
    "kitInfo",
    "sourceSkuInfo"
})
public class QueryProductResponse
    extends Response
{

    @XmlElement(name = "ProductBasicInfo", nillable = true)
    protected List<ProductBasicInfo> productBasicInfo;
    @XmlElement(name = "DeviceInfo", nillable = true)
    protected List<DeviceInfo> deviceInfo;
    @XmlElement(name = "ProductOtherInfo", nillable = true)
    protected List<ProductOtherInfo> productOtherInfo;
    @XmlElement(name = "StoreBasicInfo", nillable = true)
    protected List<StoreBasicInfo> storeBasicInfo;
    @XmlElement(name = "KitInfo", nillable = true)
    protected List<KitInfo> kitInfo;
    @XmlElement(name = "SourceSkuInfo", nillable = true)
    protected List<SourceSkuInfo> sourceSkuInfo;

    /**
     * Gets the value of the productBasicInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productBasicInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductBasicInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductBasicInfo }
     * 
     * 
     */
    public List<ProductBasicInfo> getProductBasicInfo() {
        if (productBasicInfo == null) {
            productBasicInfo = new ArrayList<ProductBasicInfo>();
        }
        return this.productBasicInfo;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceInfo }
     * 
     * 
     */
    public List<DeviceInfo> getDeviceInfo() {
        if (deviceInfo == null) {
            deviceInfo = new ArrayList<DeviceInfo>();
        }
        return this.deviceInfo;
    }

    /**
     * Gets the value of the productOtherInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOtherInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOtherInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOtherInfo }
     * 
     * 
     */
    public List<ProductOtherInfo> getProductOtherInfo() {
        if (productOtherInfo == null) {
            productOtherInfo = new ArrayList<ProductOtherInfo>();
        }
        return this.productOtherInfo;
    }

    /**
     * Gets the value of the storeBasicInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeBasicInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreBasicInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreBasicInfo }
     * 
     * 
     */
    public List<StoreBasicInfo> getStoreBasicInfo() {
        if (storeBasicInfo == null) {
            storeBasicInfo = new ArrayList<StoreBasicInfo>();
        }
        return this.storeBasicInfo;
    }

    /**
     * Gets the value of the kitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KitInfo }
     * 
     * 
     */
    public List<KitInfo> getKitInfo() {
        if (kitInfo == null) {
            kitInfo = new ArrayList<KitInfo>();
        }
        return this.kitInfo;
    }

    /**
     * Gets the value of the sourceSkuInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceSkuInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceSkuInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceSkuInfo }
     * 
     * 
     */
    public List<SourceSkuInfo> getSourceSkuInfo() {
        if (sourceSkuInfo == null) {
            sourceSkuInfo = new ArrayList<SourceSkuInfo>();
        }
        return this.sourceSkuInfo;
    }

}

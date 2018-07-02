
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KitDtlsforSKUResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KitDtlsforSKUResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductBasicInfo" type="{java:com.spcs.retailservices.domain}ProductBasicInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KitInfo" type="{java:com.spcs.retailservices.domain}KitInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KitDtlsforSKUResponse", propOrder = {
    "productBasicInfo",
    "kitInfo"
})
public class KitDtlsforSKUResponse
    extends Response
{

    @XmlElement(name = "ProductBasicInfo", nillable = true)
    protected List<ProductBasicInfo> productBasicInfo;
    @XmlElement(name = "KitInfo", nillable = true)
    protected List<KitInfo> kitInfo;

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

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryProductPromotionDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProductPromotionDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductPromotionInfo" type="{java:com.spcs.retailservices.domain}ProductPromotionInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProductPromotionDetailsResponse", propOrder = {
    "productPromotionInfo"
})
public class QueryProductPromotionDetailsResponse
    extends Response
{

    @XmlElement(name = "ProductPromotionInfo", required = true, nillable = true)
    protected ProductPromotionInfo productPromotionInfo;

    /**
     * Gets the value of the productPromotionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPromotionInfo }
     *     
     */
    public ProductPromotionInfo getProductPromotionInfo() {
        return productPromotionInfo;
    }

    /**
     * Sets the value of the productPromotionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPromotionInfo }
     *     
     */
    public void setProductPromotionInfo(ProductPromotionInfo value) {
        this.productPromotionInfo = value;
    }

}

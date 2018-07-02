
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KitComponentPricingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KitComponentPricingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KitItemPricingDetails" type="{java:com.spcs.retailservices.domain}KitItemPricingDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KitComponentPricingResponse", propOrder = {
    "kitItemPricingDetails"
})
public class KitComponentPricingResponse
    extends Response
{

    @XmlElement(name = "KitItemPricingDetails", required = true, nillable = true)
    protected KitItemPricingDetails kitItemPricingDetails;

    /**
     * Gets the value of the kitItemPricingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link KitItemPricingDetails }
     *     
     */
    public KitItemPricingDetails getKitItemPricingDetails() {
        return kitItemPricingDetails;
    }

    /**
     * Sets the value of the kitItemPricingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link KitItemPricingDetails }
     *     
     */
    public void setKitItemPricingDetails(KitItemPricingDetails value) {
        this.kitItemPricingDetails = value;
    }

}

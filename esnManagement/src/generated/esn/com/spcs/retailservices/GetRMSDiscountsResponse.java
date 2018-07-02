
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRMSDiscountsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRMSDiscountsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountList" type="{java:com.spcs.retailservices.domain}DiscountList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRMSDiscountsResponse", propOrder = {
    "discountList"
})
public class GetRMSDiscountsResponse
    extends Response
{

    @XmlElement(required = true)
    protected DiscountList discountList;

    /**
     * Gets the value of the discountList property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountList }
     *     
     */
    public DiscountList getDiscountList() {
        return discountList;
    }

    /**
     * Sets the value of the discountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountList }
     *     
     */
    public void setDiscountList(DiscountList value) {
        this.discountList = value;
    }

}

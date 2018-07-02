
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOnhandSaleableQuantityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOnhandSaleableQuantityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreskuqtyList" type="{java:com.spcs.retailservices.domain}StoreskuqtyList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOnhandSaleableQuantityResponse", propOrder = {
    "storeskuqtyList"
})
public class QueryOnhandSaleableQuantityResponse
    extends Response
{

    @XmlElement(name = "StoreskuqtyList", required = true, nillable = true)
    protected StoreskuqtyList storeskuqtyList;

    /**
     * Gets the value of the storeskuqtyList property.
     * 
     * @return
     *     possible object is
     *     {@link StoreskuqtyList }
     *     
     */
    public StoreskuqtyList getStoreskuqtyList() {
        return storeskuqtyList;
    }

    /**
     * Sets the value of the storeskuqtyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreskuqtyList }
     *     
     */
    public void setStoreskuqtyList(StoreskuqtyList value) {
        this.storeskuqtyList = value;
    }

}

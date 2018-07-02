
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRMSStoreDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRMSStoreDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoresList" type="{java:com.spcs.retailservices.domain}StoresList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRMSStoreDetailsResponse", propOrder = {
    "storesList"
})
public class GetRMSStoreDetailsResponse
    extends Response
{

    @XmlElement(name = "StoresList", required = true)
    protected StoresList storesList;

    /**
     * Gets the value of the storesList property.
     * 
     * @return
     *     possible object is
     *     {@link StoresList }
     *     
     */
    public StoresList getStoresList() {
        return storesList;
    }

    /**
     * Sets the value of the storesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoresList }
     *     
     */
    public void setStoresList(StoresList value) {
        this.storesList = value;
    }

}

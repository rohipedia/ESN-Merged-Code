
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryStoreChannelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryStoreChannelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storeNameList" type="{java:com.spcs.retailservices.domain}StoreNameResponseList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryStoreChannelResponse", propOrder = {
    "storeNameList"
})
public class QueryStoreChannelResponse
    extends Response
{

    @XmlElement(required = true)
    protected StoreNameResponseList storeNameList;

    /**
     * Gets the value of the storeNameList property.
     * 
     * @return
     *     possible object is
     *     {@link StoreNameResponseList }
     *     
     */
    public StoreNameResponseList getStoreNameList() {
        return storeNameList;
    }

    /**
     * Sets the value of the storeNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreNameResponseList }
     *     
     */
    public void setStoreNameList(StoreNameResponseList value) {
        this.storeNameList = value;
    }

}

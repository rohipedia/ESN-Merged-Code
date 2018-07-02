
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryStoreChannelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryStoreChannelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storeNameList" type="{java:com.spcs.retailservices.domain}StoreNameList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryStoreChannelRequest", propOrder = {
    "storeNameList"
})
public class QueryStoreChannelRequest
    extends Request
{

    @XmlElement(required = true)
    protected StoreNameList storeNameList;

    /**
     * Gets the value of the storeNameList property.
     * 
     * @return
     *     possible object is
     *     {@link StoreNameList }
     *     
     */
    public StoreNameList getStoreNameList() {
        return storeNameList;
    }

    /**
     * Sets the value of the storeNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreNameList }
     *     
     */
    public void setStoreNameList(StoreNameList value) {
        this.storeNameList = value;
    }

}

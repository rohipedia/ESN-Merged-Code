
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryUserListForStoresRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryUserListForStoresRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreGroupCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryUserListForStoresRequest", propOrder = {
    "storeGroupCode"
})
public class QueryUserListForStoresRequest
    extends Request
{

    @XmlElement(name = "StoreGroupCode")
    protected int storeGroupCode;

    /**
     * Gets the value of the storeGroupCode property.
     * 
     */
    public int getStoreGroupCode() {
        return storeGroupCode;
    }

    /**
     * Sets the value of the storeGroupCode property.
     * 
     */
    public void setStoreGroupCode(int value) {
        this.storeGroupCode = value;
    }

}

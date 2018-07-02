
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryConsentVerbiageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryConsentVerbiageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryConsentVerbiageList" type="{java:com.spcs.retailservices.domain}QueryConsentVerbiageList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryConsentVerbiageResponse", propOrder = {
    "queryConsentVerbiageList"
})
public class QueryConsentVerbiageResponse
    extends Response
{

    @XmlElement(required = true)
    protected QueryConsentVerbiageList queryConsentVerbiageList;

    /**
     * Gets the value of the queryConsentVerbiageList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryConsentVerbiageList }
     *     
     */
    public QueryConsentVerbiageList getQueryConsentVerbiageList() {
        return queryConsentVerbiageList;
    }

    /**
     * Sets the value of the queryConsentVerbiageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryConsentVerbiageList }
     *     
     */
    public void setQueryConsentVerbiageList(QueryConsentVerbiageList value) {
        this.queryConsentVerbiageList = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryWebOrderListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryWebOrderListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="searchContent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryWebOrderListRequest", propOrder = {
    "searchType",
    "searchContent",
    "storeLocationId"
})
public class QueryWebOrderListRequest
    extends Request
{

    @XmlElement(required = true)
    protected String searchType;
    @XmlElement(required = true)
    protected String searchContent;
    protected int storeLocationId;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the searchContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchContent() {
        return searchContent;
    }

    /**
     * Sets the value of the searchContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchContent(String value) {
        this.searchContent = value;
    }

    /**
     * Gets the value of the storeLocationId property.
     * 
     */
    public int getStoreLocationId() {
        return storeLocationId;
    }

    /**
     * Sets the value of the storeLocationId property.
     * 
     */
    public void setStoreLocationId(int value) {
        this.storeLocationId = value;
    }

}

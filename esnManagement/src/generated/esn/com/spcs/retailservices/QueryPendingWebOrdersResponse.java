
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPendingWebOrdersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPendingWebOrdersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebOrderList" type="{java:com.spcs.retailservices.domain}WebOrderList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPendingWebOrdersResponse", propOrder = {
    "webOrderList"
})
public class QueryPendingWebOrdersResponse
    extends Response
{

    @XmlElement(name = "WebOrderList", required = true, nillable = true)
    protected WebOrderList webOrderList;

    /**
     * Gets the value of the webOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link WebOrderList }
     *     
     */
    public WebOrderList getWebOrderList() {
        return webOrderList;
    }

    /**
     * Sets the value of the webOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebOrderList }
     *     
     */
    public void setWebOrderList(WebOrderList value) {
        this.webOrderList = value;
    }

}

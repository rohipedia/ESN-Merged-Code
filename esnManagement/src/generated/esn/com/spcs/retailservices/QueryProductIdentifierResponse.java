
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryProductIdentifierResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProductIdentifierResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultSet" type="{java:com.spcs.retailservices.domain}ProductIdResultSet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProductIdentifierResponse", propOrder = {
    "resultSet"
})
public class QueryProductIdentifierResponse
    extends Response
{

    @XmlElement(name = "ResultSet", required = true, nillable = true)
    protected ProductIdResultSet resultSet;

    /**
     * Gets the value of the resultSet property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdResultSet }
     *     
     */
    public ProductIdResultSet getResultSet() {
        return resultSet;
    }

    /**
     * Sets the value of the resultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdResultSet }
     *     
     */
    public void setResultSet(ProductIdResultSet value) {
        this.resultSet = value;
    }

}

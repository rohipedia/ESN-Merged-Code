
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySalesRepIdValidationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySalesRepIdValidationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Salesrepid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySalesRepIdValidationRequest", propOrder = {
    "salesrepid"
})
public class QuerySalesRepIdValidationRequest
    extends Request
{

    @XmlElement(name = "Salesrepid", required = true, nillable = true)
    protected String salesrepid;

    /**
     * Gets the value of the salesrepid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesrepid() {
        return salesrepid;
    }

    /**
     * Sets the value of the salesrepid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesrepid(String value) {
        this.salesrepid = value;
    }

}

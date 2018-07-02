
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySalesRepIdValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySalesRepIdValidationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Idcheckstatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySalesRepIdValidationResponse", propOrder = {
    "idcheckstatus"
})
public class QuerySalesRepIdValidationResponse
    extends Response
{

    @XmlElement(name = "Idcheckstatus")
    protected boolean idcheckstatus;

    /**
     * Gets the value of the idcheckstatus property.
     * 
     */
    public boolean isIdcheckstatus() {
        return idcheckstatus;
    }

    /**
     * Sets the value of the idcheckstatus property.
     * 
     */
    public void setIdcheckstatus(boolean value) {
        this.idcheckstatus = value;
    }

}

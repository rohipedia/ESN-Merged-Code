
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryNameByIdentifierResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryNameByIdentifierResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AssociateName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LoginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EmployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EmployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNameByIdentifierResponse", propOrder = {
    "returnValue",
    "associateName",
    "loginIdentifier",
    "employeeFirstName",
    "employeeLastName"
})
public class QueryNameByIdentifierResponse
    extends Response
{

    @XmlElement(name = "ReturnValue")
    protected int returnValue;
    @XmlElement(name = "AssociateName", required = true, nillable = true)
    protected String associateName;
    @XmlElement(name = "LoginIdentifier", required = true, nillable = true)
    protected String loginIdentifier;
    @XmlElement(name = "EmployeeFirstName", required = true, nillable = true)
    protected String employeeFirstName;
    @XmlElement(name = "EmployeeLastName", required = true, nillable = true)
    protected String employeeLastName;

    /**
     * Gets the value of the returnValue property.
     * 
     */
    public int getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     */
    public void setReturnValue(int value) {
        this.returnValue = value;
    }

    /**
     * Gets the value of the associateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateName() {
        return associateName;
    }

    /**
     * Sets the value of the associateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateName(String value) {
        this.associateName = value;
    }

    /**
     * Gets the value of the loginIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginIdentifier() {
        return loginIdentifier;
    }

    /**
     * Sets the value of the loginIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginIdentifier(String value) {
        this.loginIdentifier = value;
    }

    /**
     * Gets the value of the employeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    /**
     * Sets the value of the employeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeFirstName(String value) {
        this.employeeFirstName = value;
    }

    /**
     * Gets the value of the employeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeLastName() {
        return employeeLastName;
    }

    /**
     * Sets the value of the employeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeLastName(String value) {
        this.employeeLastName = value;
    }

}

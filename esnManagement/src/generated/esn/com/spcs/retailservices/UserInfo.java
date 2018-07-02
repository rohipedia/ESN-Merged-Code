
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EmployeeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CorporateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrimaryStoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
    "loginIdentifier",
    "employeeIdentifier",
    "corporateIdentifier",
    "firstName",
    "lastName",
    "securityGroupIdentifier",
    "primaryStoreIndicator"
})
public class UserInfo {

    @XmlElement(name = "LoginIdentifier", required = true)
    protected String loginIdentifier;
    @XmlElement(name = "EmployeeIdentifier")
    protected int employeeIdentifier;
    @XmlElement(name = "CorporateIdentifier")
    protected String corporateIdentifier;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "SecurityGroupIdentifier")
    protected int securityGroupIdentifier;
    @XmlElement(name = "PrimaryStoreIndicator")
    protected boolean primaryStoreIndicator;

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
     * Gets the value of the employeeIdentifier property.
     * 
     */
    public int getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    /**
     * Sets the value of the employeeIdentifier property.
     * 
     */
    public void setEmployeeIdentifier(int value) {
        this.employeeIdentifier = value;
    }

    /**
     * Gets the value of the corporateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateIdentifier() {
        return corporateIdentifier;
    }

    /**
     * Sets the value of the corporateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateIdentifier(String value) {
        this.corporateIdentifier = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the securityGroupIdentifier property.
     * 
     */
    public int getSecurityGroupIdentifier() {
        return securityGroupIdentifier;
    }

    /**
     * Sets the value of the securityGroupIdentifier property.
     * 
     */
    public void setSecurityGroupIdentifier(int value) {
        this.securityGroupIdentifier = value;
    }

    /**
     * Gets the value of the primaryStoreIndicator property.
     * 
     */
    public boolean isPrimaryStoreIndicator() {
        return primaryStoreIndicator;
    }

    /**
     * Sets the value of the primaryStoreIndicator property.
     * 
     */
    public void setPrimaryStoreIndicator(boolean value) {
        this.primaryStoreIndicator = value;
    }

}

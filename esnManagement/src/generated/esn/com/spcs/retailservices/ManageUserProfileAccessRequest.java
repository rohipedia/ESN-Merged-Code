
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageUserProfileAccessRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageUserProfileAccessRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NTLogin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserIDVerification" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrimaryStoreID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdditionalStoreIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangeMade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SecurityLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userEmploymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userCompany" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageUserProfileAccessRequest", propOrder = {
    "firstName",
    "lastName",
    "ntLogin",
    "password",
    "userIDVerification",
    "primaryStoreID",
    "additionalStoreIDs",
    "changeMade",
    "securityLevel",
    "userEmploymentType",
    "userCompany"
})
public class ManageUserProfileAccessRequest
    extends Request
{

    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "NTLogin", required = true)
    protected String ntLogin;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "UserIDVerification")
    protected int userIDVerification;
    @XmlElement(name = "PrimaryStoreID", required = true)
    protected String primaryStoreID;
    @XmlElement(name = "AdditionalStoreIDs")
    protected String additionalStoreIDs;
    @XmlElement(name = "ChangeMade", required = true)
    protected String changeMade;
    @XmlElement(name = "SecurityLevel", required = true)
    protected String securityLevel;
    @XmlElement(required = true)
    protected String userEmploymentType;
    @XmlElement(required = true)
    protected String userCompany;

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
     * Gets the value of the ntLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTLogin() {
        return ntLogin;
    }

    /**
     * Sets the value of the ntLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTLogin(String value) {
        this.ntLogin = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the userIDVerification property.
     * 
     */
    public int getUserIDVerification() {
        return userIDVerification;
    }

    /**
     * Sets the value of the userIDVerification property.
     * 
     */
    public void setUserIDVerification(int value) {
        this.userIDVerification = value;
    }

    /**
     * Gets the value of the primaryStoreID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryStoreID() {
        return primaryStoreID;
    }

    /**
     * Sets the value of the primaryStoreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryStoreID(String value) {
        this.primaryStoreID = value;
    }

    /**
     * Gets the value of the additionalStoreIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStoreIDs() {
        return additionalStoreIDs;
    }

    /**
     * Sets the value of the additionalStoreIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStoreIDs(String value) {
        this.additionalStoreIDs = value;
    }

    /**
     * Gets the value of the changeMade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeMade() {
        return changeMade;
    }

    /**
     * Sets the value of the changeMade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeMade(String value) {
        this.changeMade = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityLevel(String value) {
        this.securityLevel = value;
    }

    /**
     * Gets the value of the userEmploymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmploymentType() {
        return userEmploymentType;
    }

    /**
     * Sets the value of the userEmploymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmploymentType(String value) {
        this.userEmploymentType = value;
    }

    /**
     * Gets the value of the userCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCompany() {
        return userCompany;
    }

    /**
     * Sets the value of the userCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCompany(String value) {
        this.userCompany = value;
    }

}

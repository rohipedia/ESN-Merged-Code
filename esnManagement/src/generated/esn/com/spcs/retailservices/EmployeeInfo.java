
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SecurityGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LoginAttemptCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NextPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PasswordChangeWarningDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeInfo", propOrder = {
    "employeeIdentifier",
    "department",
    "securityGroupIdentifier",
    "password",
    "activeIndicator",
    "loginAttemptCount",
    "nextPasswordChangeDate",
    "passwordChangeWarningDate"
})
public class EmployeeInfo {

    @XmlElement(name = "EmployeeIdentifier")
    protected int employeeIdentifier;
    @XmlElement(name = "Department")
    protected int department;
    @XmlElement(name = "SecurityGroupIdentifier")
    protected int securityGroupIdentifier;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "ActiveIndicator", required = true, nillable = true)
    protected String activeIndicator;
    @XmlElement(name = "LoginAttemptCount")
    protected int loginAttemptCount;
    @XmlElement(name = "NextPasswordChangeDate", required = true, nillable = true)
    protected String nextPasswordChangeDate;
    @XmlElement(name = "PasswordChangeWarningDate", required = true, nillable = true)
    protected String passwordChangeWarningDate;

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
     * Gets the value of the department property.
     * 
     */
    public int getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     */
    public void setDepartment(int value) {
        this.department = value;
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
     * Gets the value of the activeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveIndicator() {
        return activeIndicator;
    }

    /**
     * Sets the value of the activeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveIndicator(String value) {
        this.activeIndicator = value;
    }

    /**
     * Gets the value of the loginAttemptCount property.
     * 
     */
    public int getLoginAttemptCount() {
        return loginAttemptCount;
    }

    /**
     * Sets the value of the loginAttemptCount property.
     * 
     */
    public void setLoginAttemptCount(int value) {
        this.loginAttemptCount = value;
    }

    /**
     * Gets the value of the nextPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPasswordChangeDate() {
        return nextPasswordChangeDate;
    }

    /**
     * Sets the value of the nextPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPasswordChangeDate(String value) {
        this.nextPasswordChangeDate = value;
    }

    /**
     * Gets the value of the passwordChangeWarningDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordChangeWarningDate() {
        return passwordChangeWarningDate;
    }

    /**
     * Sets the value of the passwordChangeWarningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordChangeWarningDate(String value) {
        this.passwordChangeWarningDate = value;
    }

}

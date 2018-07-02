
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticateInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticateInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeInfo" type="{java:com.spcs.retailservices.domain}EmployeeInfo"/&gt;
 *         &lt;element name="StoreBasicInfo" type="{java:com.spcs.retailservices.domain}StoreBasicInfo"/&gt;
 *         &lt;element name="StoreOtherInfo" type="{java:com.spcs.retailservices.domain}StoreOtherInfo"/&gt;
 *         &lt;element name="StoreAddress" type="{java:com.spcs.retailservices.domain}StoreAddress"/&gt;
 *         &lt;element name="ApplicationCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CompanyHierarchyIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SystemLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TodayDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserLoginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserEmployeeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticateInfoResponse", propOrder = {
    "employeeInfo",
    "storeBasicInfo",
    "storeOtherInfo",
    "storeAddress",
    "applicationCurrencyCode",
    "companyHierarchyIdentifier",
    "systemLanguageCode",
    "success",
    "authCode",
    "todayDate",
    "userLoginIdentifier",
    "userEmployeeIdentifier"
})
public class AuthenticateInfoResponse
    extends Response
{

    @XmlElement(name = "EmployeeInfo", required = true, nillable = true)
    protected EmployeeInfo employeeInfo;
    @XmlElement(name = "StoreBasicInfo", required = true, nillable = true)
    protected StoreBasicInfo storeBasicInfo;
    @XmlElement(name = "StoreOtherInfo", required = true, nillable = true)
    protected StoreOtherInfo storeOtherInfo;
    @XmlElement(name = "StoreAddress", required = true, nillable = true)
    protected StoreAddress storeAddress;
    @XmlElement(name = "ApplicationCurrencyCode", required = true, nillable = true)
    protected String applicationCurrencyCode;
    @XmlElement(name = "CompanyHierarchyIdentifier")
    protected int companyHierarchyIdentifier;
    @XmlElement(name = "SystemLanguageCode", required = true, nillable = true)
    protected String systemLanguageCode;
    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "AuthCode", required = true, nillable = true)
    protected String authCode;
    @XmlElement(name = "TodayDate", required = true, nillable = true)
    protected String todayDate;
    @XmlElement(name = "UserLoginIdentifier", required = true, nillable = true)
    protected String userLoginIdentifier;
    @XmlElement(name = "UserEmployeeIdentifier", required = true, type = Integer.class, nillable = true)
    protected Integer userEmployeeIdentifier;

    /**
     * Gets the value of the employeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfo }
     *     
     */
    public EmployeeInfo getEmployeeInfo() {
        return employeeInfo;
    }

    /**
     * Sets the value of the employeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfo }
     *     
     */
    public void setEmployeeInfo(EmployeeInfo value) {
        this.employeeInfo = value;
    }

    /**
     * Gets the value of the storeBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreBasicInfo }
     *     
     */
    public StoreBasicInfo getStoreBasicInfo() {
        return storeBasicInfo;
    }

    /**
     * Sets the value of the storeBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreBasicInfo }
     *     
     */
    public void setStoreBasicInfo(StoreBasicInfo value) {
        this.storeBasicInfo = value;
    }

    /**
     * Gets the value of the storeOtherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreOtherInfo }
     *     
     */
    public StoreOtherInfo getStoreOtherInfo() {
        return storeOtherInfo;
    }

    /**
     * Sets the value of the storeOtherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreOtherInfo }
     *     
     */
    public void setStoreOtherInfo(StoreOtherInfo value) {
        this.storeOtherInfo = value;
    }

    /**
     * Gets the value of the storeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StoreAddress }
     *     
     */
    public StoreAddress getStoreAddress() {
        return storeAddress;
    }

    /**
     * Sets the value of the storeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreAddress }
     *     
     */
    public void setStoreAddress(StoreAddress value) {
        this.storeAddress = value;
    }

    /**
     * Gets the value of the applicationCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationCurrencyCode() {
        return applicationCurrencyCode;
    }

    /**
     * Sets the value of the applicationCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationCurrencyCode(String value) {
        this.applicationCurrencyCode = value;
    }

    /**
     * Gets the value of the companyHierarchyIdentifier property.
     * 
     */
    public int getCompanyHierarchyIdentifier() {
        return companyHierarchyIdentifier;
    }

    /**
     * Sets the value of the companyHierarchyIdentifier property.
     * 
     */
    public void setCompanyHierarchyIdentifier(int value) {
        this.companyHierarchyIdentifier = value;
    }

    /**
     * Gets the value of the systemLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemLanguageCode() {
        return systemLanguageCode;
    }

    /**
     * Sets the value of the systemLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemLanguageCode(String value) {
        this.systemLanguageCode = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the todayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTodayDate() {
        return todayDate;
    }

    /**
     * Sets the value of the todayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTodayDate(String value) {
        this.todayDate = value;
    }

    /**
     * Gets the value of the userLoginIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLoginIdentifier() {
        return userLoginIdentifier;
    }

    /**
     * Sets the value of the userLoginIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLoginIdentifier(String value) {
        this.userLoginIdentifier = value;
    }

    /**
     * Gets the value of the userEmployeeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserEmployeeIdentifier() {
        return userEmployeeIdentifier;
    }

    /**
     * Sets the value of the userEmployeeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserEmployeeIdentifier(Integer value) {
        this.userEmployeeIdentifier = value;
    }

}

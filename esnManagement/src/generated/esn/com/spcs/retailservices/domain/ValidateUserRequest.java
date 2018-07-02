
package esn.com.spcs.retailservices.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import esn.com.spcs.retailservices.ByPassAuthenticationInfo;
import esn.com.spcs.retailservices.Request;


/**
 * <p>Java class for ValidateUserRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateUserRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserLoginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="UserPasswordEncrypted" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="byPassAuthenticationInfo" type="{java:com.spcs.retailservices.domain}ByPassAuthenticationInfo" form="qualified"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateUserRequest", namespace = "java:com.spcs.retailservices.domain.externalclient", propOrder = {
    "userLoginIdentifier",
    "userPasswordEncrypted",
    "byPassAuthenticationInfo"
})
public class ValidateUserRequest
    extends Request
{

    @XmlElement(name = "UserLoginIdentifier", required = true, nillable = true)
    protected String userLoginIdentifier;
    @XmlElement(name = "UserPasswordEncrypted", required = true, nillable = true)
    protected String userPasswordEncrypted;
    protected ByPassAuthenticationInfo byPassAuthenticationInfo;

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
     * Gets the value of the userPasswordEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPasswordEncrypted() {
        return userPasswordEncrypted;
    }

    /**
     * Sets the value of the userPasswordEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPasswordEncrypted(String value) {
        this.userPasswordEncrypted = value;
    }

    /**
     * Gets the value of the byPassAuthenticationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ByPassAuthenticationInfo }
     *     
     */
    public ByPassAuthenticationInfo getByPassAuthenticationInfo() {
        return byPassAuthenticationInfo;
    }

    /**
     * Sets the value of the byPassAuthenticationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByPassAuthenticationInfo }
     *     
     */
    public void setByPassAuthenticationInfo(ByPassAuthenticationInfo value) {
        this.byPassAuthenticationInfo = value;
    }

}

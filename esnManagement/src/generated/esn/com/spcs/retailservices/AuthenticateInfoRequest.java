
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticateInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticateInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="UserLoginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="UserCorporateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidateUserOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticateInfoRequest", propOrder = {
    "userLoginIdentifier",
    "userCorporateIdentifier",
    "userPassword",
    "validateUserOnly"
})
public class AuthenticateInfoRequest
    extends Request
{

    @XmlElementRef(name = "UserLoginIdentifier", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userLoginIdentifier;
    @XmlElementRef(name = "UserCorporateIdentifier", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userCorporateIdentifier;
    @XmlElementRef(name = "UserPassword", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userPassword;
    @XmlElement(name = "ValidateUserOnly", required = true, type = Boolean.class, nillable = true)
    protected Boolean validateUserOnly;

    /**
     * Gets the value of the userLoginIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLoginIdentifier() {
        return userLoginIdentifier;
    }

    /**
     * Sets the value of the userLoginIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLoginIdentifier(JAXBElement<String> value) {
        this.userLoginIdentifier = value;
    }

    /**
     * Gets the value of the userCorporateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserCorporateIdentifier() {
        return userCorporateIdentifier;
    }

    /**
     * Sets the value of the userCorporateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserCorporateIdentifier(JAXBElement<String> value) {
        this.userCorporateIdentifier = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserPassword(JAXBElement<String> value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the validateUserOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateUserOnly() {
        return validateUserOnly;
    }

    /**
     * Sets the value of the validateUserOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateUserOnly(Boolean value) {
        this.validateUserOnly = value;
    }

}

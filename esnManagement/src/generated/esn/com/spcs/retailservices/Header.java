
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RmsUserIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RmsPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplUserIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplUserPwd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AuthenticationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Exceptions" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "storeIdentifier",
    "applIdentifier",
    "rmsUserIdentifier",
    "rmsPassword",
    "applUserIdentifier",
    "applUserPwd",
    "authenticationCode",
    "exceptions"
})
public class Header {

    @XmlElement(name = "StoreIdentifier", required = true, nillable = true)
    protected String storeIdentifier;
    @XmlElement(name = "ApplIdentifier", required = true, nillable = true)
    protected String applIdentifier;
    @XmlElement(name = "RmsUserIdentifier", required = true, nillable = true)
    protected String rmsUserIdentifier;
    @XmlElement(name = "RmsPassword", required = true, nillable = true)
    protected String rmsPassword;
    @XmlElement(name = "ApplUserIdentifier", required = true, nillable = true)
    protected String applUserIdentifier;
    @XmlElement(name = "ApplUserPwd", required = true, nillable = true)
    protected String applUserPwd;
    @XmlElement(name = "AuthenticationCode", required = true, nillable = true)
    protected String authenticationCode;
    @XmlElement(name = "Exceptions", required = true, nillable = true)
    protected String exceptions;

    /**
     * Gets the value of the storeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreIdentifier() {
        return storeIdentifier;
    }

    /**
     * Sets the value of the storeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreIdentifier(String value) {
        this.storeIdentifier = value;
    }

    /**
     * Gets the value of the applIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplIdentifier() {
        return applIdentifier;
    }

    /**
     * Sets the value of the applIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplIdentifier(String value) {
        this.applIdentifier = value;
    }

    /**
     * Gets the value of the rmsUserIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmsUserIdentifier() {
        return rmsUserIdentifier;
    }

    /**
     * Sets the value of the rmsUserIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmsUserIdentifier(String value) {
        this.rmsUserIdentifier = value;
    }

    /**
     * Gets the value of the rmsPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmsPassword() {
        return rmsPassword;
    }

    /**
     * Sets the value of the rmsPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmsPassword(String value) {
        this.rmsPassword = value;
    }

    /**
     * Gets the value of the applUserIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplUserIdentifier() {
        return applUserIdentifier;
    }

    /**
     * Sets the value of the applUserIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplUserIdentifier(String value) {
        this.applUserIdentifier = value;
    }

    /**
     * Gets the value of the applUserPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplUserPwd() {
        return applUserPwd;
    }

    /**
     * Sets the value of the applUserPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplUserPwd(String value) {
        this.applUserPwd = value;
    }

    /**
     * Gets the value of the authenticationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationCode() {
        return authenticationCode;
    }

    /**
     * Sets the value of the authenticationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationCode(String value) {
        this.authenticationCode = value;
    }

    /**
     * Gets the value of the exceptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptions() {
        return exceptions;
    }

    /**
     * Sets the value of the exceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptions(String value) {
        this.exceptions = value;
    }

}

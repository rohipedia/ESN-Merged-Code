
package esn.com.spcs.retailservices.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import esn.com.spcs.retailservices.Request;


/**
 * <p>Java class for QueryLastPunchDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryLastPunchDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserLoginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLastPunchDetailsRequest", propOrder = {
    "userLoginIdentifier",
    "userPassword",
    "locationIdentifier"
})
public class QueryLastPunchDetailsRequest
    extends Request
{

    @XmlElement(name = "UserLoginIdentifier", required = true, nillable = true)
    protected String userLoginIdentifier;
    @XmlElement(name = "UserPassword", required = true, nillable = true)
    protected String userPassword;
    @XmlElement(name = "LocationIdentifier")
    protected int locationIdentifier;

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
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the locationIdentifier property.
     * 
     */
    public int getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Sets the value of the locationIdentifier property.
     * 
     */
    public void setLocationIdentifier(int value) {
        this.locationIdentifier = value;
    }

}

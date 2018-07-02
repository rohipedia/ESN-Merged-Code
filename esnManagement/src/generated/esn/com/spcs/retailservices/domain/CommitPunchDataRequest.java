
package esn.com.spcs.retailservices.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import esn.com.spcs.retailservices.Request;


/**
 * <p>Java class for CommitPunchDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitPunchDataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="PunchData" type="{java:com.spcs.retailservices.domain.punchinout}PunchData" form="qualified"/&gt;
 *         &lt;element name="UserPasswordEncrypted" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
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
@XmlType(name = "CommitPunchDataRequest", propOrder = {
    "userIdentifier",
    "punchData",
    "userPasswordEncrypted",
    "locationIdentifier"
})
public class CommitPunchDataRequest
    extends Request
{

    @XmlElement(name = "UserIdentifier", required = true, nillable = true)
    protected String userIdentifier;
    @XmlElement(name = "PunchData", required = true, nillable = true)
    protected PunchData punchData;
    @XmlElement(name = "UserPasswordEncrypted", required = true, nillable = true)
    protected String userPasswordEncrypted;
    @XmlElement(name = "LocationIdentifier")
    protected int locationIdentifier;

    /**
     * Gets the value of the userIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdentifier() {
        return userIdentifier;
    }

    /**
     * Sets the value of the userIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdentifier(String value) {
        this.userIdentifier = value;
    }

    /**
     * Gets the value of the punchData property.
     * 
     * @return
     *     possible object is
     *     {@link PunchData }
     *     
     */
    public PunchData getPunchData() {
        return punchData;
    }

    /**
     * Sets the value of the punchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PunchData }
     *     
     */
    public void setPunchData(PunchData value) {
        this.punchData = value;
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


package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResetPasswordRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetPasswordRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Store" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ManagerUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefinitivePasswordInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetPasswordRequest", propOrder = {
    "userId",
    "password",
    "store",
    "reEnable",
    "managerUserId",
    "definitivePasswordInd"
})
public class ResetPasswordRequest
    extends Request
{

    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Store", required = true)
    protected String store;
    @XmlElement(name = "ReEnable")
    protected boolean reEnable;
    @XmlElementRef(name = "ManagerUserId", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> managerUserId;
    @XmlElementRef(name = "DefinitivePasswordInd", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> definitivePasswordInd;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
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
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStore(String value) {
        this.store = value;
    }

    /**
     * Gets the value of the reEnable property.
     * 
     */
    public boolean isReEnable() {
        return reEnable;
    }

    /**
     * Sets the value of the reEnable property.
     * 
     */
    public void setReEnable(boolean value) {
        this.reEnable = value;
    }

    /**
     * Gets the value of the managerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagerUserId() {
        return managerUserId;
    }

    /**
     * Sets the value of the managerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagerUserId(JAXBElement<String> value) {
        this.managerUserId = value;
    }

    /**
     * Gets the value of the definitivePasswordInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDefinitivePasswordInd() {
        return definitivePasswordInd;
    }

    /**
     * Sets the value of the definitivePasswordInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDefinitivePasswordInd(JAXBElement<Boolean> value) {
        this.definitivePasswordInd = value;
    }

}

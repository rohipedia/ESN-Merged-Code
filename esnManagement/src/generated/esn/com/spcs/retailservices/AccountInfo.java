
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameInfo" type="{java:com.spcs.retailservices.domain}NameInfo"/&gt;
 *         &lt;element name="EibCustomerAddressInfo" type="{java:com.spcs.retailservices.domain}EibCustomerAddressInfo"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfo", propOrder = {
    "ban",
    "subscriberId",
    "nameInfo",
    "eibCustomerAddressInfo",
    "phoneNumber",
    "emailAddress"
})
public class AccountInfo {

    protected Integer ban;
    protected String subscriberId;
    @XmlElement(required = true)
    protected NameInfo nameInfo;
    @XmlElement(name = "EibCustomerAddressInfo", required = true)
    protected EibCustomerAddressInfo eibCustomerAddressInfo;
    protected String phoneNumber;
    protected String emailAddress;

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBan(Integer value) {
        this.ban = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the nameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameInfo }
     *     
     */
    public NameInfo getNameInfo() {
        return nameInfo;
    }

    /**
     * Sets the value of the nameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInfo }
     *     
     */
    public void setNameInfo(NameInfo value) {
        this.nameInfo = value;
    }

    /**
     * Gets the value of the eibCustomerAddressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EibCustomerAddressInfo }
     *     
     */
    public EibCustomerAddressInfo getEibCustomerAddressInfo() {
        return eibCustomerAddressInfo;
    }

    /**
     * Sets the value of the eibCustomerAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EibCustomerAddressInfo }
     *     
     */
    public void setEibCustomerAddressInfo(EibCustomerAddressInfo value) {
        this.eibCustomerAddressInfo = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}

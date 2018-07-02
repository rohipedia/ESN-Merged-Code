
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLevelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountLevelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="welcomeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountChargesInfo" type="{java:com.spcs.retailservices.domain}AccountChargesInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLevelInfo", propOrder = {
    "welcomeInd",
    "ban",
    "accountChargesInfo"
})
public class AccountLevelInfo {

    protected boolean welcomeInd;
    @XmlElement(required = true)
    protected String ban;
    protected AccountChargesInfo accountChargesInfo;

    /**
     * Gets the value of the welcomeInd property.
     * 
     */
    public boolean isWelcomeInd() {
        return welcomeInd;
    }

    /**
     * Sets the value of the welcomeInd property.
     * 
     */
    public void setWelcomeInd(boolean value) {
        this.welcomeInd = value;
    }

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBan(String value) {
        this.ban = value;
    }

    /**
     * Gets the value of the accountChargesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountChargesInfo }
     *     
     */
    public AccountChargesInfo getAccountChargesInfo() {
        return accountChargesInfo;
    }

    /**
     * Sets the value of the accountChargesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountChargesInfo }
     *     
     */
    public void setAccountChargesInfo(AccountChargesInfo value) {
        this.accountChargesInfo = value;
    }

}

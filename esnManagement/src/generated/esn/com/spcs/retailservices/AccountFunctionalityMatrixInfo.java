
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountFunctionalityMatrixInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountFunctionalityMatrixInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="function" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isFunctionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountFunctionalityMatrixInfo", propOrder = {
    "accountType",
    "accountSubType",
    "function",
    "isFunctionEnabled"
})
public class AccountFunctionalityMatrixInfo {

    @XmlElement(required = true)
    protected String accountType;
    @XmlElement(required = true)
    protected String accountSubType;
    @XmlElement(required = true)
    protected String function;
    protected boolean isFunctionEnabled;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSubType() {
        return accountSubType;
    }

    /**
     * Sets the value of the accountSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSubType(String value) {
        this.accountSubType = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the isFunctionEnabled property.
     * 
     */
    public boolean isIsFunctionEnabled() {
        return isFunctionEnabled;
    }

    /**
     * Sets the value of the isFunctionEnabled property.
     * 
     */
    public void setIsFunctionEnabled(boolean value) {
        this.isFunctionEnabled = value;
    }

}

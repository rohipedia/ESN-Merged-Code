
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreAuthorizeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreAuthorizeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preAuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentCardHandle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreAuthorizeInfo", propOrder = {
    "responseDateTime",
    "preAuthorizationCode",
    "paymentCardHandle",
    "paymentTransactionIdentifier"
})
public class PreAuthorizeInfo {

    @XmlElement(required = true)
    protected String responseDateTime;
    @XmlElement(required = true)
    protected String preAuthorizationCode;
    @XmlElement(required = true)
    protected String paymentCardHandle;
    @XmlElement(required = true)
    protected String paymentTransactionIdentifier;

    /**
     * Gets the value of the responseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * Sets the value of the responseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDateTime(String value) {
        this.responseDateTime = value;
    }

    /**
     * Gets the value of the preAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreAuthorizationCode() {
        return preAuthorizationCode;
    }

    /**
     * Sets the value of the preAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreAuthorizationCode(String value) {
        this.preAuthorizationCode = value;
    }

    /**
     * Gets the value of the paymentCardHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardHandle() {
        return paymentCardHandle;
    }

    /**
     * Sets the value of the paymentCardHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardHandle(String value) {
        this.paymentCardHandle = value;
    }

    /**
     * Gets the value of the paymentTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionIdentifier() {
        return paymentTransactionIdentifier;
    }

    /**
     * Sets the value of the paymentTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionIdentifier(String value) {
        this.paymentTransactionIdentifier = value;
    }

}

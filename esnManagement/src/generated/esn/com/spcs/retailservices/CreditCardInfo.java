
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="approvalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorizationMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creditCardEntryMethodIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creditCardZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nfcIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vendorResponseMsgTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionApprovalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vendorReferenceTraceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccEaiReturnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccEaiReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccEaiReasonTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emvAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preAuthorizeInfo" type="{java:com.spcs.retailservices.domain}PreAuthorizeInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardInfo", propOrder = {
    "paymentAccountNumber",
    "expiryDate",
    "approvalNumber",
    "authorizationMethod",
    "creditCardEntryMethodIndicator",
    "creditCardZipCode",
    "nfcIndicator",
    "vendorResponseMsgTxt",
    "transactionApprovalStatusCode",
    "vendorReferenceTraceNumber",
    "ccEaiReturnCode",
    "ccEaiReasonCode",
    "ccEaiReasonTxt",
    "emvAdditionalInfo",
    "preAuthorizeInfo"
})
public class CreditCardInfo {

    @XmlElement(required = true)
    protected String paymentAccountNumber;
    @XmlElement(required = true)
    protected String expiryDate;
    @XmlElement(required = true)
    protected String approvalNumber;
    @XmlElement(required = true)
    protected String authorizationMethod;
    @XmlElement(required = true)
    protected String creditCardEntryMethodIndicator;
    protected long creditCardZipCode;
    @XmlElement(required = true)
    protected String nfcIndicator;
    @XmlElement(required = true)
    protected String vendorResponseMsgTxt;
    @XmlElement(required = true)
    protected String transactionApprovalStatusCode;
    @XmlElement(required = true)
    protected String vendorReferenceTraceNumber;
    @XmlElement(required = true)
    protected String ccEaiReturnCode;
    @XmlElement(required = true)
    protected String ccEaiReasonCode;
    @XmlElement(required = true)
    protected String ccEaiReasonTxt;
    @XmlElement(required = true)
    protected String emvAdditionalInfo;
    protected PreAuthorizeInfo preAuthorizeInfo;

    /**
     * Gets the value of the paymentAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountNumber() {
        return paymentAccountNumber;
    }

    /**
     * Sets the value of the paymentAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountNumber(String value) {
        this.paymentAccountNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the approvalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalNumber() {
        return approvalNumber;
    }

    /**
     * Sets the value of the approvalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalNumber(String value) {
        this.approvalNumber = value;
    }

    /**
     * Gets the value of the authorizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationMethod() {
        return authorizationMethod;
    }

    /**
     * Sets the value of the authorizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationMethod(String value) {
        this.authorizationMethod = value;
    }

    /**
     * Gets the value of the creditCardEntryMethodIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardEntryMethodIndicator() {
        return creditCardEntryMethodIndicator;
    }

    /**
     * Sets the value of the creditCardEntryMethodIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardEntryMethodIndicator(String value) {
        this.creditCardEntryMethodIndicator = value;
    }

    /**
     * Gets the value of the creditCardZipCode property.
     * 
     */
    public long getCreditCardZipCode() {
        return creditCardZipCode;
    }

    /**
     * Sets the value of the creditCardZipCode property.
     * 
     */
    public void setCreditCardZipCode(long value) {
        this.creditCardZipCode = value;
    }

    /**
     * Gets the value of the nfcIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfcIndicator() {
        return nfcIndicator;
    }

    /**
     * Sets the value of the nfcIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfcIndicator(String value) {
        this.nfcIndicator = value;
    }

    /**
     * Gets the value of the vendorResponseMsgTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorResponseMsgTxt() {
        return vendorResponseMsgTxt;
    }

    /**
     * Sets the value of the vendorResponseMsgTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorResponseMsgTxt(String value) {
        this.vendorResponseMsgTxt = value;
    }

    /**
     * Gets the value of the transactionApprovalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionApprovalStatusCode() {
        return transactionApprovalStatusCode;
    }

    /**
     * Sets the value of the transactionApprovalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionApprovalStatusCode(String value) {
        this.transactionApprovalStatusCode = value;
    }

    /**
     * Gets the value of the vendorReferenceTraceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorReferenceTraceNumber() {
        return vendorReferenceTraceNumber;
    }

    /**
     * Sets the value of the vendorReferenceTraceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorReferenceTraceNumber(String value) {
        this.vendorReferenceTraceNumber = value;
    }

    /**
     * Gets the value of the ccEaiReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcEaiReturnCode() {
        return ccEaiReturnCode;
    }

    /**
     * Sets the value of the ccEaiReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcEaiReturnCode(String value) {
        this.ccEaiReturnCode = value;
    }

    /**
     * Gets the value of the ccEaiReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcEaiReasonCode() {
        return ccEaiReasonCode;
    }

    /**
     * Sets the value of the ccEaiReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcEaiReasonCode(String value) {
        this.ccEaiReasonCode = value;
    }

    /**
     * Gets the value of the ccEaiReasonTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcEaiReasonTxt() {
        return ccEaiReasonTxt;
    }

    /**
     * Sets the value of the ccEaiReasonTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcEaiReasonTxt(String value) {
        this.ccEaiReasonTxt = value;
    }

    /**
     * Gets the value of the emvAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmvAdditionalInfo() {
        return emvAdditionalInfo;
    }

    /**
     * Sets the value of the emvAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmvAdditionalInfo(String value) {
        this.emvAdditionalInfo = value;
    }

    /**
     * Gets the value of the preAuthorizeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PreAuthorizeInfo }
     *     
     */
    public PreAuthorizeInfo getPreAuthorizeInfo() {
        return preAuthorizeInfo;
    }

    /**
     * Sets the value of the preAuthorizeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreAuthorizeInfo }
     *     
     */
    public void setPreAuthorizeInfo(PreAuthorizeInfo value) {
        this.preAuthorizeInfo = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendIdVerificationDataToRmsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendIdVerificationDataToRmsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consentNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idaTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerInfo" type="{java:com.spcs.retailservices.domain}SendIdVerificationDataToRmsCustomerInfo"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="idScanComplete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="isIdScanOverridden" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="overrideInfo" type="{java:com.spcs.retailservices.domain}OverrideInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendIdVerificationDataToRmsRequest", propOrder = {
    "consentNo",
    "idaTransactionId",
    "customerInfo",
    "idScanComplete",
    "isIdScanOverridden",
    "overrideInfo"
})
public class SendIdVerificationDataToRmsRequest
    extends Request
{

    @XmlElement(required = true)
    protected String consentNo;
    @XmlElement(required = true)
    protected String idaTransactionId;
    @XmlElement(required = true)
    protected SendIdVerificationDataToRmsCustomerInfo customerInfo;
    protected String idScanComplete;
    protected String isIdScanOverridden;
    protected OverrideInfo overrideInfo;

    /**
     * Gets the value of the consentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentNo() {
        return consentNo;
    }

    /**
     * Sets the value of the consentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentNo(String value) {
        this.consentNo = value;
    }

    /**
     * Gets the value of the idaTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdaTransactionId() {
        return idaTransactionId;
    }

    /**
     * Sets the value of the idaTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdaTransactionId(String value) {
        this.idaTransactionId = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SendIdVerificationDataToRmsCustomerInfo }
     *     
     */
    public SendIdVerificationDataToRmsCustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendIdVerificationDataToRmsCustomerInfo }
     *     
     */
    public void setCustomerInfo(SendIdVerificationDataToRmsCustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the idScanComplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdScanComplete() {
        return idScanComplete;
    }

    /**
     * Sets the value of the idScanComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdScanComplete(String value) {
        this.idScanComplete = value;
    }

    /**
     * Gets the value of the isIdScanOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIdScanOverridden() {
        return isIdScanOverridden;
    }

    /**
     * Sets the value of the isIdScanOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIdScanOverridden(String value) {
        this.isIdScanOverridden = value;
    }

    /**
     * Gets the value of the overrideInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideInfo }
     *     
     */
    public OverrideInfo getOverrideInfo() {
        return overrideInfo;
    }

    /**
     * Sets the value of the overrideInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideInfo }
     *     
     */
    public void setOverrideInfo(OverrideInfo value) {
        this.overrideInfo = value;
    }

}

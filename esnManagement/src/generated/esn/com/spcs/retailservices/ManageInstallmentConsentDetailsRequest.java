
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageInstallmentConsentDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageInstallmentConsentDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsentNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BypassedReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UpdateConsentInfo" type="{java:com.spcs.retailservices.domain}UpdateConsentInfo" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="InsertInstallmentConsentInfo" type="{java:com.spcs.retailservices.domain}InsertInstallmentConsentInfo" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ApplId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SignatureTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Base64Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageInstallmentConsentDetailsRequest", propOrder = {
    "consentNo",
    "bypassedReasonCode",
    "updateConsentInfo",
    "insertInstallmentConsentInfo",
    "applId",
    "signatureTypeCd",
    "base64Signature"
})
public class ManageInstallmentConsentDetailsRequest
    extends Request
{

    @XmlElement(name = "ConsentNo")
    protected int consentNo;
    @XmlElement(name = "BypassedReasonCode", required = true)
    protected String bypassedReasonCode;
    @XmlElementRef(name = "UpdateConsentInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateConsentInfo> updateConsentInfo;
    @XmlElementRef(name = "InsertInstallmentConsentInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<InsertInstallmentConsentInfo> insertInstallmentConsentInfo;
    @XmlElement(name = "ApplId", required = true)
    protected String applId;
    @XmlElement(name = "SignatureTypeCd", required = true)
    protected String signatureTypeCd;
    @XmlElement(name = "Base64Signature")
    protected String base64Signature;

    /**
     * Gets the value of the consentNo property.
     * 
     */
    public int getConsentNo() {
        return consentNo;
    }

    /**
     * Sets the value of the consentNo property.
     * 
     */
    public void setConsentNo(int value) {
        this.consentNo = value;
    }

    /**
     * Gets the value of the bypassedReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBypassedReasonCode() {
        return bypassedReasonCode;
    }

    /**
     * Sets the value of the bypassedReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBypassedReasonCode(String value) {
        this.bypassedReasonCode = value;
    }

    /**
     * Gets the value of the updateConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateConsentInfo }{@code >}
     *     
     */
    public JAXBElement<UpdateConsentInfo> getUpdateConsentInfo() {
        return updateConsentInfo;
    }

    /**
     * Sets the value of the updateConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateConsentInfo }{@code >}
     *     
     */
    public void setUpdateConsentInfo(JAXBElement<UpdateConsentInfo> value) {
        this.updateConsentInfo = value;
    }

    /**
     * Gets the value of the insertInstallmentConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsertInstallmentConsentInfo }{@code >}
     *     
     */
    public JAXBElement<InsertInstallmentConsentInfo> getInsertInstallmentConsentInfo() {
        return insertInstallmentConsentInfo;
    }

    /**
     * Sets the value of the insertInstallmentConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsertInstallmentConsentInfo }{@code >}
     *     
     */
    public void setInsertInstallmentConsentInfo(JAXBElement<InsertInstallmentConsentInfo> value) {
        this.insertInstallmentConsentInfo = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplId(String value) {
        this.applId = value;
    }

    /**
     * Gets the value of the signatureTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureTypeCd() {
        return signatureTypeCd;
    }

    /**
     * Sets the value of the signatureTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureTypeCd(String value) {
        this.signatureTypeCd = value;
    }

    /**
     * Gets the value of the base64Signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64Signature() {
        return base64Signature;
    }

    /**
     * Sets the value of the base64Signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64Signature(String value) {
        this.base64Signature = value;
    }

}

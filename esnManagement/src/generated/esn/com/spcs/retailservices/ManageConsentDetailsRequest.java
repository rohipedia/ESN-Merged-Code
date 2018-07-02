
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageConsentDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageConsentDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsentNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BypassedReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="UpdateConsentInfo" type="{java:com.spcs.retailservices.domain}UpdateConsentInfo" minOccurs="0"/&gt;
 *           &lt;element name="InsertConsentInfo" type="{java:com.spcs.retailservices.domain}InsertConsentInfo" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ApplId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SignatureTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Base64Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentProtectionInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LeaseInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditAccountConsentInfo" type="{java:com.spcs.retailservices.domain}CreditAccountConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="HcAgreementInfo" type="{java:com.spcs.retailservices.domain}HcAgreementInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageConsentDetailsRequest", propOrder = {
    "consentNo",
    "bypassedReasonCode",
    "updateConsentInfo",
    "insertConsentInfo",
    "applId",
    "signatureTypeCd",
    "base64Signature",
    "equipmentProtectionInitials",
    "leaseInitials",
    "customerInitials",
    "creditAccountConsentInfo",
    "hcAgreementInfo"
})
public class ManageConsentDetailsRequest
    extends Request
{

    @XmlElement(name = "ConsentNo")
    protected Integer consentNo;
    @XmlElement(name = "BypassedReasonCode", required = true)
    protected String bypassedReasonCode;
    @XmlElementRef(name = "UpdateConsentInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateConsentInfo> updateConsentInfo;
    @XmlElementRef(name = "InsertConsentInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<InsertConsentInfo> insertConsentInfo;
    @XmlElement(name = "ApplId", required = true)
    protected String applId;
    @XmlElement(name = "SignatureTypeCd", required = true)
    protected String signatureTypeCd;
    @XmlElement(name = "Base64Signature")
    protected String base64Signature;
    @XmlElement(name = "EquipmentProtectionInitials")
    protected String equipmentProtectionInitials;
    @XmlElement(name = "LeaseInitials")
    protected String leaseInitials;
    @XmlElement(name = "CustomerInitials")
    protected String customerInitials;
    @XmlElement(name = "CreditAccountConsentInfo")
    protected CreditAccountConsentInfo creditAccountConsentInfo;
    @XmlElement(name = "HcAgreementInfo")
    protected HcAgreementInfo hcAgreementInfo;

    /**
     * Gets the value of the consentNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsentNo() {
        return consentNo;
    }

    /**
     * Sets the value of the consentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsentNo(Integer value) {
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
     * Gets the value of the insertConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsertConsentInfo }{@code >}
     *     
     */
    public JAXBElement<InsertConsentInfo> getInsertConsentInfo() {
        return insertConsentInfo;
    }

    /**
     * Sets the value of the insertConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsertConsentInfo }{@code >}
     *     
     */
    public void setInsertConsentInfo(JAXBElement<InsertConsentInfo> value) {
        this.insertConsentInfo = value;
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

    /**
     * Gets the value of the equipmentProtectionInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentProtectionInitials() {
        return equipmentProtectionInitials;
    }

    /**
     * Sets the value of the equipmentProtectionInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentProtectionInitials(String value) {
        this.equipmentProtectionInitials = value;
    }

    /**
     * Gets the value of the leaseInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseInitials() {
        return leaseInitials;
    }

    /**
     * Sets the value of the leaseInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseInitials(String value) {
        this.leaseInitials = value;
    }

    /**
     * Gets the value of the customerInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerInitials() {
        return customerInitials;
    }

    /**
     * Sets the value of the customerInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerInitials(String value) {
        this.customerInitials = value;
    }

    /**
     * Gets the value of the creditAccountConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAccountConsentInfo }
     *     
     */
    public CreditAccountConsentInfo getCreditAccountConsentInfo() {
        return creditAccountConsentInfo;
    }

    /**
     * Sets the value of the creditAccountConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAccountConsentInfo }
     *     
     */
    public void setCreditAccountConsentInfo(CreditAccountConsentInfo value) {
        this.creditAccountConsentInfo = value;
    }

    /**
     * Gets the value of the hcAgreementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HcAgreementInfo }
     *     
     */
    public HcAgreementInfo getHcAgreementInfo() {
        return hcAgreementInfo;
    }

    /**
     * Sets the value of the hcAgreementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HcAgreementInfo }
     *     
     */
    public void setHcAgreementInfo(HcAgreementInfo value) {
        this.hcAgreementInfo = value;
    }

}

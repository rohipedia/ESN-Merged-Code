
package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertConsentInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertConsentInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="langId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="consentStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bypassConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aslConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aslLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="deviceInsuranceConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="framilyConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autoPayConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fdpConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fdpCCList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="verificationConsentMsaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actvUpgFeeConsentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="walletConsentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertConsentInfoList", propOrder = {
    "ban",
    "langId",
    "consentStatusCode",
    "bypassConsentCode",
    "aslConsentCode",
    "aslLimit",
    "deviceInsuranceConsentCode",
    "framilyConsentCode",
    "autoPayConsentCode",
    "fdpConsentCode",
    "fdpCCList",
    "discountConsentCode",
    "verificationConsentMsaId",
    "actvUpgFeeConsentCode",
    "walletConsentCode",
    "transNo"
})
public class InsertConsentInfoList {

    @XmlElement(required = true)
    protected String ban;
    @XmlElement(required = true)
    protected String langId;
    @XmlElement(required = true)
    protected String consentStatusCode;
    @XmlElement(required = true)
    protected String bypassConsentCode;
    @XmlElement(required = true)
    protected String aslConsentCode;
    protected BigDecimal aslLimit;
    @XmlElement(required = true)
    protected String deviceInsuranceConsentCode;
    @XmlElement(required = true)
    protected String framilyConsentCode;
    @XmlElement(required = true)
    protected String autoPayConsentCode;
    @XmlElement(required = true)
    protected String fdpConsentCode;
    protected String fdpCCList;
    @XmlElement(required = true)
    protected String discountConsentCode;
    protected String verificationConsentMsaId;
    protected String actvUpgFeeConsentCode;
    protected String walletConsentCode;
    protected Long transNo;

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
     * Gets the value of the langId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangId() {
        return langId;
    }

    /**
     * Sets the value of the langId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangId(String value) {
        this.langId = value;
    }

    /**
     * Gets the value of the consentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentStatusCode() {
        return consentStatusCode;
    }

    /**
     * Sets the value of the consentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentStatusCode(String value) {
        this.consentStatusCode = value;
    }

    /**
     * Gets the value of the bypassConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBypassConsentCode() {
        return bypassConsentCode;
    }

    /**
     * Sets the value of the bypassConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBypassConsentCode(String value) {
        this.bypassConsentCode = value;
    }

    /**
     * Gets the value of the aslConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAslConsentCode() {
        return aslConsentCode;
    }

    /**
     * Sets the value of the aslConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAslConsentCode(String value) {
        this.aslConsentCode = value;
    }

    /**
     * Gets the value of the aslLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAslLimit() {
        return aslLimit;
    }

    /**
     * Sets the value of the aslLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAslLimit(BigDecimal value) {
        this.aslLimit = value;
    }

    /**
     * Gets the value of the deviceInsuranceConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceInsuranceConsentCode() {
        return deviceInsuranceConsentCode;
    }

    /**
     * Sets the value of the deviceInsuranceConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceInsuranceConsentCode(String value) {
        this.deviceInsuranceConsentCode = value;
    }

    /**
     * Gets the value of the framilyConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramilyConsentCode() {
        return framilyConsentCode;
    }

    /**
     * Sets the value of the framilyConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramilyConsentCode(String value) {
        this.framilyConsentCode = value;
    }

    /**
     * Gets the value of the autoPayConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayConsentCode() {
        return autoPayConsentCode;
    }

    /**
     * Sets the value of the autoPayConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoPayConsentCode(String value) {
        this.autoPayConsentCode = value;
    }

    /**
     * Gets the value of the fdpConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdpConsentCode() {
        return fdpConsentCode;
    }

    /**
     * Sets the value of the fdpConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdpConsentCode(String value) {
        this.fdpConsentCode = value;
    }

    /**
     * Gets the value of the fdpCCList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdpCCList() {
        return fdpCCList;
    }

    /**
     * Sets the value of the fdpCCList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdpCCList(String value) {
        this.fdpCCList = value;
    }

    /**
     * Gets the value of the discountConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountConsentCode() {
        return discountConsentCode;
    }

    /**
     * Sets the value of the discountConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountConsentCode(String value) {
        this.discountConsentCode = value;
    }

    /**
     * Gets the value of the verificationConsentMsaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationConsentMsaId() {
        return verificationConsentMsaId;
    }

    /**
     * Sets the value of the verificationConsentMsaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationConsentMsaId(String value) {
        this.verificationConsentMsaId = value;
    }

    /**
     * Gets the value of the actvUpgFeeConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActvUpgFeeConsentCode() {
        return actvUpgFeeConsentCode;
    }

    /**
     * Sets the value of the actvUpgFeeConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActvUpgFeeConsentCode(String value) {
        this.actvUpgFeeConsentCode = value;
    }

    /**
     * Gets the value of the walletConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletConsentCode() {
        return walletConsentCode;
    }

    /**
     * Sets the value of the walletConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletConsentCode(String value) {
        this.walletConsentCode = value;
    }

    /**
     * Gets the value of the transNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransNo() {
        return transNo;
    }

    /**
     * Sets the value of the transNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransNo(Long value) {
        this.transNo = value;
    }

}

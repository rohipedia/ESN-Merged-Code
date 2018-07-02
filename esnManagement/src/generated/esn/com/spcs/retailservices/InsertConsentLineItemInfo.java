
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertConsentLineItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertConsentLineItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ptn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceInsuranceSoc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceInsuranceSocMRC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="subId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actUpgFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actUpgFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="etfConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="etfAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="termsConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signatureConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="e911ConsentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tteSocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tteSocMrcAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ContractInfo" type="{java:com.spcs.retailservices.domain}ContractInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertConsentLineItemInfo", propOrder = {
    "ptn",
    "serialNumber",
    "deviceName",
    "deviceInsuranceSoc",
    "deviceInsuranceSocMRC",
    "subId",
    "actUpgFee",
    "actUpgFeeAmount",
    "etfConsentCode",
    "etfAmount",
    "termsConsentCode",
    "signatureConsentCode",
    "e911ConsentCode",
    "activityCode",
    "tteSocCode",
    "tteSocMrcAmt",
    "contractInfo"
})
public class InsertConsentLineItemInfo {

    @XmlElement(required = true)
    protected String ptn;
    @XmlElement(required = true)
    protected String serialNumber;
    @XmlElement(required = true)
    protected String deviceName;
    @XmlElement(required = true)
    protected String deviceInsuranceSoc;
    protected Double deviceInsuranceSocMRC;
    protected String subId;
    protected String actUpgFee;
    protected Double actUpgFeeAmount;
    @XmlElement(required = true)
    protected String etfConsentCode;
    protected Double etfAmount;
    @XmlElement(required = true)
    protected String termsConsentCode;
    @XmlElement(required = true)
    protected String signatureConsentCode;
    @XmlElement(required = true)
    protected String e911ConsentCode;
    @XmlElement(required = true)
    protected String activityCode;
    protected String tteSocCode;
    protected Double tteSocMrcAmt;
    @XmlElement(name = "ContractInfo")
    protected ContractInfo contractInfo;

    /**
     * Gets the value of the ptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtn() {
        return ptn;
    }

    /**
     * Sets the value of the ptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtn(String value) {
        this.ptn = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceInsuranceSoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceInsuranceSoc() {
        return deviceInsuranceSoc;
    }

    /**
     * Sets the value of the deviceInsuranceSoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceInsuranceSoc(String value) {
        this.deviceInsuranceSoc = value;
    }

    /**
     * Gets the value of the deviceInsuranceSocMRC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeviceInsuranceSocMRC() {
        return deviceInsuranceSocMRC;
    }

    /**
     * Sets the value of the deviceInsuranceSocMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeviceInsuranceSocMRC(Double value) {
        this.deviceInsuranceSocMRC = value;
    }

    /**
     * Gets the value of the subId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubId() {
        return subId;
    }

    /**
     * Sets the value of the subId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubId(String value) {
        this.subId = value;
    }

    /**
     * Gets the value of the actUpgFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActUpgFee() {
        return actUpgFee;
    }

    /**
     * Sets the value of the actUpgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActUpgFee(String value) {
        this.actUpgFee = value;
    }

    /**
     * Gets the value of the actUpgFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActUpgFeeAmount() {
        return actUpgFeeAmount;
    }

    /**
     * Sets the value of the actUpgFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActUpgFeeAmount(Double value) {
        this.actUpgFeeAmount = value;
    }

    /**
     * Gets the value of the etfConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtfConsentCode() {
        return etfConsentCode;
    }

    /**
     * Sets the value of the etfConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtfConsentCode(String value) {
        this.etfConsentCode = value;
    }

    /**
     * Gets the value of the etfAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEtfAmount() {
        return etfAmount;
    }

    /**
     * Sets the value of the etfAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEtfAmount(Double value) {
        this.etfAmount = value;
    }

    /**
     * Gets the value of the termsConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsConsentCode() {
        return termsConsentCode;
    }

    /**
     * Sets the value of the termsConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsConsentCode(String value) {
        this.termsConsentCode = value;
    }

    /**
     * Gets the value of the signatureConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureConsentCode() {
        return signatureConsentCode;
    }

    /**
     * Sets the value of the signatureConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureConsentCode(String value) {
        this.signatureConsentCode = value;
    }

    /**
     * Gets the value of the e911ConsentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE911ConsentCode() {
        return e911ConsentCode;
    }

    /**
     * Sets the value of the e911ConsentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE911ConsentCode(String value) {
        this.e911ConsentCode = value;
    }

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the tteSocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTteSocCode() {
        return tteSocCode;
    }

    /**
     * Sets the value of the tteSocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTteSocCode(String value) {
        this.tteSocCode = value;
    }

    /**
     * Gets the value of the tteSocMrcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTteSocMrcAmt() {
        return tteSocMrcAmt;
    }

    /**
     * Sets the value of the tteSocMrcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTteSocMrcAmt(Double value) {
        this.tteSocMrcAmt = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInfo }
     *     
     */
    public ContractInfo getContractInfo() {
        return contractInfo;
    }

    /**
     * Sets the value of the contractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInfo }
     *     
     */
    public void setContractInfo(ContractInfo value) {
        this.contractInfo = value;
    }

}

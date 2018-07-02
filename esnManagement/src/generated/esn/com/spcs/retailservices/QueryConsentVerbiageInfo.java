
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryConsentVerbiageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryConsentVerbiageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consentClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="consentLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="verbiageOne" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="verbiageTwo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contractTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contractDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractTermId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractWording" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceInsurName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryConsentVerbiageInfo", propOrder = {
    "consentClass",
    "consentLabel",
    "verbiageOne",
    "verbiageTwo",
    "languageId",
    "contractTypeId",
    "contractDesc",
    "contractTermId",
    "contractWording",
    "deviceInsurName"
})
public class QueryConsentVerbiageInfo {

    @XmlElement(required = true)
    protected String consentClass;
    @XmlElement(required = true)
    protected String consentLabel;
    @XmlElement(required = true)
    protected String verbiageOne;
    @XmlElement(required = true)
    protected String verbiageTwo;
    protected int languageId;
    protected int contractTypeId;
    @XmlElement(required = true)
    protected String contractDesc;
    @XmlElement(required = true)
    protected String contractTermId;
    @XmlElement(required = true)
    protected String contractWording;
    @XmlElement(required = true)
    protected String deviceInsurName;

    /**
     * Gets the value of the consentClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentClass() {
        return consentClass;
    }

    /**
     * Sets the value of the consentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentClass(String value) {
        this.consentClass = value;
    }

    /**
     * Gets the value of the consentLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentLabel() {
        return consentLabel;
    }

    /**
     * Sets the value of the consentLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentLabel(String value) {
        this.consentLabel = value;
    }

    /**
     * Gets the value of the verbiageOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbiageOne() {
        return verbiageOne;
    }

    /**
     * Sets the value of the verbiageOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbiageOne(String value) {
        this.verbiageOne = value;
    }

    /**
     * Gets the value of the verbiageTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbiageTwo() {
        return verbiageTwo;
    }

    /**
     * Sets the value of the verbiageTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbiageTwo(String value) {
        this.verbiageTwo = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     */
    public int getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     */
    public void setLanguageId(int value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the contractTypeId property.
     * 
     */
    public int getContractTypeId() {
        return contractTypeId;
    }

    /**
     * Sets the value of the contractTypeId property.
     * 
     */
    public void setContractTypeId(int value) {
        this.contractTypeId = value;
    }

    /**
     * Gets the value of the contractDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDesc() {
        return contractDesc;
    }

    /**
     * Sets the value of the contractDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDesc(String value) {
        this.contractDesc = value;
    }

    /**
     * Gets the value of the contractTermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTermId() {
        return contractTermId;
    }

    /**
     * Sets the value of the contractTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTermId(String value) {
        this.contractTermId = value;
    }

    /**
     * Gets the value of the contractWording property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractWording() {
        return contractWording;
    }

    /**
     * Sets the value of the contractWording property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractWording(String value) {
        this.contractWording = value;
    }

    /**
     * Gets the value of the deviceInsurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceInsurName() {
        return deviceInsurName;
    }

    /**
     * Sets the value of the deviceInsurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceInsurName(String value) {
        this.deviceInsurName = value;
    }

}

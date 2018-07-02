
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveBravoConsentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveBravoConsentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emplBaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rmsCustId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contractTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="acceptanceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locBaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salesRepId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="signTypeCd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="base64Sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isE911Consent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractTermMonths" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveBravoConsentRequest", propOrder = {
    "emplBaId",
    "rmsCustId",
    "contractTypeId",
    "acceptanceFlag",
    "locBaId",
    "salesRepId",
    "signTypeCd",
    "mdn",
    "accountNum",
    "base64Sign",
    "isE911Consent",
    "contractStartDate",
    "contractEndDate",
    "contractTermMonths"
})
public class SaveBravoConsentRequest
    extends Request
{

    protected int emplBaId;
    protected int rmsCustId;
    protected int contractTypeId;
    @XmlElement(required = true)
    protected String acceptanceFlag;
    protected int locBaId;
    protected int salesRepId;
    protected int signTypeCd;
    @XmlElement(required = true)
    protected String mdn;
    @XmlElement(required = true)
    protected String accountNum;
    @XmlElement(required = true)
    protected String base64Sign;
    @XmlElement(required = true)
    protected String isE911Consent;
    @XmlElement(required = true)
    protected String contractStartDate;
    @XmlElement(required = true)
    protected String contractEndDate;
    protected int contractTermMonths;

    /**
     * Gets the value of the emplBaId property.
     * 
     */
    public int getEmplBaId() {
        return emplBaId;
    }

    /**
     * Sets the value of the emplBaId property.
     * 
     */
    public void setEmplBaId(int value) {
        this.emplBaId = value;
    }

    /**
     * Gets the value of the rmsCustId property.
     * 
     */
    public int getRmsCustId() {
        return rmsCustId;
    }

    /**
     * Sets the value of the rmsCustId property.
     * 
     */
    public void setRmsCustId(int value) {
        this.rmsCustId = value;
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
     * Gets the value of the acceptanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptanceFlag() {
        return acceptanceFlag;
    }

    /**
     * Sets the value of the acceptanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptanceFlag(String value) {
        this.acceptanceFlag = value;
    }

    /**
     * Gets the value of the locBaId property.
     * 
     */
    public int getLocBaId() {
        return locBaId;
    }

    /**
     * Sets the value of the locBaId property.
     * 
     */
    public void setLocBaId(int value) {
        this.locBaId = value;
    }

    /**
     * Gets the value of the salesRepId property.
     * 
     */
    public int getSalesRepId() {
        return salesRepId;
    }

    /**
     * Sets the value of the salesRepId property.
     * 
     */
    public void setSalesRepId(int value) {
        this.salesRepId = value;
    }

    /**
     * Gets the value of the signTypeCd property.
     * 
     */
    public int getSignTypeCd() {
        return signTypeCd;
    }

    /**
     * Sets the value of the signTypeCd property.
     * 
     */
    public void setSignTypeCd(int value) {
        this.signTypeCd = value;
    }

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdn(String value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

    /**
     * Gets the value of the base64Sign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64Sign() {
        return base64Sign;
    }

    /**
     * Sets the value of the base64Sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64Sign(String value) {
        this.base64Sign = value;
    }

    /**
     * Gets the value of the isE911Consent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsE911Consent() {
        return isE911Consent;
    }

    /**
     * Sets the value of the isE911Consent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsE911Consent(String value) {
        this.isE911Consent = value;
    }

    /**
     * Gets the value of the contractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Sets the value of the contractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStartDate(String value) {
        this.contractStartDate = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractEndDate(String value) {
        this.contractEndDate = value;
    }

    /**
     * Gets the value of the contractTermMonths property.
     * 
     */
    public int getContractTermMonths() {
        return contractTermMonths;
    }

    /**
     * Sets the value of the contractTermMonths property.
     * 
     */
    public void setContractTermMonths(int value) {
        this.contractTermMonths = value;
    }

}

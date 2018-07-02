
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTransSummaryLineItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTransSummaryLineItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deviceChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="newLineInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deviceCoverageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etfAssentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="actvUpgFeeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actvUpgFeeAmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="newAiraveAtaServiceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="newAiraveAtaServiceAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="consentE911Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTransSummaryLineItemInfo", propOrder = {
    "lineNo",
    "mdn",
    "planChangeInd",
    "deviceChangeInd",
    "newLineInd",
    "deviceCoverageCode",
    "contractName",
    "etfAssentCode",
    "tcAssentInd",
    "contractId",
    "actvUpgFeeCd",
    "actvUpgFeeAmt",
    "newAiraveAtaServiceInd",
    "newAiraveAtaServiceAssentInd",
    "consentE911Id"
})
public class InsertTransSummaryLineItemInfo {

    protected int lineNo;
    @XmlElement(name = "Mdn", required = true)
    protected String mdn;
    protected boolean planChangeInd;
    protected boolean deviceChangeInd;
    protected boolean newLineInd;
    protected String deviceCoverageCode;
    protected String contractName;
    protected String etfAssentCode;
    protected Boolean tcAssentInd;
    protected Integer contractId;
    protected String actvUpgFeeCd;
    protected Integer actvUpgFeeAmt;
    protected Boolean newAiraveAtaServiceInd;
    protected Boolean newAiraveAtaServiceAssentInd;
    protected Integer consentE911Id;

    /**
     * Gets the value of the lineNo property.
     * 
     */
    public int getLineNo() {
        return lineNo;
    }

    /**
     * Sets the value of the lineNo property.
     * 
     */
    public void setLineNo(int value) {
        this.lineNo = value;
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
     * Gets the value of the planChangeInd property.
     * 
     */
    public boolean isPlanChangeInd() {
        return planChangeInd;
    }

    /**
     * Sets the value of the planChangeInd property.
     * 
     */
    public void setPlanChangeInd(boolean value) {
        this.planChangeInd = value;
    }

    /**
     * Gets the value of the deviceChangeInd property.
     * 
     */
    public boolean isDeviceChangeInd() {
        return deviceChangeInd;
    }

    /**
     * Sets the value of the deviceChangeInd property.
     * 
     */
    public void setDeviceChangeInd(boolean value) {
        this.deviceChangeInd = value;
    }

    /**
     * Gets the value of the newLineInd property.
     * 
     */
    public boolean isNewLineInd() {
        return newLineInd;
    }

    /**
     * Sets the value of the newLineInd property.
     * 
     */
    public void setNewLineInd(boolean value) {
        this.newLineInd = value;
    }

    /**
     * Gets the value of the deviceCoverageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCoverageCode() {
        return deviceCoverageCode;
    }

    /**
     * Sets the value of the deviceCoverageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCoverageCode(String value) {
        this.deviceCoverageCode = value;
    }

    /**
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractName(String value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the etfAssentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtfAssentCode() {
        return etfAssentCode;
    }

    /**
     * Sets the value of the etfAssentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtfAssentCode(String value) {
        this.etfAssentCode = value;
    }

    /**
     * Gets the value of the tcAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTcAssentInd() {
        return tcAssentInd;
    }

    /**
     * Sets the value of the tcAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTcAssentInd(Boolean value) {
        this.tcAssentInd = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractId(Integer value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the actvUpgFeeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActvUpgFeeCd() {
        return actvUpgFeeCd;
    }

    /**
     * Sets the value of the actvUpgFeeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActvUpgFeeCd(String value) {
        this.actvUpgFeeCd = value;
    }

    /**
     * Gets the value of the actvUpgFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActvUpgFeeAmt() {
        return actvUpgFeeAmt;
    }

    /**
     * Sets the value of the actvUpgFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActvUpgFeeAmt(Integer value) {
        this.actvUpgFeeAmt = value;
    }

    /**
     * Gets the value of the newAiraveAtaServiceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewAiraveAtaServiceInd() {
        return newAiraveAtaServiceInd;
    }

    /**
     * Sets the value of the newAiraveAtaServiceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAiraveAtaServiceInd(Boolean value) {
        this.newAiraveAtaServiceInd = value;
    }

    /**
     * Gets the value of the newAiraveAtaServiceAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewAiraveAtaServiceAssentInd() {
        return newAiraveAtaServiceAssentInd;
    }

    /**
     * Sets the value of the newAiraveAtaServiceAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAiraveAtaServiceAssentInd(Boolean value) {
        this.newAiraveAtaServiceAssentInd = value;
    }

    /**
     * Gets the value of the consentE911Id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsentE911Id() {
        return consentE911Id;
    }

    /**
     * Sets the value of the consentE911Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsentE911Id(Integer value) {
        this.consentE911Id = value;
    }

}

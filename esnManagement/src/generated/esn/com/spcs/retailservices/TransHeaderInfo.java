
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransHeaderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransHeaderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="locBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="regNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="transTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="receiptNotes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="floatNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="loginId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emplBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sRepBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="custBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="transStatus2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allCheckBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="disclaimerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="signatureFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="confirmNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoDrawNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoDrawDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="prLottoControlNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoErrMsgTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expTxnInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webOrderLineItemDelInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="machineId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sharedCashDrawerFloatNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shoppingCartOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fastOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buyBackTotalTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="oneClickReadyInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oneClickInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransHeaderInfo", propOrder = {
    "transNumber",
    "locBaId",
    "regNumber",
    "transTypeId",
    "transDate",
    "subTotal",
    "totalAmt",
    "receiptNotes",
    "transStatus",
    "floatNo",
    "loginId",
    "emplBaId",
    "sRepBaId",
    "custBaId",
    "transStatus2",
    "allCheckBox",
    "disclaimerId",
    "signatureFlag",
    "accountNumber",
    "confirmNumber",
    "prLottoNumber",
    "prLottoDrawNo",
    "prLottoDrawDate",
    "prLottoControlNo",
    "prLottoErrMsgTxt",
    "expTxnInd",
    "webOrderId",
    "webOrderLineItemDelInd",
    "machineId",
    "sharedCashDrawerFloatNo",
    "shoppingCartOrderId",
    "fastOrderId",
    "buyBackTotalTaxAmt",
    "oneClickReadyInd",
    "oneClickInd"
})
public class TransHeaderInfo {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long transNumber;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long locBaId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long regNumber;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long transTypeId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transDate;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double subTotal;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double totalAmt;
    @XmlElement(required = true, nillable = true)
    protected String receiptNotes;
    @XmlElement(required = true, nillable = true)
    protected String transStatus;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long floatNo;
    @XmlElement(required = true, nillable = true)
    protected String loginId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long emplBaId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long sRepBaId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long custBaId;
    @XmlElement(required = true, nillable = true)
    protected String transStatus2;
    @XmlElement(required = true, nillable = true)
    protected String allCheckBox;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long disclaimerId;
    @XmlElement(required = true, nillable = true)
    protected String signatureFlag;
    @XmlElement(required = true, nillable = true)
    protected String accountNumber;
    @XmlElement(required = true, nillable = true)
    protected String confirmNumber;
    @XmlElement(required = true, nillable = true)
    protected String prLottoNumber;
    @XmlElement(required = true, nillable = true)
    protected String prLottoDrawNo;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prLottoDrawDate;
    @XmlElement(required = true, nillable = true)
    protected String prLottoControlNo;
    @XmlElement(required = true, nillable = true)
    protected String prLottoErrMsgTxt;
    @XmlElement(required = true, nillable = true)
    protected String expTxnInd;
    @XmlElement(required = true, nillable = true)
    protected String webOrderId;
    @XmlElement(required = true, nillable = true)
    protected String webOrderLineItemDelInd;
    @XmlElement(required = true, nillable = true)
    protected String machineId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long sharedCashDrawerFloatNo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long shoppingCartOrderId;
    @XmlElement(required = true, nillable = true)
    protected String fastOrderId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double buyBackTotalTaxAmt;
    @XmlElement(required = true, nillable = true)
    protected String oneClickReadyInd;
    @XmlElement(required = true, nillable = true)
    protected String oneClickInd;

    /**
     * Gets the value of the transNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransNumber() {
        return transNumber;
    }

    /**
     * Sets the value of the transNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransNumber(Long value) {
        this.transNumber = value;
    }

    /**
     * Gets the value of the locBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocBaId() {
        return locBaId;
    }

    /**
     * Sets the value of the locBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocBaId(Long value) {
        this.locBaId = value;
    }

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegNumber(Long value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the transTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransTypeId() {
        return transTypeId;
    }

    /**
     * Sets the value of the transTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransTypeId(Long value) {
        this.transTypeId = value;
    }

    /**
     * Gets the value of the transDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransDate() {
        return transDate;
    }

    /**
     * Sets the value of the transDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransDate(XMLGregorianCalendar value) {
        this.transDate = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubTotal(Double value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmt(Double value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the receiptNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNotes() {
        return receiptNotes;
    }

    /**
     * Sets the value of the receiptNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNotes(String value) {
        this.receiptNotes = value;
    }

    /**
     * Gets the value of the transStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransStatus() {
        return transStatus;
    }

    /**
     * Sets the value of the transStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransStatus(String value) {
        this.transStatus = value;
    }

    /**
     * Gets the value of the floatNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFloatNo() {
        return floatNo;
    }

    /**
     * Sets the value of the floatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFloatNo(Long value) {
        this.floatNo = value;
    }

    /**
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginId(String value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the emplBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmplBaId() {
        return emplBaId;
    }

    /**
     * Sets the value of the emplBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmplBaId(Long value) {
        this.emplBaId = value;
    }

    /**
     * Gets the value of the sRepBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSRepBaId() {
        return sRepBaId;
    }

    /**
     * Sets the value of the sRepBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSRepBaId(Long value) {
        this.sRepBaId = value;
    }

    /**
     * Gets the value of the custBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustBaId() {
        return custBaId;
    }

    /**
     * Sets the value of the custBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustBaId(Long value) {
        this.custBaId = value;
    }

    /**
     * Gets the value of the transStatus2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransStatus2() {
        return transStatus2;
    }

    /**
     * Sets the value of the transStatus2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransStatus2(String value) {
        this.transStatus2 = value;
    }

    /**
     * Gets the value of the allCheckBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllCheckBox() {
        return allCheckBox;
    }

    /**
     * Sets the value of the allCheckBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllCheckBox(String value) {
        this.allCheckBox = value;
    }

    /**
     * Gets the value of the disclaimerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisclaimerId() {
        return disclaimerId;
    }

    /**
     * Sets the value of the disclaimerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisclaimerId(Long value) {
        this.disclaimerId = value;
    }

    /**
     * Gets the value of the signatureFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureFlag() {
        return signatureFlag;
    }

    /**
     * Sets the value of the signatureFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureFlag(String value) {
        this.signatureFlag = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the confirmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmNumber() {
        return confirmNumber;
    }

    /**
     * Sets the value of the confirmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmNumber(String value) {
        this.confirmNumber = value;
    }

    /**
     * Gets the value of the prLottoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoNumber() {
        return prLottoNumber;
    }

    /**
     * Sets the value of the prLottoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoNumber(String value) {
        this.prLottoNumber = value;
    }

    /**
     * Gets the value of the prLottoDrawNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoDrawNo() {
        return prLottoDrawNo;
    }

    /**
     * Sets the value of the prLottoDrawNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoDrawNo(String value) {
        this.prLottoDrawNo = value;
    }

    /**
     * Gets the value of the prLottoDrawDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrLottoDrawDate() {
        return prLottoDrawDate;
    }

    /**
     * Sets the value of the prLottoDrawDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrLottoDrawDate(XMLGregorianCalendar value) {
        this.prLottoDrawDate = value;
    }

    /**
     * Gets the value of the prLottoControlNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoControlNo() {
        return prLottoControlNo;
    }

    /**
     * Sets the value of the prLottoControlNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoControlNo(String value) {
        this.prLottoControlNo = value;
    }

    /**
     * Gets the value of the prLottoErrMsgTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoErrMsgTxt() {
        return prLottoErrMsgTxt;
    }

    /**
     * Sets the value of the prLottoErrMsgTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoErrMsgTxt(String value) {
        this.prLottoErrMsgTxt = value;
    }

    /**
     * Gets the value of the expTxnInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpTxnInd() {
        return expTxnInd;
    }

    /**
     * Sets the value of the expTxnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpTxnInd(String value) {
        this.expTxnInd = value;
    }

    /**
     * Gets the value of the webOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebOrderId() {
        return webOrderId;
    }

    /**
     * Sets the value of the webOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebOrderId(String value) {
        this.webOrderId = value;
    }

    /**
     * Gets the value of the webOrderLineItemDelInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebOrderLineItemDelInd() {
        return webOrderLineItemDelInd;
    }

    /**
     * Sets the value of the webOrderLineItemDelInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebOrderLineItemDelInd(String value) {
        this.webOrderLineItemDelInd = value;
    }

    /**
     * Gets the value of the machineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineId() {
        return machineId;
    }

    /**
     * Sets the value of the machineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineId(String value) {
        this.machineId = value;
    }

    /**
     * Gets the value of the sharedCashDrawerFloatNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedCashDrawerFloatNo() {
        return sharedCashDrawerFloatNo;
    }

    /**
     * Sets the value of the sharedCashDrawerFloatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedCashDrawerFloatNo(Long value) {
        this.sharedCashDrawerFloatNo = value;
    }

    /**
     * Gets the value of the shoppingCartOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShoppingCartOrderId() {
        return shoppingCartOrderId;
    }

    /**
     * Sets the value of the shoppingCartOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShoppingCartOrderId(Long value) {
        this.shoppingCartOrderId = value;
    }

    /**
     * Gets the value of the fastOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastOrderId() {
        return fastOrderId;
    }

    /**
     * Sets the value of the fastOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastOrderId(String value) {
        this.fastOrderId = value;
    }

    /**
     * Gets the value of the buyBackTotalTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuyBackTotalTaxAmt() {
        return buyBackTotalTaxAmt;
    }

    /**
     * Sets the value of the buyBackTotalTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuyBackTotalTaxAmt(Double value) {
        this.buyBackTotalTaxAmt = value;
    }

    /**
     * Gets the value of the oneClickReadyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneClickReadyInd() {
        return oneClickReadyInd;
    }

    /**
     * Sets the value of the oneClickReadyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneClickReadyInd(String value) {
        this.oneClickReadyInd = value;
    }

    /**
     * Gets the value of the oneClickInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneClickInd() {
        return oneClickInd;
    }

    /**
     * Sets the value of the oneClickInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneClickInd(String value) {
        this.oneClickInd = value;
    }

}

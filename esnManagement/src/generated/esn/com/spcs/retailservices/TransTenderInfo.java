
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransTenderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransTenderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tenderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lineItem" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tenderAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="approvalNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="frgnCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="frgnAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="frgnXchng" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tenderNm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refTransNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="authBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tenderCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pnRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dispccExpFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sysTrcAuditNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prchFrstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prchLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="poNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccEntryMethodIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccZipCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccEaiReturnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccEaiReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccEaiReasonTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vendRefTraceNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vendRespMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transApprvStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partialBypassReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partialBypassAuthId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partialBalanceAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nfcIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signatureOverrideIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webOrderCardTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preCashAccntNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preAuthCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="responseDttm" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="paymntCardHandle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymntTransId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="servicePoNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="qPayTransId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="qpayEquipmentCharges" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="shoppingCardPaymentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ccTransNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eppRequesId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eppExternalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postableAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentApiName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransTenderInfo", propOrder = {
    "transNumber",
    "tenderId",
    "lineItem",
    "tenderAmt",
    "account",
    "expiryDate",
    "approvalNo",
    "authCode",
    "idType",
    "idNumber",
    "frgnCurrencyCode",
    "frgnAmt",
    "frgnXchng",
    "tenderNm",
    "refTransNo",
    "authBaId",
    "tenderCd",
    "pnRef",
    "dispccExpFlag",
    "sysTrcAuditNo",
    "custName",
    "tranId",
    "prchFrstName",
    "prchLastName",
    "poNbr",
    "ccEntryMethodIndcr",
    "ccZipCd",
    "ccEaiReturnCode",
    "ccEaiReasonCode",
    "ccEaiReasonTxt",
    "vendRefTraceNum",
    "vendRespMsg",
    "transApprvStatus",
    "partialBypassReason",
    "partialBypassAuthId",
    "partialBalanceAmt",
    "nfcIndcr",
    "signatureOverrideIndcr",
    "webOrderCardTypeCd",
    "preCashAccntNbr",
    "preAuthCode",
    "responseDttm",
    "paymntCardHandle",
    "paymntTransId",
    "servicePoNum",
    "qPayTransId",
    "qpayEquipmentCharges",
    "shoppingCardPaymentId",
    "ccTransNbr",
    "eppRequesId",
    "eppExternalId",
    "postableAmount",
    "paymentApiName",
    "paymentToken"
})
public class TransTenderInfo {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long transNumber;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long tenderId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long lineItem;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tenderAmt;
    @XmlElement(required = true, nillable = true)
    protected String account;
    @XmlElement(required = true, nillable = true)
    protected String expiryDate;
    @XmlElement(required = true, nillable = true)
    protected String approvalNo;
    @XmlElement(required = true, nillable = true)
    protected String authCode;
    @XmlElement(required = true, nillable = true)
    protected String idType;
    @XmlElement(required = true, nillable = true)
    protected String idNumber;
    @XmlElement(required = true, nillable = true)
    protected String frgnCurrencyCode;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double frgnAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double frgnXchng;
    @XmlElement(required = true, nillable = true)
    protected String tenderNm;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long refTransNo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long authBaId;
    @XmlElement(required = true, nillable = true)
    protected String tenderCd;
    @XmlElement(required = true, nillable = true)
    protected String pnRef;
    @XmlElement(required = true, nillable = true)
    protected String dispccExpFlag;
    @XmlElement(required = true, nillable = true)
    protected String sysTrcAuditNo;
    @XmlElement(required = true, nillable = true)
    protected String custName;
    @XmlElement(required = true, nillable = true)
    protected String tranId;
    @XmlElement(required = true, nillable = true)
    protected String prchFrstName;
    @XmlElement(required = true, nillable = true)
    protected String prchLastName;
    @XmlElement(required = true, nillable = true)
    protected String poNbr;
    @XmlElement(required = true, nillable = true)
    protected String ccEntryMethodIndcr;
    @XmlElement(required = true, nillable = true)
    protected String ccZipCd;
    @XmlElement(required = true, nillable = true)
    protected String ccEaiReturnCode;
    @XmlElement(required = true, nillable = true)
    protected String ccEaiReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String ccEaiReasonTxt;
    @XmlElement(required = true, nillable = true)
    protected String vendRefTraceNum;
    @XmlElement(required = true, nillable = true)
    protected String vendRespMsg;
    @XmlElement(required = true, nillable = true)
    protected String transApprvStatus;
    @XmlElement(required = true, nillable = true)
    protected String partialBypassReason;
    @XmlElement(required = true, nillable = true)
    protected String partialBypassAuthId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double partialBalanceAmt;
    @XmlElement(required = true, nillable = true)
    protected String nfcIndcr;
    @XmlElement(required = true, nillable = true)
    protected String signatureOverrideIndcr;
    @XmlElement(required = true, nillable = true)
    protected String webOrderCardTypeCd;
    @XmlElement(required = true, nillable = true)
    protected String preCashAccntNbr;
    @XmlElement(required = true, nillable = true)
    protected String preAuthCode;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseDttm;
    @XmlElement(required = true, nillable = true)
    protected String paymntCardHandle;
    @XmlElement(required = true, nillable = true)
    protected String paymntTransId;
    @XmlElement(required = true, nillable = true)
    protected String servicePoNum;
    @XmlElement(required = true, nillable = true)
    protected String qPayTransId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double qpayEquipmentCharges;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long shoppingCardPaymentId;
    @XmlElement(required = true, nillable = true)
    protected String ccTransNbr;
    @XmlElement(required = true, nillable = true)
    protected String eppRequesId;
    @XmlElement(required = true, nillable = true)
    protected String eppExternalId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double postableAmount;
    @XmlElement(required = true, nillable = true)
    protected String paymentApiName;
    @XmlElement(required = true, nillable = true)
    protected String paymentToken;

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
     * Gets the value of the tenderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTenderId() {
        return tenderId;
    }

    /**
     * Sets the value of the tenderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTenderId(Long value) {
        this.tenderId = value;
    }

    /**
     * Gets the value of the lineItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItem(Long value) {
        this.lineItem = value;
    }

    /**
     * Gets the value of the tenderAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTenderAmt() {
        return tenderAmt;
    }

    /**
     * Sets the value of the tenderAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTenderAmt(Double value) {
        this.tenderAmt = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
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
     * Gets the value of the approvalNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalNo() {
        return approvalNo;
    }

    /**
     * Sets the value of the approvalNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalNo(String value) {
        this.approvalNo = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the frgnCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrgnCurrencyCode() {
        return frgnCurrencyCode;
    }

    /**
     * Sets the value of the frgnCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrgnCurrencyCode(String value) {
        this.frgnCurrencyCode = value;
    }

    /**
     * Gets the value of the frgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrgnAmt() {
        return frgnAmt;
    }

    /**
     * Sets the value of the frgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrgnAmt(Double value) {
        this.frgnAmt = value;
    }

    /**
     * Gets the value of the frgnXchng property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrgnXchng() {
        return frgnXchng;
    }

    /**
     * Sets the value of the frgnXchng property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrgnXchng(Double value) {
        this.frgnXchng = value;
    }

    /**
     * Gets the value of the tenderNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderNm() {
        return tenderNm;
    }

    /**
     * Sets the value of the tenderNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderNm(String value) {
        this.tenderNm = value;
    }

    /**
     * Gets the value of the refTransNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefTransNo() {
        return refTransNo;
    }

    /**
     * Sets the value of the refTransNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefTransNo(Long value) {
        this.refTransNo = value;
    }

    /**
     * Gets the value of the authBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthBaId() {
        return authBaId;
    }

    /**
     * Sets the value of the authBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthBaId(Long value) {
        this.authBaId = value;
    }

    /**
     * Gets the value of the tenderCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderCd() {
        return tenderCd;
    }

    /**
     * Sets the value of the tenderCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderCd(String value) {
        this.tenderCd = value;
    }

    /**
     * Gets the value of the pnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnRef() {
        return pnRef;
    }

    /**
     * Sets the value of the pnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnRef(String value) {
        this.pnRef = value;
    }

    /**
     * Gets the value of the dispccExpFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispccExpFlag() {
        return dispccExpFlag;
    }

    /**
     * Sets the value of the dispccExpFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispccExpFlag(String value) {
        this.dispccExpFlag = value;
    }

    /**
     * Gets the value of the sysTrcAuditNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTrcAuditNo() {
        return sysTrcAuditNo;
    }

    /**
     * Sets the value of the sysTrcAuditNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysTrcAuditNo(String value) {
        this.sysTrcAuditNo = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the tranId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * Sets the value of the tranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * Gets the value of the prchFrstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrchFrstName() {
        return prchFrstName;
    }

    /**
     * Sets the value of the prchFrstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrchFrstName(String value) {
        this.prchFrstName = value;
    }

    /**
     * Gets the value of the prchLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrchLastName() {
        return prchLastName;
    }

    /**
     * Sets the value of the prchLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrchLastName(String value) {
        this.prchLastName = value;
    }

    /**
     * Gets the value of the poNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNbr() {
        return poNbr;
    }

    /**
     * Sets the value of the poNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNbr(String value) {
        this.poNbr = value;
    }

    /**
     * Gets the value of the ccEntryMethodIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcEntryMethodIndcr() {
        return ccEntryMethodIndcr;
    }

    /**
     * Sets the value of the ccEntryMethodIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcEntryMethodIndcr(String value) {
        this.ccEntryMethodIndcr = value;
    }

    /**
     * Gets the value of the ccZipCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcZipCd() {
        return ccZipCd;
    }

    /**
     * Sets the value of the ccZipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcZipCd(String value) {
        this.ccZipCd = value;
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
     * Gets the value of the vendRefTraceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendRefTraceNum() {
        return vendRefTraceNum;
    }

    /**
     * Sets the value of the vendRefTraceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendRefTraceNum(String value) {
        this.vendRefTraceNum = value;
    }

    /**
     * Gets the value of the vendRespMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendRespMsg() {
        return vendRespMsg;
    }

    /**
     * Sets the value of the vendRespMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendRespMsg(String value) {
        this.vendRespMsg = value;
    }

    /**
     * Gets the value of the transApprvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransApprvStatus() {
        return transApprvStatus;
    }

    /**
     * Sets the value of the transApprvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransApprvStatus(String value) {
        this.transApprvStatus = value;
    }

    /**
     * Gets the value of the partialBypassReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialBypassReason() {
        return partialBypassReason;
    }

    /**
     * Sets the value of the partialBypassReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialBypassReason(String value) {
        this.partialBypassReason = value;
    }

    /**
     * Gets the value of the partialBypassAuthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialBypassAuthId() {
        return partialBypassAuthId;
    }

    /**
     * Sets the value of the partialBypassAuthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialBypassAuthId(String value) {
        this.partialBypassAuthId = value;
    }

    /**
     * Gets the value of the partialBalanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPartialBalanceAmt() {
        return partialBalanceAmt;
    }

    /**
     * Sets the value of the partialBalanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPartialBalanceAmt(Double value) {
        this.partialBalanceAmt = value;
    }

    /**
     * Gets the value of the nfcIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfcIndcr() {
        return nfcIndcr;
    }

    /**
     * Sets the value of the nfcIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfcIndcr(String value) {
        this.nfcIndcr = value;
    }

    /**
     * Gets the value of the signatureOverrideIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureOverrideIndcr() {
        return signatureOverrideIndcr;
    }

    /**
     * Sets the value of the signatureOverrideIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureOverrideIndcr(String value) {
        this.signatureOverrideIndcr = value;
    }

    /**
     * Gets the value of the webOrderCardTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebOrderCardTypeCd() {
        return webOrderCardTypeCd;
    }

    /**
     * Sets the value of the webOrderCardTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebOrderCardTypeCd(String value) {
        this.webOrderCardTypeCd = value;
    }

    /**
     * Gets the value of the preCashAccntNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCashAccntNbr() {
        return preCashAccntNbr;
    }

    /**
     * Sets the value of the preCashAccntNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCashAccntNbr(String value) {
        this.preCashAccntNbr = value;
    }

    /**
     * Gets the value of the preAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreAuthCode() {
        return preAuthCode;
    }

    /**
     * Sets the value of the preAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreAuthCode(String value) {
        this.preAuthCode = value;
    }

    /**
     * Gets the value of the responseDttm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDttm() {
        return responseDttm;
    }

    /**
     * Sets the value of the responseDttm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDttm(XMLGregorianCalendar value) {
        this.responseDttm = value;
    }

    /**
     * Gets the value of the paymntCardHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymntCardHandle() {
        return paymntCardHandle;
    }

    /**
     * Sets the value of the paymntCardHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymntCardHandle(String value) {
        this.paymntCardHandle = value;
    }

    /**
     * Gets the value of the paymntTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymntTransId() {
        return paymntTransId;
    }

    /**
     * Sets the value of the paymntTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymntTransId(String value) {
        this.paymntTransId = value;
    }

    /**
     * Gets the value of the servicePoNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePoNum() {
        return servicePoNum;
    }

    /**
     * Sets the value of the servicePoNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePoNum(String value) {
        this.servicePoNum = value;
    }

    /**
     * Gets the value of the qPayTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQPayTransId() {
        return qPayTransId;
    }

    /**
     * Sets the value of the qPayTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQPayTransId(String value) {
        this.qPayTransId = value;
    }

    /**
     * Gets the value of the qpayEquipmentCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQpayEquipmentCharges() {
        return qpayEquipmentCharges;
    }

    /**
     * Sets the value of the qpayEquipmentCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQpayEquipmentCharges(Double value) {
        this.qpayEquipmentCharges = value;
    }

    /**
     * Gets the value of the shoppingCardPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShoppingCardPaymentId() {
        return shoppingCardPaymentId;
    }

    /**
     * Sets the value of the shoppingCardPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShoppingCardPaymentId(Long value) {
        this.shoppingCardPaymentId = value;
    }

    /**
     * Gets the value of the ccTransNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcTransNbr() {
        return ccTransNbr;
    }

    /**
     * Sets the value of the ccTransNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcTransNbr(String value) {
        this.ccTransNbr = value;
    }

    /**
     * Gets the value of the eppRequesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEppRequesId() {
        return eppRequesId;
    }

    /**
     * Sets the value of the eppRequesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEppRequesId(String value) {
        this.eppRequesId = value;
    }

    /**
     * Gets the value of the eppExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEppExternalId() {
        return eppExternalId;
    }

    /**
     * Sets the value of the eppExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEppExternalId(String value) {
        this.eppExternalId = value;
    }

    /**
     * Gets the value of the postableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPostableAmount() {
        return postableAmount;
    }

    /**
     * Sets the value of the postableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPostableAmount(Double value) {
        this.postableAmount = value;
    }

    /**
     * Gets the value of the paymentApiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentApiName() {
        return paymentApiName;
    }

    /**
     * Sets the value of the paymentApiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentApiName(String value) {
        this.paymentApiName = value;
    }

    /**
     * Gets the value of the paymentToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the value of the paymentToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentToken(String value) {
        this.paymentToken = value;
    }

}

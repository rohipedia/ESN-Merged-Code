
package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoanDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ban" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="loanDownPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="loanAPR" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="financeChargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="totalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="installmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="lastInstallmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loanPaymentStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="loanPaymentEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="loanTermDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="esrpAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="residualValueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="addnlDownPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="addnlDPDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Taxes" type="{java:com.spcs.retailservices.domain}Taxes"/&gt;
 *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lineType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agreementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="monthToMonthAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="financingModelInfo" type="{java:com.spcs.retailservices.domain}FinancingModelInfo" minOccurs="0"/&gt;
 *         &lt;element name="macInfo" type="{java:com.spcs.retailservices.domain}MacInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanDetailsInfo", propOrder = {
    "ban",
    "mdn",
    "loanAmount",
    "loanDownPaymentAmount",
    "loanAPR",
    "financeChargeAmount",
    "totalPaymentAmount",
    "installmentAmount",
    "lastInstallmentAmount",
    "loanTerm",
    "loanPaymentStartDate",
    "loanPaymentEndDate",
    "loanDate",
    "loanTermDesc",
    "esrpAmount",
    "discountAmount",
    "residualValueAmount",
    "addnlDownPaymentAmount",
    "addnlDPDiscountAmount",
    "discountType",
    "taxes",
    "lineNo",
    "lineType",
    "contractType",
    "agreementNumber",
    "monthToMonthAmount",
    "financingModelInfo",
    "macInfo"
})
public class LoanDetailsInfo {

    @XmlElement(name = "Ban", required = true)
    protected String ban;
    @XmlElement(required = true)
    protected String mdn;
    @XmlElement(required = true)
    protected BigDecimal loanAmount;
    @XmlElement(required = true)
    protected BigDecimal loanDownPaymentAmount;
    @XmlElement(required = true)
    protected BigDecimal loanAPR;
    @XmlElement(required = true)
    protected BigDecimal financeChargeAmount;
    @XmlElement(required = true)
    protected BigDecimal totalPaymentAmount;
    @XmlElement(required = true)
    protected BigDecimal installmentAmount;
    @XmlElement(required = true)
    protected BigDecimal lastInstallmentAmount;
    protected int loanTerm;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loanPaymentStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loanPaymentEndDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loanDate;
    @XmlElement(required = true)
    protected String loanTermDesc;
    @XmlElement(required = true)
    protected BigDecimal esrpAmount;
    @XmlElement(required = true)
    protected BigDecimal discountAmount;
    @XmlElement(required = true)
    protected BigDecimal residualValueAmount;
    @XmlElement(required = true)
    protected BigDecimal addnlDownPaymentAmount;
    @XmlElement(required = true)
    protected BigDecimal addnlDPDiscountAmount;
    @XmlElement(required = true)
    protected String discountType;
    @XmlElement(name = "Taxes", required = true)
    protected Taxes taxes;
    protected int lineNo;
    @XmlElement(required = true)
    protected String lineType;
    @XmlElement(required = true)
    protected String contractType;
    @XmlElement(required = true)
    protected String agreementNumber;
    @XmlElement(required = true)
    protected BigDecimal monthToMonthAmount;
    protected FinancingModelInfo financingModelInfo;
    protected MacInfo macInfo;

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
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmount(BigDecimal value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the loanDownPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanDownPaymentAmount() {
        return loanDownPaymentAmount;
    }

    /**
     * Sets the value of the loanDownPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanDownPaymentAmount(BigDecimal value) {
        this.loanDownPaymentAmount = value;
    }

    /**
     * Gets the value of the loanAPR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAPR() {
        return loanAPR;
    }

    /**
     * Sets the value of the loanAPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAPR(BigDecimal value) {
        this.loanAPR = value;
    }

    /**
     * Gets the value of the financeChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinanceChargeAmount() {
        return financeChargeAmount;
    }

    /**
     * Sets the value of the financeChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinanceChargeAmount(BigDecimal value) {
        this.financeChargeAmount = value;
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPaymentAmount(BigDecimal value) {
        this.totalPaymentAmount = value;
    }

    /**
     * Gets the value of the installmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Sets the value of the installmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentAmount(BigDecimal value) {
        this.installmentAmount = value;
    }

    /**
     * Gets the value of the lastInstallmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastInstallmentAmount() {
        return lastInstallmentAmount;
    }

    /**
     * Sets the value of the lastInstallmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastInstallmentAmount(BigDecimal value) {
        this.lastInstallmentAmount = value;
    }

    /**
     * Gets the value of the loanTerm property.
     * 
     */
    public int getLoanTerm() {
        return loanTerm;
    }

    /**
     * Sets the value of the loanTerm property.
     * 
     */
    public void setLoanTerm(int value) {
        this.loanTerm = value;
    }

    /**
     * Gets the value of the loanPaymentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanPaymentStartDate() {
        return loanPaymentStartDate;
    }

    /**
     * Sets the value of the loanPaymentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanPaymentStartDate(XMLGregorianCalendar value) {
        this.loanPaymentStartDate = value;
    }

    /**
     * Gets the value of the loanPaymentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanPaymentEndDate() {
        return loanPaymentEndDate;
    }

    /**
     * Sets the value of the loanPaymentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanPaymentEndDate(XMLGregorianCalendar value) {
        this.loanPaymentEndDate = value;
    }

    /**
     * Gets the value of the loanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanDate() {
        return loanDate;
    }

    /**
     * Sets the value of the loanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanDate(XMLGregorianCalendar value) {
        this.loanDate = value;
    }

    /**
     * Gets the value of the loanTermDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTermDesc() {
        return loanTermDesc;
    }

    /**
     * Sets the value of the loanTermDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTermDesc(String value) {
        this.loanTermDesc = value;
    }

    /**
     * Gets the value of the esrpAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEsrpAmount() {
        return esrpAmount;
    }

    /**
     * Sets the value of the esrpAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEsrpAmount(BigDecimal value) {
        this.esrpAmount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the residualValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidualValueAmount() {
        return residualValueAmount;
    }

    /**
     * Sets the value of the residualValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResidualValueAmount(BigDecimal value) {
        this.residualValueAmount = value;
    }

    /**
     * Gets the value of the addnlDownPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddnlDownPaymentAmount() {
        return addnlDownPaymentAmount;
    }

    /**
     * Sets the value of the addnlDownPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddnlDownPaymentAmount(BigDecimal value) {
        this.addnlDownPaymentAmount = value;
    }

    /**
     * Gets the value of the addnlDPDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddnlDPDiscountAmount() {
        return addnlDPDiscountAmount;
    }

    /**
     * Sets the value of the addnlDPDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddnlDPDiscountAmount(BigDecimal value) {
        this.addnlDPDiscountAmount = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountType(String value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link Taxes }
     *     
     */
    public Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxes }
     *     
     */
    public void setTaxes(Taxes value) {
        this.taxes = value;
    }

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
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineType(String value) {
        this.lineType = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the monthToMonthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthToMonthAmount() {
        return monthToMonthAmount;
    }

    /**
     * Sets the value of the monthToMonthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthToMonthAmount(BigDecimal value) {
        this.monthToMonthAmount = value;
    }

    /**
     * Gets the value of the financingModelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingModelInfo }
     *     
     */
    public FinancingModelInfo getFinancingModelInfo() {
        return financingModelInfo;
    }

    /**
     * Sets the value of the financingModelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingModelInfo }
     *     
     */
    public void setFinancingModelInfo(FinancingModelInfo value) {
        this.financingModelInfo = value;
    }

    /**
     * Gets the value of the macInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MacInfo }
     *     
     */
    public MacInfo getMacInfo() {
        return macInfo;
    }

    /**
     * Sets the value of the macInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacInfo }
     *     
     */
    public void setMacInfo(MacInfo value) {
        this.macInfo = value;
    }

}

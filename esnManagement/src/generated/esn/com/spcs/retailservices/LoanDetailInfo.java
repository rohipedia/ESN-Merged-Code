
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoanDetailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanDetailInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lineItemType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="loanDownPayment" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="annualPercentageRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="financeCharge" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="installmentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="lastInstallmentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loanPaymentStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="loanPaymentEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="contractModelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residualLeaseAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="additionalDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthToMonthAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
@XmlType(name = "LoanDetailInfo", propOrder = {
    "lineNo",
    "lineItemType",
    "loanNumber",
    "loanAmount",
    "loanDownPayment",
    "annualPercentageRate",
    "financeCharge",
    "totalPaymentAmount",
    "installmentAmount",
    "lastInstallmentAmount",
    "loanTerm",
    "loanPaymentStartDate",
    "loanPaymentEndDate",
    "loanDate",
    "contractModelType",
    "residualLeaseAmt",
    "additionalAmount",
    "additionalDiscount",
    "discountType",
    "monthToMonthAmount",
    "macInfo"
})
public class LoanDetailInfo {

    protected int lineNo;
    @XmlElement(required = true)
    protected String lineItemType;
    protected String loanNumber;
    protected double loanAmount;
    protected double loanDownPayment;
    protected double annualPercentageRate;
    protected double financeCharge;
    protected double totalPaymentAmount;
    protected double installmentAmount;
    protected double lastInstallmentAmount;
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
    protected String contractModelType;
    protected Double residualLeaseAmt;
    protected Double additionalAmount;
    protected Double additionalDiscount;
    protected String discountType;
    protected Double monthToMonthAmount;
    protected MacInfo macInfo;

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
     * Gets the value of the lineItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemType() {
        return lineItemType;
    }

    /**
     * Sets the value of the lineItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemType(String value) {
        this.lineItemType = value;
    }

    /**
     * Gets the value of the loanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNumber() {
        return loanNumber;
    }

    /**
     * Sets the value of the loanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNumber(String value) {
        this.loanNumber = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     */
    public void setLoanAmount(double value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the loanDownPayment property.
     * 
     */
    public double getLoanDownPayment() {
        return loanDownPayment;
    }

    /**
     * Sets the value of the loanDownPayment property.
     * 
     */
    public void setLoanDownPayment(double value) {
        this.loanDownPayment = value;
    }

    /**
     * Gets the value of the annualPercentageRate property.
     * 
     */
    public double getAnnualPercentageRate() {
        return annualPercentageRate;
    }

    /**
     * Sets the value of the annualPercentageRate property.
     * 
     */
    public void setAnnualPercentageRate(double value) {
        this.annualPercentageRate = value;
    }

    /**
     * Gets the value of the financeCharge property.
     * 
     */
    public double getFinanceCharge() {
        return financeCharge;
    }

    /**
     * Sets the value of the financeCharge property.
     * 
     */
    public void setFinanceCharge(double value) {
        this.financeCharge = value;
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     */
    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     */
    public void setTotalPaymentAmount(double value) {
        this.totalPaymentAmount = value;
    }

    /**
     * Gets the value of the installmentAmount property.
     * 
     */
    public double getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Sets the value of the installmentAmount property.
     * 
     */
    public void setInstallmentAmount(double value) {
        this.installmentAmount = value;
    }

    /**
     * Gets the value of the lastInstallmentAmount property.
     * 
     */
    public double getLastInstallmentAmount() {
        return lastInstallmentAmount;
    }

    /**
     * Sets the value of the lastInstallmentAmount property.
     * 
     */
    public void setLastInstallmentAmount(double value) {
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
     * Gets the value of the contractModelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractModelType() {
        return contractModelType;
    }

    /**
     * Sets the value of the contractModelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractModelType(String value) {
        this.contractModelType = value;
    }

    /**
     * Gets the value of the residualLeaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResidualLeaseAmt() {
        return residualLeaseAmt;
    }

    /**
     * Sets the value of the residualLeaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResidualLeaseAmt(Double value) {
        this.residualLeaseAmt = value;
    }

    /**
     * Gets the value of the additionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Sets the value of the additionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalAmount(Double value) {
        this.additionalAmount = value;
    }

    /**
     * Gets the value of the additionalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalDiscount() {
        return additionalDiscount;
    }

    /**
     * Sets the value of the additionalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalDiscount(Double value) {
        this.additionalDiscount = value;
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
     * Gets the value of the monthToMonthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMonthToMonthAmount() {
        return monthToMonthAmount;
    }

    /**
     * Sets the value of the monthToMonthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMonthToMonthAmount(Double value) {
        this.monthToMonthAmount = value;
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

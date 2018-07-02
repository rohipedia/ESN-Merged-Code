
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentInstallBillLeaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInstallBillLeaseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentInstallmentTypeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="downpaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="contractTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="equipmentInstallBillTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="equipmentInstallBillLoanContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanMonthlyPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="additionalDownpaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="equipmentLoanSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="leaseInfo" type="{java:com.spcs.retailservices.domain}LeaseInfo" minOccurs="0"/&gt;
 *         &lt;element name="earlyUpgradeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfInstallmentsPaid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInstallBillLeaseInfo", propOrder = {
    "equipmentInstallmentTypeIndicator",
    "downpaymentAmount",
    "contractTerm",
    "equipmentInstallBillTaxAmount",
    "equipmentInstallBillLoanContractNumber",
    "loanMonthlyPaymentAmount",
    "additionalDownpaymentAmount",
    "equipmentLoanSequenceNumber",
    "leaseInfo",
    "earlyUpgradeIndicator",
    "numberOfInstallmentsPaid"
})
public class EquipmentInstallBillLeaseInfo {

    protected String equipmentInstallmentTypeIndicator;
    protected Double downpaymentAmount;
    protected Integer contractTerm;
    protected Double equipmentInstallBillTaxAmount;
    protected String equipmentInstallBillLoanContractNumber;
    protected Double loanMonthlyPaymentAmount;
    protected Double additionalDownpaymentAmount;
    protected Integer equipmentLoanSequenceNumber;
    protected LeaseInfo leaseInfo;
    protected String earlyUpgradeIndicator;
    protected Integer numberOfInstallmentsPaid;

    /**
     * Gets the value of the equipmentInstallmentTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentInstallmentTypeIndicator() {
        return equipmentInstallmentTypeIndicator;
    }

    /**
     * Sets the value of the equipmentInstallmentTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentInstallmentTypeIndicator(String value) {
        this.equipmentInstallmentTypeIndicator = value;
    }

    /**
     * Gets the value of the downpaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownpaymentAmount() {
        return downpaymentAmount;
    }

    /**
     * Sets the value of the downpaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownpaymentAmount(Double value) {
        this.downpaymentAmount = value;
    }

    /**
     * Gets the value of the contractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractTerm(Integer value) {
        this.contractTerm = value;
    }

    /**
     * Gets the value of the equipmentInstallBillTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEquipmentInstallBillTaxAmount() {
        return equipmentInstallBillTaxAmount;
    }

    /**
     * Sets the value of the equipmentInstallBillTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEquipmentInstallBillTaxAmount(Double value) {
        this.equipmentInstallBillTaxAmount = value;
    }

    /**
     * Gets the value of the equipmentInstallBillLoanContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentInstallBillLoanContractNumber() {
        return equipmentInstallBillLoanContractNumber;
    }

    /**
     * Sets the value of the equipmentInstallBillLoanContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentInstallBillLoanContractNumber(String value) {
        this.equipmentInstallBillLoanContractNumber = value;
    }

    /**
     * Gets the value of the loanMonthlyPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoanMonthlyPaymentAmount() {
        return loanMonthlyPaymentAmount;
    }

    /**
     * Sets the value of the loanMonthlyPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoanMonthlyPaymentAmount(Double value) {
        this.loanMonthlyPaymentAmount = value;
    }

    /**
     * Gets the value of the additionalDownpaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalDownpaymentAmount() {
        return additionalDownpaymentAmount;
    }

    /**
     * Sets the value of the additionalDownpaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalDownpaymentAmount(Double value) {
        this.additionalDownpaymentAmount = value;
    }

    /**
     * Gets the value of the equipmentLoanSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEquipmentLoanSequenceNumber() {
        return equipmentLoanSequenceNumber;
    }

    /**
     * Sets the value of the equipmentLoanSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEquipmentLoanSequenceNumber(Integer value) {
        this.equipmentLoanSequenceNumber = value;
    }

    /**
     * Gets the value of the leaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseInfo }
     *     
     */
    public LeaseInfo getLeaseInfo() {
        return leaseInfo;
    }

    /**
     * Sets the value of the leaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseInfo }
     *     
     */
    public void setLeaseInfo(LeaseInfo value) {
        this.leaseInfo = value;
    }

    /**
     * Gets the value of the earlyUpgradeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyUpgradeIndicator() {
        return earlyUpgradeIndicator;
    }

    /**
     * Sets the value of the earlyUpgradeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyUpgradeIndicator(String value) {
        this.earlyUpgradeIndicator = value;
    }

    /**
     * Gets the value of the numberOfInstallmentsPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfInstallmentsPaid() {
        return numberOfInstallmentsPaid;
    }

    /**
     * Sets the value of the numberOfInstallmentsPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfInstallmentsPaid(Integer value) {
        this.numberOfInstallmentsPaid = value;
    }

}

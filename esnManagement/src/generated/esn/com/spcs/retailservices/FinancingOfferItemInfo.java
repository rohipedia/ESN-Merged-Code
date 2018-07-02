
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingOfferItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingOfferItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderLineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accessoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="contractType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="downPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="financedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="serviceDepositAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="contractTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monthlyPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastInstallmentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalInterestAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="contractStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchasePriceAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="monthToMonthAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="proposedServiceUpperLimitAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingOfferItemInfo", propOrder = {
    "orderLineItemNumber",
    "sku",
    "accessoryInd",
    "contractType",
    "totalAmount",
    "downPaymentAmount",
    "financedAmount",
    "serviceDepositAmount",
    "contractTerm",
    "monthlyPaymentAmount",
    "interestRate",
    "lastInstallmentAmount",
    "totalInterestAmount",
    "contractStartDate",
    "contractEndDate",
    "purchasePriceAmount",
    "monthToMonthAmount",
    "proposedServiceUpperLimitAmt"
})
public class FinancingOfferItemInfo {

    protected int orderLineItemNumber;
    @XmlElement(required = true)
    protected String sku;
    protected Boolean accessoryInd;
    @XmlElement(required = true)
    protected String contractType;
    protected double totalAmount;
    protected Double downPaymentAmount;
    protected Double financedAmount;
    protected Double serviceDepositAmount;
    protected int contractTerm;
    protected Double monthlyPaymentAmount;
    protected Double interestRate;
    protected Double lastInstallmentAmount;
    protected Double totalInterestAmount;
    protected String contractStartDate;
    protected String contractEndDate;
    protected Double purchasePriceAmount;
    protected Double monthToMonthAmount;
    protected Double proposedServiceUpperLimitAmt;

    /**
     * Gets the value of the orderLineItemNumber property.
     * 
     */
    public int getOrderLineItemNumber() {
        return orderLineItemNumber;
    }

    /**
     * Sets the value of the orderLineItemNumber property.
     * 
     */
    public void setOrderLineItemNumber(int value) {
        this.orderLineItemNumber = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the accessoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessoryInd() {
        return accessoryInd;
    }

    /**
     * Sets the value of the accessoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessoryInd(Boolean value) {
        this.accessoryInd = value;
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
     * Gets the value of the totalAmount property.
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the downPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownPaymentAmount() {
        return downPaymentAmount;
    }

    /**
     * Sets the value of the downPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownPaymentAmount(Double value) {
        this.downPaymentAmount = value;
    }

    /**
     * Gets the value of the financedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFinancedAmount() {
        return financedAmount;
    }

    /**
     * Sets the value of the financedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFinancedAmount(Double value) {
        this.financedAmount = value;
    }

    /**
     * Gets the value of the serviceDepositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServiceDepositAmount() {
        return serviceDepositAmount;
    }

    /**
     * Sets the value of the serviceDepositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServiceDepositAmount(Double value) {
        this.serviceDepositAmount = value;
    }

    /**
     * Gets the value of the contractTerm property.
     * 
     */
    public int getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     */
    public void setContractTerm(int value) {
        this.contractTerm = value;
    }

    /**
     * Gets the value of the monthlyPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMonthlyPaymentAmount() {
        return monthlyPaymentAmount;
    }

    /**
     * Sets the value of the monthlyPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMonthlyPaymentAmount(Double value) {
        this.monthlyPaymentAmount = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInterestRate(Double value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the lastInstallmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLastInstallmentAmount() {
        return lastInstallmentAmount;
    }

    /**
     * Sets the value of the lastInstallmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLastInstallmentAmount(Double value) {
        this.lastInstallmentAmount = value;
    }

    /**
     * Gets the value of the totalInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalInterestAmount() {
        return totalInterestAmount;
    }

    /**
     * Sets the value of the totalInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalInterestAmount(Double value) {
        this.totalInterestAmount = value;
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
     * Gets the value of the purchasePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchasePriceAmount() {
        return purchasePriceAmount;
    }

    /**
     * Sets the value of the purchasePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchasePriceAmount(Double value) {
        this.purchasePriceAmount = value;
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
     * Gets the value of the proposedServiceUpperLimitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProposedServiceUpperLimitAmt() {
        return proposedServiceUpperLimitAmt;
    }

    /**
     * Sets the value of the proposedServiceUpperLimitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProposedServiceUpperLimitAmt(Double value) {
        this.proposedServiceUpperLimitAmt = value;
    }

}

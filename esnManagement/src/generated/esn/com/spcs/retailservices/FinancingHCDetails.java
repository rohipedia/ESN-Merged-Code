
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingHCDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingHCDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hcApplId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financingOfferId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderLineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hcOrderLineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalInterestAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingHCDetails", propOrder = {
    "hcApplId",
    "financingOfferId",
    "orderLineItemNumber",
    "hcOrderLineItemNumber",
    "interestRate",
    "totalInterestAmount"
})
public class FinancingHCDetails {

    protected String hcApplId;
    @XmlElement(required = true)
    protected String financingOfferId;
    protected int orderLineItemNumber;
    protected int hcOrderLineItemNumber;
    protected double interestRate;
    protected double totalInterestAmount;

    /**
     * Gets the value of the hcApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcApplId() {
        return hcApplId;
    }

    /**
     * Sets the value of the hcApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcApplId(String value) {
        this.hcApplId = value;
    }

    /**
     * Gets the value of the financingOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancingOfferId() {
        return financingOfferId;
    }

    /**
     * Sets the value of the financingOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancingOfferId(String value) {
        this.financingOfferId = value;
    }

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
     * Gets the value of the hcOrderLineItemNumber property.
     * 
     */
    public int getHcOrderLineItemNumber() {
        return hcOrderLineItemNumber;
    }

    /**
     * Sets the value of the hcOrderLineItemNumber property.
     * 
     */
    public void setHcOrderLineItemNumber(int value) {
        this.hcOrderLineItemNumber = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     */
    public void setInterestRate(double value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the totalInterestAmount property.
     * 
     */
    public double getTotalInterestAmount() {
        return totalInterestAmount;
    }

    /**
     * Sets the value of the totalInterestAmount property.
     * 
     */
    public void setTotalInterestAmount(double value) {
        this.totalInterestAmount = value;
    }

}

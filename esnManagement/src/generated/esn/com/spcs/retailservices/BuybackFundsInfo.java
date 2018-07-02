
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuybackFundsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuybackFundsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BuybackDownPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BuybackAdditionalDPAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BuybackFundsActUpgFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BuybackOtherSaleAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuybackFundsInfo", propOrder = {
    "lineItemNumber",
    "buybackDownPaymentAmount",
    "buybackAdditionalDPAmount",
    "buybackFundsActUpgFee",
    "buybackOtherSaleAmount"
})
public class BuybackFundsInfo {

    @XmlElement(name = "LineItemNumber")
    protected int lineItemNumber;
    @XmlElement(name = "BuybackDownPaymentAmount")
    protected Double buybackDownPaymentAmount;
    @XmlElement(name = "BuybackAdditionalDPAmount")
    protected Double buybackAdditionalDPAmount;
    @XmlElement(name = "BuybackFundsActUpgFee")
    protected Double buybackFundsActUpgFee;
    @XmlElement(name = "BuybackOtherSaleAmount")
    protected Double buybackOtherSaleAmount;

    /**
     * Gets the value of the lineItemNumber property.
     * 
     */
    public int getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     */
    public void setLineItemNumber(int value) {
        this.lineItemNumber = value;
    }

    /**
     * Gets the value of the buybackDownPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackDownPaymentAmount() {
        return buybackDownPaymentAmount;
    }

    /**
     * Sets the value of the buybackDownPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackDownPaymentAmount(Double value) {
        this.buybackDownPaymentAmount = value;
    }

    /**
     * Gets the value of the buybackAdditionalDPAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackAdditionalDPAmount() {
        return buybackAdditionalDPAmount;
    }

    /**
     * Sets the value of the buybackAdditionalDPAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackAdditionalDPAmount(Double value) {
        this.buybackAdditionalDPAmount = value;
    }

    /**
     * Gets the value of the buybackFundsActUpgFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackFundsActUpgFee() {
        return buybackFundsActUpgFee;
    }

    /**
     * Sets the value of the buybackFundsActUpgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackFundsActUpgFee(Double value) {
        this.buybackFundsActUpgFee = value;
    }

    /**
     * Gets the value of the buybackOtherSaleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackOtherSaleAmount() {
        return buybackOtherSaleAmount;
    }

    /**
     * Sets the value of the buybackOtherSaleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackOtherSaleAmount(Double value) {
        this.buybackOtherSaleAmount = value;
    }

}

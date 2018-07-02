
package com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeaseGiveBackInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeaseGiveBackInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="standAloneDeviceTurnInCreditAmount" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}CreditAmountType" minOccurs="0"/&gt;
 *         &lt;element name="upgradeDeviceTurnInCreditAmount" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}CreditAmountType" minOccurs="0"/&gt;
 *         &lt;element name="amtFromCustToPurchase" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}PurchaseOptionAmountType" minOccurs="0"/&gt;
 *         &lt;element name="amtFromCustForUpgradeTurnIn" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}ChargeAmountType" minOccurs="0"/&gt;
 *         &lt;element name="amtFromCustForStandAloneTurnIn" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}ChargeAmountType" minOccurs="0"/&gt;
 *         &lt;element name="tierNumber" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}TierNumberType" minOccurs="0"/&gt;
 *         &lt;element name="taxInfo" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}TaxInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeaseGiveBackInfoType", propOrder = {
    "standAloneDeviceTurnInCreditAmount",
    "upgradeDeviceTurnInCreditAmount",
    "amtFromCustToPurchase",
    "amtFromCustForUpgradeTurnIn",
    "amtFromCustForStandAloneTurnIn",
    "tierNumber",
    "taxInfo"
})
public class LeaseGiveBackInfoType {

    protected BigDecimal standAloneDeviceTurnInCreditAmount;
    protected BigDecimal upgradeDeviceTurnInCreditAmount;
    protected BigDecimal amtFromCustToPurchase;
    protected BigDecimal amtFromCustForUpgradeTurnIn;
    protected BigDecimal amtFromCustForStandAloneTurnIn;
    protected BigDecimal tierNumber;
    protected TaxInfoType taxInfo;

    /**
     * Gets the value of the standAloneDeviceTurnInCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStandAloneDeviceTurnInCreditAmount() {
        return standAloneDeviceTurnInCreditAmount;
    }

    /**
     * Sets the value of the standAloneDeviceTurnInCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStandAloneDeviceTurnInCreditAmount(BigDecimal value) {
        this.standAloneDeviceTurnInCreditAmount = value;
    }

    /**
     * Gets the value of the upgradeDeviceTurnInCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpgradeDeviceTurnInCreditAmount() {
        return upgradeDeviceTurnInCreditAmount;
    }

    /**
     * Sets the value of the upgradeDeviceTurnInCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpgradeDeviceTurnInCreditAmount(BigDecimal value) {
        this.upgradeDeviceTurnInCreditAmount = value;
    }

    /**
     * Gets the value of the amtFromCustToPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtFromCustToPurchase() {
        return amtFromCustToPurchase;
    }

    /**
     * Sets the value of the amtFromCustToPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtFromCustToPurchase(BigDecimal value) {
        this.amtFromCustToPurchase = value;
    }

    /**
     * Gets the value of the amtFromCustForUpgradeTurnIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtFromCustForUpgradeTurnIn() {
        return amtFromCustForUpgradeTurnIn;
    }

    /**
     * Sets the value of the amtFromCustForUpgradeTurnIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtFromCustForUpgradeTurnIn(BigDecimal value) {
        this.amtFromCustForUpgradeTurnIn = value;
    }

    /**
     * Gets the value of the amtFromCustForStandAloneTurnIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtFromCustForStandAloneTurnIn() {
        return amtFromCustForStandAloneTurnIn;
    }

    /**
     * Sets the value of the amtFromCustForStandAloneTurnIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtFromCustForStandAloneTurnIn(BigDecimal value) {
        this.amtFromCustForStandAloneTurnIn = value;
    }

    /**
     * Gets the value of the tierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTierNumber() {
        return tierNumber;
    }

    /**
     * Sets the value of the tierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTierNumber(BigDecimal value) {
        this.tierNumber = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfoType }
     *     
     */
    public TaxInfoType getTaxInfo() {
        return taxInfo;
    }

    /**
     * Sets the value of the taxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfoType }
     *     
     */
    public void setTaxInfo(TaxInfoType value) {
        this.taxInfo = value;
    }

}

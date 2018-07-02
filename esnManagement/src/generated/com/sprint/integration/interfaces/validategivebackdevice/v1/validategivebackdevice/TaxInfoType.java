
package com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amtFromCustToPurchaseTax" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}TaxAmountType" minOccurs="0"/&gt;
 *         &lt;element name="amtFromCustForUpgradeTurnInTax" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}TaxAmountType" minOccurs="0"/&gt;
 *         &lt;element name="amtFromCustForStandAloneTurnInTax" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}TaxAmountType" minOccurs="0"/&gt;
 *         &lt;element name="taxErrorList" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}TaxErrorListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInfoType", propOrder = {
    "amtFromCustToPurchaseTax",
    "amtFromCustForUpgradeTurnInTax",
    "amtFromCustForStandAloneTurnInTax",
    "taxErrorList"
})
public class TaxInfoType {

    protected BigDecimal amtFromCustToPurchaseTax;
    protected BigDecimal amtFromCustForUpgradeTurnInTax;
    protected BigDecimal amtFromCustForStandAloneTurnInTax;
    protected TaxErrorListType taxErrorList;

    /**
     * Gets the value of the amtFromCustToPurchaseTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtFromCustToPurchaseTax() {
        return amtFromCustToPurchaseTax;
    }

    /**
     * Sets the value of the amtFromCustToPurchaseTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtFromCustToPurchaseTax(BigDecimal value) {
        this.amtFromCustToPurchaseTax = value;
    }

    /**
     * Gets the value of the amtFromCustForUpgradeTurnInTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtFromCustForUpgradeTurnInTax() {
        return amtFromCustForUpgradeTurnInTax;
    }

    /**
     * Sets the value of the amtFromCustForUpgradeTurnInTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtFromCustForUpgradeTurnInTax(BigDecimal value) {
        this.amtFromCustForUpgradeTurnInTax = value;
    }

    /**
     * Gets the value of the amtFromCustForStandAloneTurnInTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtFromCustForStandAloneTurnInTax() {
        return amtFromCustForStandAloneTurnInTax;
    }

    /**
     * Sets the value of the amtFromCustForStandAloneTurnInTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtFromCustForStandAloneTurnInTax(BigDecimal value) {
        this.amtFromCustForStandAloneTurnInTax = value;
    }

    /**
     * Gets the value of the taxErrorList property.
     * 
     * @return
     *     possible object is
     *     {@link TaxErrorListType }
     *     
     */
    public TaxErrorListType getTaxErrorList() {
        return taxErrorList;
    }

    /**
     * Sets the value of the taxErrorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxErrorListType }
     *     
     */
    public void setTaxErrorList(TaxErrorListType value) {
        this.taxErrorList = value;
    }

}

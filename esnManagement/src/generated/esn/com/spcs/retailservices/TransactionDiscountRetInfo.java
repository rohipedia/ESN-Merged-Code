
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDiscountRetInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDiscountRetInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transItemDiscountKey" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="refTransNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="discountIdentifier" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="unitCost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="discountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allowDiscRebateIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authBanIdenitfier" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="priceOverrideFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stackableIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="armRebateIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flatRateIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isAutoApplied" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siebelCouponIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="armActDiscountIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="upgradeNowOfferIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="corpAccessoryIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDiscountRetInfo", propOrder = {
    "transItemDiscountKey",
    "refTransNo",
    "lineItemNumber",
    "discountIdentifier",
    "discountAmount",
    "discountRate",
    "unitCost",
    "discountName",
    "discountTypeCode",
    "allowDiscRebateIndicator",
    "authBanIdenitfier",
    "priceOverrideFlag",
    "stackableIndicator",
    "armRebateIndicator",
    "flatRateIndicator",
    "isAutoApplied",
    "siebelCouponIndicator",
    "armActDiscountIndicator",
    "upgradeNowOfferIndicator",
    "corpAccessoryIndicator"
})
public class TransactionDiscountRetInfo {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long transItemDiscountKey;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long refTransNo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long lineItemNumber;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long discountIdentifier;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double discountAmount;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double discountRate;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double unitCost;
    @XmlElement(required = true, nillable = true)
    protected String discountName;
    @XmlElement(required = true, nillable = true)
    protected String discountTypeCode;
    @XmlElement(required = true, nillable = true)
    protected String allowDiscRebateIndicator;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long authBanIdenitfier;
    @XmlElement(required = true, nillable = true)
    protected String priceOverrideFlag;
    @XmlElement(required = true, nillable = true)
    protected String stackableIndicator;
    @XmlElement(required = true, nillable = true)
    protected String armRebateIndicator;
    @XmlElement(required = true, nillable = true)
    protected String flatRateIndicator;
    @XmlElement(required = true, nillable = true)
    protected String isAutoApplied;
    @XmlElement(required = true, nillable = true)
    protected String siebelCouponIndicator;
    @XmlElement(required = true, nillable = true)
    protected String armActDiscountIndicator;
    @XmlElement(required = true, nillable = true)
    protected String upgradeNowOfferIndicator;
    @XmlElement(required = true, nillable = true)
    protected String corpAccessoryIndicator;

    /**
     * Gets the value of the transItemDiscountKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransItemDiscountKey() {
        return transItemDiscountKey;
    }

    /**
     * Sets the value of the transItemDiscountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransItemDiscountKey(Long value) {
        this.transItemDiscountKey = value;
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
     * Gets the value of the lineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemNumber(Long value) {
        this.lineItemNumber = value;
    }

    /**
     * Gets the value of the discountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountIdentifier() {
        return discountIdentifier;
    }

    /**
     * Sets the value of the discountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountIdentifier(Long value) {
        this.discountIdentifier = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountAmount(Double value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountRate(Double value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCost(Double value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the discountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountName() {
        return discountName;
    }

    /**
     * Sets the value of the discountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountName(String value) {
        this.discountName = value;
    }

    /**
     * Gets the value of the discountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountTypeCode() {
        return discountTypeCode;
    }

    /**
     * Sets the value of the discountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountTypeCode(String value) {
        this.discountTypeCode = value;
    }

    /**
     * Gets the value of the allowDiscRebateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowDiscRebateIndicator() {
        return allowDiscRebateIndicator;
    }

    /**
     * Sets the value of the allowDiscRebateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowDiscRebateIndicator(String value) {
        this.allowDiscRebateIndicator = value;
    }

    /**
     * Gets the value of the authBanIdenitfier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthBanIdenitfier() {
        return authBanIdenitfier;
    }

    /**
     * Sets the value of the authBanIdenitfier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthBanIdenitfier(Long value) {
        this.authBanIdenitfier = value;
    }

    /**
     * Gets the value of the priceOverrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceOverrideFlag() {
        return priceOverrideFlag;
    }

    /**
     * Sets the value of the priceOverrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceOverrideFlag(String value) {
        this.priceOverrideFlag = value;
    }

    /**
     * Gets the value of the stackableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackableIndicator() {
        return stackableIndicator;
    }

    /**
     * Sets the value of the stackableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackableIndicator(String value) {
        this.stackableIndicator = value;
    }

    /**
     * Gets the value of the armRebateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmRebateIndicator() {
        return armRebateIndicator;
    }

    /**
     * Sets the value of the armRebateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmRebateIndicator(String value) {
        this.armRebateIndicator = value;
    }

    /**
     * Gets the value of the flatRateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatRateIndicator() {
        return flatRateIndicator;
    }

    /**
     * Sets the value of the flatRateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatRateIndicator(String value) {
        this.flatRateIndicator = value;
    }

    /**
     * Gets the value of the isAutoApplied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAutoApplied() {
        return isAutoApplied;
    }

    /**
     * Sets the value of the isAutoApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAutoApplied(String value) {
        this.isAutoApplied = value;
    }

    /**
     * Gets the value of the siebelCouponIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiebelCouponIndicator() {
        return siebelCouponIndicator;
    }

    /**
     * Sets the value of the siebelCouponIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiebelCouponIndicator(String value) {
        this.siebelCouponIndicator = value;
    }

    /**
     * Gets the value of the armActDiscountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmActDiscountIndicator() {
        return armActDiscountIndicator;
    }

    /**
     * Sets the value of the armActDiscountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmActDiscountIndicator(String value) {
        this.armActDiscountIndicator = value;
    }

    /**
     * Gets the value of the upgradeNowOfferIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeNowOfferIndicator() {
        return upgradeNowOfferIndicator;
    }

    /**
     * Sets the value of the upgradeNowOfferIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeNowOfferIndicator(String value) {
        this.upgradeNowOfferIndicator = value;
    }

    /**
     * Gets the value of the corpAccessoryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpAccessoryIndicator() {
        return corpAccessoryIndicator;
    }

    /**
     * Sets the value of the corpAccessoryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpAccessoryIndicator(String value) {
        this.corpAccessoryIndicator = value;
    }

}

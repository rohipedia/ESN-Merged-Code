
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DsReservationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DsReservationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dsTransactionLineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ptn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subscriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reservationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reservationStatusReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rebatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="armRebateAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="armContractTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="armEligibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="armRebateIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remMonthContractQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="givebackIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeInIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zeroServiceDepositIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depositAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="turnInIndr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="turnInCreditamt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="turnInSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tierNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="turninLoanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="turninLoanSeqNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="leaseTermStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fairMarkerValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="earlyUpgradeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeinEsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeinPromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="macCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="equiptDiscTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="equipDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="turninChargeAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DsReservationInfo", propOrder = {
    "dsTransactionLineItemNumber",
    "ptn",
    "subscriberIdentifier",
    "reservationType",
    "reservationStatusReasonCode",
    "rebatePlanCode",
    "armRebateAmount",
    "armContractTerm",
    "armEligibilityCode",
    "armRebateIndicator",
    "remMonthContractQty",
    "givebackIndicator",
    "tradeInIndicator",
    "zeroServiceDepositIndicator",
    "depositAmount",
    "turnInIndr",
    "turnInCreditamt",
    "turnInSerialNumber",
    "purchaseAmount",
    "tierNumber",
    "turninLoanNumber",
    "turninLoanSeqNumber",
    "leaseTermStatusName",
    "fairMarkerValue",
    "earlyUpgradeCode",
    "tradeinEsn",
    "offerGroupCode",
    "offerDesc",
    "tradeinPromoCode",
    "macCode",
    "equiptDiscTypeCode",
    "equipDiscAmt",
    "orderType",
    "turninChargeAmt"
})
public class DsReservationInfo {

    protected long dsTransactionLineItemNumber;
    @XmlElement(required = true)
    protected String ptn;
    @XmlElement(required = true)
    protected String subscriberIdentifier;
    @XmlElement(required = true)
    protected String reservationType;
    protected String reservationStatusReasonCode;
    protected String rebatePlanCode;
    protected Double armRebateAmount;
    protected Integer armContractTerm;
    protected String armEligibilityCode;
    protected String armRebateIndicator;
    protected Integer remMonthContractQty;
    protected String givebackIndicator;
    protected String tradeInIndicator;
    protected String zeroServiceDepositIndicator;
    protected Double depositAmount;
    protected String turnInIndr;
    protected Double turnInCreditamt;
    protected String turnInSerialNumber;
    protected Double purchaseAmount;
    protected Integer tierNumber;
    protected String turninLoanNumber;
    protected Integer turninLoanSeqNumber;
    protected String leaseTermStatusName;
    protected Double fairMarkerValue;
    protected String earlyUpgradeCode;
    protected String tradeinEsn;
    protected String offerGroupCode;
    protected String offerDesc;
    protected String tradeinPromoCode;
    protected String macCode;
    protected String equiptDiscTypeCode;
    protected Double equipDiscAmt;
    protected String orderType;
    protected Double turninChargeAmt;

    /**
     * Gets the value of the dsTransactionLineItemNumber property.
     * 
     */
    public long getDsTransactionLineItemNumber() {
        return dsTransactionLineItemNumber;
    }

    /**
     * Sets the value of the dsTransactionLineItemNumber property.
     * 
     */
    public void setDsTransactionLineItemNumber(long value) {
        this.dsTransactionLineItemNumber = value;
    }

    /**
     * Gets the value of the ptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtn() {
        return ptn;
    }

    /**
     * Sets the value of the ptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtn(String value) {
        this.ptn = value;
    }

    /**
     * Gets the value of the subscriberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberIdentifier() {
        return subscriberIdentifier;
    }

    /**
     * Sets the value of the subscriberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberIdentifier(String value) {
        this.subscriberIdentifier = value;
    }

    /**
     * Gets the value of the reservationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationType() {
        return reservationType;
    }

    /**
     * Sets the value of the reservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationType(String value) {
        this.reservationType = value;
    }

    /**
     * Gets the value of the reservationStatusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatusReasonCode() {
        return reservationStatusReasonCode;
    }

    /**
     * Sets the value of the reservationStatusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatusReasonCode(String value) {
        this.reservationStatusReasonCode = value;
    }

    /**
     * Gets the value of the rebatePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebatePlanCode() {
        return rebatePlanCode;
    }

    /**
     * Sets the value of the rebatePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebatePlanCode(String value) {
        this.rebatePlanCode = value;
    }

    /**
     * Gets the value of the armRebateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArmRebateAmount() {
        return armRebateAmount;
    }

    /**
     * Sets the value of the armRebateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArmRebateAmount(Double value) {
        this.armRebateAmount = value;
    }

    /**
     * Gets the value of the armContractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArmContractTerm() {
        return armContractTerm;
    }

    /**
     * Sets the value of the armContractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArmContractTerm(Integer value) {
        this.armContractTerm = value;
    }

    /**
     * Gets the value of the armEligibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmEligibilityCode() {
        return armEligibilityCode;
    }

    /**
     * Sets the value of the armEligibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmEligibilityCode(String value) {
        this.armEligibilityCode = value;
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
     * Gets the value of the remMonthContractQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemMonthContractQty() {
        return remMonthContractQty;
    }

    /**
     * Sets the value of the remMonthContractQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemMonthContractQty(Integer value) {
        this.remMonthContractQty = value;
    }

    /**
     * Gets the value of the givebackIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivebackIndicator() {
        return givebackIndicator;
    }

    /**
     * Sets the value of the givebackIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivebackIndicator(String value) {
        this.givebackIndicator = value;
    }

    /**
     * Gets the value of the tradeInIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInIndicator() {
        return tradeInIndicator;
    }

    /**
     * Sets the value of the tradeInIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInIndicator(String value) {
        this.tradeInIndicator = value;
    }

    /**
     * Gets the value of the zeroServiceDepositIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroServiceDepositIndicator() {
        return zeroServiceDepositIndicator;
    }

    /**
     * Sets the value of the zeroServiceDepositIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroServiceDepositIndicator(String value) {
        this.zeroServiceDepositIndicator = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepositAmount(Double value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the turnInIndr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnInIndr() {
        return turnInIndr;
    }

    /**
     * Sets the value of the turnInIndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnInIndr(String value) {
        this.turnInIndr = value;
    }

    /**
     * Gets the value of the turnInCreditamt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTurnInCreditamt() {
        return turnInCreditamt;
    }

    /**
     * Sets the value of the turnInCreditamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTurnInCreditamt(Double value) {
        this.turnInCreditamt = value;
    }

    /**
     * Gets the value of the turnInSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnInSerialNumber() {
        return turnInSerialNumber;
    }

    /**
     * Sets the value of the turnInSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnInSerialNumber(String value) {
        this.turnInSerialNumber = value;
    }

    /**
     * Gets the value of the purchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * Sets the value of the purchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseAmount(Double value) {
        this.purchaseAmount = value;
    }

    /**
     * Gets the value of the tierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTierNumber() {
        return tierNumber;
    }

    /**
     * Sets the value of the tierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTierNumber(Integer value) {
        this.tierNumber = value;
    }

    /**
     * Gets the value of the turninLoanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurninLoanNumber() {
        return turninLoanNumber;
    }

    /**
     * Sets the value of the turninLoanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurninLoanNumber(String value) {
        this.turninLoanNumber = value;
    }

    /**
     * Gets the value of the turninLoanSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTurninLoanSeqNumber() {
        return turninLoanSeqNumber;
    }

    /**
     * Sets the value of the turninLoanSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTurninLoanSeqNumber(Integer value) {
        this.turninLoanSeqNumber = value;
    }

    /**
     * Gets the value of the leaseTermStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseTermStatusName() {
        return leaseTermStatusName;
    }

    /**
     * Sets the value of the leaseTermStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseTermStatusName(String value) {
        this.leaseTermStatusName = value;
    }

    /**
     * Gets the value of the fairMarkerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFairMarkerValue() {
        return fairMarkerValue;
    }

    /**
     * Sets the value of the fairMarkerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFairMarkerValue(Double value) {
        this.fairMarkerValue = value;
    }

    /**
     * Gets the value of the earlyUpgradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyUpgradeCode() {
        return earlyUpgradeCode;
    }

    /**
     * Sets the value of the earlyUpgradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyUpgradeCode(String value) {
        this.earlyUpgradeCode = value;
    }

    /**
     * Gets the value of the tradeinEsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeinEsn() {
        return tradeinEsn;
    }

    /**
     * Sets the value of the tradeinEsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeinEsn(String value) {
        this.tradeinEsn = value;
    }

    /**
     * Gets the value of the offerGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferGroupCode() {
        return offerGroupCode;
    }

    /**
     * Sets the value of the offerGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferGroupCode(String value) {
        this.offerGroupCode = value;
    }

    /**
     * Gets the value of the offerDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDesc() {
        return offerDesc;
    }

    /**
     * Sets the value of the offerDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDesc(String value) {
        this.offerDesc = value;
    }

    /**
     * Gets the value of the tradeinPromoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeinPromoCode() {
        return tradeinPromoCode;
    }

    /**
     * Sets the value of the tradeinPromoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeinPromoCode(String value) {
        this.tradeinPromoCode = value;
    }

    /**
     * Gets the value of the macCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacCode() {
        return macCode;
    }

    /**
     * Sets the value of the macCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacCode(String value) {
        this.macCode = value;
    }

    /**
     * Gets the value of the equiptDiscTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquiptDiscTypeCode() {
        return equiptDiscTypeCode;
    }

    /**
     * Sets the value of the equiptDiscTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquiptDiscTypeCode(String value) {
        this.equiptDiscTypeCode = value;
    }

    /**
     * Gets the value of the equipDiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEquipDiscAmt() {
        return equipDiscAmt;
    }

    /**
     * Sets the value of the equipDiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEquipDiscAmt(Double value) {
        this.equipDiscAmt = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the turninChargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTurninChargeAmt() {
        return turninChargeAmt;
    }

    /**
     * Sets the value of the turninChargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTurninChargeAmt(Double value) {
        this.turninChargeAmt = value;
    }

}

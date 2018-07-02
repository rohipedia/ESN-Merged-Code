
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lineItemParentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="webOrderLineItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bopuisOrderIndcr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bopuisPrchOptCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="radioShackLineInfo" type="{java:com.spcs.retailservices.domain}RadioShackLineInfo" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceOverrideReasonIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="priceOverrideAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="kitLineItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kitComponentPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="directFulfilment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="armOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="armRebatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trackAsArmIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="btaEligibleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buybackPretaxCreditAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="upgradeNowFeeLineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shoppingCartLineItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="givebackSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="skuPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="sourceProductIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="amountPostedToAccount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transactionItemTaxesList" type="{java:com.spcs.retailservices.domain}TransactionItemTaxesList" minOccurs="0"/&gt;
 *         &lt;element name="transactionDiscountItemsList" type="{java:com.spcs.retailservices.domain}TransactionDiscountItemsList" minOccurs="0"/&gt;
 *         &lt;element name="equipmentInstallBillLeaseInfo" type="{java:com.spcs.retailservices.domain}EquipmentInstallBillLeaseInfo" minOccurs="0"/&gt;
 *         &lt;element name="tradeInInfo" type="{java:com.spcs.retailservices.domain}TradeInInfo" minOccurs="0"/&gt;
 *         &lt;element name="earlyupgradetradeinInfo" type="{java:com.spcs.retailservices.domain}EarlyUpgradeTradeInInfo" minOccurs="0"/&gt;
 *         &lt;element name="giveBackSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="turnInCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buybackOtherSaleAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buybackDownpaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buybackAdditionalDownpaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buybackFundPayment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="maxAllowedDownpaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="selectedPrepaidSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="singleSkuSellingBrandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="omimReturnReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assignmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalInterestAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="devicePurchaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appliedLeaseDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="appliedLeaseAdpsDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buybackPromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buybackSystemProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buybackAnswerList" type="{java:com.spcs.retailservices.domain}BuybackAnswerList" minOccurs="0"/&gt;
 *         &lt;element name="bxgxInfo " type="{java:com.spcs.retailservices.domain}BxgxInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionItemInfo", propOrder = {
    "lineItemNumber",
    "lineItemParentNumber",
    "productIdentifier",
    "quantity",
    "unitPrice",
    "webOrderLineItemId",
    "bopuisOrderIndcr",
    "bopuisPrchOptCd",
    "radioShackLineInfo",
    "serialNumber",
    "priceOverrideReasonIdentifier",
    "priceOverrideAmount",
    "kitLineItem",
    "kitComponentPrice",
    "directFulfilment",
    "armOverrideIndicator",
    "armRebatePlanCode",
    "trackAsArmIndicator",
    "btaEligibleIndicator",
    "buybackPretaxCreditAmount",
    "upgradeNowFeeLineItemNumber",
    "shoppingCartLineItemIdentifier",
    "givebackSku",
    "taxGroupCode",
    "skuPrice",
    "sourceProductIdentifier",
    "amountPostedToAccount",
    "transactionItemTaxesList",
    "transactionDiscountItemsList",
    "equipmentInstallBillLeaseInfo",
    "tradeInInfo",
    "earlyupgradetradeinInfo",
    "giveBackSerialNum",
    "turnInCredit",
    "buybackOtherSaleAmount",
    "buybackDownpaymentAmount",
    "buybackAdditionalDownpaymentAmount",
    "buybackFundPayment",
    "maxAllowedDownpaymentAmount",
    "selectedPrepaidSku",
    "singleSkuSellingBrandCode",
    "omimReturnReasonCode",
    "assignmentCode",
    "interestRate",
    "totalInterestAmount",
    "devicePurchaseType",
    "appliedLeaseDiscountAmount",
    "appliedLeaseAdpsDiscountAmount",
    "buybackPromoCode",
    "buybackSystemProductId",
    "buybackAnswerList",
    "bxgxInfo0020"
})
public class TransactionItemInfo {

    protected int lineItemNumber;
    protected Integer lineItemParentNumber;
    protected int productIdentifier;
    protected int quantity;
    protected double unitPrice;
    protected Integer webOrderLineItemId;
    protected String bopuisOrderIndcr;
    protected String bopuisPrchOptCd;
    protected RadioShackLineInfo radioShackLineInfo;
    protected String serialNumber;
    protected Integer priceOverrideReasonIdentifier;
    protected Double priceOverrideAmount;
    protected Integer kitLineItem;
    protected Double kitComponentPrice;
    @XmlElement(required = true)
    protected String directFulfilment;
    protected String armOverrideIndicator;
    protected String armRebatePlanCode;
    protected String trackAsArmIndicator;
    protected String btaEligibleIndicator;
    protected Double buybackPretaxCreditAmount;
    protected Integer upgradeNowFeeLineItemNumber;
    protected Integer shoppingCartLineItemIdentifier;
    protected String givebackSku;
    @XmlElement(required = true)
    protected String taxGroupCode;
    protected double skuPrice;
    protected Integer sourceProductIdentifier;
    protected Double amountPostedToAccount;
    protected TransactionItemTaxesList transactionItemTaxesList;
    protected TransactionDiscountItemsList transactionDiscountItemsList;
    protected EquipmentInstallBillLeaseInfo equipmentInstallBillLeaseInfo;
    protected TradeInInfo tradeInInfo;
    protected EarlyUpgradeTradeInInfo earlyupgradetradeinInfo;
    protected String giveBackSerialNum;
    protected Double turnInCredit;
    protected Double buybackOtherSaleAmount;
    protected Double buybackDownpaymentAmount;
    protected Double buybackAdditionalDownpaymentAmount;
    protected Double buybackFundPayment;
    protected Double maxAllowedDownpaymentAmount;
    protected String selectedPrepaidSku;
    protected String singleSkuSellingBrandCode;
    protected String omimReturnReasonCode;
    protected String assignmentCode;
    protected Double interestRate;
    protected Double totalInterestAmount;
    protected String devicePurchaseType;
    protected Double appliedLeaseDiscountAmount;
    protected Double appliedLeaseAdpsDiscountAmount;
    protected String buybackPromoCode;
    protected String buybackSystemProductId;
    protected BuybackAnswerList buybackAnswerList;
    @XmlElement(name = "bxgxInfo ")
    protected BxgxInfo bxgxInfo0020;

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
     * Gets the value of the lineItemParentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineItemParentNumber() {
        return lineItemParentNumber;
    }

    /**
     * Sets the value of the lineItemParentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineItemParentNumber(Integer value) {
        this.lineItemParentNumber = value;
    }

    /**
     * Gets the value of the productIdentifier property.
     * 
     */
    public int getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     */
    public void setProductIdentifier(int value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     */
    public void setUnitPrice(double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the webOrderLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWebOrderLineItemId() {
        return webOrderLineItemId;
    }

    /**
     * Sets the value of the webOrderLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebOrderLineItemId(Integer value) {
        this.webOrderLineItemId = value;
    }

    /**
     * Gets the value of the bopuisOrderIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBopuisOrderIndcr() {
        return bopuisOrderIndcr;
    }

    /**
     * Sets the value of the bopuisOrderIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBopuisOrderIndcr(String value) {
        this.bopuisOrderIndcr = value;
    }

    /**
     * Gets the value of the bopuisPrchOptCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBopuisPrchOptCd() {
        return bopuisPrchOptCd;
    }

    /**
     * Sets the value of the bopuisPrchOptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBopuisPrchOptCd(String value) {
        this.bopuisPrchOptCd = value;
    }

    /**
     * Gets the value of the radioShackLineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RadioShackLineInfo }
     *     
     */
    public RadioShackLineInfo getRadioShackLineInfo() {
        return radioShackLineInfo;
    }

    /**
     * Sets the value of the radioShackLineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioShackLineInfo }
     *     
     */
    public void setRadioShackLineInfo(RadioShackLineInfo value) {
        this.radioShackLineInfo = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the priceOverrideReasonIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceOverrideReasonIdentifier() {
        return priceOverrideReasonIdentifier;
    }

    /**
     * Sets the value of the priceOverrideReasonIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceOverrideReasonIdentifier(Integer value) {
        this.priceOverrideReasonIdentifier = value;
    }

    /**
     * Gets the value of the priceOverrideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceOverrideAmount() {
        return priceOverrideAmount;
    }

    /**
     * Sets the value of the priceOverrideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceOverrideAmount(Double value) {
        this.priceOverrideAmount = value;
    }

    /**
     * Gets the value of the kitLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKitLineItem() {
        return kitLineItem;
    }

    /**
     * Sets the value of the kitLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKitLineItem(Integer value) {
        this.kitLineItem = value;
    }

    /**
     * Gets the value of the kitComponentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKitComponentPrice() {
        return kitComponentPrice;
    }

    /**
     * Sets the value of the kitComponentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKitComponentPrice(Double value) {
        this.kitComponentPrice = value;
    }

    /**
     * Gets the value of the directFulfilment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectFulfilment() {
        return directFulfilment;
    }

    /**
     * Sets the value of the directFulfilment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectFulfilment(String value) {
        this.directFulfilment = value;
    }

    /**
     * Gets the value of the armOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmOverrideIndicator() {
        return armOverrideIndicator;
    }

    /**
     * Sets the value of the armOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmOverrideIndicator(String value) {
        this.armOverrideIndicator = value;
    }

    /**
     * Gets the value of the armRebatePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmRebatePlanCode() {
        return armRebatePlanCode;
    }

    /**
     * Sets the value of the armRebatePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmRebatePlanCode(String value) {
        this.armRebatePlanCode = value;
    }

    /**
     * Gets the value of the trackAsArmIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackAsArmIndicator() {
        return trackAsArmIndicator;
    }

    /**
     * Sets the value of the trackAsArmIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackAsArmIndicator(String value) {
        this.trackAsArmIndicator = value;
    }

    /**
     * Gets the value of the btaEligibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtaEligibleIndicator() {
        return btaEligibleIndicator;
    }

    /**
     * Sets the value of the btaEligibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtaEligibleIndicator(String value) {
        this.btaEligibleIndicator = value;
    }

    /**
     * Gets the value of the buybackPretaxCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackPretaxCreditAmount() {
        return buybackPretaxCreditAmount;
    }

    /**
     * Sets the value of the buybackPretaxCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackPretaxCreditAmount(Double value) {
        this.buybackPretaxCreditAmount = value;
    }

    /**
     * Gets the value of the upgradeNowFeeLineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpgradeNowFeeLineItemNumber() {
        return upgradeNowFeeLineItemNumber;
    }

    /**
     * Sets the value of the upgradeNowFeeLineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpgradeNowFeeLineItemNumber(Integer value) {
        this.upgradeNowFeeLineItemNumber = value;
    }

    /**
     * Gets the value of the shoppingCartLineItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShoppingCartLineItemIdentifier() {
        return shoppingCartLineItemIdentifier;
    }

    /**
     * Sets the value of the shoppingCartLineItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShoppingCartLineItemIdentifier(Integer value) {
        this.shoppingCartLineItemIdentifier = value;
    }

    /**
     * Gets the value of the givebackSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivebackSku() {
        return givebackSku;
    }

    /**
     * Sets the value of the givebackSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivebackSku(String value) {
        this.givebackSku = value;
    }

    /**
     * Gets the value of the taxGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroupCode() {
        return taxGroupCode;
    }

    /**
     * Sets the value of the taxGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroupCode(String value) {
        this.taxGroupCode = value;
    }

    /**
     * Gets the value of the skuPrice property.
     * 
     */
    public double getSkuPrice() {
        return skuPrice;
    }

    /**
     * Sets the value of the skuPrice property.
     * 
     */
    public void setSkuPrice(double value) {
        this.skuPrice = value;
    }

    /**
     * Gets the value of the sourceProductIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceProductIdentifier() {
        return sourceProductIdentifier;
    }

    /**
     * Sets the value of the sourceProductIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceProductIdentifier(Integer value) {
        this.sourceProductIdentifier = value;
    }

    /**
     * Gets the value of the amountPostedToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountPostedToAccount() {
        return amountPostedToAccount;
    }

    /**
     * Sets the value of the amountPostedToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountPostedToAccount(Double value) {
        this.amountPostedToAccount = value;
    }

    /**
     * Gets the value of the transactionItemTaxesList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionItemTaxesList }
     *     
     */
    public TransactionItemTaxesList getTransactionItemTaxesList() {
        return transactionItemTaxesList;
    }

    /**
     * Sets the value of the transactionItemTaxesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionItemTaxesList }
     *     
     */
    public void setTransactionItemTaxesList(TransactionItemTaxesList value) {
        this.transactionItemTaxesList = value;
    }

    /**
     * Gets the value of the transactionDiscountItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDiscountItemsList }
     *     
     */
    public TransactionDiscountItemsList getTransactionDiscountItemsList() {
        return transactionDiscountItemsList;
    }

    /**
     * Sets the value of the transactionDiscountItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDiscountItemsList }
     *     
     */
    public void setTransactionDiscountItemsList(TransactionDiscountItemsList value) {
        this.transactionDiscountItemsList = value;
    }

    /**
     * Gets the value of the equipmentInstallBillLeaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentInstallBillLeaseInfo }
     *     
     */
    public EquipmentInstallBillLeaseInfo getEquipmentInstallBillLeaseInfo() {
        return equipmentInstallBillLeaseInfo;
    }

    /**
     * Sets the value of the equipmentInstallBillLeaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentInstallBillLeaseInfo }
     *     
     */
    public void setEquipmentInstallBillLeaseInfo(EquipmentInstallBillLeaseInfo value) {
        this.equipmentInstallBillLeaseInfo = value;
    }

    /**
     * Gets the value of the tradeInInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeInInfo }
     *     
     */
    public TradeInInfo getTradeInInfo() {
        return tradeInInfo;
    }

    /**
     * Sets the value of the tradeInInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInInfo }
     *     
     */
    public void setTradeInInfo(TradeInInfo value) {
        this.tradeInInfo = value;
    }

    /**
     * Gets the value of the earlyupgradetradeinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EarlyUpgradeTradeInInfo }
     *     
     */
    public EarlyUpgradeTradeInInfo getEarlyupgradetradeinInfo() {
        return earlyupgradetradeinInfo;
    }

    /**
     * Sets the value of the earlyupgradetradeinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarlyUpgradeTradeInInfo }
     *     
     */
    public void setEarlyupgradetradeinInfo(EarlyUpgradeTradeInInfo value) {
        this.earlyupgradetradeinInfo = value;
    }

    /**
     * Gets the value of the giveBackSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveBackSerialNum() {
        return giveBackSerialNum;
    }

    /**
     * Sets the value of the giveBackSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveBackSerialNum(String value) {
        this.giveBackSerialNum = value;
    }

    /**
     * Gets the value of the turnInCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTurnInCredit() {
        return turnInCredit;
    }

    /**
     * Sets the value of the turnInCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTurnInCredit(Double value) {
        this.turnInCredit = value;
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

    /**
     * Gets the value of the buybackDownpaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackDownpaymentAmount() {
        return buybackDownpaymentAmount;
    }

    /**
     * Sets the value of the buybackDownpaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackDownpaymentAmount(Double value) {
        this.buybackDownpaymentAmount = value;
    }

    /**
     * Gets the value of the buybackAdditionalDownpaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackAdditionalDownpaymentAmount() {
        return buybackAdditionalDownpaymentAmount;
    }

    /**
     * Sets the value of the buybackAdditionalDownpaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackAdditionalDownpaymentAmount(Double value) {
        this.buybackAdditionalDownpaymentAmount = value;
    }

    /**
     * Gets the value of the buybackFundPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackFundPayment() {
        return buybackFundPayment;
    }

    /**
     * Sets the value of the buybackFundPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackFundPayment(Double value) {
        this.buybackFundPayment = value;
    }

    /**
     * Gets the value of the maxAllowedDownpaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAllowedDownpaymentAmount() {
        return maxAllowedDownpaymentAmount;
    }

    /**
     * Sets the value of the maxAllowedDownpaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAllowedDownpaymentAmount(Double value) {
        this.maxAllowedDownpaymentAmount = value;
    }

    /**
     * Gets the value of the selectedPrepaidSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedPrepaidSku() {
        return selectedPrepaidSku;
    }

    /**
     * Sets the value of the selectedPrepaidSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedPrepaidSku(String value) {
        this.selectedPrepaidSku = value;
    }

    /**
     * Gets the value of the singleSkuSellingBrandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleSkuSellingBrandCode() {
        return singleSkuSellingBrandCode;
    }

    /**
     * Sets the value of the singleSkuSellingBrandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleSkuSellingBrandCode(String value) {
        this.singleSkuSellingBrandCode = value;
    }

    /**
     * Gets the value of the omimReturnReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmimReturnReasonCode() {
        return omimReturnReasonCode;
    }

    /**
     * Sets the value of the omimReturnReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmimReturnReasonCode(String value) {
        this.omimReturnReasonCode = value;
    }

    /**
     * Gets the value of the assignmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentCode() {
        return assignmentCode;
    }

    /**
     * Sets the value of the assignmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentCode(String value) {
        this.assignmentCode = value;
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
     * Gets the value of the devicePurchaseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePurchaseType() {
        return devicePurchaseType;
    }

    /**
     * Sets the value of the devicePurchaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePurchaseType(String value) {
        this.devicePurchaseType = value;
    }

    /**
     * Gets the value of the appliedLeaseDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAppliedLeaseDiscountAmount() {
        return appliedLeaseDiscountAmount;
    }

    /**
     * Sets the value of the appliedLeaseDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAppliedLeaseDiscountAmount(Double value) {
        this.appliedLeaseDiscountAmount = value;
    }

    /**
     * Gets the value of the appliedLeaseAdpsDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAppliedLeaseAdpsDiscountAmount() {
        return appliedLeaseAdpsDiscountAmount;
    }

    /**
     * Sets the value of the appliedLeaseAdpsDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAppliedLeaseAdpsDiscountAmount(Double value) {
        this.appliedLeaseAdpsDiscountAmount = value;
    }

    /**
     * Gets the value of the buybackPromoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackPromoCode() {
        return buybackPromoCode;
    }

    /**
     * Sets the value of the buybackPromoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackPromoCode(String value) {
        this.buybackPromoCode = value;
    }

    /**
     * Gets the value of the buybackSystemProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackSystemProductId() {
        return buybackSystemProductId;
    }

    /**
     * Sets the value of the buybackSystemProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackSystemProductId(String value) {
        this.buybackSystemProductId = value;
    }

    /**
     * Gets the value of the buybackAnswerList property.
     * 
     * @return
     *     possible object is
     *     {@link BuybackAnswerList }
     *     
     */
    public BuybackAnswerList getBuybackAnswerList() {
        return buybackAnswerList;
    }

    /**
     * Sets the value of the buybackAnswerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuybackAnswerList }
     *     
     */
    public void setBuybackAnswerList(BuybackAnswerList value) {
        this.buybackAnswerList = value;
    }

    /**
     * Gets the value of the bxgxInfo0020 property.
     * 
     * @return
     *     possible object is
     *     {@link BxgxInfo }
     *     
     */
    public BxgxInfo getBxgxInfo_0020() {
        return bxgxInfo0020;
    }

    /**
     * Sets the value of the bxgxInfo0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BxgxInfo }
     *     
     */
    public void setBxgxInfo_0020(BxgxInfo value) {
        this.bxgxInfo0020 = value;
    }

}


package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOtherInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOtherInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromptForPriceIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ProductOnhandByStore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TaxingMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsactiveBypassIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KitTriggerIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BillingSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LogisticsSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DefSIMSKUIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NewStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConditionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AlternateProductSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClassType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubClassType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SerializationIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CaTaxRuleOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NmsManufName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SkuType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DirectFulfillmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="SkuPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IsStandaloneIBEligible" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stockedSkuIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="backOrderIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="warehouseMinQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOtherInfo", propOrder = {
    "promptForPriceIndicator",
    "activeIndicator",
    "taxGroupCode",
    "unitCost",
    "productOnhandByStore",
    "taxingMethod",
    "productSKU",
    "isactiveBypassIndicator",
    "kitTriggerIndicator",
    "billingSystemName",
    "logisticsSKU",
    "typeCode",
    "defSIMSKUIdentifier",
    "newStatusCode",
    "conditionIdentifier",
    "alternateProductSKU",
    "classType",
    "subClassType",
    "serializationIndicator",
    "type",
    "caTaxRuleOverrideIndicator",
    "nmsManufName",
    "skuType",
    "directFulfillmentIndicator",
    "groupId",
    "unitPrice",
    "skuPrice",
    "lineTotal",
    "quantity",
    "isStandaloneIBEligible",
    "stockedSkuIndicator",
    "backOrderIndicator",
    "warehouseMinQty"
})
public class ProductOtherInfo {

    @XmlElement(name = "PromptForPriceIndicator", required = true, nillable = true)
    protected String promptForPriceIndicator;
    @XmlElement(name = "ActiveIndicator", required = true, nillable = true)
    protected String activeIndicator;
    @XmlElement(name = "TaxGroupCode", required = true, nillable = true)
    protected String taxGroupCode;
    @XmlElement(name = "UnitCost", required = true, nillable = true)
    protected BigDecimal unitCost;
    @XmlElement(name = "ProductOnhandByStore", required = true, type = Integer.class, nillable = true)
    protected Integer productOnhandByStore;
    @XmlElement(name = "TaxingMethod", required = true, nillable = true)
    protected String taxingMethod;
    @XmlElement(name = "ProductSKU", required = true, nillable = true)
    protected String productSKU;
    @XmlElement(name = "IsactiveBypassIndicator", required = true, nillable = true)
    protected String isactiveBypassIndicator;
    @XmlElement(name = "KitTriggerIndicator", required = true, nillable = true)
    protected String kitTriggerIndicator;
    @XmlElement(name = "BillingSystemName", required = true, nillable = true)
    protected String billingSystemName;
    @XmlElement(name = "LogisticsSKU", required = true, nillable = true)
    protected String logisticsSKU;
    @XmlElement(name = "TypeCode", required = true, nillable = true)
    protected String typeCode;
    @XmlElement(name = "DefSIMSKUIdentifier", required = true, type = Integer.class, nillable = true)
    protected Integer defSIMSKUIdentifier;
    @XmlElement(name = "NewStatusCode", required = true, nillable = true)
    protected String newStatusCode;
    @XmlElement(name = "ConditionIdentifier", required = true, type = Integer.class, nillable = true)
    protected Integer conditionIdentifier;
    @XmlElement(name = "AlternateProductSKU", required = true, nillable = true)
    protected String alternateProductSKU;
    @XmlElement(name = "ClassType", required = true, nillable = true)
    protected String classType;
    @XmlElement(name = "SubClassType", required = true, nillable = true)
    protected String subClassType;
    @XmlElement(name = "SerializationIndicator", required = true, nillable = true)
    protected String serializationIndicator;
    @XmlElement(name = "Type", required = true, nillable = true)
    protected String type;
    @XmlElement(name = "CaTaxRuleOverrideIndicator", required = true, nillable = true)
    protected String caTaxRuleOverrideIndicator;
    @XmlElement(name = "NmsManufName", required = true, nillable = true)
    protected String nmsManufName;
    @XmlElement(name = "SkuType", required = true, nillable = true)
    protected String skuType;
    @XmlElement(name = "DirectFulfillmentIndicator", required = true)
    protected String directFulfillmentIndicator;
    @XmlElement(name = "GroupId")
    protected int groupId;
    @XmlElement(name = "UnitPrice")
    protected double unitPrice;
    @XmlElement(name = "SkuPrice")
    protected double skuPrice;
    @XmlElement(name = "LineTotal")
    protected double lineTotal;
    @XmlElement(name = "Quantity")
    protected double quantity;
    @XmlElement(name = "IsStandaloneIBEligible", required = true, nillable = true)
    protected String isStandaloneIBEligible;
    @XmlElement(required = true)
    protected String stockedSkuIndicator;
    @XmlElement(required = true)
    protected String backOrderIndicator;
    protected int warehouseMinQty;

    /**
     * Gets the value of the promptForPriceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptForPriceIndicator() {
        return promptForPriceIndicator;
    }

    /**
     * Sets the value of the promptForPriceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptForPriceIndicator(String value) {
        this.promptForPriceIndicator = value;
    }

    /**
     * Gets the value of the activeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveIndicator() {
        return activeIndicator;
    }

    /**
     * Sets the value of the activeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveIndicator(String value) {
        this.activeIndicator = value;
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
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCost(BigDecimal value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the productOnhandByStore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductOnhandByStore() {
        return productOnhandByStore;
    }

    /**
     * Sets the value of the productOnhandByStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductOnhandByStore(Integer value) {
        this.productOnhandByStore = value;
    }

    /**
     * Gets the value of the taxingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxingMethod() {
        return taxingMethod;
    }

    /**
     * Sets the value of the taxingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxingMethod(String value) {
        this.taxingMethod = value;
    }

    /**
     * Gets the value of the productSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSKU() {
        return productSKU;
    }

    /**
     * Sets the value of the productSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSKU(String value) {
        this.productSKU = value;
    }

    /**
     * Gets the value of the isactiveBypassIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsactiveBypassIndicator() {
        return isactiveBypassIndicator;
    }

    /**
     * Sets the value of the isactiveBypassIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsactiveBypassIndicator(String value) {
        this.isactiveBypassIndicator = value;
    }

    /**
     * Gets the value of the kitTriggerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitTriggerIndicator() {
        return kitTriggerIndicator;
    }

    /**
     * Sets the value of the kitTriggerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitTriggerIndicator(String value) {
        this.kitTriggerIndicator = value;
    }

    /**
     * Gets the value of the billingSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingSystemName() {
        return billingSystemName;
    }

    /**
     * Sets the value of the billingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingSystemName(String value) {
        this.billingSystemName = value;
    }

    /**
     * Gets the value of the logisticsSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsSKU() {
        return logisticsSKU;
    }

    /**
     * Sets the value of the logisticsSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsSKU(String value) {
        this.logisticsSKU = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the defSIMSKUIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefSIMSKUIdentifier() {
        return defSIMSKUIdentifier;
    }

    /**
     * Sets the value of the defSIMSKUIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefSIMSKUIdentifier(Integer value) {
        this.defSIMSKUIdentifier = value;
    }

    /**
     * Gets the value of the newStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatusCode() {
        return newStatusCode;
    }

    /**
     * Sets the value of the newStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatusCode(String value) {
        this.newStatusCode = value;
    }

    /**
     * Gets the value of the conditionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConditionIdentifier() {
        return conditionIdentifier;
    }

    /**
     * Sets the value of the conditionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConditionIdentifier(Integer value) {
        this.conditionIdentifier = value;
    }

    /**
     * Gets the value of the alternateProductSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateProductSKU() {
        return alternateProductSKU;
    }

    /**
     * Sets the value of the alternateProductSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateProductSKU(String value) {
        this.alternateProductSKU = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassType(String value) {
        this.classType = value;
    }

    /**
     * Gets the value of the subClassType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClassType() {
        return subClassType;
    }

    /**
     * Sets the value of the subClassType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClassType(String value) {
        this.subClassType = value;
    }

    /**
     * Gets the value of the serializationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerializationIndicator() {
        return serializationIndicator;
    }

    /**
     * Sets the value of the serializationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerializationIndicator(String value) {
        this.serializationIndicator = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the caTaxRuleOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaTaxRuleOverrideIndicator() {
        return caTaxRuleOverrideIndicator;
    }

    /**
     * Sets the value of the caTaxRuleOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaTaxRuleOverrideIndicator(String value) {
        this.caTaxRuleOverrideIndicator = value;
    }

    /**
     * Gets the value of the nmsManufName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsManufName() {
        return nmsManufName;
    }

    /**
     * Sets the value of the nmsManufName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsManufName(String value) {
        this.nmsManufName = value;
    }

    /**
     * Gets the value of the skuType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuType() {
        return skuType;
    }

    /**
     * Sets the value of the skuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuType(String value) {
        this.skuType = value;
    }

    /**
     * Gets the value of the directFulfillmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectFulfillmentIndicator() {
        return directFulfillmentIndicator;
    }

    /**
     * Sets the value of the directFulfillmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectFulfillmentIndicator(String value) {
        this.directFulfillmentIndicator = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(int value) {
        this.groupId = value;
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
     * Gets the value of the lineTotal property.
     * 
     */
    public double getLineTotal() {
        return lineTotal;
    }

    /**
     * Sets the value of the lineTotal property.
     * 
     */
    public void setLineTotal(double value) {
        this.lineTotal = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the isStandaloneIBEligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStandaloneIBEligible() {
        return isStandaloneIBEligible;
    }

    /**
     * Sets the value of the isStandaloneIBEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStandaloneIBEligible(String value) {
        this.isStandaloneIBEligible = value;
    }

    /**
     * Gets the value of the stockedSkuIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockedSkuIndicator() {
        return stockedSkuIndicator;
    }

    /**
     * Sets the value of the stockedSkuIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockedSkuIndicator(String value) {
        this.stockedSkuIndicator = value;
    }

    /**
     * Gets the value of the backOrderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOrderIndicator() {
        return backOrderIndicator;
    }

    /**
     * Sets the value of the backOrderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOrderIndicator(String value) {
        this.backOrderIndicator = value;
    }

    /**
     * Gets the value of the warehouseMinQty property.
     * 
     */
    public int getWarehouseMinQty() {
        return warehouseMinQty;
    }

    /**
     * Sets the value of the warehouseMinQty property.
     * 
     */
    public void setWarehouseMinQty(int value) {
        this.warehouseMinQty = value;
    }

}

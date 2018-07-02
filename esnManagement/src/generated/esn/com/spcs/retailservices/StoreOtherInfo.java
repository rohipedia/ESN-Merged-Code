
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreOtherInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreOtherInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeographicRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LogoBitmap" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArchiveDaysNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DefaultFloatAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SatelliteStoreInventoryIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceLevelIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TaxRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProfitCenter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardExpirationPrintIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LogisticsWarehouseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DealerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="P2kIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BravoPrintIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScdValidationIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BackDatingIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScdItemDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PersistentNoteIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IcsEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreSAASPortalIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreProNavHelpIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreRMSHelpIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreSiebelEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeTradeEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreSiebelCouponEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StorePRLottoIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StorePRLottoMerchantIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BuyBackPretaxCreditEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GrossTaxCityReceiptEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EmailReceiptEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlipFlopEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShareCashDrawerIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EibEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShoppingCartEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreOtherInfo", propOrder = {
    "geographicRegionIdentifier",
    "logoBitmap",
    "archiveDaysNumber",
    "defaultFloatAmount",
    "satelliteStoreInventoryIdentifier",
    "taxNumber",
    "priceLevelIdentifier",
    "taxRegionIdentifier",
    "profitCenter",
    "cardExpirationPrintIndicator",
    "logisticsWarehouseIdentifier",
    "dealerCode",
    "p2KIndicator",
    "bravoPrintIndicator",
    "scdValidationIndicator",
    "backDatingIndicator",
    "scdItemDisplayIndicator",
    "brandCode",
    "persistentNoteIndicator",
    "icsEnabledIndicator",
    "storeSAASPortalIndicator",
    "storeProNavHelpIndicator",
    "storeRMSHelpIndicator",
    "storeSiebelEnabledIndicator",
    "timeTradeEnabledIndicator",
    "storeSiebelCouponEnabledIndicator",
    "storePRLottoIndicator",
    "storePRLottoMerchantIdentifier",
    "buyBackPretaxCreditEnabledIndicator",
    "grossTaxCityReceiptEnabledIndicator",
    "emailReceiptEnabledIndicator",
    "flipFlopEnabledIndicator",
    "shareCashDrawerIndicator",
    "eibEnabledIndicator",
    "shoppingCartEnabledIndicator"
})
public class StoreOtherInfo {

    @XmlElement(name = "GeographicRegionIdentifier")
    protected int geographicRegionIdentifier;
    @XmlElement(name = "LogoBitmap", required = true, nillable = true)
    protected String logoBitmap;
    @XmlElement(name = "ArchiveDaysNumber")
    protected int archiveDaysNumber;
    @XmlElement(name = "DefaultFloatAmount")
    protected int defaultFloatAmount;
    @XmlElement(name = "SatelliteStoreInventoryIdentifier")
    protected int satelliteStoreInventoryIdentifier;
    @XmlElement(name = "TaxNumber", required = true, nillable = true)
    protected String taxNumber;
    @XmlElement(name = "PriceLevelIdentifier")
    protected int priceLevelIdentifier;
    @XmlElement(name = "TaxRegionIdentifier")
    protected int taxRegionIdentifier;
    @XmlElement(name = "ProfitCenter", required = true, nillable = true)
    protected String profitCenter;
    @XmlElement(name = "CardExpirationPrintIndicator", required = true, nillable = true)
    protected String cardExpirationPrintIndicator;
    @XmlElement(name = "LogisticsWarehouseIdentifier", required = true, nillable = true)
    protected String logisticsWarehouseIdentifier;
    @XmlElement(name = "DealerCode", required = true, nillable = true)
    protected String dealerCode;
    @XmlElement(name = "P2kIndicator", required = true, nillable = true)
    protected String p2KIndicator;
    @XmlElement(name = "BravoPrintIndicator", required = true, nillable = true)
    protected String bravoPrintIndicator;
    @XmlElement(name = "ScdValidationIndicator", required = true, nillable = true)
    protected String scdValidationIndicator;
    @XmlElement(name = "BackDatingIndicator", required = true, nillable = true)
    protected String backDatingIndicator;
    @XmlElement(name = "ScdItemDisplayIndicator", required = true, nillable = true)
    protected String scdItemDisplayIndicator;
    @XmlElement(name = "BrandCode", required = true, nillable = true)
    protected String brandCode;
    @XmlElement(name = "PersistentNoteIndicator", required = true, nillable = true)
    protected String persistentNoteIndicator;
    @XmlElement(name = "IcsEnabledIndicator", required = true, nillable = true)
    protected String icsEnabledIndicator;
    @XmlElement(name = "StoreSAASPortalIndicator", required = true, nillable = true)
    protected String storeSAASPortalIndicator;
    @XmlElement(name = "StoreProNavHelpIndicator", required = true, nillable = true)
    protected String storeProNavHelpIndicator;
    @XmlElement(name = "StoreRMSHelpIndicator", required = true, nillable = true)
    protected String storeRMSHelpIndicator;
    @XmlElement(name = "StoreSiebelEnabledIndicator", required = true, nillable = true)
    protected String storeSiebelEnabledIndicator;
    @XmlElement(name = "TimeTradeEnabledIndicator", required = true, nillable = true)
    protected String timeTradeEnabledIndicator;
    @XmlElement(name = "StoreSiebelCouponEnabledIndicator", required = true, nillable = true)
    protected String storeSiebelCouponEnabledIndicator;
    @XmlElement(name = "StorePRLottoIndicator", required = true, nillable = true)
    protected String storePRLottoIndicator;
    @XmlElement(name = "StorePRLottoMerchantIdentifier", required = true, nillable = true)
    protected String storePRLottoMerchantIdentifier;
    @XmlElement(name = "BuyBackPretaxCreditEnabledIndicator", required = true, nillable = true)
    protected String buyBackPretaxCreditEnabledIndicator;
    @XmlElement(name = "GrossTaxCityReceiptEnabledIndicator", required = true, nillable = true)
    protected String grossTaxCityReceiptEnabledIndicator;
    @XmlElement(name = "EmailReceiptEnabledIndicator", required = true, nillable = true)
    protected String emailReceiptEnabledIndicator;
    @XmlElement(name = "FlipFlopEnabledIndicator", required = true, nillable = true)
    protected String flipFlopEnabledIndicator;
    @XmlElement(name = "ShareCashDrawerIndicator", required = true, nillable = true)
    protected String shareCashDrawerIndicator;
    @XmlElement(name = "EibEnabledIndicator", required = true, nillable = true)
    protected String eibEnabledIndicator;
    @XmlElement(name = "ShoppingCartEnabledIndicator", required = true, nillable = true)
    protected String shoppingCartEnabledIndicator;

    /**
     * Gets the value of the geographicRegionIdentifier property.
     * 
     */
    public int getGeographicRegionIdentifier() {
        return geographicRegionIdentifier;
    }

    /**
     * Sets the value of the geographicRegionIdentifier property.
     * 
     */
    public void setGeographicRegionIdentifier(int value) {
        this.geographicRegionIdentifier = value;
    }

    /**
     * Gets the value of the logoBitmap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoBitmap() {
        return logoBitmap;
    }

    /**
     * Sets the value of the logoBitmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoBitmap(String value) {
        this.logoBitmap = value;
    }

    /**
     * Gets the value of the archiveDaysNumber property.
     * 
     */
    public int getArchiveDaysNumber() {
        return archiveDaysNumber;
    }

    /**
     * Sets the value of the archiveDaysNumber property.
     * 
     */
    public void setArchiveDaysNumber(int value) {
        this.archiveDaysNumber = value;
    }

    /**
     * Gets the value of the defaultFloatAmount property.
     * 
     */
    public int getDefaultFloatAmount() {
        return defaultFloatAmount;
    }

    /**
     * Sets the value of the defaultFloatAmount property.
     * 
     */
    public void setDefaultFloatAmount(int value) {
        this.defaultFloatAmount = value;
    }

    /**
     * Gets the value of the satelliteStoreInventoryIdentifier property.
     * 
     */
    public int getSatelliteStoreInventoryIdentifier() {
        return satelliteStoreInventoryIdentifier;
    }

    /**
     * Sets the value of the satelliteStoreInventoryIdentifier property.
     * 
     */
    public void setSatelliteStoreInventoryIdentifier(int value) {
        this.satelliteStoreInventoryIdentifier = value;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

    /**
     * Gets the value of the priceLevelIdentifier property.
     * 
     */
    public int getPriceLevelIdentifier() {
        return priceLevelIdentifier;
    }

    /**
     * Sets the value of the priceLevelIdentifier property.
     * 
     */
    public void setPriceLevelIdentifier(int value) {
        this.priceLevelIdentifier = value;
    }

    /**
     * Gets the value of the taxRegionIdentifier property.
     * 
     */
    public int getTaxRegionIdentifier() {
        return taxRegionIdentifier;
    }

    /**
     * Sets the value of the taxRegionIdentifier property.
     * 
     */
    public void setTaxRegionIdentifier(int value) {
        this.taxRegionIdentifier = value;
    }

    /**
     * Gets the value of the profitCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * Sets the value of the profitCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCenter(String value) {
        this.profitCenter = value;
    }

    /**
     * Gets the value of the cardExpirationPrintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationPrintIndicator() {
        return cardExpirationPrintIndicator;
    }

    /**
     * Sets the value of the cardExpirationPrintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationPrintIndicator(String value) {
        this.cardExpirationPrintIndicator = value;
    }

    /**
     * Gets the value of the logisticsWarehouseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsWarehouseIdentifier() {
        return logisticsWarehouseIdentifier;
    }

    /**
     * Sets the value of the logisticsWarehouseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsWarehouseIdentifier(String value) {
        this.logisticsWarehouseIdentifier = value;
    }

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the p2KIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2KIndicator() {
        return p2KIndicator;
    }

    /**
     * Sets the value of the p2KIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2KIndicator(String value) {
        this.p2KIndicator = value;
    }

    /**
     * Gets the value of the bravoPrintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBravoPrintIndicator() {
        return bravoPrintIndicator;
    }

    /**
     * Sets the value of the bravoPrintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBravoPrintIndicator(String value) {
        this.bravoPrintIndicator = value;
    }

    /**
     * Gets the value of the scdValidationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScdValidationIndicator() {
        return scdValidationIndicator;
    }

    /**
     * Sets the value of the scdValidationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScdValidationIndicator(String value) {
        this.scdValidationIndicator = value;
    }

    /**
     * Gets the value of the backDatingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackDatingIndicator() {
        return backDatingIndicator;
    }

    /**
     * Sets the value of the backDatingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackDatingIndicator(String value) {
        this.backDatingIndicator = value;
    }

    /**
     * Gets the value of the scdItemDisplayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScdItemDisplayIndicator() {
        return scdItemDisplayIndicator;
    }

    /**
     * Sets the value of the scdItemDisplayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScdItemDisplayIndicator(String value) {
        this.scdItemDisplayIndicator = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the persistentNoteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistentNoteIndicator() {
        return persistentNoteIndicator;
    }

    /**
     * Sets the value of the persistentNoteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistentNoteIndicator(String value) {
        this.persistentNoteIndicator = value;
    }

    /**
     * Gets the value of the icsEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcsEnabledIndicator() {
        return icsEnabledIndicator;
    }

    /**
     * Sets the value of the icsEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcsEnabledIndicator(String value) {
        this.icsEnabledIndicator = value;
    }

    /**
     * Gets the value of the storeSAASPortalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreSAASPortalIndicator() {
        return storeSAASPortalIndicator;
    }

    /**
     * Sets the value of the storeSAASPortalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreSAASPortalIndicator(String value) {
        this.storeSAASPortalIndicator = value;
    }

    /**
     * Gets the value of the storeProNavHelpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreProNavHelpIndicator() {
        return storeProNavHelpIndicator;
    }

    /**
     * Sets the value of the storeProNavHelpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreProNavHelpIndicator(String value) {
        this.storeProNavHelpIndicator = value;
    }

    /**
     * Gets the value of the storeRMSHelpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreRMSHelpIndicator() {
        return storeRMSHelpIndicator;
    }

    /**
     * Sets the value of the storeRMSHelpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreRMSHelpIndicator(String value) {
        this.storeRMSHelpIndicator = value;
    }

    /**
     * Gets the value of the storeSiebelEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreSiebelEnabledIndicator() {
        return storeSiebelEnabledIndicator;
    }

    /**
     * Sets the value of the storeSiebelEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreSiebelEnabledIndicator(String value) {
        this.storeSiebelEnabledIndicator = value;
    }

    /**
     * Gets the value of the timeTradeEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTradeEnabledIndicator() {
        return timeTradeEnabledIndicator;
    }

    /**
     * Sets the value of the timeTradeEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTradeEnabledIndicator(String value) {
        this.timeTradeEnabledIndicator = value;
    }

    /**
     * Gets the value of the storeSiebelCouponEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreSiebelCouponEnabledIndicator() {
        return storeSiebelCouponEnabledIndicator;
    }

    /**
     * Sets the value of the storeSiebelCouponEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreSiebelCouponEnabledIndicator(String value) {
        this.storeSiebelCouponEnabledIndicator = value;
    }

    /**
     * Gets the value of the storePRLottoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorePRLottoIndicator() {
        return storePRLottoIndicator;
    }

    /**
     * Sets the value of the storePRLottoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorePRLottoIndicator(String value) {
        this.storePRLottoIndicator = value;
    }

    /**
     * Gets the value of the storePRLottoMerchantIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorePRLottoMerchantIdentifier() {
        return storePRLottoMerchantIdentifier;
    }

    /**
     * Sets the value of the storePRLottoMerchantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorePRLottoMerchantIdentifier(String value) {
        this.storePRLottoMerchantIdentifier = value;
    }

    /**
     * Gets the value of the buyBackPretaxCreditEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyBackPretaxCreditEnabledIndicator() {
        return buyBackPretaxCreditEnabledIndicator;
    }

    /**
     * Sets the value of the buyBackPretaxCreditEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyBackPretaxCreditEnabledIndicator(String value) {
        this.buyBackPretaxCreditEnabledIndicator = value;
    }

    /**
     * Gets the value of the grossTaxCityReceiptEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossTaxCityReceiptEnabledIndicator() {
        return grossTaxCityReceiptEnabledIndicator;
    }

    /**
     * Sets the value of the grossTaxCityReceiptEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossTaxCityReceiptEnabledIndicator(String value) {
        this.grossTaxCityReceiptEnabledIndicator = value;
    }

    /**
     * Gets the value of the emailReceiptEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailReceiptEnabledIndicator() {
        return emailReceiptEnabledIndicator;
    }

    /**
     * Sets the value of the emailReceiptEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailReceiptEnabledIndicator(String value) {
        this.emailReceiptEnabledIndicator = value;
    }

    /**
     * Gets the value of the flipFlopEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlipFlopEnabledIndicator() {
        return flipFlopEnabledIndicator;
    }

    /**
     * Sets the value of the flipFlopEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlipFlopEnabledIndicator(String value) {
        this.flipFlopEnabledIndicator = value;
    }

    /**
     * Gets the value of the shareCashDrawerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareCashDrawerIndicator() {
        return shareCashDrawerIndicator;
    }

    /**
     * Sets the value of the shareCashDrawerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareCashDrawerIndicator(String value) {
        this.shareCashDrawerIndicator = value;
    }

    /**
     * Gets the value of the eibEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEibEnabledIndicator() {
        return eibEnabledIndicator;
    }

    /**
     * Sets the value of the eibEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEibEnabledIndicator(String value) {
        this.eibEnabledIndicator = value;
    }

    /**
     * Gets the value of the shoppingCartEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingCartEnabledIndicator() {
        return shoppingCartEnabledIndicator;
    }

    /**
     * Sets the value of the shoppingCartEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingCartEnabledIndicator(String value) {
        this.shoppingCartEnabledIndicator = value;
    }

}

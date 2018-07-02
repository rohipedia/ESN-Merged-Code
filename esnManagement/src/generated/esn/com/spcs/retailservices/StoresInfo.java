
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StoresInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoresInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locbaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="storeChannelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxRegId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="priceLvlId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mainLocbaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="companyNm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lastUpd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="subHeader" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultFloat" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="profitCentre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="installmentSales" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autoCloseGrp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="displayCcExpiryFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="closestoreFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeAsiId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeStatusIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dealerCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bravoEnblPrtrIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scdVldnIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="backdatingEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scdDsplItemEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeBrndCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="persistNoteIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timetradeEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siebelCouponEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siebelEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoMerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pronavHelpIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rmsHelpIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buybackPretaxcrEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="grosstaxCityRcptEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailRcptEnableIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flipFlopIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sharedCashDrawerEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipInstlBillEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shoppingCartEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeDealerNm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defSharedDrawerFloatAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="prProfitCenter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipInstlBillCnstOnIpad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creditCheckPin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bizDirectStoreIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mrtEnableIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceRepairIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idCaptureEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preScreenEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sharedCashDrawerList" type="{java:com.spcs.retailservices.domain}SharedCashDrawerList"/&gt;
 *         &lt;element name="MerchantCardDetails" type="{java:com.spcs.retailservices.domain}MerchantCardDetails"/&gt;
 *         &lt;element name="hcInterimEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bxgxEnableIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emvEnableIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoresInfo", propOrder = {
    "locbaId",
    "storeChannelCode",
    "taxRegId",
    "priceLvlId",
    "mainLocbaId",
    "companyNm",
    "regionId",
    "typeId",
    "lastUpd",
    "subHeader",
    "defaultFloat",
    "profitCentre",
    "installmentSales",
    "autoCloseGrp",
    "displayCcExpiryFlag",
    "closestoreFlag",
    "storeAsiId",
    "storeStatusIndcr",
    "dealerCd",
    "bravoEnblPrtrIndcr",
    "scdVldnIndcr",
    "backdatingEnblIndcr",
    "scdDsplItemEnblIndcr",
    "storeBrndCd",
    "persistNoteIndcr",
    "timetradeEnabled",
    "siebelCouponEnblIndcr",
    "siebelEnblIndcr",
    "prLottoIndcr",
    "prLottoMerchantId",
    "pronavHelpIndcr",
    "rmsHelpIndcr",
    "buybackPretaxcrEnblIndcr",
    "grosstaxCityRcptEnblIndcr",
    "emailRcptEnableIndcr",
    "flipFlopIndcr",
    "sharedCashDrawerEnblIndcr",
    "equipInstlBillEnblIndcr",
    "shoppingCartEnblIndcr",
    "storeDealerNm",
    "defSharedDrawerFloatAmt",
    "prProfitCenter",
    "equipInstlBillCnstOnIpad",
    "creditCheckPin",
    "bizDirectStoreIndcr",
    "storeName",
    "streetName",
    "city",
    "state",
    "country",
    "zip",
    "phone",
    "stateCode",
    "mrtEnableIndicator",
    "serviceRepairIndicator",
    "idCaptureEnabled",
    "preScreenEnabled",
    "sharedCashDrawerList",
    "merchantCardDetails",
    "hcInterimEnabled",
    "bxgxEnableIndcr",
    "emvEnableIndcr"
})
public class StoresInfo {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long locbaId;
    @XmlElement(required = true, nillable = true)
    protected String storeChannelCode;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxRegId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long priceLvlId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long mainLocbaId;
    @XmlElement(required = true, nillable = true)
    protected String companyNm;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long regionId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long typeId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpd;
    @XmlElement(required = true, nillable = true)
    protected String subHeader;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double defaultFloat;
    @XmlElement(required = true, nillable = true)
    protected String profitCentre;
    @XmlElement(required = true, nillable = true)
    protected String installmentSales;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer autoCloseGrp;
    @XmlElement(required = true, nillable = true)
    protected String displayCcExpiryFlag;
    @XmlElement(required = true, nillable = true)
    protected String closestoreFlag;
    @XmlElement(required = true, nillable = true)
    protected String storeAsiId;
    @XmlElement(required = true, nillable = true)
    protected String storeStatusIndcr;
    @XmlElement(required = true, nillable = true)
    protected String dealerCd;
    @XmlElement(required = true, nillable = true)
    protected String bravoEnblPrtrIndcr;
    @XmlElement(required = true, nillable = true)
    protected String scdVldnIndcr;
    @XmlElement(required = true, nillable = true)
    protected String backdatingEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String scdDsplItemEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String storeBrndCd;
    @XmlElement(required = true, nillable = true)
    protected String persistNoteIndcr;
    @XmlElement(required = true, nillable = true)
    protected String timetradeEnabled;
    @XmlElement(required = true, nillable = true)
    protected String siebelCouponEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String siebelEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String prLottoIndcr;
    @XmlElement(required = true, nillable = true)
    protected String prLottoMerchantId;
    @XmlElement(required = true, nillable = true)
    protected String pronavHelpIndcr;
    @XmlElement(required = true, nillable = true)
    protected String rmsHelpIndcr;
    @XmlElement(required = true, nillable = true)
    protected String buybackPretaxcrEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String grosstaxCityRcptEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String emailRcptEnableIndcr;
    @XmlElement(required = true, nillable = true)
    protected String flipFlopIndcr;
    @XmlElement(required = true, nillable = true)
    protected String sharedCashDrawerEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String equipInstlBillEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String shoppingCartEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String storeDealerNm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double defSharedDrawerFloatAmt;
    @XmlElement(required = true, nillable = true)
    protected String prProfitCenter;
    @XmlElement(required = true, nillable = true)
    protected String equipInstlBillCnstOnIpad;
    @XmlElement(required = true, nillable = true)
    protected String creditCheckPin;
    @XmlElement(required = true, nillable = true)
    protected String bizDirectStoreIndcr;
    @XmlElement(required = true, nillable = true)
    protected String storeName;
    @XmlElement(required = true, nillable = true)
    protected String streetName;
    @XmlElement(required = true, nillable = true)
    protected String city;
    @XmlElement(required = true, nillable = true)
    protected String state;
    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected String zip;
    @XmlElement(required = true, nillable = true)
    protected String phone;
    @XmlElement(required = true, nillable = true)
    protected String stateCode;
    @XmlElement(required = true)
    protected String mrtEnableIndicator;
    @XmlElement(required = true)
    protected String serviceRepairIndicator;
    @XmlElement(required = true)
    protected String idCaptureEnabled;
    @XmlElement(required = true)
    protected String preScreenEnabled;
    @XmlElement(required = true)
    protected SharedCashDrawerList sharedCashDrawerList;
    @XmlElement(name = "MerchantCardDetails", required = true)
    protected MerchantCardDetails merchantCardDetails;
    @XmlElement(required = true)
    protected String hcInterimEnabled;
    @XmlElement(required = true)
    protected String bxgxEnableIndcr;
    @XmlElement(required = true)
    protected String emvEnableIndcr;

    /**
     * Gets the value of the locbaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocbaId() {
        return locbaId;
    }

    /**
     * Sets the value of the locbaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocbaId(Long value) {
        this.locbaId = value;
    }

    /**
     * Gets the value of the storeChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreChannelCode() {
        return storeChannelCode;
    }

    /**
     * Sets the value of the storeChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreChannelCode(String value) {
        this.storeChannelCode = value;
    }

    /**
     * Gets the value of the taxRegId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxRegId() {
        return taxRegId;
    }

    /**
     * Sets the value of the taxRegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxRegId(Long value) {
        this.taxRegId = value;
    }

    /**
     * Gets the value of the priceLvlId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceLvlId() {
        return priceLvlId;
    }

    /**
     * Sets the value of the priceLvlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceLvlId(Long value) {
        this.priceLvlId = value;
    }

    /**
     * Gets the value of the mainLocbaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainLocbaId() {
        return mainLocbaId;
    }

    /**
     * Sets the value of the mainLocbaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainLocbaId(Long value) {
        this.mainLocbaId = value;
    }

    /**
     * Gets the value of the companyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNm() {
        return companyNm;
    }

    /**
     * Sets the value of the companyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNm(String value) {
        this.companyNm = value;
    }

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionId(Long value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeId(Long value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the lastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpd() {
        return lastUpd;
    }

    /**
     * Sets the value of the lastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpd(XMLGregorianCalendar value) {
        this.lastUpd = value;
    }

    /**
     * Gets the value of the subHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubHeader() {
        return subHeader;
    }

    /**
     * Sets the value of the subHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubHeader(String value) {
        this.subHeader = value;
    }

    /**
     * Gets the value of the defaultFloat property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultFloat() {
        return defaultFloat;
    }

    /**
     * Sets the value of the defaultFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultFloat(Double value) {
        this.defaultFloat = value;
    }

    /**
     * Gets the value of the profitCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCentre() {
        return profitCentre;
    }

    /**
     * Sets the value of the profitCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCentre(String value) {
        this.profitCentre = value;
    }

    /**
     * Gets the value of the installmentSales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentSales() {
        return installmentSales;
    }

    /**
     * Sets the value of the installmentSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentSales(String value) {
        this.installmentSales = value;
    }

    /**
     * Gets the value of the autoCloseGrp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoCloseGrp() {
        return autoCloseGrp;
    }

    /**
     * Sets the value of the autoCloseGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoCloseGrp(Integer value) {
        this.autoCloseGrp = value;
    }

    /**
     * Gets the value of the displayCcExpiryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCcExpiryFlag() {
        return displayCcExpiryFlag;
    }

    /**
     * Sets the value of the displayCcExpiryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCcExpiryFlag(String value) {
        this.displayCcExpiryFlag = value;
    }

    /**
     * Gets the value of the closestoreFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosestoreFlag() {
        return closestoreFlag;
    }

    /**
     * Sets the value of the closestoreFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosestoreFlag(String value) {
        this.closestoreFlag = value;
    }

    /**
     * Gets the value of the storeAsiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreAsiId() {
        return storeAsiId;
    }

    /**
     * Sets the value of the storeAsiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreAsiId(String value) {
        this.storeAsiId = value;
    }

    /**
     * Gets the value of the storeStatusIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreStatusIndcr() {
        return storeStatusIndcr;
    }

    /**
     * Sets the value of the storeStatusIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreStatusIndcr(String value) {
        this.storeStatusIndcr = value;
    }

    /**
     * Gets the value of the dealerCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCd() {
        return dealerCd;
    }

    /**
     * Sets the value of the dealerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCd(String value) {
        this.dealerCd = value;
    }

    /**
     * Gets the value of the bravoEnblPrtrIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBravoEnblPrtrIndcr() {
        return bravoEnblPrtrIndcr;
    }

    /**
     * Sets the value of the bravoEnblPrtrIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBravoEnblPrtrIndcr(String value) {
        this.bravoEnblPrtrIndcr = value;
    }

    /**
     * Gets the value of the scdVldnIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScdVldnIndcr() {
        return scdVldnIndcr;
    }

    /**
     * Sets the value of the scdVldnIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScdVldnIndcr(String value) {
        this.scdVldnIndcr = value;
    }

    /**
     * Gets the value of the backdatingEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackdatingEnblIndcr() {
        return backdatingEnblIndcr;
    }

    /**
     * Sets the value of the backdatingEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackdatingEnblIndcr(String value) {
        this.backdatingEnblIndcr = value;
    }

    /**
     * Gets the value of the scdDsplItemEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScdDsplItemEnblIndcr() {
        return scdDsplItemEnblIndcr;
    }

    /**
     * Sets the value of the scdDsplItemEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScdDsplItemEnblIndcr(String value) {
        this.scdDsplItemEnblIndcr = value;
    }

    /**
     * Gets the value of the storeBrndCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreBrndCd() {
        return storeBrndCd;
    }

    /**
     * Sets the value of the storeBrndCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreBrndCd(String value) {
        this.storeBrndCd = value;
    }

    /**
     * Gets the value of the persistNoteIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistNoteIndcr() {
        return persistNoteIndcr;
    }

    /**
     * Sets the value of the persistNoteIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistNoteIndcr(String value) {
        this.persistNoteIndcr = value;
    }

    /**
     * Gets the value of the timetradeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetradeEnabled() {
        return timetradeEnabled;
    }

    /**
     * Sets the value of the timetradeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetradeEnabled(String value) {
        this.timetradeEnabled = value;
    }

    /**
     * Gets the value of the siebelCouponEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiebelCouponEnblIndcr() {
        return siebelCouponEnblIndcr;
    }

    /**
     * Sets the value of the siebelCouponEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiebelCouponEnblIndcr(String value) {
        this.siebelCouponEnblIndcr = value;
    }

    /**
     * Gets the value of the siebelEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiebelEnblIndcr() {
        return siebelEnblIndcr;
    }

    /**
     * Sets the value of the siebelEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiebelEnblIndcr(String value) {
        this.siebelEnblIndcr = value;
    }

    /**
     * Gets the value of the prLottoIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoIndcr() {
        return prLottoIndcr;
    }

    /**
     * Sets the value of the prLottoIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoIndcr(String value) {
        this.prLottoIndcr = value;
    }

    /**
     * Gets the value of the prLottoMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoMerchantId() {
        return prLottoMerchantId;
    }

    /**
     * Sets the value of the prLottoMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoMerchantId(String value) {
        this.prLottoMerchantId = value;
    }

    /**
     * Gets the value of the pronavHelpIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPronavHelpIndcr() {
        return pronavHelpIndcr;
    }

    /**
     * Sets the value of the pronavHelpIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPronavHelpIndcr(String value) {
        this.pronavHelpIndcr = value;
    }

    /**
     * Gets the value of the rmsHelpIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmsHelpIndcr() {
        return rmsHelpIndcr;
    }

    /**
     * Sets the value of the rmsHelpIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmsHelpIndcr(String value) {
        this.rmsHelpIndcr = value;
    }

    /**
     * Gets the value of the buybackPretaxcrEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackPretaxcrEnblIndcr() {
        return buybackPretaxcrEnblIndcr;
    }

    /**
     * Sets the value of the buybackPretaxcrEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackPretaxcrEnblIndcr(String value) {
        this.buybackPretaxcrEnblIndcr = value;
    }

    /**
     * Gets the value of the grosstaxCityRcptEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrosstaxCityRcptEnblIndcr() {
        return grosstaxCityRcptEnblIndcr;
    }

    /**
     * Sets the value of the grosstaxCityRcptEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrosstaxCityRcptEnblIndcr(String value) {
        this.grosstaxCityRcptEnblIndcr = value;
    }

    /**
     * Gets the value of the emailRcptEnableIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailRcptEnableIndcr() {
        return emailRcptEnableIndcr;
    }

    /**
     * Sets the value of the emailRcptEnableIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailRcptEnableIndcr(String value) {
        this.emailRcptEnableIndcr = value;
    }

    /**
     * Gets the value of the flipFlopIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlipFlopIndcr() {
        return flipFlopIndcr;
    }

    /**
     * Sets the value of the flipFlopIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlipFlopIndcr(String value) {
        this.flipFlopIndcr = value;
    }

    /**
     * Gets the value of the sharedCashDrawerEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedCashDrawerEnblIndcr() {
        return sharedCashDrawerEnblIndcr;
    }

    /**
     * Sets the value of the sharedCashDrawerEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedCashDrawerEnblIndcr(String value) {
        this.sharedCashDrawerEnblIndcr = value;
    }

    /**
     * Gets the value of the equipInstlBillEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipInstlBillEnblIndcr() {
        return equipInstlBillEnblIndcr;
    }

    /**
     * Sets the value of the equipInstlBillEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipInstlBillEnblIndcr(String value) {
        this.equipInstlBillEnblIndcr = value;
    }

    /**
     * Gets the value of the shoppingCartEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingCartEnblIndcr() {
        return shoppingCartEnblIndcr;
    }

    /**
     * Sets the value of the shoppingCartEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingCartEnblIndcr(String value) {
        this.shoppingCartEnblIndcr = value;
    }

    /**
     * Gets the value of the storeDealerNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDealerNm() {
        return storeDealerNm;
    }

    /**
     * Sets the value of the storeDealerNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDealerNm(String value) {
        this.storeDealerNm = value;
    }

    /**
     * Gets the value of the defSharedDrawerFloatAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefSharedDrawerFloatAmt() {
        return defSharedDrawerFloatAmt;
    }

    /**
     * Sets the value of the defSharedDrawerFloatAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefSharedDrawerFloatAmt(Double value) {
        this.defSharedDrawerFloatAmt = value;
    }

    /**
     * Gets the value of the prProfitCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrProfitCenter() {
        return prProfitCenter;
    }

    /**
     * Sets the value of the prProfitCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrProfitCenter(String value) {
        this.prProfitCenter = value;
    }

    /**
     * Gets the value of the equipInstlBillCnstOnIpad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipInstlBillCnstOnIpad() {
        return equipInstlBillCnstOnIpad;
    }

    /**
     * Sets the value of the equipInstlBillCnstOnIpad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipInstlBillCnstOnIpad(String value) {
        this.equipInstlBillCnstOnIpad = value;
    }

    /**
     * Gets the value of the creditCheckPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckPin() {
        return creditCheckPin;
    }

    /**
     * Sets the value of the creditCheckPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckPin(String value) {
        this.creditCheckPin = value;
    }

    /**
     * Gets the value of the bizDirectStoreIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizDirectStoreIndcr() {
        return bizDirectStoreIndcr;
    }

    /**
     * Sets the value of the bizDirectStoreIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizDirectStoreIndcr(String value) {
        this.bizDirectStoreIndcr = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the mrtEnableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrtEnableIndicator() {
        return mrtEnableIndicator;
    }

    /**
     * Sets the value of the mrtEnableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrtEnableIndicator(String value) {
        this.mrtEnableIndicator = value;
    }

    /**
     * Gets the value of the serviceRepairIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRepairIndicator() {
        return serviceRepairIndicator;
    }

    /**
     * Sets the value of the serviceRepairIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRepairIndicator(String value) {
        this.serviceRepairIndicator = value;
    }

    /**
     * Gets the value of the idCaptureEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCaptureEnabled() {
        return idCaptureEnabled;
    }

    /**
     * Sets the value of the idCaptureEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCaptureEnabled(String value) {
        this.idCaptureEnabled = value;
    }

    /**
     * Gets the value of the preScreenEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreScreenEnabled() {
        return preScreenEnabled;
    }

    /**
     * Sets the value of the preScreenEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreScreenEnabled(String value) {
        this.preScreenEnabled = value;
    }

    /**
     * Gets the value of the sharedCashDrawerList property.
     * 
     * @return
     *     possible object is
     *     {@link SharedCashDrawerList }
     *     
     */
    public SharedCashDrawerList getSharedCashDrawerList() {
        return sharedCashDrawerList;
    }

    /**
     * Sets the value of the sharedCashDrawerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedCashDrawerList }
     *     
     */
    public void setSharedCashDrawerList(SharedCashDrawerList value) {
        this.sharedCashDrawerList = value;
    }

    /**
     * Gets the value of the merchantCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantCardDetails }
     *     
     */
    public MerchantCardDetails getMerchantCardDetails() {
        return merchantCardDetails;
    }

    /**
     * Sets the value of the merchantCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantCardDetails }
     *     
     */
    public void setMerchantCardDetails(MerchantCardDetails value) {
        this.merchantCardDetails = value;
    }

    /**
     * Gets the value of the hcInterimEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcInterimEnabled() {
        return hcInterimEnabled;
    }

    /**
     * Sets the value of the hcInterimEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcInterimEnabled(String value) {
        this.hcInterimEnabled = value;
    }

    /**
     * Gets the value of the bxgxEnableIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBxgxEnableIndcr() {
        return bxgxEnableIndcr;
    }

    /**
     * Sets the value of the bxgxEnableIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBxgxEnableIndcr(String value) {
        this.bxgxEnableIndcr = value;
    }

    /**
     * Gets the value of the emvEnableIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmvEnableIndcr() {
        return emvEnableIndcr;
    }

    /**
     * Sets the value of the emvEnableIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmvEnableIndcr(String value) {
        this.emvEnableIndcr = value;
    }

}

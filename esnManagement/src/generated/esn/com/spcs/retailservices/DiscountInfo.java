
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="discountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="discountTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activateCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="activateCountSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activateCountPending" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activationTypeSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractTermTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractTermSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractTermPending" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minMrcAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="minimumMrcSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minimumMrcPending" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allowSubIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subElligibleSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceCdSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceCdPending" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountTypeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountTypeSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creditClassString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creditClassSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scancodeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="kitIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locBaId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stackableIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allowDiscRebateIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="markdwnAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="markdownType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="selectedDiscount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actvTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newForYouIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newForYouSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ensembleOnlyIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ensembleOnlySuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trackAsArmIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autoApplyIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autoApplyFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flatRateIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flatRateSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="corpAcsryIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bogoIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siebelCouponIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actDiscForUpgradeSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="skuQualifySuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="skuQualifyRequired" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nfcOfferIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nfcOfferSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="armActvDiscountIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="upgradenowOfferIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buybackQualifySuccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buybackQualifyRequired" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webOrderDiscount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webPromoIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipInstlBillIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="situationalIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountInfo", propOrder = {
    "discountId",
    "discountName",
    "discountTypeCd",
    "activateCount",
    "activateCountSuccess",
    "activateCountPending",
    "activationTypeSuccess",
    "contractTermTxt",
    "contractTermSuccess",
    "contractTermPending",
    "minMrcAmt",
    "minimumMrcSuccess",
    "minimumMrcPending",
    "allowSubIndcr",
    "subElligibleSuccess",
    "serviceString",
    "serviceCdSuccess",
    "serviceCdPending",
    "accountTypeString",
    "accountTypeSuccess",
    "creditClassString",
    "creditClassSuccess",
    "scancodeString",
    "productId",
    "kitIndcr",
    "locBaId",
    "stackableIndcr",
    "allowDiscRebateIndcr",
    "markdwnAmt",
    "markdownType",
    "selectedDiscount",
    "actvTypeCd",
    "newForYouIndcr",
    "newForYouSuccess",
    "ensembleOnlyIndcr",
    "ensembleOnlySuccess",
    "trackAsArmIndcr",
    "startDate",
    "autoApplyIndcr",
    "autoApplyFlag",
    "flatRateIndcr",
    "flatRateSuccess",
    "corpAcsryIndcr",
    "bogoIndcr",
    "siebelCouponIndcr",
    "actDiscForUpgradeSuccess",
    "skuQualifySuccess",
    "skuQualifyRequired",
    "nfcOfferIndcr",
    "nfcOfferSuccess",
    "armActvDiscountIndcr",
    "upgradenowOfferIndcr",
    "buybackQualifySuccess",
    "buybackQualifyRequired",
    "webOrderDiscount",
    "webPromoIndcr",
    "equipInstlBillIndcr",
    "situationalIndcr"
})
public class DiscountInfo {

    protected int discountId;
    @XmlElement(required = true)
    protected String discountName;
    @XmlElement(required = true)
    protected String discountTypeCd;
    protected int activateCount;
    @XmlElement(required = true)
    protected String activateCountSuccess;
    @XmlElement(required = true)
    protected String activateCountPending;
    @XmlElement(required = true)
    protected String activationTypeSuccess;
    @XmlElement(required = true)
    protected String contractTermTxt;
    @XmlElement(required = true)
    protected String contractTermSuccess;
    @XmlElement(required = true)
    protected String contractTermPending;
    protected int minMrcAmt;
    @XmlElement(required = true)
    protected String minimumMrcSuccess;
    @XmlElement(required = true)
    protected String minimumMrcPending;
    @XmlElement(required = true)
    protected String allowSubIndcr;
    @XmlElement(required = true)
    protected String subElligibleSuccess;
    @XmlElement(required = true)
    protected String serviceString;
    @XmlElement(required = true)
    protected String serviceCdSuccess;
    @XmlElement(required = true)
    protected String serviceCdPending;
    @XmlElement(required = true)
    protected String accountTypeString;
    @XmlElement(required = true)
    protected String accountTypeSuccess;
    @XmlElement(required = true)
    protected String creditClassString;
    @XmlElement(required = true)
    protected String creditClassSuccess;
    @XmlElement(required = true)
    protected String scancodeString;
    protected int productId;
    @XmlElement(required = true)
    protected String kitIndcr;
    @XmlElement(required = true)
    protected String locBaId;
    @XmlElement(required = true)
    protected String stackableIndcr;
    @XmlElement(required = true)
    protected String allowDiscRebateIndcr;
    protected double markdwnAmt;
    @XmlElement(required = true)
    protected String markdownType;
    @XmlElement(required = true)
    protected String selectedDiscount;
    @XmlElement(required = true)
    protected String actvTypeCd;
    @XmlElement(required = true)
    protected String newForYouIndcr;
    @XmlElement(required = true)
    protected String newForYouSuccess;
    @XmlElement(required = true)
    protected String ensembleOnlyIndcr;
    @XmlElement(required = true)
    protected String ensembleOnlySuccess;
    @XmlElement(required = true)
    protected String trackAsArmIndcr;
    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(required = true)
    protected String autoApplyIndcr;
    @XmlElement(required = true)
    protected String autoApplyFlag;
    @XmlElement(required = true)
    protected String flatRateIndcr;
    @XmlElement(required = true)
    protected String flatRateSuccess;
    @XmlElement(required = true)
    protected String corpAcsryIndcr;
    @XmlElement(required = true)
    protected String bogoIndcr;
    @XmlElement(required = true)
    protected String siebelCouponIndcr;
    @XmlElement(required = true)
    protected String actDiscForUpgradeSuccess;
    @XmlElement(required = true)
    protected String skuQualifySuccess;
    @XmlElement(required = true)
    protected String skuQualifyRequired;
    @XmlElement(required = true)
    protected String nfcOfferIndcr;
    @XmlElement(required = true)
    protected String nfcOfferSuccess;
    @XmlElement(required = true)
    protected String armActvDiscountIndcr;
    @XmlElement(required = true)
    protected String upgradenowOfferIndcr;
    @XmlElement(required = true)
    protected String buybackQualifySuccess;
    @XmlElement(required = true)
    protected String buybackQualifyRequired;
    @XmlElement(required = true)
    protected String webOrderDiscount;
    @XmlElement(required = true)
    protected String webPromoIndcr;
    @XmlElement(required = true)
    protected String equipInstlBillIndcr;
    @XmlElement(required = true)
    protected String situationalIndcr;

    /**
     * Gets the value of the discountId property.
     * 
     */
    public int getDiscountId() {
        return discountId;
    }

    /**
     * Sets the value of the discountId property.
     * 
     */
    public void setDiscountId(int value) {
        this.discountId = value;
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
     * Gets the value of the discountTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountTypeCd() {
        return discountTypeCd;
    }

    /**
     * Sets the value of the discountTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountTypeCd(String value) {
        this.discountTypeCd = value;
    }

    /**
     * Gets the value of the activateCount property.
     * 
     */
    public int getActivateCount() {
        return activateCount;
    }

    /**
     * Sets the value of the activateCount property.
     * 
     */
    public void setActivateCount(int value) {
        this.activateCount = value;
    }

    /**
     * Gets the value of the activateCountSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateCountSuccess() {
        return activateCountSuccess;
    }

    /**
     * Sets the value of the activateCountSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateCountSuccess(String value) {
        this.activateCountSuccess = value;
    }

    /**
     * Gets the value of the activateCountPending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateCountPending() {
        return activateCountPending;
    }

    /**
     * Sets the value of the activateCountPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateCountPending(String value) {
        this.activateCountPending = value;
    }

    /**
     * Gets the value of the activationTypeSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationTypeSuccess() {
        return activationTypeSuccess;
    }

    /**
     * Sets the value of the activationTypeSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationTypeSuccess(String value) {
        this.activationTypeSuccess = value;
    }

    /**
     * Gets the value of the contractTermTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTermTxt() {
        return contractTermTxt;
    }

    /**
     * Sets the value of the contractTermTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTermTxt(String value) {
        this.contractTermTxt = value;
    }

    /**
     * Gets the value of the contractTermSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTermSuccess() {
        return contractTermSuccess;
    }

    /**
     * Sets the value of the contractTermSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTermSuccess(String value) {
        this.contractTermSuccess = value;
    }

    /**
     * Gets the value of the contractTermPending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTermPending() {
        return contractTermPending;
    }

    /**
     * Sets the value of the contractTermPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTermPending(String value) {
        this.contractTermPending = value;
    }

    /**
     * Gets the value of the minMrcAmt property.
     * 
     */
    public int getMinMrcAmt() {
        return minMrcAmt;
    }

    /**
     * Sets the value of the minMrcAmt property.
     * 
     */
    public void setMinMrcAmt(int value) {
        this.minMrcAmt = value;
    }

    /**
     * Gets the value of the minimumMrcSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumMrcSuccess() {
        return minimumMrcSuccess;
    }

    /**
     * Sets the value of the minimumMrcSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumMrcSuccess(String value) {
        this.minimumMrcSuccess = value;
    }

    /**
     * Gets the value of the minimumMrcPending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumMrcPending() {
        return minimumMrcPending;
    }

    /**
     * Sets the value of the minimumMrcPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumMrcPending(String value) {
        this.minimumMrcPending = value;
    }

    /**
     * Gets the value of the allowSubIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowSubIndcr() {
        return allowSubIndcr;
    }

    /**
     * Sets the value of the allowSubIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowSubIndcr(String value) {
        this.allowSubIndcr = value;
    }

    /**
     * Gets the value of the subElligibleSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubElligibleSuccess() {
        return subElligibleSuccess;
    }

    /**
     * Sets the value of the subElligibleSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubElligibleSuccess(String value) {
        this.subElligibleSuccess = value;
    }

    /**
     * Gets the value of the serviceString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceString() {
        return serviceString;
    }

    /**
     * Sets the value of the serviceString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceString(String value) {
        this.serviceString = value;
    }

    /**
     * Gets the value of the serviceCdSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCdSuccess() {
        return serviceCdSuccess;
    }

    /**
     * Sets the value of the serviceCdSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCdSuccess(String value) {
        this.serviceCdSuccess = value;
    }

    /**
     * Gets the value of the serviceCdPending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCdPending() {
        return serviceCdPending;
    }

    /**
     * Sets the value of the serviceCdPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCdPending(String value) {
        this.serviceCdPending = value;
    }

    /**
     * Gets the value of the accountTypeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeString() {
        return accountTypeString;
    }

    /**
     * Sets the value of the accountTypeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeString(String value) {
        this.accountTypeString = value;
    }

    /**
     * Gets the value of the accountTypeSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeSuccess() {
        return accountTypeSuccess;
    }

    /**
     * Sets the value of the accountTypeSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeSuccess(String value) {
        this.accountTypeSuccess = value;
    }

    /**
     * Gets the value of the creditClassString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditClassString() {
        return creditClassString;
    }

    /**
     * Sets the value of the creditClassString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditClassString(String value) {
        this.creditClassString = value;
    }

    /**
     * Gets the value of the creditClassSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditClassSuccess() {
        return creditClassSuccess;
    }

    /**
     * Sets the value of the creditClassSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditClassSuccess(String value) {
        this.creditClassSuccess = value;
    }

    /**
     * Gets the value of the scancodeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScancodeString() {
        return scancodeString;
    }

    /**
     * Sets the value of the scancodeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScancodeString(String value) {
        this.scancodeString = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * Gets the value of the kitIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitIndcr() {
        return kitIndcr;
    }

    /**
     * Sets the value of the kitIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitIndcr(String value) {
        this.kitIndcr = value;
    }

    /**
     * Gets the value of the locBaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocBaId() {
        return locBaId;
    }

    /**
     * Sets the value of the locBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocBaId(String value) {
        this.locBaId = value;
    }

    /**
     * Gets the value of the stackableIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackableIndcr() {
        return stackableIndcr;
    }

    /**
     * Sets the value of the stackableIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackableIndcr(String value) {
        this.stackableIndcr = value;
    }

    /**
     * Gets the value of the allowDiscRebateIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowDiscRebateIndcr() {
        return allowDiscRebateIndcr;
    }

    /**
     * Sets the value of the allowDiscRebateIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowDiscRebateIndcr(String value) {
        this.allowDiscRebateIndcr = value;
    }

    /**
     * Gets the value of the markdwnAmt property.
     * 
     */
    public double getMarkdwnAmt() {
        return markdwnAmt;
    }

    /**
     * Sets the value of the markdwnAmt property.
     * 
     */
    public void setMarkdwnAmt(double value) {
        this.markdwnAmt = value;
    }

    /**
     * Gets the value of the markdownType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkdownType() {
        return markdownType;
    }

    /**
     * Sets the value of the markdownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkdownType(String value) {
        this.markdownType = value;
    }

    /**
     * Gets the value of the selectedDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedDiscount() {
        return selectedDiscount;
    }

    /**
     * Sets the value of the selectedDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedDiscount(String value) {
        this.selectedDiscount = value;
    }

    /**
     * Gets the value of the actvTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActvTypeCd() {
        return actvTypeCd;
    }

    /**
     * Sets the value of the actvTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActvTypeCd(String value) {
        this.actvTypeCd = value;
    }

    /**
     * Gets the value of the newForYouIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewForYouIndcr() {
        return newForYouIndcr;
    }

    /**
     * Sets the value of the newForYouIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewForYouIndcr(String value) {
        this.newForYouIndcr = value;
    }

    /**
     * Gets the value of the newForYouSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewForYouSuccess() {
        return newForYouSuccess;
    }

    /**
     * Sets the value of the newForYouSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewForYouSuccess(String value) {
        this.newForYouSuccess = value;
    }

    /**
     * Gets the value of the ensembleOnlyIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnsembleOnlyIndcr() {
        return ensembleOnlyIndcr;
    }

    /**
     * Sets the value of the ensembleOnlyIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnsembleOnlyIndcr(String value) {
        this.ensembleOnlyIndcr = value;
    }

    /**
     * Gets the value of the ensembleOnlySuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnsembleOnlySuccess() {
        return ensembleOnlySuccess;
    }

    /**
     * Sets the value of the ensembleOnlySuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnsembleOnlySuccess(String value) {
        this.ensembleOnlySuccess = value;
    }

    /**
     * Gets the value of the trackAsArmIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackAsArmIndcr() {
        return trackAsArmIndcr;
    }

    /**
     * Sets the value of the trackAsArmIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackAsArmIndcr(String value) {
        this.trackAsArmIndcr = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the autoApplyIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoApplyIndcr() {
        return autoApplyIndcr;
    }

    /**
     * Sets the value of the autoApplyIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoApplyIndcr(String value) {
        this.autoApplyIndcr = value;
    }

    /**
     * Gets the value of the autoApplyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoApplyFlag() {
        return autoApplyFlag;
    }

    /**
     * Sets the value of the autoApplyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoApplyFlag(String value) {
        this.autoApplyFlag = value;
    }

    /**
     * Gets the value of the flatRateIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatRateIndcr() {
        return flatRateIndcr;
    }

    /**
     * Sets the value of the flatRateIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatRateIndcr(String value) {
        this.flatRateIndcr = value;
    }

    /**
     * Gets the value of the flatRateSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatRateSuccess() {
        return flatRateSuccess;
    }

    /**
     * Sets the value of the flatRateSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatRateSuccess(String value) {
        this.flatRateSuccess = value;
    }

    /**
     * Gets the value of the corpAcsryIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpAcsryIndcr() {
        return corpAcsryIndcr;
    }

    /**
     * Sets the value of the corpAcsryIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpAcsryIndcr(String value) {
        this.corpAcsryIndcr = value;
    }

    /**
     * Gets the value of the bogoIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBogoIndcr() {
        return bogoIndcr;
    }

    /**
     * Sets the value of the bogoIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBogoIndcr(String value) {
        this.bogoIndcr = value;
    }

    /**
     * Gets the value of the siebelCouponIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiebelCouponIndcr() {
        return siebelCouponIndcr;
    }

    /**
     * Sets the value of the siebelCouponIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiebelCouponIndcr(String value) {
        this.siebelCouponIndcr = value;
    }

    /**
     * Gets the value of the actDiscForUpgradeSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActDiscForUpgradeSuccess() {
        return actDiscForUpgradeSuccess;
    }

    /**
     * Sets the value of the actDiscForUpgradeSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActDiscForUpgradeSuccess(String value) {
        this.actDiscForUpgradeSuccess = value;
    }

    /**
     * Gets the value of the skuQualifySuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuQualifySuccess() {
        return skuQualifySuccess;
    }

    /**
     * Sets the value of the skuQualifySuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuQualifySuccess(String value) {
        this.skuQualifySuccess = value;
    }

    /**
     * Gets the value of the skuQualifyRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuQualifyRequired() {
        return skuQualifyRequired;
    }

    /**
     * Sets the value of the skuQualifyRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuQualifyRequired(String value) {
        this.skuQualifyRequired = value;
    }

    /**
     * Gets the value of the nfcOfferIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfcOfferIndcr() {
        return nfcOfferIndcr;
    }

    /**
     * Sets the value of the nfcOfferIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfcOfferIndcr(String value) {
        this.nfcOfferIndcr = value;
    }

    /**
     * Gets the value of the nfcOfferSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfcOfferSuccess() {
        return nfcOfferSuccess;
    }

    /**
     * Sets the value of the nfcOfferSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfcOfferSuccess(String value) {
        this.nfcOfferSuccess = value;
    }

    /**
     * Gets the value of the armActvDiscountIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmActvDiscountIndcr() {
        return armActvDiscountIndcr;
    }

    /**
     * Sets the value of the armActvDiscountIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmActvDiscountIndcr(String value) {
        this.armActvDiscountIndcr = value;
    }

    /**
     * Gets the value of the upgradenowOfferIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradenowOfferIndcr() {
        return upgradenowOfferIndcr;
    }

    /**
     * Sets the value of the upgradenowOfferIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradenowOfferIndcr(String value) {
        this.upgradenowOfferIndcr = value;
    }

    /**
     * Gets the value of the buybackQualifySuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackQualifySuccess() {
        return buybackQualifySuccess;
    }

    /**
     * Sets the value of the buybackQualifySuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackQualifySuccess(String value) {
        this.buybackQualifySuccess = value;
    }

    /**
     * Gets the value of the buybackQualifyRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackQualifyRequired() {
        return buybackQualifyRequired;
    }

    /**
     * Sets the value of the buybackQualifyRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackQualifyRequired(String value) {
        this.buybackQualifyRequired = value;
    }

    /**
     * Gets the value of the webOrderDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebOrderDiscount() {
        return webOrderDiscount;
    }

    /**
     * Sets the value of the webOrderDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebOrderDiscount(String value) {
        this.webOrderDiscount = value;
    }

    /**
     * Gets the value of the webPromoIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPromoIndcr() {
        return webPromoIndcr;
    }

    /**
     * Sets the value of the webPromoIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPromoIndcr(String value) {
        this.webPromoIndcr = value;
    }

    /**
     * Gets the value of the equipInstlBillIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipInstlBillIndcr() {
        return equipInstlBillIndcr;
    }

    /**
     * Sets the value of the equipInstlBillIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipInstlBillIndcr(String value) {
        this.equipInstlBillIndcr = value;
    }

    /**
     * Gets the value of the situationalIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituationalIndcr() {
        return situationalIndcr;
    }

    /**
     * Sets the value of the situationalIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationalIndcr(String value) {
        this.situationalIndcr = value;
    }

}

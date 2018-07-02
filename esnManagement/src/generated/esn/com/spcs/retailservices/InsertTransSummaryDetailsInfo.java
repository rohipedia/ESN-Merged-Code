
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTransSummaryDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTransSummaryDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newAccountInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="frontErrorInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeRep" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dealerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeMdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeAddressInfo" type="{java:com.spcs.retailservices.domain}StoreAddressInfo" minOccurs="0"/&gt;
 *         &lt;element name="aslChangeInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planChangeInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceChangeInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newLineInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="welcomeIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="todaysOnetimeDepositsCharged" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="todaysOnetimeDepositsCollected" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="todaysOnetimeEquipmentCharged" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consentNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="newAslInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="aslAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deviceCoverageImpactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deviceAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="newFramilyPlanInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="newFramilyPlanAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oneTimeChargesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oneTimeChargesAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="newLeaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="newLeaseAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="insertTransSummaryLineItemList" type="{java:com.spcs.retailservices.domain}InsertTransSummaryLineItemList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTransSummaryDetailsInfo", propOrder = {
    "languageCode",
    "newAccountInd",
    "frontErrorInd",
    "brandCode",
    "storeNumber",
    "storeRep",
    "dealerName",
    "storeMdn",
    "storeAddressInfo",
    "aslChangeInd",
    "planChangeInd",
    "deviceChangeInd",
    "newLineInd",
    "welcomeIndicator",
    "ban",
    "todaysOnetimeDepositsCharged",
    "todaysOnetimeDepositsCollected",
    "todaysOnetimeEquipmentCharged",
    "consentNo",
    "newAslInd",
    "aslAssentInd",
    "deviceCoverageImpactInd",
    "deviceAssentInd",
    "newFramilyPlanInd",
    "newFramilyPlanAssentInd",
    "oneTimeChargesInd",
    "oneTimeChargesAssentInd",
    "newLeaseInd",
    "newLeaseAssentInd",
    "customerIdentifier",
    "insertTransSummaryLineItemList"
})
public class InsertTransSummaryDetailsInfo {

    @XmlElement(required = true)
    protected String languageCode;
    @XmlElement(required = true)
    protected String newAccountInd;
    @XmlElement(required = true)
    protected String frontErrorInd;
    @XmlElement(required = true)
    protected String brandCode;
    @XmlElement(required = true)
    protected String storeNumber;
    @XmlElement(required = true)
    protected String storeRep;
    @XmlElement(required = true)
    protected String dealerName;
    protected String storeMdn;
    protected StoreAddressInfo storeAddressInfo;
    @XmlElement(required = true)
    protected String aslChangeInd;
    @XmlElement(required = true)
    protected String planChangeInd;
    @XmlElement(required = true)
    protected String deviceChangeInd;
    @XmlElement(required = true)
    protected String newLineInd;
    @XmlElement(required = true)
    protected String welcomeIndicator;
    @XmlElement(required = true)
    protected String ban;
    protected Double todaysOnetimeDepositsCharged;
    protected Double todaysOnetimeDepositsCollected;
    protected Double todaysOnetimeEquipmentCharged;
    protected Integer consentNo;
    protected Boolean newAslInd;
    protected Boolean aslAssentInd;
    protected Boolean deviceCoverageImpactInd;
    protected Boolean deviceAssentInd;
    protected Boolean newFramilyPlanInd;
    protected Boolean newFramilyPlanAssentInd;
    protected Boolean oneTimeChargesInd;
    protected Boolean oneTimeChargesAssentInd;
    protected Boolean newLeaseInd;
    protected Boolean newLeaseAssentInd;
    protected Long customerIdentifier;
    protected InsertTransSummaryLineItemList insertTransSummaryLineItemList;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the newAccountInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAccountInd() {
        return newAccountInd;
    }

    /**
     * Sets the value of the newAccountInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAccountInd(String value) {
        this.newAccountInd = value;
    }

    /**
     * Gets the value of the frontErrorInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontErrorInd() {
        return frontErrorInd;
    }

    /**
     * Sets the value of the frontErrorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontErrorInd(String value) {
        this.frontErrorInd = value;
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
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the storeRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreRep() {
        return storeRep;
    }

    /**
     * Sets the value of the storeRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreRep(String value) {
        this.storeRep = value;
    }

    /**
     * Gets the value of the dealerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Sets the value of the dealerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * Gets the value of the storeMdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreMdn() {
        return storeMdn;
    }

    /**
     * Sets the value of the storeMdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreMdn(String value) {
        this.storeMdn = value;
    }

    /**
     * Gets the value of the storeAddressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreAddressInfo }
     *     
     */
    public StoreAddressInfo getStoreAddressInfo() {
        return storeAddressInfo;
    }

    /**
     * Sets the value of the storeAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreAddressInfo }
     *     
     */
    public void setStoreAddressInfo(StoreAddressInfo value) {
        this.storeAddressInfo = value;
    }

    /**
     * Gets the value of the aslChangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAslChangeInd() {
        return aslChangeInd;
    }

    /**
     * Sets the value of the aslChangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAslChangeInd(String value) {
        this.aslChangeInd = value;
    }

    /**
     * Gets the value of the planChangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanChangeInd() {
        return planChangeInd;
    }

    /**
     * Sets the value of the planChangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanChangeInd(String value) {
        this.planChangeInd = value;
    }

    /**
     * Gets the value of the deviceChangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceChangeInd() {
        return deviceChangeInd;
    }

    /**
     * Sets the value of the deviceChangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceChangeInd(String value) {
        this.deviceChangeInd = value;
    }

    /**
     * Gets the value of the newLineInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewLineInd() {
        return newLineInd;
    }

    /**
     * Sets the value of the newLineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewLineInd(String value) {
        this.newLineInd = value;
    }

    /**
     * Gets the value of the welcomeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeIndicator() {
        return welcomeIndicator;
    }

    /**
     * Sets the value of the welcomeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeIndicator(String value) {
        this.welcomeIndicator = value;
    }

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBan(String value) {
        this.ban = value;
    }

    /**
     * Gets the value of the todaysOnetimeDepositsCharged property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTodaysOnetimeDepositsCharged() {
        return todaysOnetimeDepositsCharged;
    }

    /**
     * Sets the value of the todaysOnetimeDepositsCharged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTodaysOnetimeDepositsCharged(Double value) {
        this.todaysOnetimeDepositsCharged = value;
    }

    /**
     * Gets the value of the todaysOnetimeDepositsCollected property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTodaysOnetimeDepositsCollected() {
        return todaysOnetimeDepositsCollected;
    }

    /**
     * Sets the value of the todaysOnetimeDepositsCollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTodaysOnetimeDepositsCollected(Double value) {
        this.todaysOnetimeDepositsCollected = value;
    }

    /**
     * Gets the value of the todaysOnetimeEquipmentCharged property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTodaysOnetimeEquipmentCharged() {
        return todaysOnetimeEquipmentCharged;
    }

    /**
     * Sets the value of the todaysOnetimeEquipmentCharged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTodaysOnetimeEquipmentCharged(Double value) {
        this.todaysOnetimeEquipmentCharged = value;
    }

    /**
     * Gets the value of the consentNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsentNo() {
        return consentNo;
    }

    /**
     * Sets the value of the consentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsentNo(Integer value) {
        this.consentNo = value;
    }

    /**
     * Gets the value of the newAslInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewAslInd() {
        return newAslInd;
    }

    /**
     * Sets the value of the newAslInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAslInd(Boolean value) {
        this.newAslInd = value;
    }

    /**
     * Gets the value of the aslAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAslAssentInd() {
        return aslAssentInd;
    }

    /**
     * Sets the value of the aslAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAslAssentInd(Boolean value) {
        this.aslAssentInd = value;
    }

    /**
     * Gets the value of the deviceCoverageImpactInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceCoverageImpactInd() {
        return deviceCoverageImpactInd;
    }

    /**
     * Sets the value of the deviceCoverageImpactInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceCoverageImpactInd(Boolean value) {
        this.deviceCoverageImpactInd = value;
    }

    /**
     * Gets the value of the deviceAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceAssentInd() {
        return deviceAssentInd;
    }

    /**
     * Sets the value of the deviceAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceAssentInd(Boolean value) {
        this.deviceAssentInd = value;
    }

    /**
     * Gets the value of the newFramilyPlanInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewFramilyPlanInd() {
        return newFramilyPlanInd;
    }

    /**
     * Sets the value of the newFramilyPlanInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewFramilyPlanInd(Boolean value) {
        this.newFramilyPlanInd = value;
    }

    /**
     * Gets the value of the newFramilyPlanAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewFramilyPlanAssentInd() {
        return newFramilyPlanAssentInd;
    }

    /**
     * Sets the value of the newFramilyPlanAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewFramilyPlanAssentInd(Boolean value) {
        this.newFramilyPlanAssentInd = value;
    }

    /**
     * Gets the value of the oneTimeChargesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneTimeChargesInd() {
        return oneTimeChargesInd;
    }

    /**
     * Sets the value of the oneTimeChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneTimeChargesInd(Boolean value) {
        this.oneTimeChargesInd = value;
    }

    /**
     * Gets the value of the oneTimeChargesAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneTimeChargesAssentInd() {
        return oneTimeChargesAssentInd;
    }

    /**
     * Sets the value of the oneTimeChargesAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneTimeChargesAssentInd(Boolean value) {
        this.oneTimeChargesAssentInd = value;
    }

    /**
     * Gets the value of the newLeaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewLeaseInd() {
        return newLeaseInd;
    }

    /**
     * Sets the value of the newLeaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewLeaseInd(Boolean value) {
        this.newLeaseInd = value;
    }

    /**
     * Gets the value of the newLeaseAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewLeaseAssentInd() {
        return newLeaseAssentInd;
    }

    /**
     * Sets the value of the newLeaseAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewLeaseAssentInd(Boolean value) {
        this.newLeaseAssentInd = value;
    }

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerIdentifier(Long value) {
        this.customerIdentifier = value;
    }

    /**
     * Gets the value of the insertTransSummaryLineItemList property.
     * 
     * @return
     *     possible object is
     *     {@link InsertTransSummaryLineItemList }
     *     
     */
    public InsertTransSummaryLineItemList getInsertTransSummaryLineItemList() {
        return insertTransSummaryLineItemList;
    }

    /**
     * Sets the value of the insertTransSummaryLineItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertTransSummaryLineItemList }
     *     
     */
    public void setInsertTransSummaryLineItemList(InsertTransSummaryLineItemList value) {
        this.insertTransSummaryLineItemList = value;
    }

}

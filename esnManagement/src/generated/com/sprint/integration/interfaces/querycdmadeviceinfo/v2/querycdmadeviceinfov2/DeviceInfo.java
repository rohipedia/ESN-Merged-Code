
package com.sprint.integration.interfaces.querycdmadeviceinfo.v2.querycdmadeviceinfov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceSerialNumberDecimal" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceSerialNumberDec"/&gt;
 *         &lt;element name="uniqueEdfCode" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}EquipmentDataFileCode" minOccurs="0"/&gt;
 *         &lt;element name="mdn" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}MobileDirectoryNumberString" minOccurs="0"/&gt;
 *         &lt;element name="revisionKey" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}RevisionKeyString" minOccurs="0"/&gt;
 *         &lt;element name="deviceSerialNumberHex" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceSerialNumberHex"/&gt;
 *         &lt;element name="phoneLockCode" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}PhoneLockCode"/&gt;
 *         &lt;element name="softwareVersion" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}SoftwareVersion" minOccurs="0"/&gt;
 *         &lt;element name="deviceStatus" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}StatusCode"/&gt;
 *         &lt;element name="frequencyMode" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}FrequencyModeCode" minOccurs="0"/&gt;
 *         &lt;element name="dispositionCode" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}HandsetConditionCode"/&gt;
 *         &lt;element name="phoneType" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}HandsetTypeCode"/&gt;
 *         &lt;element name="inventoryInd" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}InventoryFlag"/&gt;
 *         &lt;element name="stolenDate" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}StolenDateTime" minOccurs="0"/&gt;
 *         &lt;element name="prlName" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}PreferredRoamingListName" minOccurs="0"/&gt;
 *         &lt;element name="lastPrlUpdateDate" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}LastUpdateDateTime" minOccurs="0"/&gt;
 *         &lt;element name="prlUpdateMethod" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}PreferredRoamingListUpdateMethod" minOccurs="0"/&gt;
 *         &lt;element name="prlUpdateUser" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}PreferredRoamingListUpdateUser" minOccurs="0"/&gt;
 *         &lt;element name="phoneOwner" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceOwnerCode"/&gt;
 *         &lt;element name="subscriptionId" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}SubscriptionId" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerName" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceManufacturerName"/&gt;
 *         &lt;element name="manufacturerLocation" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceManufacturerLocationIdentifier"/&gt;
 *         &lt;element name="modelName" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceModelName"/&gt;
 *         &lt;element name="modelNumber" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}ModelNumber"/&gt;
 *         &lt;element name="deviceType" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}WirelessNetworkDeviceTypeCd"/&gt;
 *         &lt;element name="authenticationKey" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}AuthenticationKey"/&gt;
 *         &lt;element name="masterSubsidyLock" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}MasterSubsidyLockCode"/&gt;
 *         &lt;element name="oneTimeKeyPadSubsidyLock" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}OneTimeKeypadSubisidyLockCode"/&gt;
 *         &lt;element name="lastTransactionDate" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}LastUpdateDateTime" minOccurs="0"/&gt;
 *         &lt;element name="deviceFrequencyTypeCode" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}FrequencyTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="autoPrlUpdateNeededInd" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}PreferredRoamingListUpdateNeededFlag"/&gt;
 *         &lt;element name="deviceActivationDate" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}EffectiveFromDateTime" minOccurs="0"/&gt;
 *         &lt;element name="deviceDeactivationDate" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}EffectiveThruDateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastTransactionCode" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}LastTransactionCode" minOccurs="0"/&gt;
 *         &lt;element name="pseudoEsnHex" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}ElectronicSerialNumberHex" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfo", propOrder = {
    "deviceSerialNumberDecimal",
    "uniqueEdfCode",
    "mdn",
    "revisionKey",
    "deviceSerialNumberHex",
    "phoneLockCode",
    "softwareVersion",
    "deviceStatus",
    "frequencyMode",
    "dispositionCode",
    "phoneType",
    "inventoryInd",
    "stolenDate",
    "prlName",
    "lastPrlUpdateDate",
    "prlUpdateMethod",
    "prlUpdateUser",
    "phoneOwner",
    "subscriptionId",
    "manufacturerName",
    "manufacturerLocation",
    "modelName",
    "modelNumber",
    "deviceType",
    "authenticationKey",
    "masterSubsidyLock",
    "oneTimeKeyPadSubsidyLock",
    "lastTransactionDate",
    "deviceFrequencyTypeCode",
    "autoPrlUpdateNeededInd",
    "deviceActivationDate",
    "deviceDeactivationDate",
    "lastTransactionCode",
    "pseudoEsnHex"
})
public class DeviceInfo {

    @XmlElement(required = true)
    protected String deviceSerialNumberDecimal;
    protected String uniqueEdfCode;
    protected String mdn;
    protected String revisionKey;
    @XmlElement(required = true)
    protected String deviceSerialNumberHex;
    @XmlElement(required = true)
    protected String phoneLockCode;
    protected String softwareVersion;
    @XmlElement(required = true)
    protected String deviceStatus;
    protected String frequencyMode;
    @XmlElement(required = true)
    protected String dispositionCode;
    @XmlElement(required = true)
    protected String phoneType;
    @XmlElement(required = true)
    protected String inventoryInd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stolenDate;
    protected String prlName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPrlUpdateDate;
    protected String prlUpdateMethod;
    protected String prlUpdateUser;
    @XmlElement(required = true)
    protected String phoneOwner;
    protected String subscriptionId;
    @XmlElement(required = true)
    protected String manufacturerName;
    @XmlElement(required = true)
    protected String manufacturerLocation;
    @XmlElement(required = true)
    protected String modelName;
    @XmlElement(required = true)
    protected String modelNumber;
    @XmlElement(required = true)
    protected String deviceType;
    @XmlElement(required = true)
    protected String authenticationKey;
    @XmlElement(required = true)
    protected String masterSubsidyLock;
    @XmlElement(required = true)
    protected String oneTimeKeyPadSubsidyLock;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTransactionDate;
    protected String deviceFrequencyTypeCode;
    @XmlElement(required = true)
    protected String autoPrlUpdateNeededInd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deviceActivationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deviceDeactivationDate;
    protected String lastTransactionCode;
    protected String pseudoEsnHex;

    /**
     * Gets the value of the deviceSerialNumberDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNumberDecimal() {
        return deviceSerialNumberDecimal;
    }

    /**
     * Sets the value of the deviceSerialNumberDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNumberDecimal(String value) {
        this.deviceSerialNumberDecimal = value;
    }

    /**
     * Gets the value of the uniqueEdfCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueEdfCode() {
        return uniqueEdfCode;
    }

    /**
     * Sets the value of the uniqueEdfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueEdfCode(String value) {
        this.uniqueEdfCode = value;
    }

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdn(String value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the revisionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionKey() {
        return revisionKey;
    }

    /**
     * Sets the value of the revisionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionKey(String value) {
        this.revisionKey = value;
    }

    /**
     * Gets the value of the deviceSerialNumberHex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNumberHex() {
        return deviceSerialNumberHex;
    }

    /**
     * Sets the value of the deviceSerialNumberHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNumberHex(String value) {
        this.deviceSerialNumberHex = value;
    }

    /**
     * Gets the value of the phoneLockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneLockCode() {
        return phoneLockCode;
    }

    /**
     * Sets the value of the phoneLockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneLockCode(String value) {
        this.phoneLockCode = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the deviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * Sets the value of the deviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceStatus(String value) {
        this.deviceStatus = value;
    }

    /**
     * Gets the value of the frequencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyMode() {
        return frequencyMode;
    }

    /**
     * Sets the value of the frequencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyMode(String value) {
        this.frequencyMode = value;
    }

    /**
     * Gets the value of the dispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Sets the value of the dispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositionCode(String value) {
        this.dispositionCode = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the inventoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryInd() {
        return inventoryInd;
    }

    /**
     * Sets the value of the inventoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryInd(String value) {
        this.inventoryInd = value;
    }

    /**
     * Gets the value of the stolenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStolenDate() {
        return stolenDate;
    }

    /**
     * Sets the value of the stolenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStolenDate(XMLGregorianCalendar value) {
        this.stolenDate = value;
    }

    /**
     * Gets the value of the prlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrlName() {
        return prlName;
    }

    /**
     * Sets the value of the prlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrlName(String value) {
        this.prlName = value;
    }

    /**
     * Gets the value of the lastPrlUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPrlUpdateDate() {
        return lastPrlUpdateDate;
    }

    /**
     * Sets the value of the lastPrlUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPrlUpdateDate(XMLGregorianCalendar value) {
        this.lastPrlUpdateDate = value;
    }

    /**
     * Gets the value of the prlUpdateMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrlUpdateMethod() {
        return prlUpdateMethod;
    }

    /**
     * Sets the value of the prlUpdateMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrlUpdateMethod(String value) {
        this.prlUpdateMethod = value;
    }

    /**
     * Gets the value of the prlUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrlUpdateUser() {
        return prlUpdateUser;
    }

    /**
     * Sets the value of the prlUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrlUpdateUser(String value) {
        this.prlUpdateUser = value;
    }

    /**
     * Gets the value of the phoneOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneOwner() {
        return phoneOwner;
    }

    /**
     * Sets the value of the phoneOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneOwner(String value) {
        this.phoneOwner = value;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the manufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the manufacturerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerLocation() {
        return manufacturerLocation;
    }

    /**
     * Sets the value of the manufacturerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerLocation(String value) {
        this.manufacturerLocation = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the authenticationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationKey() {
        return authenticationKey;
    }

    /**
     * Sets the value of the authenticationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationKey(String value) {
        this.authenticationKey = value;
    }

    /**
     * Gets the value of the masterSubsidyLock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterSubsidyLock() {
        return masterSubsidyLock;
    }

    /**
     * Sets the value of the masterSubsidyLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterSubsidyLock(String value) {
        this.masterSubsidyLock = value;
    }

    /**
     * Gets the value of the oneTimeKeyPadSubsidyLock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneTimeKeyPadSubsidyLock() {
        return oneTimeKeyPadSubsidyLock;
    }

    /**
     * Sets the value of the oneTimeKeyPadSubsidyLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneTimeKeyPadSubsidyLock(String value) {
        this.oneTimeKeyPadSubsidyLock = value;
    }

    /**
     * Gets the value of the lastTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTransactionDate() {
        return lastTransactionDate;
    }

    /**
     * Sets the value of the lastTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTransactionDate(XMLGregorianCalendar value) {
        this.lastTransactionDate = value;
    }

    /**
     * Gets the value of the deviceFrequencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFrequencyTypeCode() {
        return deviceFrequencyTypeCode;
    }

    /**
     * Sets the value of the deviceFrequencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFrequencyTypeCode(String value) {
        this.deviceFrequencyTypeCode = value;
    }

    /**
     * Gets the value of the autoPrlUpdateNeededInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPrlUpdateNeededInd() {
        return autoPrlUpdateNeededInd;
    }

    /**
     * Sets the value of the autoPrlUpdateNeededInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoPrlUpdateNeededInd(String value) {
        this.autoPrlUpdateNeededInd = value;
    }

    /**
     * Gets the value of the deviceActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceActivationDate() {
        return deviceActivationDate;
    }

    /**
     * Sets the value of the deviceActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceActivationDate(XMLGregorianCalendar value) {
        this.deviceActivationDate = value;
    }

    /**
     * Gets the value of the deviceDeactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceDeactivationDate() {
        return deviceDeactivationDate;
    }

    /**
     * Sets the value of the deviceDeactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceDeactivationDate(XMLGregorianCalendar value) {
        this.deviceDeactivationDate = value;
    }

    /**
     * Gets the value of the lastTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTransactionCode() {
        return lastTransactionCode;
    }

    /**
     * Sets the value of the lastTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTransactionCode(String value) {
        this.lastTransactionCode = value;
    }

    /**
     * Gets the value of the pseudoEsnHex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoEsnHex() {
        return pseudoEsnHex;
    }

    /**
     * Sets the value of the pseudoEsnHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoEsnHex(String value) {
        this.pseudoEsnHex = value;
    }

}

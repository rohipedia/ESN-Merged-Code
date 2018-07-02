
package com.sprint.integration.interfaces.querydeviceresourceinfo.v2.querydeviceresourceinfov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeviceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data3GInd" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}FeatureSupportedFlagType"/&gt;
 *         &lt;element name="readyLinkInd" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}FeatureSupportedFlagType"/&gt;
 *         &lt;element name="modelNumber" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}ModelNumberType"/&gt;
 *         &lt;element name="manufacturerLocation" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}DeviceManufacturerLocationIdentifierType"/&gt;
 *         &lt;element name="masterSubsidyLock" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}MasterSubsidyLockCodeType"/&gt;
 *         &lt;element name="oneTimeKeyPadSubsidyLock" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}OneTimeKeypadSubisidyLockCodeType"/&gt;
 *         &lt;element name="authenticationKey" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}AuthenticationKeyType"/&gt;
 *         &lt;element name="deviceStatus" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}DeviceActivationStatusCodeType"/&gt;
 *         &lt;element name="deviceSerialNumberHex" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}DeviceSerialNumberHexType" minOccurs="0"/&gt;
 *         &lt;element name="deviceSerialNumberDecimal" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}DeviceSerialNumberDecType" minOccurs="0"/&gt;
 *         &lt;element name="pseudoEsn" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}ElectronicSerialNumberType" minOccurs="0"/&gt;
 *         &lt;element name="prlName" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}PreferredRoamingListNameType" minOccurs="0"/&gt;
 *         &lt;element name="modelName" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}ModelNameType" minOccurs="0"/&gt;
 *         &lt;element name="equipSoftwareVersion" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}VersionStringType" minOccurs="0"/&gt;
 *         &lt;element name="systemCreationDate" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}CreationDateType" minOccurs="0"/&gt;
 *         &lt;element name="iccId" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}UniversalIntegratedCircuitCardIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="imsi" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}InternationalMobileSubscriberIdentityStringType" minOccurs="0"/&gt;
 *         &lt;element name="parentModelNumber" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}ModelNumberType" minOccurs="0"/&gt;
 *         &lt;element name="deviceType" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}DeviceTransceiverTypeCodeType"/&gt;
 *         &lt;element name="uiccInfo" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}UiccInfoType" minOccurs="0"/&gt;
 *         &lt;element name="financialEligibilityDate" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}EligibilityDateType"/&gt;
 *         &lt;element name="lockState" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}LockStateNameType" minOccurs="0"/&gt;
 *         &lt;element name="lockUnlockDate" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}EventDateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfoType", propOrder = {
    "data3GInd",
    "readyLinkInd",
    "modelNumber",
    "manufacturerLocation",
    "masterSubsidyLock",
    "oneTimeKeyPadSubsidyLock",
    "authenticationKey",
    "deviceStatus",
    "deviceSerialNumberHex",
    "deviceSerialNumberDecimal",
    "pseudoEsn",
    "prlName",
    "modelName",
    "equipSoftwareVersion",
    "systemCreationDate",
    "iccId",
    "imsi",
    "parentModelNumber",
    "deviceType",
    "uiccInfo",
    "financialEligibilityDate",
    "lockState",
    "lockUnlockDate"
})
public class DeviceInfoType {

    protected boolean data3GInd;
    protected boolean readyLinkInd;
    @XmlElement(required = true)
    protected String modelNumber;
    @XmlElement(required = true)
    protected String manufacturerLocation;
    @XmlElement(required = true)
    protected String masterSubsidyLock;
    @XmlElement(required = true)
    protected String oneTimeKeyPadSubsidyLock;
    @XmlElement(required = true)
    protected String authenticationKey;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeviceActivationStatusCodeType deviceStatus;
    protected String deviceSerialNumberHex;
    protected String deviceSerialNumberDecimal;
    protected String pseudoEsn;
    protected String prlName;
    protected String modelName;
    protected String equipSoftwareVersion;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar systemCreationDate;
    protected String iccId;
    protected String imsi;
    protected String parentModelNumber;
    @XmlElement(required = true)
    protected String deviceType;
    protected UiccInfoType uiccInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar financialEligibilityDate;
    protected String lockState;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lockUnlockDate;

    /**
     * Gets the value of the data3GInd property.
     * 
     */
    public boolean isData3GInd() {
        return data3GInd;
    }

    /**
     * Sets the value of the data3GInd property.
     * 
     */
    public void setData3GInd(boolean value) {
        this.data3GInd = value;
    }

    /**
     * Gets the value of the readyLinkInd property.
     * 
     */
    public boolean isReadyLinkInd() {
        return readyLinkInd;
    }

    /**
     * Sets the value of the readyLinkInd property.
     * 
     */
    public void setReadyLinkInd(boolean value) {
        this.readyLinkInd = value;
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
     * Gets the value of the deviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceActivationStatusCodeType }
     *     
     */
    public DeviceActivationStatusCodeType getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * Sets the value of the deviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceActivationStatusCodeType }
     *     
     */
    public void setDeviceStatus(DeviceActivationStatusCodeType value) {
        this.deviceStatus = value;
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
     * Gets the value of the pseudoEsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoEsn() {
        return pseudoEsn;
    }

    /**
     * Sets the value of the pseudoEsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoEsn(String value) {
        this.pseudoEsn = value;
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
     * Gets the value of the equipSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipSoftwareVersion() {
        return equipSoftwareVersion;
    }

    /**
     * Sets the value of the equipSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipSoftwareVersion(String value) {
        this.equipSoftwareVersion = value;
    }

    /**
     * Gets the value of the systemCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemCreationDate() {
        return systemCreationDate;
    }

    /**
     * Sets the value of the systemCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemCreationDate(XMLGregorianCalendar value) {
        this.systemCreationDate = value;
    }

    /**
     * Gets the value of the iccId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccId() {
        return iccId;
    }

    /**
     * Sets the value of the iccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccId(String value) {
        this.iccId = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the parentModelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentModelNumber() {
        return parentModelNumber;
    }

    /**
     * Sets the value of the parentModelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentModelNumber(String value) {
        this.parentModelNumber = value;
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
     * Gets the value of the uiccInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UiccInfoType }
     *     
     */
    public UiccInfoType getUiccInfo() {
        return uiccInfo;
    }

    /**
     * Sets the value of the uiccInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UiccInfoType }
     *     
     */
    public void setUiccInfo(UiccInfoType value) {
        this.uiccInfo = value;
    }

    /**
     * Gets the value of the financialEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinancialEligibilityDate() {
        return financialEligibilityDate;
    }

    /**
     * Sets the value of the financialEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinancialEligibilityDate(XMLGregorianCalendar value) {
        this.financialEligibilityDate = value;
    }

    /**
     * Gets the value of the lockState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockState() {
        return lockState;
    }

    /**
     * Sets the value of the lockState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockState(String value) {
        this.lockState = value;
    }

    /**
     * Gets the value of the lockUnlockDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLockUnlockDate() {
        return lockUnlockDate;
    }

    /**
     * Sets the value of the lockUnlockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLockUnlockDate(XMLGregorianCalendar value) {
        this.lockUnlockDate = value;
    }

}

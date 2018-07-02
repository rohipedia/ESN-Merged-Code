
package com.sprint.integration.interfaces.validatedevice.v8.validatedevicev8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateDeviceV8ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateDeviceV8ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availabilityTypeCode" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}SerialNumberAvailabilityStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="notAvailableReasonCode" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}SerialNumberNotAvailableReasonCodeType" minOccurs="0"/&gt;
 *         &lt;element name="validationMessage" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}SerialNumberNotAvailableReasonDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerName" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceManufacturerNameType" minOccurs="0"/&gt;
 *         &lt;element name="modelName" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceModelNameType" minOccurs="0"/&gt;
 *         &lt;element name="freqMode" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}FrequencyModeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="equipmentFreqTypeCode" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}FrequencyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="modelNumber" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}ModelNumberType" minOccurs="0"/&gt;
 *         &lt;element name="deviceSerialNumber" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceSerialNumberHexType"/&gt;
 *         &lt;element name="deviceType" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceSerialNumberTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="macId" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}MediumAccessControlAddressType" minOccurs="0"/&gt;
 *         &lt;element name="iccId" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}UniversalIntegratedCircuitCardIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="imsi" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}InternationalMobileSubscriberIdentityStringType" minOccurs="0"/&gt;
 *         &lt;element name="uiccSku" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}StockKeepingUnitType" minOccurs="0"/&gt;
 *         &lt;element name="uiccAvailabilityCode" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}SerialNumberAvailabilityStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="uiccNotAvailableReasonCode" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceActivationStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="uiccCompatibility" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}UniversalIntegratedCircuitCardCompatibilityCodeType" minOccurs="0"/&gt;
 *         &lt;element name="uiccType" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}UniversalIntegratedCircuitCardSimTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateDeviceV8ResponseType", propOrder = {
    "availabilityTypeCode",
    "notAvailableReasonCode",
    "validationMessage",
    "manufacturerName",
    "modelName",
    "freqMode",
    "equipmentFreqTypeCode",
    "modelNumber",
    "deviceSerialNumber",
    "deviceType",
    "macId",
    "iccId",
    "imsi",
    "uiccSku",
    "uiccAvailabilityCode",
    "uiccNotAvailableReasonCode",
    "uiccCompatibility",
    "uiccType"
})
public class ValidateDeviceV8ResponseType {

    protected String availabilityTypeCode;
    protected String notAvailableReasonCode;
    protected String validationMessage;
    protected String manufacturerName;
    protected String modelName;
    protected String freqMode;
    protected String equipmentFreqTypeCode;
    protected String modelNumber;
    @XmlElement(required = true)
    protected String deviceSerialNumber;
    @XmlSchemaType(name = "string")
    protected DeviceSerialNumberTypeCodeType deviceType;
    protected String macId;
    protected String iccId;
    protected String imsi;
    protected String uiccSku;
    protected String uiccAvailabilityCode;
    protected String uiccNotAvailableReasonCode;
    protected String uiccCompatibility;
    protected String uiccType;

    /**
     * Gets the value of the availabilityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityTypeCode() {
        return availabilityTypeCode;
    }

    /**
     * Sets the value of the availabilityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityTypeCode(String value) {
        this.availabilityTypeCode = value;
    }

    /**
     * Gets the value of the notAvailableReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAvailableReasonCode() {
        return notAvailableReasonCode;
    }

    /**
     * Sets the value of the notAvailableReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAvailableReasonCode(String value) {
        this.notAvailableReasonCode = value;
    }

    /**
     * Gets the value of the validationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationMessage() {
        return validationMessage;
    }

    /**
     * Sets the value of the validationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationMessage(String value) {
        this.validationMessage = value;
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
     * Gets the value of the freqMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreqMode() {
        return freqMode;
    }

    /**
     * Sets the value of the freqMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreqMode(String value) {
        this.freqMode = value;
    }

    /**
     * Gets the value of the equipmentFreqTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentFreqTypeCode() {
        return equipmentFreqTypeCode;
    }

    /**
     * Sets the value of the equipmentFreqTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentFreqTypeCode(String value) {
        this.equipmentFreqTypeCode = value;
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
     * Gets the value of the deviceSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * Sets the value of the deviceSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNumber(String value) {
        this.deviceSerialNumber = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSerialNumberTypeCodeType }
     *     
     */
    public DeviceSerialNumberTypeCodeType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSerialNumberTypeCodeType }
     *     
     */
    public void setDeviceType(DeviceSerialNumberTypeCodeType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the macId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacId() {
        return macId;
    }

    /**
     * Sets the value of the macId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacId(String value) {
        this.macId = value;
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
     * Gets the value of the uiccSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiccSku() {
        return uiccSku;
    }

    /**
     * Sets the value of the uiccSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiccSku(String value) {
        this.uiccSku = value;
    }

    /**
     * Gets the value of the uiccAvailabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiccAvailabilityCode() {
        return uiccAvailabilityCode;
    }

    /**
     * Sets the value of the uiccAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiccAvailabilityCode(String value) {
        this.uiccAvailabilityCode = value;
    }

    /**
     * Gets the value of the uiccNotAvailableReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiccNotAvailableReasonCode() {
        return uiccNotAvailableReasonCode;
    }

    /**
     * Sets the value of the uiccNotAvailableReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiccNotAvailableReasonCode(String value) {
        this.uiccNotAvailableReasonCode = value;
    }

    /**
     * Gets the value of the uiccCompatibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiccCompatibility() {
        return uiccCompatibility;
    }

    /**
     * Sets the value of the uiccCompatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiccCompatibility(String value) {
        this.uiccCompatibility = value;
    }

    /**
     * Gets the value of the uiccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiccType() {
        return uiccType;
    }

    /**
     * Sets the value of the uiccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiccType(String value) {
        this.uiccType = value;
    }

}

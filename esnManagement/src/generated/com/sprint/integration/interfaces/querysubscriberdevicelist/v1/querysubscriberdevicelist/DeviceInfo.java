
package com.sprint.integration.interfaces.querysubscriberdevicelist.v1.querysubscriberdevicelist;

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
 *         &lt;element name="deviceSerialNumber" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}DeviceSerialNbr"/&gt;
 *         &lt;element name="esnHex" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}DeviceSerialNumberHex" minOccurs="0"/&gt;
 *         &lt;element name="serialType" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}DeviceSerialNumberTypeCode"/&gt;
 *         &lt;element name="activationDate" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}NetworkAccessActivationFromDate"/&gt;
 *         &lt;element name="expirationDate" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}ProductDeploymentEffectiveThruDate" minOccurs="0"/&gt;
 *         &lt;element name="activeInd" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}ActiveExpiredCode" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}DeviceItemIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="modelNumber" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}ModelNumber" minOccurs="0"/&gt;
 *         &lt;element name="itemDesc" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}DeviceItemDescription" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerShortName" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}ManufacturerShortName" minOccurs="0"/&gt;
 *         &lt;element name="negativeInd" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}NegativeSuspendFlag" minOccurs="0"/&gt;
 *         &lt;element name="networkInd" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}NetworkIndicatorCode" minOccurs="0"/&gt;
 *         &lt;element name="negativeReasonCode" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}NegativeReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="negativeReasonCodeDesc" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}NegativeReasonDescription" minOccurs="0"/&gt;
 *         &lt;element name="negativeDate" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}LastUpdateDate" minOccurs="0"/&gt;
 *         &lt;element name="modelId" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}EquipmentModelNumberType" minOccurs="0"/&gt;
 *         &lt;element name="modelName" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}ModelNameType" minOccurs="0"/&gt;
 *         &lt;element name="deviceTypeName" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}DeviceCategoryNameType" minOccurs="0"/&gt;
 *         &lt;element name="operatingSystem" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}OperatingSystemNameType" minOccurs="0"/&gt;
 *         &lt;element name="technologyCode" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}WirelessTechnologyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="lteImsi" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}InternationalMobileSubscriberIdentityString"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lteIccId" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}UniversalIntegratedCircuitCardIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="equipmentCategory" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}DeviceCategoryNameType"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "deviceSerialNumber",
    "esnHex",
    "serialType",
    "activationDate",
    "expirationDate",
    "activeInd",
    "itemId",
    "modelNumber",
    "itemDesc",
    "manufacturerShortName",
    "negativeInd",
    "networkInd",
    "negativeReasonCode",
    "negativeReasonCodeDesc",
    "negativeDate",
    "modelId",
    "modelName",
    "deviceTypeName",
    "operatingSystem",
    "technologyCode",
    "lteImsi",
    "lteIccId",
    "equipmentCategory"
})
public class DeviceInfo {

    @XmlElement(required = true)
    protected String deviceSerialNumber;
    protected String esnHex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeviceSerialNumberTypeCode serialType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    protected String activeInd;
    protected String itemId;
    protected String modelNumber;
    protected String itemDesc;
    protected String manufacturerShortName;
    protected Boolean negativeInd;
    @XmlSchemaType(name = "string")
    protected NetworkIndicatorCode networkInd;
    protected String negativeReasonCode;
    protected String negativeReasonCodeDesc;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar negativeDate;
    protected String modelId;
    protected String modelName;
    protected String deviceTypeName;
    protected String operatingSystem;
    protected String technologyCode;
    protected String lteImsi;
    protected String lteIccId;
    protected String equipmentCategory;

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
     * Gets the value of the esnHex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsnHex() {
        return esnHex;
    }

    /**
     * Sets the value of the esnHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsnHex(String value) {
        this.esnHex = value;
    }

    /**
     * Gets the value of the serialType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSerialNumberTypeCode }
     *     
     */
    public DeviceSerialNumberTypeCode getSerialType() {
        return serialType;
    }

    /**
     * Sets the value of the serialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSerialNumberTypeCode }
     *     
     */
    public void setSerialType(DeviceSerialNumberTypeCode value) {
        this.serialType = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the activeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Sets the value of the activeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveInd(String value) {
        this.activeInd = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
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
     * Gets the value of the itemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Sets the value of the itemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    /**
     * Gets the value of the manufacturerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerShortName() {
        return manufacturerShortName;
    }

    /**
     * Sets the value of the manufacturerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerShortName(String value) {
        this.manufacturerShortName = value;
    }

    /**
     * Gets the value of the negativeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegativeInd() {
        return negativeInd;
    }

    /**
     * Sets the value of the negativeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegativeInd(Boolean value) {
        this.negativeInd = value;
    }

    /**
     * Gets the value of the networkInd property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkIndicatorCode }
     *     
     */
    public NetworkIndicatorCode getNetworkInd() {
        return networkInd;
    }

    /**
     * Sets the value of the networkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkIndicatorCode }
     *     
     */
    public void setNetworkInd(NetworkIndicatorCode value) {
        this.networkInd = value;
    }

    /**
     * Gets the value of the negativeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeReasonCode() {
        return negativeReasonCode;
    }

    /**
     * Sets the value of the negativeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeReasonCode(String value) {
        this.negativeReasonCode = value;
    }

    /**
     * Gets the value of the negativeReasonCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeReasonCodeDesc() {
        return negativeReasonCodeDesc;
    }

    /**
     * Sets the value of the negativeReasonCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeReasonCodeDesc(String value) {
        this.negativeReasonCodeDesc = value;
    }

    /**
     * Gets the value of the negativeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNegativeDate() {
        return negativeDate;
    }

    /**
     * Sets the value of the negativeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNegativeDate(XMLGregorianCalendar value) {
        this.negativeDate = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelId(String value) {
        this.modelId = value;
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
     * Gets the value of the deviceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    /**
     * Sets the value of the deviceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTypeName(String value) {
        this.deviceTypeName = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the technologyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologyCode() {
        return technologyCode;
    }

    /**
     * Sets the value of the technologyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologyCode(String value) {
        this.technologyCode = value;
    }

    /**
     * Gets the value of the lteImsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLteImsi() {
        return lteImsi;
    }

    /**
     * Sets the value of the lteImsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLteImsi(String value) {
        this.lteImsi = value;
    }

    /**
     * Gets the value of the lteIccId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLteIccId() {
        return lteIccId;
    }

    /**
     * Sets the value of the lteIccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLteIccId(String value) {
        this.lteIccId = value;
    }

    /**
     * Gets the value of the equipmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentCategory() {
        return equipmentCategory;
    }

    /**
     * Sets the value of the equipmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentCategory(String value) {
        this.equipmentCategory = value;
    }

}

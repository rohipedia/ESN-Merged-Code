
package com.sprint.integration.interfaces.querydevicelist.v1.querydevicelist;

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
 *         &lt;element name="deviceSerialNumber" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}DeviceSerialNumberType"/&gt;
 *         &lt;element name="deviceSerialType" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}DeviceSerialNumberTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}StockKeepingUnitType"/&gt;
 *         &lt;element name="modelNumber" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}ModelNumberType"/&gt;
 *         &lt;element name="modelName" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}ModelNameType"/&gt;
 *         &lt;element name="manufacturerName" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}ManufacturerNameType"/&gt;
 *         &lt;element name="resourceNumber" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}ResourceDeviceSerialNumberType" minOccurs="0"/&gt;
 *         &lt;element name="nameInfo" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}NameInfoType" minOccurs="0"/&gt;
 *         &lt;element name="activateDate" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}ActivationDateType"/&gt;
 *         &lt;element name="expirationDate" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}ExpirationDateType" minOccurs="0"/&gt;
 *         &lt;element name="pendingUpgradeInd" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}BinaryExpressionType" minOccurs="0"/&gt;
 *         &lt;element name="subscriberId" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}SubscriberIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="esnHex" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}DeviceSerialNumberHexType" minOccurs="0"/&gt;
 *         &lt;element name="lteInd" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}BinaryExpressionType" minOccurs="0"/&gt;
 *         &lt;element name="lteUiccType" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}DeviceTransceiverTypeCodeType" minOccurs="0"/&gt;
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
    "deviceSerialNumber",
    "deviceSerialType",
    "itemId",
    "modelNumber",
    "modelName",
    "manufacturerName",
    "resourceNumber",
    "nameInfo",
    "activateDate",
    "expirationDate",
    "pendingUpgradeInd",
    "subscriberId",
    "esnHex",
    "lteInd",
    "lteUiccType"
})
public class DeviceInfoType {

    @XmlElement(required = true)
    protected String deviceSerialNumber;
    protected String deviceSerialType;
    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String modelNumber;
    @XmlElement(required = true)
    protected String modelName;
    @XmlElement(required = true)
    protected String manufacturerName;
    protected String resourceNumber;
    protected NameInfoType nameInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activateDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    protected Boolean pendingUpgradeInd;
    protected String subscriberId;
    protected String esnHex;
    protected Boolean lteInd;
    @XmlSchemaType(name = "string")
    protected DeviceTransceiverTypeCodeType lteUiccType;

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
     * Gets the value of the deviceSerialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialType() {
        return deviceSerialType;
    }

    /**
     * Sets the value of the deviceSerialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialType(String value) {
        this.deviceSerialType = value;
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
     * Gets the value of the resourceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceNumber() {
        return resourceNumber;
    }

    /**
     * Sets the value of the resourceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceNumber(String value) {
        this.resourceNumber = value;
    }

    /**
     * Gets the value of the nameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameInfoType }
     *     
     */
    public NameInfoType getNameInfo() {
        return nameInfo;
    }

    /**
     * Sets the value of the nameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInfoType }
     *     
     */
    public void setNameInfo(NameInfoType value) {
        this.nameInfo = value;
    }

    /**
     * Gets the value of the activateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivateDate() {
        return activateDate;
    }

    /**
     * Sets the value of the activateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivateDate(XMLGregorianCalendar value) {
        this.activateDate = value;
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
     * Gets the value of the pendingUpgradeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingUpgradeInd() {
        return pendingUpgradeInd;
    }

    /**
     * Sets the value of the pendingUpgradeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingUpgradeInd(Boolean value) {
        this.pendingUpgradeInd = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
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
     * Gets the value of the lteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLteInd() {
        return lteInd;
    }

    /**
     * Sets the value of the lteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLteInd(Boolean value) {
        this.lteInd = value;
    }

    /**
     * Gets the value of the lteUiccType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTransceiverTypeCodeType }
     *     
     */
    public DeviceTransceiverTypeCodeType getLteUiccType() {
        return lteUiccType;
    }

    /**
     * Sets the value of the lteUiccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTransceiverTypeCodeType }
     *     
     */
    public void setLteUiccType(DeviceTransceiverTypeCodeType value) {
        this.lteUiccType = value;
    }

}

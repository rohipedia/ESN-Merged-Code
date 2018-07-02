
package com.sprint.integration.interfaces.querydevicecapabilities.v2.querydevicecapabilitiesv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeviceCharacteristicsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceCharacteristicsInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capabilityId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ProductCharacteristicIdentifierType"/&gt;
 *         &lt;element name="productId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ProductIdentifierType"/&gt;
 *         &lt;element name="capabilityTypeId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}CapabilityTypeIdentifierType"/&gt;
 *         &lt;element name="capabilityEffectiveDate" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}EffectiveFromDateTimeType"/&gt;
 *         &lt;element name="capabilityExpirationDate" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ExpirationDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="capabilityValue" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ProductCharacteristicValueTextType"/&gt;
 *         &lt;element name="productName" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ProductNameType"/&gt;
 *         &lt;element name="productTypeName" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ProductCategoryDescriptionType"/&gt;
 *         &lt;element name="capabilityTypeName" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}CapabilityTypeNameType"/&gt;
 *         &lt;element name="capabilityTypeDesc" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}CapabilityTypeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureTypeId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}UnitOfMeasureCodeType"/&gt;
 *         &lt;element name="unitOfMeasureTypeName" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}UnitOfMeasureNameType"/&gt;
 *         &lt;element name="unitOfMeasureDataType" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}DataTypeNameType"/&gt;
 *         &lt;element name="manufacturerShortName" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ModelNameType"/&gt;
 *         &lt;element name="modelNumber" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}ModelNumberType"/&gt;
 *         &lt;element name="userId" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}UserIdentifierType"/&gt;
 *         &lt;element name="recordCreationDate" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}CreationDateTimeType"/&gt;
 *         &lt;element name="recordUpdateDate" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}LastUpdateDateTimeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCharacteristicsInfoType", propOrder = {
    "capabilityId",
    "productId",
    "capabilityTypeId",
    "capabilityEffectiveDate",
    "capabilityExpirationDate",
    "capabilityValue",
    "productName",
    "productTypeName",
    "capabilityTypeName",
    "capabilityTypeDesc",
    "unitOfMeasureTypeId",
    "unitOfMeasureTypeName",
    "unitOfMeasureDataType",
    "manufacturerShortName",
    "modelNumber",
    "userId",
    "recordCreationDate",
    "recordUpdateDate"
})
public class DeviceCharacteristicsInfoType {

    @XmlElement(required = true)
    protected String capabilityId;
    @XmlElement(required = true)
    protected String productId;
    @XmlElement(required = true)
    protected String capabilityTypeId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar capabilityEffectiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar capabilityExpirationDate;
    @XmlElement(required = true)
    protected String capabilityValue;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String productTypeName;
    @XmlElement(required = true)
    protected String capabilityTypeName;
    protected String capabilityTypeDesc;
    @XmlElement(required = true)
    protected String unitOfMeasureTypeId;
    @XmlElement(required = true)
    protected String unitOfMeasureTypeName;
    @XmlElement(required = true)
    protected String unitOfMeasureDataType;
    @XmlElement(required = true)
    protected String manufacturerShortName;
    @XmlElement(required = true)
    protected String modelNumber;
    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordCreationDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordUpdateDate;

    /**
     * Gets the value of the capabilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityId() {
        return capabilityId;
    }

    /**
     * Sets the value of the capabilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityId(String value) {
        this.capabilityId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the capabilityTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityTypeId() {
        return capabilityTypeId;
    }

    /**
     * Sets the value of the capabilityTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityTypeId(String value) {
        this.capabilityTypeId = value;
    }

    /**
     * Gets the value of the capabilityEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCapabilityEffectiveDate() {
        return capabilityEffectiveDate;
    }

    /**
     * Sets the value of the capabilityEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCapabilityEffectiveDate(XMLGregorianCalendar value) {
        this.capabilityEffectiveDate = value;
    }

    /**
     * Gets the value of the capabilityExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCapabilityExpirationDate() {
        return capabilityExpirationDate;
    }

    /**
     * Sets the value of the capabilityExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCapabilityExpirationDate(XMLGregorianCalendar value) {
        this.capabilityExpirationDate = value;
    }

    /**
     * Gets the value of the capabilityValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityValue() {
        return capabilityValue;
    }

    /**
     * Sets the value of the capabilityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityValue(String value) {
        this.capabilityValue = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * Sets the value of the productTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeName(String value) {
        this.productTypeName = value;
    }

    /**
     * Gets the value of the capabilityTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityTypeName() {
        return capabilityTypeName;
    }

    /**
     * Sets the value of the capabilityTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityTypeName(String value) {
        this.capabilityTypeName = value;
    }

    /**
     * Gets the value of the capabilityTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityTypeDesc() {
        return capabilityTypeDesc;
    }

    /**
     * Sets the value of the capabilityTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityTypeDesc(String value) {
        this.capabilityTypeDesc = value;
    }

    /**
     * Gets the value of the unitOfMeasureTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureTypeId() {
        return unitOfMeasureTypeId;
    }

    /**
     * Sets the value of the unitOfMeasureTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureTypeId(String value) {
        this.unitOfMeasureTypeId = value;
    }

    /**
     * Gets the value of the unitOfMeasureTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureTypeName() {
        return unitOfMeasureTypeName;
    }

    /**
     * Sets the value of the unitOfMeasureTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureTypeName(String value) {
        this.unitOfMeasureTypeName = value;
    }

    /**
     * Gets the value of the unitOfMeasureDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureDataType() {
        return unitOfMeasureDataType;
    }

    /**
     * Sets the value of the unitOfMeasureDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureDataType(String value) {
        this.unitOfMeasureDataType = value;
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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the recordCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordCreationDate() {
        return recordCreationDate;
    }

    /**
     * Sets the value of the recordCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordCreationDate(XMLGregorianCalendar value) {
        this.recordCreationDate = value;
    }

    /**
     * Gets the value of the recordUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordUpdateDate() {
        return recordUpdateDate;
    }

    /**
     * Sets the value of the recordUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordUpdateDate(XMLGregorianCalendar value) {
        this.recordUpdateDate = value;
    }

}

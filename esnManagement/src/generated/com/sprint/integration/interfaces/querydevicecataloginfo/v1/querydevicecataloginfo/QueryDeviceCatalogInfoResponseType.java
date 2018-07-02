
package com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceCatalogInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceCatalogInfoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemId" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}ModelNumberType"/&gt;
 *         &lt;element name="displayName" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}ModelNameType"/&gt;
 *         &lt;element name="networkType" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}NetworkTypeCodeType"/&gt;
 *         &lt;element name="imageUrl" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}UniformResourceLocatorType" minOccurs="0"/&gt;
 *         &lt;element name="deviceFrequencyList" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}DeviceFrequencyListType" minOccurs="0"/&gt;
 *         &lt;element name="deviceCapabilityList" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}DeviceCapabilityListType" minOccurs="0"/&gt;
 *         &lt;element name="additionalPropertyList" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}PropertyListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceCatalogInfoResponseType", propOrder = {
    "itemId",
    "displayName",
    "networkType",
    "imageUrl",
    "deviceFrequencyList",
    "deviceCapabilityList",
    "additionalPropertyList"
})
public class QueryDeviceCatalogInfoResponseType {

    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String networkType;
    protected String imageUrl;
    protected DeviceFrequencyListType deviceFrequencyList;
    protected DeviceCapabilityListType deviceCapabilityList;
    protected PropertyListType additionalPropertyList;

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the deviceFrequencyList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFrequencyListType }
     *     
     */
    public DeviceFrequencyListType getDeviceFrequencyList() {
        return deviceFrequencyList;
    }

    /**
     * Sets the value of the deviceFrequencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFrequencyListType }
     *     
     */
    public void setDeviceFrequencyList(DeviceFrequencyListType value) {
        this.deviceFrequencyList = value;
    }

    /**
     * Gets the value of the deviceCapabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCapabilityListType }
     *     
     */
    public DeviceCapabilityListType getDeviceCapabilityList() {
        return deviceCapabilityList;
    }

    /**
     * Sets the value of the deviceCapabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCapabilityListType }
     *     
     */
    public void setDeviceCapabilityList(DeviceCapabilityListType value) {
        this.deviceCapabilityList = value;
    }

    /**
     * Gets the value of the additionalPropertyList property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyListType }
     *     
     */
    public PropertyListType getAdditionalPropertyList() {
        return additionalPropertyList;
    }

    /**
     * Sets the value of the additionalPropertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyListType }
     *     
     */
    public void setAdditionalPropertyList(PropertyListType value) {
        this.additionalPropertyList = value;
    }

}

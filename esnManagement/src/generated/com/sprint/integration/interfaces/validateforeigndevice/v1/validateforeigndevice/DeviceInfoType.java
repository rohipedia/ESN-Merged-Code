
package com.sprint.integration.interfaces.validateforeigndevice.v1.validateforeigndevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="deviceDetailInfo" type="{http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd}DeviceDetailInfoType"/&gt;
 *         &lt;element name="partNumber" type="{http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd}StockKeepingUnitType" minOccurs="0"/&gt;
 *         &lt;element name="brandCode" type="{http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd}BrandCodeType" minOccurs="0"/&gt;
 *         &lt;element name="skuType" type="{http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd}DeviceCategoryNameType" minOccurs="0"/&gt;
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
    "deviceDetailInfo",
    "partNumber",
    "brandCode",
    "skuType"
})
public class DeviceInfoType {

    @XmlElement(required = true)
    protected DeviceDetailInfoType deviceDetailInfo;
    protected String partNumber;
    protected String brandCode;
    protected String skuType;

    /**
     * Gets the value of the deviceDetailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDetailInfoType }
     *     
     */
    public DeviceDetailInfoType getDeviceDetailInfo() {
        return deviceDetailInfo;
    }

    /**
     * Sets the value of the deviceDetailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDetailInfoType }
     *     
     */
    public void setDeviceDetailInfo(DeviceDetailInfoType value) {
        this.deviceDetailInfo = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
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
     * Gets the value of the skuType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuType() {
        return skuType;
    }

    /**
     * Sets the value of the skuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuType(String value) {
        this.skuType = value;
    }

}

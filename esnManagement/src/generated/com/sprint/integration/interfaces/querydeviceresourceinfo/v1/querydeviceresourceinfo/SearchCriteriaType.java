
package com.sprint.integration.interfaces.querydeviceresourceinfo.v1.querydeviceresourceinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="deviceSerialNumberHex" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}DeviceSerialNumberHexType"/&gt;
 *         &lt;element name="deviceSerialNumberDecimal" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}DeviceSerialNumberDecType"/&gt;
 *         &lt;element name="mdn" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}MobileDirectoryNumberStringType"/&gt;
 *         &lt;element name="iccId" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}UniversalIntegratedCircuitCardIdentifierType"/&gt;
 *         &lt;element name="imsi" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}InternationalMobileSubscriberIdentityStringType"/&gt;
 *         &lt;element name="naiInfo" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}NaiInfoRequestType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteriaType", propOrder = {
    "deviceSerialNumberHex",
    "deviceSerialNumberDecimal",
    "mdn",
    "iccId",
    "imsi",
    "naiInfo"
})
public class SearchCriteriaType {

    protected String deviceSerialNumberHex;
    protected String deviceSerialNumberDecimal;
    protected String mdn;
    protected String iccId;
    protected String imsi;
    protected NaiInfoRequestType naiInfo;

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
     * Gets the value of the naiInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NaiInfoRequestType }
     *     
     */
    public NaiInfoRequestType getNaiInfo() {
        return naiInfo;
    }

    /**
     * Sets the value of the naiInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaiInfoRequestType }
     *     
     */
    public void setNaiInfo(NaiInfoRequestType value) {
        this.naiInfo = value;
    }

}

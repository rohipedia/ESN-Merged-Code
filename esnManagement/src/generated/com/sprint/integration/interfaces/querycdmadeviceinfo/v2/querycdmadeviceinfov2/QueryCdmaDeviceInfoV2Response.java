
package com.sprint.integration.interfaces.querycdmadeviceinfo.v2.querycdmadeviceinfov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCdmaDeviceInfoV2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCdmaDeviceInfoV2Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msid" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}InternationalMobileEquipmentIdDec" minOccurs="0"/&gt;
 *         &lt;element name="deviceInfo" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceInfo"/&gt;
 *         &lt;element name="esnMeidStatus" type="{http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd}DeviceActivationStatusCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCdmaDeviceInfoV2Response", propOrder = {
    "msid",
    "deviceInfo",
    "esnMeidStatus"
})
public class QueryCdmaDeviceInfoV2Response {

    protected String msid;
    @XmlElement(required = true)
    protected DeviceInfo deviceInfo;
    @XmlElement(required = true)
    protected String esnMeidStatus;

    /**
     * Gets the value of the msid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsid() {
        return msid;
    }

    /**
     * Sets the value of the msid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsid(String value) {
        this.msid = value;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInfo }
     *     
     */
    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInfo }
     *     
     */
    public void setDeviceInfo(DeviceInfo value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the esnMeidStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsnMeidStatus() {
        return esnMeidStatus;
    }

    /**
     * Sets the value of the esnMeidStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsnMeidStatus(String value) {
        this.esnMeidStatus = value;
    }

}

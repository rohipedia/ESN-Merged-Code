//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 03:12:58 PM IST 
//


package com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceDetailInfo" type="{http://integration.sprint.com/interfaces/validateDevice/v11/validateDeviceV11.xsd}DeviceDetailInfoType" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://integration.sprint.com/interfaces/validateDevice/v11/validateDeviceV11.xsd}WirelessTechnologyTypeCodeType" minOccurs="0"/>
 *         &lt;element name="iccId" type="{http://integration.sprint.com/interfaces/validateDevice/v11/validateDeviceV11.xsd}UniversalIntegratedCircuitCardIdentifierType" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://integration.sprint.com/interfaces/validateDevice/v11/validateDeviceV11.xsd}RemovableTransceiverSwapTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfoType", propOrder = {
    "deviceDetailInfo",
    "deviceType",
    "iccId",
    "actionCode"
})
public class DeviceInfoType {

    protected DeviceDetailInfoType deviceDetailInfo;
    protected WirelessTechnologyTypeCodeType deviceType;
    protected String iccId;
    protected RemovableTransceiverSwapTypeCodeType actionCode;

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
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link WirelessTechnologyTypeCodeType }
     *     
     */
    public WirelessTechnologyTypeCodeType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessTechnologyTypeCodeType }
     *     
     */
    public void setDeviceType(WirelessTechnologyTypeCodeType value) {
        this.deviceType = value;
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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RemovableTransceiverSwapTypeCodeType }
     *     
     */
    public RemovableTransceiverSwapTypeCodeType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemovableTransceiverSwapTypeCodeType }
     *     
     */
    public void setActionCode(RemovableTransceiverSwapTypeCodeType value) {
        this.actionCode = value;
    }

}


package com.sprint.integration.interfaces.validatedevice.v8.validatedevicev8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="deviceDetailInfo" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceDetailInfoType" minOccurs="0"/&gt;
 *         &lt;element name="deviceType" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}DeviceSerialNumberTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="iccId" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}UniversalIntegratedCircuitCardIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="actionCode" type="{http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd}RemovableTransceiverSwapTypeCodeType" minOccurs="0"/&gt;
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
    "deviceType",
    "iccId",
    "actionCode"
})
public class DeviceInfoType {

    protected DeviceDetailInfoType deviceDetailInfo;
    @XmlSchemaType(name = "string")
    protected DeviceSerialNumberTypeCodeType deviceType;
    protected String iccId;
    @XmlSchemaType(name = "string")
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

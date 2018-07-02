
package com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceIdInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceIdInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="esn" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}ElectronicSerialNumberType"/&gt;
 *         &lt;element name="imei" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}InternationalMobileEquipmentIdentifierStringType"/&gt;
 *         &lt;element name="macId" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}MediumAccessControlAddressType"/&gt;
 *         &lt;element name="meid" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}MobileEquipmentIdentifierType"/&gt;
 *         &lt;element name="simId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}SubscriberIdentityModuleIdentifierType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="uiccId" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}UniversalIntegratedCircuitCardIdentifierType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceIdInfoType", propOrder = {
    "esn",
    "imei",
    "macId",
    "meid",
    "simId",
    "uiccId"
})
public class DeviceIdInfoType {

    protected String esn;
    protected String imei;
    protected String macId;
    protected String meid;
    protected String simId;
    protected String uiccId;

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
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
     * Gets the value of the meid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeid() {
        return meid;
    }

    /**
     * Sets the value of the meid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeid(String value) {
        this.meid = value;
    }

    /**
     * Gets the value of the simId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimId() {
        return simId;
    }

    /**
     * Sets the value of the simId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimId(String value) {
        this.simId = value;
    }

    /**
     * Gets the value of the uiccId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiccId() {
        return uiccId;
    }

    /**
     * Sets the value of the uiccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiccId(String value) {
        this.uiccId = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 04:09:00 PM IST 
//


package com.sprint.integration.interfaces.queryaccountdevicelist.v1.queryaccountdevicelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ban" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}BillingAccountNumber"/>
 *         &lt;element name="subscriberId" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}SubscriptionIdentifierEns"/>
 *         &lt;element name="mdn" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}MobileDirectoryNumberString"/>
 *         &lt;element name="device" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}Device"/>
 *         &lt;element name="ufmi" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}UrbanFleetMemberIdentifierString"/>
 *         &lt;element name="ipAddress" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}InternetProtocolAddressString"/>
 *         &lt;element name="imsi" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}InternationalMobileSubscriberIdentityString"/>
 *         &lt;element name="nai" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}NetworkAccessIdentifierString"/>
 *         &lt;element name="hppttId" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}HighPerformancePushToTalkIDString"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", propOrder = {
    "ban",
    "subscriberId",
    "mdn",
    "device",
    "ufmi",
    "ipAddress",
    "imsi",
    "nai",
    "hppttId"
})
public class SearchCriteria {

    protected String ban;
    protected String subscriberId;
    protected String mdn;
    protected Device device;
    protected String ufmi;
    protected String ipAddress;
    protected String imsi;
    protected String nai;
    protected String hppttId;

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBan(String value) {
        this.ban = value;
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
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDevice(Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the ufmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfmi() {
        return ufmi;
    }

    /**
     * Sets the value of the ufmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfmi(String value) {
        this.ufmi = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
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
     * Gets the value of the nai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNai() {
        return nai;
    }

    /**
     * Sets the value of the nai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNai(String value) {
        this.nai = value;
    }

    /**
     * Gets the value of the hppttId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHppttId() {
        return hppttId;
    }

    /**
     * Sets the value of the hppttId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHppttId(String value) {
        this.hppttId = value;
    }

}


package com.sprint.integration.interfaces.querydevicelist.v1.querydevicelist;

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
 *         &lt;element name="ban" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}BillingAccountNumberType"/&gt;
 *         &lt;element name="subscriberId" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}SubscriberIdentifierType"/&gt;
 *         &lt;element name="mdn" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}MobileDirectoryNumberStringType"/&gt;
 *         &lt;element name="deviceSerialNumber" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}DeviceSerialNumberType"/&gt;
 *         &lt;element name="ufmi" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}UrbanFleetMemberIdentifierStringType"/&gt;
 *         &lt;element name="ipAddress" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}InternetProtocolAddressStringType"/&gt;
 *         &lt;element name="imsi" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}InternationalMobileSubscriberIdentityStringType"/&gt;
 *         &lt;element name="nai" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}NetworkAccessIdentifierStringType"/&gt;
 *         &lt;element name="hppttId" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}HighPerformancePushToTalkIdentifierStringType"/&gt;
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
    "ban",
    "subscriberId",
    "mdn",
    "deviceSerialNumber",
    "ufmi",
    "ipAddress",
    "imsi",
    "nai",
    "hppttId"
})
public class SearchCriteriaType {

    protected String ban;
    protected String subscriberId;
    protected String mdn;
    protected String deviceSerialNumber;
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

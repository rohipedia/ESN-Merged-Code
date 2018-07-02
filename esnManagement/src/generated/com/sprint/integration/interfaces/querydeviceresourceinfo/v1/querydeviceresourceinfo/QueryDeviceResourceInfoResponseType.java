
package com.sprint.integration.interfaces.querydeviceresourceinfo.v1.querydeviceresourceinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceResourceInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceResourceInfoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberId" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}SubscriptionIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="deviceInfo" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}DeviceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="mdnInfo" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}MdnInfoType" minOccurs="0"/&gt;
 *         &lt;element name="naiInfo" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}NaiInfoType" minOccurs="0"/&gt;
 *         &lt;element name="billSysCode" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}BillingSystemCodeType" minOccurs="0"/&gt;
 *         &lt;element name="hpppttId" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}HighPerformancePushToTalkIdentifierStringType" minOccurs="0"/&gt;
 *         &lt;element name="httpInd" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}FeatureSupportedFlagType" minOccurs="0"/&gt;
 *         &lt;element name="resellerPartnerId" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}ResellerPartnerIdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceResourceInfoResponseType", propOrder = {
    "subscriberId",
    "deviceInfo",
    "mdnInfo",
    "naiInfo",
    "billSysCode",
    "hpppttId",
    "httpInd",
    "resellerPartnerId"
})
public class QueryDeviceResourceInfoResponseType {

    protected String subscriberId;
    protected DeviceInfoType deviceInfo;
    protected MdnInfoType mdnInfo;
    protected NaiInfoType naiInfo;
    protected String billSysCode;
    protected String hpppttId;
    protected Boolean httpInd;
    protected String resellerPartnerId;

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
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInfoType }
     *     
     */
    public DeviceInfoType getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInfoType }
     *     
     */
    public void setDeviceInfo(DeviceInfoType value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the mdnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MdnInfoType }
     *     
     */
    public MdnInfoType getMdnInfo() {
        return mdnInfo;
    }

    /**
     * Sets the value of the mdnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MdnInfoType }
     *     
     */
    public void setMdnInfo(MdnInfoType value) {
        this.mdnInfo = value;
    }

    /**
     * Gets the value of the naiInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NaiInfoType }
     *     
     */
    public NaiInfoType getNaiInfo() {
        return naiInfo;
    }

    /**
     * Sets the value of the naiInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaiInfoType }
     *     
     */
    public void setNaiInfo(NaiInfoType value) {
        this.naiInfo = value;
    }

    /**
     * Gets the value of the billSysCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSysCode() {
        return billSysCode;
    }

    /**
     * Sets the value of the billSysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSysCode(String value) {
        this.billSysCode = value;
    }

    /**
     * Gets the value of the hpppttId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpppttId() {
        return hpppttId;
    }

    /**
     * Sets the value of the hpppttId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpppttId(String value) {
        this.hpppttId = value;
    }

    /**
     * Gets the value of the httpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHttpInd() {
        return httpInd;
    }

    /**
     * Sets the value of the httpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpInd(Boolean value) {
        this.httpInd = value;
    }

    /**
     * Gets the value of the resellerPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerPartnerId() {
        return resellerPartnerId;
    }

    /**
     * Sets the value of the resellerPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerPartnerId(String value) {
        this.resellerPartnerId = value;
    }

}

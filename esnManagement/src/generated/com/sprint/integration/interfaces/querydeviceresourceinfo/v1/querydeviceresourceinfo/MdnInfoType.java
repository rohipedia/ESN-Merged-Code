
package com.sprint.integration.interfaces.querydeviceresourceinfo.v1.querydeviceresourceinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MdnInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MdnInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mdn" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}MobileDirectoryNumberStringType"/&gt;
 *         &lt;element name="mdnStatus" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}MobileDirectoryNumberStatusCodeType"/&gt;
 *         &lt;element name="portActivityStatus" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}PortStatusCodeType"/&gt;
 *         &lt;element name="portState" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}NumberPortabilityDirectionTypeCodeType"/&gt;
 *         &lt;element name="numberGroup" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}NumberGroupType"/&gt;
 *         &lt;element name="msid" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}MobileStationIdentificationNumberType"/&gt;
 *         &lt;element name="sid" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}SystemIdentificationNumberType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MdnInfoType", propOrder = {
    "mdn",
    "mdnStatus",
    "portActivityStatus",
    "portState",
    "numberGroup",
    "msid",
    "sid"
})
public class MdnInfoType {

    @XmlElement(required = true)
    protected String mdn;
    @XmlElement(required = true)
    protected String mdnStatus;
    @XmlElement(required = true)
    protected String portActivityStatus;
    @XmlElement(required = true)
    protected String portState;
    @XmlElement(required = true)
    protected String numberGroup;
    @XmlElement(required = true)
    protected String msid;
    @XmlElement(required = true)
    protected String sid;

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
     * Gets the value of the mdnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdnStatus() {
        return mdnStatus;
    }

    /**
     * Sets the value of the mdnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdnStatus(String value) {
        this.mdnStatus = value;
    }

    /**
     * Gets the value of the portActivityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortActivityStatus() {
        return portActivityStatus;
    }

    /**
     * Sets the value of the portActivityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortActivityStatus(String value) {
        this.portActivityStatus = value;
    }

    /**
     * Gets the value of the portState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortState() {
        return portState;
    }

    /**
     * Sets the value of the portState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortState(String value) {
        this.portState = value;
    }

    /**
     * Gets the value of the numberGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberGroup() {
        return numberGroup;
    }

    /**
     * Sets the value of the numberGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberGroup(String value) {
        this.numberGroup = value;
    }

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
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

}

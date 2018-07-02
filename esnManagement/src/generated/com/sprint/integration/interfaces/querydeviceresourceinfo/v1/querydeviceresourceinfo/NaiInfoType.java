
package com.sprint.integration.interfaces.querydeviceresourceinfo.v1.querydeviceresourceinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaiInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaiInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="naiUserName" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}UserNameType"/&gt;
 *         &lt;element name="naiRealm" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}RealmType"/&gt;
 *         &lt;element name="naiStatus" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd}NetworkAccessIdentifierStatusCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaiInfoType", propOrder = {
    "naiUserName",
    "naiRealm",
    "naiStatus"
})
public class NaiInfoType {

    @XmlElement(required = true)
    protected String naiUserName;
    @XmlElement(required = true)
    protected String naiRealm;
    @XmlElement(required = true)
    protected String naiStatus;

    /**
     * Gets the value of the naiUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaiUserName() {
        return naiUserName;
    }

    /**
     * Sets the value of the naiUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaiUserName(String value) {
        this.naiUserName = value;
    }

    /**
     * Gets the value of the naiRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaiRealm() {
        return naiRealm;
    }

    /**
     * Sets the value of the naiRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaiRealm(String value) {
        this.naiRealm = value;
    }

    /**
     * Gets the value of the naiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaiStatus() {
        return naiStatus;
    }

    /**
     * Sets the value of the naiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaiStatus(String value) {
        this.naiStatus = value;
    }

}

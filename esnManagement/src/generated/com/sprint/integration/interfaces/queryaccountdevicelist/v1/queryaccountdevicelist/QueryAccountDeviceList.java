//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 03:12:58 PM IST 
//


package com.sprint.integration.interfaces.queryaccountdevicelist.v1.queryaccountdevicelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAccountDeviceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAccountDeviceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="info" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}SearchCriteria"/>
 *         &lt;element name="deviceList" type="{http://integration.sprint.com/interfaces/queryAccountDeviceList/v1/queryAccountDeviceList.xsd}SearchDeviceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAccountDeviceList", propOrder = {
    "info",
    "deviceList"
})
public class QueryAccountDeviceList {

    @XmlElement(required = true)
    protected SearchCriteria info;
    protected SearchDeviceList deviceList;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *     
     */
    public SearchCriteria getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setInfo(SearchCriteria value) {
        this.info = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDeviceList }
     *     
     */
    public SearchDeviceList getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDeviceList }
     *     
     */
    public void setDeviceList(SearchDeviceList value) {
        this.deviceList = value;
    }

}

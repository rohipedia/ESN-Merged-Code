
package com.sprint.integration.interfaces.queryrelateditemid.v1.queryrelateditemid;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRelatedItemIdResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRelatedItemIdResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceList" type="{http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd}DeviceListResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRelatedItemIdResponseType", propOrder = {
    "deviceList"
})
public class QueryRelatedItemIdResponseType {

    @XmlElement(required = true)
    protected DeviceListResponseType deviceList;

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceListResponseType }
     *     
     */
    public DeviceListResponseType getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceListResponseType }
     *     
     */
    public void setDeviceList(DeviceListResponseType value) {
        this.deviceList = value;
    }

}

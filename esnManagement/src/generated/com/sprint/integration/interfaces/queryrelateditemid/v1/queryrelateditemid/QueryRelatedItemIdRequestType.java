
package com.sprint.integration.interfaces.queryrelateditemid.v1.queryrelateditemid;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRelatedItemIdRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRelatedItemIdRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userId" type="{http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd}UserIdentifierType"/&gt;
 *         &lt;element name="deviceList" type="{http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd}DeviceListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRelatedItemIdRequestType", propOrder = {
    "userId",
    "deviceList"
})
public class QueryRelatedItemIdRequestType {

    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected DeviceListType deviceList;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceListType }
     *     
     */
    public DeviceListType getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceListType }
     *     
     */
    public void setDeviceList(DeviceListType value) {
        this.deviceList = value;
    }

}

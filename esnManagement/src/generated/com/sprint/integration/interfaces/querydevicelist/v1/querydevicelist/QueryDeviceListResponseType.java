
package com.sprint.integration.interfaces.querydevicelist.v1.querydevicelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceListResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="deviceList" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}DeviceListType" minOccurs="0"/&gt;
 *         &lt;element name="areMore" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}MoreRecordsAvailableFlagType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceListResponseType", propOrder = {
    "deviceList",
    "areMore"
})
public class QueryDeviceListResponseType {

    protected DeviceListType deviceList;
    protected Boolean areMore;

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

    /**
     * Gets the value of the areMore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreMore() {
        return areMore;
    }

    /**
     * Sets the value of the areMore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreMore(Boolean value) {
        this.areMore = value;
    }

}

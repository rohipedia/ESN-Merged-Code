
package com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceFrequencyListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceFrequencyListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceFrequencyInfo" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}DeviceFrequencyInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceFrequencyListType", propOrder = {
    "deviceFrequencyInfo"
})
public class DeviceFrequencyListType {

    @XmlElement(required = true)
    protected List<DeviceFrequencyInfoType> deviceFrequencyInfo;

    /**
     * Gets the value of the deviceFrequencyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceFrequencyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceFrequencyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceFrequencyInfoType }
     * 
     * 
     */
    public List<DeviceFrequencyInfoType> getDeviceFrequencyInfo() {
        if (deviceFrequencyInfo == null) {
            deviceFrequencyInfo = new ArrayList<DeviceFrequencyInfoType>();
        }
        return this.deviceFrequencyInfo;
    }

}

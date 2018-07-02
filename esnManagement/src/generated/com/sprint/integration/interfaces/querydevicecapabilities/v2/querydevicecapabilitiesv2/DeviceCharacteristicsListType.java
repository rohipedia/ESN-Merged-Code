
package com.sprint.integration.interfaces.querydevicecapabilities.v2.querydevicecapabilitiesv2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceCharacteristicsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceCharacteristicsListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceCharacteristicsInfo" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}DeviceCharacteristicsInfoType" maxOccurs="250"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCharacteristicsListType", propOrder = {
    "deviceCharacteristicsInfo"
})
public class DeviceCharacteristicsListType {

    @XmlElement(required = true)
    protected List<DeviceCharacteristicsInfoType> deviceCharacteristicsInfo;

    /**
     * Gets the value of the deviceCharacteristicsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceCharacteristicsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceCharacteristicsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceCharacteristicsInfoType }
     * 
     * 
     */
    public List<DeviceCharacteristicsInfoType> getDeviceCharacteristicsInfo() {
        if (deviceCharacteristicsInfo == null) {
            deviceCharacteristicsInfo = new ArrayList<DeviceCharacteristicsInfoType>();
        }
        return this.deviceCharacteristicsInfo;
    }

}


package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="sprintDeviceInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}SprintDeviceInfoType"/&gt;
 *         &lt;element name="nonSprintDeviceInd" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ForeignFlagType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfoType", propOrder = {
    "sprintDeviceInfo",
    "nonSprintDeviceInd"
})
public class DeviceInfoType {

    protected SprintDeviceInfoType sprintDeviceInfo;
    protected Boolean nonSprintDeviceInd;

    /**
     * Gets the value of the sprintDeviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SprintDeviceInfoType }
     *     
     */
    public SprintDeviceInfoType getSprintDeviceInfo() {
        return sprintDeviceInfo;
    }

    /**
     * Sets the value of the sprintDeviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SprintDeviceInfoType }
     *     
     */
    public void setSprintDeviceInfo(SprintDeviceInfoType value) {
        this.sprintDeviceInfo = value;
    }

    /**
     * Gets the value of the nonSprintDeviceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonSprintDeviceInd() {
        return nonSprintDeviceInd;
    }

    /**
     * Sets the value of the nonSprintDeviceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonSprintDeviceInd(Boolean value) {
        this.nonSprintDeviceInd = value;
    }

}

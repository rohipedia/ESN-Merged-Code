
package com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceHistoryByResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceHistoryByResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resourceInfo" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}ResourceInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceHistoryByResource", propOrder = {
    "resourceInfo"
})
public class QueryDeviceHistoryByResource {

    @XmlElement(required = true)
    protected ResourceInfo resourceInfo;

    /**
     * Gets the value of the resourceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceInfo }
     *     
     */
    public ResourceInfo getResourceInfo() {
        return resourceInfo;
    }

    /**
     * Sets the value of the resourceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceInfo }
     *     
     */
    public void setResourceInfo(ResourceInfo value) {
        this.resourceInfo = value;
    }

}

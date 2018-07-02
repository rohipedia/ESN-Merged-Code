
package com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceHistoryByResourceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceHistoryByResourceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberList" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}SubscriberList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceHistoryByResourceResponse", propOrder = {
    "subscriberList"
})
public class QueryDeviceHistoryByResourceResponse {

    @XmlElement(required = true)
    protected SubscriberList subscriberList;

    /**
     * Gets the value of the subscriberList property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberList }
     *     
     */
    public SubscriberList getSubscriberList() {
        return subscriberList;
    }

    /**
     * Sets the value of the subscriberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberList }
     *     
     */
    public void setSubscriberList(SubscriberList value) {
        this.subscriberList = value;
    }

}

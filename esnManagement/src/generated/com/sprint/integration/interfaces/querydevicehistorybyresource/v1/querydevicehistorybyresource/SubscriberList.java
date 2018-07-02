
package com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberInfo" type="{http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd}SubscriberInfo" maxOccurs="50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberList", propOrder = {
    "subscriberInfo"
})
public class SubscriberList {

    @XmlElement(required = true)
    protected List<SubscriberInfo> subscriberInfo;

    /**
     * Gets the value of the subscriberInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberInfo }
     * 
     * 
     */
    public List<SubscriberInfo> getSubscriberInfo() {
        if (subscriberInfo == null) {
            subscriberInfo = new ArrayList<SubscriberInfo>();
        }
        return this.subscriberInfo;
    }

}

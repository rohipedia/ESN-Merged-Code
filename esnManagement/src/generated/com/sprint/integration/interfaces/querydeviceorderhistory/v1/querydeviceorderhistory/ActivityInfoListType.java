
package com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInfoListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activityInfo" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}ActivityInfoType" maxOccurs="50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInfoListType", propOrder = {
    "activityInfo"
})
public class ActivityInfoListType {

    @XmlElement(required = true)
    protected List<ActivityInfoType> activityInfo;

    /**
     * Gets the value of the activityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityInfoType }
     * 
     * 
     */
    public List<ActivityInfoType> getActivityInfo() {
        if (activityInfo == null) {
            activityInfo = new ArrayList<ActivityInfoType>();
        }
        return this.activityInfo;
    }

}

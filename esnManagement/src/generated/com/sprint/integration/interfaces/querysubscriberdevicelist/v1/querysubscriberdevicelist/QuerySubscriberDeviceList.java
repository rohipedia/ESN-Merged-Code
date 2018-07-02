
package com.sprint.integration.interfaces.querysubscriberdevicelist.v1.querysubscriberdevicelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubscriberDeviceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubscriberDeviceList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="info" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}SearchCriteria"/&gt;
 *         &lt;element name="historyIndicator" type="{http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd}FetchInformationFlag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubscriberDeviceList", propOrder = {
    "info",
    "historyIndicator"
})
public class QuerySubscriberDeviceList {

    @XmlElement(required = true)
    protected SearchCriteria info;
    protected Boolean historyIndicator;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *     
     */
    public SearchCriteria getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setInfo(SearchCriteria value) {
        this.info = value;
    }

    /**
     * Gets the value of the historyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoryIndicator() {
        return historyIndicator;
    }

    /**
     * Sets the value of the historyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoryIndicator(Boolean value) {
        this.historyIndicator = value;
    }

}

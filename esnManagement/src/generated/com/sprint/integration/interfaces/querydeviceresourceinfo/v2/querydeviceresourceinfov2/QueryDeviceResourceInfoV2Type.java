
package com.sprint.integration.interfaces.querydeviceresourceinfo.v2.querydeviceresourceinfov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceResourceInfoV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceResourceInfoV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userId" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}DeviceUserIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="searchCriteria" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}SearchCriteriaType"/&gt;
 *         &lt;element name="fetchUiccInfo" type="{http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd}BinaryExpressionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceResourceInfoV2Type", propOrder = {
    "userId",
    "searchCriteria",
    "fetchUiccInfo"
})
public class QueryDeviceResourceInfoV2Type {

    protected String userId;
    @XmlElement(required = true)
    protected SearchCriteriaType searchCriteria;
    protected Boolean fetchUiccInfo;

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
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaType }
     *     
     */
    public SearchCriteriaType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaType }
     *     
     */
    public void setSearchCriteria(SearchCriteriaType value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the fetchUiccInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchUiccInfo() {
        return fetchUiccInfo;
    }

    /**
     * Sets the value of the fetchUiccInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchUiccInfo(Boolean value) {
        this.fetchUiccInfo = value;
    }

}

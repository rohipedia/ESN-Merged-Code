
package com.sprint.integration.interfaces.querydevicecapabilities.v2.querydevicecapabilitiesv2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceCapabilitiesV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceCapabilitiesV2ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="areMore" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}MoreRecordsAvailableFlagType"/&gt;
 *         &lt;element name="rowCount" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}RowCountNumberType"/&gt;
 *         &lt;element name="deviceCharacteristicsList" type="{http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd}DeviceCharacteristicsListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceCapabilitiesV2ResponseType", propOrder = {
    "areMore",
    "rowCount",
    "deviceCharacteristicsList"
})
public class QueryDeviceCapabilitiesV2ResponseType {

    protected Boolean areMore;
    protected BigInteger rowCount;
    protected DeviceCharacteristicsListType deviceCharacteristicsList;

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

    /**
     * Gets the value of the rowCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowCount(BigInteger value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the deviceCharacteristicsList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCharacteristicsListType }
     *     
     */
    public DeviceCharacteristicsListType getDeviceCharacteristicsList() {
        return deviceCharacteristicsList;
    }

    /**
     * Sets the value of the deviceCharacteristicsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCharacteristicsListType }
     *     
     */
    public void setDeviceCharacteristicsList(DeviceCharacteristicsListType value) {
        this.deviceCharacteristicsList = value;
    }

}

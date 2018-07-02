
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SprintDeviceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SprintDeviceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}EquipmentItemIdentifierType"/&gt;
 *         &lt;element name="deviceDescription" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}EquipmentItemDescriptionType"/&gt;
 *         &lt;element name="buybackProductId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ProductIdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SprintDeviceInfoType", propOrder = {
    "itemId",
    "deviceDescription",
    "buybackProductId"
})
public class SprintDeviceInfoType {

    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String deviceDescription;
    protected String buybackProductId;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }

    /**
     * Gets the value of the buybackProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackProductId() {
        return buybackProductId;
    }

    /**
     * Sets the value of the buybackProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackProductId(String value) {
        this.buybackProductId = value;
    }

}

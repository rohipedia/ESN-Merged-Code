
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseDeviceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseDeviceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentLineId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}LineItemIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}EquipmentItemIdentifierType"/&gt;
 *         &lt;element name="offerGroupList" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}OfferGroupListType"/&gt;
 *         &lt;element name="orderType" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}OrderTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="accountInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}AccountInfoType"/&gt;
 *         &lt;element name="retailLocationId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}RetailStoreIdentifierIntegerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseDeviceInfoType", propOrder = {
    "equipmentLineId",
    "itemId",
    "offerGroupList",
    "orderType",
    "accountInfo",
    "retailLocationId"
})
public class PurchaseDeviceInfoType {

    @XmlSchemaType(name = "integer")
    protected Integer equipmentLineId;
    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected OfferGroupListType offerGroupList;
    protected String orderType;
    @XmlElement(required = true)
    protected AccountInfoType accountInfo;
    @XmlElement(required = true)
    protected String retailLocationId;

    /**
     * Gets the value of the equipmentLineId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEquipmentLineId() {
        return equipmentLineId;
    }

    /**
     * Sets the value of the equipmentLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEquipmentLineId(Integer value) {
        this.equipmentLineId = value;
    }

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
     * Gets the value of the offerGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link OfferGroupListType }
     *     
     */
    public OfferGroupListType getOfferGroupList() {
        return offerGroupList;
    }

    /**
     * Sets the value of the offerGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferGroupListType }
     *     
     */
    public void setOfferGroupList(OfferGroupListType value) {
        this.offerGroupList = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setAccountInfo(AccountInfoType value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the retailLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailLocationId() {
        return retailLocationId;
    }

    /**
     * Sets the value of the retailLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailLocationId(String value) {
        this.retailLocationId = value;
    }

}

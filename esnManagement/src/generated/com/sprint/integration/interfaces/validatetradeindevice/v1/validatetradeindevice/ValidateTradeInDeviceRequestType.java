
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateTradeInDeviceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateTradeInDeviceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInDeviceList" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}MultiDeviceListType"/&gt;
 *         &lt;element name="purchaseDeviceList" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}PurchaseDeviceListType" minOccurs="0"/&gt;
 *         &lt;element name="salesChannelCode" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}SalesChannelCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateTradeInDeviceRequestType", propOrder = {
    "tradeInDeviceList",
    "purchaseDeviceList",
    "salesChannelCode"
})
public class ValidateTradeInDeviceRequestType {

    @XmlElement(required = true)
    protected MultiDeviceListType tradeInDeviceList;
    protected PurchaseDeviceListType purchaseDeviceList;
    protected String salesChannelCode;

    /**
     * Gets the value of the tradeInDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link MultiDeviceListType }
     *     
     */
    public MultiDeviceListType getTradeInDeviceList() {
        return tradeInDeviceList;
    }

    /**
     * Sets the value of the tradeInDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiDeviceListType }
     *     
     */
    public void setTradeInDeviceList(MultiDeviceListType value) {
        this.tradeInDeviceList = value;
    }

    /**
     * Gets the value of the purchaseDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseDeviceListType }
     *     
     */
    public PurchaseDeviceListType getPurchaseDeviceList() {
        return purchaseDeviceList;
    }

    /**
     * Sets the value of the purchaseDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseDeviceListType }
     *     
     */
    public void setPurchaseDeviceList(PurchaseDeviceListType value) {
        this.purchaseDeviceList = value;
    }

    /**
     * Gets the value of the salesChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelCode() {
        return salesChannelCode;
    }

    /**
     * Sets the value of the salesChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelCode(String value) {
        this.salesChannelCode = value;
    }

}

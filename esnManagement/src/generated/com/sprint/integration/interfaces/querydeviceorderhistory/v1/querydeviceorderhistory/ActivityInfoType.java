
package com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActivityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activityDate" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}EventDateType"/&gt;
 *         &lt;element name="orderType" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}OrderTypeCodeType"/&gt;
 *         &lt;element name="orderId" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}OrderIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="lineNumber" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}LineItemIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="customerNumber" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}CustomerIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="rmaNumber" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}RmaAuthorizationNumberType" minOccurs="0"/&gt;
 *         &lt;element name="outboundTrackingNumber" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}TrackingNumberType" minOccurs="0"/&gt;
 *         &lt;element name="unitPrice" type="{http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd}PriceAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInfoType", propOrder = {
    "activityDate",
    "orderType",
    "orderId",
    "lineNumber",
    "customerNumber",
    "rmaNumber",
    "outboundTrackingNumber",
    "unitPrice"
})
public class ActivityInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityDate;
    @XmlElement(required = true)
    protected String orderType;
    protected String orderId;
    protected Integer lineNumber;
    protected String customerNumber;
    protected String rmaNumber;
    protected String outboundTrackingNumber;
    protected BigDecimal unitPrice;

    /**
     * Gets the value of the activityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDate(XMLGregorianCalendar value) {
        this.activityDate = value;
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
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the rmaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmaNumber() {
        return rmaNumber;
    }

    /**
     * Sets the value of the rmaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmaNumber(String value) {
        this.rmaNumber = value;
    }

    /**
     * Gets the value of the outboundTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundTrackingNumber() {
        return outboundTrackingNumber;
    }

    /**
     * Sets the value of the outboundTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundTrackingNumber(String value) {
        this.outboundTrackingNumber = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

}

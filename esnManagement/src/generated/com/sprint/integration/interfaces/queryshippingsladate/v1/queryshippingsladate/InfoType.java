//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 03:12:58 PM IST 
//


package com.sprint.integration.interfaces.queryshippingsladate.v1.queryshippingsladate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="orderList" type="{http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd}OrderListType"/>
 *         &lt;element name="slaInfo" type="{http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd}SlaInfoType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoType", propOrder = {
    "orderList",
    "slaInfo"
})
public class InfoType {

    protected OrderListType orderList;
    protected SlaInfoType slaInfo;

    /**
     * Gets the value of the orderList property.
     * 
     * @return
     *     possible object is
     *     {@link OrderListType }
     *     
     */
    public OrderListType getOrderList() {
        return orderList;
    }

    /**
     * Sets the value of the orderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderListType }
     *     
     */
    public void setOrderList(OrderListType value) {
        this.orderList = value;
    }

    /**
     * Gets the value of the slaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SlaInfoType }
     *     
     */
    public SlaInfoType getSlaInfo() {
        return slaInfo;
    }

    /**
     * Sets the value of the slaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlaInfoType }
     *     
     */
    public void setSlaInfo(SlaInfoType value) {
        this.slaInfo = value;
    }

}

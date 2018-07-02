
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewAccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewAccountInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="customerTypeDesc" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}CustomerTypeCodeType"/&gt;
 *         &lt;element name="corpId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}CorporationIdentifierType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewAccountInfoType", propOrder = {
    "customerTypeDesc",
    "corpId"
})
public class NewAccountInfoType {

    protected String customerTypeDesc;
    protected String corpId;

    /**
     * Gets the value of the customerTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeDesc() {
        return customerTypeDesc;
    }

    /**
     * Sets the value of the customerTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeDesc(String value) {
        this.customerTypeDesc = value;
    }

    /**
     * Gets the value of the corpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpId() {
        return corpId;
    }

    /**
     * Sets the value of the corpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpId(String value) {
        this.corpId = value;
    }

}

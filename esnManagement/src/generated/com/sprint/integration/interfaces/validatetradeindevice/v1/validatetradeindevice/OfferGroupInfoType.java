
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferGroupInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferGroupInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offerGroupCode" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}OfferGroupCodeType"/&gt;
 *         &lt;element name="offerSaleType" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ProcurementMethodCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGroupInfoType", propOrder = {
    "offerGroupCode",
    "offerSaleType"
})
public class OfferGroupInfoType {

    @XmlElement(required = true)
    protected String offerGroupCode;
    @XmlElement(required = true)
    protected String offerSaleType;

    /**
     * Gets the value of the offerGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferGroupCode() {
        return offerGroupCode;
    }

    /**
     * Sets the value of the offerGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferGroupCode(String value) {
        this.offerGroupCode = value;
    }

    /**
     * Gets the value of the offerSaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSaleType() {
        return offerSaleType;
    }

    /**
     * Sets the value of the offerSaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSaleType(String value) {
        this.offerSaleType = value;
    }

}

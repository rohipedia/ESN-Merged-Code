//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 04:09:00 PM IST 
//


package com.sprint.integration.interfaces.queryshippingsladate.v1.queryshippingsladate;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaginationInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaginationInfoResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentBlock" type="{http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd}BlockNumberType"/>
 *         &lt;element name="totalBlocks" type="{http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd}BlockNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationInfoResponseType", propOrder = {
    "currentBlock",
    "totalBlocks"
})
public class PaginationInfoResponseType {

    @XmlElement(required = true)
    protected BigInteger currentBlock;
    protected BigInteger totalBlocks;

    /**
     * Gets the value of the currentBlock property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentBlock() {
        return currentBlock;
    }

    /**
     * Sets the value of the currentBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentBlock(BigInteger value) {
        this.currentBlock = value;
    }

    /**
     * Gets the value of the totalBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBlocks() {
        return totalBlocks;
    }

    /**
     * Sets the value of the totalBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBlocks(BigInteger value) {
        this.totalBlocks = value;
    }

}

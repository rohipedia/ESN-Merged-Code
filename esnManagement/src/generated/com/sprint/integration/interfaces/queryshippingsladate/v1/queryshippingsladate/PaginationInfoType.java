//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 03:12:58 PM IST 
//


package com.sprint.integration.interfaces.queryshippingsladate.v1.queryshippingsladate;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaginationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaginationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockNumber" type="{http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd}BlockNumberType"/>
 *         &lt;element name="blockSize" type="{http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd}BlockSizeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationInfoType", propOrder = {
    "blockNumber",
    "blockSize"
})
public class PaginationInfoType {

    @XmlElement(required = true)
    protected BigInteger blockNumber;
    protected BigInteger blockSize;

    /**
     * Gets the value of the blockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlockNumber() {
        return blockNumber;
    }

    /**
     * Sets the value of the blockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlockNumber(BigInteger value) {
        this.blockNumber = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlockSize(BigInteger value) {
        this.blockSize = value;
    }

}

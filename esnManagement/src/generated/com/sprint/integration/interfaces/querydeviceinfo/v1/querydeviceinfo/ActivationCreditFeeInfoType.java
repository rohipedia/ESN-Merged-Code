//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 04:09:00 PM IST 
//


package com.sprint.integration.interfaces.querydeviceinfo.v1.querydeviceinfo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationCreditFeeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivationCreditFeeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subBrand" type="{http://integration.sprint.com/interfaces/queryDeviceInfo/v1/queryDeviceInfo.xsd}SubBrandCodeType" minOccurs="0"/>
 *         &lt;element name="activationCredit" type="{http://integration.sprint.com/interfaces/queryDeviceInfo/v1/queryDeviceInfo.xsd}CreditedAmountType" minOccurs="0"/>
 *         &lt;element name="reactivationFee" type="{http://integration.sprint.com/interfaces/queryDeviceInfo/v1/queryDeviceInfo.xsd}ChargeAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationCreditFeeInfoType", propOrder = {
    "subBrand",
    "activationCredit",
    "reactivationFee"
})
public class ActivationCreditFeeInfoType {

    protected String subBrand;
    protected BigInteger activationCredit;
    protected BigInteger reactivationFee;

    /**
     * Gets the value of the subBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBrand() {
        return subBrand;
    }

    /**
     * Sets the value of the subBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBrand(String value) {
        this.subBrand = value;
    }

    /**
     * Gets the value of the activationCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActivationCredit() {
        return activationCredit;
    }

    /**
     * Sets the value of the activationCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActivationCredit(BigInteger value) {
        this.activationCredit = value;
    }

    /**
     * Gets the value of the reactivationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReactivationFee() {
        return reactivationFee;
    }

    /**
     * Sets the value of the reactivationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReactivationFee(BigInteger value) {
        this.reactivationFee = value;
    }

}

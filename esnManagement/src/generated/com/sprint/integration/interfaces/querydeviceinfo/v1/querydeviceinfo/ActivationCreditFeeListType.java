//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 04:09:00 PM IST 
//


package com.sprint.integration.interfaces.querydeviceinfo.v1.querydeviceinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationCreditFeeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivationCreditFeeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activationCreditFeeInfo" type="{http://integration.sprint.com/interfaces/queryDeviceInfo/v1/queryDeviceInfo.xsd}ActivationCreditFeeInfoType" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationCreditFeeListType", propOrder = {
    "activationCreditFeeInfo"
})
public class ActivationCreditFeeListType {

    @XmlElement(required = true)
    protected List<ActivationCreditFeeInfoType> activationCreditFeeInfo;

    /**
     * Gets the value of the activationCreditFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activationCreditFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivationCreditFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivationCreditFeeInfoType }
     * 
     * 
     */
    public List<ActivationCreditFeeInfoType> getActivationCreditFeeInfo() {
        if (activationCreditFeeInfo == null) {
            activationCreditFeeInfo = new ArrayList<ActivationCreditFeeInfoType>();
        }
        return this.activationCreditFeeInfo;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 04:09:00 PM IST 
//


package com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceProcurementCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceProcurementCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceProcurementCodeType")
@XmlEnum
public enum DeviceProcurementCodeType {

    S,
    O;

    public String value() {
        return name();
    }

    public static DeviceProcurementCodeType fromValue(String v) {
        return valueOf(v);
    }

}

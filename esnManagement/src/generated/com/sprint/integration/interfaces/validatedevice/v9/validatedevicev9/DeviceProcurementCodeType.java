
package com.sprint.integration.interfaces.validatedevice.v9.validatedevicev9;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceProcurementCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceProcurementCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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

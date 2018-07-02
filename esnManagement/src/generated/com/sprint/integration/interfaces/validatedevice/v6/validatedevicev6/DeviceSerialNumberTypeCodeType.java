
package com.sprint.integration.interfaces.validatedevice.v6.validatedevicev6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceSerialNumberTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceSerialNumberTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceSerialNumberTypeCodeType")
@XmlEnum
public enum DeviceSerialNumberTypeCodeType {

    E,
    A,
    U;

    public String value() {
        return name();
    }

    public static DeviceSerialNumberTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}


package com.sprint.integration.interfaces.querydeviceresourceinfo.v2.querydeviceresourceinfov2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceActivationStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceActivationStatusCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceActivationStatusCodeType")
@XmlEnum
public enum DeviceActivationStatusCodeType {

    E,
    D,
    L,
    F,
    P;

    public String value() {
        return name();
    }

    public static DeviceActivationStatusCodeType fromValue(String v) {
        return valueOf(v);
    }

}

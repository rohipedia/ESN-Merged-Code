
package com.sprint.integration.interfaces.querydevicelist.v1.querydevicelist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceTransceiverTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceTransceiverTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceTransceiverTypeCodeType")
@XmlEnum
public enum DeviceTransceiverTypeCodeType {

    U,
    C;

    public String value() {
        return name();
    }

    public static DeviceTransceiverTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}

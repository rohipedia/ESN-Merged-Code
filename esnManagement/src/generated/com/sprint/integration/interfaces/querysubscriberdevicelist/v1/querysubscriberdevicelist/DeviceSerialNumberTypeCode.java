
package com.sprint.integration.interfaces.querysubscriberdevicelist.v1.querysubscriberdevicelist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceSerialNumberTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceSerialNumberTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceSerialNumberTypeCode")
@XmlEnum
public enum DeviceSerialNumberTypeCode {


    /**
     * IMEI
     * 
     */
    I,

    /**
     * MEID
     * 
     */
    M,

    /**
     * SIM
     * 
     */
    S,

    /**
     * Kit
     * 
     */
    K,

    /**
     * ESN
     * 
     */
    E,
    A,
    U;

    public String value() {
        return name();
    }

    public static DeviceSerialNumberTypeCode fromValue(String v) {
        return valueOf(v);
    }

}

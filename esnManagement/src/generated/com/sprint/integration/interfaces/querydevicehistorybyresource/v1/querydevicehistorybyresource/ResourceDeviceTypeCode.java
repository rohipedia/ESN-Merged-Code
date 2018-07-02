
package com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceDeviceTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceDeviceTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceDeviceTypeCode")
@XmlEnum
public enum ResourceDeviceTypeCode {


    /**
     * ESN
     * 
     */
    E,

    /**
     * MSN
     * 
     */
    M,

    /**
     * IMEI
     * 
     */
    I,
    A;

    public String value() {
        return name();
    }

    public static ResourceDeviceTypeCode fromValue(String v) {
        return valueOf(v);
    }

}

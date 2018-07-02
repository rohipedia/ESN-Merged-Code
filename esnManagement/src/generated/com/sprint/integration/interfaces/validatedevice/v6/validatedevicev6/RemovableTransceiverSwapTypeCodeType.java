
package com.sprint.integration.interfaces.validatedevice.v6.validatedevicev6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemovableTransceiverSwapTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemovableTransceiverSwapTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="3"/&gt;
 *     &lt;enumeration value="ESN"/&gt;
 *     &lt;enumeration value="ICC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RemovableTransceiverSwapTypeCodeType")
@XmlEnum
public enum RemovableTransceiverSwapTypeCodeType {

    ESN,
    ICC;

    public String value() {
        return name();
    }

    public static RemovableTransceiverSwapTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}

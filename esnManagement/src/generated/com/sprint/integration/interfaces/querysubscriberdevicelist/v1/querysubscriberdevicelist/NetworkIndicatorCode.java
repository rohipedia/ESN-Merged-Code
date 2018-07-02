
package com.sprint.integration.interfaces.querysubscriberdevicelist.v1.querysubscriberdevicelist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkIndicatorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkIndicatorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkIndicatorCode")
@XmlEnum
public enum NetworkIndicatorCode {

    I,
    C;

    public String value() {
        return name();
    }

    public static NetworkIndicatorCode fromValue(String v) {
        return valueOf(v);
    }

}

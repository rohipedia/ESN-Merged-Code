//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 04:09:00 PM IST 
//


package com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidateDeviceV11_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v11/validateDeviceV11.xsd", "validateDeviceV11");
    private final static QName _ValidateDeviceV11Response_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v11/validateDeviceV11.xsd", "validateDeviceV11Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateDeviceV11ResponseType }
     * 
     */
    public ValidateDeviceV11ResponseType createValidateDeviceV11ResponseType() {
        return new ValidateDeviceV11ResponseType();
    }

    /**
     * Create an instance of {@link ValidateDeviceV11RequestType }
     * 
     */
    public ValidateDeviceV11RequestType createValidateDeviceV11RequestType() {
        return new ValidateDeviceV11RequestType();
    }

    /**
     * Create an instance of {@link DeviceDetailInfoType }
     * 
     */
    public DeviceDetailInfoType createDeviceDetailInfoType() {
        return new DeviceDetailInfoType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV11RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v11/validateDeviceV11.xsd", name = "validateDeviceV11")
    public JAXBElement<ValidateDeviceV11RequestType> createValidateDeviceV11(ValidateDeviceV11RequestType value) {
        return new JAXBElement<ValidateDeviceV11RequestType>(_ValidateDeviceV11_QNAME, ValidateDeviceV11RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV11ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v11/validateDeviceV11.xsd", name = "validateDeviceV11Response")
    public JAXBElement<ValidateDeviceV11ResponseType> createValidateDeviceV11Response(ValidateDeviceV11ResponseType value) {
        return new JAXBElement<ValidateDeviceV11ResponseType>(_ValidateDeviceV11Response_QNAME, ValidateDeviceV11ResponseType.class, null, value);
    }

}

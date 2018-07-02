//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 04:09:00 PM IST 
//


package com.sprint.integration.interfaces.validatedevice.v10.validatedevicev10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validatedevice.v10.validatedevicev10 package. 
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

    private final static QName _ValidateDeviceV10_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v10/validateDeviceV10.xsd", "validateDeviceV10");
    private final static QName _ValidateDeviceV10Response_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v10/validateDeviceV10.xsd", "validateDeviceV10Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validatedevice.v10.validatedevicev10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateDeviceV10RequestType }
     * 
     */
    public ValidateDeviceV10RequestType createValidateDeviceV10RequestType() {
        return new ValidateDeviceV10RequestType();
    }

    /**
     * Create an instance of {@link ValidateDeviceV10ResponseType }
     * 
     */
    public ValidateDeviceV10ResponseType createValidateDeviceV10ResponseType() {
        return new ValidateDeviceV10ResponseType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV10RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v10/validateDeviceV10.xsd", name = "validateDeviceV10")
    public JAXBElement<ValidateDeviceV10RequestType> createValidateDeviceV10(ValidateDeviceV10RequestType value) {
        return new JAXBElement<ValidateDeviceV10RequestType>(_ValidateDeviceV10_QNAME, ValidateDeviceV10RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV10ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v10/validateDeviceV10.xsd", name = "validateDeviceV10Response")
    public JAXBElement<ValidateDeviceV10ResponseType> createValidateDeviceV10Response(ValidateDeviceV10ResponseType value) {
        return new JAXBElement<ValidateDeviceV10ResponseType>(_ValidateDeviceV10Response_QNAME, ValidateDeviceV10ResponseType.class, null, value);
    }

}

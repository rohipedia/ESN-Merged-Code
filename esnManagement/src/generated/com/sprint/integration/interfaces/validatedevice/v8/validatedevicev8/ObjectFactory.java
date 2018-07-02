
package com.sprint.integration.interfaces.validatedevice.v8.validatedevicev8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validatedevice.v8.validatedevicev8 package. 
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

    private final static QName _ValidateDeviceV8_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd", "validateDeviceV8");
    private final static QName _ValidateDeviceV8Response_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd", "validateDeviceV8Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validatedevice.v8.validatedevicev8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateDeviceV8RequestType }
     * 
     */
    public ValidateDeviceV8RequestType createValidateDeviceV8RequestType() {
        return new ValidateDeviceV8RequestType();
    }

    /**
     * Create an instance of {@link ValidateDeviceV8ResponseType }
     * 
     */
    public ValidateDeviceV8ResponseType createValidateDeviceV8ResponseType() {
        return new ValidateDeviceV8ResponseType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link DeviceDetailInfoType }
     * 
     */
    public DeviceDetailInfoType createDeviceDetailInfoType() {
        return new DeviceDetailInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV8RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd", name = "validateDeviceV8")
    public JAXBElement<ValidateDeviceV8RequestType> createValidateDeviceV8(ValidateDeviceV8RequestType value) {
        return new JAXBElement<ValidateDeviceV8RequestType>(_ValidateDeviceV8_QNAME, ValidateDeviceV8RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV8ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v8/validateDeviceV8.xsd", name = "validateDeviceV8Response")
    public JAXBElement<ValidateDeviceV8ResponseType> createValidateDeviceV8Response(ValidateDeviceV8ResponseType value) {
        return new JAXBElement<ValidateDeviceV8ResponseType>(_ValidateDeviceV8Response_QNAME, ValidateDeviceV8ResponseType.class, null, value);
    }

}


package com.sprint.integration.interfaces.validatedevice.v9.validatedevicev9;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validatedevice.v9.validatedevicev9 package. 
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

    private final static QName _ValidateDeviceV9_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v9/validateDeviceV9.xsd", "validateDeviceV9");
    private final static QName _ValidateDeviceV9Response_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v9/validateDeviceV9.xsd", "validateDeviceV9Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validatedevice.v9.validatedevicev9
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateDeviceV9RequestType }
     * 
     */
    public ValidateDeviceV9RequestType createValidateDeviceV9RequestType() {
        return new ValidateDeviceV9RequestType();
    }

    /**
     * Create an instance of {@link ValidateDeviceV9ResponseType }
     * 
     */
    public ValidateDeviceV9ResponseType createValidateDeviceV9ResponseType() {
        return new ValidateDeviceV9ResponseType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV9RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v9/validateDeviceV9.xsd", name = "validateDeviceV9")
    public JAXBElement<ValidateDeviceV9RequestType> createValidateDeviceV9(ValidateDeviceV9RequestType value) {
        return new JAXBElement<ValidateDeviceV9RequestType>(_ValidateDeviceV9_QNAME, ValidateDeviceV9RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV9ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v9/validateDeviceV9.xsd", name = "validateDeviceV9Response")
    public JAXBElement<ValidateDeviceV9ResponseType> createValidateDeviceV9Response(ValidateDeviceV9ResponseType value) {
        return new JAXBElement<ValidateDeviceV9ResponseType>(_ValidateDeviceV9Response_QNAME, ValidateDeviceV9ResponseType.class, null, value);
    }

}

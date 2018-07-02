
package com.sprint.integration.interfaces.validatedevice.v7.validatedevicev7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validatedevice.v7.validatedevicev7 package. 
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

    private final static QName _ValidateDeviceV7_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v7/validateDeviceV7.xsd", "validateDeviceV7");
    private final static QName _ValidateDeviceV7Response_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v7/validateDeviceV7.xsd", "validateDeviceV7Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validatedevice.v7.validatedevicev7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateDeviceV7RequestType }
     * 
     */
    public ValidateDeviceV7RequestType createValidateDeviceV7RequestType() {
        return new ValidateDeviceV7RequestType();
    }

    /**
     * Create an instance of {@link ValidateDeviceV7ResponseType }
     * 
     */
    public ValidateDeviceV7ResponseType createValidateDeviceV7ResponseType() {
        return new ValidateDeviceV7ResponseType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV7RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v7/validateDeviceV7.xsd", name = "validateDeviceV7")
    public JAXBElement<ValidateDeviceV7RequestType> createValidateDeviceV7(ValidateDeviceV7RequestType value) {
        return new JAXBElement<ValidateDeviceV7RequestType>(_ValidateDeviceV7_QNAME, ValidateDeviceV7RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV7ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v7/validateDeviceV7.xsd", name = "validateDeviceV7Response")
    public JAXBElement<ValidateDeviceV7ResponseType> createValidateDeviceV7Response(ValidateDeviceV7ResponseType value) {
        return new JAXBElement<ValidateDeviceV7ResponseType>(_ValidateDeviceV7Response_QNAME, ValidateDeviceV7ResponseType.class, null, value);
    }

}

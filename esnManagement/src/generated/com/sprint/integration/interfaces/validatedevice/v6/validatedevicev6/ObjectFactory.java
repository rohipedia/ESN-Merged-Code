
package com.sprint.integration.interfaces.validatedevice.v6.validatedevicev6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validatedevice.v6.validatedevicev6 package. 
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

    private final static QName _ValidateDeviceV6_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v6/validateDeviceV6.xsd", "validateDeviceV6");
    private final static QName _ValidateDeviceV6Response_QNAME = new QName("http://integration.sprint.com/interfaces/validateDevice/v6/validateDeviceV6.xsd", "validateDeviceV6Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validatedevice.v6.validatedevicev6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateDeviceV6RequestType }
     * 
     */
    public ValidateDeviceV6RequestType createValidateDeviceV6RequestType() {
        return new ValidateDeviceV6RequestType();
    }

    /**
     * Create an instance of {@link ValidateDeviceV6ResponseType }
     * 
     */
    public ValidateDeviceV6ResponseType createValidateDeviceV6ResponseType() {
        return new ValidateDeviceV6ResponseType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV6RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v6/validateDeviceV6.xsd", name = "validateDeviceV6")
    public JAXBElement<ValidateDeviceV6RequestType> createValidateDeviceV6(ValidateDeviceV6RequestType value) {
        return new JAXBElement<ValidateDeviceV6RequestType>(_ValidateDeviceV6_QNAME, ValidateDeviceV6RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeviceV6ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateDevice/v6/validateDeviceV6.xsd", name = "validateDeviceV6Response")
    public JAXBElement<ValidateDeviceV6ResponseType> createValidateDeviceV6Response(ValidateDeviceV6ResponseType value) {
        return new JAXBElement<ValidateDeviceV6ResponseType>(_ValidateDeviceV6Response_QNAME, ValidateDeviceV6ResponseType.class, null, value);
    }

}

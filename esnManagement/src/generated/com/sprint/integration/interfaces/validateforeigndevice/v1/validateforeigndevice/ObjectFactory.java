
package com.sprint.integration.interfaces.validateforeigndevice.v1.validateforeigndevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validateforeigndevice.v1.validateforeigndevice package. 
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

    private final static QName _ValidateForeignDevice_QNAME = new QName("http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd", "validateForeignDevice");
    private final static QName _ValidateForeignDeviceResponse_QNAME = new QName("http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd", "validateForeignDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validateforeigndevice.v1.validateforeigndevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateForeignDeviceRequestType }
     * 
     */
    public ValidateForeignDeviceRequestType createValidateForeignDeviceRequestType() {
        return new ValidateForeignDeviceRequestType();
    }

    /**
     * Create an instance of {@link ValidateForeignDeviceResponseType }
     * 
     */
    public ValidateForeignDeviceResponseType createValidateForeignDeviceResponseType() {
        return new ValidateForeignDeviceResponseType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateForeignDeviceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd", name = "validateForeignDevice")
    public JAXBElement<ValidateForeignDeviceRequestType> createValidateForeignDevice(ValidateForeignDeviceRequestType value) {
        return new JAXBElement<ValidateForeignDeviceRequestType>(_ValidateForeignDevice_QNAME, ValidateForeignDeviceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateForeignDeviceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateForeignDevice/v1/validateForeignDevice.xsd", name = "validateForeignDeviceResponse")
    public JAXBElement<ValidateForeignDeviceResponseType> createValidateForeignDeviceResponse(ValidateForeignDeviceResponseType value) {
        return new JAXBElement<ValidateForeignDeviceResponseType>(_ValidateForeignDeviceResponse_QNAME, ValidateForeignDeviceResponseType.class, null, value);
    }

}

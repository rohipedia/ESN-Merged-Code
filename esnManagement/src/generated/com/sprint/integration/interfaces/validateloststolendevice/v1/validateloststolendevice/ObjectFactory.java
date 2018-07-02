
package com.sprint.integration.interfaces.validateloststolendevice.v1.validateloststolendevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validateloststolendevice.v1.validateloststolendevice package. 
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

    private final static QName _ValidateLostStolenDevice_QNAME = new QName("http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd", "validateLostStolenDevice");
    private final static QName _ValidateLostStolenDeviceResponse_QNAME = new QName("http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd", "validateLostStolenDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validateloststolendevice.v1.validateloststolendevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateLostStolenDeviceRequestType }
     * 
     */
    public ValidateLostStolenDeviceRequestType createValidateLostStolenDeviceRequestType() {
        return new ValidateLostStolenDeviceRequestType();
    }

    /**
     * Create an instance of {@link ValidateLostStolenDeviceResponseType }
     * 
     */
    public ValidateLostStolenDeviceResponseType createValidateLostStolenDeviceResponseType() {
        return new ValidateLostStolenDeviceResponseType();
    }

    /**
     * Create an instance of {@link CategoryListType }
     * 
     */
    public CategoryListType createCategoryListType() {
        return new CategoryListType();
    }

    /**
     * Create an instance of {@link CategoryInfoType }
     * 
     */
    public CategoryInfoType createCategoryInfoType() {
        return new CategoryInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateLostStolenDeviceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd", name = "validateLostStolenDevice")
    public JAXBElement<ValidateLostStolenDeviceRequestType> createValidateLostStolenDevice(ValidateLostStolenDeviceRequestType value) {
        return new JAXBElement<ValidateLostStolenDeviceRequestType>(_ValidateLostStolenDevice_QNAME, ValidateLostStolenDeviceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateLostStolenDeviceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd", name = "validateLostStolenDeviceResponse")
    public JAXBElement<ValidateLostStolenDeviceResponseType> createValidateLostStolenDeviceResponse(ValidateLostStolenDeviceResponseType value) {
        return new JAXBElement<ValidateLostStolenDeviceResponseType>(_ValidateLostStolenDeviceResponse_QNAME, ValidateLostStolenDeviceResponseType.class, null, value);
    }

}

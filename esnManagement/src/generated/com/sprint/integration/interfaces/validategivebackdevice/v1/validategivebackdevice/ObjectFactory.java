
package com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice package. 
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

    private final static QName _ValidateGiveBackDevice_QNAME = new QName("http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd", "validateGiveBackDevice");
    private final static QName _ValidateGiveBackDeviceResponse_QNAME = new QName("http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd", "validateGiveBackDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateGiveBackDeviceRequestType }
     * 
     */
    public ValidateGiveBackDeviceRequestType createValidateGiveBackDeviceRequestType() {
        return new ValidateGiveBackDeviceRequestType();
    }

    /**
     * Create an instance of {@link ValidateGiveBackDeviceResponseType }
     * 
     */
    public ValidateGiveBackDeviceResponseType createValidateGiveBackDeviceResponseType() {
        return new ValidateGiveBackDeviceResponseType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link LeaseGiveBackInfoType }
     * 
     */
    public LeaseGiveBackInfoType createLeaseGiveBackInfoType() {
        return new LeaseGiveBackInfoType();
    }

    /**
     * Create an instance of {@link LeaseInfoType }
     * 
     */
    public LeaseInfoType createLeaseInfoType() {
        return new LeaseInfoType();
    }

    /**
     * Create an instance of {@link SubscriberInfoType }
     * 
     */
    public SubscriberInfoType createSubscriberInfoType() {
        return new SubscriberInfoType();
    }

    /**
     * Create an instance of {@link TaxInfoType }
     * 
     */
    public TaxInfoType createTaxInfoType() {
        return new TaxInfoType();
    }

    /**
     * Create an instance of {@link TaxErrorListType }
     * 
     */
    public TaxErrorListType createTaxErrorListType() {
        return new TaxErrorListType();
    }

    /**
     * Create an instance of {@link TaxErrorInfoType }
     * 
     */
    public TaxErrorInfoType createTaxErrorInfoType() {
        return new TaxErrorInfoType();
    }

    /**
     * Create an instance of {@link ValidateGiveBackCheckStatusListType }
     * 
     */
    public ValidateGiveBackCheckStatusListType createValidateGiveBackCheckStatusListType() {
        return new ValidateGiveBackCheckStatusListType();
    }

    /**
     * Create an instance of {@link ValidateGiveBackCheckStatusInfoType }
     * 
     */
    public ValidateGiveBackCheckStatusInfoType createValidateGiveBackCheckStatusInfoType() {
        return new ValidateGiveBackCheckStatusInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateGiveBackDeviceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd", name = "validateGiveBackDevice")
    public JAXBElement<ValidateGiveBackDeviceRequestType> createValidateGiveBackDevice(ValidateGiveBackDeviceRequestType value) {
        return new JAXBElement<ValidateGiveBackDeviceRequestType>(_ValidateGiveBackDevice_QNAME, ValidateGiveBackDeviceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateGiveBackDeviceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd", name = "validateGiveBackDeviceResponse")
    public JAXBElement<ValidateGiveBackDeviceResponseType> createValidateGiveBackDeviceResponse(ValidateGiveBackDeviceResponseType value) {
        return new JAXBElement<ValidateGiveBackDeviceResponseType>(_ValidateGiveBackDeviceResponse_QNAME, ValidateGiveBackDeviceResponseType.class, null, value);
    }

}

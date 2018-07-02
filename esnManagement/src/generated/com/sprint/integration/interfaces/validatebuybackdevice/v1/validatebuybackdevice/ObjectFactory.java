
package com.sprint.integration.interfaces.validatebuybackdevice.v1.validatebuybackdevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validatebuybackdevice.v1.validatebuybackdevice package. 
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

    private final static QName _ValidateBuybackDevice_QNAME = new QName("http://integration.sprint.com/interfaces/validateBuybackDevice/v1/validateBuybackDevice.xsd", "validateBuybackDevice");
    private final static QName _ValidateBuybackDeviceResponse_QNAME = new QName("http://integration.sprint.com/interfaces/validateBuybackDevice/v1/validateBuybackDevice.xsd", "validateBuybackDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validatebuybackdevice.v1.validatebuybackdevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CategoryListType }
     * 
     */
    public CategoryListType createCategoryListType() {
        return new CategoryListType();
    }

    /**
     * Create an instance of {@link ValidateBuybackDeviceRequestType }
     * 
     */
    public ValidateBuybackDeviceRequestType createValidateBuybackDeviceRequestType() {
        return new ValidateBuybackDeviceRequestType();
    }

    /**
     * Create an instance of {@link ValidateBuybackDeviceResponseType }
     * 
     */
    public ValidateBuybackDeviceResponseType createValidateBuybackDeviceResponseType() {
        return new ValidateBuybackDeviceResponseType();
    }

    /**
     * Create an instance of {@link CategoryInfoType }
     * 
     */
    public CategoryInfoType createCategoryInfoType() {
        return new CategoryInfoType();
    }

    /**
     * Create an instance of {@link CategoryListType.CategoryInfo }
     * 
     */
    public CategoryListType.CategoryInfo createCategoryListTypeCategoryInfo() {
        return new CategoryListType.CategoryInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateBuybackDeviceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateBuybackDevice/v1/validateBuybackDevice.xsd", name = "validateBuybackDevice")
    public JAXBElement<ValidateBuybackDeviceRequestType> createValidateBuybackDevice(ValidateBuybackDeviceRequestType value) {
        return new JAXBElement<ValidateBuybackDeviceRequestType>(_ValidateBuybackDevice_QNAME, ValidateBuybackDeviceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateBuybackDeviceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateBuybackDevice/v1/validateBuybackDevice.xsd", name = "validateBuybackDeviceResponse")
    public JAXBElement<ValidateBuybackDeviceResponseType> createValidateBuybackDeviceResponse(ValidateBuybackDeviceResponseType value) {
        return new JAXBElement<ValidateBuybackDeviceResponseType>(_ValidateBuybackDeviceResponse_QNAME, ValidateBuybackDeviceResponseType.class, null, value);
    }

}

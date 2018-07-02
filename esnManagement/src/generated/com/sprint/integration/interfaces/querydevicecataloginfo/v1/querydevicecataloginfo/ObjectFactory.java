
package com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo package. 
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

    private final static QName _QueryDeviceCatalogInfo_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd", "queryDeviceCatalogInfo");
    private final static QName _QueryDeviceCatalogInfoResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd", "queryDeviceCatalogInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeviceCatalogInfoRequestType }
     * 
     */
    public QueryDeviceCatalogInfoRequestType createQueryDeviceCatalogInfoRequestType() {
        return new QueryDeviceCatalogInfoRequestType();
    }

    /**
     * Create an instance of {@link QueryDeviceCatalogInfoResponseType }
     * 
     */
    public QueryDeviceCatalogInfoResponseType createQueryDeviceCatalogInfoResponseType() {
        return new QueryDeviceCatalogInfoResponseType();
    }

    /**
     * Create an instance of {@link DeviceFrequencyListType }
     * 
     */
    public DeviceFrequencyListType createDeviceFrequencyListType() {
        return new DeviceFrequencyListType();
    }

    /**
     * Create an instance of {@link DeviceFrequencyInfoType }
     * 
     */
    public DeviceFrequencyInfoType createDeviceFrequencyInfoType() {
        return new DeviceFrequencyInfoType();
    }

    /**
     * Create an instance of {@link DeviceCapabilityListType }
     * 
     */
    public DeviceCapabilityListType createDeviceCapabilityListType() {
        return new DeviceCapabilityListType();
    }

    /**
     * Create an instance of {@link DeviceCapabilityInfoType }
     * 
     */
    public DeviceCapabilityInfoType createDeviceCapabilityInfoType() {
        return new DeviceCapabilityInfoType();
    }

    /**
     * Create an instance of {@link PropertyListType }
     * 
     */
    public PropertyListType createPropertyListType() {
        return new PropertyListType();
    }

    /**
     * Create an instance of {@link PropertyInfoType }
     * 
     */
    public PropertyInfoType createPropertyInfoType() {
        return new PropertyInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceCatalogInfoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd", name = "queryDeviceCatalogInfo")
    public JAXBElement<QueryDeviceCatalogInfoRequestType> createQueryDeviceCatalogInfo(QueryDeviceCatalogInfoRequestType value) {
        return new JAXBElement<QueryDeviceCatalogInfoRequestType>(_QueryDeviceCatalogInfo_QNAME, QueryDeviceCatalogInfoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceCatalogInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd", name = "queryDeviceCatalogInfoResponse")
    public JAXBElement<QueryDeviceCatalogInfoResponseType> createQueryDeviceCatalogInfoResponse(QueryDeviceCatalogInfoResponseType value) {
        return new JAXBElement<QueryDeviceCatalogInfoResponseType>(_QueryDeviceCatalogInfoResponse_QNAME, QueryDeviceCatalogInfoResponseType.class, null, value);
    }

}

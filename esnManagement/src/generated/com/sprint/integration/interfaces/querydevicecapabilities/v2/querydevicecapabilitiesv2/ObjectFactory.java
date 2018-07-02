
package com.sprint.integration.interfaces.querydevicecapabilities.v2.querydevicecapabilitiesv2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querydevicecapabilities.v2.querydevicecapabilitiesv2 package. 
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

    private final static QName _QueryDeviceCapabilitiesV2_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd", "queryDeviceCapabilitiesV2");
    private final static QName _QueryDeviceCapabilitiesV2Response_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd", "queryDeviceCapabilitiesV2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querydevicecapabilities.v2.querydevicecapabilitiesv2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeviceCapabilitiesV2Type }
     * 
     */
    public QueryDeviceCapabilitiesV2Type createQueryDeviceCapabilitiesV2Type() {
        return new QueryDeviceCapabilitiesV2Type();
    }

    /**
     * Create an instance of {@link QueryDeviceCapabilitiesV2ResponseType }
     * 
     */
    public QueryDeviceCapabilitiesV2ResponseType createQueryDeviceCapabilitiesV2ResponseType() {
        return new QueryDeviceCapabilitiesV2ResponseType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link DeviceCharacteristicsType }
     * 
     */
    public DeviceCharacteristicsType createDeviceCharacteristicsType() {
        return new DeviceCharacteristicsType();
    }

    /**
     * Create an instance of {@link DeviceCharacteristicsListType }
     * 
     */
    public DeviceCharacteristicsListType createDeviceCharacteristicsListType() {
        return new DeviceCharacteristicsListType();
    }

    /**
     * Create an instance of {@link DeviceCharacteristicsInfoType }
     * 
     */
    public DeviceCharacteristicsInfoType createDeviceCharacteristicsInfoType() {
        return new DeviceCharacteristicsInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceCapabilitiesV2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd", name = "queryDeviceCapabilitiesV2")
    public JAXBElement<QueryDeviceCapabilitiesV2Type> createQueryDeviceCapabilitiesV2(QueryDeviceCapabilitiesV2Type value) {
        return new JAXBElement<QueryDeviceCapabilitiesV2Type>(_QueryDeviceCapabilitiesV2_QNAME, QueryDeviceCapabilitiesV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceCapabilitiesV2ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceCapabilities/v2/queryDeviceCapabilitiesV2.xsd", name = "queryDeviceCapabilitiesV2Response")
    public JAXBElement<QueryDeviceCapabilitiesV2ResponseType> createQueryDeviceCapabilitiesV2Response(QueryDeviceCapabilitiesV2ResponseType value) {
        return new JAXBElement<QueryDeviceCapabilitiesV2ResponseType>(_QueryDeviceCapabilitiesV2Response_QNAME, QueryDeviceCapabilitiesV2ResponseType.class, null, value);
    }

}

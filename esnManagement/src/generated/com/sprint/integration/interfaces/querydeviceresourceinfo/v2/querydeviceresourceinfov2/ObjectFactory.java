
package com.sprint.integration.interfaces.querydeviceresourceinfo.v2.querydeviceresourceinfov2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querydeviceresourceinfo.v2.querydeviceresourceinfov2 package. 
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

    private final static QName _QueryDeviceResourceInfoV2_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd", "queryDeviceResourceInfoV2");
    private final static QName _QueryDeviceResourceInfoV2Response_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd", "queryDeviceResourceInfoV2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querydeviceresourceinfo.v2.querydeviceresourceinfov2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeviceResourceInfoV2Type }
     * 
     */
    public QueryDeviceResourceInfoV2Type createQueryDeviceResourceInfoV2Type() {
        return new QueryDeviceResourceInfoV2Type();
    }

    /**
     * Create an instance of {@link QueryDeviceResourceInfoV2ResponseType }
     * 
     */
    public QueryDeviceResourceInfoV2ResponseType createQueryDeviceResourceInfoV2ResponseType() {
        return new QueryDeviceResourceInfoV2ResponseType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link MdnInfoType }
     * 
     */
    public MdnInfoType createMdnInfoType() {
        return new MdnInfoType();
    }

    /**
     * Create an instance of {@link NaiInfoRequestType }
     * 
     */
    public NaiInfoRequestType createNaiInfoRequestType() {
        return new NaiInfoRequestType();
    }

    /**
     * Create an instance of {@link NaiInfoType }
     * 
     */
    public NaiInfoType createNaiInfoType() {
        return new NaiInfoType();
    }

    /**
     * Create an instance of {@link SearchCriteriaType }
     * 
     */
    public SearchCriteriaType createSearchCriteriaType() {
        return new SearchCriteriaType();
    }

    /**
     * Create an instance of {@link UiccInfoType }
     * 
     */
    public UiccInfoType createUiccInfoType() {
        return new UiccInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceResourceInfoV2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd", name = "queryDeviceResourceInfoV2")
    public JAXBElement<QueryDeviceResourceInfoV2Type> createQueryDeviceResourceInfoV2(QueryDeviceResourceInfoV2Type value) {
        return new JAXBElement<QueryDeviceResourceInfoV2Type>(_QueryDeviceResourceInfoV2_QNAME, QueryDeviceResourceInfoV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceResourceInfoV2ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v2/queryDeviceResourceInfoV2.xsd", name = "queryDeviceResourceInfoV2Response")
    public JAXBElement<QueryDeviceResourceInfoV2ResponseType> createQueryDeviceResourceInfoV2Response(QueryDeviceResourceInfoV2ResponseType value) {
        return new JAXBElement<QueryDeviceResourceInfoV2ResponseType>(_QueryDeviceResourceInfoV2Response_QNAME, QueryDeviceResourceInfoV2ResponseType.class, null, value);
    }

}

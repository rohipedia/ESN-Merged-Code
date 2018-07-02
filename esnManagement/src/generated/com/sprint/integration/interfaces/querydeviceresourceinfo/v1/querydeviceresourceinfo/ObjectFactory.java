
package com.sprint.integration.interfaces.querydeviceresourceinfo.v1.querydeviceresourceinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querydeviceresourceinfo.v1.querydeviceresourceinfo package. 
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

    private final static QName _QueryDeviceResourceInfo_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd", "queryDeviceResourceInfo");
    private final static QName _QueryDeviceResourceInfoResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd", "queryDeviceResourceInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querydeviceresourceinfo.v1.querydeviceresourceinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeviceResourceInfoType }
     * 
     */
    public QueryDeviceResourceInfoType createQueryDeviceResourceInfoType() {
        return new QueryDeviceResourceInfoType();
    }

    /**
     * Create an instance of {@link QueryDeviceResourceInfoResponseType }
     * 
     */
    public QueryDeviceResourceInfoResponseType createQueryDeviceResourceInfoResponseType() {
        return new QueryDeviceResourceInfoResponseType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceResourceInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd", name = "queryDeviceResourceInfo")
    public JAXBElement<QueryDeviceResourceInfoType> createQueryDeviceResourceInfo(QueryDeviceResourceInfoType value) {
        return new JAXBElement<QueryDeviceResourceInfoType>(_QueryDeviceResourceInfo_QNAME, QueryDeviceResourceInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceResourceInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceResourceInfo/v1/queryDeviceResourceInfo.xsd", name = "queryDeviceResourceInfoResponse")
    public JAXBElement<QueryDeviceResourceInfoResponseType> createQueryDeviceResourceInfoResponse(QueryDeviceResourceInfoResponseType value) {
        return new JAXBElement<QueryDeviceResourceInfoResponseType>(_QueryDeviceResourceInfoResponse_QNAME, QueryDeviceResourceInfoResponseType.class, null, value);
    }

}

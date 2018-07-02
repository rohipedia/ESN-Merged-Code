
package com.sprint.integration.interfaces.querydevicelist.v1.querydevicelist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querydevicelist.v1.querydevicelist package. 
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

    private final static QName _QueryDeviceList_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd", "queryDeviceList");
    private final static QName _QueryDeviceListResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd", "queryDeviceListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querydevicelist.v1.querydevicelist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeviceListRequestType }
     * 
     */
    public QueryDeviceListRequestType createQueryDeviceListRequestType() {
        return new QueryDeviceListRequestType();
    }

    /**
     * Create an instance of {@link QueryDeviceListResponseType }
     * 
     */
    public QueryDeviceListResponseType createQueryDeviceListResponseType() {
        return new QueryDeviceListResponseType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link DeviceListType }
     * 
     */
    public DeviceListType createDeviceListType() {
        return new DeviceListType();
    }

    /**
     * Create an instance of {@link DeviceType }
     * 
     */
    public DeviceType createDeviceType() {
        return new DeviceType();
    }

    /**
     * Create an instance of {@link NameInfoType }
     * 
     */
    public NameInfoType createNameInfoType() {
        return new NameInfoType();
    }

    /**
     * Create an instance of {@link SearchCriteriaType }
     * 
     */
    public SearchCriteriaType createSearchCriteriaType() {
        return new SearchCriteriaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd", name = "queryDeviceList")
    public JAXBElement<QueryDeviceListRequestType> createQueryDeviceList(QueryDeviceListRequestType value) {
        return new JAXBElement<QueryDeviceListRequestType>(_QueryDeviceList_QNAME, QueryDeviceListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd", name = "queryDeviceListResponse")
    public JAXBElement<QueryDeviceListResponseType> createQueryDeviceListResponse(QueryDeviceListResponseType value) {
        return new JAXBElement<QueryDeviceListResponseType>(_QueryDeviceListResponse_QNAME, QueryDeviceListResponseType.class, null, value);
    }

}


package com.sprint.integration.interfaces.querysubscriberdevicelist.v1.querysubscriberdevicelist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querysubscriberdevicelist.v1.querysubscriberdevicelist package. 
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

    private final static QName _QuerySubscriberDeviceList_QNAME = new QName("http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd", "querySubscriberDeviceList");
    private final static QName _QuerySubscriberDeviceListResponse_QNAME = new QName("http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd", "querySubscriberDeviceListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querysubscriberdevicelist.v1.querysubscriberdevicelist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuerySubscriberDeviceList }
     * 
     */
    public QuerySubscriberDeviceList createQuerySubscriberDeviceList() {
        return new QuerySubscriberDeviceList();
    }

    /**
     * Create an instance of {@link QuerySubscriberDeviceListResponse }
     * 
     */
    public QuerySubscriberDeviceListResponse createQuerySubscriberDeviceListResponse() {
        return new QuerySubscriberDeviceListResponse();
    }

    /**
     * Create an instance of {@link DeviceList }
     * 
     */
    public DeviceList createDeviceList() {
        return new DeviceList();
    }

    /**
     * Create an instance of {@link DeviceInfo }
     * 
     */
    public DeviceInfo createDeviceInfo() {
        return new DeviceInfo();
    }

    /**
     * Create an instance of {@link SearchCriteria }
     * 
     */
    public SearchCriteria createSearchCriteria() {
        return new SearchCriteria();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySubscriberDeviceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd", name = "querySubscriberDeviceList")
    public JAXBElement<QuerySubscriberDeviceList> createQuerySubscriberDeviceList(QuerySubscriberDeviceList value) {
        return new JAXBElement<QuerySubscriberDeviceList>(_QuerySubscriberDeviceList_QNAME, QuerySubscriberDeviceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySubscriberDeviceListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/querySubscriberDeviceList/v1/querySubscriberDeviceList.xsd", name = "querySubscriberDeviceListResponse")
    public JAXBElement<QuerySubscriberDeviceListResponse> createQuerySubscriberDeviceListResponse(QuerySubscriberDeviceListResponse value) {
        return new JAXBElement<QuerySubscriberDeviceListResponse>(_QuerySubscriberDeviceListResponse_QNAME, QuerySubscriberDeviceListResponse.class, null, value);
    }

}


package com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource package. 
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

    private final static QName _QueryDeviceHistoryByResource_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd", "queryDeviceHistoryByResource");
    private final static QName _QueryDeviceHistoryByResourceResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd", "queryDeviceHistoryByResourceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querydevicehistorybyresource.v1.querydevicehistorybyresource
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeviceHistoryByResource }
     * 
     */
    public QueryDeviceHistoryByResource createQueryDeviceHistoryByResource() {
        return new QueryDeviceHistoryByResource();
    }

    /**
     * Create an instance of {@link QueryDeviceHistoryByResourceResponse }
     * 
     */
    public QueryDeviceHistoryByResourceResponse createQueryDeviceHistoryByResourceResponse() {
        return new QueryDeviceHistoryByResourceResponse();
    }

    /**
     * Create an instance of {@link ResourceInfo }
     * 
     */
    public ResourceInfo createResourceInfo() {
        return new ResourceInfo();
    }

    /**
     * Create an instance of {@link SubscriberInfo }
     * 
     */
    public SubscriberInfo createSubscriberInfo() {
        return new SubscriberInfo();
    }

    /**
     * Create an instance of {@link SubscriberList }
     * 
     */
    public SubscriberList createSubscriberList() {
        return new SubscriberList();
    }

    /**
     * Create an instance of {@link DeviceInfo }
     * 
     */
    public DeviceInfo createDeviceInfo() {
        return new DeviceInfo();
    }

    /**
     * Create an instance of {@link DeviceList }
     * 
     */
    public DeviceList createDeviceList() {
        return new DeviceList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceHistoryByResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd", name = "queryDeviceHistoryByResource")
    public JAXBElement<QueryDeviceHistoryByResource> createQueryDeviceHistoryByResource(QueryDeviceHistoryByResource value) {
        return new JAXBElement<QueryDeviceHistoryByResource>(_QueryDeviceHistoryByResource_QNAME, QueryDeviceHistoryByResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceHistoryByResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceHistoryByResource/v1/queryDeviceHistoryByResource.xsd", name = "queryDeviceHistoryByResourceResponse")
    public JAXBElement<QueryDeviceHistoryByResourceResponse> createQueryDeviceHistoryByResourceResponse(QueryDeviceHistoryByResourceResponse value) {
        return new JAXBElement<QueryDeviceHistoryByResourceResponse>(_QueryDeviceHistoryByResourceResponse_QNAME, QueryDeviceHistoryByResourceResponse.class, null, value);
    }

}


package com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory package. 
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

    private final static QName _QueryDeviceOrderHistory_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd", "queryDeviceOrderHistory");
    private final static QName _QueryDeviceOrderHistoryResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd", "queryDeviceOrderHistoryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querydeviceorderhistory.v1.querydeviceorderhistory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeviceOrderHistoryRequestType }
     * 
     */
    public QueryDeviceOrderHistoryRequestType createQueryDeviceOrderHistoryRequestType() {
        return new QueryDeviceOrderHistoryRequestType();
    }

    /**
     * Create an instance of {@link QueryDeviceOrderHistoryResponseType }
     * 
     */
    public QueryDeviceOrderHistoryResponseType createQueryDeviceOrderHistoryResponseType() {
        return new QueryDeviceOrderHistoryResponseType();
    }

    /**
     * Create an instance of {@link DeviceOrderHistoryListType }
     * 
     */
    public DeviceOrderHistoryListType createDeviceOrderHistoryListType() {
        return new DeviceOrderHistoryListType();
    }

    /**
     * Create an instance of {@link DeviceListType }
     * 
     */
    public DeviceListType createDeviceListType() {
        return new DeviceListType();
    }

    /**
     * Create an instance of {@link DeviceIdInfoType }
     * 
     */
    public DeviceIdInfoType createDeviceIdInfoType() {
        return new DeviceIdInfoType();
    }

    /**
     * Create an instance of {@link DeviceOrderHistoryInfoType }
     * 
     */
    public DeviceOrderHistoryInfoType createDeviceOrderHistoryInfoType() {
        return new DeviceOrderHistoryInfoType();
    }

    /**
     * Create an instance of {@link ActivityInfoListType }
     * 
     */
    public ActivityInfoListType createActivityInfoListType() {
        return new ActivityInfoListType();
    }

    /**
     * Create an instance of {@link ActivityInfoType }
     * 
     */
    public ActivityInfoType createActivityInfoType() {
        return new ActivityInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceOrderHistoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd", name = "queryDeviceOrderHistory")
    public JAXBElement<QueryDeviceOrderHistoryRequestType> createQueryDeviceOrderHistory(QueryDeviceOrderHistoryRequestType value) {
        return new JAXBElement<QueryDeviceOrderHistoryRequestType>(_QueryDeviceOrderHistory_QNAME, QueryDeviceOrderHistoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceOrderHistoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceOrderHistory/v1/queryDeviceOrderHistory.xsd", name = "queryDeviceOrderHistoryResponse")
    public JAXBElement<QueryDeviceOrderHistoryResponseType> createQueryDeviceOrderHistoryResponse(QueryDeviceOrderHistoryResponseType value) {
        return new JAXBElement<QueryDeviceOrderHistoryResponseType>(_QueryDeviceOrderHistoryResponse_QNAME, QueryDeviceOrderHistoryResponseType.class, null, value);
    }

}

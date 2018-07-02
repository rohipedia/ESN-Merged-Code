
package com.sprint.integration.interfaces.queryrelateditemid.v1.queryrelateditemid;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.queryrelateditemid.v1.queryrelateditemid package. 
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

    private final static QName _QueryRelatedItemId_QNAME = new QName("http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd", "queryRelatedItemId");
    private final static QName _QueryRelatedItemIdResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd", "queryRelatedItemIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.queryrelateditemid.v1.queryrelateditemid
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryRelatedItemIdRequestType }
     * 
     */
    public QueryRelatedItemIdRequestType createQueryRelatedItemIdRequestType() {
        return new QueryRelatedItemIdRequestType();
    }

    /**
     * Create an instance of {@link QueryRelatedItemIdResponseType }
     * 
     */
    public QueryRelatedItemIdResponseType createQueryRelatedItemIdResponseType() {
        return new QueryRelatedItemIdResponseType();
    }

    /**
     * Create an instance of {@link DeviceListType }
     * 
     */
    public DeviceListType createDeviceListType() {
        return new DeviceListType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link DeviceListResponseType }
     * 
     */
    public DeviceListResponseType createDeviceListResponseType() {
        return new DeviceListResponseType();
    }

    /**
     * Create an instance of {@link DeviceInfoResponseType }
     * 
     */
    public DeviceInfoResponseType createDeviceInfoResponseType() {
        return new DeviceInfoResponseType();
    }

    /**
     * Create an instance of {@link ErrorMessageInfoType }
     * 
     */
    public ErrorMessageInfoType createErrorMessageInfoType() {
        return new ErrorMessageInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRelatedItemIdRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd", name = "queryRelatedItemId")
    public JAXBElement<QueryRelatedItemIdRequestType> createQueryRelatedItemId(QueryRelatedItemIdRequestType value) {
        return new JAXBElement<QueryRelatedItemIdRequestType>(_QueryRelatedItemId_QNAME, QueryRelatedItemIdRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRelatedItemIdResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd", name = "queryRelatedItemIdResponse")
    public JAXBElement<QueryRelatedItemIdResponseType> createQueryRelatedItemIdResponse(QueryRelatedItemIdResponseType value) {
        return new JAXBElement<QueryRelatedItemIdResponseType>(_QueryRelatedItemIdResponse_QNAME, QueryRelatedItemIdResponseType.class, null, value);
    }

}

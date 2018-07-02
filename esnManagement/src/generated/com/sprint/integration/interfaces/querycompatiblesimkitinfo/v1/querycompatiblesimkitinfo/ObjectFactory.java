
package com.sprint.integration.interfaces.querycompatiblesimkitinfo.v1.querycompatiblesimkitinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querycompatiblesimkitinfo.v1.querycompatiblesimkitinfo package. 
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

    private final static QName _QueryCompatibleSimKitInfo_QNAME = new QName("http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd", "queryCompatibleSimKitInfo");
    private final static QName _QueryCompatibleSimKitInfoResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd", "queryCompatibleSimKitInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querycompatiblesimkitinfo.v1.querycompatiblesimkitinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryCompatibleSimKitInfoRequestType }
     * 
     */
    public QueryCompatibleSimKitInfoRequestType createQueryCompatibleSimKitInfoRequestType() {
        return new QueryCompatibleSimKitInfoRequestType();
    }

    /**
     * Create an instance of {@link QueryCompatibleSimKitInfoResponseType }
     * 
     */
    public QueryCompatibleSimKitInfoResponseType createQueryCompatibleSimKitInfoResponseType() {
        return new QueryCompatibleSimKitInfoResponseType();
    }

    /**
     * Create an instance of {@link SimKitInfoType }
     * 
     */
    public SimKitInfoType createSimKitInfoType() {
        return new SimKitInfoType();
    }

    /**
     * Create an instance of {@link SimKitListType }
     * 
     */
    public SimKitListType createSimKitListType() {
        return new SimKitListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCompatibleSimKitInfoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd", name = "queryCompatibleSimKitInfo")
    public JAXBElement<QueryCompatibleSimKitInfoRequestType> createQueryCompatibleSimKitInfo(QueryCompatibleSimKitInfoRequestType value) {
        return new JAXBElement<QueryCompatibleSimKitInfoRequestType>(_QueryCompatibleSimKitInfo_QNAME, QueryCompatibleSimKitInfoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCompatibleSimKitInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd", name = "queryCompatibleSimKitInfoResponse")
    public JAXBElement<QueryCompatibleSimKitInfoResponseType> createQueryCompatibleSimKitInfoResponse(QueryCompatibleSimKitInfoResponseType value) {
        return new JAXBElement<QueryCompatibleSimKitInfoResponseType>(_QueryCompatibleSimKitInfoResponse_QNAME, QueryCompatibleSimKitInfoResponseType.class, null, value);
    }

}

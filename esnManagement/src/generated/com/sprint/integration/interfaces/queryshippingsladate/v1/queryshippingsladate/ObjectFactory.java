//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 04:09:00 PM IST 
//


package com.sprint.integration.interfaces.queryshippingsladate.v1.queryshippingsladate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.queryshippingsladate.v1.queryshippingsladate package. 
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

    private final static QName _QueryShippingSlaDateResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd", "queryShippingSlaDateResponse");
    private final static QName _QueryShippingSlaDate_QNAME = new QName("http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd", "queryShippingSlaDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.queryshippingsladate.v1.queryshippingsladate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryShippingSlaDateResponseType }
     * 
     */
    public QueryShippingSlaDateResponseType createQueryShippingSlaDateResponseType() {
        return new QueryShippingSlaDateResponseType();
    }

    /**
     * Create an instance of {@link QueryShippingSlaDateRequestType }
     * 
     */
    public QueryShippingSlaDateRequestType createQueryShippingSlaDateRequestType() {
        return new QueryShippingSlaDateRequestType();
    }

    /**
     * Create an instance of {@link SlaListResponseType }
     * 
     */
    public SlaListResponseType createSlaListResponseType() {
        return new SlaListResponseType();
    }

    /**
     * Create an instance of {@link SlaDateInfoType }
     * 
     */
    public SlaDateInfoType createSlaDateInfoType() {
        return new SlaDateInfoType();
    }

    /**
     * Create an instance of {@link SlaInfoResponseType }
     * 
     */
    public SlaInfoResponseType createSlaInfoResponseType() {
        return new SlaInfoResponseType();
    }

    /**
     * Create an instance of {@link ErrorInfoType }
     * 
     */
    public ErrorInfoType createErrorInfoType() {
        return new ErrorInfoType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link OrderInfoType }
     * 
     */
    public OrderInfoType createOrderInfoType() {
        return new OrderInfoType();
    }

    /**
     * Create an instance of {@link OrderListType }
     * 
     */
    public OrderListType createOrderListType() {
        return new OrderListType();
    }

    /**
     * Create an instance of {@link OrderDateRangeType }
     * 
     */
    public OrderDateRangeType createOrderDateRangeType() {
        return new OrderDateRangeType();
    }

    /**
     * Create an instance of {@link PaginationInfoResponseType }
     * 
     */
    public PaginationInfoResponseType createPaginationInfoResponseType() {
        return new PaginationInfoResponseType();
    }

    /**
     * Create an instance of {@link PaginationInfoType }
     * 
     */
    public PaginationInfoType createPaginationInfoType() {
        return new PaginationInfoType();
    }

    /**
     * Create an instance of {@link SlaInfoType }
     * 
     */
    public SlaInfoType createSlaInfoType() {
        return new SlaInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryShippingSlaDateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd", name = "queryShippingSlaDateResponse")
    public JAXBElement<QueryShippingSlaDateResponseType> createQueryShippingSlaDateResponse(QueryShippingSlaDateResponseType value) {
        return new JAXBElement<QueryShippingSlaDateResponseType>(_QueryShippingSlaDateResponse_QNAME, QueryShippingSlaDateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryShippingSlaDateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryShippingSlaDate/v1/queryShippingSlaDate.xsd", name = "queryShippingSlaDate")
    public JAXBElement<QueryShippingSlaDateRequestType> createQueryShippingSlaDate(QueryShippingSlaDateRequestType value) {
        return new JAXBElement<QueryShippingSlaDateRequestType>(_QueryShippingSlaDate_QNAME, QueryShippingSlaDateRequestType.class, null, value);
    }

}

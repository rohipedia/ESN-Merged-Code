
package com.sprint.integration.interfaces.querydevicediagnosticsinfo.v1.querydevicediagnosticsinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querydevicediagnosticsinfo.v1.querydevicediagnosticsinfo package. 
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

    private final static QName _QueryDeviceDiagnosticsInfo_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd", "queryDeviceDiagnosticsInfo");
    private final static QName _QueryDeviceDiagnosticsInfoResponse_QNAME = new QName("http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd", "queryDeviceDiagnosticsInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querydevicediagnosticsinfo.v1.querydevicediagnosticsinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeviceDiagnosticsInfoRequestType }
     * 
     */
    public QueryDeviceDiagnosticsInfoRequestType createQueryDeviceDiagnosticsInfoRequestType() {
        return new QueryDeviceDiagnosticsInfoRequestType();
    }

    /**
     * Create an instance of {@link QueryDeviceDiagnosticsInfoResponseType }
     * 
     */
    public QueryDeviceDiagnosticsInfoResponseType createQueryDeviceDiagnosticsInfoResponseType() {
        return new QueryDeviceDiagnosticsInfoResponseType();
    }

    /**
     * Create an instance of {@link QuestionListType }
     * 
     */
    public QuestionListType createQuestionListType() {
        return new QuestionListType();
    }

    /**
     * Create an instance of {@link QuestionInfoType }
     * 
     */
    public QuestionInfoType createQuestionInfoType() {
        return new QuestionInfoType();
    }

    /**
     * Create an instance of {@link TestResultListType }
     * 
     */
    public TestResultListType createTestResultListType() {
        return new TestResultListType();
    }

    /**
     * Create an instance of {@link TestResultInfoType }
     * 
     */
    public TestResultInfoType createTestResultInfoType() {
        return new TestResultInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceDiagnosticsInfoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd", name = "queryDeviceDiagnosticsInfo")
    public JAXBElement<QueryDeviceDiagnosticsInfoRequestType> createQueryDeviceDiagnosticsInfo(QueryDeviceDiagnosticsInfoRequestType value) {
        return new JAXBElement<QueryDeviceDiagnosticsInfoRequestType>(_QueryDeviceDiagnosticsInfo_QNAME, QueryDeviceDiagnosticsInfoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceDiagnosticsInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd", name = "queryDeviceDiagnosticsInfoResponse")
    public JAXBElement<QueryDeviceDiagnosticsInfoResponseType> createQueryDeviceDiagnosticsInfoResponse(QueryDeviceDiagnosticsInfoResponseType value) {
        return new JAXBElement<QueryDeviceDiagnosticsInfoResponseType>(_QueryDeviceDiagnosticsInfoResponse_QNAME, QueryDeviceDiagnosticsInfoResponseType.class, null, value);
    }

}

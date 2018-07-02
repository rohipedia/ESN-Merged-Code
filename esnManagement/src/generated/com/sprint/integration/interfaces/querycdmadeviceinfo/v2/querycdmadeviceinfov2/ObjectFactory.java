
package com.sprint.integration.interfaces.querycdmadeviceinfo.v2.querycdmadeviceinfov2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.querycdmadeviceinfo.v2.querycdmadeviceinfov2 package. 
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

    private final static QName _QueryCdmaDeviceInfoV2_QNAME = new QName("http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd", "queryCdmaDeviceInfoV2");
    private final static QName _QueryCdmaDeviceInfoV2Response_QNAME = new QName("http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd", "queryCdmaDeviceInfoV2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.querycdmadeviceinfo.v2.querycdmadeviceinfov2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryCdmaDeviceInfoV2 }
     * 
     */
    public QueryCdmaDeviceInfoV2 createQueryCdmaDeviceInfoV2() {
        return new QueryCdmaDeviceInfoV2();
    }

    /**
     * Create an instance of {@link QueryCdmaDeviceInfoV2Response }
     * 
     */
    public QueryCdmaDeviceInfoV2Response createQueryCdmaDeviceInfoV2Response() {
        return new QueryCdmaDeviceInfoV2Response();
    }

    /**
     * Create an instance of {@link DeviceInfo }
     * 
     */
    public DeviceInfo createDeviceInfo() {
        return new DeviceInfo();
    }

    /**
     * Create an instance of {@link SerialNumber }
     * 
     */
    public SerialNumber createSerialNumber() {
        return new SerialNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCdmaDeviceInfoV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd", name = "queryCdmaDeviceInfoV2")
    public JAXBElement<QueryCdmaDeviceInfoV2> createQueryCdmaDeviceInfoV2(QueryCdmaDeviceInfoV2 value) {
        return new JAXBElement<QueryCdmaDeviceInfoV2>(_QueryCdmaDeviceInfoV2_QNAME, QueryCdmaDeviceInfoV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCdmaDeviceInfoV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/queryCdmaDeviceInfo/v2/queryCdmaDeviceInfoV2.xsd", name = "queryCdmaDeviceInfoV2Response")
    public JAXBElement<QueryCdmaDeviceInfoV2Response> createQueryCdmaDeviceInfoV2Response(QueryCdmaDeviceInfoV2Response value) {
        return new JAXBElement<QueryCdmaDeviceInfoV2Response>(_QueryCdmaDeviceInfoV2Response_QNAME, QueryCdmaDeviceInfoV2Response.class, null, value);
    }

}

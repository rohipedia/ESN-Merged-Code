
package com.sprint.integration.common.header.wsmessageheader.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.common.header.wsmessageheader.v2 package. 
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

    private final static QName _WsMessageHeader_QNAME = new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "wsMessageHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.common.header.wsmessageheader.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsMessageHeaderType }
     * 
     */
    public WsMessageHeaderType createWsMessageHeaderType() {
        return new WsMessageHeaderType();
    }

    /**
     * Create an instance of {@link BasicCredentialInfoType }
     * 
     */
    public BasicCredentialInfoType createBasicCredentialInfoType() {
        return new BasicCredentialInfoType();
    }

    /**
     * Create an instance of {@link LoginType }
     * 
     */
    public LoginType createLoginType() {
        return new LoginType();
    }

    /**
     * Create an instance of {@link SdcLoginCredentialsType }
     * 
     */
    public SdcLoginCredentialsType createSdcLoginCredentialsType() {
        return new SdcLoginCredentialsType();
    }

    /**
     * Create an instance of {@link SecurityMessageHeaderType }
     * 
     */
    public SecurityMessageHeaderType createSecurityMessageHeaderType() {
        return new SecurityMessageHeaderType();
    }

    /**
     * Create an instance of {@link TrackingMessageHeaderType }
     * 
     */
    public TrackingMessageHeaderType createTrackingMessageHeaderType() {
        return new TrackingMessageHeaderType();
    }

    /**
     * Create an instance of {@link TaxIdCredentialsType }
     * 
     */
    public TaxIdCredentialsType createTaxIdCredentialsType() {
        return new TaxIdCredentialsType();
    }

    /**
     * Create an instance of {@link WsMessageHeaderType.CallingApplicationInfo }
     * 
     */
    public WsMessageHeaderType.CallingApplicationInfo createWsMessageHeaderTypeCallingApplicationInfo() {
        return new WsMessageHeaderType.CallingApplicationInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsMessageHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/common/header/WSMessageHeader/v2", name = "wsMessageHeader")
    public JAXBElement<WsMessageHeaderType> createWsMessageHeader(WsMessageHeaderType value) {
        return new JAXBElement<WsMessageHeaderType>(_WsMessageHeader_QNAME, WsMessageHeaderType.class, null, value);
    }

}

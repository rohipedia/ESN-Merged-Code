package com.spcs.retailservices.base;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2018-05-22T13:16:44.919+05:30
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "RmsService", 
                  wsdlLocation = "#{@rmsServiceWsdlLocationPropertyValue}",
                  targetNamespace = "http://com/spcs/retailservices/base") 
public class RmsService extends Service {
	private static String rmsServiceWsdlLocationFieldValue;
    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://com/spcs/retailservices/base", "RmsService");
    public final static QName RmsServicePort = new QName("http://com/spcs/retailservices/base", "RmsServicePort");
    static {
        URL url = null;
        try {
        	rmsServiceWsdlLocationFieldValue = new File(".").getCanonicalPath()+"\\src\\main\\resources\\wsdl\\RmsService.wsdl";
            url = new URL(rmsServiceWsdlLocationFieldValue);
        } catch (IOException e) {
            java.util.logging.Logger.getLogger(RmsService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", rmsServiceWsdlLocationFieldValue);
        }
        WSDL_LOCATION = url;
    }

    public RmsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RmsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RmsService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public RmsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RmsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RmsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns RmsServicePortType
     */
    @WebEndpoint(name = "RmsServicePort")
    public RmsServicePortType getRmsServicePort() {
        return super.getPort(RmsServicePort, RmsServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RmsServicePortType
     */
    @WebEndpoint(name = "RmsServicePort")
    public RmsServicePortType getRmsServicePort(WebServiceFeature... features) {
        return super.getPort(RmsServicePort, RmsServicePortType.class, features);
    }

}

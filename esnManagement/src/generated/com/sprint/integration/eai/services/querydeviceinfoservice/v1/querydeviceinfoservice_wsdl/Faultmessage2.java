
package com.sprint.integration.eai.services.querydeviceinfoservice.v1.querydeviceinfoservice_wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2018-05-22T13:16:42.955+05:30
 * Generated source version: 3.1.7
 */

@WebFault(name = "errorDetailItem", targetNamespace = "http://integration.sprint.com/common/ErrorDetailsV2.xsd")
public class Faultmessage2 extends Exception {
    
    private com.sprint.integration.common.errordetailsv2.ErrorDetailsType errorDetailItem;

    public Faultmessage2() {
        super();
    }
    
    public Faultmessage2(String message) {
        super(message);
    }
    
    public Faultmessage2(String message, Throwable cause) {
        super(message, cause);
    }

    public Faultmessage2(String message, com.sprint.integration.common.errordetailsv2.ErrorDetailsType errorDetailItem) {
        super(message);
        this.errorDetailItem = errorDetailItem;
    }

    public Faultmessage2(String message, com.sprint.integration.common.errordetailsv2.ErrorDetailsType errorDetailItem, Throwable cause) {
        super(message, cause);
        this.errorDetailItem = errorDetailItem;
    }

    public com.sprint.integration.common.errordetailsv2.ErrorDetailsType getFaultInfo() {
        return this.errorDetailItem;
    }
}

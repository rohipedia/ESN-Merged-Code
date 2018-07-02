
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRetrieveCustomerIdentifierRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRetrieveCustomerIdentifierRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerInfo" type="{java:com.spcs.retailservices.domain}CustIdentifierCustomerInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRetrieveCustomerIdentifierRequest", propOrder = {
    "customerInfo"
})
public class CreateRetrieveCustomerIdentifierRequest
    extends Request
{

    @XmlElement(required = true)
    protected CustIdentifierCustomerInfo customerInfo;

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdentifierCustomerInfo }
     *     
     */
    public CustIdentifierCustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdentifierCustomerInfo }
     *     
     */
    public void setCustomerInfo(CustIdentifierCustomerInfo value) {
        this.customerInfo = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendApiXmlToRmsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendApiXmlToRmsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="apiXmlList" type="{java:com.spcs.retailservices.domain}ApiXmlList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendApiXmlToRmsRequest", propOrder = {
    "transactionNumber",
    "apiXmlList"
})
public class SendApiXmlToRmsRequest
    extends Request
{

    protected long transactionNumber;
    @XmlElement(required = true)
    protected ApiXmlList apiXmlList;

    /**
     * Gets the value of the transactionNumber property.
     * 
     */
    public long getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     */
    public void setTransactionNumber(long value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the apiXmlList property.
     * 
     * @return
     *     possible object is
     *     {@link ApiXmlList }
     *     
     */
    public ApiXmlList getApiXmlList() {
        return apiXmlList;
    }

    /**
     * Sets the value of the apiXmlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiXmlList }
     *     
     */
    public void setApiXmlList(ApiXmlList value) {
        this.apiXmlList = value;
    }

}

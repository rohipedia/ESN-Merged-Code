
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOrderFromRmsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOrderFromRmsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RMSOrderNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOrderFromRmsRequest", propOrder = {
    "rmsOrderNo"
})
public class QueryOrderFromRmsRequest
    extends Request
{

    @XmlElement(name = "RMSOrderNo")
    protected int rmsOrderNo;

    /**
     * Gets the value of the rmsOrderNo property.
     * 
     */
    public int getRMSOrderNo() {
        return rmsOrderNo;
    }

    /**
     * Sets the value of the rmsOrderNo property.
     * 
     */
    public void setRMSOrderNo(int value) {
        this.rmsOrderNo = value;
    }

}

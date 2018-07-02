
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransactionDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransactionDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="returnValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransactionDataResponse", propOrder = {
    "transactionNumber",
    "returnValue"
})
public class UpdateTransactionDataResponse
    extends Response
{

    protected long transactionNumber;
    protected int returnValue;

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
     * Gets the value of the returnValue property.
     * 
     */
    public int getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     */
    public void setReturnValue(int value) {
        this.returnValue = value;
    }

}

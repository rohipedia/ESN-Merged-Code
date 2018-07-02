
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOriginalSaleTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOriginalSaleTransactionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sourceStore" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetStore" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOriginalSaleTransactionRequest", propOrder = {
    "transactionNumber",
    "sourceStore",
    "targetStore"
})
public class QueryOriginalSaleTransactionRequest
    extends Request
{

    protected long transactionNumber;
    @XmlElement(required = true)
    protected String sourceStore;
    @XmlElement(required = true)
    protected String targetStore;

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
     * Gets the value of the sourceStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceStore() {
        return sourceStore;
    }

    /**
     * Sets the value of the sourceStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceStore(String value) {
        this.sourceStore = value;
    }

    /**
     * Gets the value of the targetStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetStore() {
        return targetStore;
    }

    /**
     * Sets the value of the targetStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetStore(String value) {
        this.targetStore = value;
    }

}

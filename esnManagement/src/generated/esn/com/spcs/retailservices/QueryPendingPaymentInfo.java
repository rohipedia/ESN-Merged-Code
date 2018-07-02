
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPendingPaymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPendingPaymentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PendingPaymentNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QueryPendingCustomerInfo" type="{java:com.spcs.retailservices.domain}QueryPendingCustomerInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPendingPaymentInfo", propOrder = {
    "pendingPaymentNo",
    "totalAmount",
    "queryPendingCustomerInfo"
})
public class QueryPendingPaymentInfo {

    @XmlElement(name = "PendingPaymentNo")
    protected int pendingPaymentNo;
    @XmlElement(name = "TotalAmount")
    protected int totalAmount;
    @XmlElement(name = "QueryPendingCustomerInfo", required = true)
    protected QueryPendingCustomerInfo queryPendingCustomerInfo;

    /**
     * Gets the value of the pendingPaymentNo property.
     * 
     */
    public int getPendingPaymentNo() {
        return pendingPaymentNo;
    }

    /**
     * Sets the value of the pendingPaymentNo property.
     * 
     */
    public void setPendingPaymentNo(int value) {
        this.pendingPaymentNo = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public int getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(int value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the queryPendingCustomerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPendingCustomerInfo }
     *     
     */
    public QueryPendingCustomerInfo getQueryPendingCustomerInfo() {
        return queryPendingCustomerInfo;
    }

    /**
     * Sets the value of the queryPendingCustomerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPendingCustomerInfo }
     *     
     */
    public void setQueryPendingCustomerInfo(QueryPendingCustomerInfo value) {
        this.queryPendingCustomerInfo = value;
    }

}

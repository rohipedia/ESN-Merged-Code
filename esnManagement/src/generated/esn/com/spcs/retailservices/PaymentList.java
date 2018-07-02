
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryPendingPaymentInfo" type="{java:com.spcs.retailservices.domain}QueryPendingPaymentInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentList", propOrder = {
    "queryPendingPaymentInfo"
})
public class PaymentList {

    @XmlElement(name = "QueryPendingPaymentInfo", required = true)
    protected List<QueryPendingPaymentInfo> queryPendingPaymentInfo;

    /**
     * Gets the value of the queryPendingPaymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryPendingPaymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryPendingPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPendingPaymentInfo }
     * 
     * 
     */
    public List<QueryPendingPaymentInfo> getQueryPendingPaymentInfo() {
        if (queryPendingPaymentInfo == null) {
            queryPendingPaymentInfo = new ArrayList<QueryPendingPaymentInfo>();
        }
        return this.queryPendingPaymentInfo;
    }

}

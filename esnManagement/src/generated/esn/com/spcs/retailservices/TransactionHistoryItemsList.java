
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionHistoryItemsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionHistoryItemsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionHistoryItemInfo" type="{java:com.spcs.retailservices.domain}TransactionHistoryItemInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionHistoryItemsList", propOrder = {
    "transactionHistoryItemInfo"
})
public class TransactionHistoryItemsList {

    @XmlElement(required = true)
    protected List<TransactionHistoryItemInfo> transactionHistoryItemInfo;

    /**
     * Gets the value of the transactionHistoryItemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionHistoryItemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionHistoryItemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionHistoryItemInfo }
     * 
     * 
     */
    public List<TransactionHistoryItemInfo> getTransactionHistoryItemInfo() {
        if (transactionHistoryItemInfo == null) {
            transactionHistoryItemInfo = new ArrayList<TransactionHistoryItemInfo>();
        }
        return this.transactionHistoryItemInfo;
    }

}

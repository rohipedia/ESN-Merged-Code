
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionAddOnDetailsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionAddOnDetailsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionAddOnDetailsInfo" type="{java:com.spcs.retailservices.domain}TransactionAddOnDetailsInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAddOnDetailsList", propOrder = {
    "transactionAddOnDetailsInfo"
})
public class TransactionAddOnDetailsList {

    protected List<TransactionAddOnDetailsInfo> transactionAddOnDetailsInfo;

    /**
     * Gets the value of the transactionAddOnDetailsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionAddOnDetailsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionAddOnDetailsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionAddOnDetailsInfo }
     * 
     * 
     */
    public List<TransactionAddOnDetailsInfo> getTransactionAddOnDetailsInfo() {
        if (transactionAddOnDetailsInfo == null) {
            transactionAddOnDetailsInfo = new ArrayList<TransactionAddOnDetailsInfo>();
        }
        return this.transactionAddOnDetailsInfo;
    }

}


package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDiscountRetList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDiscountRetList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionDiscountRetInfo" type="{java:com.spcs.retailservices.domain}TransactionDiscountRetInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDiscountRetList", propOrder = {
    "transactionDiscountRetInfo"
})
public class TransactionDiscountRetList {

    @XmlElement(required = true)
    protected List<TransactionDiscountRetInfo> transactionDiscountRetInfo;

    /**
     * Gets the value of the transactionDiscountRetInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionDiscountRetInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionDiscountRetInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionDiscountRetInfo }
     * 
     * 
     */
    public List<TransactionDiscountRetInfo> getTransactionDiscountRetInfo() {
        if (transactionDiscountRetInfo == null) {
            transactionDiscountRetInfo = new ArrayList<TransactionDiscountRetInfo>();
        }
        return this.transactionDiscountRetInfo;
    }

}

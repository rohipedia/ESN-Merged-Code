
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractInfoEIB" type="{java:com.spcs.retailservices.domain}ContractInfoEIB" maxOccurs="unbounded"/&gt;
 *         &lt;element name="transactionReferenceInfo" type="{java:com.spcs.retailservices.domain}TransactionReferenceInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentInfoList", propOrder = {
    "contractInfoEIB",
    "transactionReferenceInfo"
})
public class ConsentInfoList {

    @XmlElement(required = true)
    protected List<ContractInfoEIB> contractInfoEIB;
    protected TransactionReferenceInfo transactionReferenceInfo;

    /**
     * Gets the value of the contractInfoEIB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractInfoEIB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractInfoEIB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractInfoEIB }
     * 
     * 
     */
    public List<ContractInfoEIB> getContractInfoEIB() {
        if (contractInfoEIB == null) {
            contractInfoEIB = new ArrayList<ContractInfoEIB>();
        }
        return this.contractInfoEIB;
    }

    /**
     * Gets the value of the transactionReferenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferenceInfo }
     *     
     */
    public TransactionReferenceInfo getTransactionReferenceInfo() {
        return transactionReferenceInfo;
    }

    /**
     * Sets the value of the transactionReferenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferenceInfo }
     *     
     */
    public void setTransactionReferenceInfo(TransactionReferenceInfo value) {
        this.transactionReferenceInfo = value;
    }

}

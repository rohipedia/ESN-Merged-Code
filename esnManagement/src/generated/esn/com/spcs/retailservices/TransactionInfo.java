
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transctionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transctionDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="storeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fastOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionItemsList" type="{java:com.spcs.retailservices.domain}TransactionHistoryItemsList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInfo", propOrder = {
    "transctionNumber",
    "transctionDateTime",
    "ban",
    "storeName",
    "firstName",
    "lastName",
    "fastOrderNumber",
    "transactionItemsList"
})
public class TransactionInfo {

    protected int transctionNumber;
    @XmlElement(required = true)
    protected String transctionDateTime;
    protected int ban;
    @XmlElement(required = true)
    protected String storeName;
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    protected String fastOrderNumber;
    @XmlElement(required = true)
    protected TransactionHistoryItemsList transactionItemsList;

    /**
     * Gets the value of the transctionNumber property.
     * 
     */
    public int getTransctionNumber() {
        return transctionNumber;
    }

    /**
     * Sets the value of the transctionNumber property.
     * 
     */
    public void setTransctionNumber(int value) {
        this.transctionNumber = value;
    }

    /**
     * Gets the value of the transctionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransctionDateTime() {
        return transctionDateTime;
    }

    /**
     * Sets the value of the transctionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransctionDateTime(String value) {
        this.transctionDateTime = value;
    }

    /**
     * Gets the value of the ban property.
     * 
     */
    public int getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     */
    public void setBan(int value) {
        this.ban = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the fastOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastOrderNumber() {
        return fastOrderNumber;
    }

    /**
     * Sets the value of the fastOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastOrderNumber(String value) {
        this.fastOrderNumber = value;
    }

    /**
     * Gets the value of the transactionItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHistoryItemsList }
     *     
     */
    public TransactionHistoryItemsList getTransactionItemsList() {
        return transactionItemsList;
    }

    /**
     * Sets the value of the transactionItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHistoryItemsList }
     *     
     */
    public void setTransactionItemsList(TransactionHistoryItemsList value) {
        this.transactionItemsList = value;
    }

}

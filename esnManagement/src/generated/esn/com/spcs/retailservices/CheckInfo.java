
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIDNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInfo", propOrder = {
    "paymentAccountNumber",
    "customerIDType",
    "customerIDNumber"
})
public class CheckInfo {

    @XmlElement(required = true)
    protected String paymentAccountNumber;
    @XmlElement(required = true)
    protected String customerIDType;
    @XmlElement(required = true)
    protected String customerIDNumber;

    /**
     * Gets the value of the paymentAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountNumber() {
        return paymentAccountNumber;
    }

    /**
     * Sets the value of the paymentAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountNumber(String value) {
        this.paymentAccountNumber = value;
    }

    /**
     * Gets the value of the customerIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIDType() {
        return customerIDType;
    }

    /**
     * Sets the value of the customerIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIDType(String value) {
        this.customerIDType = value;
    }

    /**
     * Gets the value of the customerIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIDNumber() {
        return customerIDNumber;
    }

    /**
     * Sets the value of the customerIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIDNumber(String value) {
        this.customerIDNumber = value;
    }

}

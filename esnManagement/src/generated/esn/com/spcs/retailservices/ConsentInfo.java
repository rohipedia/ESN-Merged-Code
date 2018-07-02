
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsentNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConsentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransConsentNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerInfo" type="{java:com.spcs.retailservices.domain}CustomerInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentInfo", propOrder = {
    "consentNo",
    "consentType",
    "transConsentNo",
    "customerInfo"
})
public class ConsentInfo {

    @XmlElement(name = "ConsentNo", required = true)
    protected String consentNo;
    @XmlElement(name = "ConsentType", required = true)
    protected String consentType;
    @XmlElement(name = "TransConsentNo", required = true)
    protected String transConsentNo;
    @XmlElement(name = "CustomerInfo", required = true)
    protected List<CustomerInfo> customerInfo;

    /**
     * Gets the value of the consentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentNo() {
        return consentNo;
    }

    /**
     * Sets the value of the consentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentNo(String value) {
        this.consentNo = value;
    }

    /**
     * Gets the value of the consentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentType() {
        return consentType;
    }

    /**
     * Sets the value of the consentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentType(String value) {
        this.consentType = value;
    }

    /**
     * Gets the value of the transConsentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransConsentNo() {
        return transConsentNo;
    }

    /**
     * Sets the value of the transConsentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransConsentNo(String value) {
        this.transConsentNo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerInfo }
     * 
     * 
     */
    public List<CustomerInfo> getCustomerInfo() {
        if (customerInfo == null) {
            customerInfo = new ArrayList<CustomerInfo>();
        }
        return this.customerInfo;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransactionAddOnDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionAddOnDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceLineNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="earliestEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAddOnDetailsInfo", propOrder = {
    "serviceLineNo",
    "serviceCode",
    "earliestEffectiveDate"
})
public class TransactionAddOnDetailsInfo {

    protected int serviceLineNo;
    @XmlElement(required = true)
    protected String serviceCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestEffectiveDate;

    /**
     * Gets the value of the serviceLineNo property.
     * 
     */
    public int getServiceLineNo() {
        return serviceLineNo;
    }

    /**
     * Sets the value of the serviceLineNo property.
     * 
     */
    public void setServiceLineNo(int value) {
        this.serviceLineNo = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the earliestEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestEffectiveDate() {
        return earliestEffectiveDate;
    }

    /**
     * Sets the value of the earliestEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestEffectiveDate(XMLGregorianCalendar value) {
        this.earliestEffectiveDate = value;
    }

}

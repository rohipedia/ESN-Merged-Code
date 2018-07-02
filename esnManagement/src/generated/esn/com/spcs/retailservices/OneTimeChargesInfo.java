
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OneTimeChargesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneTimeChargesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="socCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sharedSocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="partialMonthChargeFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="partialMonthChargeToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneTimeChargesInfo", propOrder = {
    "description",
    "amount",
    "socCode",
    "sharedSocInd",
    "partialMonthChargeFromDate",
    "partialMonthChargeToDate"
})
public class OneTimeChargesInfo {

    @XmlElement(required = true)
    protected String description;
    protected double amount;
    protected String socCode;
    protected Boolean sharedSocInd;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar partialMonthChargeFromDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar partialMonthChargeToDate;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the socCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocCode() {
        return socCode;
    }

    /**
     * Sets the value of the socCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocCode(String value) {
        this.socCode = value;
    }

    /**
     * Gets the value of the sharedSocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharedSocInd() {
        return sharedSocInd;
    }

    /**
     * Sets the value of the sharedSocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharedSocInd(Boolean value) {
        this.sharedSocInd = value;
    }

    /**
     * Gets the value of the partialMonthChargeFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPartialMonthChargeFromDate() {
        return partialMonthChargeFromDate;
    }

    /**
     * Sets the value of the partialMonthChargeFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPartialMonthChargeFromDate(XMLGregorianCalendar value) {
        this.partialMonthChargeFromDate = value;
    }

    /**
     * Gets the value of the partialMonthChargeToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPartialMonthChargeToDate() {
        return partialMonthChargeToDate;
    }

    /**
     * Sets the value of the partialMonthChargeToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPartialMonthChargeToDate(XMLGregorianCalendar value) {
        this.partialMonthChargeToDate = value;
    }

}

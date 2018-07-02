
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SendIdVerificationDataToRmsCustomerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendIdVerificationDataToRmsCustomerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerNameInfo" type="{java:com.spcs.retailservices.domain}CustomerNameInfo" minOccurs="0"/&gt;
 *         &lt;element name="customerAddressInfo" type="{java:com.spcs.retailservices.domain}SendIdVerificationDataToRmsAddressInfo" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driversLiscenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dlState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dlDateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendIdVerificationDataToRmsCustomerInfo", propOrder = {
    "customerNameInfo",
    "customerAddressInfo",
    "dateOfBirth",
    "ssn",
    "driversLiscenseNumber",
    "dlState",
    "passportNumber",
    "passportCountry",
    "expirationDate",
    "dlDateOfIssue"
})
public class SendIdVerificationDataToRmsCustomerInfo {

    protected CustomerNameInfo customerNameInfo;
    protected SendIdVerificationDataToRmsAddressInfo customerAddressInfo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    protected String ssn;
    protected String driversLiscenseNumber;
    protected String dlState;
    protected String passportNumber;
    protected String passportCountry;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dlDateOfIssue;

    /**
     * Gets the value of the customerNameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameInfo }
     *     
     */
    public CustomerNameInfo getCustomerNameInfo() {
        return customerNameInfo;
    }

    /**
     * Sets the value of the customerNameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameInfo }
     *     
     */
    public void setCustomerNameInfo(CustomerNameInfo value) {
        this.customerNameInfo = value;
    }

    /**
     * Gets the value of the customerAddressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SendIdVerificationDataToRmsAddressInfo }
     *     
     */
    public SendIdVerificationDataToRmsAddressInfo getCustomerAddressInfo() {
        return customerAddressInfo;
    }

    /**
     * Sets the value of the customerAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendIdVerificationDataToRmsAddressInfo }
     *     
     */
    public void setCustomerAddressInfo(SendIdVerificationDataToRmsAddressInfo value) {
        this.customerAddressInfo = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the driversLiscenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLiscenseNumber() {
        return driversLiscenseNumber;
    }

    /**
     * Sets the value of the driversLiscenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLiscenseNumber(String value) {
        this.driversLiscenseNumber = value;
    }

    /**
     * Gets the value of the dlState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlState() {
        return dlState;
    }

    /**
     * Sets the value of the dlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlState(String value) {
        this.dlState = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportCountry() {
        return passportCountry;
    }

    /**
     * Sets the value of the passportCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportCountry(String value) {
        this.passportCountry = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the dlDateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDlDateOfIssue() {
        return dlDateOfIssue;
    }

    /**
     * Sets the value of the dlDateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDlDateOfIssue(XMLGregorianCalendar value) {
        this.dlDateOfIssue = value;
    }

}

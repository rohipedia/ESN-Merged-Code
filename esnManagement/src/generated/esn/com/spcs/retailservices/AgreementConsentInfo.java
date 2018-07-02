
package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgreementConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ptn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contractStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="contractEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="e911Required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="etfRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="etfAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementConsentInfo", propOrder = {
    "ptn",
    "deviceDescription",
    "serialNumber",
    "contractId",
    "contractStartDate",
    "contractEndDate",
    "e911Required",
    "etfRequired",
    "etfAmount"
})
public class AgreementConsentInfo {

    @XmlElement(required = true)
    protected String ptn;
    @XmlElement(required = true)
    protected String deviceDescription;
    @XmlElement(required = true)
    protected String serialNumber;
    protected int contractId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;
    protected boolean e911Required;
    protected boolean etfRequired;
    protected BigDecimal etfAmount;

    /**
     * Gets the value of the ptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtn() {
        return ptn;
    }

    /**
     * Sets the value of the ptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtn(String value) {
        this.ptn = value;
    }

    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public int getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(int value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the contractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Sets the value of the contractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDate(XMLGregorianCalendar value) {
        this.contractStartDate = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Gets the value of the e911Required property.
     * 
     */
    public boolean isE911Required() {
        return e911Required;
    }

    /**
     * Sets the value of the e911Required property.
     * 
     */
    public void setE911Required(boolean value) {
        this.e911Required = value;
    }

    /**
     * Gets the value of the etfRequired property.
     * 
     */
    public boolean isEtfRequired() {
        return etfRequired;
    }

    /**
     * Sets the value of the etfRequired property.
     * 
     */
    public void setEtfRequired(boolean value) {
        this.etfRequired = value;
    }

    /**
     * Gets the value of the etfAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEtfAmount() {
        return etfAmount;
    }

    /**
     * Sets the value of the etfAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEtfAmount(BigDecimal value) {
        this.etfAmount = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateOmimOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOmimOrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="backorderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="asiOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rmaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceExchangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appointmentConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOmimOrderInfo", propOrder = {
    "lineItemNumber",
    "backorderIndicator",
    "eticketNumber",
    "asiOrderNumber",
    "rmaNumber",
    "serviceExchangeCode",
    "appointmentConfirmationNumber"
})
public class UpdateOmimOrderInfo {

    protected int lineItemNumber;
    protected String backorderIndicator;
    protected String eticketNumber;
    protected String asiOrderNumber;
    protected String rmaNumber;
    protected String serviceExchangeCode;
    protected String appointmentConfirmationNumber;

    /**
     * Gets the value of the lineItemNumber property.
     * 
     */
    public int getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     */
    public void setLineItemNumber(int value) {
        this.lineItemNumber = value;
    }

    /**
     * Gets the value of the backorderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackorderIndicator() {
        return backorderIndicator;
    }

    /**
     * Sets the value of the backorderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackorderIndicator(String value) {
        this.backorderIndicator = value;
    }

    /**
     * Gets the value of the eticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEticketNumber() {
        return eticketNumber;
    }

    /**
     * Sets the value of the eticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEticketNumber(String value) {
        this.eticketNumber = value;
    }

    /**
     * Gets the value of the asiOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiOrderNumber() {
        return asiOrderNumber;
    }

    /**
     * Sets the value of the asiOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiOrderNumber(String value) {
        this.asiOrderNumber = value;
    }

    /**
     * Gets the value of the rmaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmaNumber() {
        return rmaNumber;
    }

    /**
     * Sets the value of the rmaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmaNumber(String value) {
        this.rmaNumber = value;
    }

    /**
     * Gets the value of the serviceExchangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceExchangeCode() {
        return serviceExchangeCode;
    }

    /**
     * Sets the value of the serviceExchangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceExchangeCode(String value) {
        this.serviceExchangeCode = value;
    }

    /**
     * Gets the value of the appointmentConfirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentConfirmationNumber() {
        return appointmentConfirmationNumber;
    }

    /**
     * Sets the value of the appointmentConfirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentConfirmationNumber(String value) {
        this.appointmentConfirmationNumber = value;
    }

}

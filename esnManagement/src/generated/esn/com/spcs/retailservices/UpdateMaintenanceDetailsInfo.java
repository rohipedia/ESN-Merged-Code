
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMaintenanceDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMaintenanceDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerMaintenanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="threeGCustomerUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="portIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="earliestEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addRemoveChangeFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMaintenanceDetailsInfo", propOrder = {
    "lineItemNumber",
    "customerMaintenanceIdentifier",
    "threeGCustomerUsername",
    "oldValue",
    "newValue",
    "mdn",
    "serialNumber",
    "portIn",
    "status",
    "earliestEffectiveDate",
    "subscriberIdentifier",
    "addRemoveChangeFlag"
})
public class UpdateMaintenanceDetailsInfo {

    protected int lineItemNumber;
    protected int customerMaintenanceIdentifier;
    protected String threeGCustomerUsername;
    protected String oldValue;
    protected String newValue;
    protected String mdn;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    protected String portIn;
    @XmlElement(name = "Status")
    protected Integer status;
    protected String earliestEffectiveDate;
    protected String subscriberIdentifier;
    @XmlElement(required = true)
    protected String addRemoveChangeFlag;

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
     * Gets the value of the customerMaintenanceIdentifier property.
     * 
     */
    public int getCustomerMaintenanceIdentifier() {
        return customerMaintenanceIdentifier;
    }

    /**
     * Sets the value of the customerMaintenanceIdentifier property.
     * 
     */
    public void setCustomerMaintenanceIdentifier(int value) {
        this.customerMaintenanceIdentifier = value;
    }

    /**
     * Gets the value of the threeGCustomerUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeGCustomerUsername() {
        return threeGCustomerUsername;
    }

    /**
     * Sets the value of the threeGCustomerUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeGCustomerUsername(String value) {
        this.threeGCustomerUsername = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdn(String value) {
        this.mdn = value;
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
     * Gets the value of the portIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortIn() {
        return portIn;
    }

    /**
     * Sets the value of the portIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortIn(String value) {
        this.portIn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the earliestEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestEffectiveDate() {
        return earliestEffectiveDate;
    }

    /**
     * Sets the value of the earliestEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestEffectiveDate(String value) {
        this.earliestEffectiveDate = value;
    }

    /**
     * Gets the value of the subscriberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberIdentifier() {
        return subscriberIdentifier;
    }

    /**
     * Sets the value of the subscriberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberIdentifier(String value) {
        this.subscriberIdentifier = value;
    }

    /**
     * Gets the value of the addRemoveChangeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddRemoveChangeFlag() {
        return addRemoveChangeFlag;
    }

    /**
     * Sets the value of the addRemoveChangeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddRemoveChangeFlag(String value) {
        this.addRemoveChangeFlag = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReleaseDsReservationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseDsReservationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservationIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="employeeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activateUpgradeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="armRebateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainingContractMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseDsReservationInfo", propOrder = {
    "reservationIdentifier",
    "employeeIdentifier",
    "serialNumber",
    "reasonCode",
    "activateUpgradeStatus",
    "armRebateIdentifier",
    "remainingContractMonths"
})
public class ReleaseDsReservationInfo {

    protected int reservationIdentifier;
    protected Integer employeeIdentifier;
    @XmlElement(required = true)
    protected String serialNumber;
    protected String reasonCode;
    @XmlElement(required = true)
    protected String activateUpgradeStatus;
    protected String armRebateIdentifier;
    protected Integer remainingContractMonths;

    /**
     * Gets the value of the reservationIdentifier property.
     * 
     */
    public int getReservationIdentifier() {
        return reservationIdentifier;
    }

    /**
     * Sets the value of the reservationIdentifier property.
     * 
     */
    public void setReservationIdentifier(int value) {
        this.reservationIdentifier = value;
    }

    /**
     * Gets the value of the employeeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    /**
     * Sets the value of the employeeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeIdentifier(Integer value) {
        this.employeeIdentifier = value;
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
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the activateUpgradeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateUpgradeStatus() {
        return activateUpgradeStatus;
    }

    /**
     * Sets the value of the activateUpgradeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateUpgradeStatus(String value) {
        this.activateUpgradeStatus = value;
    }

    /**
     * Gets the value of the armRebateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmRebateIdentifier() {
        return armRebateIdentifier;
    }

    /**
     * Sets the value of the armRebateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmRebateIdentifier(String value) {
        this.armRebateIdentifier = value;
    }

    /**
     * Gets the value of the remainingContractMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingContractMonths() {
        return remainingContractMonths;
    }

    /**
     * Sets the value of the remainingContractMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingContractMonths(Integer value) {
        this.remainingContractMonths = value;
    }

}

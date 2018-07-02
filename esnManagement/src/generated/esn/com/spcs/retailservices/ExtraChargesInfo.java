
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtraChargesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtraChargesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="todaysOnetimeDepositsCharged" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="todaysOnetimeDepositsCollected" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="todaysOnetimeEquipmentCharges" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraChargesInfo", propOrder = {
    "todaysOnetimeDepositsCharged",
    "todaysOnetimeDepositsCollected",
    "todaysOnetimeEquipmentCharges"
})
public class ExtraChargesInfo {

    protected Double todaysOnetimeDepositsCharged;
    protected Double todaysOnetimeDepositsCollected;
    protected Double todaysOnetimeEquipmentCharges;

    /**
     * Gets the value of the todaysOnetimeDepositsCharged property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTodaysOnetimeDepositsCharged() {
        return todaysOnetimeDepositsCharged;
    }

    /**
     * Sets the value of the todaysOnetimeDepositsCharged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTodaysOnetimeDepositsCharged(Double value) {
        this.todaysOnetimeDepositsCharged = value;
    }

    /**
     * Gets the value of the todaysOnetimeDepositsCollected property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTodaysOnetimeDepositsCollected() {
        return todaysOnetimeDepositsCollected;
    }

    /**
     * Sets the value of the todaysOnetimeDepositsCollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTodaysOnetimeDepositsCollected(Double value) {
        this.todaysOnetimeDepositsCollected = value;
    }

    /**
     * Gets the value of the todaysOnetimeEquipmentCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTodaysOnetimeEquipmentCharges() {
        return todaysOnetimeEquipmentCharges;
    }

    /**
     * Sets the value of the todaysOnetimeEquipmentCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTodaysOnetimeEquipmentCharges(Double value) {
        this.todaysOnetimeEquipmentCharges = value;
    }

}

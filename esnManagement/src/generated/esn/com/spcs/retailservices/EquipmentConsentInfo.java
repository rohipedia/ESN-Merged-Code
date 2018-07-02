
package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentProtection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipmentProtectionMRC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ptn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tTESOCInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tTESOCMRC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentConsentInfo", propOrder = {
    "equipmentProtection",
    "equipmentProtectionMRC",
    "ptn",
    "device",
    "serialNumber",
    "ttesocInd",
    "ttesocmrc"
})
public class EquipmentConsentInfo {

    @XmlElement(required = true)
    protected String equipmentProtection;
    @XmlElement(required = true)
    protected BigDecimal equipmentProtectionMRC;
    @XmlElement(required = true)
    protected String ptn;
    @XmlElement(required = true)
    protected String device;
    @XmlElement(required = true)
    protected String serialNumber;
    @XmlElement(name = "tTESOCInd")
    protected Boolean ttesocInd;
    @XmlElement(name = "tTESOCMRC", required = true)
    protected BigDecimal ttesocmrc;

    /**
     * Gets the value of the equipmentProtection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentProtection() {
        return equipmentProtection;
    }

    /**
     * Sets the value of the equipmentProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentProtection(String value) {
        this.equipmentProtection = value;
    }

    /**
     * Gets the value of the equipmentProtectionMRC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquipmentProtectionMRC() {
        return equipmentProtectionMRC;
    }

    /**
     * Sets the value of the equipmentProtectionMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquipmentProtectionMRC(BigDecimal value) {
        this.equipmentProtectionMRC = value;
    }

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
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
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
     * Gets the value of the ttesocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTTESOCInd() {
        return ttesocInd;
    }

    /**
     * Sets the value of the ttesocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTTESOCInd(Boolean value) {
        this.ttesocInd = value;
    }

    /**
     * Gets the value of the ttesocmrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTTESOCMRC() {
        return ttesocmrc;
    }

    /**
     * Sets the value of the ttesocmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTTESOCMRC(BigDecimal value) {
        this.ttesocmrc = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Imei" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Msn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SimSKUIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImeiInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Sim" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfo", propOrder = {
    "serialNumber",
    "imei",
    "msn",
    "simSKUIdentifier",
    "imeiInd",
    "sim"
})
public class DeviceInfo {

    @XmlElement(name = "SerialNumber", required = true, nillable = true)
    protected String serialNumber;
    @XmlElement(name = "Imei", required = true, nillable = true)
    protected String imei;
    @XmlElement(name = "Msn", required = true, nillable = true)
    protected String msn;
    @XmlElement(name = "SimSKUIdentifier", required = true, nillable = true)
    protected String simSKUIdentifier;
    @XmlElement(name = "ImeiInd")
    protected boolean imeiInd;
    @XmlElement(name = "Sim", required = true, nillable = true)
    protected String sim;

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
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the msn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsn() {
        return msn;
    }

    /**
     * Sets the value of the msn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsn(String value) {
        this.msn = value;
    }

    /**
     * Gets the value of the simSKUIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimSKUIdentifier() {
        return simSKUIdentifier;
    }

    /**
     * Sets the value of the simSKUIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimSKUIdentifier(String value) {
        this.simSKUIdentifier = value;
    }

    /**
     * Gets the value of the imeiInd property.
     * 
     */
    public boolean isImeiInd() {
        return imeiInd;
    }

    /**
     * Sets the value of the imeiInd property.
     * 
     */
    public void setImeiInd(boolean value) {
        this.imeiInd = value;
    }

    /**
     * Gets the value of the sim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSim() {
        return sim;
    }

    /**
     * Sets the value of the sim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSim(String value) {
        this.sim = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageSCDInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageSCDInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tabletMacID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rmsMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceModelNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceFirmware" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceEncryptKeyEnbld" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageSCDInfoRequest", propOrder = {
    "tabletMacID",
    "rmsMode",
    "deviceSerialNo",
    "deviceModelNo",
    "deviceFirmware",
    "deviceLocation",
    "deviceEncryptKeyEnbld"
})
public class ManageSCDInfoRequest
    extends Request
{

    @XmlElement(required = true)
    protected String tabletMacID;
    @XmlElement(required = true)
    protected String rmsMode;
    @XmlElement(required = true)
    protected String deviceSerialNo;
    @XmlElement(required = true)
    protected String deviceModelNo;
    @XmlElement(required = true)
    protected String deviceFirmware;
    @XmlElement(required = true)
    protected String deviceLocation;
    protected boolean deviceEncryptKeyEnbld;

    /**
     * Gets the value of the tabletMacID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabletMacID() {
        return tabletMacID;
    }

    /**
     * Sets the value of the tabletMacID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabletMacID(String value) {
        this.tabletMacID = value;
    }

    /**
     * Gets the value of the rmsMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmsMode() {
        return rmsMode;
    }

    /**
     * Sets the value of the rmsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmsMode(String value) {
        this.rmsMode = value;
    }

    /**
     * Gets the value of the deviceSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNo() {
        return deviceSerialNo;
    }

    /**
     * Sets the value of the deviceSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNo(String value) {
        this.deviceSerialNo = value;
    }

    /**
     * Gets the value of the deviceModelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModelNo() {
        return deviceModelNo;
    }

    /**
     * Sets the value of the deviceModelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModelNo(String value) {
        this.deviceModelNo = value;
    }

    /**
     * Gets the value of the deviceFirmware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFirmware() {
        return deviceFirmware;
    }

    /**
     * Sets the value of the deviceFirmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFirmware(String value) {
        this.deviceFirmware = value;
    }

    /**
     * Gets the value of the deviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLocation() {
        return deviceLocation;
    }

    /**
     * Sets the value of the deviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLocation(String value) {
        this.deviceLocation = value;
    }

    /**
     * Gets the value of the deviceEncryptKeyEnbld property.
     * 
     */
    public boolean isDeviceEncryptKeyEnbld() {
        return deviceEncryptKeyEnbld;
    }

    /**
     * Sets the value of the deviceEncryptKeyEnbld property.
     * 
     */
    public void setDeviceEncryptKeyEnbld(boolean value) {
        this.deviceEncryptKeyEnbld = value;
    }

}

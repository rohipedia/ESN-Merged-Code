
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageDeviceRebrandingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageDeviceRebrandingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="salesRepIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageDeviceRebrandingRequest", propOrder = {
    "storeNumber",
    "serialNumber",
    "targetSku",
    "salesRepIdentifier"
})
public class ManageDeviceRebrandingRequest
    extends Request
{

    @XmlElement(required = true)
    protected String storeNumber;
    @XmlElement(required = true)
    protected String serialNumber;
    @XmlElement(required = true)
    protected String targetSku;
    @XmlElement(required = true)
    protected String salesRepIdentifier;

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
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
     * Gets the value of the targetSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSku() {
        return targetSku;
    }

    /**
     * Sets the value of the targetSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSku(String value) {
        this.targetSku = value;
    }

    /**
     * Gets the value of the salesRepIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepIdentifier() {
        return salesRepIdentifier;
    }

    /**
     * Sets the value of the salesRepIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepIdentifier(String value) {
        this.salesRepIdentifier = value;
    }

}

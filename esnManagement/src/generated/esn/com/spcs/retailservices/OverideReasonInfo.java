
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverideReasonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverideReasonInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ovrdReasonIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OvrdReasonDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverideReasonInfo", propOrder = {
    "ovrdReasonIdentifier",
    "ovrdReasonDesc",
    "activeStatus"
})
public class OverideReasonInfo {

    protected int ovrdReasonIdentifier;
    @XmlElement(name = "OvrdReasonDesc", required = true)
    protected String ovrdReasonDesc;
    @XmlElement(required = true)
    protected String activeStatus;

    /**
     * Gets the value of the ovrdReasonIdentifier property.
     * 
     */
    public int getOvrdReasonIdentifier() {
        return ovrdReasonIdentifier;
    }

    /**
     * Sets the value of the ovrdReasonIdentifier property.
     * 
     */
    public void setOvrdReasonIdentifier(int value) {
        this.ovrdReasonIdentifier = value;
    }

    /**
     * Gets the value of the ovrdReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvrdReasonDesc() {
        return ovrdReasonDesc;
    }

    /**
     * Sets the value of the ovrdReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvrdReasonDesc(String value) {
        this.ovrdReasonDesc = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStatus(String value) {
        this.activeStatus = value;
    }

}

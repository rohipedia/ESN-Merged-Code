
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImpactedMdnInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImpactedMdnInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deviceChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="newLineInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpactedMdnInfo", propOrder = {
    "mdn",
    "planChangeInd",
    "deviceChangeInd",
    "newLineInd"
})
public class ImpactedMdnInfo {

    @XmlElement(required = true)
    protected String mdn;
    protected boolean planChangeInd;
    protected boolean deviceChangeInd;
    protected boolean newLineInd;

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
     * Gets the value of the planChangeInd property.
     * 
     */
    public boolean isPlanChangeInd() {
        return planChangeInd;
    }

    /**
     * Sets the value of the planChangeInd property.
     * 
     */
    public void setPlanChangeInd(boolean value) {
        this.planChangeInd = value;
    }

    /**
     * Gets the value of the deviceChangeInd property.
     * 
     */
    public boolean isDeviceChangeInd() {
        return deviceChangeInd;
    }

    /**
     * Sets the value of the deviceChangeInd property.
     * 
     */
    public void setDeviceChangeInd(boolean value) {
        this.deviceChangeInd = value;
    }

    /**
     * Gets the value of the newLineInd property.
     * 
     */
    public boolean isNewLineInd() {
        return newLineInd;
    }

    /**
     * Sets the value of the newLineInd property.
     * 
     */
    public void setNewLineInd(boolean value) {
        this.newLineInd = value;
    }

}

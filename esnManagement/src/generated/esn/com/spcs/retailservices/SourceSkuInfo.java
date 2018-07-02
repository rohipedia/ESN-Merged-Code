
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceSkuInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceSkuInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrentProductIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceSkuInfo", propOrder = {
    "currentSku",
    "currentProductIdentifier"
})
public class SourceSkuInfo {

    @XmlElement(name = "CurrentSku", required = true, nillable = true)
    protected String currentSku;
    @XmlElement(name = "CurrentProductIdentifier", required = true, type = Integer.class, nillable = true)
    protected Integer currentProductIdentifier;

    /**
     * Gets the value of the currentSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSku() {
        return currentSku;
    }

    /**
     * Sets the value of the currentSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSku(String value) {
        this.currentSku = value;
    }

    /**
     * Gets the value of the currentProductIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentProductIdentifier() {
        return currentProductIdentifier;
    }

    /**
     * Sets the value of the currentProductIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentProductIdentifier(Integer value) {
        this.currentProductIdentifier = value;
    }

}

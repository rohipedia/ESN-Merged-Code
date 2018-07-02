
package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MacInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MacInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="macCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="macAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="macDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MacInfo", propOrder = {
    "macCode",
    "macAmount",
    "macDuration"
})
public class MacInfo {

    @XmlElement(required = true)
    protected String macCode;
    @XmlElement(required = true)
    protected BigDecimal macAmount;
    protected int macDuration;

    /**
     * Gets the value of the macCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacCode() {
        return macCode;
    }

    /**
     * Sets the value of the macCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacCode(String value) {
        this.macCode = value;
    }

    /**
     * Gets the value of the macAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMacAmount() {
        return macAmount;
    }

    /**
     * Sets the value of the macAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMacAmount(BigDecimal value) {
        this.macAmount = value;
    }

    /**
     * Gets the value of the macDuration property.
     * 
     */
    public int getMacDuration() {
        return macDuration;
    }

    /**
     * Sets the value of the macDuration property.
     * 
     */
    public void setMacDuration(int value) {
        this.macDuration = value;
    }

}

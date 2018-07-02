
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditAccountConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditAccountConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditAccountInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HardHitInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdverseEmailInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditAccountConsentInfo", propOrder = {
    "creditAccountInd",
    "hardHitInd",
    "adverseEmailInd"
})
public class CreditAccountConsentInfo {

    @XmlElement(name = "CreditAccountInd", required = true)
    protected String creditAccountInd;
    @XmlElement(name = "HardHitInd", required = true)
    protected String hardHitInd;
    @XmlElement(name = "AdverseEmailInd", required = true)
    protected String adverseEmailInd;

    /**
     * Gets the value of the creditAccountInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountInd() {
        return creditAccountInd;
    }

    /**
     * Sets the value of the creditAccountInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountInd(String value) {
        this.creditAccountInd = value;
    }

    /**
     * Gets the value of the hardHitInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardHitInd() {
        return hardHitInd;
    }

    /**
     * Sets the value of the hardHitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardHitInd(String value) {
        this.hardHitInd = value;
    }

    /**
     * Gets the value of the adverseEmailInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdverseEmailInd() {
        return adverseEmailInd;
    }

    /**
     * Sets the value of the adverseEmailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdverseEmailInd(String value) {
        this.adverseEmailInd = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OmimReturnReasonCodeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OmimReturnReasonCodeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="returnReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="omimReturnReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OmimReturnReasonCodeInfo", propOrder = {
    "returnReasonDescription",
    "returnReasonCode",
    "omimReturnReasonCode"
})
public class OmimReturnReasonCodeInfo {

    @XmlElement(required = true)
    protected String returnReasonDescription;
    @XmlElement(required = true)
    protected String returnReasonCode;
    protected String omimReturnReasonCode;

    /**
     * Gets the value of the returnReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReasonDescription() {
        return returnReasonDescription;
    }

    /**
     * Sets the value of the returnReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReasonDescription(String value) {
        this.returnReasonDescription = value;
    }

    /**
     * Gets the value of the returnReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    /**
     * Sets the value of the returnReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReasonCode(String value) {
        this.returnReasonCode = value;
    }

    /**
     * Gets the value of the omimReturnReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmimReturnReasonCode() {
        return omimReturnReasonCode;
    }

    /**
     * Sets the value of the omimReturnReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmimReturnReasonCode(String value) {
        this.omimReturnReasonCode = value;
    }

}

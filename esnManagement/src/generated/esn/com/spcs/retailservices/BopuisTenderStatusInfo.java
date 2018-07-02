
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BopuisTenderStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BopuisTenderStatusInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowedToTender" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bopuisOrderFastStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bopuisOrderStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BopuisTenderStatusInfo", propOrder = {
    "allowedToTender",
    "bopuisOrderFastStatus",
    "bopuisOrderStatusDesc"
})
public class BopuisTenderStatusInfo {

    protected boolean allowedToTender;
    @XmlElement(required = true)
    protected String bopuisOrderFastStatus;
    @XmlElement(required = true)
    protected String bopuisOrderStatusDesc;

    /**
     * Gets the value of the allowedToTender property.
     * 
     */
    public boolean isAllowedToTender() {
        return allowedToTender;
    }

    /**
     * Sets the value of the allowedToTender property.
     * 
     */
    public void setAllowedToTender(boolean value) {
        this.allowedToTender = value;
    }

    /**
     * Gets the value of the bopuisOrderFastStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBopuisOrderFastStatus() {
        return bopuisOrderFastStatus;
    }

    /**
     * Sets the value of the bopuisOrderFastStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBopuisOrderFastStatus(String value) {
        this.bopuisOrderFastStatus = value;
    }

    /**
     * Gets the value of the bopuisOrderStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBopuisOrderStatusDesc() {
        return bopuisOrderStatusDesc;
    }

    /**
     * Sets the value of the bopuisOrderStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBopuisOrderStatusDesc(String value) {
        this.bopuisOrderStatusDesc = value;
    }

}

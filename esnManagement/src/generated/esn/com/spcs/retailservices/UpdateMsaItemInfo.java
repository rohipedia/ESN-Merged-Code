
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMsaItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMsaItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shoppingCartOrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="shoppingCartLineItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lineItemStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMsaItemInfo", propOrder = {
    "shoppingCartOrderIdentifier",
    "shoppingCartLineItemIdentifier",
    "lineItemStatusCode"
})
public class UpdateMsaItemInfo {

    protected int shoppingCartOrderIdentifier;
    protected int shoppingCartLineItemIdentifier;
    @XmlElement(required = true)
    protected String lineItemStatusCode;

    /**
     * Gets the value of the shoppingCartOrderIdentifier property.
     * 
     */
    public int getShoppingCartOrderIdentifier() {
        return shoppingCartOrderIdentifier;
    }

    /**
     * Sets the value of the shoppingCartOrderIdentifier property.
     * 
     */
    public void setShoppingCartOrderIdentifier(int value) {
        this.shoppingCartOrderIdentifier = value;
    }

    /**
     * Gets the value of the shoppingCartLineItemIdentifier property.
     * 
     */
    public int getShoppingCartLineItemIdentifier() {
        return shoppingCartLineItemIdentifier;
    }

    /**
     * Sets the value of the shoppingCartLineItemIdentifier property.
     * 
     */
    public void setShoppingCartLineItemIdentifier(int value) {
        this.shoppingCartLineItemIdentifier = value;
    }

    /**
     * Gets the value of the lineItemStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemStatusCode() {
        return lineItemStatusCode;
    }

    /**
     * Sets the value of the lineItemStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemStatusCode(String value) {
        this.lineItemStatusCode = value;
    }

}

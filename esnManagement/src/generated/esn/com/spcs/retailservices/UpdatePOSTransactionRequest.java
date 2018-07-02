
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePOSTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePOSTransactionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AccessoryOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="updateTransaction" type="{java:com.spcs.retailservices.domain}UpdateTransaction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePOSTransactionRequest", propOrder = {
    "prepaidIndicator",
    "accessoryOnlyIndicator",
    "updateTransaction"
})
public class UpdatePOSTransactionRequest
    extends Request
{

    @XmlElement(name = "PrepaidIndicator")
    protected boolean prepaidIndicator;
    @XmlElement(name = "AccessoryOnlyIndicator")
    protected boolean accessoryOnlyIndicator;
    @XmlElement(required = true)
    protected UpdateTransaction updateTransaction;

    /**
     * Gets the value of the prepaidIndicator property.
     * 
     */
    public boolean isPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Sets the value of the prepaidIndicator property.
     * 
     */
    public void setPrepaidIndicator(boolean value) {
        this.prepaidIndicator = value;
    }

    /**
     * Gets the value of the accessoryOnlyIndicator property.
     * 
     */
    public boolean isAccessoryOnlyIndicator() {
        return accessoryOnlyIndicator;
    }

    /**
     * Sets the value of the accessoryOnlyIndicator property.
     * 
     */
    public void setAccessoryOnlyIndicator(boolean value) {
        this.accessoryOnlyIndicator = value;
    }

    /**
     * Gets the value of the updateTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTransaction }
     *     
     */
    public UpdateTransaction getUpdateTransaction() {
        return updateTransaction;
    }

    /**
     * Sets the value of the updateTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTransaction }
     *     
     */
    public void setUpdateTransaction(UpdateTransaction value) {
        this.updateTransaction = value;
    }

}

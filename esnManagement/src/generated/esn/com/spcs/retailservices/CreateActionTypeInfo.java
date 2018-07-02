
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateActionTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateActionTypeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="authUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateActionTypeInfo", propOrder = {
    "actionTypeIdentifier",
    "authUserID",
    "notes",
    "lineItemNumber"
})
public class CreateActionTypeInfo {

    protected int actionTypeIdentifier;
    protected int authUserID;
    protected String notes;
    protected Long lineItemNumber;

    /**
     * Gets the value of the actionTypeIdentifier property.
     * 
     */
    public int getActionTypeIdentifier() {
        return actionTypeIdentifier;
    }

    /**
     * Sets the value of the actionTypeIdentifier property.
     * 
     */
    public void setActionTypeIdentifier(int value) {
        this.actionTypeIdentifier = value;
    }

    /**
     * Gets the value of the authUserID property.
     * 
     */
    public int getAuthUserID() {
        return authUserID;
    }

    /**
     * Sets the value of the authUserID property.
     * 
     */
    public void setAuthUserID(int value) {
        this.authUserID = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the lineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemNumber(Long value) {
        this.lineItemNumber = value;
    }

}

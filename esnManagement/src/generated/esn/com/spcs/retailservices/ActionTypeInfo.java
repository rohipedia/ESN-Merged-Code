
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionTypeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="glAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pointOfSaleCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionTypeInfo", propOrder = {
    "actionTypeIdentifier",
    "actionType",
    "glAccountNumber",
    "pointOfSaleCode",
    "typeCode"
})
public class ActionTypeInfo {

    protected int actionTypeIdentifier;
    @XmlElement(required = true)
    protected String actionType;
    @XmlElement(required = true)
    protected String glAccountNumber;
    @XmlElement(required = true)
    protected String pointOfSaleCode;
    @XmlElement(required = true)
    protected String typeCode;

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
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the glAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlAccountNumber() {
        return glAccountNumber;
    }

    /**
     * Sets the value of the glAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlAccountNumber(String value) {
        this.glAccountNumber = value;
    }

    /**
     * Gets the value of the pointOfSaleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCode() {
        return pointOfSaleCode;
    }

    /**
     * Sets the value of the pointOfSaleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCode(String value) {
        this.pointOfSaleCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransactionRegisterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransactionRegisterInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="floatNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="machineIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sharedCashDrawerFloatNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransactionRegisterInfo", propOrder = {
    "registerNumber",
    "floatNumber",
    "machineIdentifier",
    "sharedCashDrawerFloatNumber"
})
public class UpdateTransactionRegisterInfo {

    protected int registerNumber;
    protected long floatNumber;
    @XmlElement(required = true)
    protected String machineIdentifier;
    protected long sharedCashDrawerFloatNumber;

    /**
     * Gets the value of the registerNumber property.
     * 
     */
    public int getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     * 
     */
    public void setRegisterNumber(int value) {
        this.registerNumber = value;
    }

    /**
     * Gets the value of the floatNumber property.
     * 
     */
    public long getFloatNumber() {
        return floatNumber;
    }

    /**
     * Sets the value of the floatNumber property.
     * 
     */
    public void setFloatNumber(long value) {
        this.floatNumber = value;
    }

    /**
     * Gets the value of the machineIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineIdentifier() {
        return machineIdentifier;
    }

    /**
     * Sets the value of the machineIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineIdentifier(String value) {
        this.machineIdentifier = value;
    }

    /**
     * Gets the value of the sharedCashDrawerFloatNumber property.
     * 
     */
    public long getSharedCashDrawerFloatNumber() {
        return sharedCashDrawerFloatNumber;
    }

    /**
     * Sets the value of the sharedCashDrawerFloatNumber property.
     * 
     */
    public void setSharedCashDrawerFloatNumber(long value) {
        this.sharedCashDrawerFloatNumber = value;
    }

}

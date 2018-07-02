
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateAccessoryLoanDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAccessoryLoanDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessoryLoanContractTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accessoryLoanSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAccessoryLoanDetailsInfo", propOrder = {
    "accessoryLoanContractTerm",
    "accessoryLoanSequenceNumber"
})
public class UpdateAccessoryLoanDetailsInfo {

    protected int accessoryLoanContractTerm;
    protected int accessoryLoanSequenceNumber;

    /**
     * Gets the value of the accessoryLoanContractTerm property.
     * 
     */
    public int getAccessoryLoanContractTerm() {
        return accessoryLoanContractTerm;
    }

    /**
     * Sets the value of the accessoryLoanContractTerm property.
     * 
     */
    public void setAccessoryLoanContractTerm(int value) {
        this.accessoryLoanContractTerm = value;
    }

    /**
     * Gets the value of the accessoryLoanSequenceNumber property.
     * 
     */
    public int getAccessoryLoanSequenceNumber() {
        return accessoryLoanSequenceNumber;
    }

    /**
     * Sets the value of the accessoryLoanSequenceNumber property.
     * 
     */
    public void setAccessoryLoanSequenceNumber(int value) {
        this.accessoryLoanSequenceNumber = value;
    }

}

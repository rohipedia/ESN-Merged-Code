
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeaseConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeaseConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leaseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeaseConsentInfo", propOrder = {
    "leaseIndicator"
})
public class LeaseConsentInfo {

    protected boolean leaseIndicator;

    /**
     * Gets the value of the leaseIndicator property.
     * 
     */
    public boolean isLeaseIndicator() {
        return leaseIndicator;
    }

    /**
     * Sets the value of the leaseIndicator property.
     * 
     */
    public void setLeaseIndicator(boolean value) {
        this.leaseIndicator = value;
    }

}

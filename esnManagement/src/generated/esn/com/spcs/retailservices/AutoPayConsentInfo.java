
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoPayConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoPayConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoPayRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoPayConsentInfo", propOrder = {
    "autoPayRequired"
})
public class AutoPayConsentInfo {

    protected boolean autoPayRequired;

    /**
     * Gets the value of the autoPayRequired property.
     * 
     */
    public boolean isAutoPayRequired() {
        return autoPayRequired;
    }

    /**
     * Sets the value of the autoPayRequired property.
     * 
     */
    public void setAutoPayRequired(boolean value) {
        this.autoPayRequired = value;
    }

}

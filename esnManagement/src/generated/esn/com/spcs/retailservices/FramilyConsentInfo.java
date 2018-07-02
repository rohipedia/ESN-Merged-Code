
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FramilyConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FramilyConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="framilyRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FramilyConsentInfo", propOrder = {
    "framilyRequired"
})
public class FramilyConsentInfo {

    protected boolean framilyRequired;

    /**
     * Gets the value of the framilyRequired property.
     * 
     */
    public boolean isFramilyRequired() {
        return framilyRequired;
    }

    /**
     * Sets the value of the framilyRequired property.
     * 
     */
    public void setFramilyRequired(boolean value) {
        this.framilyRequired = value;
    }

}

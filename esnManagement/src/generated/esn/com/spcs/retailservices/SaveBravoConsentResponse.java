
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveBravoConsentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveBravoConsentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consentSaved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveBravoConsentResponse", propOrder = {
    "consentSaved"
})
public class SaveBravoConsentResponse
    extends Response
{

    protected boolean consentSaved;

    /**
     * Gets the value of the consentSaved property.
     * 
     */
    public boolean isConsentSaved() {
        return consentSaved;
    }

    /**
     * Sets the value of the consentSaved property.
     * 
     */
    public void setConsentSaved(boolean value) {
        this.consentSaved = value;
    }

}

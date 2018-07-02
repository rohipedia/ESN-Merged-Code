
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsentDetailsList" type="{java:com.spcs.retailservices.domain}ConsentDetailsList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateConsentInfo", propOrder = {
    "consentDetailsList"
})
public class UpdateConsentInfo {

    @XmlElement(name = "ConsentDetailsList", required = true)
    protected ConsentDetailsList consentDetailsList;

    /**
     * Gets the value of the consentDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentDetailsList }
     *     
     */
    public ConsentDetailsList getConsentDetailsList() {
        return consentDetailsList;
    }

    /**
     * Sets the value of the consentDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentDetailsList }
     *     
     */
    public void setConsentDetailsList(ConsentDetailsList value) {
        this.consentDetailsList = value;
    }

}

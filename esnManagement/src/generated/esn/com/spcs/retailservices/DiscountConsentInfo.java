
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountConsentInfo", propOrder = {
    "discountIndicator"
})
public class DiscountConsentInfo {

    protected boolean discountIndicator;

    /**
     * Gets the value of the discountIndicator property.
     * 
     */
    public boolean isDiscountIndicator() {
        return discountIndicator;
    }

    /**
     * Sets the value of the discountIndicator property.
     * 
     */
    public void setDiscountIndicator(boolean value) {
        this.discountIndicator = value;
    }

}

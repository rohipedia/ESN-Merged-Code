
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductManufacturerValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductManufacturerValidationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsValidSerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductManufacturerValidationResponse", propOrder = {
    "isValidSerialNumber"
})
public class ProductManufacturerValidationResponse
    extends Response
{

    @XmlElement(name = "IsValidSerialNumber")
    protected boolean isValidSerialNumber;

    /**
     * Gets the value of the isValidSerialNumber property.
     * 
     */
    public boolean isIsValidSerialNumber() {
        return isValidSerialNumber;
    }

    /**
     * Sets the value of the isValidSerialNumber property.
     * 
     */
    public void setIsValidSerialNumber(boolean value) {
        this.isValidSerialNumber = value;
    }

}

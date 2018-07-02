
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SerialNumberProductValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerialNumberProductValidationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductStatusIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialNumberProductValidationResponse", propOrder = {
    "productStatusIdentifier"
})
public class SerialNumberProductValidationResponse
    extends Response
{

    @XmlElement(name = "ProductStatusIdentifier", required = true, type = Integer.class, nillable = true)
    protected Integer productStatusIdentifier;

    /**
     * Gets the value of the productStatusIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductStatusIdentifier() {
        return productStatusIdentifier;
    }

    /**
     * Sets the value of the productStatusIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductStatusIdentifier(Integer value) {
        this.productStatusIdentifier = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryProductIdentifierRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProductIdentifierRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProductIdentifierRequest", propOrder = {
    "productSKU"
})
public class QueryProductIdentifierRequest
    extends Request
{

    @XmlElement(name = "ProductSKU", required = true, nillable = true)
    protected String productSKU;

    /**
     * Gets the value of the productSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSKU() {
        return productSKU;
    }

    /**
     * Sets the value of the productSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSKU(String value) {
        this.productSKU = value;
    }

}

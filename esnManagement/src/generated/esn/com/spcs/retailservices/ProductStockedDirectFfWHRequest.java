
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStockedDirectFfWHRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductStockedDirectFfWHRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductStockedDirectFfWHRequest", propOrder = {
    "storeIdentifier",
    "productIdentifier"
})
public class ProductStockedDirectFfWHRequest
    extends Request
{

    @XmlElement(name = "StoreIdentifier")
    protected int storeIdentifier;
    @XmlElement(name = "ProductIdentifier")
    protected int productIdentifier;

    /**
     * Gets the value of the storeIdentifier property.
     * 
     */
    public int getStoreIdentifier() {
        return storeIdentifier;
    }

    /**
     * Sets the value of the storeIdentifier property.
     * 
     */
    public void setStoreIdentifier(int value) {
        this.storeIdentifier = value;
    }

    /**
     * Gets the value of the productIdentifier property.
     * 
     */
    public int getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     */
    public void setProductIdentifier(int value) {
        this.productIdentifier = value;
    }

}

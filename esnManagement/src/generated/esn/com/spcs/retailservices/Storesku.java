
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Storesku complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Storesku"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stores" type="{java:com.spcs.retailservices.domain}Stores"/&gt;
 *         &lt;element name="Skus" type="{java:com.spcs.retailservices.domain}Skus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Storesku", propOrder = {
    "stores",
    "skus"
})
public class Storesku {

    @XmlElement(name = "Stores", required = true)
    protected Stores stores;
    @XmlElement(name = "Skus", required = true)
    protected Skus skus;

    /**
     * Gets the value of the stores property.
     * 
     * @return
     *     possible object is
     *     {@link Stores }
     *     
     */
    public Stores getStores() {
        return stores;
    }

    /**
     * Sets the value of the stores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stores }
     *     
     */
    public void setStores(Stores value) {
        this.stores = value;
    }

    /**
     * Gets the value of the skus property.
     * 
     * @return
     *     possible object is
     *     {@link Skus }
     *     
     */
    public Skus getSkus() {
        return skus;
    }

    /**
     * Sets the value of the skus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Skus }
     *     
     */
    public void setSkus(Skus value) {
        this.skus = value;
    }

}

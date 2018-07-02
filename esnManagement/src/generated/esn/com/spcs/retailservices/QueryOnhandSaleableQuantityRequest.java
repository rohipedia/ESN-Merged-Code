
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOnhandSaleableQuantityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOnhandSaleableQuantityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QtyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Storesku" type="{java:com.spcs.retailservices.domain}Storesku"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOnhandSaleableQuantityRequest", propOrder = {
    "qtyStatus",
    "storesku"
})
public class QueryOnhandSaleableQuantityRequest
    extends Request
{

    @XmlElementRef(name = "QtyStatus", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtyStatus;
    @XmlElement(name = "Storesku", required = true)
    protected Storesku storesku;

    /**
     * Gets the value of the qtyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQtyStatus() {
        return qtyStatus;
    }

    /**
     * Sets the value of the qtyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQtyStatus(JAXBElement<String> value) {
        this.qtyStatus = value;
    }

    /**
     * Gets the value of the storesku property.
     * 
     * @return
     *     possible object is
     *     {@link Storesku }
     *     
     */
    public Storesku getStoresku() {
        return storesku;
    }

    /**
     * Sets the value of the storesku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Storesku }
     *     
     */
    public void setStoresku(Storesku value) {
        this.storesku = value;
    }

}


package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KitComponentPricingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KitComponentPricingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="KitPrice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="KitComponent" type="{java:com.spcs.retailservices.domain}KitComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KitComponentPricingRequest", propOrder = {
    "transactionTypeCode",
    "kitPrice",
    "kitComponent"
})
public class KitComponentPricingRequest
    extends Request
{

    @XmlElement(name = "TransactionTypeCode")
    protected int transactionTypeCode;
    @XmlElement(name = "KitPrice")
    protected int kitPrice;
    @XmlElement(name = "KitComponent", nillable = true)
    protected List<KitComponent> kitComponent;

    /**
     * Gets the value of the transactionTypeCode property.
     * 
     */
    public int getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Sets the value of the transactionTypeCode property.
     * 
     */
    public void setTransactionTypeCode(int value) {
        this.transactionTypeCode = value;
    }

    /**
     * Gets the value of the kitPrice property.
     * 
     */
    public int getKitPrice() {
        return kitPrice;
    }

    /**
     * Sets the value of the kitPrice property.
     * 
     */
    public void setKitPrice(int value) {
        this.kitPrice = value;
    }

    /**
     * Gets the value of the kitComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kitComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKitComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KitComponent }
     * 
     * 
     */
    public List<KitComponent> getKitComponent() {
        if (kitComponent == null) {
            kitComponent = new ArrayList<KitComponent>();
        }
        return this.kitComponent;
    }

}

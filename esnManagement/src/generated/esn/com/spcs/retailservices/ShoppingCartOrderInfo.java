
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingCartOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartOrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimetradeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssistedLoginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerInfo" type="{java:com.spcs.retailservices.domain}CustomerInfo"/&gt;
 *         &lt;element name="ShoppingCartOrderLinesList" type="{java:com.spcs.retailservices.domain}ShoppingCartOrderLinesList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartOrderInfo", propOrder = {
    "timetradeIdentifier",
    "assistedLoginIdentifier",
    "storeName",
    "customerInfo",
    "shoppingCartOrderLinesList"
})
public class ShoppingCartOrderInfo {

    @XmlElement(name = "TimetradeIdentifier")
    protected String timetradeIdentifier;
    @XmlElement(name = "AssistedLoginIdentifier")
    protected String assistedLoginIdentifier;
    @XmlElement(name = "StoreName", required = true)
    protected String storeName;
    @XmlElement(name = "CustomerInfo", required = true)
    protected CustomerInfo customerInfo;
    @XmlElement(name = "ShoppingCartOrderLinesList")
    protected ShoppingCartOrderLinesList shoppingCartOrderLinesList;

    /**
     * Gets the value of the timetradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetradeIdentifier() {
        return timetradeIdentifier;
    }

    /**
     * Sets the value of the timetradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetradeIdentifier(String value) {
        this.timetradeIdentifier = value;
    }

    /**
     * Gets the value of the assistedLoginIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistedLoginIdentifier() {
        return assistedLoginIdentifier;
    }

    /**
     * Sets the value of the assistedLoginIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistedLoginIdentifier(String value) {
        this.assistedLoginIdentifier = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setCustomerInfo(CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the shoppingCartOrderLinesList property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartOrderLinesList }
     *     
     */
    public ShoppingCartOrderLinesList getShoppingCartOrderLinesList() {
        return shoppingCartOrderLinesList;
    }

    /**
     * Sets the value of the shoppingCartOrderLinesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartOrderLinesList }
     *     
     */
    public void setShoppingCartOrderLinesList(ShoppingCartOrderLinesList value) {
        this.shoppingCartOrderLinesList = value;
    }

}

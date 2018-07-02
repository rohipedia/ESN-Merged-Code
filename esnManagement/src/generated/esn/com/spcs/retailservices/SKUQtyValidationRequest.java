
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SKUQtyValidationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUQtyValidationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductConsignedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductStockedIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductDirectFulfillmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SalesRepConsigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProductConsigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PromptForConsignment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="KitItemIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KitQuantityCheckBypassed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SellFromConsignmentAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TransactionTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemDetails" type="{java:com.spcs.retailservices.domain}ItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineItemConsigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUQtyValidationRequest", propOrder = {
    "productQuantity",
    "productIdentifier",
    "productConsignedQuantity",
    "productStockedIndicator",
    "productDirectFulfillmentIndicator",
    "salesRepConsigned",
    "productConsigned",
    "promptForConsignment",
    "kitItemIndicator",
    "kitQuantityCheckBypassed",
    "sellFromConsignmentAccepted",
    "transactionTypeCode",
    "storeIdentifier",
    "itemDetails",
    "lineItemConsigned"
})
public class SKUQtyValidationRequest
    extends Request
{

    @XmlElement(name = "ProductQuantity")
    protected int productQuantity;
    @XmlElement(name = "ProductIdentifier")
    protected int productIdentifier;
    @XmlElement(name = "ProductConsignedQuantity")
    protected int productConsignedQuantity;
    @XmlElement(name = "ProductStockedIndicator", required = true, nillable = true)
    protected String productStockedIndicator;
    @XmlElement(name = "ProductDirectFulfillmentIndicator", required = true, nillable = true)
    protected String productDirectFulfillmentIndicator;
    @XmlElement(name = "SalesRepConsigned")
    protected boolean salesRepConsigned;
    @XmlElement(name = "ProductConsigned")
    protected boolean productConsigned;
    @XmlElement(name = "PromptForConsignment")
    protected boolean promptForConsignment;
    @XmlElement(name = "KitItemIndicator", required = true, nillable = true)
    protected String kitItemIndicator;
    @XmlElement(name = "KitQuantityCheckBypassed")
    protected boolean kitQuantityCheckBypassed;
    @XmlElement(name = "SellFromConsignmentAccepted")
    protected boolean sellFromConsignmentAccepted;
    @XmlElement(name = "TransactionTypeCode")
    protected int transactionTypeCode;
    @XmlElement(name = "StoreIdentifier")
    protected int storeIdentifier;
    @XmlElement(name = "ItemDetails", nillable = true)
    protected List<ItemDetails> itemDetails;
    @XmlElement(name = "LineItemConsigned")
    protected boolean lineItemConsigned;

    /**
     * Gets the value of the productQuantity property.
     * 
     */
    public int getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     */
    public void setProductQuantity(int value) {
        this.productQuantity = value;
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

    /**
     * Gets the value of the productConsignedQuantity property.
     * 
     */
    public int getProductConsignedQuantity() {
        return productConsignedQuantity;
    }

    /**
     * Sets the value of the productConsignedQuantity property.
     * 
     */
    public void setProductConsignedQuantity(int value) {
        this.productConsignedQuantity = value;
    }

    /**
     * Gets the value of the productStockedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStockedIndicator() {
        return productStockedIndicator;
    }

    /**
     * Sets the value of the productStockedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStockedIndicator(String value) {
        this.productStockedIndicator = value;
    }

    /**
     * Gets the value of the productDirectFulfillmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDirectFulfillmentIndicator() {
        return productDirectFulfillmentIndicator;
    }

    /**
     * Sets the value of the productDirectFulfillmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDirectFulfillmentIndicator(String value) {
        this.productDirectFulfillmentIndicator = value;
    }

    /**
     * Gets the value of the salesRepConsigned property.
     * 
     */
    public boolean isSalesRepConsigned() {
        return salesRepConsigned;
    }

    /**
     * Sets the value of the salesRepConsigned property.
     * 
     */
    public void setSalesRepConsigned(boolean value) {
        this.salesRepConsigned = value;
    }

    /**
     * Gets the value of the productConsigned property.
     * 
     */
    public boolean isProductConsigned() {
        return productConsigned;
    }

    /**
     * Sets the value of the productConsigned property.
     * 
     */
    public void setProductConsigned(boolean value) {
        this.productConsigned = value;
    }

    /**
     * Gets the value of the promptForConsignment property.
     * 
     */
    public boolean isPromptForConsignment() {
        return promptForConsignment;
    }

    /**
     * Sets the value of the promptForConsignment property.
     * 
     */
    public void setPromptForConsignment(boolean value) {
        this.promptForConsignment = value;
    }

    /**
     * Gets the value of the kitItemIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitItemIndicator() {
        return kitItemIndicator;
    }

    /**
     * Sets the value of the kitItemIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitItemIndicator(String value) {
        this.kitItemIndicator = value;
    }

    /**
     * Gets the value of the kitQuantityCheckBypassed property.
     * 
     */
    public boolean isKitQuantityCheckBypassed() {
        return kitQuantityCheckBypassed;
    }

    /**
     * Sets the value of the kitQuantityCheckBypassed property.
     * 
     */
    public void setKitQuantityCheckBypassed(boolean value) {
        this.kitQuantityCheckBypassed = value;
    }

    /**
     * Gets the value of the sellFromConsignmentAccepted property.
     * 
     */
    public boolean isSellFromConsignmentAccepted() {
        return sellFromConsignmentAccepted;
    }

    /**
     * Sets the value of the sellFromConsignmentAccepted property.
     * 
     */
    public void setSellFromConsignmentAccepted(boolean value) {
        this.sellFromConsignmentAccepted = value;
    }

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
     * Gets the value of the itemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDetails }
     * 
     * 
     */
    public List<ItemDetails> getItemDetails() {
        if (itemDetails == null) {
            itemDetails = new ArrayList<ItemDetails>();
        }
        return this.itemDetails;
    }

    /**
     * Gets the value of the lineItemConsigned property.
     * 
     */
    public boolean isLineItemConsigned() {
        return lineItemConsigned;
    }

    /**
     * Sets the value of the lineItemConsigned property.
     * 
     */
    public void setLineItemConsigned(boolean value) {
        this.lineItemConsigned = value;
    }

}

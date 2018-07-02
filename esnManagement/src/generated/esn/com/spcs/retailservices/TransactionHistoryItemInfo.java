
package esn.com.spcs.retailservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionHistoryItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionHistoryItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="skuDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="kitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionHistoryItemInfo", propOrder = {
    "lineItemNumber",
    "sku",
    "skuDesc",
    "quantity",
    "amount",
    "kitId",
    "kitName"
})
public class TransactionHistoryItemInfo {

    protected int lineItemNumber;
    @XmlElement(required = true)
    protected String sku;
    @XmlElement(required = true)
    protected String skuDesc;
    protected int quantity;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected Integer kitId;
    protected String kitName;

    /**
     * Gets the value of the lineItemNumber property.
     * 
     */
    public int getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     */
    public void setLineItemNumber(int value) {
        this.lineItemNumber = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the skuDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuDesc() {
        return skuDesc;
    }

    /**
     * Sets the value of the skuDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuDesc(String value) {
        this.skuDesc = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the kitId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKitId() {
        return kitId;
    }

    /**
     * Sets the value of the kitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKitId(Integer value) {
        this.kitId = value;
    }

    /**
     * Gets the value of the kitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitName() {
        return kitName;
    }

    /**
     * Sets the value of the kitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitName(String value) {
        this.kitName = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KitItemPricingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KitItemPricingDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductFinalSalesPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ProductDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KitItemPricingDetails", propOrder = {
    "lineItemNumber",
    "productFinalSalesPrice",
    "productDiscountAmount"
})
public class KitItemPricingDetails {

    @XmlElement(name = "LineItemNumber")
    protected int lineItemNumber;
    @XmlElement(name = "ProductFinalSalesPrice")
    protected double productFinalSalesPrice;
    @XmlElement(name = "ProductDiscountAmount")
    protected double productDiscountAmount;

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
     * Gets the value of the productFinalSalesPrice property.
     * 
     */
    public double getProductFinalSalesPrice() {
        return productFinalSalesPrice;
    }

    /**
     * Sets the value of the productFinalSalesPrice property.
     * 
     */
    public void setProductFinalSalesPrice(double value) {
        this.productFinalSalesPrice = value;
    }

    /**
     * Gets the value of the productDiscountAmount property.
     * 
     */
    public double getProductDiscountAmount() {
        return productDiscountAmount;
    }

    /**
     * Sets the value of the productDiscountAmount property.
     * 
     */
    public void setProductDiscountAmount(double value) {
        this.productDiscountAmount = value;
    }

}

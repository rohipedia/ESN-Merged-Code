
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDetailsbyStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailsbyStore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OnhandQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OnholdQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IntransferQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SoldQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OnOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ConsignedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NonSalebleQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SaleableCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailsbyStore", propOrder = {
    "onhandQuantity",
    "onholdQuantity",
    "intransferQuantity",
    "soldQuantity",
    "onOrderQuantity",
    "consignedQuantity",
    "returnedQuantity",
    "nonSalebleQuantity",
    "saleableCode"
})
public class ProductDetailsbyStore {

    @XmlElement(name = "OnhandQuantity", required = true, type = Integer.class, nillable = true)
    protected Integer onhandQuantity;
    @XmlElement(name = "OnholdQuantity", required = true, type = Integer.class, nillable = true)
    protected Integer onholdQuantity;
    @XmlElement(name = "IntransferQuantity", required = true, type = Integer.class, nillable = true)
    protected Integer intransferQuantity;
    @XmlElement(name = "SoldQuantity", required = true, type = Integer.class, nillable = true)
    protected Integer soldQuantity;
    @XmlElement(name = "OnOrderQuantity", required = true, type = Integer.class, nillable = true)
    protected Integer onOrderQuantity;
    @XmlElement(name = "ConsignedQuantity", required = true, type = Integer.class, nillable = true)
    protected Integer consignedQuantity;
    @XmlElement(name = "ReturnedQuantity", required = true, type = Integer.class, nillable = true)
    protected Integer returnedQuantity;
    @XmlElement(name = "NonSalebleQuantity", required = true, type = Integer.class, nillable = true)
    protected Integer nonSalebleQuantity;
    @XmlElement(name = "SaleableCode", required = true)
    protected String saleableCode;

    /**
     * Gets the value of the onhandQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnhandQuantity() {
        return onhandQuantity;
    }

    /**
     * Sets the value of the onhandQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnhandQuantity(Integer value) {
        this.onhandQuantity = value;
    }

    /**
     * Gets the value of the onholdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnholdQuantity() {
        return onholdQuantity;
    }

    /**
     * Sets the value of the onholdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnholdQuantity(Integer value) {
        this.onholdQuantity = value;
    }

    /**
     * Gets the value of the intransferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntransferQuantity() {
        return intransferQuantity;
    }

    /**
     * Sets the value of the intransferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntransferQuantity(Integer value) {
        this.intransferQuantity = value;
    }

    /**
     * Gets the value of the soldQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    /**
     * Sets the value of the soldQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSoldQuantity(Integer value) {
        this.soldQuantity = value;
    }

    /**
     * Gets the value of the onOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnOrderQuantity() {
        return onOrderQuantity;
    }

    /**
     * Sets the value of the onOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnOrderQuantity(Integer value) {
        this.onOrderQuantity = value;
    }

    /**
     * Gets the value of the consignedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsignedQuantity() {
        return consignedQuantity;
    }

    /**
     * Sets the value of the consignedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsignedQuantity(Integer value) {
        this.consignedQuantity = value;
    }

    /**
     * Gets the value of the returnedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedQuantity() {
        return returnedQuantity;
    }

    /**
     * Sets the value of the returnedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedQuantity(Integer value) {
        this.returnedQuantity = value;
    }

    /**
     * Gets the value of the nonSalebleQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonSalebleQuantity() {
        return nonSalebleQuantity;
    }

    /**
     * Sets the value of the nonSalebleQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonSalebleQuantity(Integer value) {
        this.nonSalebleQuantity = value;
    }

    /**
     * Gets the value of the saleableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleableCode() {
        return saleableCode;
    }

    /**
     * Sets the value of the saleableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleableCode(String value) {
        this.saleableCode = value;
    }

}

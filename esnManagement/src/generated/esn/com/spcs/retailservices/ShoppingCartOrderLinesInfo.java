
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingCartOrderLinesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartOrderLinesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LineActionInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PortInNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectShipToStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DevicePurchaseMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="adpsDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SRPDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PricePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarlyUpgradeTradeInInfo" type="{java:com.spcs.retailservices.domain}EarlyUpgradeTradeInInfo" minOccurs="0"/&gt;
 *         &lt;element name="AppSOCList" type="{java:com.spcs.retailservices.domain}AppSOCList" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartOrderLinesInfo", propOrder = {
    "lineItemNumber",
    "lineActionInd",
    "portInNumber",
    "ptn",
    "subscriberId",
    "productSKU",
    "directShipToStore",
    "quantity",
    "devicePurchaseMethod",
    "discountType",
    "discountAmount",
    "adpsDiscountAmount",
    "srpDiscountAmount",
    "pricePlanCode",
    "earlyUpgradeTradeInInfo",
    "appSOCList",
    "serialNumber"
})
public class ShoppingCartOrderLinesInfo {

    @XmlElement(name = "LineItemNumber")
    protected int lineItemNumber;
    @XmlElement(name = "LineActionInd", required = true)
    protected String lineActionInd;
    @XmlElement(name = "PortInNumber")
    protected String portInNumber;
    @XmlElement(name = "PTN")
    protected String ptn;
    protected String subscriberId;
    @XmlElement(name = "ProductSKU")
    protected String productSKU;
    @XmlElement(name = "DirectShipToStore")
    protected Boolean directShipToStore;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "DevicePurchaseMethod", required = true)
    protected String devicePurchaseMethod;
    protected String discountType;
    protected Double discountAmount;
    protected Double adpsDiscountAmount;
    @XmlElement(name = "SRPDiscountAmount")
    protected Double srpDiscountAmount;
    @XmlElement(name = "PricePlanCode")
    protected String pricePlanCode;
    @XmlElement(name = "EarlyUpgradeTradeInInfo")
    protected EarlyUpgradeTradeInInfo earlyUpgradeTradeInInfo;
    @XmlElement(name = "AppSOCList")
    protected AppSOCList appSOCList;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;

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
     * Gets the value of the lineActionInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineActionInd() {
        return lineActionInd;
    }

    /**
     * Sets the value of the lineActionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineActionInd(String value) {
        this.lineActionInd = value;
    }

    /**
     * Gets the value of the portInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortInNumber() {
        return portInNumber;
    }

    /**
     * Sets the value of the portInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortInNumber(String value) {
        this.portInNumber = value;
    }

    /**
     * Gets the value of the ptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTN() {
        return ptn;
    }

    /**
     * Sets the value of the ptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTN(String value) {
        this.ptn = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

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

    /**
     * Gets the value of the directShipToStore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectShipToStore() {
        return directShipToStore;
    }

    /**
     * Sets the value of the directShipToStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectShipToStore(Boolean value) {
        this.directShipToStore = value;
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
     * Gets the value of the devicePurchaseMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePurchaseMethod() {
        return devicePurchaseMethod;
    }

    /**
     * Sets the value of the devicePurchaseMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePurchaseMethod(String value) {
        this.devicePurchaseMethod = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountType(String value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountAmount(Double value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the adpsDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdpsDiscountAmount() {
        return adpsDiscountAmount;
    }

    /**
     * Sets the value of the adpsDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdpsDiscountAmount(Double value) {
        this.adpsDiscountAmount = value;
    }

    /**
     * Gets the value of the srpDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSRPDiscountAmount() {
        return srpDiscountAmount;
    }

    /**
     * Sets the value of the srpDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSRPDiscountAmount(Double value) {
        this.srpDiscountAmount = value;
    }

    /**
     * Gets the value of the pricePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanCode() {
        return pricePlanCode;
    }

    /**
     * Sets the value of the pricePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanCode(String value) {
        this.pricePlanCode = value;
    }

    /**
     * Gets the value of the earlyUpgradeTradeInInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EarlyUpgradeTradeInInfo }
     *     
     */
    public EarlyUpgradeTradeInInfo getEarlyUpgradeTradeInInfo() {
        return earlyUpgradeTradeInInfo;
    }

    /**
     * Sets the value of the earlyUpgradeTradeInInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarlyUpgradeTradeInInfo }
     *     
     */
    public void setEarlyUpgradeTradeInInfo(EarlyUpgradeTradeInInfo value) {
        this.earlyUpgradeTradeInInfo = value;
    }

    /**
     * Gets the value of the appSOCList property.
     * 
     * @return
     *     possible object is
     *     {@link AppSOCList }
     *     
     */
    public AppSOCList getAppSOCList() {
        return appSOCList;
    }

    /**
     * Sets the value of the appSOCList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppSOCList }
     *     
     */
    public void setAppSOCList(AppSOCList value) {
        this.appSOCList = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateSerialNumberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateSerialNumberRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesRepIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SaleReturnIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KitInfo" type="{java:com.spcs.retailservices.domain}KitInfo"/&gt;
 *         &lt;element name="ProductBasicInfo" type="{java:com.spcs.retailservices.domain}ProductBasicInfo"/&gt;
 *         &lt;element name="StoreBasicInfo" type="{java:com.spcs.retailservices.domain}StoreBasicInfo"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TransactionTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WebOrderPTN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateSerialNumberRequest", propOrder = {
    "salesRepIdentifier",
    "saleReturnIndicator",
    "kitInfo",
    "productBasicInfo",
    "storeBasicInfo",
    "serialNumber",
    "transactionNumber",
    "transactionTypeCode",
    "webOrderPTN"
})
public class ValidateSerialNumberRequest
    extends Request
{

    @XmlElement(name = "SalesRepIdentifier", required = true, type = Integer.class, nillable = true)
    protected Integer salesRepIdentifier;
    @XmlElement(name = "SaleReturnIndicator", required = true, nillable = true)
    protected String saleReturnIndicator;
    @XmlElement(name = "KitInfo", required = true, nillable = true)
    protected KitInfo kitInfo;
    @XmlElement(name = "ProductBasicInfo", required = true, nillable = true)
    protected ProductBasicInfo productBasicInfo;
    @XmlElement(name = "StoreBasicInfo", required = true, nillable = true)
    protected StoreBasicInfo storeBasicInfo;
    @XmlElement(name = "SerialNumber", required = true, nillable = true)
    protected String serialNumber;
    @XmlElement(name = "TransactionNumber")
    protected long transactionNumber;
    @XmlElement(name = "TransactionTypeCode")
    protected int transactionTypeCode;
    @XmlElement(name = "WebOrderPTN")
    protected Long webOrderPTN;

    /**
     * Gets the value of the salesRepIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesRepIdentifier() {
        return salesRepIdentifier;
    }

    /**
     * Sets the value of the salesRepIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesRepIdentifier(Integer value) {
        this.salesRepIdentifier = value;
    }

    /**
     * Gets the value of the saleReturnIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleReturnIndicator() {
        return saleReturnIndicator;
    }

    /**
     * Sets the value of the saleReturnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleReturnIndicator(String value) {
        this.saleReturnIndicator = value;
    }

    /**
     * Gets the value of the kitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KitInfo }
     *     
     */
    public KitInfo getKitInfo() {
        return kitInfo;
    }

    /**
     * Sets the value of the kitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KitInfo }
     *     
     */
    public void setKitInfo(KitInfo value) {
        this.kitInfo = value;
    }

    /**
     * Gets the value of the productBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductBasicInfo }
     *     
     */
    public ProductBasicInfo getProductBasicInfo() {
        return productBasicInfo;
    }

    /**
     * Sets the value of the productBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBasicInfo }
     *     
     */
    public void setProductBasicInfo(ProductBasicInfo value) {
        this.productBasicInfo = value;
    }

    /**
     * Gets the value of the storeBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreBasicInfo }
     *     
     */
    public StoreBasicInfo getStoreBasicInfo() {
        return storeBasicInfo;
    }

    /**
     * Sets the value of the storeBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreBasicInfo }
     *     
     */
    public void setStoreBasicInfo(StoreBasicInfo value) {
        this.storeBasicInfo = value;
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

    /**
     * Gets the value of the transactionNumber property.
     * 
     */
    public long getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     */
    public void setTransactionNumber(long value) {
        this.transactionNumber = value;
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
     * Gets the value of the webOrderPTN property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebOrderPTN() {
        return webOrderPTN;
    }

    /**
     * Sets the value of the webOrderPTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebOrderPTN(Long value) {
        this.webOrderPTN = value;
    }

}

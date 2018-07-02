
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTaxesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTaxesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NyGrossReceiptRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="NyCityGrossReceiptRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="StoreFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RiGrossReceiptRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ExemptTaxId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductOtherInfo" type="{java:com.spcs.retailservices.domain}ProductOtherInfo"/&gt;
 *         &lt;element name="TaxDetails" type="{java:com.spcs.retailservices.domain}TaxDetails"/&gt;
 *         &lt;element name="IgnoreCATaxrule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TaxMethodCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KitComponent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DeviceActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TaxGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTaxesRequest", propOrder = {
    "nyGrossReceiptRate",
    "nyCityGrossReceiptRate",
    "storeFlag",
    "riGrossReceiptRate",
    "exemptTaxId",
    "productOtherInfo",
    "taxDetails",
    "ignoreCATaxrule",
    "taxMethodCode",
    "kitComponent",
    "deviceActive",
    "taxGroupCode"
})
public class QueryTaxesRequest
    extends Request
{

    @XmlElement(name = "NyGrossReceiptRate")
    protected double nyGrossReceiptRate;
    @XmlElement(name = "NyCityGrossReceiptRate")
    protected double nyCityGrossReceiptRate;
    @XmlElement(name = "StoreFlag", required = true)
    protected String storeFlag;
    @XmlElement(name = "RiGrossReceiptRate")
    protected double riGrossReceiptRate;
    @XmlElement(name = "ExemptTaxId", type = Integer.class)
    protected List<Integer> exemptTaxId;
    @XmlElement(name = "ProductOtherInfo", required = true, nillable = true)
    protected ProductOtherInfo productOtherInfo;
    @XmlElement(name = "TaxDetails", required = true, nillable = true)
    protected TaxDetails taxDetails;
    @XmlElement(name = "IgnoreCATaxrule")
    protected boolean ignoreCATaxrule;
    @XmlElement(name = "TaxMethodCode", required = true)
    protected String taxMethodCode;
    @XmlElement(name = "KitComponent")
    protected boolean kitComponent;
    @XmlElement(name = "DeviceActive")
    protected boolean deviceActive;
    @XmlElement(name = "TaxGroupCode", required = true, nillable = true)
    protected String taxGroupCode;

    /**
     * Gets the value of the nyGrossReceiptRate property.
     * 
     */
    public double getNyGrossReceiptRate() {
        return nyGrossReceiptRate;
    }

    /**
     * Sets the value of the nyGrossReceiptRate property.
     * 
     */
    public void setNyGrossReceiptRate(double value) {
        this.nyGrossReceiptRate = value;
    }

    /**
     * Gets the value of the nyCityGrossReceiptRate property.
     * 
     */
    public double getNyCityGrossReceiptRate() {
        return nyCityGrossReceiptRate;
    }

    /**
     * Sets the value of the nyCityGrossReceiptRate property.
     * 
     */
    public void setNyCityGrossReceiptRate(double value) {
        this.nyCityGrossReceiptRate = value;
    }

    /**
     * Gets the value of the storeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreFlag() {
        return storeFlag;
    }

    /**
     * Sets the value of the storeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreFlag(String value) {
        this.storeFlag = value;
    }

    /**
     * Gets the value of the riGrossReceiptRate property.
     * 
     */
    public double getRiGrossReceiptRate() {
        return riGrossReceiptRate;
    }

    /**
     * Sets the value of the riGrossReceiptRate property.
     * 
     */
    public void setRiGrossReceiptRate(double value) {
        this.riGrossReceiptRate = value;
    }

    /**
     * Gets the value of the exemptTaxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptTaxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptTaxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getExemptTaxId() {
        if (exemptTaxId == null) {
            exemptTaxId = new ArrayList<Integer>();
        }
        return this.exemptTaxId;
    }

    /**
     * Gets the value of the productOtherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOtherInfo }
     *     
     */
    public ProductOtherInfo getProductOtherInfo() {
        return productOtherInfo;
    }

    /**
     * Sets the value of the productOtherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOtherInfo }
     *     
     */
    public void setProductOtherInfo(ProductOtherInfo value) {
        this.productOtherInfo = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetails }
     *     
     */
    public TaxDetails getTaxDetails() {
        return taxDetails;
    }

    /**
     * Sets the value of the taxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetails }
     *     
     */
    public void setTaxDetails(TaxDetails value) {
        this.taxDetails = value;
    }

    /**
     * Gets the value of the ignoreCATaxrule property.
     * 
     */
    public boolean isIgnoreCATaxrule() {
        return ignoreCATaxrule;
    }

    /**
     * Sets the value of the ignoreCATaxrule property.
     * 
     */
    public void setIgnoreCATaxrule(boolean value) {
        this.ignoreCATaxrule = value;
    }

    /**
     * Gets the value of the taxMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethodCode() {
        return taxMethodCode;
    }

    /**
     * Sets the value of the taxMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethodCode(String value) {
        this.taxMethodCode = value;
    }

    /**
     * Gets the value of the kitComponent property.
     * 
     */
    public boolean isKitComponent() {
        return kitComponent;
    }

    /**
     * Sets the value of the kitComponent property.
     * 
     */
    public void setKitComponent(boolean value) {
        this.kitComponent = value;
    }

    /**
     * Gets the value of the deviceActive property.
     * 
     */
    public boolean isDeviceActive() {
        return deviceActive;
    }

    /**
     * Sets the value of the deviceActive property.
     * 
     */
    public void setDeviceActive(boolean value) {
        this.deviceActive = value;
    }

    /**
     * Gets the value of the taxGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroupCode() {
        return taxGroupCode;
    }

    /**
     * Sets the value of the taxGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroupCode(String value) {
        this.taxGroupCode = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCalculateTaxesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCalculateTaxesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxInfoList" type="{java:com.spcs.retailservices.domain}TaxInfoList" minOccurs="0"/&gt;
 *         &lt;element name="SkuErrorInfoList" type="{java:com.spcs.retailservices.domain}SkuErrorInfoList" minOccurs="0"/&gt;
 *         &lt;element name="StoreInfo" type="{java:com.spcs.retailservices.domain}StoreInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCalculateTaxesResponse", propOrder = {
    "taxInfoList",
    "skuErrorInfoList",
    "storeInfo"
})
public class QueryCalculateTaxesResponse
    extends Response
{

    @XmlElementRef(name = "TaxInfoList", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxInfoList> taxInfoList;
    @XmlElementRef(name = "SkuErrorInfoList", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<SkuErrorInfoList> skuErrorInfoList;
    @XmlElementRef(name = "StoreInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<StoreInfo> storeInfo;

    /**
     * Gets the value of the taxInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxInfoList }{@code >}
     *     
     */
    public JAXBElement<TaxInfoList> getTaxInfoList() {
        return taxInfoList;
    }

    /**
     * Sets the value of the taxInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxInfoList }{@code >}
     *     
     */
    public void setTaxInfoList(JAXBElement<TaxInfoList> value) {
        this.taxInfoList = value;
    }

    /**
     * Gets the value of the skuErrorInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SkuErrorInfoList }{@code >}
     *     
     */
    public JAXBElement<SkuErrorInfoList> getSkuErrorInfoList() {
        return skuErrorInfoList;
    }

    /**
     * Sets the value of the skuErrorInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SkuErrorInfoList }{@code >}
     *     
     */
    public void setSkuErrorInfoList(JAXBElement<SkuErrorInfoList> value) {
        this.skuErrorInfoList = value;
    }

    /**
     * Gets the value of the storeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StoreInfo }{@code >}
     *     
     */
    public JAXBElement<StoreInfo> getStoreInfo() {
        return storeInfo;
    }

    /**
     * Sets the value of the storeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StoreInfo }{@code >}
     *     
     */
    public void setStoreInfo(JAXBElement<StoreInfo> value) {
        this.storeInfo = value;
    }

}

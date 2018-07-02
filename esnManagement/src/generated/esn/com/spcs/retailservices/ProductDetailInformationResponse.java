
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDetailInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailInformationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductBasicInfo" type="{java:com.spcs.retailservices.domain}ProductBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="ProductOtherInfo" type="{java:com.spcs.retailservices.domain}ProductOtherInfo"/&gt;
 *         &lt;element name="RetValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrepaidSkuList" type="{java:com.spcs.retailservices.domain}PrepaidSkuList" minOccurs="0"/&gt;
 *         &lt;element name="SourceSkuInfo" type="{java:com.spcs.retailservices.domain}SourceSkuInfo" minOccurs="0"/&gt;
 *         &lt;element name="ErrorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailInformationResponse", propOrder = {
    "productBasicInfo",
    "productOtherInfo",
    "retValue",
    "prepaidSkuList",
    "sourceSkuInfo",
    "errorInfo"
})
public class ProductDetailInformationResponse
    extends Response
{

    @XmlElement(name = "ProductBasicInfo")
    protected ProductBasicInfo productBasicInfo;
    @XmlElement(name = "ProductOtherInfo", required = true, nillable = true)
    protected ProductOtherInfo productOtherInfo;
    @XmlElement(name = "RetValue", required = true, type = Integer.class, nillable = true)
    protected Integer retValue;
    @XmlElement(name = "PrepaidSkuList")
    protected PrepaidSkuList prepaidSkuList;
    @XmlElement(name = "SourceSkuInfo")
    protected SourceSkuInfo sourceSkuInfo;
    @XmlElement(name = "ErrorInfo")
    protected ErrorInfo errorInfo;

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
     * Gets the value of the retValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetValue() {
        return retValue;
    }

    /**
     * Sets the value of the retValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetValue(Integer value) {
        this.retValue = value;
    }

    /**
     * Gets the value of the prepaidSkuList property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidSkuList }
     *     
     */
    public PrepaidSkuList getPrepaidSkuList() {
        return prepaidSkuList;
    }

    /**
     * Sets the value of the prepaidSkuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidSkuList }
     *     
     */
    public void setPrepaidSkuList(PrepaidSkuList value) {
        this.prepaidSkuList = value;
    }

    /**
     * Gets the value of the sourceSkuInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SourceSkuInfo }
     *     
     */
    public SourceSkuInfo getSourceSkuInfo() {
        return sourceSkuInfo;
    }

    /**
     * Sets the value of the sourceSkuInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceSkuInfo }
     *     
     */
    public void setSourceSkuInfo(SourceSkuInfo value) {
        this.sourceSkuInfo = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorInfo }
     *     
     */
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorInfo }
     *     
     */
    public void setErrorInfo(ErrorInfo value) {
        this.errorInfo = value;
    }

}

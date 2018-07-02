
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryConsignedEmployeeIdentityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryConsignedEmployeeIdentityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SalesRepIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductBaseInfo" type="{java:com.spcs.retailservices.domain}ProductBasicInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryConsignedEmployeeIdentityRequest", propOrder = {
    "serialNumber",
    "salesRepIdentifier",
    "productBaseInfo"
})
public class QueryConsignedEmployeeIdentityRequest
    extends Request
{

    @XmlElement(name = "SerialNumber", required = true, nillable = true)
    protected String serialNumber;
    @XmlElement(name = "SalesRepIdentifier", required = true, nillable = true)
    protected String salesRepIdentifier;
    @XmlElement(name = "ProductBaseInfo", required = true, nillable = true)
    protected ProductBasicInfo productBaseInfo;

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
     * Gets the value of the salesRepIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepIdentifier() {
        return salesRepIdentifier;
    }

    /**
     * Sets the value of the salesRepIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepIdentifier(String value) {
        this.salesRepIdentifier = value;
    }

    /**
     * Gets the value of the productBaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductBasicInfo }
     *     
     */
    public ProductBasicInfo getProductBaseInfo() {
        return productBaseInfo;
    }

    /**
     * Sets the value of the productBaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBasicInfo }
     *     
     */
    public void setProductBaseInfo(ProductBasicInfo value) {
        this.productBaseInfo = value;
    }

}

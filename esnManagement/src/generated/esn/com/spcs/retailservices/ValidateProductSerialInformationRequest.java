
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateProductSerialInformationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateProductSerialInformationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DeviceInfo" type="{java:com.spcs.retailservices.domain}DeviceInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateProductSerialInformationRequest", propOrder = {
    "productTypeCode",
    "transactionTypeCode",
    "deviceInfo"
})
public class ValidateProductSerialInformationRequest
    extends Request
{

    @XmlElement(name = "ProductTypeCode", required = true, nillable = true)
    protected String productTypeCode;
    @XmlElement(name = "TransactionTypeCode")
    protected int transactionTypeCode;
    @XmlElement(name = "DeviceInfo", required = true, nillable = true)
    protected DeviceInfo deviceInfo;

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
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
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInfo }
     *     
     */
    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInfo }
     *     
     */
    public void setDeviceInfo(DeviceInfo value) {
        this.deviceInfo = value;
    }

}

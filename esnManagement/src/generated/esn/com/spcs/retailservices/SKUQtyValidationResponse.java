
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SKUQtyValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUQtyValidationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RtrnString1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RtrnString2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LineItemConsigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProductOnhandByStore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductTypeGroupCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUQtyValidationResponse", propOrder = {
    "rtrnString1",
    "rtrnString2",
    "lineItemConsigned",
    "productOnhandByStore",
    "productTypeGroupCode",
    "returnValue"
})
public class SKUQtyValidationResponse
    extends Response
{

    @XmlElement(name = "RtrnString1", required = true, nillable = true)
    protected String rtrnString1;
    @XmlElement(name = "RtrnString2", required = true, nillable = true)
    protected String rtrnString2;
    @XmlElement(name = "LineItemConsigned")
    protected boolean lineItemConsigned;
    @XmlElement(name = "ProductOnhandByStore")
    protected int productOnhandByStore;
    @XmlElement(name = "ProductTypeGroupCode")
    protected int productTypeGroupCode;
    @XmlElement(name = "ReturnValue")
    protected int returnValue;

    /**
     * Gets the value of the rtrnString1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrnString1() {
        return rtrnString1;
    }

    /**
     * Sets the value of the rtrnString1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtrnString1(String value) {
        this.rtrnString1 = value;
    }

    /**
     * Gets the value of the rtrnString2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrnString2() {
        return rtrnString2;
    }

    /**
     * Sets the value of the rtrnString2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtrnString2(String value) {
        this.rtrnString2 = value;
    }

    /**
     * Gets the value of the lineItemConsigned property.
     * 
     */
    public boolean isLineItemConsigned() {
        return lineItemConsigned;
    }

    /**
     * Sets the value of the lineItemConsigned property.
     * 
     */
    public void setLineItemConsigned(boolean value) {
        this.lineItemConsigned = value;
    }

    /**
     * Gets the value of the productOnhandByStore property.
     * 
     */
    public int getProductOnhandByStore() {
        return productOnhandByStore;
    }

    /**
     * Sets the value of the productOnhandByStore property.
     * 
     */
    public void setProductOnhandByStore(int value) {
        this.productOnhandByStore = value;
    }

    /**
     * Gets the value of the productTypeGroupCode property.
     * 
     */
    public int getProductTypeGroupCode() {
        return productTypeGroupCode;
    }

    /**
     * Sets the value of the productTypeGroupCode property.
     * 
     */
    public void setProductTypeGroupCode(int value) {
        this.productTypeGroupCode = value;
    }

    /**
     * Gets the value of the returnValue property.
     * 
     */
    public int getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     */
    public void setReturnValue(int value) {
        this.returnValue = value;
    }

}

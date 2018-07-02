
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderLinesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLinesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LineActionCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WebToRetailLineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LineActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebOrderPTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLinesInfo", propOrder = {
    "lineSequenceNumber",
    "lineActionCode",
    "webToRetailLineCode",
    "productSKU",
    "lineActivity",
    "webOrderPTN"
})
public class OrderLinesInfo {

    @XmlElement(name = "LineSequenceNumber")
    protected int lineSequenceNumber;
    @XmlElement(name = "LineActionCode", required = true)
    protected String lineActionCode;
    @XmlElement(name = "WebToRetailLineCode", required = true)
    protected String webToRetailLineCode;
    @XmlElement(name = "ProductSKU", required = true)
    protected String productSKU;
    @XmlElementRef(name = "LineActivity", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineActivity;
    @XmlElementRef(name = "WebOrderPTN", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webOrderPTN;

    /**
     * Gets the value of the lineSequenceNumber property.
     * 
     */
    public int getLineSequenceNumber() {
        return lineSequenceNumber;
    }

    /**
     * Sets the value of the lineSequenceNumber property.
     * 
     */
    public void setLineSequenceNumber(int value) {
        this.lineSequenceNumber = value;
    }

    /**
     * Gets the value of the lineActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineActionCode() {
        return lineActionCode;
    }

    /**
     * Sets the value of the lineActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineActionCode(String value) {
        this.lineActionCode = value;
    }

    /**
     * Gets the value of the webToRetailLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebToRetailLineCode() {
        return webToRetailLineCode;
    }

    /**
     * Sets the value of the webToRetailLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebToRetailLineCode(String value) {
        this.webToRetailLineCode = value;
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
     * Gets the value of the lineActivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineActivity() {
        return lineActivity;
    }

    /**
     * Sets the value of the lineActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineActivity(JAXBElement<String> value) {
        this.lineActivity = value;
    }

    /**
     * Gets the value of the webOrderPTN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebOrderPTN() {
        return webOrderPTN;
    }

    /**
     * Sets the value of the webOrderPTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebOrderPTN(JAXBElement<String> value) {
        this.webOrderPTN = value;
    }

}

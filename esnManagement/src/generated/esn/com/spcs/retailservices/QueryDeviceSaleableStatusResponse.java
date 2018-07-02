
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceSaleableStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceSaleableStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isSaleable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "QueryDeviceSaleableStatusResponse", propOrder = {
    "isSaleable",
    "errorInfo"
})
public class QueryDeviceSaleableStatusResponse
    extends Response
{

    protected String isSaleable;
    @XmlElement(name = "ErrorInfo")
    protected ErrorInfo errorInfo;

    /**
     * Gets the value of the isSaleable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSaleable() {
        return isSaleable;
    }

    /**
     * Sets the value of the isSaleable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSaleable(String value) {
        this.isSaleable = value;
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

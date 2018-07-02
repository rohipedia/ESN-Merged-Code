
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryWebOrderListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryWebOrderListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="successIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="webOrderDetailsInfoList" type="{java:com.spcs.retailservices.domain}WebOrderDetailsInfoList"/&gt;
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
@XmlType(name = "QueryWebOrderListResponse", propOrder = {
    "successIndicator",
    "webOrderDetailsInfoList",
    "errorInfo"
})
public class QueryWebOrderListResponse
    extends Response
{

    protected boolean successIndicator;
    @XmlElement(required = true)
    protected WebOrderDetailsInfoList webOrderDetailsInfoList;
    @XmlElement(name = "ErrorInfo")
    protected ErrorInfo errorInfo;

    /**
     * Gets the value of the successIndicator property.
     * 
     */
    public boolean isSuccessIndicator() {
        return successIndicator;
    }

    /**
     * Sets the value of the successIndicator property.
     * 
     */
    public void setSuccessIndicator(boolean value) {
        this.successIndicator = value;
    }

    /**
     * Gets the value of the webOrderDetailsInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link WebOrderDetailsInfoList }
     *     
     */
    public WebOrderDetailsInfoList getWebOrderDetailsInfoList() {
        return webOrderDetailsInfoList;
    }

    /**
     * Sets the value of the webOrderDetailsInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebOrderDetailsInfoList }
     *     
     */
    public void setWebOrderDetailsInfoList(WebOrderDetailsInfoList value) {
        this.webOrderDetailsInfoList = value;
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

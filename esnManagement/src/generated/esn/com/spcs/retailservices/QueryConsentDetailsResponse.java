
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryConsentDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryConsentDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="ConsentInfoList" type="{java:com.spcs.retailservices.domain}ConsentDetailList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryConsentDetailsResponse", propOrder = {
    "successIndicator",
    "errorInfo",
    "consentInfoList"
})
public class QueryConsentDetailsResponse
    extends Response
{

    @XmlElement(name = "SuccessIndicator")
    protected boolean successIndicator;
    @XmlElement(name = "ErrorInfo")
    protected ErrorInfo errorInfo;
    @XmlElement(name = "ConsentInfoList")
    protected ConsentDetailList consentInfoList;

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

    /**
     * Gets the value of the consentInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentDetailList }
     *     
     */
    public ConsentDetailList getConsentInfoList() {
        return consentInfoList;
    }

    /**
     * Sets the value of the consentInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentDetailList }
     *     
     */
    public void setConsentInfoList(ConsentDetailList value) {
        this.consentInfoList = value;
    }

}

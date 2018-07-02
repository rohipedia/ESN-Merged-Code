
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryInstallmentConsentDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryInstallmentConsentDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="StoreErrorInfo" type="{java:com.spcs.retailservices.domain}StoreErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="ConsentInfoList" type="{java:com.spcs.retailservices.domain}ConsentInfoList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInstallmentConsentDetailsResponse", propOrder = {
    "successIndicator",
    "errorInfo",
    "storeErrorInfo",
    "consentInfoList"
})
public class QueryInstallmentConsentDetailsResponse
    extends Response
{

    @XmlElement(name = "SuccessIndicator")
    protected boolean successIndicator;
    @XmlElementRef(name = "ErrorInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrorInfo> errorInfo;
    @XmlElementRef(name = "StoreErrorInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<StoreErrorInfo> storeErrorInfo;
    @XmlElementRef(name = "ConsentInfoList", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsentInfoList> consentInfoList;

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
     *     {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}
     *     
     */
    public JAXBElement<ErrorInfo> getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}
     *     
     */
    public void setErrorInfo(JAXBElement<ErrorInfo> value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the storeErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StoreErrorInfo }{@code >}
     *     
     */
    public JAXBElement<StoreErrorInfo> getStoreErrorInfo() {
        return storeErrorInfo;
    }

    /**
     * Sets the value of the storeErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StoreErrorInfo }{@code >}
     *     
     */
    public void setStoreErrorInfo(JAXBElement<StoreErrorInfo> value) {
        this.storeErrorInfo = value;
    }

    /**
     * Gets the value of the consentInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsentInfoList }{@code >}
     *     
     */
    public JAXBElement<ConsentInfoList> getConsentInfoList() {
        return consentInfoList;
    }

    /**
     * Sets the value of the consentInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsentInfoList }{@code >}
     *     
     */
    public void setConsentInfoList(JAXBElement<ConsentInfoList> value) {
        this.consentInfoList = value;
    }

}

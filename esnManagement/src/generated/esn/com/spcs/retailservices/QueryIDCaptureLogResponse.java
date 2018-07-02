
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryIDCaptureLogResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryIDCaptureLogResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="successIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="errorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="withinTimeRange" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="homeCreditReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consentNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryIDCaptureLogResponse", propOrder = {
    "successIndicator",
    "errorInfo",
    "withinTimeRange",
    "homeCreditReferenceCode",
    "consentNumber"
})
public class QueryIDCaptureLogResponse
    extends Response
{

    protected boolean successIndicator;
    protected ErrorInfo errorInfo;
    protected boolean withinTimeRange;
    protected String homeCreditReferenceCode;
    protected int consentNumber;

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
     * Gets the value of the withinTimeRange property.
     * 
     */
    public boolean isWithinTimeRange() {
        return withinTimeRange;
    }

    /**
     * Sets the value of the withinTimeRange property.
     * 
     */
    public void setWithinTimeRange(boolean value) {
        this.withinTimeRange = value;
    }

    /**
     * Gets the value of the homeCreditReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCreditReferenceCode() {
        return homeCreditReferenceCode;
    }

    /**
     * Sets the value of the homeCreditReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCreditReferenceCode(String value) {
        this.homeCreditReferenceCode = value;
    }

    /**
     * Gets the value of the consentNumber property.
     * 
     */
    public int getConsentNumber() {
        return consentNumber;
    }

    /**
     * Sets the value of the consentNumber property.
     * 
     */
    public void setConsentNumber(int value) {
        this.consentNumber = value;
    }

}

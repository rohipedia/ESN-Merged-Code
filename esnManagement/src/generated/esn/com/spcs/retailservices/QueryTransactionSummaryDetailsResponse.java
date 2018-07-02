
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTransactionSummaryDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTransactionSummaryDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="successIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="errorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="transSummaryInfo" type="{java:com.spcs.retailservices.domain}TransSummaryInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTransactionSummaryDetailsResponse", propOrder = {
    "successIndicator",
    "errorInfo",
    "transSummaryInfo"
})
public class QueryTransactionSummaryDetailsResponse
    extends Response
{

    protected boolean successIndicator;
    protected ErrorInfo errorInfo;
    protected TransSummaryInfo transSummaryInfo;

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
     * Gets the value of the transSummaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransSummaryInfo }
     *     
     */
    public TransSummaryInfo getTransSummaryInfo() {
        return transSummaryInfo;
    }

    /**
     * Sets the value of the transSummaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransSummaryInfo }
     *     
     */
    public void setTransSummaryInfo(TransSummaryInfo value) {
        this.transSummaryInfo = value;
    }

}

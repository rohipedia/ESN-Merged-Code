
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPendingPaymentListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPendingPaymentListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StoreErrorInfo" type="{java:com.spcs.retailservices.domain}StoreErrorInfo"/&gt;
 *         &lt;element name="PaymentList" type="{java:com.spcs.retailservices.domain}PaymentList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPendingPaymentListResponse", propOrder = {
    "successIndicator",
    "storeErrorInfo",
    "paymentList"
})
public class QueryPendingPaymentListResponse
    extends Response
{

    @XmlElement(name = "SuccessIndicator", required = true, type = Boolean.class, nillable = true)
    protected Boolean successIndicator;
    @XmlElement(name = "StoreErrorInfo", required = true, nillable = true)
    protected StoreErrorInfo storeErrorInfo;
    @XmlElement(name = "PaymentList", required = true, nillable = true)
    protected PaymentList paymentList;

    /**
     * Gets the value of the successIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccessIndicator() {
        return successIndicator;
    }

    /**
     * Sets the value of the successIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccessIndicator(Boolean value) {
        this.successIndicator = value;
    }

    /**
     * Gets the value of the storeErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreErrorInfo }
     *     
     */
    public StoreErrorInfo getStoreErrorInfo() {
        return storeErrorInfo;
    }

    /**
     * Sets the value of the storeErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreErrorInfo }
     *     
     */
    public void setStoreErrorInfo(StoreErrorInfo value) {
        this.storeErrorInfo = value;
    }

    /**
     * Gets the value of the paymentList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentList }
     *     
     */
    public PaymentList getPaymentList() {
        return paymentList;
    }

    /**
     * Sets the value of the paymentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentList }
     *     
     */
    public void setPaymentList(PaymentList value) {
        this.paymentList = value;
    }

}

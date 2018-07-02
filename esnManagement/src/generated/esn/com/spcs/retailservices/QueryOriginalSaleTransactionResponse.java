
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOriginalSaleTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOriginalSaleTransactionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="successIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="errorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="transFindInfo" type="{java:com.spcs.retailservices.domain}TransFindInfo"/&gt;
 *         &lt;element name="transHeaderList" type="{java:com.spcs.retailservices.domain}TransHeaderList"/&gt;
 *         &lt;element name="transactionDetailList" type="{java:com.spcs.retailservices.domain}TransactionDetailList"/&gt;
 *         &lt;element name="transactionDiscountRetList" type="{java:com.spcs.retailservices.domain}TransactionDiscountRetList"/&gt;
 *         &lt;element name="prevReturnDetailList" type="{java:com.spcs.retailservices.domain}PrevReturnDetailList"/&gt;
 *         &lt;element name="transactionTaxList" type="{java:com.spcs.retailservices.domain}TransactionTaxList"/&gt;
 *         &lt;element name="previousReturnsInfo" type="{java:com.spcs.retailservices.domain}PreviousReturnsInfo"/&gt;
 *         &lt;element name="transTenderList" type="{java:com.spcs.retailservices.domain}TransTenderList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOriginalSaleTransactionResponse", propOrder = {
    "successIndicator",
    "errorInfo",
    "transFindInfo",
    "transHeaderList",
    "transactionDetailList",
    "transactionDiscountRetList",
    "prevReturnDetailList",
    "transactionTaxList",
    "previousReturnsInfo",
    "transTenderList"
})
public class QueryOriginalSaleTransactionResponse
    extends Response
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean successIndicator;
    protected ErrorInfo errorInfo;
    @XmlElement(required = true, nillable = true)
    protected TransFindInfo transFindInfo;
    @XmlElement(required = true, nillable = true)
    protected TransHeaderList transHeaderList;
    @XmlElement(required = true, nillable = true)
    protected TransactionDetailList transactionDetailList;
    @XmlElement(required = true, nillable = true)
    protected TransactionDiscountRetList transactionDiscountRetList;
    @XmlElement(required = true, nillable = true)
    protected PrevReturnDetailList prevReturnDetailList;
    @XmlElement(required = true, nillable = true)
    protected TransactionTaxList transactionTaxList;
    @XmlElement(required = true, nillable = true)
    protected PreviousReturnsInfo previousReturnsInfo;
    @XmlElement(required = true, nillable = true)
    protected TransTenderList transTenderList;

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
     * Gets the value of the transFindInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransFindInfo }
     *     
     */
    public TransFindInfo getTransFindInfo() {
        return transFindInfo;
    }

    /**
     * Sets the value of the transFindInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransFindInfo }
     *     
     */
    public void setTransFindInfo(TransFindInfo value) {
        this.transFindInfo = value;
    }

    /**
     * Gets the value of the transHeaderList property.
     * 
     * @return
     *     possible object is
     *     {@link TransHeaderList }
     *     
     */
    public TransHeaderList getTransHeaderList() {
        return transHeaderList;
    }

    /**
     * Sets the value of the transHeaderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransHeaderList }
     *     
     */
    public void setTransHeaderList(TransHeaderList value) {
        this.transHeaderList = value;
    }

    /**
     * Gets the value of the transactionDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetailList }
     *     
     */
    public TransactionDetailList getTransactionDetailList() {
        return transactionDetailList;
    }

    /**
     * Sets the value of the transactionDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetailList }
     *     
     */
    public void setTransactionDetailList(TransactionDetailList value) {
        this.transactionDetailList = value;
    }

    /**
     * Gets the value of the transactionDiscountRetList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDiscountRetList }
     *     
     */
    public TransactionDiscountRetList getTransactionDiscountRetList() {
        return transactionDiscountRetList;
    }

    /**
     * Sets the value of the transactionDiscountRetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDiscountRetList }
     *     
     */
    public void setTransactionDiscountRetList(TransactionDiscountRetList value) {
        this.transactionDiscountRetList = value;
    }

    /**
     * Gets the value of the prevReturnDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link PrevReturnDetailList }
     *     
     */
    public PrevReturnDetailList getPrevReturnDetailList() {
        return prevReturnDetailList;
    }

    /**
     * Sets the value of the prevReturnDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevReturnDetailList }
     *     
     */
    public void setPrevReturnDetailList(PrevReturnDetailList value) {
        this.prevReturnDetailList = value;
    }

    /**
     * Gets the value of the transactionTaxList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTaxList }
     *     
     */
    public TransactionTaxList getTransactionTaxList() {
        return transactionTaxList;
    }

    /**
     * Sets the value of the transactionTaxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTaxList }
     *     
     */
    public void setTransactionTaxList(TransactionTaxList value) {
        this.transactionTaxList = value;
    }

    /**
     * Gets the value of the previousReturnsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousReturnsInfo }
     *     
     */
    public PreviousReturnsInfo getPreviousReturnsInfo() {
        return previousReturnsInfo;
    }

    /**
     * Sets the value of the previousReturnsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousReturnsInfo }
     *     
     */
    public void setPreviousReturnsInfo(PreviousReturnsInfo value) {
        this.previousReturnsInfo = value;
    }

    /**
     * Gets the value of the transTenderList property.
     * 
     * @return
     *     possible object is
     *     {@link TransTenderList }
     *     
     */
    public TransTenderList getTransTenderList() {
        return transTenderList;
    }

    /**
     * Sets the value of the transTenderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransTenderList }
     *     
     */
    public void setTransTenderList(TransTenderList value) {
        this.transTenderList = value;
    }

}

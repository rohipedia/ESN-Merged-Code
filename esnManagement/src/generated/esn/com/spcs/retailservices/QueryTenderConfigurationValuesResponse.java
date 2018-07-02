
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTenderConfigurationValuesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTenderConfigurationValuesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tenderTypeList" type="{java:com.spcs.retailservices.domain}TenderTypeList"/&gt;
 *         &lt;element name="actionTypeList" type="{java:com.spcs.retailservices.domain}ActionTypeList"/&gt;
 *         &lt;element name="overideReasonList" type="{java:com.spcs.retailservices.domain}OverideReasonList"/&gt;
 *         &lt;element name="transactionTypeList" type="{java:com.spcs.retailservices.domain}TransactionTypeList"/&gt;
 *         &lt;element name="omimReturnReasonCodeList" type="{java:com.spcs.retailservices.domain}OmimReturnReasonCodeList"/&gt;
 *         &lt;element name="bopuisTenderStatusInfoList" type="{java:com.spcs.retailservices.domain}BopuisTenderStatusInfoList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTenderConfigurationValuesResponse", propOrder = {
    "tenderTypeList",
    "actionTypeList",
    "overideReasonList",
    "transactionTypeList",
    "omimReturnReasonCodeList",
    "bopuisTenderStatusInfoList"
})
public class QueryTenderConfigurationValuesResponse
    extends Response
{

    @XmlElement(required = true)
    protected TenderTypeList tenderTypeList;
    @XmlElement(required = true)
    protected ActionTypeList actionTypeList;
    @XmlElement(required = true)
    protected OverideReasonList overideReasonList;
    @XmlElement(required = true)
    protected TransactionTypeList transactionTypeList;
    @XmlElement(required = true)
    protected OmimReturnReasonCodeList omimReturnReasonCodeList;
    @XmlElement(required = true)
    protected BopuisTenderStatusInfoList bopuisTenderStatusInfoList;

    /**
     * Gets the value of the tenderTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link TenderTypeList }
     *     
     */
    public TenderTypeList getTenderTypeList() {
        return tenderTypeList;
    }

    /**
     * Sets the value of the tenderTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderTypeList }
     *     
     */
    public void setTenderTypeList(TenderTypeList value) {
        this.tenderTypeList = value;
    }

    /**
     * Gets the value of the actionTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTypeList }
     *     
     */
    public ActionTypeList getActionTypeList() {
        return actionTypeList;
    }

    /**
     * Sets the value of the actionTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTypeList }
     *     
     */
    public void setActionTypeList(ActionTypeList value) {
        this.actionTypeList = value;
    }

    /**
     * Gets the value of the overideReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link OverideReasonList }
     *     
     */
    public OverideReasonList getOverideReasonList() {
        return overideReasonList;
    }

    /**
     * Sets the value of the overideReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverideReasonList }
     *     
     */
    public void setOverideReasonList(OverideReasonList value) {
        this.overideReasonList = value;
    }

    /**
     * Gets the value of the transactionTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeList }
     *     
     */
    public TransactionTypeList getTransactionTypeList() {
        return transactionTypeList;
    }

    /**
     * Sets the value of the transactionTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeList }
     *     
     */
    public void setTransactionTypeList(TransactionTypeList value) {
        this.transactionTypeList = value;
    }

    /**
     * Gets the value of the omimReturnReasonCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link OmimReturnReasonCodeList }
     *     
     */
    public OmimReturnReasonCodeList getOmimReturnReasonCodeList() {
        return omimReturnReasonCodeList;
    }

    /**
     * Sets the value of the omimReturnReasonCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OmimReturnReasonCodeList }
     *     
     */
    public void setOmimReturnReasonCodeList(OmimReturnReasonCodeList value) {
        this.omimReturnReasonCodeList = value;
    }

    /**
     * Gets the value of the bopuisTenderStatusInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link BopuisTenderStatusInfoList }
     *     
     */
    public BopuisTenderStatusInfoList getBopuisTenderStatusInfoList() {
        return bopuisTenderStatusInfoList;
    }

    /**
     * Sets the value of the bopuisTenderStatusInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BopuisTenderStatusInfoList }
     *     
     */
    public void setBopuisTenderStatusInfoList(BopuisTenderStatusInfoList value) {
        this.bopuisTenderStatusInfoList = value;
    }

}

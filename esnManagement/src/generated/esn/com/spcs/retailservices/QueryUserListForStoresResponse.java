
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryUserListForStoresResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryUserListForStoresResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="StoreList" type="{java:com.spcs.retailservices.domain}StoreList"/&gt;
 *         &lt;element name="MoreGroupsInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryUserListForStoresResponse", propOrder = {
    "successIndicator",
    "errorInfo",
    "storeList",
    "moreGroupsInd"
})
public class QueryUserListForStoresResponse
    extends Response
{

    @XmlElement(name = "SuccessIndicator")
    protected boolean successIndicator;
    @XmlElement(name = "ErrorInfo")
    protected ErrorInfo errorInfo;
    @XmlElement(name = "StoreList", required = true)
    protected StoreList storeList;
    @XmlElement(name = "MoreGroupsInd")
    protected boolean moreGroupsInd;

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
     * Gets the value of the storeList property.
     * 
     * @return
     *     possible object is
     *     {@link StoreList }
     *     
     */
    public StoreList getStoreList() {
        return storeList;
    }

    /**
     * Sets the value of the storeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreList }
     *     
     */
    public void setStoreList(StoreList value) {
        this.storeList = value;
    }

    /**
     * Gets the value of the moreGroupsInd property.
     * 
     */
    public boolean isMoreGroupsInd() {
        return moreGroupsInd;
    }

    /**
     * Sets the value of the moreGroupsInd property.
     * 
     */
    public void setMoreGroupsInd(boolean value) {
        this.moreGroupsInd = value;
    }

}

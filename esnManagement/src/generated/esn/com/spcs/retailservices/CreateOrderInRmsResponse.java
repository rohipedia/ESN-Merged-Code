
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOrderInRmsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderInRmsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RMSOrderNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserErrorInfo" type="{java:com.spcs.retailservices.domain}UserErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingCartStoreErrorInfo" type="{java:com.spcs.retailservices.domain}ShoppingCartStoreErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingCartSkuErrorInfoList" type="{java:com.spcs.retailservices.domain}ShoppingCartSkuErrorInfoList" minOccurs="0"/&gt;
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
@XmlType(name = "CreateOrderInRmsResponse", propOrder = {
    "successIndicator",
    "rmsOrderNo",
    "userErrorInfo",
    "shoppingCartStoreErrorInfo",
    "shoppingCartSkuErrorInfoList",
    "errorInfo"
})
public class CreateOrderInRmsResponse
    extends Response
{

    @XmlElement(name = "SuccessIndicator")
    protected boolean successIndicator;
    @XmlElement(name = "RMSOrderNo")
    protected int rmsOrderNo;
    @XmlElementRef(name = "UserErrorInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<UserErrorInfo> userErrorInfo;
    @XmlElementRef(name = "ShoppingCartStoreErrorInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<ShoppingCartStoreErrorInfo> shoppingCartStoreErrorInfo;
    @XmlElementRef(name = "ShoppingCartSkuErrorInfoList", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<ShoppingCartSkuErrorInfoList> shoppingCartSkuErrorInfoList;
    @XmlElementRef(name = "ErrorInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrorInfo> errorInfo;

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
     * Gets the value of the rmsOrderNo property.
     * 
     */
    public int getRMSOrderNo() {
        return rmsOrderNo;
    }

    /**
     * Sets the value of the rmsOrderNo property.
     * 
     */
    public void setRMSOrderNo(int value) {
        this.rmsOrderNo = value;
    }

    /**
     * Gets the value of the userErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserErrorInfo }{@code >}
     *     
     */
    public JAXBElement<UserErrorInfo> getUserErrorInfo() {
        return userErrorInfo;
    }

    /**
     * Sets the value of the userErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserErrorInfo }{@code >}
     *     
     */
    public void setUserErrorInfo(JAXBElement<UserErrorInfo> value) {
        this.userErrorInfo = value;
    }

    /**
     * Gets the value of the shoppingCartStoreErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShoppingCartStoreErrorInfo }{@code >}
     *     
     */
    public JAXBElement<ShoppingCartStoreErrorInfo> getShoppingCartStoreErrorInfo() {
        return shoppingCartStoreErrorInfo;
    }

    /**
     * Sets the value of the shoppingCartStoreErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShoppingCartStoreErrorInfo }{@code >}
     *     
     */
    public void setShoppingCartStoreErrorInfo(JAXBElement<ShoppingCartStoreErrorInfo> value) {
        this.shoppingCartStoreErrorInfo = value;
    }

    /**
     * Gets the value of the shoppingCartSkuErrorInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShoppingCartSkuErrorInfoList }{@code >}
     *     
     */
    public JAXBElement<ShoppingCartSkuErrorInfoList> getShoppingCartSkuErrorInfoList() {
        return shoppingCartSkuErrorInfoList;
    }

    /**
     * Sets the value of the shoppingCartSkuErrorInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShoppingCartSkuErrorInfoList }{@code >}
     *     
     */
    public void setShoppingCartSkuErrorInfoList(JAXBElement<ShoppingCartSkuErrorInfoList> value) {
        this.shoppingCartSkuErrorInfoList = value;
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

}

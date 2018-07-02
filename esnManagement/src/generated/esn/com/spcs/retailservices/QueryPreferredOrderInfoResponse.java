
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPreferredOrderInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPreferredOrderInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="PreffOrderInfo" type="{java:com.spcs.retailservices.domain}PreffOrderInfo" minOccurs="0"/&gt;
 *         &lt;element name="ItemsList" type="{java:com.spcs.retailservices.domain}ItemsList" minOccurs="0"/&gt;
 *         &lt;element name="TendersList" type="{java:com.spcs.retailservices.domain}TendersList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPreferredOrderInfoResponse", propOrder = {
    "successIndicator",
    "errorInfo",
    "preffOrderInfo",
    "itemsList",
    "tendersList"
})
public class QueryPreferredOrderInfoResponse
    extends Response
{

    @XmlElement(name = "SuccessIndicator")
    protected boolean successIndicator;
    @XmlElementRef(name = "ErrorInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrorInfo> errorInfo;
    @XmlElementRef(name = "PreffOrderInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<PreffOrderInfo> preffOrderInfo;
    @XmlElement(name = "ItemsList")
    protected ItemsList itemsList;
    @XmlElement(name = "TendersList")
    protected TendersList tendersList;

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
     * Gets the value of the preffOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PreffOrderInfo }{@code >}
     *     
     */
    public JAXBElement<PreffOrderInfo> getPreffOrderInfo() {
        return preffOrderInfo;
    }

    /**
     * Sets the value of the preffOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PreffOrderInfo }{@code >}
     *     
     */
    public void setPreffOrderInfo(JAXBElement<PreffOrderInfo> value) {
        this.preffOrderInfo = value;
    }

    /**
     * Gets the value of the itemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemsList }
     *     
     */
    public ItemsList getItemsList() {
        return itemsList;
    }

    /**
     * Sets the value of the itemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemsList }
     *     
     */
    public void setItemsList(ItemsList value) {
        this.itemsList = value;
    }

    /**
     * Gets the value of the tendersList property.
     * 
     * @return
     *     possible object is
     *     {@link TendersList }
     *     
     */
    public TendersList getTendersList() {
        return tendersList;
    }

    /**
     * Sets the value of the tendersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TendersList }
     *     
     */
    public void setTendersList(TendersList value) {
        this.tendersList = value;
    }

}

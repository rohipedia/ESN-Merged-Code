
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebOrderDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebOrderDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="webOrderInfo" type="{java:com.spcs.retailservices.domain}WebOrderInfo"/&gt;
 *         &lt;element name="contactInfo" type="{java:com.spcs.retailservices.domain}ContactInfoType"/&gt;
 *         &lt;element name="itemsList" type="{java:com.spcs.retailservices.domain}WebOrderItemsList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebOrderDetailsInfo", propOrder = {
    "webOrderInfo",
    "contactInfo",
    "itemsList"
})
public class WebOrderDetailsInfo {

    @XmlElement(required = true)
    protected WebOrderInfo webOrderInfo;
    @XmlElement(required = true)
    protected ContactInfoType contactInfo;
    @XmlElement(required = true)
    protected WebOrderItemsList itemsList;

    /**
     * Gets the value of the webOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WebOrderInfo }
     *     
     */
    public WebOrderInfo getWebOrderInfo() {
        return webOrderInfo;
    }

    /**
     * Sets the value of the webOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebOrderInfo }
     *     
     */
    public void setWebOrderInfo(WebOrderInfo value) {
        this.webOrderInfo = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the itemsList property.
     * 
     * @return
     *     possible object is
     *     {@link WebOrderItemsList }
     *     
     */
    public WebOrderItemsList getItemsList() {
        return itemsList;
    }

    /**
     * Sets the value of the itemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebOrderItemsList }
     *     
     */
    public void setItemsList(WebOrderItemsList value) {
        this.itemsList = value;
    }

}

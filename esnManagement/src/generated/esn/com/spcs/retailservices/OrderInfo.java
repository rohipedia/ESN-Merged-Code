
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorStatusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderActionCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreIdentifierTimetrade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ban" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInfo" type="{java:com.spcs.retailservices.domain}PaymentInfo" minOccurs="0"/&gt;
 *         &lt;element name="AppointmentInfo" type="{java:com.spcs.retailservices.domain}AppointmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="OrderLinesList" type="{java:com.spcs.retailservices.domain}OrderLinesList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfo", propOrder = {
    "orderKey",
    "orderStatus",
    "errorStatusInd",
    "orderActionCode",
    "storeIdentifierTimetrade",
    "ban",
    "paymentInfo",
    "appointmentInfo",
    "orderLinesList"
})
public class OrderInfo {

    @XmlElement(name = "OrderKey", required = true)
    protected String orderKey;
    @XmlElement(name = "OrderStatus", required = true)
    protected String orderStatus;
    @XmlElement(name = "ErrorStatusInd")
    protected Boolean errorStatusInd;
    @XmlElement(name = "OrderActionCode", required = true)
    protected String orderActionCode;
    @XmlElement(name = "StoreIdentifierTimetrade", required = true)
    protected String storeIdentifierTimetrade;
    @XmlElementRef(name = "Ban", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ban;
    @XmlElement(name = "PaymentInfo")
    protected PaymentInfo paymentInfo;
    @XmlElement(name = "AppointmentInfo")
    protected AppointmentInfo appointmentInfo;
    @XmlElement(name = "OrderLinesList", required = true)
    protected OrderLinesList orderLinesList;

    /**
     * Gets the value of the orderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderKey() {
        return orderKey;
    }

    /**
     * Sets the value of the orderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderKey(String value) {
        this.orderKey = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the errorStatusInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorStatusInd() {
        return errorStatusInd;
    }

    /**
     * Sets the value of the errorStatusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorStatusInd(Boolean value) {
        this.errorStatusInd = value;
    }

    /**
     * Gets the value of the orderActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderActionCode() {
        return orderActionCode;
    }

    /**
     * Sets the value of the orderActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderActionCode(String value) {
        this.orderActionCode = value;
    }

    /**
     * Gets the value of the storeIdentifierTimetrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreIdentifierTimetrade() {
        return storeIdentifierTimetrade;
    }

    /**
     * Sets the value of the storeIdentifierTimetrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreIdentifierTimetrade(String value) {
        this.storeIdentifierTimetrade = value;
    }

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBan(JAXBElement<Integer> value) {
        this.ban = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfo }
     *     
     */
    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfo }
     *     
     */
    public void setPaymentInfo(PaymentInfo value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the appointmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentInfo }
     *     
     */
    public AppointmentInfo getAppointmentInfo() {
        return appointmentInfo;
    }

    /**
     * Sets the value of the appointmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentInfo }
     *     
     */
    public void setAppointmentInfo(AppointmentInfo value) {
        this.appointmentInfo = value;
    }

    /**
     * Gets the value of the orderLinesList property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLinesList }
     *     
     */
    public OrderLinesList getOrderLinesList() {
        return orderLinesList;
    }

    /**
     * Sets the value of the orderLinesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLinesList }
     *     
     */
    public void setOrderLinesList(OrderLinesList value) {
        this.orderLinesList = value;
    }

}

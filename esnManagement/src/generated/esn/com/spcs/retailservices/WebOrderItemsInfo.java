
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebOrderItemsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebOrderItemsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="webOrderLineItemId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialNoImeiId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refTransNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webOrderPtn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerPickUpDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderLineitemCancelDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appointmentConfirmationNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appointmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebOrderItemsInfo", propOrder = {
    "webOrderLineItemId",
    "sku",
    "serialNumber",
    "serialNoImeiId",
    "refTransNo",
    "activity",
    "deliveryMethod",
    "webOrderPtn",
    "customerPickUpDttm",
    "orderLineitemCancelDttm",
    "appointmentConfirmationNbr",
    "appointmentDate"
})
public class WebOrderItemsInfo {

    protected int webOrderLineItemId;
    @XmlElement(required = true)
    protected String sku;
    protected String serialNumber;
    protected String serialNoImeiId;
    protected Long refTransNo;
    protected String activity;
    @XmlElement(required = true)
    protected String deliveryMethod;
    protected Long webOrderPtn;
    protected String customerPickUpDttm;
    protected String orderLineitemCancelDttm;
    protected String appointmentConfirmationNbr;
    protected String appointmentDate;

    /**
     * Gets the value of the webOrderLineItemId property.
     * 
     */
    public int getWebOrderLineItemId() {
        return webOrderLineItemId;
    }

    /**
     * Sets the value of the webOrderLineItemId property.
     * 
     */
    public void setWebOrderLineItemId(int value) {
        this.webOrderLineItemId = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialNoImeiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNoImeiId() {
        return serialNoImeiId;
    }

    /**
     * Sets the value of the serialNoImeiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNoImeiId(String value) {
        this.serialNoImeiId = value;
    }

    /**
     * Gets the value of the refTransNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefTransNo() {
        return refTransNo;
    }

    /**
     * Sets the value of the refTransNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefTransNo(Long value) {
        this.refTransNo = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the webOrderPtn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebOrderPtn() {
        return webOrderPtn;
    }

    /**
     * Sets the value of the webOrderPtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebOrderPtn(Long value) {
        this.webOrderPtn = value;
    }

    /**
     * Gets the value of the customerPickUpDttm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPickUpDttm() {
        return customerPickUpDttm;
    }

    /**
     * Sets the value of the customerPickUpDttm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPickUpDttm(String value) {
        this.customerPickUpDttm = value;
    }

    /**
     * Gets the value of the orderLineitemCancelDttm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineitemCancelDttm() {
        return orderLineitemCancelDttm;
    }

    /**
     * Sets the value of the orderLineitemCancelDttm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineitemCancelDttm(String value) {
        this.orderLineitemCancelDttm = value;
    }

    /**
     * Gets the value of the appointmentConfirmationNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentConfirmationNbr() {
        return appointmentConfirmationNbr;
    }

    /**
     * Sets the value of the appointmentConfirmationNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentConfirmationNbr(String value) {
        this.appointmentConfirmationNbr = value;
    }

    /**
     * Gets the value of the appointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Sets the value of the appointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentDate(String value) {
        this.appointmentDate = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebOrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="webOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webOrderHdrID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rmsReceivedDttm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderCancelSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebOrderInfo", propOrder = {
    "webOrderId",
    "webOrderHdrID",
    "ban",
    "rmsReceivedDttm",
    "orderCancelSystemCode"
})
public class WebOrderInfo {

    @XmlElement(required = true)
    protected String webOrderId;
    protected int webOrderHdrID;
    protected int ban;
    @XmlElement(required = true)
    protected String rmsReceivedDttm;
    protected String orderCancelSystemCode;

    /**
     * Gets the value of the webOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebOrderId() {
        return webOrderId;
    }

    /**
     * Sets the value of the webOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebOrderId(String value) {
        this.webOrderId = value;
    }

    /**
     * Gets the value of the webOrderHdrID property.
     * 
     */
    public int getWebOrderHdrID() {
        return webOrderHdrID;
    }

    /**
     * Sets the value of the webOrderHdrID property.
     * 
     */
    public void setWebOrderHdrID(int value) {
        this.webOrderHdrID = value;
    }

    /**
     * Gets the value of the ban property.
     * 
     */
    public int getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     */
    public void setBan(int value) {
        this.ban = value;
    }

    /**
     * Gets the value of the rmsReceivedDttm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmsReceivedDttm() {
        return rmsReceivedDttm;
    }

    /**
     * Sets the value of the rmsReceivedDttm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmsReceivedDttm(String value) {
        this.rmsReceivedDttm = value;
    }

    /**
     * Gets the value of the orderCancelSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCancelSystemCode() {
        return orderCancelSystemCode;
    }

    /**
     * Sets the value of the orderCancelSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCancelSystemCode(String value) {
        this.orderCancelSystemCode = value;
    }

}

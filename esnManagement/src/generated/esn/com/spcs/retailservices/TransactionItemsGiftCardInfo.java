
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionItemsGiftCardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionItemsGiftCardInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="giftCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="systemTraceAuditNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="giftCardStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionItemsGiftCardInfo", propOrder = {
    "lineItemNumber",
    "giftCardNumber",
    "systemTraceAuditNumber",
    "giftCardStatusIndicator"
})
public class TransactionItemsGiftCardInfo {

    protected int lineItemNumber;
    @XmlElement(required = true)
    protected String giftCardNumber;
    @XmlElement(required = true)
    protected String systemTraceAuditNumber;
    protected int giftCardStatusIndicator;

    /**
     * Gets the value of the lineItemNumber property.
     * 
     */
    public int getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     */
    public void setLineItemNumber(int value) {
        this.lineItemNumber = value;
    }

    /**
     * Gets the value of the giftCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardNumber() {
        return giftCardNumber;
    }

    /**
     * Sets the value of the giftCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardNumber(String value) {
        this.giftCardNumber = value;
    }

    /**
     * Gets the value of the systemTraceAuditNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    /**
     * Sets the value of the systemTraceAuditNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemTraceAuditNumber(String value) {
        this.systemTraceAuditNumber = value;
    }

    /**
     * Gets the value of the giftCardStatusIndicator property.
     * 
     */
    public int getGiftCardStatusIndicator() {
        return giftCardStatusIndicator;
    }

    /**
     * Sets the value of the giftCardStatusIndicator property.
     * 
     */
    public void setGiftCardStatusIndicator(int value) {
        this.giftCardStatusIndicator = value;
    }

}

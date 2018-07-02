
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftCardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCardInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="giftCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="systemTraceAuditNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="giftCardStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="approvalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCardInfo", propOrder = {
    "giftCardNumber",
    "systemTraceAuditNumber",
    "giftCardStatusIndicator",
    "expiryDate",
    "approvalNumber"
})
public class GiftCardInfo {

    @XmlElement(required = true)
    protected String giftCardNumber;
    @XmlElement(required = true)
    protected String systemTraceAuditNumber;
    protected int giftCardStatusIndicator;
    @XmlElement(required = true)
    protected String expiryDate;
    @XmlElement(required = true)
    protected String approvalNumber;

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

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the approvalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalNumber() {
        return approvalNumber;
    }

    /**
     * Sets the value of the approvalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalNumber(String value) {
        this.approvalNumber = value;
    }

}

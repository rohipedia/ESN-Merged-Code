
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagePendingPaymentDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagePendingPaymentDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PendingPaymentNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PendingPaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SignatureBypassReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Base64Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SwipeDeviceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IpadId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManagePendingPaymentInfo" type="{java:com.spcs.retailservices.domain}ManagePendingPaymentInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagePendingPaymentDetailsRequest", propOrder = {
    "pendingPaymentNo",
    "pendingPaymentStatus",
    "signatureBypassReasonCode",
    "base64Signature",
    "terminalId",
    "swipeDeviceId",
    "ipadId",
    "managePendingPaymentInfo"
})
public class ManagePendingPaymentDetailsRequest
    extends Request
{

    @XmlElement(name = "PendingPaymentNo")
    protected int pendingPaymentNo;
    @XmlElement(name = "PendingPaymentStatus", required = true)
    protected String pendingPaymentStatus;
    @XmlElement(name = "SignatureBypassReasonCode", required = true)
    protected String signatureBypassReasonCode;
    @XmlElement(name = "Base64Signature")
    protected String base64Signature;
    @XmlElement(name = "TerminalId", required = true)
    protected String terminalId;
    @XmlElement(name = "SwipeDeviceId", required = true)
    protected String swipeDeviceId;
    @XmlElement(name = "IpadId", required = true)
    protected String ipadId;
    @XmlElementRef(name = "ManagePendingPaymentInfo", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<ManagePendingPaymentInfo> managePendingPaymentInfo;

    /**
     * Gets the value of the pendingPaymentNo property.
     * 
     */
    public int getPendingPaymentNo() {
        return pendingPaymentNo;
    }

    /**
     * Sets the value of the pendingPaymentNo property.
     * 
     */
    public void setPendingPaymentNo(int value) {
        this.pendingPaymentNo = value;
    }

    /**
     * Gets the value of the pendingPaymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingPaymentStatus() {
        return pendingPaymentStatus;
    }

    /**
     * Sets the value of the pendingPaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingPaymentStatus(String value) {
        this.pendingPaymentStatus = value;
    }

    /**
     * Gets the value of the signatureBypassReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureBypassReasonCode() {
        return signatureBypassReasonCode;
    }

    /**
     * Sets the value of the signatureBypassReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureBypassReasonCode(String value) {
        this.signatureBypassReasonCode = value;
    }

    /**
     * Gets the value of the base64Signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64Signature() {
        return base64Signature;
    }

    /**
     * Sets the value of the base64Signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64Signature(String value) {
        this.base64Signature = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the swipeDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwipeDeviceId() {
        return swipeDeviceId;
    }

    /**
     * Sets the value of the swipeDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwipeDeviceId(String value) {
        this.swipeDeviceId = value;
    }

    /**
     * Gets the value of the ipadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpadId() {
        return ipadId;
    }

    /**
     * Sets the value of the ipadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpadId(String value) {
        this.ipadId = value;
    }

    /**
     * Gets the value of the managePendingPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ManagePendingPaymentInfo }{@code >}
     *     
     */
    public JAXBElement<ManagePendingPaymentInfo> getManagePendingPaymentInfo() {
        return managePendingPaymentInfo;
    }

    /**
     * Sets the value of the managePendingPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ManagePendingPaymentInfo }{@code >}
     *     
     */
    public void setManagePendingPaymentInfo(JAXBElement<ManagePendingPaymentInfo> value) {
        this.managePendingPaymentInfo = value;
    }

}

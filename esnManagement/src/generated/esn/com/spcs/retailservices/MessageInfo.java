
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageOrder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageInfo", propOrder = {
    "messageOrder",
    "messageId",
    "messageText"
})
public class MessageInfo {

    @XmlElement(name = "MessageOrder", required = true, nillable = true)
    protected String messageOrder;
    @XmlElement(name = "MessageId", required = true, nillable = true)
    protected String messageId;
    @XmlElement(name = "MessageText", required = true, nillable = true)
    protected String messageText;

    /**
     * Gets the value of the messageOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageOrder() {
        return messageOrder;
    }

    /**
     * Sets the value of the messageOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageOrder(String value) {
        this.messageOrder = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

}

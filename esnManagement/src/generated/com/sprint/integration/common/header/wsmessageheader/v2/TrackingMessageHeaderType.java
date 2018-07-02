
package com.sprint.integration.common.header.wsmessageheader.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrackingMessageHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingMessageHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}ApplicationIdentifier"/&gt;
 *         &lt;element name="applicationUserId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}ApplicationUserId"/&gt;
 *         &lt;element name="consumerId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}ApplicationIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="messageId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}MessageIdentifier"/&gt;
 *         &lt;element name="conversationId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}ConversationIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="timeToLive" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}SecondsToLiveQuantityType"/&gt;
 *         &lt;element name="replyCompletionCode" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}ReplyCompletionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="messageDateTimeStamp" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}CreationDateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingMessageHeaderType", propOrder = {
    "applicationId",
    "applicationUserId",
    "consumerId",
    "messageId",
    "conversationId",
    "timeToLive",
    "replyCompletionCode",
    "messageDateTimeStamp"
})
public class TrackingMessageHeaderType {

    @XmlElement(required = true)
    protected String applicationId;
    @XmlElement(required = true)
    protected String applicationUserId;
    protected String consumerId;
    @XmlElement(required = true)
    protected String messageId;
    protected String conversationId;
    @XmlElement(required = true)
    protected BigInteger timeToLive;
    protected Long replyCompletionCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageDateTimeStamp;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the applicationUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationUserId() {
        return applicationUserId;
    }

    /**
     * Sets the value of the applicationUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationUserId(String value) {
        this.applicationUserId = value;
    }

    /**
     * Gets the value of the consumerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerId() {
        return consumerId;
    }

    /**
     * Sets the value of the consumerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerId(String value) {
        this.consumerId = value;
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
     * Gets the value of the conversationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Sets the value of the conversationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationId(String value) {
        this.conversationId = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeToLive(BigInteger value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the replyCompletionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReplyCompletionCode() {
        return replyCompletionCode;
    }

    /**
     * Sets the value of the replyCompletionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReplyCompletionCode(Long value) {
        this.replyCompletionCode = value;
    }

    /**
     * Gets the value of the messageDateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDateTimeStamp() {
        return messageDateTimeStamp;
    }

    /**
     * Sets the value of the messageDateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDateTimeStamp(XMLGregorianCalendar value) {
        this.messageDateTimeStamp = value;
    }

}

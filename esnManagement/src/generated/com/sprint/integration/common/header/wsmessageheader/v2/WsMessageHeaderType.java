
package com.sprint.integration.common.header.wsmessageheader.v2;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for WsMessageHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsMessageHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trackingMessageHeader" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}TrackingMessageHeaderType"/&gt;
 *         &lt;element name="securityMessageHeader" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}SecurityMessageHeaderType" minOccurs="0"/&gt;
 *         &lt;element name="callingApplicationInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pin" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}PersonalIdentificationNumberType"/&gt;
 *                   &lt;element name="vendorCode" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}VendorCodeType"/&gt;
 *                   &lt;element name="subVendorCode" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="vendorUsername" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="vendorPassword" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="orderId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}ActivationOrderIdentifierType" minOccurs="0"/&gt;
 *                   &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *                   &lt;element name="resendNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="storeId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}RetailStoreIdentifierType" minOccurs="0"/&gt;
 *                   &lt;element name="associateId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}AssociateIdentifierType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsMessageHeaderType", propOrder = {
    "trackingMessageHeader",
    "securityMessageHeader",
    "callingApplicationInfo"
})
public class WsMessageHeaderType {

    @XmlElement(required = true)
    protected TrackingMessageHeaderType trackingMessageHeader;
    protected SecurityMessageHeaderType securityMessageHeader;
    protected WsMessageHeaderType.CallingApplicationInfo callingApplicationInfo;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the trackingMessageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingMessageHeaderType }
     *     
     */
    public TrackingMessageHeaderType getTrackingMessageHeader() {
        return trackingMessageHeader;
    }

    /**
     * Sets the value of the trackingMessageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingMessageHeaderType }
     *     
     */
    public void setTrackingMessageHeader(TrackingMessageHeaderType value) {
        this.trackingMessageHeader = value;
    }

    /**
     * Gets the value of the securityMessageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityMessageHeaderType }
     *     
     */
    public SecurityMessageHeaderType getSecurityMessageHeader() {
        return securityMessageHeader;
    }

    /**
     * Sets the value of the securityMessageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityMessageHeaderType }
     *     
     */
    public void setSecurityMessageHeader(SecurityMessageHeaderType value) {
        this.securityMessageHeader = value;
    }

    /**
     * Gets the value of the callingApplicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WsMessageHeaderType.CallingApplicationInfo }
     *     
     */
    public WsMessageHeaderType.CallingApplicationInfo getCallingApplicationInfo() {
        return callingApplicationInfo;
    }

    /**
     * Sets the value of the callingApplicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsMessageHeaderType.CallingApplicationInfo }
     *     
     */
    public void setCallingApplicationInfo(WsMessageHeaderType.CallingApplicationInfo value) {
        this.callingApplicationInfo = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="pin" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}PersonalIdentificationNumberType"/&gt;
     *         &lt;element name="vendorCode" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}VendorCodeType"/&gt;
     *         &lt;element name="subVendorCode" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="vendorUsername" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="vendorPassword" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="orderId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}ActivationOrderIdentifierType" minOccurs="0"/&gt;
     *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
     *         &lt;element name="resendNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="storeId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}RetailStoreIdentifierType" minOccurs="0"/&gt;
     *         &lt;element name="associateId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}AssociateIdentifierType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pin",
        "vendorCode",
        "subVendorCode",
        "vendorUsername",
        "vendorPassword",
        "orderId",
        "returnUrl",
        "resendNumber",
        "storeId",
        "associateId"
    })
    public static class CallingApplicationInfo {

        @XmlElement(required = true)
        protected String pin;
        @XmlElement(required = true)
        protected String vendorCode;
        protected String subVendorCode;
        protected String vendorUsername;
        protected String vendorPassword;
        protected String orderId;
        @XmlSchemaType(name = "anyURI")
        protected String returnUrl;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger resendNumber;
        protected String storeId;
        protected String associateId;

        /**
         * Gets the value of the pin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPin() {
            return pin;
        }

        /**
         * Sets the value of the pin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPin(String value) {
            this.pin = value;
        }

        /**
         * Gets the value of the vendorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * Sets the value of the vendorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * Gets the value of the subVendorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubVendorCode() {
            return subVendorCode;
        }

        /**
         * Sets the value of the subVendorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubVendorCode(String value) {
            this.subVendorCode = value;
        }

        /**
         * Gets the value of the vendorUsername property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorUsername() {
            return vendorUsername;
        }

        /**
         * Sets the value of the vendorUsername property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorUsername(String value) {
            this.vendorUsername = value;
        }

        /**
         * Gets the value of the vendorPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorPassword() {
            return vendorPassword;
        }

        /**
         * Sets the value of the vendorPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorPassword(String value) {
            this.vendorPassword = value;
        }

        /**
         * Gets the value of the orderId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderId() {
            return orderId;
        }

        /**
         * Sets the value of the orderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderId(String value) {
            this.orderId = value;
        }

        /**
         * Gets the value of the returnUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnUrl() {
            return returnUrl;
        }

        /**
         * Sets the value of the returnUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnUrl(String value) {
            this.returnUrl = value;
        }

        /**
         * Gets the value of the resendNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResendNumber() {
            return resendNumber;
        }

        /**
         * Sets the value of the resendNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResendNumber(BigInteger value) {
            this.resendNumber = value;
        }

        /**
         * Gets the value of the storeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStoreId() {
            return storeId;
        }

        /**
         * Sets the value of the storeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStoreId(String value) {
            this.storeId = value;
        }

        /**
         * Gets the value of the associateId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssociateId() {
            return associateId;
        }

        /**
         * Sets the value of the associateId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssociateId(String value) {
            this.associateId = value;
        }

    }

}

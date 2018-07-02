
package com.sprint.integration.common.header.wsmessageheader.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityMessageHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityMessageHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="sdcLoginCredentials" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}SdcLoginCredentialsType" minOccurs="0"/&gt;
 *           &lt;element name="basicCredentialInfo" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}BasicCredentialInfoType" minOccurs="0"/&gt;
 *           &lt;element name="pin" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}PasswordPin" minOccurs="0"/&gt;
 *           &lt;element name="taxIdCredentials" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}TaxIdCredentialsType" minOccurs="0"/&gt;
 *           &lt;element name="securityAnswer" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}SecurityAnswerType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="corpId" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}CorporationIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityMessageHeaderType", propOrder = {
    "sdcLoginCredentials",
    "basicCredentialInfo",
    "pin",
    "taxIdCredentials",
    "securityAnswer",
    "corpId"
})
public class SecurityMessageHeaderType {

    protected SdcLoginCredentialsType sdcLoginCredentials;
    protected BasicCredentialInfoType basicCredentialInfo;
    protected String pin;
    protected TaxIdCredentialsType taxIdCredentials;
    protected String securityAnswer;
    protected String corpId;

    /**
     * Gets the value of the sdcLoginCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link SdcLoginCredentialsType }
     *     
     */
    public SdcLoginCredentialsType getSdcLoginCredentials() {
        return sdcLoginCredentials;
    }

    /**
     * Sets the value of the sdcLoginCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdcLoginCredentialsType }
     *     
     */
    public void setSdcLoginCredentials(SdcLoginCredentialsType value) {
        this.sdcLoginCredentials = value;
    }

    /**
     * Gets the value of the basicCredentialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasicCredentialInfoType }
     *     
     */
    public BasicCredentialInfoType getBasicCredentialInfo() {
        return basicCredentialInfo;
    }

    /**
     * Sets the value of the basicCredentialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicCredentialInfoType }
     *     
     */
    public void setBasicCredentialInfo(BasicCredentialInfoType value) {
        this.basicCredentialInfo = value;
    }

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
     * Gets the value of the taxIdCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdCredentialsType }
     *     
     */
    public TaxIdCredentialsType getTaxIdCredentials() {
        return taxIdCredentials;
    }

    /**
     * Sets the value of the taxIdCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdCredentialsType }
     *     
     */
    public void setTaxIdCredentials(TaxIdCredentialsType value) {
        this.taxIdCredentials = value;
    }

    /**
     * Gets the value of the securityAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAnswer() {
        return securityAnswer;
    }

    /**
     * Sets the value of the securityAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAnswer(String value) {
        this.securityAnswer = value;
    }

    /**
     * Gets the value of the corpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpId() {
        return corpId;
    }

    /**
     * Sets the value of the corpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpId(String value) {
        this.corpId = value;
    }

}

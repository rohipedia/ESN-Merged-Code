
package com.sprint.integration.common.header.wsmessageheader.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="pin" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}PasswordPin" minOccurs="0"/&gt;
 *         &lt;element name="sdcLoginCredentials" type="{http://integration.sprint.com/common/header/WSMessageHeader/v2}SdcLoginCredentialsType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginType", propOrder = {
    "pin",
    "sdcLoginCredentials"
})
public class LoginType {

    protected String pin;
    protected SdcLoginCredentialsType sdcLoginCredentials;

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

}

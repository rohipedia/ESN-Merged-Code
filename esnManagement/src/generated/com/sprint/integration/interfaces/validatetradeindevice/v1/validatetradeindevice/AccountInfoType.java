
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="accountTypeInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}AccountTypeInfoType"/&gt;
 *         &lt;element name="newAccountInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}NewAccountInfoType"/&gt;
 *         &lt;element name="existingAccountInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ExistingAccountInfoType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfoType", propOrder = {
    "accountTypeInfo",
    "newAccountInfo",
    "existingAccountInfo"
})
public class AccountInfoType {

    protected AccountTypeInfoType accountTypeInfo;
    protected NewAccountInfoType newAccountInfo;
    protected ExistingAccountInfoType existingAccountInfo;

    /**
     * Gets the value of the accountTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeInfoType }
     *     
     */
    public AccountTypeInfoType getAccountTypeInfo() {
        return accountTypeInfo;
    }

    /**
     * Sets the value of the accountTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeInfoType }
     *     
     */
    public void setAccountTypeInfo(AccountTypeInfoType value) {
        this.accountTypeInfo = value;
    }

    /**
     * Gets the value of the newAccountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NewAccountInfoType }
     *     
     */
    public NewAccountInfoType getNewAccountInfo() {
        return newAccountInfo;
    }

    /**
     * Sets the value of the newAccountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewAccountInfoType }
     *     
     */
    public void setNewAccountInfo(NewAccountInfoType value) {
        this.newAccountInfo = value;
    }

    /**
     * Gets the value of the existingAccountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingAccountInfoType }
     *     
     */
    public ExistingAccountInfoType getExistingAccountInfo() {
        return existingAccountInfo;
    }

    /**
     * Sets the value of the existingAccountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingAccountInfoType }
     *     
     */
    public void setExistingAccountInfo(ExistingAccountInfoType value) {
        this.existingAccountInfo = value;
    }

}

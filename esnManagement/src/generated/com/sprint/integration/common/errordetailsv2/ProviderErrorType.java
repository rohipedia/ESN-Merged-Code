
package com.sprint.integration.common.errordetailsv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure to hold EAI or back-office detail error information. It is not intended for programmatic decisions unless specific API documentation allows, but to facilitate troubleshooting by logging verbose error conditions.
 * 
 * <p>Java class for ProviderErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="providerErrorCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://integration.sprint.com/common/ErrorDetailsV2.xsd}ProviderErrorCodeType"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="providerErrorText" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://integration.sprint.com/common/ErrorDetailsV2.xsd}ProviderErrorTextType"&gt;
 *               &lt;maxLength value="1024"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="errorSystem" type="{http://integration.sprint.com/common/ErrorDetailsV2.xsd}ErrorSystemType" minOccurs="0"/&gt;
 *         &lt;element name="errorTransactionId" type="{http://integration.sprint.com/common/ErrorDetailsV2.xsd}ErrorTransactionIdType" minOccurs="0"/&gt;
 *         &lt;element name="errorProgramId" type="{http://integration.sprint.com/common/ErrorDetailsV2.xsd}ErrorProgramIdType" minOccurs="0"/&gt;
 *         &lt;element name="fieldInError" type="{http://integration.sprint.com/common/ErrorDetailsV2.xsd}FieldInErrorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderErrorType", propOrder = {
    "providerErrorCode",
    "providerErrorText",
    "errorSystem",
    "errorTransactionId",
    "errorProgramId",
    "fieldInError"
})
public class ProviderErrorType {

    @XmlElement(required = true)
    protected String providerErrorCode;
    protected String providerErrorText;
    protected String errorSystem;
    protected String errorTransactionId;
    protected String errorProgramId;
    protected String fieldInError;

    /**
     * Gets the value of the providerErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderErrorCode() {
        return providerErrorCode;
    }

    /**
     * Sets the value of the providerErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderErrorCode(String value) {
        this.providerErrorCode = value;
    }

    /**
     * Gets the value of the providerErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderErrorText() {
        return providerErrorText;
    }

    /**
     * Sets the value of the providerErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderErrorText(String value) {
        this.providerErrorText = value;
    }

    /**
     * Gets the value of the errorSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSystem() {
        return errorSystem;
    }

    /**
     * Sets the value of the errorSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSystem(String value) {
        this.errorSystem = value;
    }

    /**
     * Gets the value of the errorTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorTransactionId() {
        return errorTransactionId;
    }

    /**
     * Sets the value of the errorTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorTransactionId(String value) {
        this.errorTransactionId = value;
    }

    /**
     * Gets the value of the errorProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorProgramId() {
        return errorProgramId;
    }

    /**
     * Sets the value of the errorProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorProgramId(String value) {
        this.errorProgramId = value;
    }

    /**
     * Gets the value of the fieldInError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldInError() {
        return fieldInError;
    }

    /**
     * Sets the value of the fieldInError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldInError(String value) {
        this.fieldInError = value;
    }

}

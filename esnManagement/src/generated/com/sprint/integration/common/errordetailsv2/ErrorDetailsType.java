
package com.sprint.integration.common.errordetailsv2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the customization of the SOAP 1.1 Fault details element.
 * 
 * <p>Java class for ErrorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="providerError" type="{http://integration.sprint.com/common/ErrorDetailsV2.xsd}ProviderErrorType" maxOccurs="1000"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetailsType", propOrder = {
    "providerError"
})
public class ErrorDetailsType {

    @XmlElement(required = true)
    protected List<ProviderErrorType> providerError;

    /**
     * Gets the value of the providerError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderErrorType }
     * 
     * 
     */
    public List<ProviderErrorType> getProviderError() {
        if (providerError == null) {
            providerError = new ArrayList<ProviderErrorType>();
        }
        return this.providerError;
    }

}


package com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateGiveBackCheckStatusInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateGiveBackCheckStatusInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validationCheck" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}ValidationRuleSetIdentifierType"/&gt;
 *         &lt;element name="validationCheckInd" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}ValidationSuccessFlagType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateGiveBackCheckStatusInfoType", propOrder = {
    "validationCheck",
    "validationCheckInd"
})
public class ValidateGiveBackCheckStatusInfoType {

    @XmlElement(required = true)
    protected String validationCheck;
    protected boolean validationCheckInd;

    /**
     * Gets the value of the validationCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCheck() {
        return validationCheck;
    }

    /**
     * Sets the value of the validationCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCheck(String value) {
        this.validationCheck = value;
    }

    /**
     * Gets the value of the validationCheckInd property.
     * 
     */
    public boolean isValidationCheckInd() {
        return validationCheckInd;
    }

    /**
     * Sets the value of the validationCheckInd property.
     * 
     */
    public void setValidationCheckInd(boolean value) {
        this.validationCheckInd = value;
    }

}

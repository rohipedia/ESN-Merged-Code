
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionAnswerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionAnswerInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="answerId" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}AnswerIdentifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionAnswerInfoType", propOrder = {
    "answerId"
})
public class ConditionAnswerInfoType {

    @XmlElement(required = true)
    protected String answerId;

    /**
     * Gets the value of the answerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerId() {
        return answerId;
    }

    /**
     * Sets the value of the answerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerId(String value) {
        this.answerId = value;
    }

}

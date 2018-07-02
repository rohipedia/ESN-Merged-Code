
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionAnswerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionAnswerListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionAnswerInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}ConditionAnswerInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionAnswerListType", propOrder = {
    "conditionAnswerInfo"
})
public class ConditionAnswerListType {

    @XmlElement(required = true)
    protected List<ConditionAnswerInfoType> conditionAnswerInfo;

    /**
     * Gets the value of the conditionAnswerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionAnswerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionAnswerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionAnswerInfoType }
     * 
     * 
     */
    public List<ConditionAnswerInfoType> getConditionAnswerInfo() {
        if (conditionAnswerInfo == null) {
            conditionAnswerInfo = new ArrayList<ConditionAnswerInfoType>();
        }
        return this.conditionAnswerInfo;
    }

}

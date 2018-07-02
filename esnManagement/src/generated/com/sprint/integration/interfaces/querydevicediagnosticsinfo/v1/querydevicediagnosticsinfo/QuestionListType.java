
package com.sprint.integration.interfaces.querydevicediagnosticsinfo.v1.querydevicediagnosticsinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuestionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="questionInfo" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}QuestionInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionListType", propOrder = {
    "questionInfo"
})
public class QuestionListType {

    @XmlElement(required = true)
    protected List<QuestionInfoType> questionInfo;

    /**
     * Gets the value of the questionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionInfoType }
     * 
     * 
     */
    public List<QuestionInfoType> getQuestionInfo() {
        if (questionInfo == null) {
            questionInfo = new ArrayList<QuestionInfoType>();
        }
        return this.questionInfo;
    }

}

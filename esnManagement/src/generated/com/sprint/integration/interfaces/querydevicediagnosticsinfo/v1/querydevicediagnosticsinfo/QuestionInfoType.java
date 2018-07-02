
package com.sprint.integration.interfaces.querydevicediagnosticsinfo.v1.querydevicediagnosticsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuestionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="questionId" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}QuestionCodeType"/&gt;
 *         &lt;element name="questionText" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}QuestionTextType"/&gt;
 *         &lt;element name="answerId" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}AnswerIdentifierType"/&gt;
 *         &lt;element name="answerText" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}AnswerTextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionInfoType", propOrder = {
    "questionId",
    "questionText",
    "answerId",
    "answerText"
})
public class QuestionInfoType {

    @XmlElement(required = true)
    protected String questionId;
    @XmlElement(required = true)
    protected String questionText;
    @XmlElement(required = true)
    protected String answerId;
    @XmlElement(required = true)
    protected String answerText;

    /**
     * Gets the value of the questionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * Sets the value of the questionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionId(String value) {
        this.questionId = value;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
    }

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

    /**
     * Gets the value of the answerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerText() {
        return answerText;
    }

    /**
     * Sets the value of the answerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerText(String value) {
        this.answerText = value;
    }

}

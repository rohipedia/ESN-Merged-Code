
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortinQuestionAnswerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortinQuestionAnswerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortinLineNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PortinQuestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PortinAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortinQuestionAnswerInfo", propOrder = {
    "portinLineNum",
    "portinQuestion",
    "portinAnswer"
})
public class PortinQuestionAnswerInfo {

    @XmlElement(name = "PortinLineNum")
    protected int portinLineNum;
    @XmlElement(name = "PortinQuestion", required = true)
    protected String portinQuestion;
    @XmlElement(name = "PortinAnswer", required = true)
    protected String portinAnswer;

    /**
     * Gets the value of the portinLineNum property.
     * 
     */
    public int getPortinLineNum() {
        return portinLineNum;
    }

    /**
     * Sets the value of the portinLineNum property.
     * 
     */
    public void setPortinLineNum(int value) {
        this.portinLineNum = value;
    }

    /**
     * Gets the value of the portinQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortinQuestion() {
        return portinQuestion;
    }

    /**
     * Sets the value of the portinQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortinQuestion(String value) {
        this.portinQuestion = value;
    }

    /**
     * Gets the value of the portinAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortinAnswer() {
        return portinAnswer;
    }

    /**
     * Sets the value of the portinAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortinAnswer(String value) {
        this.portinAnswer = value;
    }

}

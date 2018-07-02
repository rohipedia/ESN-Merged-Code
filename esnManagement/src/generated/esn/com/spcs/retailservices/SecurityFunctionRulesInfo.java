
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityFunctionRulesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityFunctionRulesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FunctionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FunctionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RuleList" type="{java:com.spcs.retailservices.domain}RuleList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityFunctionRulesInfo", propOrder = {
    "functionDescription",
    "functionIdentifier",
    "ruleList"
})
public class SecurityFunctionRulesInfo {

    @XmlElement(name = "FunctionDescription", required = true)
    protected String functionDescription;
    @XmlElement(name = "FunctionIdentifier")
    protected int functionIdentifier;
    @XmlElement(name = "RuleList", required = true)
    protected RuleList ruleList;

    /**
     * Gets the value of the functionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionDescription() {
        return functionDescription;
    }

    /**
     * Sets the value of the functionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionDescription(String value) {
        this.functionDescription = value;
    }

    /**
     * Gets the value of the functionIdentifier property.
     * 
     */
    public int getFunctionIdentifier() {
        return functionIdentifier;
    }

    /**
     * Sets the value of the functionIdentifier property.
     * 
     */
    public void setFunctionIdentifier(int value) {
        this.functionIdentifier = value;
    }

    /**
     * Gets the value of the ruleList property.
     * 
     * @return
     *     possible object is
     *     {@link RuleList }
     *     
     */
    public RuleList getRuleList() {
        return ruleList;
    }

    /**
     * Sets the value of the ruleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleList }
     *     
     */
    public void setRuleList(RuleList value) {
        this.ruleList = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RuleIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfo", propOrder = {
    "ruleDescription",
    "ruleIdentifier"
})
public class RuleInfo {

    @XmlElement(name = "RuleDescription", required = true)
    protected String ruleDescription;
    @XmlElement(name = "RuleIdentifier")
    protected int ruleIdentifier;

    /**
     * Gets the value of the ruleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Sets the value of the ruleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDescription(String value) {
        this.ruleDescription = value;
    }

    /**
     * Gets the value of the ruleIdentifier property.
     * 
     */
    public int getRuleIdentifier() {
        return ruleIdentifier;
    }

    /**
     * Sets the value of the ruleIdentifier property.
     * 
     */
    public void setRuleIdentifier(int value) {
        this.ruleIdentifier = value;
    }

}

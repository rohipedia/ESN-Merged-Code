
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityGroupInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SecurityGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SecurityGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SecurityFunctionRulesList" type="{java:com.spcs.retailservices.domain}SecurityFunctionRulesList"/&gt;
 *         &lt;element name="SecurityFunctionObjectsList" type="{java:com.spcs.retailservices.domain}SecurityFunctionObjectsList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityGroupInfo", propOrder = {
    "securityGroupName",
    "securityGroupId",
    "securityFunctionRulesList",
    "securityFunctionObjectsList"
})
public class SecurityGroupInfo {

    @XmlElement(name = "SecurityGroupName", required = true)
    protected String securityGroupName;
    @XmlElement(name = "SecurityGroupId", required = true)
    protected String securityGroupId;
    @XmlElement(name = "SecurityFunctionRulesList", required = true)
    protected SecurityFunctionRulesList securityFunctionRulesList;
    @XmlElement(name = "SecurityFunctionObjectsList", required = true)
    protected SecurityFunctionObjectsList securityFunctionObjectsList;

    /**
     * Gets the value of the securityGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityGroupName() {
        return securityGroupName;
    }

    /**
     * Sets the value of the securityGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityGroupName(String value) {
        this.securityGroupName = value;
    }

    /**
     * Gets the value of the securityGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    /**
     * Sets the value of the securityGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityGroupId(String value) {
        this.securityGroupId = value;
    }

    /**
     * Gets the value of the securityFunctionRulesList property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityFunctionRulesList }
     *     
     */
    public SecurityFunctionRulesList getSecurityFunctionRulesList() {
        return securityFunctionRulesList;
    }

    /**
     * Sets the value of the securityFunctionRulesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityFunctionRulesList }
     *     
     */
    public void setSecurityFunctionRulesList(SecurityFunctionRulesList value) {
        this.securityFunctionRulesList = value;
    }

    /**
     * Gets the value of the securityFunctionObjectsList property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityFunctionObjectsList }
     *     
     */
    public SecurityFunctionObjectsList getSecurityFunctionObjectsList() {
        return securityFunctionObjectsList;
    }

    /**
     * Sets the value of the securityFunctionObjectsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityFunctionObjectsList }
     *     
     */
    public void setSecurityFunctionObjectsList(SecurityFunctionObjectsList value) {
        this.securityFunctionObjectsList = value;
    }

}

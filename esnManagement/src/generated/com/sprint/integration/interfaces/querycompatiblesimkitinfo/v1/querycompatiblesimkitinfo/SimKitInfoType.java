
package com.sprint.integration.interfaces.querycompatiblesimkitinfo.v1.querycompatiblesimkitinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimKitInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimKitInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="simKitModel" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}ModelNumberType" minOccurs="0"/&gt;
 *         &lt;element name="simModel" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}ModelNumberType"/&gt;
 *         &lt;element name="simPartNumber" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}PartIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="simPriority" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}PriorityLevelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimKitInfoType", propOrder = {
    "simKitModel",
    "simModel",
    "simPartNumber",
    "simPriority"
})
public class SimKitInfoType {

    protected String simKitModel;
    @XmlElement(required = true)
    protected String simModel;
    protected String simPartNumber;
    protected Integer simPriority;

    /**
     * Gets the value of the simKitModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimKitModel() {
        return simKitModel;
    }

    /**
     * Sets the value of the simKitModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimKitModel(String value) {
        this.simKitModel = value;
    }

    /**
     * Gets the value of the simModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimModel() {
        return simModel;
    }

    /**
     * Sets the value of the simModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimModel(String value) {
        this.simModel = value;
    }

    /**
     * Gets the value of the simPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimPartNumber() {
        return simPartNumber;
    }

    /**
     * Sets the value of the simPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimPartNumber(String value) {
        this.simPartNumber = value;
    }

    /**
     * Gets the value of the simPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSimPriority() {
        return simPriority;
    }

    /**
     * Sets the value of the simPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSimPriority(Integer value) {
        this.simPriority = value;
    }

}

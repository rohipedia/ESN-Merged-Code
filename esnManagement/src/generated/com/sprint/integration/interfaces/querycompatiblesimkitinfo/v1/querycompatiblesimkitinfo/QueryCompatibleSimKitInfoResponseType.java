
package com.sprint.integration.interfaces.querycompatiblesimkitinfo.v1.querycompatiblesimkitinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCompatibleSimKitInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCompatibleSimKitInfoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esnMeidHex" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}DeviceSerialNumberHexType" minOccurs="0"/&gt;
 *         &lt;element name="esnMeidDec" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}DeviceSerialNumberDecType" minOccurs="0"/&gt;
 *         &lt;element name="modelNumber" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}ModelNumberType"/&gt;
 *         &lt;element name="simKitList" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}SimKitListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCompatibleSimKitInfoResponseType", propOrder = {
    "esnMeidHex",
    "esnMeidDec",
    "modelNumber",
    "simKitList"
})
public class QueryCompatibleSimKitInfoResponseType {

    protected String esnMeidHex;
    protected String esnMeidDec;
    @XmlElement(required = true)
    protected String modelNumber;
    protected SimKitListType simKitList;

    /**
     * Gets the value of the esnMeidHex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsnMeidHex() {
        return esnMeidHex;
    }

    /**
     * Sets the value of the esnMeidHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsnMeidHex(String value) {
        this.esnMeidHex = value;
    }

    /**
     * Gets the value of the esnMeidDec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsnMeidDec() {
        return esnMeidDec;
    }

    /**
     * Sets the value of the esnMeidDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsnMeidDec(String value) {
        this.esnMeidDec = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the simKitList property.
     * 
     * @return
     *     possible object is
     *     {@link SimKitListType }
     *     
     */
    public SimKitListType getSimKitList() {
        return simKitList;
    }

    /**
     * Sets the value of the simKitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimKitListType }
     *     
     */
    public void setSimKitList(SimKitListType value) {
        this.simKitList = value;
    }

}

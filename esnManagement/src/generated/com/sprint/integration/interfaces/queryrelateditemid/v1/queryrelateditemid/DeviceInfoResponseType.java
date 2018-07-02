
package com.sprint.integration.interfaces.queryrelateditemid.v1.queryrelateditemid;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemId" type="{http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd}DeviceItemIdentifierType"/&gt;
 *         &lt;element name="relatedItemId" type="{http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd}DeviceItemIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="statusMessageInfo" type="{http://integration.sprint.com/interfaces/queryRelatedItemId/v1/queryRelatedItemId.xsd}ErrorMessageInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfoResponseType", propOrder = {
    "itemId",
    "relatedItemId",
    "statusMessageInfo"
})
public class DeviceInfoResponseType {

    @XmlElement(required = true)
    protected String itemId;
    protected String relatedItemId;
    @XmlElement(required = true)
    protected ErrorMessageInfoType statusMessageInfo;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the relatedItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedItemId() {
        return relatedItemId;
    }

    /**
     * Sets the value of the relatedItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedItemId(String value) {
        this.relatedItemId = value;
    }

    /**
     * Gets the value of the statusMessageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageInfoType }
     *     
     */
    public ErrorMessageInfoType getStatusMessageInfo() {
        return statusMessageInfo;
    }

    /**
     * Sets the value of the statusMessageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageInfoType }
     *     
     */
    public void setStatusMessageInfo(ErrorMessageInfoType value) {
        this.statusMessageInfo = value;
    }

}

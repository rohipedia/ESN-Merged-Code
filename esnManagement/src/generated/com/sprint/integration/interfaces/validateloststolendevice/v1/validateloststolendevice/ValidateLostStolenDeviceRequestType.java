
package com.sprint.integration.interfaces.validateloststolendevice.v1.validateloststolendevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateLostStolenDeviceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateLostStolenDeviceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serialNumber" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}EquipmentSerialNumberStringType"/&gt;
 *         &lt;element name="categoryList" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}CategoryListType" minOccurs="0"/&gt;
 *         &lt;element name="moreInformationInd" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}MoreInformationFlagType" minOccurs="0"/&gt;
 *         &lt;element name="moreInfo" type="{http://integration.sprint.com/interfaces/validateLostStolenDevice/v1/validateLostStolenDevice.xsd}NoteTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateLostStolenDeviceRequestType", propOrder = {
    "serialNumber",
    "categoryList",
    "moreInformationInd",
    "moreInfo"
})
public class ValidateLostStolenDeviceRequestType {

    @XmlElement(required = true)
    protected String serialNumber;
    protected CategoryListType categoryList;
    protected Boolean moreInformationInd;
    protected String moreInfo;

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the categoryList property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryListType }
     *     
     */
    public CategoryListType getCategoryList() {
        return categoryList;
    }

    /**
     * Sets the value of the categoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryListType }
     *     
     */
    public void setCategoryList(CategoryListType value) {
        this.categoryList = value;
    }

    /**
     * Gets the value of the moreInformationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreInformationInd() {
        return moreInformationInd;
    }

    /**
     * Sets the value of the moreInformationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreInformationInd(Boolean value) {
        this.moreInformationInd = value;
    }

    /**
     * Gets the value of the moreInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * Sets the value of the moreInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreInfo(String value) {
        this.moreInfo = value;
    }

}

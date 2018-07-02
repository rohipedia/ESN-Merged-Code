
package com.sprint.integration.interfaces.validatebuybackdevice.v1.validatebuybackdevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateBuybackDeviceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateBuybackDeviceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serialNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://integration.sprint.com/interfaces/validateBuybackDevice/v1/validateBuybackDevice.xsd}EquipmentSerialNumberStringType"&gt;
 *               &lt;minLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="categoryList" type="{http://integration.sprint.com/interfaces/validateBuybackDevice/v1/validateBuybackDevice.xsd}CategoryListType" minOccurs="0"/&gt;
 *         &lt;element name="moreInformationInd" type="{http://integration.sprint.com/interfaces/validateBuybackDevice/v1/validateBuybackDevice.xsd}MoreInformationFlagType" minOccurs="0"/&gt;
 *         &lt;element name="moreInfo" type="{http://integration.sprint.com/interfaces/validateBuybackDevice/v1/validateBuybackDevice.xsd}NoteTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateBuybackDeviceRequestType", propOrder = {
    "serialNumber",
    "categoryList",
    "moreInformationInd",
    "moreInfo"
})
public class ValidateBuybackDeviceRequestType {

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

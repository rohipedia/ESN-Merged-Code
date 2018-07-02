
package com.sprint.integration.interfaces.querydevicelist.v1.querydevicelist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryDeviceListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceListRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="info" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}SearchCriteriaType"/&gt;
 *         &lt;element name="blockSize"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}BlockSizeType"&gt;
 *               &lt;maxInclusive value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastExpirationDate" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}ExpirationDateType" minOccurs="0"/&gt;
 *         &lt;element name="fetchPendingUpgrade" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}FetchInformationFlagType" minOccurs="0"/&gt;
 *         &lt;element name="fetchNotActiveOnAnotherBan" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}FetchInformationFlagType" minOccurs="0"/&gt;
 *         &lt;element name="uiccIdInd" type="{http://integration.sprint.com/interfaces/queryDeviceList/v1/queryDeviceList.xsd}FetchInformationFlagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceListRequestType", propOrder = {
    "info",
    "blockSize",
    "lastExpirationDate",
    "fetchPendingUpgrade",
    "fetchNotActiveOnAnotherBan",
    "uiccIdInd"
})
public class QueryDeviceListRequestType {

    @XmlElement(required = true)
    protected SearchCriteriaType info;
    @XmlElement(required = true)
    protected BigInteger blockSize;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastExpirationDate;
    protected Boolean fetchPendingUpgrade;
    protected Boolean fetchNotActiveOnAnotherBan;
    protected Boolean uiccIdInd;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaType }
     *     
     */
    public SearchCriteriaType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaType }
     *     
     */
    public void setInfo(SearchCriteriaType value) {
        this.info = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlockSize(BigInteger value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the lastExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastExpirationDate() {
        return lastExpirationDate;
    }

    /**
     * Sets the value of the lastExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastExpirationDate(XMLGregorianCalendar value) {
        this.lastExpirationDate = value;
    }

    /**
     * Gets the value of the fetchPendingUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPendingUpgrade() {
        return fetchPendingUpgrade;
    }

    /**
     * Sets the value of the fetchPendingUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPendingUpgrade(Boolean value) {
        this.fetchPendingUpgrade = value;
    }

    /**
     * Gets the value of the fetchNotActiveOnAnotherBan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchNotActiveOnAnotherBan() {
        return fetchNotActiveOnAnotherBan;
    }

    /**
     * Sets the value of the fetchNotActiveOnAnotherBan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchNotActiveOnAnotherBan(Boolean value) {
        this.fetchNotActiveOnAnotherBan = value;
    }

    /**
     * Gets the value of the uiccIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUiccIdInd() {
        return uiccIdInd;
    }

    /**
     * Sets the value of the uiccIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUiccIdInd(Boolean value) {
        this.uiccIdInd = value;
    }

}

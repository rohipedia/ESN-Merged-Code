
package com.sprint.integration.interfaces.querydevicediagnosticsinfo.v1.querydevicediagnosticsinfo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDeviceDiagnosticsInfoRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDeviceDiagnosticsInfoRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerId" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}CustomerIdentifierType"/&gt;
 *         &lt;element name="storeId" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}RetailStoreIdentifierType"/&gt;
 *         &lt;element name="diagnosticsId" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}DiagnosticTestIdentifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDeviceDiagnosticsInfoRequestType", propOrder = {
    "customerId",
    "storeId",
    "diagnosticsId"
})
public class QueryDeviceDiagnosticsInfoRequestType {

    @XmlElement(required = true)
    protected String customerId;
    @XmlElement(required = true)
    protected String storeId;
    @XmlElement(required = true)
    protected BigInteger diagnosticsId;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreId(String value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the diagnosticsId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiagnosticsId() {
        return diagnosticsId;
    }

    /**
     * Sets the value of the diagnosticsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiagnosticsId(BigInteger value) {
        this.diagnosticsId = value;
    }

}

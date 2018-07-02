
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiXmlInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiXmlInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apiGroupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="apiSequenceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceXmlText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceTimeoutValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiXmlInfo", propOrder = {
    "apiGroupId",
    "apiSequenceId",
    "methodName",
    "serviceXmlText",
    "serviceUrl",
    "serviceTimeoutValue"
})
public class ApiXmlInfo {

    protected Integer apiGroupId;
    protected Integer apiSequenceId;
    @XmlElement(required = true)
    protected String methodName;
    @XmlElement(required = true)
    protected String serviceXmlText;
    @XmlElement(required = true)
    protected String serviceUrl;
    protected int serviceTimeoutValue;

    /**
     * Gets the value of the apiGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApiGroupId() {
        return apiGroupId;
    }

    /**
     * Sets the value of the apiGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApiGroupId(Integer value) {
        this.apiGroupId = value;
    }

    /**
     * Gets the value of the apiSequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApiSequenceId() {
        return apiSequenceId;
    }

    /**
     * Sets the value of the apiSequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApiSequenceId(Integer value) {
        this.apiSequenceId = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the serviceXmlText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceXmlText() {
        return serviceXmlText;
    }

    /**
     * Sets the value of the serviceXmlText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceXmlText(String value) {
        this.serviceXmlText = value;
    }

    /**
     * Gets the value of the serviceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Sets the value of the serviceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUrl(String value) {
        this.serviceUrl = value;
    }

    /**
     * Gets the value of the serviceTimeoutValue property.
     * 
     */
    public int getServiceTimeoutValue() {
        return serviceTimeoutValue;
    }

    /**
     * Sets the value of the serviceTimeoutValue property.
     * 
     */
    public void setServiceTimeoutValue(int value) {
        this.serviceTimeoutValue = value;
    }

}

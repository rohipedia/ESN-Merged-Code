
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignRegisterAndFloatRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignRegisterAndFloatRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="macId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="releaseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sharedCashDrawerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignRegisterAndFloatRequest", propOrder = {
    "macId",
    "storeName",
    "releaseIndicator",
    "sharedCashDrawerId"
})
public class AssignRegisterAndFloatRequest
    extends Request
{

    @XmlElement(required = true)
    protected String macId;
    @XmlElement(required = true)
    protected String storeName;
    protected Boolean releaseIndicator;
    protected Integer sharedCashDrawerId;

    /**
     * Gets the value of the macId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacId() {
        return macId;
    }

    /**
     * Sets the value of the macId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacId(String value) {
        this.macId = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the releaseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleaseIndicator() {
        return releaseIndicator;
    }

    /**
     * Sets the value of the releaseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleaseIndicator(Boolean value) {
        this.releaseIndicator = value;
    }

    /**
     * Gets the value of the sharedCashDrawerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSharedCashDrawerId() {
        return sharedCashDrawerId;
    }

    /**
     * Sets the value of the sharedCashDrawerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSharedCashDrawerId(Integer value) {
        this.sharedCashDrawerId = value;
    }

}

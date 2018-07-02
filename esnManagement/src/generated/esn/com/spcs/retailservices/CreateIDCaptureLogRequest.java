
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateIDCaptureLogRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateIDCaptureLogRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="channelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="homeCreditReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consentNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateIDCaptureLogRequest", propOrder = {
    "ban",
    "storeID",
    "channelName",
    "homeCreditReferenceCode",
    "consentNumber"
})
public class CreateIDCaptureLogRequest
    extends Request
{

    @XmlElement(required = true)
    protected String ban;
    protected int storeID;
    @XmlElement(required = true)
    protected String channelName;
    protected String homeCreditReferenceCode;
    protected int consentNumber;

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBan(String value) {
        this.ban = value;
    }

    /**
     * Gets the value of the storeID property.
     * 
     */
    public int getStoreID() {
        return storeID;
    }

    /**
     * Sets the value of the storeID property.
     * 
     */
    public void setStoreID(int value) {
        this.storeID = value;
    }

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the homeCreditReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCreditReferenceCode() {
        return homeCreditReferenceCode;
    }

    /**
     * Sets the value of the homeCreditReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCreditReferenceCode(String value) {
        this.homeCreditReferenceCode = value;
    }

    /**
     * Gets the value of the consentNumber property.
     * 
     */
    public int getConsentNumber() {
        return consentNumber;
    }

    /**
     * Sets the value of the consentNumber property.
     * 
     */
    public void setConsentNumber(int value) {
        this.consentNumber = value;
    }

}

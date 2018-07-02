
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brandingCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeDetailsInfo" type="{java:com.spcs.retailservices.domain}StoreDetailsInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelInfo", propOrder = {
    "channelType",
    "brandingCode",
    "storeDetailsInfo"
})
public class ChannelInfo {

    @XmlElement(required = true)
    protected String channelType;
    @XmlElement(required = true)
    protected String brandingCode;
    protected StoreDetailsInfo storeDetailsInfo;

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the brandingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingCode() {
        return brandingCode;
    }

    /**
     * Sets the value of the brandingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingCode(String value) {
        this.brandingCode = value;
    }

    /**
     * Gets the value of the storeDetailsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreDetailsInfo }
     *     
     */
    public StoreDetailsInfo getStoreDetailsInfo() {
        return storeDetailsInfo;
    }

    /**
     * Sets the value of the storeDetailsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreDetailsInfo }
     *     
     */
    public void setStoreDetailsInfo(StoreDetailsInfo value) {
        this.storeDetailsInfo = value;
    }

}

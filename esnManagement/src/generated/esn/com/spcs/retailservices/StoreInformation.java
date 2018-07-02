
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeRepId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeAddressInfo" type="{java:com.spcs.retailservices.domain}StoreAddressInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreInformation", propOrder = {
    "storeNumber",
    "storeRepId",
    "storeAddressInfo"
})
public class StoreInformation {

    @XmlElement(required = true)
    protected String storeNumber;
    protected String storeRepId;
    @XmlElement(required = true)
    protected StoreAddressInfo storeAddressInfo;

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the storeRepId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreRepId() {
        return storeRepId;
    }

    /**
     * Sets the value of the storeRepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreRepId(String value) {
        this.storeRepId = value;
    }

    /**
     * Gets the value of the storeAddressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreAddressInfo }
     *     
     */
    public StoreAddressInfo getStoreAddressInfo() {
        return storeAddressInfo;
    }

    /**
     * Sets the value of the storeAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreAddressInfo }
     *     
     */
    public void setStoreAddressInfo(StoreAddressInfo value) {
        this.storeAddressInfo = value;
    }

}

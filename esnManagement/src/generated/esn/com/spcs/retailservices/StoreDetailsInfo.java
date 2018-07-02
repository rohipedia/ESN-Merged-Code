
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeRep" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeMdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dealerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeAddressInfo" type="{java:com.spcs.retailservices.domain}StoreAddressInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreDetailsInfo", propOrder = {
    "storeNumber",
    "storeRep",
    "storeMdn",
    "dealerName",
    "storeAddressInfo"
})
public class StoreDetailsInfo {

    @XmlElement(required = true)
    protected String storeNumber;
    @XmlElement(required = true)
    protected String storeRep;
    protected String storeMdn;
    protected String dealerName;
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
     * Gets the value of the storeRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreRep() {
        return storeRep;
    }

    /**
     * Sets the value of the storeRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreRep(String value) {
        this.storeRep = value;
    }

    /**
     * Gets the value of the storeMdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreMdn() {
        return storeMdn;
    }

    /**
     * Sets the value of the storeMdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreMdn(String value) {
        this.storeMdn = value;
    }

    /**
     * Gets the value of the dealerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Sets the value of the dealerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
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


package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreskuInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreskuInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreIdentifierTimetrade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreAsiId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StoreIBEligibilityInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StoreLeaseEligibilityInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Skuqtyinfo" type="{java:com.spcs.retailservices.domain}Skuqtyinfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StoreErrorInfo" type="{java:com.spcs.retailservices.domain}StoreErrorInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreskuInfo", propOrder = {
    "storeIdentifierTimetrade",
    "storeAsiId",
    "storeIBEligibilityInd",
    "storeLeaseEligibilityInd",
    "skuqtyinfo",
    "storeErrorInfo"
})
public class StoreskuInfo {

    @XmlElement(name = "StoreIdentifierTimetrade", required = true)
    protected String storeIdentifierTimetrade;
    @XmlElement(name = "StoreAsiId")
    protected String storeAsiId;
    @XmlElement(name = "StoreIBEligibilityInd")
    protected boolean storeIBEligibilityInd;
    @XmlElement(name = "StoreLeaseEligibilityInd")
    protected boolean storeLeaseEligibilityInd;
    @XmlElement(name = "Skuqtyinfo")
    protected List<Skuqtyinfo> skuqtyinfo;
    @XmlElement(name = "StoreErrorInfo")
    protected StoreErrorInfo storeErrorInfo;

    /**
     * Gets the value of the storeIdentifierTimetrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreIdentifierTimetrade() {
        return storeIdentifierTimetrade;
    }

    /**
     * Sets the value of the storeIdentifierTimetrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreIdentifierTimetrade(String value) {
        this.storeIdentifierTimetrade = value;
    }

    /**
     * Gets the value of the storeAsiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreAsiId() {
        return storeAsiId;
    }

    /**
     * Sets the value of the storeAsiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreAsiId(String value) {
        this.storeAsiId = value;
    }

    /**
     * Gets the value of the storeIBEligibilityInd property.
     * 
     */
    public boolean isStoreIBEligibilityInd() {
        return storeIBEligibilityInd;
    }

    /**
     * Sets the value of the storeIBEligibilityInd property.
     * 
     */
    public void setStoreIBEligibilityInd(boolean value) {
        this.storeIBEligibilityInd = value;
    }

    /**
     * Gets the value of the storeLeaseEligibilityInd property.
     * 
     */
    public boolean isStoreLeaseEligibilityInd() {
        return storeLeaseEligibilityInd;
    }

    /**
     * Sets the value of the storeLeaseEligibilityInd property.
     * 
     */
    public void setStoreLeaseEligibilityInd(boolean value) {
        this.storeLeaseEligibilityInd = value;
    }

    /**
     * Gets the value of the skuqtyinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skuqtyinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkuqtyinfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Skuqtyinfo }
     * 
     * 
     */
    public List<Skuqtyinfo> getSkuqtyinfo() {
        if (skuqtyinfo == null) {
            skuqtyinfo = new ArrayList<Skuqtyinfo>();
        }
        return this.skuqtyinfo;
    }

    /**
     * Gets the value of the storeErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreErrorInfo }
     *     
     */
    public StoreErrorInfo getStoreErrorInfo() {
        return storeErrorInfo;
    }

    /**
     * Sets the value of the storeErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreErrorInfo }
     *     
     */
    public void setStoreErrorInfo(StoreErrorInfo value) {
        this.storeErrorInfo = value;
    }

}

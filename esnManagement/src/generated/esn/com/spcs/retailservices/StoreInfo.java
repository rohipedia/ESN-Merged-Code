
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreIdentifierTimetrade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreInfo", propOrder = {
    "storeIdentifierTimetrade",
    "storeErrorCode",
    "storeErrorDescription"
})
public class StoreInfo {

    @XmlElement(name = "StoreIdentifierTimetrade", required = true)
    protected String storeIdentifierTimetrade;
    @XmlElement(name = "StoreErrorCode", required = true)
    protected String storeErrorCode;
    @XmlElement(name = "StoreErrorDescription", required = true)
    protected String storeErrorDescription;

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
     * Gets the value of the storeErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreErrorCode() {
        return storeErrorCode;
    }

    /**
     * Sets the value of the storeErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreErrorCode(String value) {
        this.storeErrorCode = value;
    }

    /**
     * Gets the value of the storeErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreErrorDescription() {
        return storeErrorDescription;
    }

    /**
     * Sets the value of the storeErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreErrorDescription(String value) {
        this.storeErrorDescription = value;
    }

}

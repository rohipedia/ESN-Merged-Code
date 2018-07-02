
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreBasicInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreBasicInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StoreDistrictIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreBasicInfo", propOrder = {
    "name",
    "storeIdentifier",
    "storeDistrictIdentifier"
})
public class StoreBasicInfo {

    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "StoreIdentifier")
    protected int storeIdentifier;
    @XmlElement(name = "StoreDistrictIdentifier")
    protected int storeDistrictIdentifier;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the storeIdentifier property.
     * 
     */
    public int getStoreIdentifier() {
        return storeIdentifier;
    }

    /**
     * Sets the value of the storeIdentifier property.
     * 
     */
    public void setStoreIdentifier(int value) {
        this.storeIdentifier = value;
    }

    /**
     * Gets the value of the storeDistrictIdentifier property.
     * 
     */
    public int getStoreDistrictIdentifier() {
        return storeDistrictIdentifier;
    }

    /**
     * Sets the value of the storeDistrictIdentifier property.
     * 
     */
    public void setStoreDistrictIdentifier(int value) {
        this.storeDistrictIdentifier = value;
    }

}

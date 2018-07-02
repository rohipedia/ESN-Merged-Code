
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRecycleItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRecycleItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recycleReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recycleSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recycleItemIdentifer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recyclePromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRecycleItemInfo", propOrder = {
    "recycleReferenceNumber",
    "recycleSerialNumber",
    "recycleItemIdentifer",
    "recyclePromotionCode"
})
public class UpdateRecycleItemInfo {

    protected String recycleReferenceNumber;
    protected String recycleSerialNumber;
    @XmlElement(required = true)
    protected String recycleItemIdentifer;
    protected String recyclePromotionCode;

    /**
     * Gets the value of the recycleReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecycleReferenceNumber() {
        return recycleReferenceNumber;
    }

    /**
     * Sets the value of the recycleReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecycleReferenceNumber(String value) {
        this.recycleReferenceNumber = value;
    }

    /**
     * Gets the value of the recycleSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecycleSerialNumber() {
        return recycleSerialNumber;
    }

    /**
     * Sets the value of the recycleSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecycleSerialNumber(String value) {
        this.recycleSerialNumber = value;
    }

    /**
     * Gets the value of the recycleItemIdentifer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecycleItemIdentifer() {
        return recycleItemIdentifer;
    }

    /**
     * Sets the value of the recycleItemIdentifer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecycleItemIdentifer(String value) {
        this.recycleItemIdentifer = value;
    }

    /**
     * Gets the value of the recyclePromotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecyclePromotionCode() {
        return recyclePromotionCode;
    }

    /**
     * Sets the value of the recyclePromotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecyclePromotionCode(String value) {
        this.recyclePromotionCode = value;
    }

}

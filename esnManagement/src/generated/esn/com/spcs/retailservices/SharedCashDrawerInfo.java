
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedCashDrawerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedCashDrawerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sharedCashDrawerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sharedCashDrawerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedCashDrawerInfo", propOrder = {
    "sharedCashDrawerId",
    "sharedCashDrawerName"
})
public class SharedCashDrawerInfo {

    protected int sharedCashDrawerId;
    @XmlElement(required = true)
    protected String sharedCashDrawerName;

    /**
     * Gets the value of the sharedCashDrawerId property.
     * 
     */
    public int getSharedCashDrawerId() {
        return sharedCashDrawerId;
    }

    /**
     * Sets the value of the sharedCashDrawerId property.
     * 
     */
    public void setSharedCashDrawerId(int value) {
        this.sharedCashDrawerId = value;
    }

    /**
     * Gets the value of the sharedCashDrawerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedCashDrawerName() {
        return sharedCashDrawerName;
    }

    /**
     * Sets the value of the sharedCashDrawerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedCashDrawerName(String value) {
        this.sharedCashDrawerName = value;
    }

}

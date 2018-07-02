
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for E911ConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="E911ConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ptn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="e911ConsentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E911ConsentInfo", propOrder = {
    "ptn",
    "e911ConsentId"
})
public class E911ConsentInfo {

    @XmlElement(required = true)
    protected String ptn;
    protected int e911ConsentId;

    /**
     * Gets the value of the ptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtn() {
        return ptn;
    }

    /**
     * Sets the value of the ptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtn(String value) {
        this.ptn = value;
    }

    /**
     * Gets the value of the e911ConsentId property.
     * 
     */
    public int getE911ConsentId() {
        return e911ConsentId;
    }

    /**
     * Sets the value of the e911ConsentId property.
     * 
     */
    public void setE911ConsentId(int value) {
        this.e911ConsentId = value;
    }

}

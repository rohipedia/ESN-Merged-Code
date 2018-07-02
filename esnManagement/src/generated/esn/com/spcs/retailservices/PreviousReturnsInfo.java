
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousReturnsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousReturnsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noOfReturnsPerformed" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousReturnsInfo", propOrder = {
    "noOfReturnsPerformed"
})
public class PreviousReturnsInfo {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long noOfReturnsPerformed;

    /**
     * Gets the value of the noOfReturnsPerformed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNoOfReturnsPerformed() {
        return noOfReturnsPerformed;
    }

    /**
     * Sets the value of the noOfReturnsPerformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNoOfReturnsPerformed(Long value) {
        this.noOfReturnsPerformed = value;
    }

}

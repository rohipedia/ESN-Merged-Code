
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePRLottoInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePRLottoInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prLottoNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoDrawNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoDrawDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoControlNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prLottoErrorMessageText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePRLottoInfo", propOrder = {
    "prLottoNumber",
    "prLottoDrawNumber",
    "prLottoDrawDateTime",
    "prLottoControlNumber",
    "prLottoErrorMessageText"
})
public class UpdatePRLottoInfo {

    @XmlElement(required = true)
    protected String prLottoNumber;
    @XmlElement(required = true)
    protected String prLottoDrawNumber;
    @XmlElement(required = true)
    protected String prLottoDrawDateTime;
    @XmlElement(required = true)
    protected String prLottoControlNumber;
    @XmlElement(required = true)
    protected String prLottoErrorMessageText;

    /**
     * Gets the value of the prLottoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoNumber() {
        return prLottoNumber;
    }

    /**
     * Sets the value of the prLottoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoNumber(String value) {
        this.prLottoNumber = value;
    }

    /**
     * Gets the value of the prLottoDrawNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoDrawNumber() {
        return prLottoDrawNumber;
    }

    /**
     * Sets the value of the prLottoDrawNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoDrawNumber(String value) {
        this.prLottoDrawNumber = value;
    }

    /**
     * Gets the value of the prLottoDrawDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoDrawDateTime() {
        return prLottoDrawDateTime;
    }

    /**
     * Sets the value of the prLottoDrawDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoDrawDateTime(String value) {
        this.prLottoDrawDateTime = value;
    }

    /**
     * Gets the value of the prLottoControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoControlNumber() {
        return prLottoControlNumber;
    }

    /**
     * Sets the value of the prLottoControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoControlNumber(String value) {
        this.prLottoControlNumber = value;
    }

    /**
     * Gets the value of the prLottoErrorMessageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrLottoErrorMessageText() {
        return prLottoErrorMessageText;
    }

    /**
     * Sets the value of the prLottoErrorMessageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrLottoErrorMessageText(String value) {
        this.prLottoErrorMessageText = value;
    }

}

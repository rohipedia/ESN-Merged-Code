
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransReferenceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransReferenceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newAccountInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="frontErrorInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransReferenceInfo", propOrder = {
    "languageCode",
    "newAccountInd",
    "frontErrorInd",
    "transactionNumber"
})
public class TransReferenceInfo {

    @XmlElement(required = true)
    protected String languageCode;
    protected boolean newAccountInd;
    protected boolean frontErrorInd;
    @XmlElement(required = true)
    protected String transactionNumber;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the newAccountInd property.
     * 
     */
    public boolean isNewAccountInd() {
        return newAccountInd;
    }

    /**
     * Sets the value of the newAccountInd property.
     * 
     */
    public void setNewAccountInd(boolean value) {
        this.newAccountInd = value;
    }

    /**
     * Gets the value of the frontErrorInd property.
     * 
     */
    public boolean isFrontErrorInd() {
        return frontErrorInd;
    }

    /**
     * Sets the value of the frontErrorInd property.
     * 
     */
    public void setFrontErrorInd(boolean value) {
        this.frontErrorInd = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

}


package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BxgxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BxgxInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bxgxOfferId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bxgxOfferTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bxgxLineType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bxgxTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BxgxInfo", propOrder = {
    "bxgxOfferId",
    "bxgxOfferTitle",
    "bxgxLineType",
    "bxgxTransactionId"
})
public class BxgxInfo {

    @XmlElement(required = true)
    protected String bxgxOfferId;
    @XmlElement(required = true)
    protected String bxgxOfferTitle;
    @XmlElement(required = true)
    protected String bxgxLineType;
    protected String bxgxTransactionId;

    /**
     * Gets the value of the bxgxOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBxgxOfferId() {
        return bxgxOfferId;
    }

    /**
     * Sets the value of the bxgxOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBxgxOfferId(String value) {
        this.bxgxOfferId = value;
    }

    /**
     * Gets the value of the bxgxOfferTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBxgxOfferTitle() {
        return bxgxOfferTitle;
    }

    /**
     * Sets the value of the bxgxOfferTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBxgxOfferTitle(String value) {
        this.bxgxOfferTitle = value;
    }

    /**
     * Gets the value of the bxgxLineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBxgxLineType() {
        return bxgxLineType;
    }

    /**
     * Sets the value of the bxgxLineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBxgxLineType(String value) {
        this.bxgxLineType = value;
    }

    /**
     * Gets the value of the bxgxTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBxgxTransactionId() {
        return bxgxTransactionId;
    }

    /**
     * Sets the value of the bxgxTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBxgxTransactionId(String value) {
        this.bxgxTransactionId = value;
    }

}

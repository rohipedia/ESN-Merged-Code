
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HcAgreementInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HcAgreementInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HcApplId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AgreementID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HcAgreementInfo", propOrder = {
    "hcApplId",
    "offerId",
    "agreementID",
    "signature"
})
public class HcAgreementInfo {

    @XmlElement(name = "HcApplId", required = true)
    protected String hcApplId;
    @XmlElement(name = "OfferId", required = true)
    protected String offerId;
    @XmlElement(name = "AgreementID", required = true)
    protected String agreementID;
    @XmlElement(name = "Signature", required = true)
    protected String signature;

    /**
     * Gets the value of the hcApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcApplId() {
        return hcApplId;
    }

    /**
     * Sets the value of the hcApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcApplId(String value) {
        this.hcApplId = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the agreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementID() {
        return agreementID;
    }

    /**
     * Sets the value of the agreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementID(String value) {
        this.agreementID = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

}

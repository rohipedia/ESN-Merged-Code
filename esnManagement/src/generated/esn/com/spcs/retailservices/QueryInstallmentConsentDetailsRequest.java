
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryInstallmentConsentDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryInstallmentConsentDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConsentNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInstallmentConsentDetailsRequest", propOrder = {
    "storeName",
    "consentNo"
})
public class QueryInstallmentConsentDetailsRequest
    extends Request
{

    @XmlElement(name = "StoreName", required = true)
    protected String storeName;
    @XmlElement(name = "ConsentNo")
    protected int consentNo;

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the consentNo property.
     * 
     */
    public int getConsentNo() {
        return consentNo;
    }

    /**
     * Sets the value of the consentNo property.
     * 
     */
    public void setConsentNo(int value) {
        this.consentNo = value;
    }

}

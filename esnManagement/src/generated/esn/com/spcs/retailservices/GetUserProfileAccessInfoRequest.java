
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUserProfileAccessInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserProfileAccessInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NTLoginID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserProfileAccessInfoRequest", propOrder = {
    "ntLoginID"
})
public class GetUserProfileAccessInfoRequest
    extends Request
{

    @XmlElement(name = "NTLoginID", required = true)
    protected String ntLoginID;

    /**
     * Gets the value of the ntLoginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTLoginID() {
        return ntLoginID;
    }

    /**
     * Sets the value of the ntLoginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTLoginID(String value) {
        this.ntLoginID = value;
    }

}

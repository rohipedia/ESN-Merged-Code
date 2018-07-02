
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsertConsentDetailsInfo" type="{java:com.spcs.retailservices.domain}InsertConsentDetailsInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertConsentInfo", propOrder = {
    "insertConsentDetailsInfo"
})
public class InsertConsentInfo {

    @XmlElement(name = "InsertConsentDetailsInfo", required = true)
    protected InsertConsentDetailsInfo insertConsentDetailsInfo;

    /**
     * Gets the value of the insertConsentDetailsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InsertConsentDetailsInfo }
     *     
     */
    public InsertConsentDetailsInfo getInsertConsentDetailsInfo() {
        return insertConsentDetailsInfo;
    }

    /**
     * Sets the value of the insertConsentDetailsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertConsentDetailsInfo }
     *     
     */
    public void setInsertConsentDetailsInfo(InsertConsentDetailsInfo value) {
        this.insertConsentDetailsInfo = value;
    }

}

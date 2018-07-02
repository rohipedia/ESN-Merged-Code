
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountChargesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountChargesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extraChargesInfo" type="{java:com.spcs.retailservices.domain}ExtraChargesInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountChargesInfo", propOrder = {
    "extraChargesInfo"
})
public class AccountChargesInfo {

    @XmlElement(required = true)
    protected ExtraChargesInfo extraChargesInfo;

    /**
     * Gets the value of the extraChargesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraChargesInfo }
     *     
     */
    public ExtraChargesInfo getExtraChargesInfo() {
        return extraChargesInfo;
    }

    /**
     * Sets the value of the extraChargesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraChargesInfo }
     *     
     */
    public void setExtraChargesInfo(ExtraChargesInfo value) {
        this.extraChargesInfo = value;
    }

}

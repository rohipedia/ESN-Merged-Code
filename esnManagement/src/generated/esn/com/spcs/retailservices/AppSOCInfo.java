
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppSOCInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppSOCInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppSOCInd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AppSOCCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppSOCInfo", propOrder = {
    "appSOCInd",
    "appSOCCode"
})
public class AppSOCInfo {

    @XmlElement(name = "AppSOCInd", required = true)
    protected String appSOCInd;
    @XmlElement(name = "AppSOCCode", required = true)
    protected String appSOCCode;

    /**
     * Gets the value of the appSOCInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppSOCInd() {
        return appSOCInd;
    }

    /**
     * Sets the value of the appSOCInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppSOCInd(String value) {
        this.appSOCInd = value;
    }

    /**
     * Gets the value of the appSOCCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppSOCCode() {
        return appSOCCode;
    }

    /**
     * Sets the value of the appSOCCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppSOCCode(String value) {
        this.appSOCCode = value;
    }

}

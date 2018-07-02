
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KitDtlsforSKURequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KitDtlsforSKURequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KitHierarchyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KitIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KitDtlsforSKURequest", propOrder = {
    "kitHierarchyIdentifier",
    "kitIdentifier"
})
public class KitDtlsforSKURequest
    extends Request
{

    @XmlElement(name = "KitHierarchyIdentifier", required = true, nillable = true)
    protected String kitHierarchyIdentifier;
    @XmlElement(name = "KitIdentifier", required = true, nillable = true)
    protected String kitIdentifier;

    /**
     * Gets the value of the kitHierarchyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitHierarchyIdentifier() {
        return kitHierarchyIdentifier;
    }

    /**
     * Sets the value of the kitHierarchyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitHierarchyIdentifier(String value) {
        this.kitHierarchyIdentifier = value;
    }

    /**
     * Gets the value of the kitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitIdentifier() {
        return kitIdentifier;
    }

    /**
     * Sets the value of the kitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitIdentifier(String value) {
        this.kitIdentifier = value;
    }

}

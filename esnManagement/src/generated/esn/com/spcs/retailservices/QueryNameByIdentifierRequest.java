
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryNameByIdentifierRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryNameByIdentifierRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociateIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AssociateType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNameByIdentifierRequest", propOrder = {
    "associateIdentifier",
    "associateType"
})
public class QueryNameByIdentifierRequest
    extends Request
{

    @XmlElement(name = "AssociateIdentifier")
    protected int associateIdentifier;
    @XmlElement(name = "AssociateType", required = true, nillable = true)
    protected String associateType;

    /**
     * Gets the value of the associateIdentifier property.
     * 
     */
    public int getAssociateIdentifier() {
        return associateIdentifier;
    }

    /**
     * Sets the value of the associateIdentifier property.
     * 
     */
    public void setAssociateIdentifier(int value) {
        this.associateIdentifier = value;
    }

    /**
     * Gets the value of the associateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateType() {
        return associateType;
    }

    /**
     * Sets the value of the associateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateType(String value) {
        this.associateType = value;
    }

}

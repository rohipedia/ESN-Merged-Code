
package esn.com.spcs.retailservices.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import esn.com.spcs.retailservices.Request;


/**
 * <p>Java class for QueryStoreByClientNameRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryStoreByClientNameRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="RmsMode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryStoreByClientNameRequest", propOrder = {
    "clientName",
    "rmsMode"
})
public class QueryStoreByClientNameRequest
    extends Request
{

    @XmlElement(name = "ClientName", required = true, nillable = true)
    protected String clientName;
    @XmlElement(name = "RmsMode", required = true, nillable = true)
    protected String rmsMode;

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the rmsMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmsMode() {
        return rmsMode;
    }

    /**
     * Sets the value of the rmsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmsMode(String value) {
        this.rmsMode = value;
    }

}

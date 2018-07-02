
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientPropertiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientPropertiesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientPropertiesList" type="{java:com.spcs.retailservices.domain}ClientPropertiesList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientPropertiesResponse", propOrder = {
    "clientPropertiesList"
})
public class ClientPropertiesResponse
    extends Response
{

    @XmlElement(required = true)
    protected ClientPropertiesList clientPropertiesList;

    /**
     * Gets the value of the clientPropertiesList property.
     * 
     * @return
     *     possible object is
     *     {@link ClientPropertiesList }
     *     
     */
    public ClientPropertiesList getClientPropertiesList() {
        return clientPropertiesList;
    }

    /**
     * Sets the value of the clientPropertiesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientPropertiesList }
     *     
     */
    public void setClientPropertiesList(ClientPropertiesList value) {
        this.clientPropertiesList = value;
    }

}

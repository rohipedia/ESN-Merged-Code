
package esn.com.spcs.retailservices.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import esn.com.spcs.retailservices.Response;


/**
 * <p>Java class for ValidateUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateUserResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="managerBaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateUserResponse", namespace = "java:com.spcs.retailservices.domain.externalclient", propOrder = {
    "returnValue",
    "managerBaId"
})
public class ValidateUserResponse
    extends Response
{

    @XmlElement(name = "ReturnValue")
    protected int returnValue;
    @XmlElement(namespace = "")
    protected Long managerBaId;

    /**
     * Gets the value of the returnValue property.
     * 
     */
    public int getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     */
    public void setReturnValue(int value) {
        this.returnValue = value;
    }

    /**
     * Gets the value of the managerBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagerBaId() {
        return managerBaId;
    }

    /**
     * Sets the value of the managerBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagerBaId(Long value) {
        this.managerBaId = value;
    }

}

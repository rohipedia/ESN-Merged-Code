
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsDelUpdInventoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsDelUpdInventoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ESMInventoryLogUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsDelUpdInventoryResponse", propOrder = {
    "esmInventoryLogUpdated",
    "returnValue"
})
public class InsDelUpdInventoryResponse
    extends Response
{

    @XmlElement(name = "ESMInventoryLogUpdated")
    protected boolean esmInventoryLogUpdated;
    @XmlElement(name = "ReturnValue")
    protected int returnValue;

    /**
     * Gets the value of the esmInventoryLogUpdated property.
     * 
     */
    public boolean isESMInventoryLogUpdated() {
        return esmInventoryLogUpdated;
    }

    /**
     * Sets the value of the esmInventoryLogUpdated property.
     * 
     */
    public void setESMInventoryLogUpdated(boolean value) {
        this.esmInventoryLogUpdated = value;
    }

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

}
